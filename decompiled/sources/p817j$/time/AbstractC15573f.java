package p817j$.time;

import p817j$.time.temporal.ChronoUnit;

/* JADX INFO: renamed from: j$.time.f */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15573f {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48614a;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f48614a = iArr;
        try {
            iArr[ChronoUnit.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48614a[ChronoUnit.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48614a[ChronoUnit.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f48614a[ChronoUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f48614a[ChronoUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f48614a[ChronoUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f48614a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
