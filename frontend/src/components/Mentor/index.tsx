import React, { Fragment, useEffect } from 'react';
import { initProfile } from "../../actions";
import Header from "../../common/Header/header";
import MentorProjectsList from "./mentor-projects-list";

export default function Mentor(props: any) {
    useEffect(() => {
        initProfile();
    }, []);

    return (
        <Fragment>
            <Header/>
            <MentorProjectsList />
        </Fragment>
    );
}