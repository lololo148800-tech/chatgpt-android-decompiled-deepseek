package p817j$.time;

import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.u */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15640u {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48804a;

    static {
        int[] iArr = new int[EnumC15621a.values().length];
        f48804a = iArr;
        try {
            iArr[EnumC15621a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48804a[EnumC15621a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
