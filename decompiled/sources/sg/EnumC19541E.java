package sg;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: sg.E */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC19541E {

    /* JADX INFO: renamed from: Y */
    public static final EnumC19541E f62077Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC19541E f62078Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC19541E f62079o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC19541E f62080p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC19541E[] f62081q0;

    static {
        EnumC19541E enumC19541E = new EnumC19541E("CONVERSATION", 0);
        f62077Y = enumC19541E;
        EnumC19541E enumC19541E2 = new EnumC19541E("SHARED_CONVERSATION", 1);
        f62078Z = enumC19541E2;
        EnumC19541E enumC19541E3 = new EnumC19541E("GIZMO", 2);
        f62079o0 = enumC19541E3;
        EnumC19541E enumC19541E4 = new EnumC19541E("APP", 3);
        f62080p0 = enumC19541E4;
        EnumC19541E[] enumC19541EArr = {enumC19541E, enumC19541E2, enumC19541E3, enumC19541E4};
        f62081q0 = enumC19541EArr;
        AbstractC7877E4.m8156j(enumC19541EArr);
    }

    public static EnumC19541E valueOf(String str) {
        return (EnumC19541E) Enum.valueOf(EnumC19541E.class, str);
    }

    public static EnumC19541E[] values() {
        return (EnumC19541E[]) f62081q0.clone();
    }
}
