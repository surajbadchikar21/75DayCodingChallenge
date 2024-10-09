import React,{useState} from 'react';

function MyComponent(){

    const [name,setName]= useState("Guest"); // array destructuring to get the statefull variable and setter function

    const [age,setAge]=useState(0);

    const[isEmp,setEmp]=useState(false);

    const updateName = ()=>{
        setName("Suraj");
    }

    const incrementAge = ()=>{
        setAge(age+1);
    }

    const isEmployed = ()=>{
        setEmp(!isEmp);
    }

    return(
        <div>
            <p>Name : {name}</p>
            <button onClick={updateName}>Set Name</button>

            <p>Name : {age}</p>
            <button onClick={incrementAge}>Increment Age</button>

            <p>isEmp : {isEmp ? "is Employed" : "not Employed"}</p>
            <button onClick={isEmployed}>Toggle</button>
        </div>
    );


}
export  default MyComponent 