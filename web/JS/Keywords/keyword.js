var a;
var b=10;
var a=20
console.log("a ",a)
var a=30
console.log("a ",a)

if(10<20){
    var c=40;
    console.log("c inside block ",c)
}
console.log("c outside if block ",c)

for(var i=0;i<4;i++){

}
console.log("i outside for loop ",i)

console.log("===============================")

// console.log(q)  no hosting
let p;
let q=20
//let p=40  cant redeclare 
console.log("p is",p)


if(20>3){
    let r=10
    console.log("r inside if block ",r)
}
// console.log("r inside block ",r)  cant use outside of block

console.log("===============================")

// const x;   cant declare without assigning

const x=[10,20,30]
// x={} cant reassign
x.push(40)
console.log(x)