package p247Jj;

import p342Nj.EnumC5810d;
import p342Nj.EnumC5811e;

/* JADX INFO: renamed from: Jj.n */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4444n {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f14468a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f14469b;

    static {
        int[] iArr = new int[EnumC5810d.values().length];
        try {
            iArr[EnumC5810d.REQUIRE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC5810d.OPTIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC5810d.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14468a = iArr;
        int[] iArr2 = new int[EnumC5811e.values().length];
        try {
            iArr2[EnumC5811e.PRECISE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC5811e.ROUGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f14469b = iArr2;
    }
}
