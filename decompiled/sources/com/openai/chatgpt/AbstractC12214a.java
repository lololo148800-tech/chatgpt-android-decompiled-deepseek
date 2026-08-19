package com.openai.chatgpt;

import androidx.navigation.AbstractC11122c;
import com.openai.feature.rootviewmodel.RootViewModel;
import io.sentry.AbstractC15152P0;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p002A0.C0122V;
import p003A1.C0178J0;
import p003A1.C0184L0;
import p003A1.C0257i0;
import p025An.C0644w;
import p039Bc.C0871e;
import p039Bc.C0873g;
import p039Bc.C0878l;
import p039Bc.C0880n;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p092Dc.C1998o;
import p1061vb.C20513d;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1155zi.AbstractC21933K1;
import p1155zi.C21949O1;
import p1155zi.C22011h0;
import p1155zi.EnumC21895B;
import p318Mh.C5369J;
import p318Mh.C5373L;
import p318Mh.C5382V;
import p318Mh.C5383W;
import p318Mh.C5385Y;
import p318Mh.C5391c;
import p318Mh.C5394d0;
import p318Mh.C5399g;
import p318Mh.C5430v0;
import p318Mh.C5431w;
import p318Mh.C5434x0;
import p318Mh.C5436y0;
import p337Nd.C5709b;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p523V9.AbstractC8159o5;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8871g;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9239Y;
import p594Y9.AbstractC9834X3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p857kl.C16440G;
import p909nm.AbstractC17680n;
import ug.AbstractC20236s;
import ug.C20225h;
import ug.C20226i;
import ug.C20227j;
import ug.C20228k;
import ug.C20229l;
import ug.C20230m;
import ug.C20231n;
import ug.C20232o;
import ug.C20233p;
import ug.C20234q;
import ug.C20235r;

