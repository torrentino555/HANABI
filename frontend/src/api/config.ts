import axios from 'axios'


export const CONTEXT = 'http://localhost:8080';

axios.defaults.withCredentials = true;

export const post = (url: string, values?: any) => axios.post(CONTEXT + url, values);
export const get = (url: string) => axios.get(CONTEXT + url);