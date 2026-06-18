package com.secretdialer.app.models

sealed class Events {
    data object RefreshCallLog : Events()
}
