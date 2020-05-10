package com.anvil.shoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockTradeController {

  @GetMapping(path = "/keystock")
  public String getKeyStock() {
    return "GOOG";
  }
}
