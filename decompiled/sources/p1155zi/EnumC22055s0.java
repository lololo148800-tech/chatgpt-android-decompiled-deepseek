package p1155zi;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zi.s0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC22055s0 {
    public static final C22051r0 Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f69742Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC22055s0 f69743Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC22055s0 f69744o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC22055s0[] f69745p0;

    static {
        EnumC22055s0 enumC22055s0 = new EnumC22055s0("User", 0);
        f69743Z = enumC22055s0;
        EnumC22055s0 enumC22055s1 = new EnumC22055s0("Model", 1);
        f69744o0 = enumC22055s1;
        EnumC22055s0[] enumC22055s0Arr = {enumC22055s0, enumC22055s1};
        f69745p0 = enumC22055s0Arr;
        AbstractC7877E4.m8156j(enumC22055s0Arr);
        Companion = new C22051r0();
        f69742Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69598s0);
    }

    public static EnumC22055s0 valueOf(String str) {
        return (EnumC22055s0) Enum.valueOf(EnumC22055s0.class, str);
    }

    public static EnumC22055s0[] values() {
        return (EnumC22055s0[]) f69745p0.clone();
    }
}
