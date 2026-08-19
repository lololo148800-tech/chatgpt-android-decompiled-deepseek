package io.sentry.exception;

import io.sentry.protocol.C15437j;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.exception.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15351a extends RuntimeException {

    /* JADX INFO: renamed from: Y */
    public final C15437j f47930Y;

    /* JADX INFO: renamed from: Z */
    public final Throwable f47931Z;

    /* JADX INFO: renamed from: o0 */
    public final Thread f47932o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f47933p0;

    public C15351a(C15437j c15437j, Throwable th2, Thread thread, boolean z6) {
        this.f47930Y = c15437j;
        AbstractC8483G3.m9133c(th2, "Throwable is required.");
        this.f47931Z = th2;
        AbstractC8483G3.m9133c(thread, "Thread is required.");
        this.f47932o0 = thread;
        this.f47933p0 = z6;
    }
}
