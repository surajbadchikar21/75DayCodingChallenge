
function UserGreeting(props){

  return(props.isLoggedIn ?    <h2 className="welcome-prompt">Welcome {props.username}</h2> 
                                : <h2 className="login-prompt">Please log in</h2>)

}
export default UserGreeting