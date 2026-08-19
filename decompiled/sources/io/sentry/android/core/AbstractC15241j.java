package io.sentry.android.core;

import io.sentry.EnumC15375i1;

/* JADX INFO: renamed from: io.sentry.android.core.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC15241j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f47567a;

    static {
        int[] iArr = new int[EnumC15375i1.values().length];
        f47567a = iArr;
        try {
            iArr[EnumC15375i1.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f47567a[EnumC15375i1.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f47567a[EnumC15375i1.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f47567a[EnumC15375i1.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f47567a[EnumC15375i1.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
