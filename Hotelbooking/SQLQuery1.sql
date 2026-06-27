CREATE DATABASE hotel_db;

use hotel_db;
CREATE TABLE customers(
    id INT PRIMARY KEY ,
    name VARCHAR(100)
);
CREATE TABLE rooms(
    room_id INT PRIMARY KEY ,
    room_type VARCHAR(40),
    available BIT
);

CREATE TABLE bookings(
    booking_id INT PRIMARY KEY ,
    customer_id INT,
    room_id INT,
    FOREIGN KEY(customer_id)
    REFERENCES customers(id),
    FOREIGN KEY(room_id)
    REFERENCES rooms(room_id)
);