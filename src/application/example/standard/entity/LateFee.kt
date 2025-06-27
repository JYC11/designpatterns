package application.example.standard.entity

import application.example.standard.enums.LateFeeStatus
import application.example.standard.utils.AuditFields
import application.example.standard.utils.Entity

@Entity
class LateFee(
    var amount: Double,
    var paidAmount: Double,
    var remainingAmount: Double,
    var status: LateFeeStatus,
    var reason: String,
) : AuditFields() {
}