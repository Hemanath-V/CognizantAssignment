import React from "react";

function SyntheticEventExample() {
  const handlePress = (e) => {
    e.preventDefault();
    alert("I was clicked");
  };

  return <button onClick={handlePress}>OnPress</button>;
}

export default SyntheticEventExample;
