let pele=document.createElement("p")

function greet(message){
    let name="Bill Gates"
    //alert(message+" "+name)
    alert(`${message} ${name}`)
    console.log(`${2+2}`)
    console.log("2+2")

}

function changefont(){
    let ele=document.getElementById("test")
    ele.style.fontSize="50px"
}


function change(){
    let elem=document.getElementById("test")
    elem.style.fontSize="20px"

}

function showdata(){
    console.log("key pressed")
}
function data(){
    console.log("key pressed")

}

function showelement(){
    pele.textContent="create p Element"
    document.body.appendChild(pele)
}

let el=document.getElementById("tes")
// el.onclick=function(){
//     alert("clicked")
// }
el.addEventListener('click',function(){
    alert("clicked!!!!!!!!")
})
