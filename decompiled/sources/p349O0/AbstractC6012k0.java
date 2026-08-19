package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: O0.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6012k0 {

    /* JADX INFO: renamed from: a */
    public final C5970P f19513a;

    public AbstractC6012k0(InterfaceC1426a interfaceC1426a) {
        this.f19513a = new C5970P(interfaceC1426a);
    }

    /* JADX INFO: renamed from: a */
    public abstract C6014l0 mo6405a(Object obj);

    /* JADX INFO: renamed from: b */
    public InterfaceC5988Y0 mo6480b() {
        return this.f19513a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC5988Y0 m6481c(C6014l0 c6014l0, InterfaceC5988Y0 interfaceC5988Y0) {
        InterfaceC5988Y0 c5986x0;
        C5952G c5952g;
        InterfaceC5988Y0 interfaceC5988Y1 = null;
        interfaceC5988Y1 = null;
        interfaceC5988Y1 = null;
        interfaceC5988Y1 = null;
        interfaceC5988Y1 = null;
        interfaceC5988Y1 = null;
        if (interfaceC5988Y0 instanceof C5952G) {
            if (c6014l0.f19518d) {
                c5952g = (C5952G) interfaceC5988Y0;
                c5952g.f19390a.setValue(c6014l0.m6482a());
            }
        } else if (interfaceC5988Y0 instanceof C5986X0) {
            if ((c6014l0.f19516b || c6014l0.f19519e != null) && !c6014l0.f19518d) {
                C5986X0 c5986x1 = (C5986X0) interfaceC5988Y0;
                if (AbstractC16544l.m18089b(c6014l0.m6482a(), c5986x1.f19463a)) {
                    interfaceC5988Y1 = c5986x1;
                }
            }
        } else if (interfaceC5988Y0 instanceof C6039y) {
            c6014l0.getClass();
            AbstractC16546n abstractC16546n = ((C6039y) interfaceC5988Y0).f19675a;
        }
        if (interfaceC5988Y1 != null) {
            interfaceC5988Y1 = c5952g;
            return interfaceC5988Y1;
        }
        if (c6014l0.f19518d) {
            InterfaceC5959J0 interfaceC5959J0 = c6014l0.f19517c;
            if (interfaceC5959J0 == null) {
                interfaceC5988Y1 = c5952g;
                interfaceC5959J0 = C5975S.f19448r0;
            }
            interfaceC5988Y1 = c5952g;
            c5986x0 = new C5952G(C5997d.m6430Q(c6014l0.f19519e, interfaceC5959J0));
        } else {
            interfaceC5988Y1 = c5952g;
            c5986x0 = new C5986X0(c6014l0.m6482a());
        }
        return c5986x0;
    }
}
