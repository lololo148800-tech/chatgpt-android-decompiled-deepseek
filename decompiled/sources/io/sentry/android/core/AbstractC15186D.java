package io.sentry.android.core;

import io.sentry.EnumC15112C;

/* JADX INFO: renamed from: io.sentry.android.core.D */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC15186D {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f47311a;

    static {
        int[] iArr = new int[EnumC15112C.values().length];
        f47311a = iArr;
        try {
            iArr[EnumC15112C.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f47311a[EnumC15112C.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
