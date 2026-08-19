package p533Vl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Vl.i */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8397i {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8397i f26116Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8397i f26117Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC8397i f26118o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC8397i f26119p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC8397i f26120q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC8397i f26121r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC8397i[] f26122s0;

    static {
        EnumC8397i enumC8397i = new EnumC8397i("VERBOSE", 0);
        f26116Y = enumC8397i;
        EnumC8397i enumC8397i2 = new EnumC8397i("DEBUG", 1);
        f26117Z = enumC8397i2;
        EnumC8397i enumC8397i3 = new EnumC8397i("INFO", 2);
        f26118o0 = enumC8397i3;
        EnumC8397i enumC8397i4 = new EnumC8397i("WARN", 3);
        f26119p0 = enumC8397i4;
        EnumC8397i enumC8397i5 = new EnumC8397i("ERROR", 4);
        f26120q0 = enumC8397i5;
        EnumC8397i enumC8397i6 = new EnumC8397i("WTF", 5);
        EnumC8397i enumC8397i7 = new EnumC8397i("OFF", 6);
        f26121r0 = enumC8397i7;
        EnumC8397i[] enumC8397iArr = {enumC8397i, enumC8397i2, enumC8397i3, enumC8397i4, enumC8397i5, enumC8397i6, enumC8397i7};
        f26122s0 = enumC8397iArr;
        AbstractC7877E4.m8156j(enumC8397iArr);
    }

    public static EnumC8397i valueOf(String str) {
        return (EnumC8397i) Enum.valueOf(EnumC8397i.class, str);
    }

    public static EnumC8397i[] values() {
        return (EnumC8397i[]) f26122s0.clone();
    }
}
