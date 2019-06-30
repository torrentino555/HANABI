import axios from "axios";
import MockAdapter from "axios-mock-adapter";
import { CONTEXT } from "./config";


const mock = new MockAdapter(axios);


mock.onGet(CONTEXT + '/userInfo').reply(200, {
    nickname: '@Artem',
    currentProjects: [
        {
            id: 1,
            title: 'Web service for "Sansan"',
            countOfActiveTeams: 3,
            tags: ['WEB', 'OS', 'Desktop']
        },
        {
            id: 2,
            title: 'Weather monitor',
            countOfActiveTeams: 5,
            tags: [ 'WEB', 'Console' ]
        }
    ],
    completedProjects: [
        {
            id: 1,
            title: 'Weather monitor',
            countOfActiveTeams: 3,
            tags: [ 'Embedded', 'Desktop' ]
        },
        {
            id: 2,
            title: 'Create smart analyzer',
            countOfActiveTeams: 10,
            tags: [ 'WEB', 'OS', 'Desktop' ]
        },
        {
            id: 3,
            title: 'Write Single Page Application for out company',
            countOfActiveTeams: 3,
            tags: [ 'WEB' ]
        }
    ],
    description: "Компания такая то такая то",
    responseStatus: 'SUCCESS',
    message: ''
});