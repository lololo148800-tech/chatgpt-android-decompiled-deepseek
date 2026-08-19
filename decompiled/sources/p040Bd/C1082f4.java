package p040Bd;

import kotlinx.serialization.KSerializer;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Bd.f4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1082f4 implements InterfaceC1136o {
    public static final C1082f4 INSTANCE = new C1082f4();

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Object f2937a;

    static {
        EnumC1124m[] enumC1124mArr = EnumC1124m.f3037Y;
        f2937a = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C1063d.f2903s0);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C1082f4);
    }

    public final int hashCode() {
        return 357735482;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final KSerializer serializer() {
        return (KSerializer) f2937a.getValue();
    }

    public final String toString() {
        return "█";
    }
}
