// var pelement=document.getElementById("demo")
// console.log(pelement)

// var text=pelement.textContent;
// console.log(text)

// var modifiedtext=pelement.textContent="Good Evening"
// console.log(modifiedtext)
// console.log(document.getElementById("demo"))

// var pElement=document.querySelector("p")
// pElement.textContent="Good Evening"
// pElement.style.fontSize  ="150px"
// pElement.style.fontFamily="cursive"
// pElement.style.color="green"



// var ele=document.getElementsByClassName(".test")
// console.log(ele)

// ele[0].style.color="red"
// ele.style.fontSize="50px"
// ele.style.color="green"

// var elem=document.querySelectorAll(".test")
// elem[1].style.color="blue"
// elem[1].style.fontSize="50px"
// console.log(elem)

var bElement=document.createElement("button")
bElement.textContent="click here!!!!!!!!"

document.body.appendChild(bElement)


var p=document.createElement("p")
p.textContent="I am Last Child"
document.body.appendChild(p)


document.write("GOOGLE")

var ele=document.getElementById("add")
//ele.className='xyz'

ele.classList='xyz abc'