package sec.oauth2.oauth2sec;


import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class Oauth2UserDetailsService implements UserDetailsService{
	
	public Oauth2UserDetailsService() {
		super();
	}

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		
		List<GrantedAuthority> auths = AuthorityUtils.createAuthorityList("read", "write");
		
		return new User("admin@fake.com", "adminpass", auths);
		
	}

}
