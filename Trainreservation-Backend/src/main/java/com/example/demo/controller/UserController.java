package com.example.demo.controller;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Bookings;
import com.example.demo.entity.User;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userrepository;
	BookingRepository bookingrepository;
	UserService userservice;
	
	public UserController(UserRepository userrepository, UserService userservice, BookingRepository bookingrepository) {
		super();
		this.userrepository = userrepository;
		this.bookingrepository=bookingrepository;
		this.userservice = userservice;
	}

	
	@GetMapping("/home")
	public ModelAndView showlandingpage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("landingpage");
		return mv;
	}
	
	@GetMapping("/booking")
	public String showbookingpage(Model model) {
		model.addAttribute("bookings",new Bookings());
		return "ticketbooking";
	}
	@PostMapping("/booking")
	public ModelAndView bookings(Bookings bookings) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("bookings",bookingrepository.save(bookings));
		mv.setViewName("ticketbooking");
		return mv;
	}
	
	
	@GetMapping("/register")
	public String showregister(Model model) 
	{
		model.addAttribute("reg",new User());
		return "UserReg";
	}
	@PostMapping("/register")
	public ModelAndView registration(@Valid User user,BindingResult result) {
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors()) {
			mv.setViewName("UserReg");
			return mv;
		}
		
		mv.addObject("reg",userrepository.save(user));
		mv.setViewName("redirect:/register");
		return mv;
	}
	@GetMapping("/userLogin")
	public String showlogin(Model model)
	{
		model.addAttribute("login",new User());
		return "Login";
	}
	
	@PostMapping("/userLogin")
	public String userLogin(User user) {
		User userdata=userservice.login(user.getEmail(),user.getPassword());
		System.out.println(userdata);
		if(userdata!=null) {
			return "redirect:/registerdashboard";
		}
		else {
			return "Error";
		}
	}
	

	
	
}
