import React from 'react';
import { useSelector } from "react-redux";
import { selectUserCurrentProjects } from "../../selectors";
import { ProjectList } from "./project-list";

export function CurrentProjects(props: any) {
    const list = useSelector(selectUserCurrentProjects);

    return <ProjectList list={ list }/>
}