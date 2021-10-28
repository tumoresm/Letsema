package com.example.letsema

import java.math.BigDecimal
import java.time.LocalDateTime

data class Tender(val tenderId: String, val title: String, val contactPerson: String,)

data class TenderDetails(var tender: Tender, var budget: BigDecimal, var description: String,
                    var openDate: LocalDateTime, var closeDate: LocalDateTime)