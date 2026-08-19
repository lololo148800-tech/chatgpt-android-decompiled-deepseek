package p040Bd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Bd.r4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC1159r4 {
    public static final C1153q4 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f3082Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC1159r4 f3083Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC1159r4[] f3084o0;

    static {
        EnumC1159r4 enumC1159r4 = new EnumC1159r4("Loading", 0);
        f3083Z = enumC1159r4;
        EnumC1159r4[] enumC1159r4Arr = {enumC1159r4, new EnumC1159r4("Done", 1)};
        f3084o0 = enumC1159r4Arr;
        AbstractC7877E4.m8156j(enumC1159r4Arr);
        Companion = new C1153q4();
        f3082Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C1063d.f2906v0);
    }

    public static EnumC1159r4 valueOf(String str) {
        return (EnumC1159r4) Enum.valueOf(EnumC1159r4.class, str);
    }

    public static EnumC1159r4[] values() {
        return (EnumC1159r4[]) f3084o0.clone();
    }
}
