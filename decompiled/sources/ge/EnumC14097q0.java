package ge;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ge.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14097q0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14097q0 f44335Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14097q0 f44336Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14097q0 f44337o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14097q0[] f44338p0;

    static {
        EnumC14097q0 enumC14097q0 = new EnumC14097q0("ScrollToBottom", 0);
        f44335Y = enumC14097q0;
        EnumC14097q0 enumC14097q1 = new EnumC14097q0("ScrollToLast", 1);
        f44336Z = enumC14097q1;
        EnumC14097q0 enumC14097q2 = new EnumC14097q0("NoScroll", 2);
        f44337o0 = enumC14097q2;
        EnumC14097q0[] enumC14097q0Arr = {enumC14097q0, enumC14097q1, enumC14097q2};
        f44338p0 = enumC14097q0Arr;
        AbstractC7877E4.m8156j(enumC14097q0Arr);
    }

    public static EnumC14097q0 valueOf(String str) {
        return (EnumC14097q0) Enum.valueOf(EnumC14097q0.class, str);
    }

    public static EnumC14097q0[] values() {
        return (EnumC14097q0[]) f44338p0.clone();
    }
}
