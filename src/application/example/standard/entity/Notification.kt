package application.example.standard.entity

import application.example.standard.utils.AuditFields
import application.example.standard.utils.Entity

@Entity
class Notification(
    var isReminder: Boolean,
    var title: String,
    var content: String,
) : AuditFields() {
}