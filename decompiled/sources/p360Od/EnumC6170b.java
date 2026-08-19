package p360Od;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Od.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6170b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC6170b f20085Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6170b f20086Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC6170b f20087o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC6170b f20088p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC6170b[] f20089q0;

    static {
        EnumC6170b enumC6170b = new EnumC6170b("Unknown", 0);
        f20085Y = enumC6170b;
        EnumC6170b enumC6170b2 = new EnumC6170b("Success", 1);
        f20086Z = enumC6170b2;
        EnumC6170b enumC6170b3 = new EnumC6170b("Declined", 2);
        f20087o0 = enumC6170b3;
        EnumC6170b enumC6170b4 = new EnumC6170b("InProgress", 3);
        f20088p0 = enumC6170b4;
        EnumC6170b[] enumC6170bArr = {enumC6170b, enumC6170b2, enumC6170b3, enumC6170b4};
        f20089q0 = enumC6170bArr;
        AbstractC7877E4.m8156j(enumC6170bArr);
    }

    public static EnumC6170b valueOf(String str) {
        return (EnumC6170b) Enum.valueOf(EnumC6170b.class, str);
    }

    public static EnumC6170b[] values() {
        return (EnumC6170b[]) f20089q0.clone();
    }
}
