function List() {
    const fruit = [
      { name: "apple", cal: 20 },
      { name: "orange", cal: 30 },
      { name: "banana", cal: 32 }
    ];
  
 
    const lowcal = fruit.filter((fruit) => fruit.cal < 25);
  

    const listItems = lowcal.map((fruit) => (
      <li key={fruit.name}>
        {fruit.name}: &nbsp;{fruit.cal} calories
      </li>
    ));
  
    return <ol>{listItems}</ol>;
  }
  
  export default List;
  