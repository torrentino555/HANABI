import 'normalize.css'
import { createBrowserHistory } from "history";
import * as React from 'react';
import { Provider } from 'react-redux'

import './App.css';
import { Redirect, Route, Router, Switch } from "react-router";
import Mentor from "./components/Mentor";
import Profile from "./components/Profile";
import configureStore from "./configureStore";
import './api/config';
import './api/mocks';
import { Routes } from "./utils";


const store = configureStore();

class App extends React.Component {
  public render() {
    return (
        <Provider store={ store }>
            <Router history={ createBrowserHistory() }>
                <Switch>
                    <Route exact path={ Routes.COMPANY } component={ Profile } />
                    <Route exact path={ Routes.MENTOR } component={ Mentor } />
                    <Redirect to={ Routes.MENTOR } />
                </Switch>
            </Router>
        </Provider>
    );
  }
}

export default App;
