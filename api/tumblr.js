//const request = require('request');
const express = require('express');
const router = express.Router();

const tumblr_consumerkey = process.env.TUMBLR_KEY;
const tumblr_secret = process.env.TUMBLR_SECRET;

const tumblr_req = 'https://www.tumblr.com/oauth/request_token';

const redirect = encodeURIComponent('http://localhost:50451/api/tumblr/callback');