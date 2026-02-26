package com.sprint.mission.nooooo.controller;

import com.sprint.mission.nooooo.domain.Menu;
import com.sprint.mission.nooooo.service.MenuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {

  private final MenuService service;

  public MenuController(MenuService service) {
    this.service = service;
  }

  @GetMapping("/{id}")
  public Menu get(@PathVariable Long id) {
    return service.findById(id);
  }

  @GetMapping
  public List<Menu> search(@RequestParam String keyword) {
    return service.search(keyword);
  }
}

