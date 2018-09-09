const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const axios = require('axios');
const Snapchat = require('snapchat')


const app = express();
app.use(bodyParser.json());

const uri = 'mongodb://codemasher:mash123@ds123171.mlab.com:23171/codemash';
mongoose.connect(uri, {useNewUrlParser: true});


 
let client = new Snapchat()
// note the signIn will default to credentials stored in environment variables


app.get('/snapchat/signin', function(req, res){
	let meBodyYou = req.body;
	client.signIn('let', 'me', 'body@gmail.com', 'you', function (err, session) {
	  if (!err) {
	    console.log('signed in', client.username)
	    res.status(200).send(session);
	  }
	})
});


const PORT = process.env.PORT || 8080;

app.listen(PORT, () => console.log(`API is running on port ${PORT}`));


