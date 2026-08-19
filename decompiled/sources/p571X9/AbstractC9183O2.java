package p571X9;

import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0383c;
import p008A6.C0386f;
import p025An.C0625m0;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p409Qk.C6752c;
import p409Qk.C6754e;
import p509Uk.C7708a;
import p509Uk.C7709b;
import p509Uk.C7713f;
import p894n0.C17412r;
import p894n0.InterfaceC17406l;
import p972qm.InterfaceC18774g;

/* JADX INFO: renamed from: X9.O2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9183O2 {
    /* JADX INFO: renamed from: a */
    public static final C6752c m9738a(C7708a engineFactory, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(engineFactory, "engineFactory");
        C6754e c6754e = new C6754e();
        interfaceC1436k.invoke(c6754e);
        InterfaceC1436k block = c6754e.f21684d;
        AbstractC16544l.m18094g(block, "block");
        C7709b c7709b = new C7709b();
        c7709b.f24286a = new C0383c(10);
        c7709b.f24287b = 10;
        block.invoke(c7709b);
        C7713f c7713f = new C7713f(c7709b);
        C6752c c6752c = new C6752c(c7713f, c6754e, true);
        InterfaceC18774g interfaceC18774g = c6752c.f21670q0.get(C0625m0.f1875Y);
        AbstractC16544l.m18091d(interfaceC18774g);
        ((InterfaceC0627n0) interfaceC18774g).mo1271H0(new C0386f(c7713f, 7));
        return c6752c;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5985X m9739b(InterfaceC17406l interfaceC17406l, C6021p c6021p) {
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (objM6514H == c5975s) {
            objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
            c6021p.m6537c0(objM6514H);
        }
        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
        Object objM6514H2 = c6021p.m6514H();
        if (objM6514H2 == c5975s) {
            objM6514H2 = new C17412r(interfaceC17406l, interfaceC5985X, null);
            c6021p.m6537c0(objM6514H2);
        }
        C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, interfaceC17406l);
        return interfaceC5985X;
    }
}
