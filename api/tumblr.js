//const request = require('request');
const express = require('express');
const router = express.Router();

const tumblr_consumerkey = process.env.TUMBLR_KEY;
const tumblr_secret = process.env.TUMBLR_SECRET;

const tumblr_req = 'https://www.tumblr.com/oauth/request_token';

const redirect = encodeURIComponent('http://localhost:8080/api/tumblr/callback');

router.get('/login', (req, res) => {
  res.redirect(`https://www.tumblr.com/oauth/authorize?client_id=${tumblr_consumerkey}&scope=identify&response_type=code&redirect_uri=${redirect}`);
});

module.exports = router;


