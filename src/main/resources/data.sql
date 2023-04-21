CREATE TABLE IF NOT EXISTS userr (
  id INT PRIMARY KEY,
  category VARCHAR(255),
  type VARCHAR(255),
  task_amount INT,
  hire_date DATE,
  pesel VARCHAR(255),
  email VARCHAR(255),
  phone_number VARCHAR(255),
  qualifications VARCHAR(255),
  address VARCHAR(255),
  zip_code VARCHAR(255)
);
INSERT INTO userr (id, category, type, task_amount, hire_date, pesel, email, phone_number, qualifications, address, zip_code) 
VALUES (1, 'rolnik', 'stały', 5, "2020-01-01", '12345678901', 'jan.kowalski@example.com', '123456789', 'obsługa maszyn rolniczych, uprawa roślin', 'Kowalewo, Wiejska 1', '12-345');