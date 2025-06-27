package application.example.standard.entity

import application.example.standard.utils.AuditFields
import application.example.standard.utils.Entity


@Entity
class InvoiceItem(
    var name: String,
    var description: String,
    var amount: Double,
    var paidAmount: Double,
    var remainingAmount: Double,
) : AuditFields()  {
}