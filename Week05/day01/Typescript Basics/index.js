// Number DataType
var a;
a = 234;
console.log("Value of a : ", a);
// String DataType
var b;
b = "Welcome to Typescript";
console.log("Value of b : ", b);
// Boolean DataType
var c;
c = false;
console.log("Value of c : ", c);
// Void DataType
var d;
console.log("Value of d : ", d);
// Null DataType
var e;
e = null;
console.log("Value of e : ", e);
// Undefined Datatype
var f;
console.log("Value of f : ", f);
var g;
console.log("Value of g : ", g);
// Array DataTypes
var arr1;
arr1 = [1, 2, 3, 4, 5];
console.log("Array is : ", arr1);
console.log("Type of arr1 is : ", typeof arr1);
// Class DataType
var Person = /** @class */ (function () {
    function Person() {
    }
    Person.prototype.setName = function (f, l) {
        this.firstName = f;
        this.lastName = l;
    };
    Person.prototype.getName = function () {
        return "Your Name is : " + this.firstName + " " + this.lastName;
    };
    return Person;
}());
var p1 = new Person();
p1.setName("Raman", "Mishra");
console.log(p1.getName());
var UserClass = /** @class */ (function () {
    function UserClass() {
    }
    UserClass.prototype.setData = function (n, a) {
        this.name = n;
        this.age = a;
    };
    UserClass.prototype.displayName = function () {
        console.log("Your Name is : ", this.name);
    };
    UserClass.prototype.checkVoteStatus = function () {
        if (this.age > 18)
            return "Yay! You can vote!";
        return "Oh No! You can't vote right now!";
    };
    return UserClass;
}());
var u1 = new UserClass();
u1.setData("Minni", 34);
u1.displayName();
console.log(u1.checkVoteStatus());
// Enum DataType
var MediaType;
(function (MediaType) {
    MediaType[MediaType["magazine"] = 0] = "magazine";
    MediaType[MediaType["newspaper"] = 67] = "newspaper";
    MediaType[MediaType["television"] = 68] = "television";
    MediaType[MediaType["social_media"] = 69] = "social_media";
})(MediaType || (MediaType = {}));
function how2spread(projectName) {
    if (projectName == "instagram")
        return MediaType.social_media;
    return MediaType.magazine;
}
console.log(how2spread("instagram"));
console.log(how2spread("facebook"));
// Any DataType
var h;
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
var i;
console.log("Value of i : ", i);
console.log("Type of i : ", typeof i);
i = 1244;
console.log("Value of i : ", i);
console.log("Type of i : ", typeof i);
i = "hello";
console.log("Value of i : ", i);
console.log("Type of i : ", typeof i);
