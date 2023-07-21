package org0.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org0.spring.entity.AjaxEntity;

import java.util.Optional;

@Repository
public interface AjaxRepository extends JpaRepository<AjaxEntity,Long> {


    Optional<AjaxEntity> findByEmail(String email);
}
