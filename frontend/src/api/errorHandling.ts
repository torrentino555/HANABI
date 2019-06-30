import { isNil } from "ramda"

interface ResponseData {
    responseStatus: string
    message: string
}

export const assertResponse = (response: any) => {
    if (isNil(response))
        throw new Error('Неизвестная ошибка сети.');

    if (response.status !== 200)
        throw new Error('Неуспешный запрос. Код состояния HTTP: ' + response.status);

    const responseData: ResponseData = response.data;

    if (responseData.responseStatus === "FAILURE")
        throw new Error(responseData.message)
};