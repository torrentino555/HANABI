import { createReducer } from "redux-from-void";
import { initProfile, setProjectDetails } from "../actions";
import { IProjectList, IUserInfo } from "../api";


const initState : IUserInfo = {
    nickname: '',
    completedProjects: [],
    currentProjects: [],
    description: ''
};

export const profile =  createReducer(initState)(
    initProfile.success,
    (_: any, { payload: { userInfo } }: any ) => ({ ...userInfo }),

    setProjectDetails,
    (state: any, { payload: { id } }: any) => {
        let detailProject = state.completedProjects.find((item: IProjectList) => item.id === id);
        if (!detailProject) {
            detailProject = state.currentProjects.find((item: IProjectList) => item.id === id);
        }
        detailProject.detailed = true;
    }
);
