package com.increff.ta.commons.model;

import com.increff.ta.commons.model.helper.MustBePositiveNumber;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.validators.PreAssignmentValidator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BinClientSkuCSV {

    @PreAssignmentValidator(validator = MustBePositiveNumber.class)
    @CsvBindByPosition(position = 0, required = true)
    private Long binId;

    @CsvBindByPosition(position = 1, required = true)
    private String clientSkuId;

    @PreAssignmentValidator(validator = MustBePositiveNumber.class)
    @CsvBindByPosition(position = 2, required = true)
    private Long quantity;
}