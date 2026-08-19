package p1025te;

import kotlin.jvm.internal.AbstractC16544l;
import ye.EnumC21517f;

/* JADX INFO: renamed from: te.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C19857H implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final EnumC21517f f62949a;

    public C19857H(EnumC21517f state) {
        AbstractC16544l.m18094g(state, "state");
        this.f62949a = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19857H) && this.f62949a == ((C19857H) obj).f62949a;
    }

    public final int hashCode() {
        return this.f62949a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
