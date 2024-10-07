
function Button1(){

    const handleClick=()=> console.log("OUCH")
    const handleClick2=(e)=> console.log(e)

    return(
<button onClick={(e)=>handleClick2(e)}>Click Me </button>

    );
}

export default Button1