import cn from "classnames";
import React, { Fragment } from 'react';
import Button from "../../common/Button";

export default function Detail(props: any) {
    const tasks = [
        {
            id: 0,
            title: 'Task',
            responsibility: 'Responsibility',
            competence: 'Competence',
            date: 'Key dates'
        },
        {
            id: 1,
            title: 'Visual design webpages',
            responsibility: 'Galimyanov A.',
            competence: 'HTML5/CSS3',
            date: '21.04.2019'
        },
        {
            id: 2,
            title: 'Frontend development',
            responsibility: 'Orlov V.',
            competence: 'HTML5/CSS3, JS',
            date: '15.05.2019'
        },
        {
            id: 3,
            title: 'Database development',
            responsibility: 'Galimyanov A.',
            competence: 'SQL',
            date: '02.06.2019'
        },
        {
            id: 4,
            title: 'Backend development',
            responsibility: 'Lepa I.',
            competence: 'Java',
            date: '07.06.2019'
        },
    ];

    return (
        <div className="project-list">
            <div className="project-list__title">
                Web service for "Sansan"
            </div>
            <div className="project-list__container">
                {
                    tasks.map((item, i) => {
                        return (
                            <Fragment key={item.id}>
                                <div className={cn("mentor-detail__list", {
                                    "mentor-detail__first": i === 0
                                })} key={ item.id }>
                                    <div className="mentor-detail__task">
                                        { item.title }
                                    </div>
                                    <div className="mentor-detail__responsibility">
                                        { item.responsibility }
                                    </div>
                                    <div className="mentor-detail__competence">
                                        { item.competence }
                                    </div>
                                    <div className="mentor-detail__date">
                                        { item.date }
                                    </div>
                                </div>
                                {
                                    i === 0 && <div className="mentor-detail__hr" />
                                }
                            </Fragment>
                        );
                    })
                }
            </div>
        </div>
    );
}