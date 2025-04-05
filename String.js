//primitive way of declaring string
let x = "John";
console.log({x});
console.log(typeof(x));
console.log(x.length);

//But we can store them as object as well
let y = new String("loves icecream.");
console.log(x==y);
console.log({y});
console.log(typeof(y));
let myAccount = new Number(1289097);

console.log(y.charCodeAt(2));
console.log(y.charCodeAt(7));
console.log(y.substring(8));

//concat
let t = x.concat(" ", y)
console.log({t});

//trim
let a = "       hey         "
let b = a.trim()
console.log({b});
let c = a.trimStart()
console.log({c});

//padding
let d = "Broski";
let padded1 = d.padStart(14, 'y');
console.log({padded1});

//Repeat
console.log(`what is up, ${d}, `.repeat(4));

//Replace
console.log(d.replace("ski", "way"));

//Index of and last index of
let f = "What's going on?";
console.log(f.indexOf("going", 11));
console.log(f.lastIndexOf("going", 9));
console.log(f.search(/going/));

let str = "I love JavaScript.";
let regex = str.match(/[A-Z]/); // Match any uppercase letter
console.log({regex});
console.log(str.search(regex));

let g = 10;
let h = '20';
console.log(g+h);
console.log(g-h);


//https://www.w3resource.com/javascript-exercises/javascript-string-exercises.php

//1.Check String input
// let l = prompt("Good evening, \n What is the input: ");
// console.log(isNaN(l))


