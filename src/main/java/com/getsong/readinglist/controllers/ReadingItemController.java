package com.getsong.readinglist.controllers;

import com.getsong.readinglist.daos.Dao;
import com.getsong.readinglist.models.ReadingItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Controller for Reading List Items
 *
 * @author getsong
 * @since 29/10/2019 12:22 AM
 */
@Controller
@Slf4j
@RequestMapping("/items")
public class ReadingItemController {

  private Dao<ReadingItem> readingItemDao;

  public ReadingItemController(Dao<ReadingItem> readingItemDao) {
    this.readingItemDao = readingItemDao;
  }

  @GetMapping
  @ResponseBody
  public String getAllItems() {
    log.info("getting all items");
    return "all items are here";
  }

  @PostMapping
  @ResponseBody
  public String createItem(@RequestBody ReadingItem readingItem) {
    readingItem.setCreationTime(new Date());
    readingItemDao.save(readingItem);
    String message = String.format("creating an item: %s", readingItem);
    log.info(message);
    return message;
  }
}
