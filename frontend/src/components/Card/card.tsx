import React, { Fragment } from 'react';
import { useSelector } from "react-redux";

import { selectCardState } from "../../selectors";
import { About } from "./about";
import { CardHeader } from "./card-header";
import { CompletedProjects } from "./completed-projects";
import { CurrentProjects } from "./current-projects";
import './card.css';

interface Props {

}

export enum CardState {
    CURRENT_PROJECTS,
    COMPLETED_PROJECTS,
    ABOUT
}

export function Card(props: Props) {
    const cardState: CardState = useSelector(selectCardState);

    if (cardState == CardState.CURRENT_PROJECTS) {
        return (
            <div className="card">
                <CardHeader />
                <CurrentProjects />
            </div>
        );
    }

    if (cardState == CardState.COMPLETED_PROJECTS) {
        return (
            <div className="card">
                <CardHeader />
                <CompletedProjects />
            </div>
        )
    }

    if (cardState == CardState.ABOUT) {
        return (
            <div className="card">
                <CardHeader />
                <About />
            </div>
        )
    }

    return null;
}