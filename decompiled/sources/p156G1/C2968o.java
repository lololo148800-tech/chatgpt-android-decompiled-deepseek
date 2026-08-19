package p156G1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0254h0;
import p017Af.C0491v;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21075b0;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.C21658D;
import p1140z1.InterfaceC21704m;
import p392Q0.C6546d;
import p523V9.AbstractC7902H5;
import p635a1.AbstractC10458p;
import p759g1.C13801c;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: G1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2968o {

    /* JADX INFO: renamed from: a */
    public final AbstractC10458p f8886a;

    /* JADX INFO: renamed from: b */
    public final boolean f8887b;

    /* JADX INFO: renamed from: c */
    public final C21658D f8888c;

    /* JADX INFO: renamed from: d */
    public final C2963j f8889d;

    /* JADX INFO: renamed from: e */
    public boolean f8890e;

    /* JADX INFO: renamed from: f */
    public C2968o f8891f;

    /* JADX INFO: renamed from: g */
    public final int f8892g;

    public C2968o(AbstractC10458p abstractC10458p, boolean z6, C21658D c21658d, C2963j c2963j) {
        this.f8886a = abstractC10458p;
        this.f8887b = z6;
        this.f8888c = c21658d;
        this.f8889d = c2963j;
        this.f8892g = c21658d.f68651Z;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ List m3790h(C2968o c2968o, boolean z6, int i10) {
        boolean z10 = (i10 & 1) != 0 ? !c2968o.f8887b : false;
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return c2968o.m3797g(z10, z6, false);
    }

    /* JADX INFO: renamed from: a */
    public final C2968o m3791a(C2960g c2960g, InterfaceC1436k interfaceC1436k) {
        C2963j c2963j = new C2963j();
        c2963j.f8881Z = false;
        c2963j.f8882o0 = false;
        interfaceC1436k.invoke(c2963j);
        C2968o c2968o = new C2968o(new C2966m(interfaceC1436k), false, new C21658D(true, this.f8892g + (c2960g != null ? 1000000000 : 2000000000)), c2963j);
        c2968o.f8890e = true;
        c2968o.f8891f = this;
        return c2968o;
    }

    /* JADX INFO: renamed from: b */
    public final void m3792b(C21658D c21658d, ArrayList arrayList, boolean z6) {
        C6546d c6546dM22013K = c21658d.m22013K();
        int i10 = c6546dM22013K.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22013K.f21182Y;
            int i11 = 0;
            do {
                C21658D c21658d2 = (C21658D) objArr[i11];
                if (c21658d2.m22024V() && (z6 || !c21658d2.f68647R0)) {
                    if (c21658d2.f68638I0.m2020g(8)) {
                        arrayList.add(AbstractC7902H5.m8197b(c21658d2, this.f8887b));
                    } else {
                        m3792b(c21658d2, arrayList, z6);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC21678Y m3793c() {
        if (this.f8890e) {
            C2968o c2968oM3799j = m3799j();
            if (c2968oM3799j != null) {
                return c2968oM3799j.m3793c();
            }
            return null;
        }
        InterfaceC21704m interfaceC21704mM8206k = AbstractC7902H5.m8206k(this.f8888c);
        if (interfaceC21704mM8206k == null) {
            interfaceC21704mM8206k = this.f8886a;
        }
        return AbstractC21690f.m22215t(interfaceC21704mM8206k, 8);
    }

    /* JADX INFO: renamed from: d */
    public final void m3794d(List list) {
        List listM3804o = m3804o(false, false);
        int size = listM3804o.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2968o c2968o = (C2968o) listM3804o.get(i10);
            if (c2968o.m3801l()) {
                list.add(c2968o);
            } else if (!c2968o.f8889d.f8882o0) {
                c2968o.m3794d(list);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final C13801c m3795e() {
        AbstractC21678Y abstractC21678YM3793c = m3793c();
        if (abstractC21678YM3793c != null) {
            if (!abstractC21678YM3793c.mo22159J0().f30972y0) {
                abstractC21678YM3793c = null;
            }
            if (abstractC21678YM3793c != null) {
                return AbstractC21075b0.m21568i(abstractC21678YM3793c).mo21528y(abstractC21678YM3793c, true);
            }
        }
        return C13801c.f43585e;
    }

    /* JADX INFO: renamed from: f */
    public final C13801c m3796f() {
        AbstractC21678Y abstractC21678YM3793c = m3793c();
        if (abstractC21678YM3793c != null) {
            if (!abstractC21678YM3793c.mo22159J0().f30972y0) {
                abstractC21678YM3793c = null;
            }
            if (abstractC21678YM3793c != null) {
                return AbstractC21075b0.m21565f(abstractC21678YM3793c);
            }
        }
        return C13801c.f43585e;
    }

    /* JADX INFO: renamed from: g */
    public final List m3797g(boolean z6, boolean z10, boolean z11) {
        if (!z6 && this.f8889d.f8882o0) {
            return C17689w.f56480Y;
        }
        if (!m3801l()) {
            return m3804o(z10, z11);
        }
        ArrayList arrayList = new ArrayList();
        m3794d(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final C2963j m3798i() {
        boolean zM3801l = m3801l();
        C2963j c2963j = this.f8889d;
        if (!zM3801l) {
            return c2963j;
        }
        C2963j c2963j2 = new C2963j();
        c2963j2.f8881Z = c2963j.f8881Z;
        c2963j2.f8882o0 = c2963j.f8882o0;
        c2963j2.f8880Y.putAll(c2963j.f8880Y);
        m3803n(c2963j2);
        return c2963j2;
    }

    /* JADX INFO: renamed from: j */
    public final C2968o m3799j() {
        C21658D c21658dM22009G;
        C2968o c2968o = this.f8891f;
        if (c2968o != null) {
            return c2968o;
        }
        C21658D c21658d = this.f8888c;
        boolean z6 = this.f8887b;
        if (!z6) {
            c21658dM22009G = null;
            break;
        }
        C2967n c2967n = C2967n.f8885Y;
        c21658dM22009G = c21658d.m22009G();
        while (true) {
            if (c21658dM22009G == null) {
                c21658dM22009G = null;
                break;
            }
            if (((Boolean) c2967n.invoke(c21658dM22009G)).booleanValue()) {
                break;
            }
            c21658dM22009G = c21658dM22009G.m22009G();
        }
        if (c21658dM22009G == null) {
            for (C21658D c21658dM22009G2 = c21658d.m22009G(); c21658dM22009G2 != null; c21658dM22009G2 = c21658dM22009G2.m22009G()) {
                if (c21658dM22009G2.f68638I0.m2020g(8)) {
                    c21658dM22009G = c21658dM22009G2;
                }
            }
            c21658dM22009G = null;
        }
        if (c21658dM22009G == null) {
            return null;
        }
        return AbstractC7902H5.m8197b(c21658dM22009G, z6);
    }

    /* JADX INFO: renamed from: k */
    public final C2963j m3800k() {
        return this.f8889d;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3801l() {
        return this.f8887b && this.f8889d.f8881Z;
    }

    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public final boolean m3802m() {
        if (!this.f8890e && m3790h(this, true, 4).isEmpty()) {
            C21658D c21658dM22009G = this.f8888c.m22009G();
            while (c21658dM22009G != null) {
                C2963j c2963jM22056q = c21658dM22009G.m22056q();
                if (c2963jM22056q == null || !c2963jM22056q.f8881Z) {
                    c21658dM22009G = c21658dM22009G.m22009G();
                } else if (c21658dM22009G == null) {
                    return true;
                }
            }
            c21658dM22009G = null;
            if (c21658dM22009G == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m3803n(C2963j c2963j) {
        if (this.f8889d.f8882o0) {
            return;
        }
        List listM3804o = m3804o(false, false);
        int size = listM3804o.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2968o c2968o = (C2968o) listM3804o.get(i10);
            if (!c2968o.m3801l()) {
                for (Map.Entry entry : c2968o.f8889d.f8880Y.entrySet()) {
                    C2974u c2974u = (C2974u) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = c2963j.f8880Y;
                    Object obj = linkedHashMap.get(c2974u);
                    AbstractC16544l.m18092e(c2974u, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object objInvoke = c2974u.f8944b.invoke(obj, value);
                    if (objInvoke != null) {
                        linkedHashMap.put(c2974u, objInvoke);
                    }
                }
                c2968o.m3803n(c2963j);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final List m3804o(boolean z6, boolean z10) {
        if (this.f8890e) {
            return C17689w.f56480Y;
        }
        ArrayList arrayList = new ArrayList();
        m3792b(this.f8888c, arrayList, z10);
        if (z6) {
            C2974u c2974u = C2971r.f8933s;
            C2963j c2963j = this.f8889d;
            LinkedHashMap linkedHashMap = c2963j.f8880Y;
            Object obj = linkedHashMap.get(c2974u);
            if (obj == null) {
                obj = null;
            }
            C2960g c2960g = (C2960g) obj;
            if (c2960g != null && c2963j.f8881Z && !arrayList.isEmpty()) {
                arrayList.add(m3791a(c2960g, new C0254h0(c2960g, 18)));
            }
            C2974u c2974u2 = C2971r.f8915a;
            if (linkedHashMap.containsKey(c2974u2) && !arrayList.isEmpty() && c2963j.f8881Z) {
                Object obj2 = linkedHashMap.get(c2974u2);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) AbstractC17680n.m19343S(list) : null;
                if (str != null) {
                    arrayList.add(0, m3791a(null, new C0491v(str, 13)));
                }
            }
        }
        return arrayList;
    }
}
