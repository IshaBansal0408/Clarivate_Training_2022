// Normal Function

function func1(name) {
  console.log("Hello," + name + "!");
}
func1("Heena");

var funcvar = function (name) {
  console.log("Hello," + name + "!");
};
funcvar("Jeena");

// Nested Functions

function func1(name) {
  console.log("Hello," + name + "!");

  var funcvar = function (name) {
    console.log("Hello," + name + "!");
  };
  funcvar("Rohit");
}
func1("Rahul");
funcvar("Rohan");

function func2() {
  console.log("Hello,fun2");

  function func21() {
    console.log("Hello, fun21");
  }
  return func21;
}
func2()();

// Arrow Function

var afun = () => {
  console.log("Hello from arrow function!");
};
afun();

// Immediate invoke Function (one time use)

(function otpgen() {
  var a = Math.random();
  console.log("OTP Generated is : ", a);
})();

//recursive function
// function rfun() {
//   rfun();
// }
// rfun();

// high order function and callback function

// here calculator is high order function and
// the function being passed(the arrow function) is the callback function

function calculator(n1, n2, op) {
  console.log(op);
  var res = op(n1, n2);
  return res;
}

var res1 = calculator(2, 3, (a, b) => {
  return a + b;
});

console.log("Result is :", res1);
