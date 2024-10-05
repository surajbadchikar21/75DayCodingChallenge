// import module for Button component 
// import styles from './Button.module.css'

function Button(){

    // inline styles
    const styles ={
        
            backgroundColor: "aquamarine",
            border: "none",
            cursor :"pointer",
          
    }

    return(
        // inline styling applied  {} dynamicall upload values 
        <button style={styles}>Click Here</button>
        // module code below 
        // <button className="{styles.button}">Click Here</button>
    );
}

export default Button