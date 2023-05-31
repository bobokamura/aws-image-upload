import "./App.css";
import React, { useState, useEffect } from "react";
import axios from "axios";

const UserProfiles = () => {
  const [userProfile, setUserProfile] = useState([]);

  const fetchUserProfiles = () => {
    axios
      .get("http://localhost:8080/api/v1/user-profile")
      .then((res) => {
        console.log("RESULT: ", res);
        setUserProfile(res.data);
      })
      .catch(function (err) {
        console.log(err);
      });
  };

  useEffect(() => {
    fetchUserProfiles();
  }, []);
  return userProfile.map((user, idx) => {
    return (
      <div key={idx}>
        <h1>{user.userName}</h1>
        <p>{user.userProfileId}</p>
      </div>
    );
  });
};

function App() {
  return (
    <div className="App">
      <UserProfiles />
    </div>
  );
}

export default App;
