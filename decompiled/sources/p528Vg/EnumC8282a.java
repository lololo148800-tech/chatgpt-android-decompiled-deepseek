package p528Vg;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Vg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8282a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8282a f25819Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC8282a[] f25820Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC8282a EF3;

    static {
        EnumC8282a enumC8282a = new EnumC8282a("Local", 0);
        EnumC8282a enumC8282a2 = new EnumC8282a("Staging", 1);
        EnumC8282a enumC8282a3 = new EnumC8282a("Prod", 2);
        f25819Y = enumC8282a3;
        EnumC8282a[] enumC8282aArr = {enumC8282a, enumC8282a2, enumC8282a3};
        f25820Z = enumC8282aArr;
        AbstractC7877E4.m8156j(enumC8282aArr);
    }

    public static EnumC8282a valueOf(String str) {
        return (EnumC8282a) Enum.valueOf(EnumC8282a.class, str);
    }

    public static EnumC8282a[] values() {
        return (EnumC8282a[]) f25820Z.clone();
    }
}
