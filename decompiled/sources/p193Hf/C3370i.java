package p193Hf;

import kotlinx.serialization.KSerializer;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Hf.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3370i extends AbstractC3409v {
    public static final C3370i INSTANCE = new C3370i();

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Object f10291a = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C3367h.f10278Z);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C3370i);
    }

    public final int hashCode() {
        return -684266672;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final KSerializer serializer() {
        return (KSerializer) f10291a.getValue();
    }

    public final String toString() {
        return "█";
    }
}
