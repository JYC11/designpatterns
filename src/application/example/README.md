🟡 1. Draft

    Description: Initial state. The invoice is being composed.

    Editable: Yes — items, amounts, and metadata can be changed.

    Transition Rules:

        Can only transition to Validated if:

            It has at least one line item.

            The total is positive.

            The customer information is present.

        Cannot be sent or paid in this state.


✅ 2. Validated

    Description: Invoice passed validation checks and is ready to send.

    Editable: No — contents are now locked.

    Transition Rules:

        Can transition to Sent.

        Can transition back to Draft for revision (optional business rule).

        Cannot be paid or canceled.


📤 3. Sent

    Description: Invoice has been issued to the customer.

    Editable: No — locked for auditing.

    Transition Rules:

        Can transition to:

            Paid — payment successfully recorded.

            Canceled — canceled before payment.

            Overdue — not paid within due date.

        Can trigger reminders if not paid.

        Cannot be modified.


💰 4. Paid

    Description: Full payment has been received.

    Editable: No.

    Transition Rules:

        Final state.

        Cannot transition further.

        Cannot be canceled or marked overdue.


❌ 5. Canceled

    Description: Invoice was invalidated or intentionally voided.

    Editable: No.

    Transition Rules:

        Final state.

        Cannot be paid, sent again, or edited.

        May trigger audit log entries or require approvals based on role.


⌛ 6. Overdue

    Description: Invoice was not paid before its due date.

    Editable: No.

    Transition Rules:

        Can transition to Paid if payment is received late.

        Can transition to Canceled if written off.

        May be escalated to collections, or accrue penalties.


📬 Additional Business Rules
Reminders

    Can only be sent while invoice is in the Sent or Overdue state.

    Should not be sent to Paid or Canceled invoices.

Role Permissions

    Finance Manager can cancel, approve payments.

    Customer Support can send invoices and reminders.

    System Job can mark overdue invoices based on time rules.


💸 Late Fee Business Rules
🔁 1. When Late Fees Apply

    Trigger: An invoice becomes overdue after the due date passes and payment has not been received.

    Grace Period: There may be a grace period (e.g. 5 days) after the due date before late fees begin.

    Effective Date: Late fee accrual starts from the day after the grace period ends.


🧮 2. How Late Fees Are Calculated

There are typically two models, depending on the business contract:
A. Flat Fee Model

    Fixed amount per late period (e.g., per week or per month).

    Example: $25 every 7 days past the grace period.

B. Percentage Model

    Percentage of the outstanding balance.

    Example: 2% of unpaid total per 30 days overdue.

    Optionally:

        Compounded monthly (fee adds to balance)

        Simple interest (fee calculated on original amount)

C. Hybrid Model

    Flat fee + percentage per period.


🕐 3. Timing Rules

    Frequency: Late fees accrue on a fixed interval (e.g., daily, weekly, monthly).

    Minimum Days Late: Some businesses only apply a fee after n full days.

    Rounding Rules:

        Round partial intervals up to next full period.

        Or charge proportionally.


🚫 4. When Late Fees Should Not Be Applied

    Invoice is canceled or disputed.

    Customer is under manual exemption (e.g., VIP status, hardship plan).

    Invoice has a pause or hold status (e.g., active complaint).

    Grace period not yet ended.

    Customer is actively in a payment plan.


🧾 5. Accounting and Visibility

    Late fees must be:

        Visible on the invoice.

        Logged with a timestamp and reason.

        Itemized separately (not silently rolled into the amount due).

    Late fees should be reversible if applied in error or waived manually.


🧑‍💼 6. Manual Overrides and Waivers

    Authorized roles (e.g., Finance Manager) can:

        Waive all or part of late fees.

        Adjust fee rates for a specific customer.

        Pause accrual under review.

    These actions must be:

        Logged (who, when, why).

        Justified (reason code or note).