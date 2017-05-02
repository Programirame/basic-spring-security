package org.programirame.configuration;

import org.programirame.models.AppUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


public class UserDetailsImplementation implements UserDetails {

    private List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList("ROLE_USER");
    private AppUser appUser;

    public UserDetailsImplementation(AppUser appUser) {
        this.appUser = appUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return authorities;
    }

    @Override
    public String getPassword() {

        return appUser.getPassword();
    }

    @Override
    public String getUsername() {

        return appUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {

        return true;
    }

    @Override
    public boolean isAccountNonLocked() {

        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {

        return true;
    }

    @Override
    public boolean isEnabled() {

        return true;
    }
}
