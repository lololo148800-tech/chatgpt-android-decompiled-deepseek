package p221Ii;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p049Bm.InterfaceC1439n;
import p124Ei.C2532n1;
import p148Fi.AbstractC2805a1;
import p148Fi.AbstractC2817e1;
import p148Fi.AbstractC2829i1;
import p148Fi.C2794V0;
import p148Fi.C2796W0;
import p148Fi.C2798X0;
import p148Fi.C2808b1;
import p148Fi.C2811c1;
import p148Fi.C2814d1;
import p148Fi.C2820f1;
import p148Fi.C2823g1;
import p148Fi.C2826h1;
import p571X9.AbstractC9233X;
import p620Zc.EnumC10276a;
import p620Zc.InterfaceC10277b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ii.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C3730i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f11327Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3734m f11328Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3730i(C3734m c3734m, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f11328Z = c3734m;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3730i c3730i = new C3730i(this.f11328Z, interfaceC18770c);
        c3730i.f11327Y = obj;
        return c3730i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C3730i c3730i = (C3730i) create((C2532n1) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c3730i.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C2532n1 c2532n1 = (C2532n1) this.f11327Y;
        AbstractC2829i1 abstractC2829i1 = c2532n1.f7895b;
        C3734m c3734m = this.f11328Z;
        if (!AbstractC16544l.m18089b(c3734m.f11359t, abstractC2829i1) && ((!(c3734m.f11359t instanceof AbstractC2817e1) || !(abstractC2829i1 instanceof AbstractC2817e1)) && (!c3734m.f11346g || !(abstractC2829i1 instanceof C2826h1)))) {
            C3735n c3735n = c3734m.f11348i;
            c3734m.f11350k = c3735n.f11360a;
            C0564B0 c0564b0 = c3734m.f11354o;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
            c3734m.f11358s = c3734m.f11359t;
            c3734m.f11359t = abstractC2829i1;
            boolean z6 = abstractC2829i1 instanceof AbstractC2805a1;
            InterfaceC10277b interfaceC10277b = c3734m.f11342c;
            if (z6) {
                c3735n.f11374o = c3735n.f11360a;
                c3735n.f11370k = Float.MAX_VALUE;
                interfaceC10277b.mo10878h(EnumC10276a.f30526Z);
            } else if (AbstractC16544l.m18089b(abstractC2829i1, C2798X0.f8527a)) {
                c3735n.f11370k = Float.MAX_VALUE;
            } else if (AbstractC16544l.m18089b(abstractC2829i1, C2794V0.f8521a)) {
                if (c3735n.f11370k == Float.MAX_VALUE) {
                    c3735n.f11370k = c3735n.f11360a;
                }
            } else if (AbstractC16544l.m18089b(abstractC2829i1, C2814d1.f8542a)) {
                if (c3735n.f11370k == Float.MAX_VALUE) {
                    c3735n.f11370k = c3735n.f11360a;
                }
                c3735n.f11365f = c3735n.f11360a;
                if (!c3734m.f11346g) {
                    interfaceC10277b.mo10874d(250);
                }
            } else if (!AbstractC16544l.m18089b(abstractC2829i1, C2811c1.f8539a)) {
                if (AbstractC16544l.m18089b(abstractC2829i1, C2826h1.f8565a)) {
                    c3735n.f11367h = c3735n.f11360a;
                    c3734m.f11354o = AbstractC0575H.m1156D(c3734m.f11340a, null, null, new C3732k(c3734m, null), 3);
                } else if (AbstractC16544l.m18089b(abstractC2829i1, C2823g1.f8561a)) {
                    c3735n.f11369j = c3735n.f11360a;
                } else if (AbstractC16544l.m18089b(abstractC2829i1, C2808b1.f8535a)) {
                    c3735n.f11372m = c3735n.f11360a;
                } else if (AbstractC16544l.m18089b(abstractC2829i1, C2796W0.f8522a)) {
                    c3735n.f11370k = Float.MAX_VALUE;
                    c3735n.f11374o = Float.MAX_VALUE;
                } else {
                    AbstractC16544l.m18089b(abstractC2829i1, C2820f1.f8553a);
                }
            }
        }
        c3734m.f11351l = c2532n1.f7906m;
        return C17296C.f55119a;
    }
}
