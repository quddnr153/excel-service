package io.bw.excel.creation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Byungwook Lee on 12/29/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private String birthDate;
    private BigDecimal payment;
    private BigDecimal bonus;
}
