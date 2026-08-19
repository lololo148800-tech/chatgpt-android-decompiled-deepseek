package p1126yd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yd.Y */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21452Y {
    public static final C21450X Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f68040Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21452Y f68041Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21452Y f68042o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC21452Y[] f68043p0;

    static {
        EnumC21452Y enumC21452Y = new EnumC21452Y("Next", 0);
        f68041Z = enumC21452Y;
        EnumC21452Y enumC21452Y2 = new EnumC21452Y("Variant", 1);
        f68042o0 = enumC21452Y2;
        EnumC21452Y[] enumC21452YArr = {enumC21452Y, enumC21452Y2, new EnumC21452Y("Continue", 2)};
        f68043p0 = enumC21452YArr;
        AbstractC7877E4.m8156j(enumC21452YArr);
        Companion = new C21450X();
        f68040Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21448W.f68033Z);
    }

    public static EnumC21452Y valueOf(String str) {
        return (EnumC21452Y) Enum.valueOf(EnumC21452Y.class, str);
    }

    public static EnumC21452Y[] values() {
        return (EnumC21452Y[]) f68043p0.clone();
    }
}
