CREATE TABLE templates (
    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
    name VARCHAR(255),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    description VARCHAR(1000),
    html CLOB
);
