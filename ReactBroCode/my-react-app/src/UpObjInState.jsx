import React, { useState } from "react";

function UpObjInState() {
  const [car, setCar] = useState({ year: 2024, name: "Ferrari" });

  function handleCarYear(event) {
    setCar((prevCar) => ({
      ...prevCar,
      year: event.target.value 
    }));
  }

  function handleCarName(event) {
    setCar((prevCar) => ({
      ...prevCar,
      name: event.target.value 
    }));
  }
  
  return (
    <>
      <p>Your favorite car is: {car.name} {car.year}</p>

      <input type="number" value={car.year} onChange={handleCarYear} />
      <input type="text" value={car.name} onChange={handleCarName} />
    </>
  );
}

export default UpObjInState;
