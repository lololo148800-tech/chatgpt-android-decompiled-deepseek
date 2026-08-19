package p571X9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import nc.C17567n;
import p017Af.C0492w;
import p025An.AbstractC0575H;
import p025An.C0647x0;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1442q;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p427Rc.C6853j;
import p427Rc.C6854k;
import p427Rc.C6855l;
import p923oc.C18064t;
import p946pc.AbstractC18330O;
import p946pc.C18320E;
import p988rc.C18918f;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: X9.U2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9218U2 {
    /* JADX INFO: renamed from: a */
    public static final void m9786a(C18320E c18320e, C18064t node, InterfaceC1442q interfaceC1442q, C18918f richtextRenderOptions, InterfaceC5985X markdownAnimationState, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(c18320e, "<this>");
        AbstractC16544l.m18094g(node, "node");
        AbstractC16544l.m18094g(richtextRenderOptions, "richtextRenderOptions");
        AbstractC16544l.m18094g(markdownAnimationState, "markdownAnimationState");
        c6021p.m6526U(-460534713);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(c18320e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6542f(node) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c6021p.m6545h(interfaceC1442q) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c6021p.m6542f(richtextRenderOptions) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c6021p.m6542f(markdownAnimationState) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((46811 & i12) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC18330O.m19852a(c18320e, null, new C17567n(node, interfaceC1442q, richtextRenderOptions, markdownAnimationState, 0), new C17567n(node, interfaceC1442q, richtextRenderOptions, markdownAnimationState, 2), c6021p, i12 & 14);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(c18320e, node, interfaceC1442q, richtextRenderOptions, markdownAnimationState, i10, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m9787b(ArrayList arrayList, AbstractC19687c abstractC19687c) {
        C6853j c6853j;
        Iterator it;
        if (abstractC19687c instanceof C6853j) {
            c6853j = (C6853j) abstractC19687c;
            int i10 = c6853j.f21995o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6853j.f21995o0 = i10 - Integer.MIN_VALUE;
            } else {
                c6853j = new C6853j(abstractC19687c);
            }
        } else {
            c6853j = new C6853j(abstractC19687c);
        }
        Object obj = c6853j.f21994Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6853j.f21995o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            it = arrayList.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c6853j.f21993Y;
            AbstractC9233X.m9807c(obj);
        }
        while (it.hasNext()) {
            InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) it.next();
            c6853j.f21993Y = it;
            c6853j.f21995o0 = 1;
            if (m9788c(interfaceC0627n0, c6853j) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m9788c(InterfaceC0627n0 interfaceC0627n0, AbstractC19687c abstractC19687c) {
        C6854k c6854k;
        if (abstractC19687c instanceof C6854k) {
            c6854k = (C6854k) abstractC19687c;
            int i10 = c6854k.f21998o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6854k.f21998o0 = i10 - Integer.MIN_VALUE;
            } else {
                c6854k = new C6854k(abstractC19687c);
            }
        } else {
            c6854k = new C6854k(abstractC19687c);
        }
        Object obj = c6854k.f21997Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6854k.f21998o0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    InterfaceC0627n0 interfaceC0627n1 = c6854k.f21996Y;
                    AbstractC9233X.m9807c(obj);
                    interfaceC0627n0 = interfaceC0627n1;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            c6854k.f21996Y = interfaceC0627n0;
            c6854k.f21998o0 = 1;
            Object objMo1272P = interfaceC0627n0.mo1272P(c6854k);
            interfaceC0627n0 = objMo1272P;
            if (objMo1272P == enumC19250a) {
                return enumC19250a;
            }
        } catch (CancellationException unused) {
            C0647x0 c0647x0 = C0647x0.f1902Y;
            C6855l c6855l = new C6855l(interfaceC0627n0, null);
            c6854k.f21996Y = null;
            c6854k.f21998o0 = 2;
            if (AbstractC0575H.m1168P(c0647x0, c6855l, c6854k) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
