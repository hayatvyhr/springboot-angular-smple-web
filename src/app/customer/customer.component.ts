import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.scss']
})
export class CustomerComponent {
  CustomerArray : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;
 
  
  customername: string ="";
  customeraddress: string ="";
  mobile: Number =0;
 
  currentCustomerID = "";
constructor(private http: HttpClient )
  {
    this.getAllCustomer();
 
  }
  getAllCustomer()
  {
    
    this.http.get("http://localhost:8084/api/v1/customer/get")
  
    .subscribe((resultData: any)=>
    {
        this.isResultLoaded = true;
        console.log(resultData);
        this.CustomerArray = resultData;
    });
  }
 
  register()
  {
  
    let bodyData = {
      "cusname" : this.customername,
      "cusaddress" : this.customeraddress,
      "mobile" : this.mobile
    };
 
    this.http.post("http://localhost:8084/api/v1/customer/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Employee Registered Successfully" );
        this.getAllCustomer();
        this.customername = '';
        this.customeraddress = '';
        this.mobile  = 0;
    });
  }
  setUpdate(data: any)
  {
   this.customername = data.cusname;
   this.customeraddress = data.cusaddress;
   this.mobile = data.mobile;
   this.currentCustomerID = data.id;
  }
 
  UpdateRecords()
  {
    let bodyData = {
      "id" : this.currentCustomerID,
      "cusname" : this.customername,
      "cusaddress" : this.customeraddress,
      "mobile" : this.mobile
    };
    
    this.http.put("http://localhost:8084/api/v1/customer/update",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Employee Registered Updateddd")
        this.getAllCustomer();
        this.customername = '';
        this.customeraddress = '';
        this.mobile  = 0;
    });
  }
 
  save()
  {
    if(this.currentCustomerID == '')
    {
        this.register();
    }
      else
      {
       this.UpdateRecords();
      }      
 
  }
 
  setDelete(data: any)
  {
    
    
    this.http.delete("http://localhost:8084/api/v1/customer/delete"+ "/"+ data.id,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Deletedddd")
        this.getAllCustomer();
        this.customername = '';
      this.customeraddress = '';
        this.mobile  = 0;
  
    });
 
  }

}
