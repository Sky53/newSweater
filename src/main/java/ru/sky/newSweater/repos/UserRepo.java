package ru.sky.newSweater.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sky.newSweater.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
