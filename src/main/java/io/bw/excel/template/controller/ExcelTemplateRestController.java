package io.bw.excel.template.controller;

import io.bw.excel.template.model.ExcelTemplate;
import io.bw.excel.template.repository.ExcelTempalateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Byungwook lee on 2018. 5. 8.
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RestController
public class ExcelTemplateRestController {
    @Autowired
    private ExcelTempalateRepository excelTempalateRepository;

    @PostMapping("/excels")
    public String addExcel(@RequestBody ExcelTemplate excelTemplate) {
        // TODO: excel file save logic

        return "success";
    }
}
