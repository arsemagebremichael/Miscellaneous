//Using Arrays 
let updatedFriends = new Array('Safia', 'Edith');
updatedFriends.push('Meronu');
console.log({updatedFriends});
updatedFriends.push('Jenny');
updatedFriends.unshift('Me');
updatedFriends.pop();//remove jenny
updatedFriends.shift();//remove me
console.log(Object.keys(updatedFriends));
console.log({updatedFriends});




let myFriends = ["friend1", "friend2", "friend3", "friend4", 5];
let bestFriend = myFriends[0];

console.log({bestFriend});
console.log({myFriends});

//Changing an array
myFriends[3] = "friend5";
console.log({myFriends});

//Adding to an array
myFriends[4] = "friend4";

//Methods in array
const concated = myFriends.concat(" ", myFriends);
console.log(concated)

//for each
 let nums = [12, 34, 54, 7, 45]
 
 console.log(nums.at(2))

 const arr1 = ["Cecilie", 3];
const arr2 = ["Emil", "Tobias", "Linus"];
const arr3 = ["Robin"];
const children = arr1.concat(arr2, arr3, arr1);
console.log({children});
console.log(typeof children[1]);
let arr6 = arr1.push('hey');
console.log(arr1);
console.log(arr6);


//Splice
let array1 = new Array("a", 'b', 'e', 'f', 'g')
console.log(array1.splice(2, 0, "c", 'd'))

let arrOfShapes = ["circle", "triangle", "rectangle", "pentagon"];
arrOfShapes[3]= 'Square';
arrOfShapes[4] = 'tra';
console.log({arrOfShapes});
arrOfShapes.splice(3, 7, "square", "trapezoid");
console.log(arrOfShapes);
array1 = new Array("a", 'b', 'e', 'f', 'g')
delete array1[0];
console.log({array1});
let array3 = array1.splice(1, 2)
console.log({array3})

//searching
let arrOfArrays2 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
let arrofa = arrOfArrays2[1][0]
console.log({arrofa})


//map
let c = [1, 2, 3];
let y = c.map(item=>{item*item})
console.log(y);


//hey
let arr5 = ["the", "way", "x", 4];
let wordToSearch = "food";
let result = arr5.map(item => (item === wordToSearch ? item : null)).filter(Boolean)[0] || "the search word was not found";
console.log(result);


let arr = ["boy", "man", "girl", "school", "girl", "woman"];
let arrayOfDuplicate = arr.filter((item, index) => arr.indexOf(item) !== index);
console.log( `Array that might have duplicates:`, arr);
console.log("Array with duplicates only:", [...new Set(arrayOfDuplicate)]);


let story = "The quick brown fox jumps over the lazy dog";
let countingThe = story.match(/the/gi).length; 
let countingBrown = story.match(/brown/g).length;
console.log(`"the": ${countingThe}, "brown": ${countingBrown}`);