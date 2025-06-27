package application.example.standard.entity

import application.example.standard.enums.LateFeeAccrualRate
import application.example.standard.enums.LateFeeAccrualMethod
import application.example.standard.utils.AuditFields
import application.example.standard.utils.Entity

@Entity
class LateFeePolicy(
    var gracePeriod: Int,
    var amount: Double,
    var accrualRate: LateFeeAccrualRate,
    var method: LateFeeAccrualMethod,
) : AuditFields() {

}