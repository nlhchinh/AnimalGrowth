package com.chinh.AnimalGrowth.user.repository;

import com.chinh.AnimalGrowth.user.model.payload.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
