package p1081wc;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wc.q */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20898q {

    /* JADX INFO: renamed from: Y */
    public static final EnumC20898q f66612Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC20898q f66613Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC20898q f66614o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC20898q[] f66615p0;

    static {
        EnumC20898q enumC20898q = new EnumC20898q("Menu", 0);
        f66612Y = enumC20898q;
        EnumC20898q enumC20898q2 = new EnumC20898q("ScreenshotPrompt", 1);
        f66613Z = enumC20898q2;
        EnumC20898q enumC20898q3 = new EnumC20898q("ScreenshotDirect", 2);
        f66614o0 = enumC20898q3;
        EnumC20898q[] enumC20898qArr = {enumC20898q, enumC20898q2, enumC20898q3};
        f66615p0 = enumC20898qArr;
        AbstractC7877E4.m8156j(enumC20898qArr);
    }

    public static EnumC20898q valueOf(String str) {
        return (EnumC20898q) Enum.valueOf(EnumC20898q.class, str);
    }

    public static EnumC20898q[] values() {
        return (EnumC20898q[]) f66615p0.clone();
    }
}
