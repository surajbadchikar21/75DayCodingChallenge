// import Header from './Header.jsx'
// import Footer from './Footer.jsx'
// import Food from './Food.jsx'
import Card from './Card'
import Button from './Button'
import Student from './Student';

function App() {

  return(
    <>
      {/* <Header></Header> */}
       {/* or */}
      {/* <Header/>
      <Footer/>
      <Food/> */} 

<Card/>
<Button/>
{/* Props code below */}
<Student name="Suraj" age={30} isStudent={true}/>
      
<Student name="Tempest" age="30" isStudent={true}/>
<Student name="Tempest1"/>
<Student/>
      </>
  );

}

export default App
