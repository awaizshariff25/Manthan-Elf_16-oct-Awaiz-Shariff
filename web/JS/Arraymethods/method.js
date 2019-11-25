// var brands=["kinley","bisleri","kingfisher","babaji"]
// brands.forEach(function(value,index){
//     console.log("Brand = ",value,"\nindex = ",index)
// })

// var hobbies=["sleeping","eating","traveling","adventure"]
// var a=hobbies.push("music")
// console.log(a)
// console.log("after push ",hobbies)

// console.log("____----------------------------------------______")

// hobbies.pop()
// console.log("after pop",hobbies)

// console.log("____----------------------------------------______")

// hobbies.shift();
// console.log("after shift ",hobbies)

// console.log("____----------------------------------------______")

// hobbies.unshift("Sleeping")
// console.log("after unshift ",hobbies)

// console.log("____----------------------------------------______")
// var b=hobbies.indexOf("traveling")
// if(b>-1){
//     console.log("element present at", b+1)
// }
// else{
//     console.log("not present")
// }
// console.log("____----------------------------------------______")

// var z=["a","b","c"]
// var x=z.join("---------")
// console.log(x)
// console.log(z)

// console.log("____----------------------------------------______")

// var e=z.splice(1,0,"d","e","f")
// console.log(z)

// console.log("____----------------------------------------______")

// var g=z.slice(2,4)
// console.log(g)
// console.log("z element ",z)


// console.log("____----------------------------------------______")

var number=[100,200,400,300]

// var newarray=number.filter(function(num,index){
//     if(num>100)
//     {
//         return true
//     }
//     else{
//         return false
//     }
// })

// console.log("filter number ",newarray)
// console.log("old array ",number)

// console.log("===========================")
// var afilter=number.filter(num=>num>100)
// console.log(afilter)

// console.log("===========================")

// var addednum= number.map(function(num){
//     return num+50
// })

// console.log(addednum)

// console.log("===========================")

// var afilter=number.map(num=>num+50)
// console.log(afilter)

var item=[
    {
        name:"lipstick",
        id:01,
        price:499
    },
    {
        name:"Eyeliner",
        id:02,
        price:999   
    },
    {
        name:"Watch",
        id:03,
        price:10000
    },
    {
        name:"Trimmer",
        id:04,
        price:500
    }
]

// var filteritem=item.filter(item=>item.price>500)
// console.log("filteritem are ",filteritem)

// var mapfil=item.map(item=>{
//     item.price+=100
//     return item    })

// var mapfil=item.map(item=>{
//     var i={
//         name: item.name,
//         price: item.price+100,
//         id:item.id
//     }
//     return i
// })
// console.log(item)
// console.log(mapfil)


var chocolates=["dairy silk","dark chocolate","feraro"]
var haskaccha = chocolates.includes("kaccha mangobite")
console.log("has kaccha ",haskaccha)
console.log(Array.isArray(chocolates))