package org.shane.learnboot.config.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component("mongoUserDetailsService")
public class MongoUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		// TODO get UserDetails
		List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
		authorityList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		MongoUserDetails sampleUserDetails = new MongoUserDetails("user",
				"Password1", authorityList);
		sampleUserDetails.setEmail("shane.li@gmail.com");
		sampleUserDetails.setAge(28);

		return sampleUserDetails;
	}
}
