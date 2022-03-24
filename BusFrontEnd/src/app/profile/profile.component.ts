import { Component, OnInit } from '@angular/core';
import { UserDetails } from '../user-details';
import { UserDetailsService } from '../user-details.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  userDetails:UserDetails;
  
  userDetails1:any=sessionStorage.getItem('userIdForStorage');
  constructor(private userDetailsService:UserDetailsService) {

    this.userDetails=new UserDetails();
    
   }

   

  ngOnInit(): void {
    this.userDetailsService.getUserDetails(this.userDetails1).subscribe(
      (data)=>{
        this.userDetails=data as UserDetails;
        console.log(data);
      }
    )
  }
  saveData(){
    alert("savedata");
    this.userDetailsService.updateUserDetails(this.userDetails).subscribe(
      (data)=>{console.log("Data is Updated");
    }
    )
  }

 
}
