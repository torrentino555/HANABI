import React, { Fragment, useState } from 'react';
import cn from 'classnames';
import { Modal } from "semantic-ui-react";

import Button from "../../common/Button";
import cheatAdd from "../../images/cheat2.png";
import { CardHeader } from "../Card/card-header";
import '../Card/card.css';
import './mentor.css';
import Detail from "./Detail";
import DevTeam from "./team";


export default function MentorProjectsList(props: any) {
    const [ isDetailOpen, setIsDetailOpen ] = useState(false);
    const [ isModalOpen, setIsModalOpen ] = useState(false);

    const list = [
        {
            id: 1,
            title: 'Web service for "Sansan"',
            progress: 90
        },
        {
            id: 2,
            title: 'Weather monitor',
            progress: 80
        },
        {
            id: 3,
            title: 'Website for a tech startup',
            progress: 40
        },
    ];

    return (
        <div className="mentor">
            <CardHeader/>
            <div className="project-list">
                <div className="project-list__title">
                    List of projects
                    <div className="icon mentor__right-plus-button" onClick={ () => setIsModalOpen(true) } />
                </div>
                <div className="project-list__container">
                    {
                        list.map(item => {
                            return (
                                <div className="project-list__list" key={item.id}>
                                    <div className="project-list__title-list">
                                        { item.title }
                                    </div>
                                    <div className="project-list__count mentor__progress-back">
                                        <div className={cn("mentor__progress-front", {
                                            "mentor__progress-front_green": item.progress >= 75,
                                            "mentor__progress-front_yellow": item.progress < 75 && item.progress >= 30,
                                            "mentor__progress-front_red": item.progress < 30
                                        })} style={{ width: item.progress + '%' }} />
                                    </div>
                                    <Button className="project-list__detail" onClick={() => setIsDetailOpen(!isDetailOpen)}>
                                        Detail
                                    </Button>
                                </div>
                            );
                        })
                    }
                </div>
            </div>
            {
                isDetailOpen && (
                    <Fragment>
                        <Detail/>
                        <DevTeam/>
                    </Fragment>
                )
            }
            <Modal
                open={ isModalOpen }
                trigger={
                    <div className="icon mentor__right-plus-button" onClick={ () => setIsModalOpen(true) } />
                }>
                <div className="mentor-dev-team__relative">
                    <img src={ cheatAdd } alt="add" className="mentor-dev-team__add-img" />
                    <div className="mentor-dev-team__big-add-button" onClick={ () => setIsModalOpen(false) }>
                        ADD
                    </div>
                    <div className="mentor-dev-team__add-dev-text">
                        Add project
                    </div>
                    <div className="mentor-dev-team__description-text">
                        As autonomous cars and robots loom over the landscapes of cities and jobs alike, the technologies that empower them are forming sub-industries of their own. One of those is lidar, which has become an indispensable tool to autonomy, spawning dozens of companies and attracting hundreds of millions in venture funding.
                    </div>
                    <div className="icon mentor-dev-team__back-icon" onClick={() => setIsModalOpen(false)}/>
                </div>
            </Modal>
        </div>
    );
}