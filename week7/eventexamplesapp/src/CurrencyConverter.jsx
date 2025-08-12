import React, { useState } from "react";

export default function CurrencyConverter() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    const rate = 0.011; // Example conversion rate
    setEuro((rupees * rate).toFixed(2));
  };

  return (
    <div>
      <h2>Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          placeholder="Enter INR"
        />
        <button type="submit">Convert</button>
      </form>
      {euro && <p>{rupees} INR = {euro} EUR</p>}
    </div>
  );
}
