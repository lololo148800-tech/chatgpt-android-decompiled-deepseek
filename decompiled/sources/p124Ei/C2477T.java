package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import p360Od.C6172d;
import p575Xd.InterfaceC9461t;

/* JADX INFO: renamed from: Ei.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C2477T implements InterfaceC2548v0 {

    /* JADX INFO: renamed from: a */
    public final C6172d f7720a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9461t f7721b;

    public C2477T(C6172d data, InterfaceC9461t action) {
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(action, "action");
        this.f7720a = data;
        this.f7721b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2477T)) {
            return false;
        }
        C2477T c2477t = (C2477T) obj;
        return AbstractC16544l.m18089b(this.f7720a, c2477t.f7720a) && AbstractC16544l.m18089b(this.f7721b, c2477t.f7721b);
    }

    public final int hashCode() {
        return this.f7721b.hashCode() + (this.f7720a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
