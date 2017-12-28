CREATE TABLE excel_master
(
  excel_seq BIGINT AUTO_INCREMENT PRIMARY KEY
, excel_request_user_id VARCHAR(255) NOT NULL
, excel_request_service_id VARCHAR(255) NOT NULL
, excel_callback_url VARCHAR(255) NOT NULL
, excel_json_content VARCHAR(2048) NOT NULL
);