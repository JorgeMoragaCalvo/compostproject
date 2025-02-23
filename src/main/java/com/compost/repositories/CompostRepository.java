package com.compost.repositories;

import com.compost.entities.CompostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompostRepository extends JpaRepository<CompostEntity, Long> {

}
