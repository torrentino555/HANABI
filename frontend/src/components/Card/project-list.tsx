import React, { Fragment } from 'react';
import { IProjectList } from "../../api";
import Button from "../../common/Button";
import { ProjectDetailed } from "./project-detailed";

interface Props {
    list: Array<IProjectList>
}

export function ProjectList({ list }: Props) {
    return (
        <div className="project-list">
            <div className="project-list__title">
                List of projects
            </div>
            <div className="project-list__container">
                {
                    list.map(item => {
                        return (
                            <Fragment>
                                <div className="project-list__list" key={item.id}>
                                    <div className="project-list__title-list">
                                        { item.title }
                                    </div>
                                    <div className="project-list__count">
                                        Number of contractors - { item.countOfActiveTeams }
                                    </div>
                                    <Button className="project-list__detail">
                                        Detail
                                    </Button>
                                    <div className="project-list__tags">
                                        {
                                            item.tags.map((item, i) => {
                                                return (
                                                    <Button className="project-list__tags-item" key={i}>
                                                        { item }
                                                    </Button>
                                                );
                                            })
                                        }
                                    </div>
                                </div>
                                {
                                    item.detailed && (
                                        <ProjectDetailed projectId={item.id}/>
                                    )
                                }
                            </Fragment>
                        );
                    })
                }
            </div>
        </div>
    );
}