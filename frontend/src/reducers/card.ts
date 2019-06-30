import { createReducer } from "redux-from-void";
import { setCardState } from "../actions";
import { CardState } from "../components/Card/card";


const initState = {
    state: CardState.CURRENT_PROJECTS
};

export const card = createReducer(initState)(
    setCardState,
    (_: any, { payload: { state } }: any) => ({
        state
    })
);