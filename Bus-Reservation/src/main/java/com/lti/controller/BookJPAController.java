package com.lti.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Booking;
import com.lti.entity.Bus;
import com.lti.entity.Feedback;
import com.lti.entity.Passenger;
import com.lti.entity.Payment;
import com.lti.entity.Routes;
import com.lti.entity.Seats;
import com.lti.entity.UserDetails;
import com.lti.service.BookService;
import com.lti.service.BusService;
import com.lti.service.SeatBookService;
import com.lti.service.UserService;

//import oracle.jdbc.proxy.annotation.Post;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/bookingRest/api")
public class BookJPAController {
	@Autowired
	SeatBookService seatService;
	@Autowired
	BookService bookService;
	@Autowired
	UserService userService;
	@Autowired
	BusService busService;

	@GetMapping("/booking")
	public List<Booking> getBookings() {
		return bookService.getBooking();
	}
	@PostMapping("/booking")
	public boolean addBoooking(@RequestBody Booking booking  ) {
		return bookService.addBooking(booking);
	}

	@PutMapping("/booking")
	public boolean updateBooking(@RequestBody Booking booking) {
		return bookService.updateBooking(booking);
	}


	@DeleteMapping("/booking")
	public boolean deleteBooking (@RequestBody String booking) {
		return bookService.delBooking(booking);
	}

	@GetMapping("/seats")
	public List<Seats> getSeats() {
		return bookService.findSeats();
	}

	@PutMapping("/seats")
	public boolean updateSeats(@RequestBody Seats seats) {
		return bookService.updateSeats(seats);
	}


	@DeleteMapping("/seats")
	public boolean deleteSeats (@RequestBody String seats) {
		return bookService.delSeats(seats);
	}
}
