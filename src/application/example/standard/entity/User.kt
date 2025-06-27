package application.example.standard.entity

import application.example.standard.enums.UserRole
import application.example.standard.utils.AuditFields
import application.example.standard.utils.Entity

@Entity
class User(
    var name: String,
    var role: UserRole,
) : AuditFields() {
}