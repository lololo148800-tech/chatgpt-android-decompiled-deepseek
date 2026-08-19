package p817j$.time;

import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.r */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15618r {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48746a;

    /* JADX INFO: renamed from: b */
    static final /* synthetic */ int[] f48747b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f48747b = iArr;
        try {
            iArr[ChronoUnit.MONTHS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48747b[ChronoUnit.YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48747b[ChronoUnit.DECADES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f48747b[ChronoUnit.CENTURIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f48747b[ChronoUnit.MILLENNIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f48747b[ChronoUnit.ERAS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[EnumC15621a.values().length];
        f48746a = iArr2;
        try {
            iArr2[EnumC15621a.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f48746a[EnumC15621a.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f48746a[EnumC15621a.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f48746a[EnumC15621a.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f48746a[EnumC15621a.ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
