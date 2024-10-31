package kotlinx.coroutines

import kotlin.native.concurrent.*
import kotlin.native.internal.test.*
import kotlin.system.*

// This is a separate entry point for tests in background
fun mainBackground(args: Array<String>) {
    val worker = Worker.start(name = "main-background")
    worker.execute(TransferMode.SAFE, { args }) {
        val result = testLauncherEntryPoint(it)
        exitProcess(result)
    }.result // block main thread
}
