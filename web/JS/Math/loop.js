var hobbies=["Sleeping","Eating","Travelling","Coding"]
console.log("---------Use of loop---------------")
for(var i=0;i<hobbies.length;i++){
    console.log(hobbies[i])
}
console.log("========================")
for(var hobby of hobbies){
    console.log(hobby)
}
console.log("========================")
for(var index in hobbies){
    console.log(hobbies[index])
}
console.log("========================")
var employee={
    name:'Avinash',
    age:24,
    color:'white',
    phoneNo:5465412356,
    hobbies:["Sleeping","Eating","Travelling","Coding"],

}
var name=employee["name"];
console.log("name "+name)
for(var key in employee){
    console.log(employee[key])
}
console.log("========================")
