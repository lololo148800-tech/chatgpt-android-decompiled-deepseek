package p145Ff;

import p499U9.C7591u;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ff.i */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2731i {

    /* JADX INFO: renamed from: Y */
    public static final C7591u f8384Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC2731i f8385Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC2731i f8386o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC2731i f8387p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC2731i f8388q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC2731i f8389r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC2731i[] f8390s0;

    static {
        EnumC2731i enumC2731i = new EnumC2731i("Loading", 0);
        f8385Z = enumC2731i;
        EnumC2731i enumC2731i2 = new EnumC2731i("Expired", 1);
        f8386o0 = enumC2731i2;
        EnumC2731i enumC2731i3 = new EnumC2731i("Unavailable", 2);
        f8387p0 = enumC2731i3;
        EnumC2731i enumC2731i4 = new EnumC2731i("Error", 3);
        f8388q0 = enumC2731i4;
        EnumC2731i enumC2731i5 = new EnumC2731i("Available", 4);
        f8389r0 = enumC2731i5;
        EnumC2731i[] enumC2731iArr = {enumC2731i, enumC2731i2, enumC2731i3, enumC2731i4, enumC2731i5};
        f8390s0 = enumC2731iArr;
        AbstractC7877E4.m8156j(enumC2731iArr);
        f8384Y = new C7591u(5);
    }

    public static EnumC2731i valueOf(String str) {
        return (EnumC2731i) Enum.valueOf(EnumC2731i.class, str);
    }

    public static EnumC2731i[] values() {
        return (EnumC2731i[]) f8390s0.clone();
    }
}