/* JADX INFO: renamed from: com.openai.chatgpt.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12214a {
    /* JADX INFO: renamed from: a */
    public static final void m14223a(AbstractC20236s rootViewState, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(rootViewState, "rootViewState");
        c6021p.m6526U(1421829023);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(rootViewState) : c6021p.m6545h(rootViewState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (((i11 | 48) & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            C17314q c17314qM9800c = AbstractC9227W.m9800c(C0871e.f2559p0);
            C20513d c20513d = ((C1998o) c17314qM9800c.getValue()).f6032a;
            AbstractC8159o5.m8721b(AbstractC8411c.m8969c(268924548, c6021p, new C0880n(AbstractC8871g.m9550a(EnumC21895B.f69419Z, c6021p, 62), AbstractC9239Y.m9814a("MainApp", c6021p), rootViewState, interfaceC10459q, c17314qM9800c)), c6021p, 6);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(rootViewState, interfaceC10459q, i10, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX INFO: renamed from: b */
    public static final void m14224b(AbstractC20236s destination, RootViewModel rootViewModel, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        String strM5885a;
        boolean z6;
        c6021p.m6526U(2002569875);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(destination) : c6021p.m6545h(destination) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(rootViewModel) : c6021p.m6545h(rootViewModel) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            C20226i c20226i = destination instanceof C20226i ? (C20226i) destination : null;
            boolean z10 = c20226i != null;
            boolean z11 = (c20226i == null || c20226i.f64019c) ? false : true;
            String startConversationId = ((C22011h0) AbstractC9834X3.m10480c(new Object[0], C5709b.f18497Y, C0871e.f2558o0, c6021p, 3072).getValue()).f69652a;
            AbstractC16544l.m18094g(destination, "$this$destination");
            AbstractC16544l.m18094g(startConversationId, "startConversationId");
            if (destination instanceof C20226i) {
                strM5885a = C5431w.m5902f(C5431w.f17746g, null, startConversationId, false, false, 13);
            } else {
                boolean z12 = destination instanceof C20232o;
                C5391c c5391c = C5391c.f17646Z;
                if (z12) {
                    C5385Y c5385y = C5385Y.f17639h;
                    c5385y.getClass();
                    strM5885a = c5385y.m5885a(c5391c);
                } else if (destination instanceof C20225h) {
                    C5399g c5399g = C5399g.f17664h;
                    c5399g.getClass();
                    strM5885a = c5399g.m5885a(c5391c);
                } else if (destination instanceof C20230m) {
                    C5382V c5382v = C5382V.f17636h;
                    c5382v.getClass();
                    strM5885a = c5382v.m5885a(c5391c);
                } else if (destination instanceof C20231n) {
                    AbstractC21933K1 abstractC21933K1 = ((C20231n) destination).f64026b;
                    C21949O1 c21949o1 = abstractC21933K1 instanceof C21949O1 ? (C21949O1) abstractC21933K1 : null;
                    if (c21949o1 != null) {
                        int i12 = C16440G.f51008v0.f51013Y;
                        Integer num = c21949o1.f69506b;
                        if (num != null && num.intValue() == i12) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        C5382V c5382v2 = C5382V.f17636h;
                        c5382v2.getClass();
                        strM5885a = c5382v2.m5885a(c5391c);
                    } else {
                        C5383W c5383w = C5383W.f17637h;
                        c5383w.getClass();
                        strM5885a = c5383w.m5885a(c5391c);
                    }
                } else if (destination instanceof C20233p) {
                    C5394d0 c5394d0 = C5394d0.f17658h;
                    c5394d0.getClass();
                    strM5885a = c5394d0.m5885a(c5391c);
                } else if (destination instanceof C20235r) {
                    C5434x0 c5434x0 = C5434x0.f17769h;
                    c5434x0.getClass();
                    strM5885a = c5434x0.m5885a(c5391c);
                } else if (destination instanceof C20228k) {
                    C5373L c5373l = C5373L.f17622h;
                    c5373l.getClass();
                    strM5885a = c5373l.m5885a(c5391c);
                } else if (destination instanceof C20229l) {
                    C5430v0 c5430v0 = C5430v0.f17745h;
                    c5430v0.getClass();
                    strM5885a = c5430v0.m5885a(c5391c);
                } else if (destination instanceof C20227j) {
                    C5369J c5369j = C5369J.f17613h;
                    c5369j.getClass();
                    strM5885a = c5369j.m5885a(c5391c);
                } else {
                    if (!(destination instanceof C20234q)) {
                        throw new C0644w();
                    }
                    C5436y0 c5436y0 = C5436y0.f17775h;
                    c5436y0.getClass();
                    strM5885a = c5436y0.m5885a(c5391c);
                }
            }
            AbstractC16421b.m18008a(new Object[]{destination.mo21016e()}, AbstractC8411c.m8969c(-27662270, c6021p, new C0878l(c8870f, strM5885a, interfaceC10459q, destination, rootViewModel, z11, z10)), c6021p, 48);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(destination, rootViewModel, interfaceC10459q, i10, 6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m14225c(AbstractC11122c abstractC11122c, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-869879721);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(abstractC11122c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            String strM19349Y = AbstractC17680n.m19349Y((List) AbstractC9112C3.m9642d(abstractC11122c.f33537i, c6021p).getValue(), " > ", null, null, 0, null, C0873g.f2566p0, 30);
            AbstractC15152P0.m16327a("NavController " + abstractC11122c.hashCode() + " backstack: " + strM19349Y);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66457b);
            c6021p.m6524S(106537229);
            boolean zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(abstractC11122c);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C0122V(abstractC11122c, 10, interfaceC20904w);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6444c(abstractC11122c, (InterfaceC1436k) objM6514H, c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(abstractC11122c, i10, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m14226d(RootViewModel rootViewModel, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1804524569);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(rootViewModel) : c6021p.m6545h(rootViewModel) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(-752737858);
            boolean zM6545h = ((i11 & 14) == 4 || ((i11 & 8) != 0 && c6021p.m6545h(rootViewModel))) | c6021p.m6545h(c8870f);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new MainActivityKt$RootViewModelEffectHandler$1$1(rootViewModel, c8870f, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, rootViewModel);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new MainActivityKt$RootViewModelEffectHandler$2(rootViewModel, i10);
        }
    }
}
