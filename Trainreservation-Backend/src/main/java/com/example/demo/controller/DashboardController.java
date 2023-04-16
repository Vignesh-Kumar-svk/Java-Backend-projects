 package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Bookings;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.UserRepository;


@RestController
public class DashboardController {

	@Autowired
	BookingRepository bookingrepo;
	
	@Autowired
	UserRepository userrepo;
	



	@GetMapping("/bookingsdashboard")
	public ModelAndView bookingsdashboard() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("bookings",bookingrepo.findAll());
		mv.setViewName("Bookingsdashboard");
		return mv;
	}
	
	@GetMapping("/registerdashboard")
	public ModelAndView registerdashboard() {
		ModelAndView mv1=new ModelAndView();
		mv1.addObject("register",userrepo.findAll());
		mv1.setViewName("Regdashboard");
		return mv1;
	}
	
	@GetMapping("/trainsdashboard")
	public ModelAndView showtrains(ModelAndView mv) {
		mv.setViewName("Trainslist");
		return mv;
	}

	@DeleteMapping("/bookings/{id}")
	public void deleteBookings(@PathVariable(value="id") Integer id) {
		Optional<Bookings> bookings=bookingrepo.findById(id);
		bookingrepo.deleteById(id);
	}
}
