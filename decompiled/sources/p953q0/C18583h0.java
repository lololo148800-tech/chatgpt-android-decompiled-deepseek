package p953q0;

import java.util.LinkedHashSet;
import java.util.Map;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.C8409a;
import p537W0.C8410b;
import p562X0.AbstractC9018m;
import p562X0.C9017l;
import p562X0.InterfaceC9009d;
import p562X0.InterfaceC9015j;
import p562X0.InterfaceC9016k;
import p928oh.C18194a;

/* JADX INFO: renamed from: q0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18583h0 implements InterfaceC9016k, InterfaceC9009d {

    /* JADX INFO: renamed from: a */
    public final C9017l f59188a;

    /* JADX INFO: renamed from: b */
    public final C6002f0 f59189b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f59190c;

    public C18583h0(InterfaceC9016k interfaceC9016k, Map map) {
        C18579f0 c18579f0 = new C18579f0(interfaceC9016k, 0);
        C5984W0 c5984w0 = AbstractC9018m.f27517a;
        this.f59188a = new C9017l(map, c18579f0);
        this.f59189b = C5997d.m6430Q(null, C5975S.f19448r0);
        this.f59190c = new LinkedHashSet();
    }

    @Override // p562X0.InterfaceC9016k
    /* JADX INFO: renamed from: a */
    public final boolean mo609a(Object obj) {
        return this.f59188a.mo609a(obj);
    }

    @Override // p562X0.InterfaceC9016k
    /* JADX INFO: renamed from: b */
    public final Object mo610b(String str) {
        return this.f59188a.mo610b(str);
    }

    @Override // p562X0.InterfaceC9009d
    /* JADX INFO: renamed from: c */
    public final void mo9594c(Object obj, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-697180401);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(this) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC9009d interfaceC9009d = (InterfaceC9009d) this.f59189b.getValue();
            if (interfaceC9009d == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            interfaceC9009d.mo9594c(obj, c8410b, c6021p, i11 & 126);
            boolean zM6545h = c6021p.m6545h(this) | c6021p.m6545h(obj);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C18194a(this, 1, obj);
                c6021p.m6537c0(objM6514H);
            }
            C5997d.m6444c(obj, (InterfaceC1436k) objM6514H, c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a((InterfaceC9009d) this, obj, c8410b, i10, 25);
        }
    }

    @Override // p562X0.InterfaceC9016k
    /* JADX INFO: renamed from: d */
    public final InterfaceC9015j mo611d(String str, InterfaceC1426a interfaceC1426a) {
        return this.f59188a.mo611d(str, interfaceC1426a);
    }

    @Override // p562X0.InterfaceC9009d
    /* JADX INFO: renamed from: e */
    public final void mo9595e(Object obj) {
        InterfaceC9009d interfaceC9009d = (InterfaceC9009d) this.f59189b.getValue();
        if (interfaceC9009d == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        interfaceC9009d.mo9595e(obj);
    }
}
