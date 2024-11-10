
CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS user(
  id UUID DEFAULT gen_random_uuid() PRIMARY KEY NOT NULL,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  isadmin BOOLEAN NOT NULL,
);