package net.funground.cast.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.funground.cast.user.entity.Users;


public interface UserRepository extends JpaRepository<Users, Integer>{

}
