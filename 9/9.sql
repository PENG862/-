CREATE DATABASE IF NOT EXISTS book_order_db;
USE book_order_db;
DROP TABLE IF EXISTS order_items;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS users;
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE
);
CREATE TABLE books (
     book_id INT AUTO_INCREMENT PRIMARY KEY,
     title VARCHAR(100) NOT NULL,
     category VARCHAR(50) NOT NULL,     
    price DECIMAL(10, 2) NOT NULL,   
    stock INT NOT NULL                 
 ); 
 CREATE TABLE orders (
     order_id INT AUTO_INCREMENT PRIMARY KEY,
     user_id INT NOT NULL,
     order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
     total_amount DECIMAL(10, 2) NOT NULL,         
    FOREIGN KEY (user_id) REFERENCES users(user_id)
 );
 CREATE TABLE order_items(
    item_id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT NOT NULL,
    book_id INT NOT NULL,
    quantity INT NOT NULL,
    buy_price DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (book_id) REFERENCES books(book_id),
    CHECK (quantity > 0)
 );
 INSERT INTO users(username) VALUES("小王"),("小李"),("小张");
 INSERT INTO books(title, category, price, stock) VALUES
('Java编程思想', 'Tech', 69.00, 100),
('MySQL必知必会', 'Tech', 45.00, 80),
('计算机网络', 'Tech', 52.00, 60),
('明朝那些事儿', 'History', 39.00, 200),
('人类简史', 'History', 58.00, 90);
INSERT INTO orders(user_id, total_amount) VALUES
(1, 235.00),  
(2, 45.00),   
(1, 52.00);  
INSERT INTO order_items(order_id, book_id, quantity, buy_price) VALUES
(1, 1, 2, 69.00),
(1, 2, 2, 45.00),
(2, 2, 1, 45.00),
(3, 3, 1, 52.00); 
SELECT
    u.username,
    SUM(oi.quantity) AS total_tech_books,
    SUM(oi.quantity * oi.buy_price) AS total_spent
FROM users u
INNER JOIN orders o ON u.user_id = o.user_id
INNER JOIN order_items oi ON o.order_id = oi.order_id
INNER JOIN books b ON oi.book_id = b.book_id
WHERE b.category = 'Tech'
GROUP BY u.user_id, u.username
HAVING SUM(oi.quantity) >= 3;
SELECT category, title, price
FROM books
WHERE (category, price) IN (
    SELECT category, MAX(price)
    FROM books
    GROUP BY category
);
