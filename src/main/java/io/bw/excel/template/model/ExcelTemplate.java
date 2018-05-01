package io.bw.excel.template.model;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Byungwook lee on 2018. 5. 1.
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
@Getter
@ToString
@Entity
@Table(name = "excel_template")
public class ExcelTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long excelTemplateSeq;
    private String filePath;
    private String fileName;
    private String serviceCode;
    private String description;
    private LocalDateTime registerDate;
    private LocalDateTime modifyDate;
    private String modelJsonFormat;
}
