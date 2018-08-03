package com.bookstore.service;

import java.util.Set;

import com.bookstore.security.User;
import com.bookstore.security.UserRole;

public interface UserService {
	
	User createUser(User user, Set<UserRole> userRoles);
}
