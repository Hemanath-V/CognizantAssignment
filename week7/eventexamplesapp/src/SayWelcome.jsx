import React from "react";

function SayWelcome({ message }) {
  const handleClick = (msg) => alert(msg);

  return (
    <button onClick={() => handleClick(message)}>Say Welcome</button>
  );
}

export default SayWelcome;
