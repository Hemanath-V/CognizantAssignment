import React from "react";

const IndianPlayers = () => {
  const players = ["Virat", "Rohit", "Bumrah", "Rahul", "Shami", "Jadeja"];
  
  
  const oddPlayers = players.filter((_, index) => index % 2 === 0);
  const evenPlayers = players.filter((_, index) => index % 2 !== 0);

  
  const T20players = ["Hardik", "Surya"];
  const RanjiTrophyPlayers = ["Pujara", "Rahane"];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      {oddPlayers.map((p, i) => <p key={i}>{p}</p>)}

      <h2>Even Team Players</h2>
      {evenPlayers.map((p, i) => <p key={i}>{p}</p>)}

      <h2>Merged Players</h2>
      {mergedPlayers.map((p, i) => <p key={i}>{p}</p>)}
    </div>
  );
};

export default IndianPlayers;
