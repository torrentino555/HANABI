import cn from "classnames";
import React, { useState } from 'react';
import { Modal } from "semantic-ui-react";

import ArtemAva from '../../images/avatar.png';
import LepaAva from '../../images/lepa.svg';
import addButton from '../../images/icons/plus.png';
import editIcon from '../../images/icons/edit.svg';
import messageIcon from '../../images/icons/message.svg';
import deleteIcon from '../../images/icons/delete.svg';
import cheatAdd from '../../images/cheat.png';

export default function DevTeam(props: any) {
    const [ isModalOpen, setIsModalOpen ] = useState(false);

    const team = [
        {
            id: 0,
            avatar: undefined,
            name: 'Name',
            position: 'Position',
            competence: 'Competence',
            employment: 'Employment'
        },
        {
            id: 1,
            avatar: ArtemAva,
            name: 'Iliya Lepa',
            position: 'Menthor',
            competence: 'Java',
            employment: '3 projects'
        },
        {
            id: 2,
            avatar: LepaAva,
            name: 'Artem Galimyanov',
            position: 'Junior',
            competence: 'HTML5/CSS3',
            employment: '1 project'
        }
    ];

    return (
        <div className="project-list">
            <div className="project-list__title">
                Development team
            </div>
            <div className="project-list__container">
                {
                    team.map(item => {
                        return (
                            <div className="mentor-dev-team" key={item.id}>
                                {
                                    item.avatar && <img className="mentor-dev-team__avatar" alt="avatar" src={ item.avatar } />
                                }
                                <div className="mentor-dev-team__name">
                                    { item.name }
                                </div>
                                <div className="mentor-dev-team__position">
                                    { item.position }
                                </div>
                                <div className="mentor-dev-team__competence">
                                    { item.competence }
                                </div>
                                <div className="mentor-dev-team__employment">
                                    { item.employment }
                                </div>
                                <div className="mentor-dev-team__actions">
                                    {
                                        item.id === 0 ? "Actions" :
                                            [ messageIcon, editIcon, deleteIcon ].map((item, i) => {
                                                return (
                                                    <img key={i} src={item} alt="action" className="mentor-dev-team__action"/>
                                                );
                                            })
                                    }
                                </div>
                            </div>
                        );
                    })
                }
            </div>
            <Modal
                open={ isModalOpen }
                trigger={
                <div className="mentor-dev-team__add-list" onClick={() => setIsModalOpen( true)}>
                    <img src={ addButton } alt="add-button" className="icon mentor-dev-team__add-button" />
                    <div className="mentor-dev-team__add-text">
                        Add developer
                    </div>
                </div>
            }>
                <div className="mentor-dev-team__relative">
                    <img src={ cheatAdd } alt="add" className="mentor-dev-team__add-img" />
                    <div className="mentor-dev-team__big-add-button" onClick={ () => setIsModalOpen(false) }>
                        ADD
                    </div>
                    <div className="mentor-dev-team__add-dev-text">
                        Add developer
                    </div>
                    <div className="icon mentor-dev-team__back-icon" onClick={() => setIsModalOpen(false)}/>
                </div>
            </Modal>
        </div>
    );
}