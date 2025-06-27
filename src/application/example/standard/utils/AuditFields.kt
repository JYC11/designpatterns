package application.example.standard.utils

import java.time.LocalDate
import java.util.UUID

abstract class AuditFields(
    @Id
    var id: UUID = UUID.randomUUID(),
    var createdDate: LocalDate = LocalDate.now(),
    var modifiedDate: LocalDate? = null,
) {
}