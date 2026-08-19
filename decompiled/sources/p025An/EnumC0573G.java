package p025An;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: An.G */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0573G {

    /* JADX INFO: renamed from: Y */
    public static final EnumC0573G f1790Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC0573G f1791Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC0573G f1792o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC0573G f1793p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC0573G[] f1794q0;

    static {
        EnumC0573G enumC0573G = new EnumC0573G("DEFAULT", 0);
        f1790Y = enumC0573G;
        EnumC0573G enumC0573G2 = new EnumC0573G("LAZY", 1);
        f1791Z = enumC0573G2;
        EnumC0573G enumC0573G3 = new EnumC0573G("ATOMIC", 2);
        f1792o0 = enumC0573G3;
        EnumC0573G enumC0573G4 = new EnumC0573G("UNDISPATCHED", 3);
        f1793p0 = enumC0573G4;
        EnumC0573G[] enumC0573GArr = {enumC0573G, enumC0573G2, enumC0573G3, enumC0573G4};
        f1794q0 = enumC0573GArr;
        AbstractC7877E4.m8156j(enumC0573GArr);
    }

    public static EnumC0573G valueOf(String str) {
        return (EnumC0573G) Enum.valueOf(EnumC0573G.class, str);
    }

    public static EnumC0573G[] values() {
        return (EnumC0573G[]) f1794q0.clone();
    }
}
