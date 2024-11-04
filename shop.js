const path = require('path');

const express = require('express');

const productController=require('../controller/product')
const adminData = require('./admin');

const router = express.Router();

router.get('/',productController.getProduct );

module.exports = router;
