package com.secretdialer.app.interfaces

interface RefreshItemsListener {
    fun refreshItems(invalidate: Boolean = false, callback: (() -> Unit)? = null)
}
