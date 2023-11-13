package com.tyganeutronics.myratecalculator.database.contract

/* Inner class that defines the table contents */
object RatesContract {

    const val TABLE_NAME = "rates"

    //dates
    const val COLUMN_NAME_CURRENCY = "currency"
    const val COLUMN_NAME_NAME = "name"
    const val COLUMN_NAME_URL = "url"
    const val COLUMN_NAME_LAST_RATE = "last_rate"
    const val COLUMN_NAME_RATE = "rate"
    const val COLUMN_NAME_CURRENCY_BASE = "currency_base"

    // Extra
    const val COLUMN_NAME_PINNED = "pinned"
    const val COLUMN_NAME_LAST_UPDATED = "last_updated"
    const val COLUMN_NAME_LAST_CHECKED = "last_checked"
}