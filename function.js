//reversing a string or ur
function toReverse(ourNumber){
    ourNumber = ourNumber + "";
    return ourNumber.split("").reverse().join("")
}
let number1 = "What happened in June"
console.log(`${number1}, when reversed is: ${toReverse(number1)}`);

//our string
function arsema(ourString){
    let ourLength = ourString.length;
    for(i=1; i<=ourLength; i++)
    {
        console.log(ourString.slice(0,i));
    }

}
console.log(arsema(number1))

//sort string alphabetically

let ourString2 = "I love coding.";
let ourArray1 = ourString2.split(" ").charAt(0).toUpperCase().join();