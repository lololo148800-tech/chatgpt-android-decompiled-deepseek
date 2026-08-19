package p349O0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p007A5.C0376k;
import p537W0.C8410b;
import p537W0.C8414f;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: O0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6017n extends AbstractC6025r {

    /* JADX INFO: renamed from: a */
    public final int f19526a;

    /* JADX INFO: renamed from: b */
    public final boolean f19527b;

    /* JADX INFO: renamed from: c */
    public final boolean f19528c;

    /* JADX INFO: renamed from: d */
    public HashSet f19529d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f19530e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final C6002f0 f19531f = C5997d.m6430Q(C8414f.f26160p0, C5975S.f19446p0);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6021p f19532g;

    public C6017n(C6021p c6021p, int i10, boolean z6, boolean z10, C0376k c0376k) {
        this.f19532g = c6021p;
        this.f19526a = i10;
        this.f19527b = z6;
        this.f19528c = z10;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: a */
    public final void mo6483a(C6029t c6029t, C8410b c8410b) {
        this.f19532g.f19566b.mo6483a(c6029t, c8410b);
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: b */
    public final void mo6484b() {
        this.f19532g.f19590z--;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: c */
    public final boolean mo6485c() {
        return this.f19532g.f19566b.mo6485c();
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: d */
    public final boolean mo6486d() {
        return this.f19527b;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: e */
    public final boolean mo6487e() {
        return this.f19528c;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: f */
    public final InterfaceC6008i0 mo6488f() {
        return (InterfaceC6008i0) this.f19531f.getValue();
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: g */
    public final int mo6489g() {
        return this.f19526a;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: h */
    public final InterfaceC18776i mo6490h() {
        return this.f19532g.f19566b.mo6490h();
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: i */
    public final void mo6491i(C6029t c6029t) {
        C6021p c6021p = this.f19532g;
        c6021p.f19566b.mo6491i(c6021p.f19571g);
        c6021p.f19566b.mo6491i(c6029t);
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: j */
    public final void mo6492j(Set set) {
        HashSet hashSet = this.f19529d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f19529d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: k */
    public final void mo6493k(C6021p c6021p) {
        this.f19530e.add(c6021p);
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: l */
    public final void mo6494l(C6029t c6029t) {
        this.f19532g.f19566b.mo6494l(c6029t);
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: m */
    public final void mo6495m() {
        this.f19532g.f19590z++;
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: n */
    public final void mo6496n(C6021p c6021p) {
        HashSet<Set> hashSet = this.f19529d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                AbstractC16544l.m18092e(c6021p, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c6021p.f19567c);
            }
        }
        LinkedHashSet linkedHashSet = this.f19530e;
        AbstractC16529F.m18077a(linkedHashSet);
        linkedHashSet.remove(c6021p);
    }

    @Override // p349O0.AbstractC6025r
    /* JADX INFO: renamed from: o */
    public final void mo6497o(C6029t c6029t) {
        this.f19532g.f19566b.mo6497o(c6029t);
    }

    /* JADX INFO: renamed from: p */
    public final void m6498p() {
        LinkedHashSet<C6021p> linkedHashSet = this.f19530e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f19529d;
        if (hashSet != null) {
            for (C6021p c6021p : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c6021p.f19567c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
