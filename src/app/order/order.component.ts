import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.scss']
})
export class OrderComponent {
orderArray :  any[] = [];
isResultLoaded = false;
quantity : String = ''
 item: String = "";
 date: String = "";
 idCustomer: Number =0; 
 idOrder : Number=0;
 constructor(private http : HttpClient, private route: ActivatedRoute){

 }
 ngOnInit(): void {
  this.route.params.subscribe(params => {
    this.idCustomer = +params['id']; // The + operator converts the string to a number
    console.log('Customer ID:', this.idCustomer);
  });
 }
 makeOrder(){
  let databody={
    "item": this.item,
    "date": this.date,
    "customerId": this.idCustomer,
    "quantity": this.quantity,
    "id_order": this.idOrder
  }
  this.isResultLoaded= true;
  this.http.post("http://localhost:8084/api/v1/customer/makeOrder",databody,{responseType: 'text'}).subscribe((resultData: any)=>{
    console.log(resultData);
    alert("ur order with order id saved : "  + resultData +this.item);
  });



 }

}
