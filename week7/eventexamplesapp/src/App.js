import React from "react";
import Counter from "./Counter";
import SayWelcome from "./SayWelcome";
import SyntheticEventExample from "./SyntheticEventExample";
import CurrencyConverter from "./CurrencyConverter";

function App() {
  return (
    <div>
      <Counter />
      <SayWelcome message="Welcome!" />
      <SyntheticEventExample />
      <CurrencyConverter />
    </div>
  );
}

export default App;
