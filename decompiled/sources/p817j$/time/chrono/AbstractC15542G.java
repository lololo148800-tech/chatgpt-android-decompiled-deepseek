package p817j$.time.chrono;

import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.chrono.G */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15542G {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48553a;

    static {
        int[] iArr = new int[EnumC15621a.values().length];
        f48553a = iArr;
        try {
            iArr[EnumC15621a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48553a[EnumC15621a.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48553a[EnumC15621a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f48553a[EnumC15621a.YEAR_OF_ERA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f48553a[EnumC15621a.PROLEPTIC_MONTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f48553a[EnumC15621a.YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f48553a[EnumC15621a.ERA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
