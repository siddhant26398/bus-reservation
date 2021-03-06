package com.lti.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.entity.Bus;
import com.lti.entity.Routes;
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
public class BusService {
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

	public List<Bus> getBus() {

		return busRepo.findAll();
	}



	public boolean addBus(Bus bus) {
		busRepo.save(bus);
		return true;
	}


	public boolean updateBus(Bus bus) {
		Bus newb = busRepo.findById(bus.getBusid()).get();
		newb = bus;
		busRepo.save(newb);
		return true;
	}


	public boolean deleteBus(Bus bus) {
		busRepo.delete(bus);
		return true;
	}

	public boolean addRoutes(Routes route) {
		routeRepo.save(route);
		return true;
	}


	public boolean updateRoutes(Routes route) {
		Routes newr = routeRepo.findById(route.getRouteid()).get();
		newr = route;
		routeRepo.save(route);
		return true;
	}


	public boolean deleteRoutes(Routes route) {
		routeRepo.delete(route);
		return true;
	}
}
