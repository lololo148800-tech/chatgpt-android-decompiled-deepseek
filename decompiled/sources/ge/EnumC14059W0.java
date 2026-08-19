package ge;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ge.W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14059W0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14059W0 f44199Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14059W0 f44200Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14059W0 f44201o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14059W0[] f44202p0;

    static {
        EnumC14059W0 enumC14059W0 = new EnumC14059W0("Gizmo", 0);
        f44199Y = enumC14059W0;
        EnumC14059W0 enumC14059W1 = new EnumC14059W0("Upsell", 1);
        f44200Z = enumC14059W1;
        EnumC14059W0 enumC14059W2 = new EnumC14059W0("None", 2);
        f44201o0 = enumC14059W2;
        EnumC14059W0[] enumC14059W0Arr = {enumC14059W0, enumC14059W1, enumC14059W2};
        f44202p0 = enumC14059W0Arr;
        AbstractC7877E4.m8156j(enumC14059W0Arr);
    }

    public static EnumC14059W0 valueOf(String str) {
        return (EnumC14059W0) Enum.valueOf(EnumC14059W0.class, str);
    }

    public static EnumC14059W0[] values() {
        return (EnumC14059W0[]) f44202p0.clone();
    }
}
