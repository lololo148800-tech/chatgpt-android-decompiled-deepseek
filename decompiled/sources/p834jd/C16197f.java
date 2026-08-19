package p834jd;

import kotlinx.serialization.KSerializer;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: jd.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C16197f extends AbstractC16201j {
    public static final C16197f INSTANCE = new C16197f();

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ Object f50275b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C16195d.f50273o0);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C16197f);
    }

    public final int hashCode() {
        return -758192246;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final KSerializer serializer() {
        return (KSerializer) f50275b.getValue();
    }

    public final String toString() {
        return "█";
    }
}
