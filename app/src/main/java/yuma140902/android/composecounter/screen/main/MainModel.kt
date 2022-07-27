package yuma140902.android.composecounter.screen.main

data class MainModel(
    val counter: Int
) {
    companion object {
        val initValue = MainModel(counter = 0)
    }
}