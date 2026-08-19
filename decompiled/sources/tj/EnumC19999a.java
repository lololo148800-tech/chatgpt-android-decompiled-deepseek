package tj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC19999a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC19999a f63314Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC19999a f63315Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC19999a f63316o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC19999a[] f63317p0;

    static {
        EnumC19999a enumC19999a = new EnumC19999a("Stream", 0);
        f63314Y = enumC19999a;
        EnumC19999a enumC19999a2 = new EnumC19999a("Upload", 1);
        f63315Z = enumC19999a2;
        EnumC19999a enumC19999a3 = new EnumC19999a("None", 2);
        f63316o0 = enumC19999a3;
        EnumC19999a[] enumC19999aArr = {enumC19999a, enumC19999a2, enumC19999a3};
        f63317p0 = enumC19999aArr;
        AbstractC7877E4.m8156j(enumC19999aArr);
    }

    public static EnumC19999a valueOf(String str) {
        return (EnumC19999a) Enum.valueOf(EnumC19999a.class, str);
    }

    public static EnumC19999a[] values() {
        return (EnumC19999a[]) f63317p0.clone();
    }
}
