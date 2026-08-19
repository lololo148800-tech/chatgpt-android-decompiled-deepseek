package p858ko;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ko.i */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC16506i {

    /* JADX INFO: renamed from: Y */
    public static final EnumC16506i f51197Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC16506i f51198Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC16506i f51199o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC16506i f51200p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC16506i[] f51201q0;

    static {
        EnumC16506i enumC16506i = new EnumC16506i("Up", 0);
        f51197Y = enumC16506i;
        EnumC16506i enumC16506i2 = new EnumC16506i("Down", 1);
        f51198Z = enumC16506i2;
        EnumC16506i enumC16506i3 = new EnumC16506i("Left", 2);
        f51199o0 = enumC16506i3;
        EnumC16506i enumC16506i4 = new EnumC16506i("Right", 3);
        f51200p0 = enumC16506i4;
        EnumC16506i[] enumC16506iArr = {enumC16506i, enumC16506i2, enumC16506i3, enumC16506i4};
        f51201q0 = enumC16506iArr;
        AbstractC7877E4.m8156j(enumC16506iArr);
    }

    public static EnumC16506i valueOf(String str) {
        return (EnumC16506i) Enum.valueOf(EnumC16506i.class, str);
    }

    public static EnumC16506i[] values() {
        return (EnumC16506i[]) f51201q0.clone();
    }
}
