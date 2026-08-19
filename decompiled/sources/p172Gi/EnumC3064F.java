package p172Gi;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Gi.F */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC3064F {
    public static final C3063E Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f9239Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3064F f9240Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3064F f9241o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC3064F[] f9242p0;

    static {
        EnumC3064F enumC3064F = new EnumC3064F("Default", 0);
        f9240Z = enumC3064F;
        EnumC3064F enumC3064F2 = new EnumC3064F("Onboarding", 1);
        f9241o0 = enumC3064F2;
        EnumC3064F[] enumC3064FArr = {enumC3064F, enumC3064F2};
        f9242p0 = enumC3064FArr;
        AbstractC7877E4.m8156j(enumC3064FArr);
        Companion = new C3063E();
        f9239Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C3087t.f9295o0);
    }

    public static EnumC3064F valueOf(String str) {
        return (EnumC3064F) Enum.valueOf(EnumC3064F.class, str);
    }

    public static EnumC3064F[] values() {
        return (EnumC3064F[]) f9242p0.clone();
    }
}
