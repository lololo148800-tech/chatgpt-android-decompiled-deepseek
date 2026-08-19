package p148Fi;

import kotlinx.serialization.KSerializer;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Fi.Y */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2799Y extends AbstractC2841n {
    public static final C2799Y INSTANCE = new C2799Y();

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Object f8528a = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C2815e.f8546q0);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2799Y);
    }

    public final int hashCode() {
        return -252388757;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final KSerializer serializer() {
        return (KSerializer) f8528a.getValue();
    }

    public final String toString() {
        return "█";
    }
}
