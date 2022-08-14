// creation
var o1 = {
  name: "Rina",
  id: 123,
};
console.log(o1);

var o2 = new Object();
console.log(o2);
// add attributes manually
o2.name = "Palak";
o2.id = 345;
o2.location = "Mumbai";
console.log(o2);

function add_data(name, id, age) {
  this.name = name;
  this.id = id;
  this.age = age;
}

var o3 = add_data("Daisy", 256, 22);
// undefined
console.log(o3);
var o3 = new add_data("Daisy", 256, 22);
console.log(o3);

//change data in object
o3.name = "Fateh";
console.log(o3);

// a new object from the old object
var o4 = (o3.age = 16);
console.log(o4);
