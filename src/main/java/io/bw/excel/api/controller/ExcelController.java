package io.bw.excel.api.controller;

import io.bw.excel.api.bo.ExcelBO;
import io.bw.excel.api.model.ExcelMaster;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byungwook Lee on 12/28/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RestController
public class ExcelController {
    @Autowired
    private ExcelBO excelBO;

    @RequestMapping(value = "/excels", method = RequestMethod.POST)
    public String storeExcelContent(@Valid @RequestBody ExcelMaster excelMaster) {
        if (!excelBO.isValidTemplateId(excelMaster.getTemplateId())) {
            // TODO: API result 자세히 구분하기
            return "FAIL";
        }

        excelBO.preprocessExcelCreation(excelMaster);
        return "SUCCESS";
    }
}
