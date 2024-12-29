CREATE TABLE crop_stock (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,         -- Crop name (e.g., Apple, Banana)
  type VARCHAR(50) NOT NULL,         -- Type of crop (e.g., Fruit, Vegetable)
  weight DECIMAL(10, 2) NOT NULL,    -- Weight of the crop in kg
  unit VARCHAR(20) NOT NULL,         -- Unit of measurement (kg)
  price_per_unit DECIMAL(10, 2) NOT NULL, -- Price per unit in currency
  harvest_date DATE,                 -- Harvest date of the crop
  expiry_date DATE                    -- Expiry date for the crop
);

-- Insert sample data for fruits
INSERT INTO crop_stock (name, type, weight, unit, price_per_unit, harvest_date, expiry_date) VALUES
('Apple', 'Fruit', 100.50, 'kg', 120.50, '2023-12-01', '2024-01-15'),
('Banana', 'Fruit', 25.00, 'kg', 60.00, '2023-12-10', '2024-01-05'),
('Mango', 'Fruit', 50.75, 'kg', 150.00, '2023-11-25', '2024-01-10'),
('Grapes', 'Fruit', 30.20, 'kg', 80.75, '2023-12-05', '2024-01-20'),
('Orange', 'Fruit', 45.30, 'kg', 90.25, '2023-12-03', '2024-01-18');