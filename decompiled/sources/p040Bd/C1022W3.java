package p040Bd;

import kotlinx.serialization.KSerializer;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Bd.W3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1022W3 implements InterfaceC1028X3 {
    public static final C1022W3 INSTANCE = new C1022W3();

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Object f2836a = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C1063d.f2902r0);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C1022W3);
    }

    public final int hashCode() {
        return -2012625864;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final KSerializer serializer() {
        return (KSerializer) f2836a.getValue();
    }

    public final String toString() {
        return "█";
    }
}
