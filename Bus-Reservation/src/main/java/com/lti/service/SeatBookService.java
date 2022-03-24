package com.lti.service;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.entity.Booking;
import com.lti.entity.Bus;
import com.lti.entity.Feedback;
import com.lti.entity.Passenger;
import com.lti.entity.Routes;
import com.lti.entity.Seats;
import com.lti.entity.UserDetails;
import com.lti.repository.BookingRepository;
import com.lti.repository.BusRepository;
import com.lti.repository.FeedbackRepository;
import com.lti.repository.PassengerRepository;
import com.lti.repository.PaymentRepository;
import com.lti.repository.RouteRepository;
import com.lti.repository.SeatsRepository;
import com.lti.repository.UserDetailsRepository;

@Service
@Transactional
public class SeatBookService {
	@Autowired
	BookingRepository bookingRepo;
	@Autowired
	SeatsRepository seatsRepo;
	@Autowired
	FeedbackRepository feedbackRepo;

	@Autowired
	PaymentRepository paymentRepo;

	@Autowired
	PassengerRepository passengerRepo;

	@Autowired
	UserDetailsRepository userdetailsRepo;

	@Autowired
	BusRepository busRepo;
	@Autowired
	RouteRepository routeRepo;

	public Double getWalletInfo(String mailId) {
		return userdetailsRepo.getWalletInfo(mailId);
	}
	public List<Bus> findBusByRouteId(String s1) {
		return busRepo.findBusByRouteId(s1);
	}

	public List<Bus> findBusByRouteIdandDate(String s1, Date d1) {
		return busRepo.findBusByRouteIdandDate(s1, d1);
	}

	public Bus busByBusId(String busId) {
		return busRepo.getById(busId);
	}

	public List<Seats> findByBusId(String busId) {
		return seatsRepo.findByBusId(busId);
	}



	public List<Booking> findByBusIdBookings(String emailId) {
		return bookingRepo.findByEmailIdBookings(emailId);
	}

	public Passenger findByBookingIdPassenger(String bookingId) {
		return passengerRepo.findByBookingIdPassenger(bookingId);

	}

	public void deletebookingdetails(String bookingId) {
		bookingRepo.deletebookingdetails(bookingId);
	}

	public Seats seatsRecordBySeatId(String seatId) {
		return seatsRepo.seatsRecordBySeatId(seatId);
	}
	public boolean updateSeatsRecordBySeatId(Seats seats) {
		seatsRepo.save(seats);
		return true;
	}


	public List<Bus> getBuses() {

		return busRepo.getallbuses();
	}

	public List<Routes> getRoutes() {

		return routeRepo.getALLRoutes();
	}
	public Bus findBus(String busid) {
		return busRepo.findById(busid).get();
	}

	public Routes findRoute(String routeid) {
		return routeRepo.findById(routeid).get();
	}
	public boolean deleteRoutebyId(String routeid) {
		routeRepo.deleteById(routeid);
		return true;
	}
	public boolean deleteBusbyId(String busid) {
		busRepo.deleteById(busid);
		return true;
	}
	public boolean addSeats(Seats seat) {
		seatsRepo.save(seat);
		return true;
	}

	public List<Booking> findBookingsBydates(Date d1, Date d2) {
		return bookingRepo.findBookingsBydates(d1, d2);
	}

	public List<UserDetails> findOnlyUserDetails(String s) {
		return userdetailsRepo.findOnlyUserDetails(s);
	}
	public List<Booking> getBookingHistory() {
		return bookingRepo.getBookingHistory();
	}

	public List<Passenger> getallPassengerHistory() {
		return passengerRepo.getPassengerHistory();
	}
	public List<Feedback> getallbusFeedback() {
		return feedbackRepo.getbusFeedbacks();
	}

	public void deleteAllSeats(String s) {
		seatsRepo.deleteAllSeats(s);

	}
}
