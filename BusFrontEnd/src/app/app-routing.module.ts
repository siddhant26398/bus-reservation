import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AddpassengerComponent } from './addpassenger/addpassenger.component';
import { BookingComponent } from './booking/booking.component';
import { CancelbookingComponent } from './cancelbooking/cancelbooking.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';
import { MybookingsComponent } from './mybookings/mybookings.component';
import { MydashboardComponent } from './mydashboard/mydashboard.component';
import { MywalletComponent } from './mywallet/mywallet.component';
import { ProfileComponent } from './profile/profile.component';
import { SearchpassengerComponent } from './searchpassenger/searchpassenger.component';
import { ShowpassengerComponent } from './showpassenger/showpassenger.component';
import { SignoutComponent } from './signout/signout.component';
import { SignupComponent } from './signup/signup.component';
import { UpdatepassengerComponent } from './updatepassenger/updatepassenger.component';
import { UserloginComponent } from './userlogin/userlogin.component';

const routes: Routes = [
  {path:'showpassengers',component:ShowpassengerComponent},
  {path:'addpassenger',component:AddpassengerComponent},
  {path:'updatepassenger',component:UpdatepassengerComponent},
  {path:'search',component:SearchpassengerComponent},
  {path:'userlogin',component:UserloginComponent},
  {path:'signup',component:SignupComponent},
  {path:'myBookings',component:MybookingsComponent},
  {path:'profile',component:ProfileComponent},
  {path:'changepassword',component:ChangepasswordComponent},
  {path:'aboutus',component:AboutusComponent},
  {path:'myWallet',component:MywalletComponent},
  {path:'mydashboard', component:MydashboardComponent},
  {path:'book', component:BookingComponent},
  {path: 'cancel', component:CancelbookingComponent},
  {path:'signout', component:SignoutComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
