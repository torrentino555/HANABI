import { call, delay, cancel, fork, all, select } from 'redux-saga/effects';

import * as actions from '../actions';
import { assertResponse } from "../api/errorHandling";
import * as api from '../api';
import { getDataFromResponse } from "../utils";


export function * getUserInfo(): any {
    try {
        const response = yield call(api.getUserInfo);
        assertResponse(response);
        yield call(actions.initProfile.success, { userInfo: getDataFromResponse(response) });
    } catch (err) {
        yield call(actions.initProfile.failure, err.message);
    }
}

export function * getProjectDetails(id: number): any {
    try {
        const response = yield call(api.postProjectDetails, id);
        assertResponse(response);
        yield call(actions.getProjectDetails.success, { projectDetails: getDataFromResponse(response) });
    } catch (err) {
        yield call(actions.getProjectDetails.failure, err.message);
    }
}