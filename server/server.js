const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

//const request = require('request');

const router = express.Router();

const tumblr_consumerkey = 'fZD5HJ2LsWPJyHrLChVbv7ViqLtj3kJP41A45HkuD3LA6uyjKW';
const tumblr_secret = '5kQxkI0E62iUVMYrLfBpMadXdvBGzKgIlKuHYRWSyyI5D3CvWI';

const tumblr_req = 'https://www.tumblr.com/oauth/request_token';




const app = express();

const uri = 'mongodb://codemasher:mash123@ds123171.mlab.com:23171/codemash';
mongoose.connect(uri, {useNewUrlParser: true});


const PORT = process.env.PORT || 8080;

app.listen(PORT, () => console.log(`API is running on port ${PORT}`));

console.log("Hello");