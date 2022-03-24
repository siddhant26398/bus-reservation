
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserDetails } from '../user-details';
import { UserDetailsService } from '../user-details.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  flag = false;
  nuser:UserDetails;
  regexp:any;
  constructor(private userservice:UserDetailsService, private router:Router) { 

    this.nuser=new UserDetails();
  }
  regexp1:any;
  check(){
    this.regexp = new RegExp('^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$');
    this.regexp1 = new RegExp('^{8,30}$');
    if(this.regexp.test(this.nuser.mailId) === false){
      this.flag = false;
    }
    else if(this.nuser.phoneNumber?.length != 10){
      this.flag = false;
    }
    // else if(this.regexp1.test(this.nuser.password) === false){
    //   this.flag = false;
    // }
    else{
      this.flag = true;
      
    }
  }
  ngOnInit(): void {
  }
 
  saveUserData()
  {
      this.nuser.role="user";
      this.nuser.wallet=0;
      this.userservice.addNewUserDetails(this.nuser).subscribe(
        (data)=>{
          console.log("Return Value from REST"+data); 

        }
      )
      alert("Signup Successfull!! ");
      this.router.navigate(['userlogin']);

}
}