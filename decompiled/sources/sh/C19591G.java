package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20270f;

/* JADX INFO: renamed from: sh.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C19591G {

    /* JADX INFO: renamed from: a */
    public final String f62200a;

    /* JADX INFO: renamed from: b */
    public final C20270f f62201b;

    public C19591G(String str, C20270f c20270f) {
        this.f62200a = str;
        this.f62201b = c20270f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19591G)) {
            return false;
        }
        C19591G c19591g = (C19591G) obj;
        return AbstractC16544l.m18089b(this.f62200a, c19591g.f62200a) && AbstractC16544l.m18089b(this.f62201b, c19591g.f62201b);
    }

    public final int hashCode() {
        return this.f62201b.hashCode() + (this.f62200a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
