package io.bw.excel.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author Byungwook Lee on 12/28/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcelMaster {
    private long excelSeq;
    @NotNull
    private String excelRequestUserId;
    @NotNull
    private String excelRequestServiceId;
    @NotNull
    private String excelCallbackUrl;
    @NotNull
    private String excelJsonContent;
}
