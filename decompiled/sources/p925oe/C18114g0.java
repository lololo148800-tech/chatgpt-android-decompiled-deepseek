package p925oe;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import ni.C17627a;
import p103Dn.AbstractC2124C;
import p103Dn.C2133G0;
import p103Dn.C2217y0;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p403Qd.C6632g;
import p403Qd.C6636i;
import p571X9.AbstractC9233X;
import p576Xe.C9501z;
import p909nm.C17691y;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C18114g0 {

    /* JADX INFO: renamed from: a */
    public final C18122k0 f57783a;

    /* JADX INFO: renamed from: b */
    public final C18077B f57784b;

    /* JADX INFO: renamed from: c */
    public final C2217y0 f57785c;

    public C18114g0(C17627a c17627a, C18122k0 c18122k0, C18077B c18077b) {
        this.f57783a = c18122k0;
        this.f57784b = c18077b;
        this.f57785c = AbstractC2124C.m3198B(new C9501z(c18122k0.f64176f, 4), c17627a, C2133G0.f6536a, C17691y.f56482Y);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m19714a(C6636i c6636i, AbstractC19687c abstractC19687c) {
        C18110e0 c18110e0;
        C18114g0 c18114g0;
        Object next;
        Object c21952p1;
        C18122k0 c18122k0;
        C6632g c6632g;
        if (abstractC19687c instanceof C18110e0) {
            c18110e0 = (C18110e0) abstractC19687c;
            int i10 = c18110e0.f57770q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18110e0.f57770q0 = i10 - Integer.MIN_VALUE;
            } else {
                c18110e0 = new C18110e0(this, abstractC19687c);
            }
        } else {
            c18110e0 = new C18110e0(this, abstractC19687c);
        }
        Object objM3221t = c18110e0.f57768o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18110e0.f57770q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                c6636i = c18110e0.f57767Z;
                c18114g0 = (C18114g0) c18110e0.f57766Y;
                AbstractC9233X.m9807c(objM3221t);
            } else if (i11 == 2) {
                c6636i = c18110e0.f57767Z;
                c18114g0 = (C18114g0) c18110e0.f57766Y;
                AbstractC9233X.m9807c(objM3221t);
                c21952p1 = (AbstractC21955Q1) objM3221t;
                if (c21952p1 instanceof C21952P1) {
                    c18122k0 = c18114g0.f57783a;
                    c6632g = new C6632g(c6636i, 1);
                    c18110e0.f57766Y = c21952p1;
                    c18110e0.f57767Z = null;
                    c18110e0.f57770q0 = 3;
                    if (c18122k0.m21029b(c6632g, c18110e0) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM3221t);
        c18110e0.f57766Y = this;
        c18110e0.f57767Z = c6636i;
        c18110e0.f57770q0 = 1;
        objM3221t = AbstractC2124C.m3221t(this.f57783a.f64176f, c18110e0);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c18114g0 = this;
        Iterator it = ((C18120j0) objM3221t).f57802b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC16544l.m18089b(((C18108d0) next).f57761a, c6636i.f21379a));
        C18108d0 c18108d0 = (C18108d0) next;
        if (AbstractC16544l.m18089b(c18108d0 != null ? Boolean.valueOf(c18108d0.f57762b) : null, Boolean.TRUE)) {
            C18077B c18077b = c18114g0.f57784b;
            c18110e0.f57766Y = c18114g0;
            c18110e0.f57767Z = c6636i;
            c18110e0.f57770q0 = 2;
            objM3221t = c18077b.m19700e(c6636i, c18110e0);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            c21952p1 = (AbstractC21955Q1) objM3221t;
        } else {
            c21952p1 = new C21952P1(c17296c);
        }
        if (c21952p1 instanceof C21952P1) {
            c18122k0 = c18114g0.f57783a;
            c6632g = new C6632g(c6636i, 1);
            c18110e0.f57766Y = c21952p1;
            c18110e0.f57767Z = null;
            c18110e0.f57770q0 = 3;
            if (c18122k0.m21029b(c6632g, c18110e0) == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }
}
