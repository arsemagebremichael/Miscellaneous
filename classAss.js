

let a ="I need your helP!";
let b = a.match(/help/gi);
if (b)
{
    console.log("Hello");
}
else{
    console.log("nope");
}


let myEmail = "User@example.com";
if (myEmail.endsWith('.com') && myEmail.includes('@')){
    console.log("We are good");
}
else{
    console.log("nah");
}
