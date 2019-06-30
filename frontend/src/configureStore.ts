import { createBrowserHistory } from "history";
import { applyMiddleware, combineReducers, createStore } from "redux";
import { composeWithDevTools } from "redux-devtools-extension";
import createSagaMiddleware from 'redux-saga'

import { wrap } from "./actions";
import * as reducers from "./reducers";
import rootSaga from "./sagas";


export const history = createBrowserHistory()
const sagaMiddleware = createSagaMiddleware();
const composeEnhancers = composeWithDevTools({})

export default function configureStore(preloadStore?: any) {
    const state = wrap(createStore(
        combineReducers({
            ...reducers
        }),
        preloadStore,
        composeEnhancers(
            applyMiddleware(
                sagaMiddleware
            )
        )
    ));

    sagaMiddleware.run(rootSaga);

    return state;
}