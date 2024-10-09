import React, { useState } from "react"
function Component2() {

    const [name, setName] = useState("Guest");
    const [quantity, setquantity] = useState(1);

    const [payment, setPayment] = useState();

    const [shipping, setShipping] = useState("");

    function handleShippingChg(event) {
        setShipping(event.target.value);
    }
    function handleNameChange(event) {
        setName(event.target.value);
    }

    function handleQuanChg(event) {
        setquantity(event.target.value)
    }

    function handlePayment(event) {
        setPayment(event.target.value)
    }

    return (
        <div>
            <input value={name} onChange={handleNameChange}></input>
            <p> name : {name}</p>

            <input type="number" value={quantity} onChange={handleQuanChg} />
            <p>quantity : {quantity}</p>

            <select name="Payment" onChange={handlePayment} id="">
                <option value="">Select op</option>
                <option value="Mastercard">Mastercard</option>
            </select>

            <p>payment : {payment}</p>

            <label htmlFor="">

                <input type="radio" value="Pick up " checked={shipping === "Pick Up"} onChange={handleShippingChg} />
                Pick Up </label>

            <label>

                <input type="radio" value="Delivery" checked={shipping === "Delivery"} onChange={handleShippingChg} />

                Deliver</label>

            <p>Shipping {shipping}</p>

        </div>
    );

}

export default Component2