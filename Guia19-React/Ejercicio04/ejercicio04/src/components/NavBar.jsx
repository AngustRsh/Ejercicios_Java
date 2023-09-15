import React from 'react'
import { Link } from 'react-router-dom';

export default function NavBar() {
  return (
        <div>
          <Link to="/Main1" className='btn' >Main1</Link>
          <Link to="/Main2" className='btn' >Main2</Link>
        </div>
      );
}
