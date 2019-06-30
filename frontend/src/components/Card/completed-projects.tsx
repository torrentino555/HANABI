import React from 'react';
import { useSelector } from "react-redux";
import { selectUserCompletedProjects } from "../../selectors";
import { ProjectList } from "./project-list";

export function CompletedProjects(props: any) {
    const list = useSelector(selectUserCompletedProjects);

    return <ProjectList list={ list }/>
}