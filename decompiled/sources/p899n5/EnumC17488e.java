package p899n5;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n5.e */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC17488e {

    /* JADX INFO: renamed from: Y */
    public static final EnumC17488e f55951Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC17488e f55952Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC17488e f55953o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC17488e f55954p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC17488e[] f55955q0;

    static {
        EnumC17488e enumC17488e = new EnumC17488e("MEMORY_CACHE", 0);
        f55951Y = enumC17488e;
        EnumC17488e enumC17488e2 = new EnumC17488e("MEMORY", 1);
        f55952Z = enumC17488e2;
        EnumC17488e enumC17488e3 = new EnumC17488e("DISK", 2);
        f55953o0 = enumC17488e3;
        EnumC17488e enumC17488e4 = new EnumC17488e("NETWORK", 3);
        f55954p0 = enumC17488e4;
        EnumC17488e[] enumC17488eArr = {enumC17488e, enumC17488e2, enumC17488e3, enumC17488e4};
        f55955q0 = enumC17488eArr;
        AbstractC7877E4.m8156j(enumC17488eArr);
    }

    public static EnumC17488e valueOf(String str) {
        return (EnumC17488e) Enum.valueOf(EnumC17488e.class, str);
    }

    public static EnumC17488e[] values() {
        return (EnumC17488e[]) f55955q0.clone();
    }
}
