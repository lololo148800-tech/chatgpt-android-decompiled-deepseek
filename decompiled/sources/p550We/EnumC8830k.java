package p550We;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: We.k */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8830k {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8830k f27019Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8830k f27020Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC8830k[] f27021o0;

    static {
        EnumC8830k enumC8830k = new EnumC8830k("AlwaysAllow", 0);
        f27019Y = enumC8830k;
        EnumC8830k enumC8830k2 = new EnumC8830k("Unset", 1);
        f27020Z = enumC8830k2;
        EnumC8830k[] enumC8830kArr = {enumC8830k, enumC8830k2};
        f27021o0 = enumC8830kArr;
        AbstractC7877E4.m8156j(enumC8830kArr);
    }

    public static EnumC8830k valueOf(String str) {
        return (EnumC8830k) Enum.valueOf(EnumC8830k.class, str);
    }

    public static EnumC8830k[] values() {
        return (EnumC8830k[]) f27021o0.clone();
    }
}
