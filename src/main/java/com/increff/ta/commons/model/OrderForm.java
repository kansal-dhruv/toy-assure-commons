package com.increff.ta.commons.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class OrderForm implements Serializable {

    @NotNull
    private Long clientId;

    @NotNull
    private Long customerId;

    @NotBlank
    private String channelName;

    @NotBlank
    private String channelOrderId;

    @Valid
    @NotNull
    @Size(min = 1)
    private List<OrderItemForm> orderItemList;
}