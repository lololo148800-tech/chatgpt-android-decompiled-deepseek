package af;

import bf.C11352G;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: af.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C10589q implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f31439a;

    /* JADX INFO: renamed from: b */
    public final C11352G f31440b;

    /* JADX INFO: renamed from: c */
    public final boolean f31441c;

    public C10589q(String gizmoId, C11352G c11352g, boolean z6) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        this.f31439a = gizmoId;
        this.f31440b = c11352g;
        this.f31441c = z6;
    }

    /* JADX INFO: renamed from: e */
    public static C10589q m10984e(C10589q c10589q, C11352G c11352g, boolean z6, int i10) {
        String gizmoId = c10589q.f31439a;
        if ((i10 & 2) != 0) {
            c11352g = c10589q.f31440b;
        }
        if ((i10 & 4) != 0) {
            z6 = c10589q.f31441c;
        }
        c10589q.getClass();
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        return new C10589q(gizmoId, c11352g, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10589q)) {
            return false;
        }
        C10589q c10589q = (C10589q) obj;
        return AbstractC16544l.m18089b(this.f31439a, c10589q.f31439a) && AbstractC16544l.m18089b(this.f31440b, c10589q.f31440b) && this.f31441c == c10589q.f31441c;
    }

    public final int hashCode() {
        int iHashCode = this.f31439a.hashCode() * 31;
        C11352G c11352g = this.f31440b;
        return ((iHashCode + (c11352g == null ? 0 : c11352g.hashCode())) * 31) + (this.f31441c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
