package p854kf;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC16392j {

    /* JADX INFO: renamed from: Y */
    public static final EnumC16392j f50902Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC16392j f50903Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC16392j f50904o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC16392j f50905p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC16392j[] f50906q0;

    static {
        EnumC16392j enumC16392j = new EnumC16392j("TODAY", 0);
        f50902Y = enumC16392j;
        EnumC16392j enumC16392j2 = new EnumC16392j("YESTERDAY", 1);
        f50903Z = enumC16392j2;
        EnumC16392j enumC16392j3 = new EnumC16392j("WEEKDAY", 2);
        f50904o0 = enumC16392j3;
        EnumC16392j enumC16392j4 = new EnumC16392j("FULL", 3);
        f50905p0 = enumC16392j4;
        EnumC16392j[] enumC16392jArr = {enumC16392j, enumC16392j2, enumC16392j3, enumC16392j4};
        f50906q0 = enumC16392jArr;
        AbstractC7877E4.m8156j(enumC16392jArr);
    }

    public static EnumC16392j valueOf(String str) {
        return (EnumC16392j) Enum.valueOf(EnumC16392j.class, str);
    }

    public static EnumC16392j[] values() {
        return (EnumC16392j[]) f50906q0.clone();
    }
}
