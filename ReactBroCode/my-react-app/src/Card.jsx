
import profilePic from './assets/luffy.jpg'
function Card(){

    return(
        <div className="card">

            <img className="card-image" src={profilePic}></img>
            <h2>Suraj Badchikar</h2>
            <p>Student , Full Stack Developer and Loves anime </p>
        </div>
    );
}

export default Card