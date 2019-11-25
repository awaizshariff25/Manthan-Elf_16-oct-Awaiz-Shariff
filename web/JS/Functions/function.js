console.log("Named function")
function add(num1,num2){
    var sum=num1+num2
    console.log("Sum "+sum)
}
add(10,11)
console.log("============Anonymous===========")
var multiply=function (n,n1) {
    var product=n*n1
    console.log(product)
}
multiply(5,10);
console.log("============Self invoking===========");
(function (s) {
    var square=s*s
    console.log(square)

})(10)
console.log("============Arrow===========");
var division=(val1,val2)=>{
    var div=val1/val2
    console.log(div)
}
division(25,5)
var sum=(i,j)=>i+j
var value=sum(10,20)
console.log(value)