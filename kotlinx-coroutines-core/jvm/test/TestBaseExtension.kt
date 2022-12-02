/*
 * Copyright 2016-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */
package kotlinx.coroutines

public actual fun TestBase.runMtTest(
    expected: ((Throwable) -> Boolean)?,
    unhandled: List<(Throwable) -> Boolean>,
    block: suspend CoroutineScope.() -> Unit
): TestResult = runTest(expected, unhandled, block)
