package com.increff.ta.commons.model;

import com.increff.ta.commons.model.helper.MustBePositiveNumber;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.validators.PreAssignmentValidator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDetailCSV {

    @CsvBindByPosition(position = 0, required = true)
    private String clientSkuId;

    @CsvBindByPosition(position = 1, required = true)
    private String name;

    @CsvBindByPosition(position = 2, required = true)
    private String brandId;

    @PreAssignmentValidator(validator = MustBePositiveNumber.class)
    @CsvBindByPosition(position = 3, required = true)
    private Double mrp;

    @CsvBindByPosition(position = 4, required = true)
    private String description;
}