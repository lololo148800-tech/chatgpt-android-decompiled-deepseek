package p175Gl;

import p379Pb.LVf.efyhmdM;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Gl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3105d {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3105d f9339Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3105d f9340Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3105d f9341o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC3105d f9342p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC3105d f9343q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC3105d f9344r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC3105d f9345s0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ EnumC3105d[] f9346t0;

    static {
        EnumC3105d enumC3105d = new EnumC3105d("NEW", 0);
        f9339Y = enumC3105d;
        EnumC3105d enumC3105d2 = new EnumC3105d(efyhmdM.jmBhewtc, 1);
        f9340Z = enumC3105d2;
        EnumC3105d enumC3105d3 = new EnumC3105d("KEY_RATCHETED", 2);
        f9341o0 = enumC3105d3;
        EnumC3105d enumC3105d4 = new EnumC3105d("MISSING_KEY", 3);
        f9342p0 = enumC3105d4;
        EnumC3105d enumC3105d5 = new EnumC3105d("ENCRYPTION_FAILED", 4);
        f9343q0 = enumC3105d5;
        EnumC3105d enumC3105d6 = new EnumC3105d("DECRYPTION_FAILED", 5);
        f9344r0 = enumC3105d6;
        EnumC3105d enumC3105d7 = new EnumC3105d("INTERNAL_ERROR", 6);
        f9345s0 = enumC3105d7;
        EnumC3105d[] enumC3105dArr = {enumC3105d, enumC3105d2, enumC3105d3, enumC3105d4, enumC3105d5, enumC3105d6, enumC3105d7};
        f9346t0 = enumC3105dArr;
        AbstractC7877E4.m8156j(enumC3105dArr);
    }

    public static EnumC3105d valueOf(String str) {
        return (EnumC3105d) Enum.valueOf(EnumC3105d.class, str);
    }

    public static EnumC3105d[] values() {
        return (EnumC3105d[]) f9346t0.clone();
    }
}
