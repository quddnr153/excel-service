package io.bw.excel.api.mapper;

import io.bw.excel.api.model.ExcelMaster;

import org.springframework.stereotype.Repository;

/**
 * @author Byungwook Lee on 12/28/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Repository
public interface ExcelMapper {
    boolean selectExcelTemplateForValidation(String templateId);

    void insertExcelMaster(ExcelMaster excelMaster);

    void insertExcelContent(ExcelMaster excelMaster);
}
