// function first(){
//     setTimeout(function(){
//         console.log("First Function Executed")
        
//     },5000)
//     console.log("hello good morning")
// }


// function second(){
//     console.log("Second Function Executed")
// }




// first()
// second()

console.log("====================Callback=======================")
function first(callback){
    setTimeout(function(){
        console.log("First Function Executed")
        callback()
    },5000)
    console.log("hello good morning")
}


function second(){
    
    console.log("Second Function Executed")
}




first(second)
