package p817j$.time;

import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.c */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15535c {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48544a;

    /* JADX INFO: renamed from: b */
    static final /* synthetic */ int[] f48545b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f48545b = iArr;
        try {
            iArr[ChronoUnit.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48545b[ChronoUnit.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48545b[ChronoUnit.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f48545b[ChronoUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f48545b[ChronoUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f48545b[ChronoUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f48545b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f48545b[ChronoUnit.DAYS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[EnumC15621a.values().length];
        f48544a = iArr2;
        try {
            iArr2[EnumC15621a.NANO_OF_SECOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f48544a[EnumC15621a.MICRO_OF_SECOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f48544a[EnumC15621a.MILLI_OF_SECOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f48544a[EnumC15621a.INSTANT_SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
