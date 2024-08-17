CREATE TABLE IF NOT EXISTS items (
    id int NOT NULL,
    title VARCHAR(255) NOT NULL,
    amount int NOT NULL,
    capacity int NOT NULL,
    PRIMARY KEY (id)
    );