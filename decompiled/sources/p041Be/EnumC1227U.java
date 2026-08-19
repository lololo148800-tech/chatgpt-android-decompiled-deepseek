package p041Be;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Be.U */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1227U {

    /* JADX INFO: renamed from: Y */
    public static final EnumC1227U f3234Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC1227U f3235Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC1227U[] f3236o0;

    static {
        EnumC1227U enumC1227U = new EnumC1227U("Classic", 0);
        f3234Y = enumC1227U;
        EnumC1227U enumC1227U2 = new EnumC1227U("V1", 1);
        f3235Z = enumC1227U2;
        EnumC1227U[] enumC1227UArr = {enumC1227U, enumC1227U2};
        f3236o0 = enumC1227UArr;
        AbstractC7877E4.m8156j(enumC1227UArr);
    }

    public static EnumC1227U valueOf(String str) {
        return (EnumC1227U) Enum.valueOf(EnumC1227U.class, str);
    }

    public static EnumC1227U[] values() {
        return (EnumC1227U[]) f3236o0.clone();
    }
}
