package com.mn000009.warehouse.service;

import com.mn000009.warehouse.domain.Operation;
import com.mn000009.warehouse.controller.dto.SocksDto;

import java.util.NoSuchElementException;

public interface SocksService {
  void income(SocksDto receivedSocks);
  void outcome(SocksDto receivedSocks) throws NoSuchElementException;
  String getStatus(String color, Operation operation, int cottonPart);
}
