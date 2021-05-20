package com.programming.techie.springredditclone.repository;

import com.programming.techie.springredditclone.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    void itShouldFindUserByUsername() {
        // given
        String username = "john";
        User user = new User();
        user.setUsername(username);
        userRepository.save(user);

        // when
        Optional<User> userNameExists = userRepository.findByUsername(username);

        // then
        assertThat(userNameExists).isNotEmpty();
    }
}