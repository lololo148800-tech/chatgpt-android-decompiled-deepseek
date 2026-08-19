package p040Bd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Bd.d2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC1066d2 {
    public static final C1059c2 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f2909Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC1066d2 f2910Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC1066d2 f2911o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC1066d2 f2912p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC1066d2 f2913q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC1066d2[] f2914r0;

    static {
        EnumC1066d2 enumC1066d2 = new EnumC1066d2("User", 0);
        f2910Z = enumC1066d2;
        EnumC1066d2 enumC1066d3 = new EnumC1066d2("Assistant", 1);
        f2911o0 = enumC1066d3;
        EnumC1066d2 enumC1066d4 = new EnumC1066d2("System", 2);
        f2912p0 = enumC1066d4;
        EnumC1066d2 enumC1066d5 = new EnumC1066d2("Critic", 3);
        EnumC1066d2 enumC1066d6 = new EnumC1066d2("Tool", 4);
        f2913q0 = enumC1066d6;
        EnumC1066d2[] enumC1066d2Arr = {enumC1066d2, enumC1066d3, enumC1066d4, enumC1066d5, enumC1066d6};
        f2914r0 = enumC1066d2Arr;
        AbstractC7877E4.m8156j(enumC1066d2Arr);
        Companion = new C1059c2();
        f2909Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C1063d.f2900p0);
    }

    public static EnumC1066d2 valueOf(String str) {
        return (EnumC1066d2) Enum.valueOf(EnumC1066d2.class, str);
    }

    public static EnumC1066d2[] values() {
        return (EnumC1066d2[]) f2914r0.clone();
    }
}
