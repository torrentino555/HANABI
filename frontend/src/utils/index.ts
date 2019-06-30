export function empty() {}

export const selectors = (...args: Function[]) => (state: any) => args.map(selector => selector(state));

export function getDataFromResponse(response: any) {
    const { responseStatus, message, status, ...data } = response.data;
    return data;
}


export const Routes = {
    COMPANY : "/company",
    MENTOR: "/mentor",

};