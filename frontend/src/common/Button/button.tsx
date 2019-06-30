import * as React from 'react';
import cn from 'classnames'

import './button.css';

interface Props {
    className?: string
    onClick?: Function
    children?: any
    disabled?: boolean
}

export default function Button(props: Props) {
    const { children, className, onClick, disabled } = props;

    return (
        <button
            disabled={disabled}
            className={ cn("simple-button", className) }
            onClick={ (e: any) => {
                e.target.blur();
                onClick && onClick(e);
            } }
        >
            { children }
        </button>
    );
}