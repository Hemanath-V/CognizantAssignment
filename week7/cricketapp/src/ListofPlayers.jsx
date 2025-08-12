import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Player1", score: 80 },
    { name: "Player2", score: 65 },
    { name: "Player3", score: 72 },
    { name: "Player4", score: 50 },
    { name: "Player5", score: 90 },
    { name: "Player6", score: 45 },
    { name: "Player7", score: 76 },
    { name: "Player8", score: 60 },
    { name: "Player9", score: 88 },
    { name: "Player10", score: 40 },
    { name: "Player11", score: 95 }
  ];

 
  const lowScorePlayers = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      {players.map((p, i) => (
        <p key={i}>{p.name} - {p.score}</p>
      ))}

      <h2>Players with score below 70</h2>
      {lowScorePlayers.map((p, i) => (
        <p key={i}>{p.name} - {p.score}</p>
      ))}
    </div>
  );
};

export default ListofPlayers;
