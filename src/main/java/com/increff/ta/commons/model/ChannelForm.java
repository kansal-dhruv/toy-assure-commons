package com.increff.ta.commons.model;

import com.increff.ta.commons.model.enums.ChannelInvoiceType;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class ChannelForm implements Serializable {

    @NotBlank
    private String name;

    @NotNull(message = " can be SELF/CHANNEL")
    private ChannelInvoiceType invoiceType;
}