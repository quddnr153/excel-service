package io.bw.excel.template.controller;

import io.bw.excel.template.repository.ExcelTempalateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Byungwook lee on 2018. 5. 1.
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Controller
public class ExcelTemplateController {
    @Autowired
    private ExcelTempalateRepository excelTempalateRepository;

    @GetMapping("/")
    public String excelForm(final Model model) {
        model.addAttribute("excelTemplates", excelTempalateRepository.findAll());

        return "index";
    }
}
