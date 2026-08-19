package p537W0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p042Bf.C1269k;
import p049Bm.InterfaceC1427b;
import p049Bm.InterfaceC1428c;
import p049Bm.InterfaceC1429d;
import p049Bm.InterfaceC1430e;
import p049Bm.InterfaceC1431f;
import p049Bm.InterfaceC1432g;
import p049Bm.InterfaceC1433h;
import p049Bm.InterfaceC1434i;
import p049Bm.InterfaceC1435j;
import p049Bm.InterfaceC1437l;
import p049Bm.InterfaceC1438m;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1441p;
import p049Bm.InterfaceC1442q;
import p049Bm.InterfaceC1443r;
import p049Bm.InterfaceC1444s;
import p049Bm.InterfaceC1445t;
import p049Bm.InterfaceC1446u;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6029t;
import p382Pf.C6401d;

/* JADX INFO: renamed from: W0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8410b implements InterfaceC1439n, InterfaceC1440o, InterfaceC1441p, InterfaceC1442q, InterfaceC1443r, InterfaceC1444s, InterfaceC1445t, InterfaceC1446u, InterfaceC1427b, InterfaceC1428c, InterfaceC1429d, InterfaceC1430e, InterfaceC1431f, InterfaceC1432g, InterfaceC1433h, InterfaceC1434i, InterfaceC1435j, InterfaceC1437l, InterfaceC1438m {

    /* JADX INFO: renamed from: Y */
    public final int f26151Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f26152Z;

    /* JADX INFO: renamed from: o0 */
    public Object f26153o0;

    /* JADX INFO: renamed from: p0 */
    public C6018n0 f26154p0;

    /* JADX INFO: renamed from: q0 */
    public ArrayList f26155q0;

    public C8410b(Object obj, boolean z6, int i10) {
        this.f26151Y = i10;
        this.f26152Z = z6;
        this.f26153o0 = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m8962a(Object obj, C6021p c6021p, int i10) {
        c6021p.m6526U(this.f26151Y);
        m8965e(c6021p);
        int iM8967a = c6021p.m6542f(this) ? AbstractC8411c.m8967a(2, 1) : AbstractC8411c.m8967a(1, 1);
        Object obj2 = this.f26153o0;
        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        AbstractC16529F.m18081e(3, obj2);
        Object objInvoke = ((InterfaceC1440o) obj2).invoke(obj, c6021p, Integer.valueOf(iM8967a | i10));
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(this, obj, i10, 7);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: b */
    public final Object m8963b(Object obj, Object obj2, C6021p c6021p, int i10) {
        c6021p.m6526U(this.f26151Y);
        m8965e(c6021p);
        int iM8967a = c6021p.m6542f(this) ? AbstractC8411c.m8967a(2, 2) : AbstractC8411c.m8967a(1, 2);
        Object obj3 = this.f26153o0;
        AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        AbstractC16529F.m18081e(4, obj3);
        Object objMo985d = ((InterfaceC1441p) obj3).mo985d(obj, obj2, c6021p, Integer.valueOf(iM8967a | i10));
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(this, obj, obj2, i10, 0);
        }
        return objMo985d;
    }

    /* JADX INFO: renamed from: c */
    public final Object m8964c(Object obj, Object obj2, Object obj3, C6021p c6021p, int i10) {
        c6021p.m6526U(this.f26151Y);
        m8965e(c6021p);
        int iM8967a = c6021p.m6542f(this) ? AbstractC8411c.m8967a(2, 3) : AbstractC8411c.m8967a(1, 3);
        Object obj4 = this.f26153o0;
        AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        AbstractC16529F.m18081e(5, obj4);
        Object objMo2052j = ((InterfaceC1442q) obj4).mo2052j(obj, obj2, obj3, c6021p, Integer.valueOf(iM8967a | i10));
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 15, this, obj, obj2, obj3);
        }
        return objMo2052j;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        return m8963b(obj, obj2, (C6021p) obj3, ((Number) obj4).intValue());
    }

    /* JADX INFO: renamed from: e */
    public final void m8965e(C6021p c6021p) {
        C6018n0 c6018n0M6560w;
        if (!this.f26152Z || (c6018n0M6560w = c6021p.m6560w()) == null) {
            return;
        }
        c6021p.getClass();
        c6018n0M6560w.f19533a |= 1;
        if (AbstractC8411c.m8970d(this.f26154p0, c6018n0M6560w)) {
            this.f26154p0 = c6018n0M6560w;
            return;
        }
        ArrayList arrayList = this.f26155q0;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f26155q0 = arrayList2;
            arrayList2.add(c6018n0M6560w);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC8411c.m8970d((C6018n0) arrayList.get(i10), c6018n0M6560w)) {
                arrayList.set(i10, c6018n0M6560w);
                return;
            }
        }
        arrayList.add(c6018n0M6560w);
    }

    /* JADX INFO: renamed from: f */
    public final void m8966f(AbstractC16546n abstractC16546n) {
        if (AbstractC16544l.m18089b(this.f26153o0, abstractC16546n)) {
            return;
        }
        boolean z6 = this.f26153o0 == null;
        this.f26153o0 = abstractC16546n;
        if (z6 || !this.f26152Z) {
            return;
        }
        C6018n0 c6018n0 = this.f26154p0;
        if (c6018n0 != null) {
            C6029t c6029t = c6018n0.f19534b;
            if (c6029t != null) {
                c6029t.m6578o(c6018n0, null);
            }
            this.f26154p0 = null;
        }
        ArrayList arrayList = this.f26155q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C6018n0 c6018n1 = (C6018n0) arrayList.get(i10);
                C6029t c6029t2 = c6018n1.f19534b;
                if (c6029t2 != null) {
                    c6029t2.m6578o(c6018n1, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        int iIntValue = ((Number) obj2).intValue();
        c6021p.m6526U(this.f26151Y);
        m8965e(c6021p);
        int iM8967a = iIntValue | (c6021p.m6542f(this) ? AbstractC8411c.m8967a(2, 0) : AbstractC8411c.m8967a(1, 0));
        Object obj3 = this.f26153o0;
        AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        AbstractC16529F.m18081e(2, obj3);
        Object objInvoke = ((InterfaceC1439n) obj3).invoke(c6021p, Integer.valueOf(iM8967a));
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            AbstractC16529F.m18081e(2, this);
            c6018n0M6555r.f19536d = this;
        }
        return objInvoke;
    }

    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m8964c(obj, obj2, obj3, (C6021p) obj4, ((Number) obj5).intValue());
    }

    @Override // p049Bm.InterfaceC1440o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m8962a(obj, (C6021p) obj2, ((Number) obj3).intValue());
    }
}
