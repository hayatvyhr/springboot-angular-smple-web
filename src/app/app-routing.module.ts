import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OrderComponent } from './order/order.component';
import { CustomerComponent } from './customer/customer.component';

const routes: Routes = [
  { path: 'order/:id', component: OrderComponent },
  {path: '', component: CustomerComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
