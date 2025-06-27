package application.example.standard.entity

import application.example.standard.enums.InvoiceStatus
import application.example.standard.utils.AuditFields
import application.example.standard.utils.Entity
import application.example.standard.utils.ManyToOne
import application.example.standard.utils.OneToMany
import application.example.standard.utils.OneToOne
import java.time.LocalDate


@Entity
class Invoice(
    var status: InvoiceStatus,
    var dueDate: LocalDate?,
    var sentDate: LocalDate?,
    var amount: Double,
    var paidAmount: Double,
    var remainingAmount: Double,
    var lateFeeAmount: Double,
    var paidLateFeeAmount: Double,
    var remainingLateFeeAmount: Double,
    @ManyToOne
    var customer: User,
    @OneToOne
    var reviewer: User?,
    @OneToOne
    var lateFeePolicy: LateFeePolicy?,
    @OneToMany
    var items: MutableList<InvoiceItem>,
    @OneToMany
    var lateFees: MutableList<LateFee>,
    @OneToMany
    var notifications: MutableList<Notification>,
) : AuditFields() {
}

