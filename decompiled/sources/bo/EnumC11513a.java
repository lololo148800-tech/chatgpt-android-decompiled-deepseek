package bo;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC11513a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC11513a f34836Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC11513a f34837Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC11513a[] f34838o0;

    static {
        EnumC11513a enumC11513a = new EnumC11513a("NONE", 0);
        f34836Y = enumC11513a;
        EnumC11513a enumC11513a2 = new EnumC11513a("ALL_JSON_OBJECTS", 1);
        EnumC11513a enumC11513a3 = new EnumC11513a("POLYMORPHIC", 2);
        f34837Z = enumC11513a3;
        EnumC11513a[] enumC11513aArr = {enumC11513a, enumC11513a2, enumC11513a3};
        f34838o0 = enumC11513aArr;
        AbstractC7877E4.m8156j(enumC11513aArr);
    }

    public static EnumC11513a valueOf(String str) {
        return (EnumC11513a) Enum.valueOf(EnumC11513a.class, str);
    }

    public static EnumC11513a[] values() {
        return (EnumC11513a[]) f34838o0.clone();
    }
}
