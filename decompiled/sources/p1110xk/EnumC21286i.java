package p1110xk;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xk.i */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21286i {

    /* JADX INFO: renamed from: Y */
    public static final EnumC21286i f67675Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21286i f67676Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21286i f67677o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC21286i[] f67678p0;

    static {
        EnumC21286i enumC21286i = new EnumC21286i("BASE", 0);
        f67675Y = enumC21286i;
        EnumC21286i enumC21286i2 = new EnumC21286i("ACTIVE", 1);
        f67676Z = enumC21286i2;
        EnumC21286i enumC21286i3 = new EnumC21286i("DISABLED", 2);
        f67677o0 = enumC21286i3;
        EnumC21286i[] enumC21286iArr = {enumC21286i, enumC21286i2, enumC21286i3};
        f67678p0 = enumC21286iArr;
        AbstractC7877E4.m8156j(enumC21286iArr);
    }

    public static EnumC21286i valueOf(String str) {
        return (EnumC21286i) Enum.valueOf(EnumC21286i.class, str);
    }

    public static EnumC21286i[] values() {
        return (EnumC21286i[]) f67678p0.clone();
    }
}
