package io.bw.excel.api.bo;

import io.bw.excel.api.model.ExcelMaster;

/**
 * @author Byungwook Lee on 12/28/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
public interface ExcelBO {
    void preprocessExcelCreation(ExcelMaster excelMaster);

    boolean isValidTemplateId(String templateId);
}
