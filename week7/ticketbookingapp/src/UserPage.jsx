import React from "react";

function UserPage() {
  return (
    <div>
      <h2>Book Your Ticket</h2>
      <form>
        <label>Flight Number: </label>
        <input type="text" placeholder="Enter Flight Number" /> <br /><br />
        <label>Passenger Name: </label>
        <input type="text" placeholder="Enter Name" /> <br /><br />
        <button type="submit">Book Ticket</button>
      </form>
    </div>
  );
}

export default UserPage;
