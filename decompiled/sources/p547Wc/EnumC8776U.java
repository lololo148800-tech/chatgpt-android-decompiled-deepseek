package p547Wc;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Wc.U */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8776U {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8776U f26769Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8776U f26770Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC8776U f26771o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC8776U[] f26772p0;

    static {
        EnumC8776U enumC8776U = new EnumC8776U("Collapsed", 0);
        f26769Y = enumC8776U;
        EnumC8776U enumC8776U2 = new EnumC8776U("Expanded", 1);
        f26770Z = enumC8776U2;
        EnumC8776U enumC8776U3 = new EnumC8776U("Fullscreen", 2);
        f26771o0 = enumC8776U3;
        EnumC8776U[] enumC8776UArr = {enumC8776U, enumC8776U2, enumC8776U3};
        f26772p0 = enumC8776UArr;
        AbstractC7877E4.m8156j(enumC8776UArr);
    }

    public static EnumC8776U valueOf(String str) {
        return (EnumC8776U) Enum.valueOf(EnumC8776U.class, str);
    }

    public static EnumC8776U[] values() {
        return (EnumC8776U[]) f26772p0.clone();
    }
}
