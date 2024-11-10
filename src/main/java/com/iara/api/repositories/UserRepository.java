package com.iara.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iara.api.domains.user.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
