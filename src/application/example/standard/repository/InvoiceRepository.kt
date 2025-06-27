package application.example.standard.repository

import application.example.standard.entity.Invoice
import application.example.standard.utils.Repository
import java.util.UUID

interface InvoiceRepository : Repository<Invoice, UUID> {
    fun getOneOrRaise(id: UUID): Invoice

    fun getAll(): List<Invoice>

    fun save(invoice: Invoice)

    fun delete(invoice: Invoice)
}