package p620Zc;

import p279L1.VOxZ.sVoFrD;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Zc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10276a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10276a f30525Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10276a f30526Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC10276a[] f30527o0;

    static {
        EnumC10276a enumC10276a = new EnumC10276a("Success", 0);
        f30525Y = enumC10276a;
        EnumC10276a enumC10276a2 = new EnumC10276a(sVoFrD.aEkmdQKoJT, 1);
        f30526Z = enumC10276a2;
        EnumC10276a[] enumC10276aArr = {enumC10276a, enumC10276a2};
        f30527o0 = enumC10276aArr;
        AbstractC7877E4.m8156j(enumC10276aArr);
    }

    public static EnumC10276a valueOf(String str) {
        return (EnumC10276a) Enum.valueOf(EnumC10276a.class, str);
    }

    public static EnumC10276a[] values() {
        return (EnumC10276a[]) f30527o0.clone();
    }
}
