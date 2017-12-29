CREATE TABLE IF NOT EXISTS excel_master
(
  excel_master_seq BIGINT AUTO_INCREMENT PRIMARY KEY
, excel_request_user_id VARCHAR(255) NOT NULL
, excel_request_service_id VARCHAR(255) NOT NULL
, template_id VARCHAR(255) NOT NULL
, request_date TIMESTAMP
, modify_date TIMESTAMP
, status VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS excel_content
(
  excel_content_seq BIGINT AUTO_INCREMENT PRIMARY KEY
, excel_master_seq BIGINT
, physical_file_nmae VARCHAR(255)
, logical_file_name VARCHAR(255)
, contents VARCHAR(2048)
, request_date TIMESTAMP
, modify_date TIMESTAMP
);

CREATE TABLE IF NOT EXISTS excel_template
(
  template_id VARCHAR(255) PRIMARY KEY
, template_file_name VARCHAR(255)
, service_id VARCHAR(255)
, register_date TIMESTAMP
, modify_date TIMESTAMP
, modifier_id VARCHAR(255)
);