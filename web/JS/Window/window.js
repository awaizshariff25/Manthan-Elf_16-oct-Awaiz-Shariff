console.log(window)
console.log(this)
console.log(this===window)


var a=10
console.log("a =",a)
console.log("a =",window.a)

function add(){
    console.log("add method")
}

add()
window.add()


//alert("this site may contain virus")

//confirm("are you 18 year old")

var age=prompt("enter your age")
console.log(age)