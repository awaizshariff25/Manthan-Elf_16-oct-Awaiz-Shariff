var person={
    firstname:"Venky",
    lastName:"A",
    age:41,
    gender:"M",
    eat:function(){
        console.log("Eat something");
    },
    getFullName:function() {
        return this.firstname+" "+this.lastName;
    }

}
var firstname=person.firstname;
var lastName=person.lastName;
var age=person.age;
var gender=person.gender;
person.eat();
var fullName=person.getFullName();

console.log("First name "+firstname);
console.log("last name "+lastName);
console.log("Age "+age);
console.log("gender "+gender);
console.log("full name "+fullName);
