import { get, post } from "./config";

export enum TAGS {
    WEB,
    OS,
    Console,
    Desktop,
    Embedded
}

export interface IUserInfo {
    nickname: string
    currentProjects: Array<IProjectList>
    completedProjects: Array<IProjectList>
    description: string
}

export interface IProjectList {
    id: number
    title: string
    countOfActiveTeams: number
    tags: Array<TAGS>,
    detailed?: boolean
} {

}

export const getUserInfo = () => get('/userInfo');
export const postProjectDetails = (id: number) => post('/projectDetails', { id });