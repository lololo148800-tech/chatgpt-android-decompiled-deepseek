package p226In;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: In.k */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3789k {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3789k f11448Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3789k f11449Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3789k f11450o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC3789k f11451p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC3789k[] f11452q0;

    static {
        EnumC3789k enumC3789k = new EnumC3789k("SUCCESSFUL", 0);
        f11448Y = enumC3789k;
        EnumC3789k enumC3789k2 = new EnumC3789k("REREGISTER", 1);
        f11449Z = enumC3789k2;
        EnumC3789k enumC3789k3 = new EnumC3789k("CANCELLED", 2);
        f11450o0 = enumC3789k3;
        EnumC3789k enumC3789k4 = new EnumC3789k("ALREADY_SELECTED", 3);
        f11451p0 = enumC3789k4;
        EnumC3789k[] enumC3789kArr = {enumC3789k, enumC3789k2, enumC3789k3, enumC3789k4};
        f11452q0 = enumC3789kArr;
        AbstractC7877E4.m8156j(enumC3789kArr);
    }

    public static EnumC3789k valueOf(String str) {
        return (EnumC3789k) Enum.valueOf(EnumC3789k.class, str);
    }

    public static EnumC3789k[] values() {
        return (EnumC3789k[]) f11452q0.clone();
    }
}
