package com.sprint.mission.nooooo.repository;

import com.sprint.mission.nooooo.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

  List<Menu> findByNameContaining(String keyword);

  List<Menu> findByPriceBetween(int min, int max);

  boolean existsByPriceGreaterThan(int price);
}

