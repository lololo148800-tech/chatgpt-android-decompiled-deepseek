package p817j$.time;

import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.k */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15611k {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48732a;

    static {
        int[] iArr = new int[EnumC15621a.values().length];
        f48732a = iArr;
        try {
            iArr[EnumC15621a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48732a[EnumC15621a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
