package com.scrum.Scrumboard.repository;

import com.scrum.Scrumboard.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<UserEntity, UUID> {

    public UserEntity findByUserName(String userName);

}
