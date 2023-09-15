import React, { useState } from 'react';
import './App.css';
import NavBar from './components/NavBar';
import Main1 from './components/Main1';
import Main2 from './components/Main2';
import Footer from './components/Footer';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

function App() {

  return (
    <div>
      <BrowserRouter>
        <NavBar />
        <Routes>
          <Route path="/Main1" element={<Main1 />} />
          <Route path="/Main2" element={<Main2 />} />

        </Routes>

        <Footer />
      </BrowserRouter>
    </div>
  );
}

/*      <BrowserRouter>

        <Navbar />
        <Routes>
          <Route path="/Principal" element={<Principal />} />
          <Route path="/Main1" element={<Main />} />
          <Route path="/Main2" element={<Main2 />} />

        </Routes>


        <Footer />

      </BrowserRouter>*/

export default App
