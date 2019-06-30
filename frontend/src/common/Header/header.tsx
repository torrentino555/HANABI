import * as React from 'react';
import { useSelector } from "react-redux";
import logo from "../../images/logo.png";
import avatar from "../../images/avatar.png";
import socials from "../../images/social-info.png";

import './header.css'
import { selectUserNickname } from "../../selectors";
import Button from "../Button/button";


export default function Header() {
    const nickname  = useSelector(selectUserNickname);

    return (
        <header>
            <div className="header-first">
                <div className="icon header-first__dropdown-icon" />
                <img src={ logo } alt="logo" className="header-first__logo-img"/>
                <div className="icon header-first__search-icon" />
                <Button className="header-first__button-sign-in">
                    Sign in
                </Button>
                <Button className="header-first__button-sign-up">
                    Sign up
                </Button>
            </div>
            <div className="header-second">
                <div className="header-second__blue-back"/>
                <div className="header-second__user-info">
                    <img src={ avatar } alt="avatar" className="header-second__avatar"/>
                    <div className="header-second__info">
                        <div className="header-second__nick">
                            { nickname }
                        </div>
                        <img src={ socials } alt="social-info" className="header-second__socials"/>
                    </div>
                </div>
            </div>
        </header>
    );
}