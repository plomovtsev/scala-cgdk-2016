package model

/**
 * Магический статус, влияющий на живого юнита.
 * @param id Возвращает уникальынй идентификатор статуса.
 * @param type Возвращает тип магического статуса.
 * @param wizardId Возвращает идентификатор волшебника, наложившего данный статус, или {code -1}.
 * @param playerId Возвращает идентификатор игрока, волшебник которого наложил данный статус, или {code -1}.
 * @param remainingDurationTicks Возвращает оставшуюся длительность действия статуса.
 */
class Status(val id: Long,
             val `type`: StatusType,
             val wizardId: Long,
             val playerId: Long,
             val remainingDurationTicks: Int)
