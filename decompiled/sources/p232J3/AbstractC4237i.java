package p232J3;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import p083D3.C1875m;
import p1016t3.AbstractC19764N;
import p1073w3.AbstractC20800b;
import p1142z3.InterfaceC21730C;
import p133F3.C2657c;
import p133F3.C2658d;
import p658b5.C11238i;

/* JADX INFO: renamed from: J3.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4237i extends AbstractC4226a {

    /* JADX INFO: renamed from: h */
    public final HashMap f13846h = new HashMap();

    /* JADX INFO: renamed from: i */
    public Handler f13847i;

    /* JADX INFO: renamed from: j */
    public InterfaceC21730C f13848j;

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: c */
    public final void mo4989c() {
        for (C4236h c4236h : this.f13846h.values()) {
            c4236h.f13843a.m4988b(c4236h.f13844b);
        }
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: e */
    public final void mo4991e() {
        for (C4236h c4236h : this.f13846h.values()) {
            c4236h.f13843a.m4990d(c4236h.f13844b);
        }
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: i */
    public void mo4931i() {
        Iterator it = this.f13846h.values().iterator();
        while (it.hasNext()) {
            ((C4236h) it.next()).f13843a.mo4931i();
        }
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: o */
    public void mo4934o() {
        HashMap map = this.f13846h;
        for (C4236h c4236h : map.values()) {
            c4236h.f13843a.m4996n(c4236h.f13844b);
            C11238i c11238i = c4236h.f13845c;
            AbstractC4226a abstractC4226a = c4236h.f13843a;
            abstractC4226a.m4998q(c11238i);
            abstractC4226a.m4997p(c11238i);
        }
        map.clear();
    }

    /* JADX INFO: renamed from: s */
    public abstract C4253y mo4936s(Object obj, C4253y c4253y);

    /* JADX INFO: renamed from: v */
    public abstract void mo4937v(Object obj, AbstractC4226a abstractC4226a, AbstractC19764N abstractC19764N);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [J3.g, J3.z] */
    /* JADX INFO: renamed from: w */
    public final void m5008w(final Object obj, AbstractC4226a abstractC4226a) {
        HashMap map = this.f13846h;
        AbstractC20800b.m21316d(!map.containsKey(obj));
        ?? r6 = new InterfaceC4254z() { // from class: J3.g
            @Override // p232J3.InterfaceC4254z
            /* JADX INFO: renamed from: a */
            public final void mo2360a(AbstractC4226a abstractC4226a2, AbstractC19764N abstractC19764N) {
                this.f13841a.mo4937v(obj, abstractC4226a2, abstractC19764N);
            }
        };
        C11238i c11238i = new C11238i();
        c11238i.f34011p0 = this;
        int i10 = 0;
        C4253y c4253y = null;
        c11238i.f34009Z = new C2658d(this.f13809c.f8170c, i10, c4253y);
        c11238i.f34010o0 = new C2658d(this.f13810d.f8170c, i10, c4253y);
        c11238i.f34008Y = obj;
        map.put(obj, new C4236h(abstractC4226a, r6, c11238i));
        Handler handler = this.f13847i;
        handler.getClass();
        abstractC4226a.getClass();
        C2658d c2658d = abstractC4226a.f13809c;
        c2658d.getClass();
        C4202B c4202b = new C4202B();
        c4202b.f13657a = handler;
        c4202b.f13658b = c11238i;
        c2658d.f8170c.add(c4202b);
        this.f13847i.getClass();
        C2658d c2658d2 = abstractC4226a.f13810d;
        c2658d2.getClass();
        C2657c c2657c = new C2657c();
        c2657c.f8167a = c11238i;
        c2658d2.f8170c.add(c2657c);
        InterfaceC21730C interfaceC21730C = this.f13848j;
        C1875m c1875m = this.f13813g;
        AbstractC20800b.m21321i(c1875m);
        abstractC4226a.m4994j(r6, interfaceC21730C, c1875m);
        if (this.f13808b.isEmpty()) {
            abstractC4226a.m4988b(r6);
        }
    }

    /* JADX INFO: renamed from: t */
    public long mo5002t(long j10, Object obj) {
        return j10;
    }

    /* JADX INFO: renamed from: u */
    public int mo5003u(int i10, Object obj) {
        return i10;
    }
}
