package p817j$.time;

import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.p */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC15616p {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f48742a;

    /* JADX INFO: renamed from: b */
    static final /* synthetic */ int[] f48743b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f48743b = iArr;
        try {
            iArr[ChronoUnit.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48743b[ChronoUnit.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48743b[ChronoUnit.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f48743b[ChronoUnit.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f48743b[ChronoUnit.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[EnumC15621a.values().length];
        f48742a = iArr2;
        try {
            iArr2[EnumC15621a.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f48742a[EnumC15621a.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f48742a[EnumC15621a.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
