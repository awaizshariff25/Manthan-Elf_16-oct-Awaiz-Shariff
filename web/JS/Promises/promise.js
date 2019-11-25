const promise= new Promise(function(reslove,reject){
    if(20>10){
        reslove("successful")
    }else{
        reject("error")
        
    }
})

promise.then(function(data){
    console.log("data",data)
}).catch(function(error){
    console.log("error ",error)
})

const persondata=new Promise(function(reslove,reject){
    if(20>10){
        let data=[10,20,30,40,50]
        reslove(data)
    }else{
        reject("no data")
    }
})

persondata.then(function(data){
    console.log("data ",data)
    data=data.push(60,70)
    return data
}).then(function(planedata){
    console.log("Plane data ",planedata)
}).catch(function(err){
    console.log("error ",err)
})