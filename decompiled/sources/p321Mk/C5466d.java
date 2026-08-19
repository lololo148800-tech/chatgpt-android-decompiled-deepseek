package p321Mk;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18235b;
import p013Ab.C0420b;
import p049Bm.InterfaceC1436k;
import p229J0.C4171z3;
import p293Lh.C5062h;
import p349O0.C6018n0;
import p349O0.C6021p;
import p523V9.AbstractC8112i6;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17659D;
import p911o0.AbstractC17792x;
import p953q0.C18576e;
import p953q0.C18580g;
import p953q0.InterfaceC18554L;

/* JADX INFO: renamed from: Mk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C5466d implements InterfaceC18554L {

    /* JADX INFO: renamed from: a */
    public final C0420b f17849a;

    /* JADX INFO: renamed from: b */
    public final Map f17850b;

    /* JADX INFO: renamed from: c */
    public final long f17851c;

    /* JADX INFO: renamed from: d */
    public final int f17852d;

    public C5466d(C0420b intervals) {
        AbstractC16544l.m18094g(intervals, "intervals");
        this.f17849a = intervals;
        C18235b c18235bM9972b = AbstractC9393x3.m9972b();
        AbstractC17792x.m19523f(intervals, new C4171z3(c18235bM9972b, 17));
        Map mapM19253o = AbstractC17659D.m19253o(AbstractC9393x3.m9971a(c18235bM9972b));
        this.f17850b = mapM19253o;
        Iterator it = mapM19253o.entrySet().iterator();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        while (it.hasNext()) {
            C5463a c5463a = (C5463a) ((Map.Entry) it.next()).getValue();
            fMax = Math.max(fMax, c5463a.f17840c.f570b + c5463a.f17838a);
            fMax2 = Math.max(fMax2, c5463a.f17841d.f570b + c5463a.f17839b);
        }
        this.f17851c = AbstractC8112i6.m8603a(fMax, fMax2);
        this.f17852d = this.f17849a.f1381Z;
    }

    @Override // p953q0.InterfaceC18554L
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo5910a(Object obj) {
        return -1;
    }

    @Override // p953q0.InterfaceC18554L
    /* JADX INFO: renamed from: b */
    public final int mo5911b() {
        return this.f17852d;
    }

    @Override // p953q0.InterfaceC18554L
    /* JADX INFO: renamed from: c */
    public final Object mo5912c(int i10) {
        Object objInvoke;
        C18580g c18580gM1062r = this.f17849a.m1062r(i10);
        int i11 = i10 - c18580gM1062r.f59182a;
        InterfaceC1436k interfaceC1436k = ((C5464b) c18580gM1062r.f59184c).f17845b;
        return (interfaceC1436k == null || (objInvoke = interfaceC1436k.invoke(Integer.valueOf(i11))) == null) ? new C18576e(i10) : objInvoke;
    }

    @Override // p953q0.InterfaceC18554L
    /* JADX INFO: renamed from: d */
    public final Object mo5913d(int i10) {
        C18580g c18580gM1062r = this.f17849a.m1062r(i10);
        int i11 = i10 - c18580gM1062r.f59182a;
        C5464b c5464b = (C5464b) c18580gM1062r.f59184c;
        return c5464b.f17846c.invoke(Integer.valueOf(i11));
    }

    @Override // p953q0.InterfaceC18554L
    /* JADX INFO: renamed from: e */
    public final void mo5914e(int i10, Object key, C6021p c6021p, int i11) {
        int i12;
        AbstractC16544l.m18094g(key, "key");
        c6021p.m6526U(-603431158);
        if ((i11 & 14) == 0) {
            i12 = (c6021p.m6538d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 896) == 0) {
            i12 |= c6021p.m6542f(this) ? 256 : 128;
        }
        if ((i12 & 651) == 130 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C18580g c18580gM1062r = this.f17849a.m1062r(i10);
            ((C5464b) c18580gM1062r.f59184c).f17847d.invoke(Integer.valueOf(i10 - c18580gM1062r.f59182a), c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5062h(i10, i11, 1, this, key);
        }
    }
}
