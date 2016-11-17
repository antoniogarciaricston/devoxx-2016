package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Wish;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Wish entity.
 */
@SuppressWarnings("unused")
public interface WishRepository extends JpaRepository<Wish,Long> {

}
