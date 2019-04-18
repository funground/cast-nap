package net.funground.cast.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.funground.cast.user.service.UserService;
import net.funground.cast.user.entity.Users;
import net.funground.cast.user.repository.UserRepository;

@Slf4j
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<Users> fetchAll() {
		log.info("************************ 1111");
		return userRepository.findAll();
	}
}
