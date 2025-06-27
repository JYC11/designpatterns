package application.example.standard.service

import application.example.standard.repository.InvoiceRepository
import application.example.standard.utils.Service
import application.example.standard.utils.Transactional

@Service
@Transactional
class InvoiceService(
    private val repository: InvoiceRepository
) {
    fun createInvoice() {}

    fun updateInvoice() {}

    fun validateInvoice() {}

    fun sendInvoice() {}

    fun payInvoice() {}

    fun cancelInvoice() {}

    fun addLateFee() {}

    fun updateLateFee() {}

    fun removeLateFee() {}

    fun sendReminder() {}

    fun deleteInvoice() {}
}