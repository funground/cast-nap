package net.funground.cast.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.funground.cast.user.service.UserService;
import net.funground.cast.user.entity.Users;

@RestController
@RequestMapping(value="/v1/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping(value="/getall")
	public List<Users> getAll() {
		return userService.fetchAll();
	}
}
