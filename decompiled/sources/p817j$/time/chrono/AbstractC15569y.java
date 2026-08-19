package p817j$.time.chrono;

import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.chrono.y */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15569y {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48609a;

    static {
        int[] iArr = new int[EnumC15621a.values().length];
        f48609a = iArr;
        try {
            iArr[EnumC15621a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48609a[EnumC15621a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48609a[EnumC15621a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
