package application.techniques

interface SmtpClient

class DatabaseConnection

class ReportGenerator(private val db: DatabaseConnection) {
    fun generate() {
        // generate report
    }
}

class EmailSender(private val smtp: SmtpClient) {
    fun send() {
        // send email
    }
}

class AdminCapabilities(val reportGen: ReportGenerator, val emailSender: EmailSender)

fun generateMonthlyReport(cap: AdminCapabilities) {
    cap.reportGen.generate()
    cap.emailSender.send()
}
