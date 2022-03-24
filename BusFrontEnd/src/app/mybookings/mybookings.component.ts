
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingService } from '../booking.service';
import { BusService } from '../bus.service';

import { RoutesService } from '../routes.service';
@Component({
  selector: 'app-mybookings',
  templateUrl: './mybookings.component.html',
  styleUrls: ['./mybookings.component.css']
})
export class MybookingsComponent implements OnInit {
  

  userDetails1:any=sessionStorage.getItem('userMailForStorage');
  bookingId:any;
  busId:any;
  routeId:any;
  bookings:any;
  busIdForStorage:string='';
  router:any;
  constructor(private bookingService:BookingService,private busService:BusService,private routesService:RoutesService, router:Router) {
     this.bookings = new Booking();
     this.busIdForStorage=this.bookings.busId;
    this.router=router;
  }
  ngOnInit(): void {
    this.bookingService.getBookingsByMailId(this.userDetails1).subscribe((data)=>{
      this.bookings = data;
      console.log(data);
      
    })
  }
    
  
    viewAllBookings(){
      this.bookingService.getBookingsByMailId(this.userDetails1).subscribe((data)=>{
        this.bookings = data;
        console.log(data);
        
      })
    }
  
      }
    
    
        

  
