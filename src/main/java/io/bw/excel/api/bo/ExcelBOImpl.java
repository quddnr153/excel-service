package io.bw.excel.api.bo;

import io.bw.excel.api.mapper.ExcelMapper;
import io.bw.excel.api.model.ExcelMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Byungwook Lee on 12/28/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Service
public class ExcelBOImpl implements ExcelBO {
    @Autowired
    private ExcelMapper excelMapper;

    @Override
    public boolean isValidTemplateId(String templateId) {
        return excelMapper.selectExcelTemplateForValidation(templateId);
    }

    @Override
    @Transactional
    public void preprocessExcelCreation(ExcelMaster excelMaster) {
        excelMaster.setStatus("READY");
        excelMapper.insertExcelMaster(excelMaster);
        excelMapper.insertExcelContent(excelMaster);
    }
}
