package p368Om;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Om.g */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6271g {

    /* JADX INFO: renamed from: Y */
    public static final EnumC6271g f20368Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6271g f20369Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC6271g f20370o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC6271g f20371p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC6271g f20372q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC6271g[] f20373r0;

    static {
        EnumC6271g enumC6271g = new EnumC6271g("HIDDEN", 0);
        f20368Y = enumC6271g;
        EnumC6271g enumC6271g2 = new EnumC6271g("VISIBLE", 1);
        f20369Z = enumC6271g2;
        EnumC6271g enumC6271g3 = new EnumC6271g("DEPRECATED_LIST_METHODS", 2);
        f20370o0 = enumC6271g3;
        EnumC6271g enumC6271g4 = new EnumC6271g("NOT_CONSIDERED", 3);
        f20371p0 = enumC6271g4;
        EnumC6271g enumC6271g5 = new EnumC6271g("DROP", 4);
        f20372q0 = enumC6271g5;
        EnumC6271g[] enumC6271gArr = {enumC6271g, enumC6271g2, enumC6271g3, enumC6271g4, enumC6271g5};
        f20373r0 = enumC6271gArr;
        AbstractC7877E4.m8156j(enumC6271gArr);
    }

    public static EnumC6271g valueOf(String str) {
        return (EnumC6271g) Enum.valueOf(EnumC6271g.class, str);
    }

    public static EnumC6271g[] values() {
        return (EnumC6271g[]) f20373r0.clone();
    }
}
