package p571X9;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import p049Bm.InterfaceC1436k;
import p103Dn.InterfaceC2149O0;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;

/* JADX INFO: renamed from: X9.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9233X {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5985X m9805a(InterfaceC2149O0 interfaceC2149O0, InterfaceC1436k mapper, C6021p c6021p, int i10) {
        AbstractC16544l.m18094g(interfaceC2149O0, "<this>");
        AbstractC16544l.m18094g(mapper, "mapper");
        c6021p.m6524S(-1052979947);
        c6021p.m6524S(1812589691);
        boolean zM6542f = ((((i10 & 112) ^ 48) > 32 && c6021p.m6542f(mapper)) || (i10 & 48) == 32) | c6021p.m6542f(interfaceC2149O0);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            objM6514H = AbstractC9206S2.m9772c(mapper, interfaceC2149O0);
            c6021p.m6537c0(objM6514H);
        }
        c6021p.m6553p(false);
        InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d((InterfaceC2149O0) objM6514H, c6021p);
        c6021p.m6553p(false);
        return interfaceC5985XM9642d;
    }

    /* JADX INFO: renamed from: b */
    public static final C17311n m9806b(Throwable exception) {
        AbstractC16544l.m18094g(exception, "exception");
        return new C17311n(exception);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9807c(Object obj) {
        if (obj instanceof C17311n) {
            throw ((C17311n) obj).f55138Y;
        }
    }
}
