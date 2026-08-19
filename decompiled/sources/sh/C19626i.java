package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20241E;

/* JADX INFO: renamed from: sh.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C19626i {

    /* JADX INFO: renamed from: a */
    public final String f62252a;

    /* JADX INFO: renamed from: b */
    public final C20241E f62253b;

    public C19626i(String str, C20241E c20241e) {
        this.f62252a = str;
        this.f62253b = c20241e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19626i)) {
            return false;
        }
        C19626i c19626i = (C19626i) obj;
        return AbstractC16544l.m18089b(this.f62252a, c19626i.f62252a) && AbstractC16544l.m18089b(this.f62253b, c19626i.f62253b);
    }

    public final int hashCode() {
        return this.f62253b.hashCode() + (this.f62252a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
