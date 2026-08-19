package p402Qc;

import kotlin.jvm.internal.AbstractC16544l;
import p403Qd.C6636i;

/* JADX INFO: renamed from: Qc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6590f {

    /* JADX INFO: renamed from: a */
    public final String f21291a;

    /* JADX INFO: renamed from: b */
    public final C6636i f21292b;

    public C6590f(C6636i c6636i, String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f21291a = id2;
        this.f21292b = c6636i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6590f)) {
            return false;
        }
        C6590f c6590f = (C6590f) obj;
        return AbstractC16544l.m18089b(this.f21291a, c6590f.f21291a) && AbstractC16544l.m18089b(this.f21292b, c6590f.f21292b);
    }

    public final int hashCode() {
        return this.f21292b.hashCode() + (this.f21291a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
