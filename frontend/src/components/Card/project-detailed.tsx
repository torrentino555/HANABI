import React, { useEffect } from 'react';
import { getProjectDetails } from "../../actions";

interface Props {
    projectId: number
}

export function ProjectDetailed({ projectId }: Props) {
    useEffect(() => {
        getProjectDetails(projectId);
    }, [ projectId ]);

    return (
        <div>
            Детальная инфорация
        </div>
    );
}