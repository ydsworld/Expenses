package com.ydsworld.model.user;

import lombok.Data;
import org.springframework.security.core.authority.AuthorityUtils;

@Data
public class CurrentUser extends org.springframework.security.core.userdetails.User {
	private User user;

	public CurrentUser(User user) {
		super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
		this.user = user;
	}

}