package p817j$.time.chrono;

import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.chrono.v */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15566v {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48599a;

    static {
        int[] iArr = new int[EnumC15621a.values().length];
        f48599a = iArr;
        try {
            iArr[EnumC15621a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48599a[EnumC15621a.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48599a[EnumC15621a.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f48599a[EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f48599a[EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f48599a[EnumC15621a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f48599a[EnumC15621a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f48599a[EnumC15621a.ERA.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f48599a[EnumC15621a.YEAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
