package io.sentry.android.core;

import io.sentry.EnumC15112C;

/* JADX INFO: renamed from: io.sentry.android.core.q */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC15253q {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f47620a;

    static {
        int[] iArr = new int[EnumC15112C.values().length];
        f47620a = iArr;
        try {
            iArr[EnumC15112C.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f47620a[EnumC15112C.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f47620a[EnumC15112C.NO_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
