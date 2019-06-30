import cn from 'classnames';
import React from 'react';
import { useSelector } from "react-redux";
import { setCardState } from "../../actions";
import { selectCardState } from "../../selectors";
import { CardState } from "./card";


export function CardHeader() {
    const state: CardState = useSelector(selectCardState);

    return (
        <div className="card-header">
            {
                [
                    [ 'Current projects', CardState.CURRENT_PROJECTS ],
                    [ 'Completed projects', CardState.COMPLETED_PROJECTS ],
                    [ 'About', CardState.ABOUT ] ].map((item, i) => {
                    return (
                        <div key={i}
                            className={ cn("card-header__item", {
                                "card-header__item_active": state === item[1]
                            }) }
                            onClick={ () => setCardState({ state: item[1] })}
                        >
                            { item[0] }
                        </div>
                    );
                })
            }
        </div>
    );
}