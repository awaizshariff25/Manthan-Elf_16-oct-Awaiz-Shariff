let person= {
                name:"shalini",
                age:20,
                hobbies:["singing","dancing"]
            }

let { name,hobbies }=person
console.log("Hobbies ",hobbies)

console.log("===============================")
displayName(person)
function displayName({name, hobbies}){
    console.log(name)
    console.log(hobbies)
}


let number=[1,2,3,4,5,6,7,8]
let[num0,num1,num2]=number
console.log(num0)
console.log(num1)
console.log(num2)

console.log("===============================")

let items=[
            {
                id:1,
                name:"bag",
                price:500
            },
            {
                id:2,
                name:"watch",
                price:7900
            }
          ]
          console.log("items ",items)
          items[0].id=5
          console.log("after modification ",items)

    var item={...items[0]}
    console.log("item 0 ",item)
    item.id=20
    console.log("items ",items)
    console.log("item ",item)

    let addres={
        city:'bangalore',
        pincode:560068
    }
    console.log("=====================")

    let paddress={...person,...addres}
    console.log(paddress)

    console.log("=====================")
    
    var arr=[10,29,34,56]
    var arr1=[39,54,78]
    var arrays=[...arr,...arr1]
    console.log("array data ",arrays)

    console.log("=====================")
    function sum(...args){
        let val=0
        for(let i=0;i<args.length;i++){
            val+=args[i]
        }
        return val
    }

    console.log(sum(1,2,3,4))