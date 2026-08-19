package p1126yd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: yd.G0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21418G0 {
    public static final C21416F0 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f67987Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21418G0 f67988Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21418G0 f67989o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC21418G0[] f67990p0;

    static {
        EnumC21418G0 enumC21418G0 = new EnumC21418G0("Skippable", 0);
        f67988Z = enumC21418G0;
        EnumC21418G0 enumC21418G1 = new EnumC21418G0("Unskippable", 1);
        f67989o0 = enumC21418G1;
        EnumC21418G0[] enumC21418G0Arr = {enumC21418G0, enumC21418G1};
        f67990p0 = enumC21418G0Arr;
        AbstractC7877E4.m8156j(enumC21418G0Arr);
        Companion = new C21416F0();
        f67987Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21448W.f68036q0);
    }

    public static EnumC21418G0 valueOf(String str) {
        return (EnumC21418G0) Enum.valueOf(EnumC21418G0.class, str);
    }

    public static EnumC21418G0[] values() {
        return (EnumC21418G0[]) f67990p0.clone();
    }
}
