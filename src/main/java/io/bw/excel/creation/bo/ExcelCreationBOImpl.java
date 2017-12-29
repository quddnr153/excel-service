package io.bw.excel.creation.bo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

/**
 * @author Byungwook Lee on 12/29/2017
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Service
public class ExcelCreationBOImpl implements ExcelCreationBO {
    private static final String EXCEL_FILE_EXTENSION = ".xlsx";

    /**
     * Contents 내용과 template Excel file 을 매핑시켜 {@code filePath + fileName + ".xlsx"} excel 파일을 만든다.
     *
     * @param contents template excel file 에 적용 될 내용들, 예를 들면 <jx:if test="${test == "test"}>${test}</jx:if>
     *                 와 같이 excel template 에 매핑되는 contents 이다.
     * @param templateFilePath excel template file path 이다, 예를 들면, classpath:/excel/template/EXCEL_TEMPLATE.xlsx
     * @param excelFilePath 엑셀파일을 저장할 위치
     * @param excelFileName 엑셀 파일 이름, 확장자 .xlsx 를 제외한 이름이다
     */
    @Override
    public void createExcelFile(Map<String, Object> contents, String templateFilePath, String excelFilePath, String excelFileName) {
        String excelFileAbsolutePath = excelFilePath + File.separatorChar + excelFileName + EXCEL_FILE_EXTENSION;

        try (InputStream is = new ClassPathResource(templateFilePath).getInputStream();
             OutputStream os = new FileOutputStream(new File(excelFileAbsolutePath))) {
            Context context = new Context();

            for (String key : contents.keySet()) {
                context.putVar(key, contents.get(key));
            }

            JxlsHelper.getInstance().processTemplate(is, os, context);
        } catch (IOException ioException) {
            throw new IllegalArgumentException("IOException classPathResource{" + templateFilePath + "} filePathName{" + excelFileAbsolutePath + "}", ioException);
        }
    }
}
