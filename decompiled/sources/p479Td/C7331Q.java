package p479Td;

import kotlinx.serialization.KSerializer;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Td.Q */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7331Q extends AbstractC7343b0 {
    public static final C7331Q INSTANCE = new C7331Q();

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ Object f23238c = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C7363n.f23359p0);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7331Q);
    }

    public final int hashCode() {
        return -1836761083;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final KSerializer serializer() {
        return (KSerializer) f23238c.getValue();
    }

    public final String toString() {
        return "█";
    }
}
