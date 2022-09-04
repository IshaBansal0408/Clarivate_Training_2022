// Number DataType
var a: number;
a = 234;
console.log("Value of a : ", a);

// String DataType
var b: string;
b = "Welcome to Typescript";
console.log("Value of b : ", b);

// Boolean DataType
var c: boolean;
c = false;
console.log("Value of c : ", c);

// Void DataType
var d: void;
console.log("Value of d : ", d);

// Null DataType
var e: null;
e = null;
console.log("Value of e : ", e);

// Undefined Datatype
var f: undefined;
console.log("Value of f : ", f);
var g: number;
console.log("Value of g : ", g);

// Array DataTypes
var arr1: number[];
arr1 = [1, 2, 3, 4, 5];
console.log("Array is : ", arr1);
console.log("Type of arr1 is : ", typeof arr1);

// Class DataType
class Person {
  firstName;
  lastName;

  setName(f: string, l: string) {
    this.firstName = f;
    this.lastName = l;
  }
  getName() {
    return "Your Name is : " + this.firstName + " " + this.lastName;
  }
}
var p1 = new Person();
p1.setName("Raman", "Mishra");
console.log(p1.getName());

// Interface DataType
interface UserInterface {
  name: string;
  age: number;
  setData(n: string, a: number);
  displayName();
  checkVoteStatus(): string;
}
class UserClass implements UserInterface {
  name;
  age;
  setData(n: string, a: number) {
    this.name = n;
    this.age = a;
  }
  displayName() {
    console.log("Your Name is : ", this.name);
  }
  checkVoteStatus(): string {
    if (this.age > 18) return "Yay! You can vote!";
    return "Oh No! You can't vote right now!";
  }
}
var u1 = new UserClass();
u1.setData("Minni", 34);
u1.displayName();
console.log(u1.checkVoteStatus());

// Enum DataType
enum MediaType {
  magazine,
  newspaper = 67,
  television,
  social_media,
}
function how2spread(projectName: string): MediaType {
  if (projectName == "instagram") return MediaType.social_media;
  return MediaType.magazine;
}
console.log(how2spread("instagram"));
console.log(how2spread("facebook"));

// Any DataType
var h: any;
console.log("Value of h : ", h);
console.log("Type of h : ", typeof h);
h = 1234;
console.log("Value of h : ", h);
console.log("Type of h : ", typeof h);
h = "rain";
console.log("Value of h : ", h);
console.log("Type of h : ", typeof h);
h = true;
console.log("Value of h : ", h);
console.log("Type of h : ", typeof h);
h = 45.3;
console.log("Value of h : ", h);
console.log("Type of h : ", typeof h);
h = null;
console.log("Value of h : ", h);
console.log("Type of h : ", typeof h);

// Union of DataTypes
var i: number | string;
console.log("Value of i : ", i);
console.log("Type of i : ", typeof i);
i = 1244;
console.log("Value of i : ", i);
console.log("Type of i : ", typeof i);
i = "hello";
console.log("Value of i : ", i);
console.log("Type of i : ", typeof i);

// Intersection of DataTypes
interface Student {
  student_id: number;
  name: string;
}

interface Teacher {
  Teacher_Id: number;
  teacher_name: string;
}

type intersected_type = Student & Teacher;

var obj1: intersected_type = {
  student_id: 3232,
  name: "rita",
  Teacher_Id: 7873,
  teacher_name: "seema",
};

console.log(obj1.Teacher_Id);
console.log(obj1.name);
