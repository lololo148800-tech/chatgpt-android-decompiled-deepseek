package p848k6;

import p017Af.C0492w;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p229J0.C4108p0;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p610Z1.C10147n;
import p610Z1.InterfaceC10143j;
import p946pc.AbstractC18324I;
import p946pc.AbstractC18344j;
import p946pc.C18323H;
import p946pc.C18352r;

/* JADX INFO: renamed from: k6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16347a {
    /* JADX INFO: renamed from: a */
    public static final void m17946a(InterfaceC1439n interfaceC1439n, InterfaceC1441p interfaceC1441p, InterfaceC1439n interfaceC1439n2, InterfaceC1441p interfaceC1441p2, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1235399574);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6545h(interfaceC1439n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6545h(interfaceC1441p) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n2) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c6021p.m6545h(interfaceC1441p2) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 16384 : 8192;
        }
        if ((i11 & 46811) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC1439n interfaceC1439n3 = C18352r.f58597o0;
            InterfaceC1441p interfaceC1441p3 = AbstractC18344j.f58560a;
            InterfaceC1439n interfaceC1439n4 = C18352r.f58598p0;
            InterfaceC1441p interfaceC1441p4 = AbstractC18344j.f58561b;
            C6037x c6037x = AbstractC18324I.f58495a;
            if (interfaceC1439n != null) {
                interfaceC1439n3 = interfaceC1439n;
            }
            if (interfaceC1441p != null) {
                interfaceC1441p3 = interfaceC1441p;
            }
            if (interfaceC1439n2 != null) {
                interfaceC1439n4 = interfaceC1439n2;
            }
            if (interfaceC1441p2 != null) {
                interfaceC1441p4 = interfaceC1441p2;
            }
            C5997d.m6440a(c6037x.mo6405a(new C18323H(interfaceC1439n3, interfaceC1441p3, interfaceC1439n4, interfaceC1441p4)), AbstractC8411c.m8968b(-1937600214, c6021p, new C4108p0(c8410b, 17)), c6021p, 56);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(interfaceC1439n, interfaceC1441p, interfaceC1439n2, interfaceC1441p2, c8410b, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C10145l m17947b(InterfaceC10143j interfaceC10143j) {
        C10142i c10142i = new C10142i();
        c10142i.f30066c = new C10147n();
        C10145l c10145l = new C10145l(c10142i);
        c10142i.f30065b = c10145l;
        c10142i.f30064a = interfaceC10143j.getClass();
        try {
            Object objMo169b = interfaceC10143j.mo169b(c10142i);
            if (objMo169b != null) {
                c10142i.f30064a = objMo169b;
            }
        } catch (Exception e10) {
            c10145l.f30070Z.mo10746l(e10);
        }
        return c10145l;
    }
}
