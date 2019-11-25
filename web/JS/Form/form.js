function validationform(){

    let usernameele=document.forms['loginform']['username']
    let passwordele=document.forms['loginform']['password']

    if(usernameele.value.trim().length>5) {
        let pele=document.getElementById("pele")
        pele.style.display="none"
        
    }else{
        let pele=document.getElementById("pele")
        pele.style.display="block"
        
        
    }

    if(passwordele.value.trim().length>5){
        let pelen=document.getElementById("pelen")
        pelen.style.display="none"
        
    }else{
        let pelen=document.getElementById("pelen")
        pelen.style.display="block"
        
    }
    if(usernameele.value.trim().length>5 && passwordele.value.trim().length>5){
        alert("data saved")
        document.getElementById("loginform").reset();
        return true
    }else{
        return false
    }
}