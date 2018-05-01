CREATE TABLE IF NOT EXISTS excel_template
(
  exel_tempate_seq BIGINT AUTO_INCREMENT PRIMARY KEY
, file_path VARCHAR(255)
, file_name VARCHAR(255)
, service_code VARCHAR(255)
, description VARCHAR(255)
, register_date DATE
, modify_date DATE
, model_json_format VARCHAR(2048)
);