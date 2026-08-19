package p193Hf;

import kotlinx.serialization.KSerializer;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Hf.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3373j extends AbstractC3409v {
    public static final C3373j INSTANCE = new C3373j();

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Object f10301a = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C3367h.f10279o0);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C3373j);
    }

    public final int hashCode() {
        return 2001733623;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final KSerializer serializer() {
        return (KSerializer) f10301a.getValue();
    }

    public final String toString() {
        return "█";
    }
}
