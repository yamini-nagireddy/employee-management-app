import './App.css';
import {BrowserRouter, Route, Routes } from 'react-router-dom';
import ListEmployee from './components/ListEmployee';
import Header from './components/Header';
import AddEmployee from './components/AddEmployee';

function App() {
  return (
    <div>
      <BrowserRouter>
        <Header />
        <Routes>
          <Route exact path="/" element={<ListEmployee />}></Route> 
          <Route path="/employees" element={<ListEmployee />}></Route>
          <Route path="/add-employee" element={<AddEmployee/>}></Route>
          <Route path="/edit-employee/:id" element={<AddEmployee/>}></Route>
        </Routes>
      </BrowserRouter>
      
    </div>
  );
}

export default App;
