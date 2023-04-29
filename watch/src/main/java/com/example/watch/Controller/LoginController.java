package com.example.watch.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.watch.Model.LoginModel;
import com.example.watch.Service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
	@Autowired
	LoginService usrService;
	@PostMapping("/checkLogin")
		public String validateUser(@RequestBody LoginModel u)
		{
		System.out.println(u.getUsername());
			return usrService.validateUser(u.getUsername(),u.getPassword());
		}
	@PostMapping("/addUser")
	public LoginModel saveUser(@RequestBody LoginModel u)
	{
	return usrService.saveUser(u);
	}

}
