import React from "react";
import officeImage from "./images/office.jpg";

function App() {
  
  const office = {
    name: "Sunshine Towers",
    rent: 55000,
    address: "123 MG Road, Chennai"
  };

  
  const offices = [
    { name: "Sunshine Towers", rent: 55000, address: "123 MG Road, Chennai" },
    { name: "Tech Park", rent: 75000, address: "IT Corridor, Bangalore" },
    { name: "City Center", rent: 60000, address: "Anna Salai, Chennai" }
  ];

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      
      <h1>Office Space Rental App</h1>

      {/* Image */}
      <img
        src={officeImage}
        alt="Office Space"
        style={{ marginBottom: "20px" }}
      />

      {/* Single Office Object */}
      <h2>Featured Office</h2>
      <p>Name: {office.name}</p>
      <p style={{ color: office.rent < 60000 ? "red" : "green" }}>
        Rent: ₹{office.rent}
      </p>
      <p>Address: {office.address}</p>

      {/* List of Offices */}
      <h2>Available Offices</h2>
      {offices.map((o, index) => (
        <div key={index} style={{ marginBottom: "15px" }}>
          <p>Name: {o.name}</p>
          <p style={{ color: o.rent < 60000 ? "red" : "green" }}>
            Rent: ₹{o.rent}
          </p>
          <p>Address: {o.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
