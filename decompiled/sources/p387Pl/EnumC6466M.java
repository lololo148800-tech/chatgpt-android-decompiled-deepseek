package p387Pl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Pl.M */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6466M {
    public static final C6465L Companion;

    /* JADX INFO: renamed from: Y */
    public static final EnumC6466M f20974Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6466M f20975Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC6466M f20976o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC6466M[] f20977p0;

    static {
        EnumC6466M enumC6466M = new EnumC6466M("ACTIVE", 0);
        f20974Y = enumC6466M;
        EnumC6466M enumC6466M2 = new EnumC6466M("PAUSED", 1);
        f20975Z = enumC6466M2;
        EnumC6466M enumC6466M3 = new EnumC6466M("UNKNOWN", 2);
        f20976o0 = enumC6466M3;
        EnumC6466M[] enumC6466MArr = {enumC6466M, enumC6466M2, enumC6466M3};
        f20977p0 = enumC6466MArr;
        AbstractC7877E4.m8156j(enumC6466MArr);
        Companion = new C6465L();
    }

    public static EnumC6466M valueOf(String str) {
        return (EnumC6466M) Enum.valueOf(EnumC6466M.class, str);
    }

    public static EnumC6466M[] values() {
        return (EnumC6466M[]) f20977p0.clone();
    }
}
