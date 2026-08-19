package io.sentry.android.core;

import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* JADX INFO: renamed from: Y */
    public final Thread f47303Y;

    public ApplicationNotResponding(Thread thread, String str) {
        super(str);
        AbstractC8483G3.m9133c(thread, "Thread must be provided.");
        this.f47303Y = thread;
        setStackTrace(thread.getStackTrace());
    }
}
