package io.bw.excel.creation.bo;

import io.bw.excel.creation.model.Employee;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * @author Byungwook Lee on 12/29/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@RunWith(MockitoJUnitRunner.class)
public class ExcelCreationBOImplTest {
    @InjectMocks
    private ExcelCreationBOImpl excelCreationBO;

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void createExcelFile_EmployeeTest() {
        // Given
        Employee employee1 = new Employee("Elsa", "2017-12-29", new BigDecimal("1500.00"), new BigDecimal("15"));
        Employee employee2 = new Employee("Oleg", "2017-12-28", new BigDecimal("2300.00"), new BigDecimal("25"));
        Employee employee3 = new Employee("Neil", "2017-12-27", new BigDecimal("2500.00"), new BigDecimal("0"));
        Employee employee4 = new Employee("Maria", "2017-12-26", new BigDecimal("1700.00"), new BigDecimal("15"));
        Employee employee5 = new Employee("Jone", "2017-12-25", new BigDecimal("2800.00"), new BigDecimal("20"));
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);

        Map<String, Object> contents = new HashMap<>();
        contents.put("employees", employees);

        String excelTemplatePath = "templates/excel/template_demo.xlsx";
        String fileName = "test";
        String filePath = folder.getRoot().getAbsolutePath();

        // When
        excelCreationBO.createExcelFile(contents, excelTemplatePath, filePath, fileName);

        // Then
        File excelFile = new File(filePath + "/" + fileName + ".xlsx");
        assertTrue(excelFile.exists());
    }
}