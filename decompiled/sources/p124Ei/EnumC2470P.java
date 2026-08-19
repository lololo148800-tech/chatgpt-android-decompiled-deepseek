package p124Ei;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ei.P */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2470P {

    /* JADX INFO: renamed from: Y */
    public static final EnumC2470P f7698Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC2470P f7699Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC2470P[] f7700o0;

    static {
        EnumC2470P enumC2470P = new EnumC2470P("BlackGray", 0);
        f7698Y = enumC2470P;
        EnumC2470P enumC2470P2 = new EnumC2470P("GrayRed", 1);
        f7699Z = enumC2470P2;
        EnumC2470P[] enumC2470PArr = {enumC2470P, enumC2470P2};
        f7700o0 = enumC2470PArr;
        AbstractC7877E4.m8156j(enumC2470PArr);
    }

    public static EnumC2470P valueOf(String str) {
        return (EnumC2470P) Enum.valueOf(EnumC2470P.class, str);
    }

    public static EnumC2470P[] values() {
        return (EnumC2470P[]) f7700o0.clone();
    }
}
