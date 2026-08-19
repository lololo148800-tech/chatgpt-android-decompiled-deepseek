package p622Ze;

import bf.C11349D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p550We.C8826g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Ze.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C10298p implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final boolean f30582a;

    /* JADX INFO: renamed from: b */
    public final List f30583b;

    /* JADX INFO: renamed from: c */
    public final C11349D f30584c;

    /* JADX INFO: renamed from: d */
    public final C8826g f30585d;

    public C10298p(boolean z6, List loadingLoginActionIds, C11349D c11349d, C8826g c8826g) {
        AbstractC16544l.m18094g(loadingLoginActionIds, "loadingLoginActionIds");
        this.f30582a = z6;
        this.f30583b = loadingLoginActionIds;
        this.f30584c = c11349d;
        this.f30585d = c8826g;
    }

    /* JADX INFO: renamed from: e */
    public static C10298p m10880e(C10298p c10298p, ArrayList arrayList, C11349D c11349d, C8826g c8826g, int i10) {
        boolean z6 = (i10 & 1) != 0 ? c10298p.f30582a : false;
        List loadingLoginActionIds = arrayList;
        if ((i10 & 2) != 0) {
            loadingLoginActionIds = c10298p.f30583b;
        }
        if ((i10 & 4) != 0) {
            c11349d = c10298p.f30584c;
        }
        if ((i10 & 8) != 0) {
            c8826g = c10298p.f30585d;
        }
        c10298p.getClass();
        AbstractC16544l.m18094g(loadingLoginActionIds, "loadingLoginActionIds");
        return new C10298p(z6, loadingLoginActionIds, c11349d, c8826g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10298p)) {
            return false;
        }
        C10298p c10298p = (C10298p) obj;
        return this.f30582a == c10298p.f30582a && AbstractC16544l.m18089b(this.f30583b, c10298p.f30583b) && AbstractC16544l.m18089b(this.f30584c, c10298p.f30584c) && AbstractC16544l.m18089b(this.f30585d, c10298p.f30585d);
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f30583b, (this.f30582a ? 1231 : 1237) * 31, 31);
        C11349D c11349d = this.f30584c;
        int iHashCode = (iM15858x + (c11349d == null ? 0 : c11349d.hashCode())) * 31;
        C8826g c8826g = this.f30585d;
        return iHashCode + (c8826g != null ? c8826g.f27012a.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
