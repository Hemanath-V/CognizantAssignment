import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [view, setView] = useState("book");
  const [showCourse, setShowCourse] = useState(false);

  return (
    <div style={{ textAlign: "center", marginTop: "20px" }}>
      <h1>Blogger App</h1>

      <button onClick={() => setView("book")}>Show Book</button>
      <button onClick={() => setView("blog")}>Show Blog</button>
      <button onClick={() => setShowCourse(!showCourse)}>Toggle Course</button>

      <hr />

      {/* Method 1: if/else via state */}
      {view === "book" && <BookDetails />}
      {view === "blog" && <BlogDetails />}

      {/* Method 2: ternary operator */}
      <div>
        {showCourse ? <CourseDetails /> : <p>Click toggle to view course</p>}
      </div>

      {/* Method 3: Inline conditional && */}
      {view === "book" && <p>Book view is active</p>}
    </div>
  );
}

export default App;
