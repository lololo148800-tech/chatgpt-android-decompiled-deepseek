package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11873G0 extends TimeoutException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
