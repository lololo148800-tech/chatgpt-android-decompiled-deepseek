package p817j$.time;

import p817j$.time.temporal.ChronoUnit;

/* JADX INFO: renamed from: j$.time.l */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15612l {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48733a;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f48733a = iArr;
        try {
            iArr[ChronoUnit.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48733a[ChronoUnit.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48733a[ChronoUnit.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f48733a[ChronoUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f48733a[ChronoUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f48733a[ChronoUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f48733a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
