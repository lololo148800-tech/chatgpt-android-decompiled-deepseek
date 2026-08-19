package p403Qd;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Qd.L */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6606L {

    /* JADX INFO: renamed from: Y */
    public static final EnumC6606L f21327Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC6606L f21328Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC6606L f21329o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC6606L f21330p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC6606L[] f21331q0;

    static {
        EnumC6606L enumC6606L = new EnumC6606L("InProgress", 0);
        f21327Y = enumC6606L;
        EnumC6606L enumC6606L2 = new EnumC6606L("Success", 1);
        f21328Z = enumC6606L2;
        EnumC6606L enumC6606L3 = new EnumC6606L("Interrupted", 2);
        f21329o0 = enumC6606L3;
        EnumC6606L enumC6606L4 = new EnumC6606L("Error", 3);
        f21330p0 = enumC6606L4;
        EnumC6606L[] enumC6606LArr = {enumC6606L, enumC6606L2, enumC6606L3, enumC6606L4};
        f21331q0 = enumC6606LArr;
        AbstractC7877E4.m8156j(enumC6606LArr);
    }

    public static EnumC6606L valueOf(String str) {
        return (EnumC6606L) Enum.valueOf(EnumC6606L.class, str);
    }

    public static EnumC6606L[] values() {
        return (EnumC6606L[]) f21331q0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7161a() {
        return this != f21327Y;
    }
}
