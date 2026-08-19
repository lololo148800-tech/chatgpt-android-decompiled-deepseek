package io.sentry.android.core.internal.gestures;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC15221c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f47486a;

    static {
        int[] iArr = new int[EnumC15222d.values().length];
        f47486a = iArr;
        try {
            iArr[EnumC15222d.Click.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f47486a[EnumC15222d.Scroll.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f47486a[EnumC15222d.Swipe.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f47486a[EnumC15222d.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
