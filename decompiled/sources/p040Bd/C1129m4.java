package p040Bd;

import kotlinx.serialization.KSerializer;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Bd.m4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1129m4 implements InterfaceC1136o {
    public static final C1129m4 INSTANCE = new C1129m4();

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Object f3044a;

    static {
        EnumC1124m[] enumC1124mArr = EnumC1124m.f3037Y;
        f3044a = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C1063d.f2905u0);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C1129m4);
    }

    public final int hashCode() {
        return -1278134370;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final KSerializer serializer() {
        return (KSerializer) f3044a.getValue();
    }

    public final String toString() {
        return "█";
    }
}
