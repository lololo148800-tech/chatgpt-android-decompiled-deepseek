package p040Bd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Bd.i2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC1101i2 {
    public static final C1094h2 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f3000Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC1101i2 f3001Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC1101i2[] f3002o0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1101i2 EF3;

    static {
        EnumC1101i2 enumC1101i2 = new EnumC1101i2("InProgress", 0);
        EnumC1101i2 enumC1101i3 = new EnumC1101i2("FinishedSuccessfully", 1);
        f3001Z = enumC1101i3;
        EnumC1101i2[] enumC1101i2Arr = {enumC1101i2, enumC1101i3, new EnumC1101i2("FinishedPartialCompletion", 2)};
        f3002o0 = enumC1101i2Arr;
        AbstractC7877E4.m8156j(enumC1101i2Arr);
        Companion = new C1094h2();
        f3000Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C1063d.f2901q0);
    }

    public static EnumC1101i2 valueOf(String str) {
        return (EnumC1101i2) Enum.valueOf(EnumC1101i2.class, str);
    }

    public static EnumC1101i2[] values() {
        return (EnumC1101i2[]) f3002o0.clone();
    }
}
