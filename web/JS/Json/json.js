const person={
                name:'sundari',
                age:23,
                weight:60,
                hobbies:['music','sining']
             }

const JSONObject=JSON.stringify(person)
console.log("JSON Objec", JSONObject)
const JSObbject=JSON.parse(JSONObject)
console.log("JS Object ",JSObbject)