package org.jeecgframework.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 这里应该从数据库中查询用户信息
        // 暂时返回一个固定的用户，用于测试
        if ("admin".equals(username)) {
            return User.builder()
                    .username("admin")
                    .password("$2a$10$EixZaYVK1fsbw1ZfbX3OXePaWxn96p36WQoeG6Lruj3vjPGga31lW") // 123456
                    .authorities(new ArrayList<>())
                    .build();
        }
        throw new UsernameNotFoundException("User not found with username: " + username);
    }
}