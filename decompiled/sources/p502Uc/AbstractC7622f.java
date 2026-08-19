package p502Uc;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p039Bc.C0886t;
import p049Bm.InterfaceC1439n;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8128k6;
import p537W0.C8410b;
import p620Zc.InterfaceC10277b;
import p951pp.AbstractC18539i;

/* JADX INFO: renamed from: Uc.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7622f {

    /* JADX INFO: renamed from: a */
    public static final long f24091a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f24092b = 0;

    static {
        C21554a c21554a = C21555b.f68260Z;
        f24091a = AbstractC8128k6.m8644j(30, EnumC21557d.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public static final void m7962a(String text, boolean z6, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(text, "text");
        c6021p.m6526U(-638252471);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(text) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(940561621);
            InterfaceC10277b interfaceC10277bM19906b = z6 ? AbstractC18539i.m19906b(c6021p) : null;
            Object objM530s = AbstractC0168G.m530s(940563972, c6021p, false);
            Object obj = C6013l.f19514a;
            if (objM530s == obj) {
                objM530s = C5997d.m6430Q(text, C5975S.f19448r0);
                c6021p.m6537c0(objM530s);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM530s;
            c6021p.m6553p(false);
            c6021p.m6524S(940566455);
            boolean zM6545h = ((i11 & 14) == 4) | c6021p.m6545h(interfaceC10277bM19906b);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == obj) {
                objM6514H = new C7621e(text, interfaceC10277bM19906b, interfaceC5985X, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, text);
            c8410b.invoke((String) interfaceC5985X.getValue(), c6021p, Integer.valueOf((i11 >> 3) & 112));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0886t(text, z6, c8410b, i10, 4);
        }
    }
}
