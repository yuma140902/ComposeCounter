package yuma140902.android.composecounter.screen.main

sealed class MainEvent
object OnClickCountUpEvent : MainEvent()
object OnClickResetEvent : MainEvent()