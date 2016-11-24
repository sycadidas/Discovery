package com.discovery.service.serviceInte;

import com.common.dto.User;

public interface AuthUserService {
	public User queryUserByUserId(String UserId, String password);
}
