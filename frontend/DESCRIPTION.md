###/tasksByTags
Получение списка заданий для ментора по тегу

Посылаю:

    {
        tags: [ 'OS', 'CONSOLE' ]
    }

Ответ:

    {
        tasks: [ {
            id: number,
            title: string,
            description: string,
            countOfActiveTeams: number,
        } ]
    }

###/juniorsBySkills
Получение списка джуниоров для формирования команды

Посылаю:

    {
        skills: [ 'JAVASCRIPT', "TYPESCRIPT', 'JAVA', 'GO', 'SWIFT' ]
    }
    
Ответ:

    {
        juniors: [ {
            id: number,
            fullName: string,
            avgLevel: number
        } ]
    }
    
###/progressByRoomId

Получение прогресса в процентах по ***roomId***

Посылаю:

    {
        roomId: number
    }
    
Ответ:

    {
        progress: number (от 0 до 100)
    }


###/changeProgress

Изменение значения прогресса

Посылаю:

    {
        progress: number ( от 0 до 100)
    }    

## Запросы для комнаты ##
* получение списка джунов
* получение списка задач
* получение статуса прогресса
* изменение статуса прогресса


Ментор начинает менторвать:
* Выбирает теги задач
* Получает список задач по тегу
* Формирует технологический стек для junior-ов
* Получает список профилей
* Формирует команду
* Создаёт задачи в комнате проекта
* Меняет статус прогресса