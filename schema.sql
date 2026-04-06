CREATE DATABASE careconnect;
USE careconnect;

CREATE TABLE appointment (
  id INT AUTO_INCREMENT PRIMARY KEY,
  patient_name VARCHAR(100),
  specialization VARCHAR(100),
  date VARCHAR(20),
  time VARCHAR(20)
);

select * from appointment;
