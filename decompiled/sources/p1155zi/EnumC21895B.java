package p1155zi;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zi.B */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21895B {

    /* JADX INFO: renamed from: Y */
    public static final EnumC21895B f69418Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21895B f69419Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC21895B[] f69420o0;

    static {
        EnumC21895B enumC21895B = new EnumC21895B("Developer", 0);
        f69418Y = enumC21895B;
        EnumC21895B enumC21895B2 = new EnumC21895B("Internal", 1);
        EnumC21895B enumC21895B3 = new EnumC21895B("Production", 2);
        f69419Z = enumC21895B3;
        EnumC21895B[] enumC21895BArr = {enumC21895B, enumC21895B2, enumC21895B3};
        f69420o0 = enumC21895BArr;
        AbstractC7877E4.m8156j(enumC21895BArr);
    }

    public static EnumC21895B valueOf(String str) {
        return (EnumC21895B) Enum.valueOf(EnumC21895B.class, str);
    }

    public static EnumC21895B[] values() {
        return (EnumC21895B[]) f69420o0.clone();
    }
}
