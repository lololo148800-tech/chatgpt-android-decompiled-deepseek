package p508Uj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Uj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7694b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7694b f24234Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC7694b f24235Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC7694b f24236o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC7694b[] f24237p0;

    static {
        EnumC7694b enumC7694b = new EnumC7694b("Dg1", 0);
        f24234Y = enumC7694b;
        EnumC7694b enumC7694b2 = new EnumC7694b("Dg2", 1);
        f24235Z = enumC7694b2;
        EnumC7694b enumC7694b3 = new EnumC7694b("Sod", 2);
        f24236o0 = enumC7694b3;
        EnumC7694b[] enumC7694bArr = {enumC7694b, enumC7694b2, enumC7694b3};
        f24237p0 = enumC7694bArr;
        AbstractC7877E4.m8156j(enumC7694bArr);
    }

    public static EnumC7694b valueOf(String str) {
        return (EnumC7694b) Enum.valueOf(EnumC7694b.class, str);
    }

    public static EnumC7694b[] values() {
        return (EnumC7694b[]) f24237p0.clone();
    }
}
