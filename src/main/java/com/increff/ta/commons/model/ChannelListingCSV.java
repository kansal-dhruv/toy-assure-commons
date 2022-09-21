package com.increff.ta.commons.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChannelListingCSV {

    @CsvBindByPosition(position = 0, required = true)
    private String channelSkuId;

    @CsvBindByPosition(position = 1, required = true)
    private String clientSkuId;
}