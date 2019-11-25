class Person{
    constructor(name,age){
        this.name=name
        this.age=age
    }
    getname(){
        return this.name
    }
}

const person1=new Person("anushka",34)
const person2=new Person("shruthi",30)
console.log(person1.name)
let pname=person2.getname()
console.log("person 2 name ",pname)


console.log("============================")

class Teacher extends Person{
    constructor(name,age,subjects){
        super(name,age)
        this.subjects=subjects
    }
    getsubject(){
        return this.subjects
    }
}
const teacher1= new Teacher("guru",23,["maths","english"])
// const teacher2=new Teacher("shruthi",30,"history")
const subj=teacher1.getsubject()
console.log(subj)
