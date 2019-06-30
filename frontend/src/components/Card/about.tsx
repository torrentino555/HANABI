import React, { Fragment } from 'react';
import Button from "../../common/Button";
import { ProjectDetailed } from "./project-detailed";

export function About(props: any) {
    return (
        <div className="project-list">
            <div className="project-list__title">
                Description
            </div>
            <div className="project-list__container project-list__standart-text">
                Since its founding in 2007, Sansan has been focused on providing alternative and original contact management solutions using business cards as building blocks.<br/><br/>
                With its eponymous B2B product, and later with its B2C equivalent, Eight, Sansan has been leading the way in cloud-based contact management in Japan.<br/><br/>
                With a user base doubling in number each year,<br/>
                Sansan now has over 6000* corporate customers, including the Japanese government.<br/><br/>
                Based in Tokyo, Sansan also has a subsidiary, Sansan Global PTE. Ltd., in Singapore.<br/>
            </div>
        </div>
    );
}