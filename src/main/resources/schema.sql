DROP TABLE IF EXISTS templates;
CREATE TABLE templates (
    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
    name VARCHAR(255),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    description VARCHAR(1000),
    html CLOB
);

DROP TABLE IF EXISTS contracts;
CREATE TABLE contracts (
    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    template_id UUID NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP,
    CONSTRAINT fk_template_id
          FOREIGN KEY(template_id)
            REFERENCES templates(id)
);