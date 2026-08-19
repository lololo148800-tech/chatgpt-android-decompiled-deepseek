package p817j$.time.chrono;

import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.chrono.E */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15540E {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48551a;

    static {
        int[] iArr = new int[EnumC15621a.values().length];
        f48551a = iArr;
        try {
            iArr[EnumC15621a.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48551a[EnumC15621a.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48551a[EnumC15621a.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
