const express = require('express');
const cors = require('cors');
const app = express();
app.use(cors());

const products = [
  { id: 1, name: 'Laptop', description: 'Lightweight 14-inch', price: 999.99, stock: 10 },
  { id: 2, name: 'Headphones', description: 'Noise cancelling', price: 199.99, stock: 50 }
];

app.get('/api/products', (_req, res) => res.json(products));

const PORT = process.env.PORT || 8080;
app.listen(PORT, () => console.log(`API listening on http://localhost:${PORT}`));
