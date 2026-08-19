package p318Mh;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Mh.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC5421r {
    public static final C5419q Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f17709Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5421r f17710Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC5421r f17711o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC5421r f17712p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC5421r f17713q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC5421r f17714r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC5421r[] f17715s0;

    static {
        EnumC5421r enumC5421r = new EnumC5421r("VOICE", 0);
        f17710Z = enumC5421r;
        EnumC5421r enumC5421r2 = new EnumC5421r("CAMERA", 1);
        f17711o0 = enumC5421r2;
        EnumC5421r enumC5421r3 = new EnumC5421r("GALLERY", 2);
        f17712p0 = enumC5421r3;
        EnumC5421r enumC5421r4 = new EnumC5421r("WHISPER", 3);
        f17713q0 = enumC5421r4;
        EnumC5421r enumC5421r5 = new EnumC5421r("DEFAULT", 4);
        f17714r0 = enumC5421r5;
        EnumC5421r[] enumC5421rArr = {enumC5421r, enumC5421r2, enumC5421r3, enumC5421r4, enumC5421r5};
        f17715s0 = enumC5421rArr;
        AbstractC7877E4.m8156j(enumC5421rArr);
        Companion = new C5419q();
        f17709Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C5417p.f17702Z);
    }

    public static EnumC5421r valueOf(String str) {
        return (EnumC5421r) Enum.valueOf(EnumC5421r.class, str);
    }

    public static EnumC5421r[] values() {
        return (EnumC5421r[]) f17715s0.clone();
    }
}
