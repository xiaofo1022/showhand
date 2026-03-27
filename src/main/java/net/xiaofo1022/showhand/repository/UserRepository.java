package net.xiaofo1022.showhand.repository;

import net.xiaofo1022.showhand.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}