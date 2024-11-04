const path = require('path');

const express = require('express');

const productController=require('../controller/product')
const rootDir = require('../util/path');
const { route } = require('./shop');

const router = express.Router();



// /admin/add-product => GET
router.get('/add-product',productController.getAddProduct );

// /admin/add-product => POST
router.post('/add-product',productController.postAddProduct );

module.export=router
