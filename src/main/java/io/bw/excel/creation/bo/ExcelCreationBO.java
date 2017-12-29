package io.bw.excel.creation.bo;

import java.util.Map;

/**
 * @author Byungwook Lee on 12/29/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
public interface ExcelCreationBO {
    void createExcelFile(Map<String, Object> contents, String templateFilePath, String excelFilePath, String excelFileName);
}
