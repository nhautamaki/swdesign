import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import Header from './components/Header/Header';
import './App.css'
import LandingPage from "./pages/LandingPage.jsx";
import React from "react";

function App() {
    return (
        <Router>
            <div className="App">
                <Header className="header"/>
                <div className="content">
                    <Routes>
                        <Route path="/" element={<LandingPage />} />
                        <Route path="/home" element={<Home />} />
                    </Routes>
                </div>
            </div>
        </Router>
    );
}


export default App
