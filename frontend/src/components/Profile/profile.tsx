import React, { Fragment, useEffect } from 'react';
import { initProfile } from "../../actions";
import Header from "../../common/Header";
import { Card } from "../Card";

export default function Profile(props: any) {
    useEffect(() => {
        initProfile();
    }, []);

    return (
        <Fragment>
            <Header/>
            <Card/>
        </Fragment>
    );
}