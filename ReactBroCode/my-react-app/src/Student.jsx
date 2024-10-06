// props usage 
function Student(props){
    return(
        <div className="student">
            <p>Props</p>
<p>Name : {props.name}</p>
<p>Age: {props.age}</p>
<p>Student : {props.isStudent ? "Yes" : "No"}</p>

        </div>
    );
}
export default Student