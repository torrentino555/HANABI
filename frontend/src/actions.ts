import { createWrap, reactions } from "redux-from-void";

export const wrap = createWrap();

const {
    setCardState,

    setProjectDetails
} = reactions(wrap);

const {
    initProfile,
    getProjectDetails
} = reactions(wrap, [ "success", "failure" ]);

export {
    initProfile,
    setCardState,
    getProjectDetails,
    setProjectDetails
}