package com.getsong.readinglist.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller for Reading List Items
 *
 * @author getsong
 * @since 29/10/2019 12:22 AM
 */
@Controller
@Slf4j
public class ReadingItemController {

  @GetMapping("/items")
  @ResponseBody
  public String getAllItems() {
    log.info("getting all items");
    return "all items are here";
  }
}
