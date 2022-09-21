package com.increff.ta.commons.model;

import com.increff.ta.commons.model.enums.UserType;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserForm {

  @NotBlank
  private String name;

  @NotNull(message = "can be either CLIENT/CUSTOMER")
  private UserType type;
}