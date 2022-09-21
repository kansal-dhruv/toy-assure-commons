package com.increff.ta.commons.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
public class OrderItemForm implements Serializable {

    @NotBlank
    private String channelSkuId;

    @Min(0)
    private Long quantity;

    @Min(0)
    private Double sellingPricePerUnit;

}