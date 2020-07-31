CREATE TABLE IF NOT EXISTS EMPLOYEE{
   emp_id UUID binary(255) NOT NULL CONSTRAINT PK_REFERENCE PRIMARY KEY ,
   emp_name varchar(256) NOT NULL,
   emp_address varchar(256) NOT NULL,
   created_datetime timestampz DEFAULT CURRENT_TIMESTAMP
};

CREATE UNIQUE INDEX IF NOT EXISTS idx_emp_id ON EMPLOYEE(emp_id);

CREATE TABLE IF NOT EXISTS EMPLOYEE_DU{
   emp_id UUID binary(255) REFERENCES EMPLOYEE(emp_id),
   emp_du_name varchar(256) NOT NULL,
   created_datetime timestampz DEFAULT CURRENT_TIMESTAMP
   PRIMARY_KEY(emp_id,emp_user_name)
};

CREATE TABLE IF NOT EXISTS EMPLOYEE_PROJECT{
   emp_id UUID binary(255) REFERENCES EMPLOYEE(emp_id),
   emp_proj_name varchar(256) NOT NULL,
   created_datetime timestampz DEFAULT CURRENT_TIMESTAMP
   PRIMARY_KEY(emp_id,emp_user_name)
};