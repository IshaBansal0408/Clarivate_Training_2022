create database employee01;
use employee01;

CREATE TABLE employeedata01 (
  `empID` INT NOT NULL,
  `empName` VARCHAR(45) NULL,
  `empLoc` VARCHAR(45) NULL,
  PRIMARY KEY (`empID`));


-- Call the particular table from a particular database
select * from employee01.employeedata01;

-- Use database and then call the table
use employee01;
select* from employeedata01;

-- insert data into the table 
insert into employeedata01 values(1,"Rahut","Delhi");
insert into employeedata01 values(2,"Jeena","Mumbai");
insert into employeedata01 values(3,"Cassie","Gujrat");
insert into employeedata01 values(4,"Harshit","Banglore");
select* from employeedata01;

-- delete data from table
delete from employeedata01 where empID=2;

-- Not possible to delete row data without the help of Primary key
-- delete from employeedata01 where empName="Cassie";

-- update data in the table
update employeedata01 set empName = 'Harsh' where empID=3;

select* from employeedata01;	
drop database employee01;