package ch;

import com.revenuecat.purchases.PackageType;

/* JADX INFO: renamed from: ch.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC11747a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f35628a;

    static {
        int[] iArr = new int[PackageType.values().length];
        try {
            iArr[PackageType.LIFETIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PackageType.ANNUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PackageType.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PackageType.WEEKLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f35628a = iArr;
    }
}
