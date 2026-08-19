package p193Hf;

import kotlinx.serialization.KSerializer;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Hf.E */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3303E implements InterfaceC3305F {
    public static final C3303E INSTANCE = new C3303E();

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Object f10067a = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C3367h.f10281q0);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C3303E);
    }

    public final int hashCode() {
        return -916358648;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final KSerializer serializer() {
        return (KSerializer) f10067a.getValue();
    }

    public final String toString() {
        return "█";
    }
}
