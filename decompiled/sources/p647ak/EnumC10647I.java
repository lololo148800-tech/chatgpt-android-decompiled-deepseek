package p647ak;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ak.I */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10647I {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10647I f31584Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10647I f31585Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC10647I f31586o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC10647I f31587p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC10647I f31588q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC10647I f31589r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC10647I f31590s0;

    /* JADX INFO: renamed from: t0 */
    public static final EnumC10647I f31591t0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ EnumC10647I[] f31592u0;

    static {
        EnumC10647I enumC10647I = new EnumC10647I("FaceNotCentered", 0);
        f31584Y = enumC10647I;
        EnumC10647I enumC10647I2 = new EnumC10647I("FaceTooClose", 1);
        f31585Z = enumC10647I2;
        EnumC10647I enumC10647I3 = new EnumC10647I("FaceTooFar", 2);
        f31586o0 = enumC10647I3;
        EnumC10647I enumC10647I4 = new EnumC10647I("MultipleFaces", 3);
        f31587p0 = enumC10647I4;
        EnumC10647I enumC10647I5 = new EnumC10647I("IncompleteFace", 4);
        EnumC10647I enumC10647I6 = new EnumC10647I("FaceNotFound", 5);
        f31588q0 = enumC10647I6;
        EnumC10647I enumC10647I7 = new EnumC10647I("IncorrectPose", 6);
        f31589r0 = enumC10647I7;
        EnumC10647I enumC10647I8 = new EnumC10647I("FaceDetectionUnsupported", 7);
        f31590s0 = enumC10647I8;
        EnumC10647I enumC10647I9 = new EnumC10647I("Other", 8);
        f31591t0 = enumC10647I9;
        EnumC10647I[] enumC10647IArr = {enumC10647I, enumC10647I2, enumC10647I3, enumC10647I4, enumC10647I5, enumC10647I6, enumC10647I7, enumC10647I8, enumC10647I9};
        f31592u0 = enumC10647IArr;
        AbstractC7877E4.m8156j(enumC10647IArr);
    }

    public static EnumC10647I valueOf(String str) {
        return (EnumC10647I) Enum.valueOf(EnumC10647I.class, str);
    }

    public static EnumC10647I[] values() {
        return (EnumC10647I[]) f31592u0.clone();
    }
}
