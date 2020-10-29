package io.github.fallingyang.uaa.security;

import io.github.fallingyang.uaa.domain.account.service.HandingFetchUser;
import io.github.fallingyang.uaa.domain.account.entity.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * @author yangzifeng
 */
@Component("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private HandingFetchUser handingFetchUser;

    public UserDetailsServiceImpl(HandingFetchUser handingFetchUser) {
        this.handingFetchUser = handingFetchUser;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        String lowercaseLogin = s.toLowerCase(Locale.ENGLISH);
        Optional<Account> userFromDatabase = handingFetchUser.getUserByLogin(lowercaseLogin);
        return userFromDatabase.map(user -> {
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            return new org.springframework.security.core.userdetails.User(lowercaseLogin,
                    user.getPassword(),grantedAuthorities);
        }).orElseThrow(() -> new UsernameNotFoundException("Account " + lowercaseLogin +
                " was not found in the database"));
    }
}
