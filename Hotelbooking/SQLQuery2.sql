select @@SERVERNAME
alter login sa enable;
alter login sa with password='123';
alter table customer
add constraint cous_ro_fk foreign key(roomNumber ) references room(roomNumber);
create table booking
(
id int primary key,
name varchar(30),
roomNumber int,
type varchar(25)

);
drop table booking;