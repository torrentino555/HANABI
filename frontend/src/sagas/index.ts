import { all, takeLatest } from "redux-saga/effects"
import * as actionCreators from '../actions';
import { getProjectDetails, getUserInfo } from "./user";


function * rootSaga() {
    yield all([
        takeLatest(actionCreators.initProfile.type, getUserInfo),
        takeLatest(actionCreators.getProjectDetails.type as any, getProjectDetails)
    ])
}

export default rootSaga;