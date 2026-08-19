package p1156zj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zj.Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC22136Z0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC22136Z0 f69977Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC22136Z0 f69978Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC22136Z0 f69979o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC22136Z0 f69980p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC22136Z0[] f69981q0;

    static {
        EnumC22136Z0 enumC22136Z0 = new EnumC22136Z0("World", 0);
        f69977Y = enumC22136Z0;
        EnumC22136Z0 enumC22136Z1 = new EnumC22136Z0("Card", 1);
        f69978Z = enumC22136Z1;
        EnumC22136Z0 enumC22136Z2 = new EnumC22136Z0("Flag", 2);
        f69979o0 = enumC22136Z2;
        EnumC22136Z0 enumC22136Z3 = new EnumC22136Z0("House", 3);
        f69980p0 = enumC22136Z3;
        EnumC22136Z0[] enumC22136Z0Arr = {enumC22136Z0, enumC22136Z1, enumC22136Z2, enumC22136Z3};
        f69981q0 = enumC22136Z0Arr;
        AbstractC7877E4.m8156j(enumC22136Z0Arr);
    }

    public static EnumC22136Z0 valueOf(String str) {
        return (EnumC22136Z0) Enum.valueOf(EnumC22136Z0.class, str);
    }

    public static EnumC22136Z0[] values() {
        return (EnumC22136Z0[]) f69981q0.clone();
    }
}
