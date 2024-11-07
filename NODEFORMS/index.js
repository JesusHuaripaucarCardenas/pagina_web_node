const express=require('express');

const PORT = 3000

const app=express() ;

app.use(express.static('index.html'));

app.get('/',(req,res) => {

    res.send("corriendo");
})
app.listen(3000);

app.listen(PORT, () => console.log(`http://3.81.69.217:${PORT}`));