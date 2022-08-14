// creation of array
var a1 = ["hello", 45, true];
console.log(a1);

var a2 = new Array();
console.log(a2);

// add to the end
a1.push("New");
console.log(a1);

// remove last element
var last = a1.pop();
console.log(a1);
console.log(last);

// remove first element
var a2 = a1.shift();
console.log(a1);
console.log(a2);

// add to the start
var a2 = a1.unshift("New");
console.log(a1);
console.log(a2);

//slicing
a2 = a1.slice(1, 3);
console.log(a2);

// splicing
a1 = [
  "hello",
  45,
  true,
  "hello",
  45,
  true,
  "hello",
  45,
  true,
  "hello",
  45,
  true,
];
console.log(a1);
a2 = a1.splice(1, 5, 400);
console.log(a1);
console.log(a2);

//indexOf
var i1 = a1.indexOf(45);
console.log(a1);
console.log(i1);
i1 = a1.indexOf("New");
console.log(i1);

//includes
var b1 = a1.includes(45);
console.log(a1);
console.log(b1);
b1 = a1.includes("New");
console.log(b1);
