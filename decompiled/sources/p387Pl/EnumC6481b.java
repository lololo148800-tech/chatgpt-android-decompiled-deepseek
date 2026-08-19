package p387Pl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Pl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6481b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC6481b f21034Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6481b f21035Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC6481b[] f21036o0;

    static {
        EnumC6481b enumC6481b = new EnumC6481b("FRONT", 0);
        f21034Y = enumC6481b;
        EnumC6481b enumC6481b2 = new EnumC6481b("BACK", 1);
        f21035Z = enumC6481b2;
        EnumC6481b[] enumC6481bArr = {enumC6481b, enumC6481b2};
        f21036o0 = enumC6481bArr;
        AbstractC7877E4.m8156j(enumC6481bArr);
    }

    public static EnumC6481b valueOf(String str) {
        return (EnumC6481b) Enum.valueOf(EnumC6481b.class, str);
    }

    public static EnumC6481b[] values() {
        return (EnumC6481b[]) f21036o0.clone();
    }
}
