package p531Vj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Vj.D */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8334D {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8334D f25983Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8334D f25984Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC8334D f25985o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC8334D f25986p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC8334D[] f25987q0;

    static {
        EnumC8334D enumC8334D = new EnumC8334D("Camera", 0);
        f25983Y = enumC8334D;
        EnumC8334D enumC8334D2 = new EnumC8334D("RecordAudio", 1);
        f25984Z = enumC8334D2;
        EnumC8334D enumC8334D3 = new EnumC8334D("RoughLocation", 2);
        f25985o0 = enumC8334D3;
        EnumC8334D enumC8334D4 = new EnumC8334D("PreciseLocation", 3);
        f25986p0 = enumC8334D4;
        EnumC8334D[] enumC8334DArr = {enumC8334D, enumC8334D2, enumC8334D3, enumC8334D4};
        f25987q0 = enumC8334DArr;
        AbstractC7877E4.m8156j(enumC8334DArr);
    }

    public static EnumC8334D valueOf(String str) {
        return (EnumC8334D) Enum.valueOf(EnumC8334D.class, str);
    }

    public static EnumC8334D[] values() {
        return (EnumC8334D[]) f25987q0.clone();
    }
}
