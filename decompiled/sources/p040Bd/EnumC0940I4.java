package p040Bd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Bd.I4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC0940I4 {
    public static final C0934H4 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f2699Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC0940I4 f2700Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC0940I4 f2701o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC0940I4 f2702p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC0940I4 f2703q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC0940I4[] f2704r0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0940I4 EF5;

    static {
        EnumC0940I4 enumC0940I4 = new EnumC0940I4("MaxTokens", 0);
        EnumC0940I4 enumC0940I5 = new EnumC0940I4("Interrupted", 1);
        f2700Z = enumC0940I5;
        EnumC0940I4 enumC0940I6 = new EnumC0940I4("Unknown", 2);
        f2701o0 = enumC0940I6;
        EnumC0940I4 enumC0940I7 = new EnumC0940I4("Stop", 3);
        f2702p0 = enumC0940I7;
        EnumC0940I4 enumC0940I8 = new EnumC0940I4("ContentFilter", 4);
        f2703q0 = enumC0940I8;
        EnumC0940I4[] enumC0940I4Arr = {enumC0940I4, enumC0940I5, enumC0940I6, enumC0940I7, enumC0940I8};
        f2704r0 = enumC0940I4Arr;
        AbstractC7877E4.m8156j(enumC0940I4Arr);
        Companion = new C0934H4();
        f2699Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C1063d.f2907w0);
    }

    public static EnumC0940I4 valueOf(String str) {
        return (EnumC0940I4) Enum.valueOf(EnumC0940I4.class, str);
    }

    public static EnumC0940I4[] values() {
        return (EnumC0940I4[]) f2704r0.clone();
    }
}
