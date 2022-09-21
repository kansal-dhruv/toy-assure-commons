package com.increff.ta.commons;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ApiResponse implements Serializable{
  private Integer code;
  private String message;
  private Class<? extends Serializable> data;
}