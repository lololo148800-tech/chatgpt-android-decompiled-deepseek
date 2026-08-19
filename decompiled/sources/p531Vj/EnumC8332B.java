package p531Vj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Vj.B */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8332B {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8332B f25974Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8332B f25975Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC8332B f25976o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC8332B f25977p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC8332B[] f25978q0;

    static {
        EnumC8332B enumC8332B = new EnumC8332B("Camera", 0);
        f25974Y = enumC8332B;
        EnumC8332B enumC8332B2 = new EnumC8332B("RecordAudio", 1);
        f25975Z = enumC8332B2;
        EnumC8332B enumC8332B3 = new EnumC8332B("RoughLocation", 2);
        f25976o0 = enumC8332B3;
        EnumC8332B enumC8332B4 = new EnumC8332B("PreciseLocation", 3);
        f25977p0 = enumC8332B4;
        EnumC8332B[] enumC8332BArr = {enumC8332B, enumC8332B2, enumC8332B3, enumC8332B4};
        f25978q0 = enumC8332BArr;
        AbstractC7877E4.m8156j(enumC8332BArr);
    }

    public static EnumC8332B valueOf(String str) {
        return (EnumC8332B) Enum.valueOf(EnumC8332B.class, str);
    }

    public static EnumC8332B[] values() {
        return (EnumC8332B[]) f25978q0.clone();
    }
}
