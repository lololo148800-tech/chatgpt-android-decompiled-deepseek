package de;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import gd.C13870L;
import gd.C13940g1;
import gd.C14008x1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import mm.InterfaceC17302e;
import nc.AbstractC17563j;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1442q;
import p092Dc.C1991h;
import p1081wc.InterfaceC20904w;
import p1127yf.C21532g;
import p1127yf.C21533h;
import p1127yf.C21536k;
import p1155zi.C22011h0;
import p1155zi.EnumC21973X;
import p124Ei.C2550w0;
import p169Gf.C3048l;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4048f0;
import p229J0.C3949M0;
import p229J0.C4042e0;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p479Td.C7320F;
import p482Tg.C7448e;
import p523V9.AbstractC8018W4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8467E;
import p553Wh.AbstractC8871g;
import p575Xd.C9436E;
import p620Zc.InterfaceC10277b;
import p623Zf.C10312h;
import p690cp.AbstractC12935u;
import p774h1.C14365u;
import p870le.C16898o0;
import p909nm.AbstractC17659D;
import p911o0.C17767k0;
import p911o0.InterfaceC17740U;
import p946pc.C18320E;
import p951pp.AbstractC18539i;
import p988rc.C18918f;

/* JADX INFO: renamed from: de.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C13077e extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41539Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f41540Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f41541o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC20904w f41542p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f41543q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC17302e f41544r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f41545s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f41546t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13077e(C7320F c7320f, boolean z6, InterfaceC1436k interfaceC1436k, String str, String str2, C9436E c9436e, InterfaceC20904w interfaceC20904w) {
        super(3);
        this.f41543q0 = c7320f;
        this.f41540Z = z6;
        this.f41544r0 = interfaceC1436k;
        this.f41541o0 = str;
        this.f41545s0 = str2;
        this.f41546t0 = c9436e;
        this.f41542p0 = interfaceC20904w;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z6;
        boolean z10;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC20904w interfaceC20904w = this.f41542p0;
        String str = this.f41541o0;
        boolean z11 = this.f41540Z;
        Object obj4 = this.f41543q0;
        C5975S c5975s = C6013l.f19514a;
        Object obj5 = this.f41545s0;
        Object obj6 = this.f41546t0;
        InterfaceC17302e interfaceC17302e = this.f41544r0;
        switch (this.f41539Y) {
            case 0:
                InterfaceC17740U FlowRow = (InterfaceC17740U) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(FlowRow, "$this$FlowRow");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    Iterator it = ((List) obj4).iterator();
                    while (it.hasNext()) {
                        EnumC21973X enumC21973X = (EnumC21973X) it.next();
                        Map mapM19244f = AbstractC17659D.m19244f(new C17309l("location", "banner_description"), new C17309l("type", str), new C17309l("isHardBlock", Boolean.valueOf(z11)), new C17309l("action", enumC21973X.f69554Y));
                        int i10 = AbstractC13076d.f41538a[enumC21973X.ordinal()];
                        if (i10 == 1) {
                            str = str;
                            c6021p.m6524S(948648947);
                            c6021p.m6524S(169150022);
                            boolean zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(mapM19244f);
                            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) interfaceC17302e;
                            boolean zM6542f = zM6545h | c6021p.m6542f(interfaceC1426a);
                            Object objM6514H = c6021p.m6514H();
                            if (zM6542f || objM6514H == c5975s) {
                                objM6514H = new C7448e(interfaceC20904w, mapM19244f, interfaceC1426a, 16);
                                c6021p.m6537c0(objM6514H);
                            }
                            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
                            c6021p.m6553p(false);
                            String strM8676d = AbstractC8142m4.m8676d(R.string.rate_limit_banner_log_in, c6021p);
                            C17767k0 c17767k0 = AbstractC4048f0.f12769a;
                            C5984W0 c5984w0 = AbstractC3959O0.f12302a;
                            it = it;
                            C4042e0 c4042e0M4733b = AbstractC4048f0.m4733b(((C3949M0) c6021p.m6548k(c5984w0)).f12236r, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, c6021p, 12);
                            c6021p.m6524S(169173070);
                            boolean zM6542f2 = c6021p.m6542f(interfaceC1436k);
                            Object objM6514H2 = c6021p.m6514H();
                            if (zM6542f2 || objM6514H2 == c5975s) {
                                objM6514H2 = new C10312h(6, interfaceC1436k);
                                c6021p.m6537c0(objM6514H2);
                            }
                            c6021p.m6553p(false);
                            AbstractC8018W4.m8347g(strM8676d, (InterfaceC1426a) objM6514H2, c4042e0M4733b, c6021p, 0, 0);
                            String strM8676d2 = AbstractC8142m4.m8676d(R.string.rate_limit_banner_sign_up, c6021p);
                            C4042e0 c4042e0M4733b2 = AbstractC4048f0.m4733b(C14365u.f45053c, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, c6021p, 12);
                            c6021p.m6524S(169187248);
                            boolean zM6542f3 = c6021p.m6542f(interfaceC1436k);
                            Object objM6514H3 = c6021p.m6514H();
                            if (zM6542f3 || objM6514H3 == c5975s) {
                                objM6514H3 = new C10312h(7, interfaceC1436k);
                                c6021p.m6537c0(objM6514H3);
                            }
                            c6021p.m6553p(false);
                            AbstractC8018W4.m8347g(strM8676d2, (InterfaceC1426a) objM6514H3, c4042e0M4733b2, c6021p, 0, 0);
                            c6021p.m6553p(false);
                        } else if (i10 != 2) {
                            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) obj6;
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    c6021p.m6524S(951450634);
                                    String strM8676d3 = AbstractC8142m4.m8676d(R.string.rate_limit_banner_get_pro, c6021p);
                                    c6021p.m6524S(169244176);
                                    boolean zM6545h2 = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(mapM19244f) | c6021p.m6542f(interfaceC1426a2);
                                    Object objM6514H4 = c6021p.m6514H();
                                    if (zM6545h2 || objM6514H4 == c5975s) {
                                        objM6514H4 = new C13075c(interfaceC20904w, mapM19244f, interfaceC1426a2, 2);
                                        c6021p.m6537c0(objM6514H4);
                                    }
                                    c6021p.m6553p(false);
                                    AbstractC8018W4.m8347g(strM8676d3, (InterfaceC1426a) objM6514H4, null, c6021p, 0, 4);
                                    c6021p.m6553p(false);
                                } else if (i10 != 5) {
                                    c6021p.m6524S(951951284);
                                    c6021p.m6553p(false);
                                    it = it;
                                    str = str;
                                } else {
                                    c6021p.m6524S(169254866);
                                    c6021p.m6553p(false);
                                }
                                str = str;
                            } else {
                                c6021p.m6524S(950732643);
                                String strM8676d4 = AbstractC8142m4.m8676d(R.string.rate_limit_banner_get_plus, c6021p);
                                C17767k0 c17767k1 = AbstractC4048f0.f12769a;
                                C4042e0 c4042e0M4733b3 = AbstractC4048f0.m4733b(C14365u.f45053c, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12213a, c6021p, 12);
                                c6021p.m6524S(169228176);
                                boolean zM6545h3 = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(mapM19244f) | c6021p.m6542f(interfaceC1426a2);
                                Object objM6514H5 = c6021p.m6514H();
                                if (zM6545h3 || objM6514H5 == c5975s) {
                                    objM6514H5 = new C13075c(interfaceC20904w, mapM19244f, interfaceC1426a2, 1);
                                    c6021p.m6537c0(objM6514H5);
                                }
                                c6021p.m6553p(false);
                                AbstractC8018W4.m8347g(strM8676d4, (InterfaceC1426a) objM6514H5, c4042e0M4733b3, c6021p, 0, 0);
                                c6021p.m6553p(false);
                            }
                        } else {
                            c6021p.m6524S(949975747);
                            String strM8676d5 = AbstractC8142m4.m8676d(R.string.rate_limit_banner_new_chat, c6021p);
                            C17767k0 c17767k2 = AbstractC4048f0.f12769a;
                            C5984W0 c5984w1 = AbstractC3959O0.f12302a;
                            C4042e0 c4042e0M4733b4 = AbstractC4048f0.m4733b(((C3949M0) c6021p.m6548k(c5984w1)).f12236r, ((C3949M0) c6021p.m6548k(c5984w1)).f12213a, c6021p, 12);
                            c6021p.m6524S(169204690);
                            InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) obj5;
                            boolean zM6545h4 = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(mapM19244f) | c6021p.m6542f(interfaceC1426a3);
                            Object objM6514H6 = c6021p.m6514H();
                            if (zM6545h4 || objM6514H6 == c5975s) {
                                z6 = false;
                                objM6514H6 = new C13075c(interfaceC20904w, mapM19244f, interfaceC1426a3, 0);
                                c6021p.m6537c0(objM6514H6);
                            } else {
                                z6 = false;
                            }
                            c6021p.m6553p(z6);
                            AbstractC8018W4.m8347g(strM8676d5, (InterfaceC1426a) objM6514H6, c4042e0M4733b4, c6021p, 0, 0);
                            c6021p.m6553p(false);
                        }
                        it = it;
                        str = str;
                    }
                }
                break;
            default:
                C18320E RichText = (C18320E) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(RichText, "$this$RichText");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(RichText) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    UUID uuid = AbstractC8871g.f27154a;
                    c6021p2.m6524S(61895717);
                    C1991h c1991h = new C1991h(((Context) c6021p2.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources(), 1);
                    c6021p2.m6553p(false);
                    InterfaceC10277b interfaceC10277bM19906b = AbstractC18539i.m19906b(c6021p2);
                    boolean zM8729d = AbstractC8160o6.m8729d(C14008x1.f44090c, c6021p2);
                    boolean zM8729d2 = AbstractC8160o6.m8729d(C13870L.f43908c, c6021p2);
                    boolean zM9097b = AbstractC8467E.m9097b(c6021p2);
                    boolean zM8729d3 = AbstractC8160o6.m8729d(C13940g1.f43990c, c6021p2);
                    c6021p2.m6524S(1576909152);
                    C7320F c7320f = (C7320F) obj4;
                    if (zM8729d2) {
                        z10 = false;
                    } else {
                        c6021p2.m6524S(1576912919);
                        Object objM6514H7 = c6021p2.m6514H();
                        if (objM6514H7 == c5975s) {
                            objM6514H7 = C5997d.m6429P(c7320f.f23219c.length());
                            c6021p2.m6537c0(objM6514H7);
                        }
                        C5996c0 c5996c0 = (C5996c0) objM6514H7;
                        c6021p2.m6553p(false);
                        Integer numValueOf = Integer.valueOf(c7320f.f23219c.length());
                        c6021p2.m6524S(1576916458);
                        boolean zM6542f4 = c6021p2.m6542f(c7320f) | c6021p2.m6545h(interfaceC10277bM19906b);
                        Object objM6514H8 = c6021p2.m6514H();
                        if (zM6542f4 || objM6514H8 == c5975s) {
                            objM6514H8 = new C21532g(c7320f, interfaceC10277bM19906b, c5996c0, null);
                            c6021p2.m6537c0(objM6514H8);
                        }
                        z10 = false;
                        c6021p2.m6553p(false);
                        C5997d.m6450f((InterfaceC1439n) objM6514H8, c6021p2, numValueOf);
                    }
                    Object objM530s = AbstractC0168G.m530s(1576924008, c6021p2, z10);
                    if (objM530s == c5975s) {
                        objM530s = C5997d.m6430Q(Boolean.valueOf(z11), C5975S.f19448r0);
                        c6021p2.m6537c0(objM530s);
                    }
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM530s;
                    c6021p2.m6553p(false);
                    Boolean boolValueOf = Boolean.valueOf(z11);
                    c6021p2.m6524S(1576926429);
                    boolean zM6544g = c6021p2.m6544g(z11);
                    Object objM6514H9 = c6021p2.m6514H();
                    if (zM6544g || objM6514H9 == c5975s) {
                        objM6514H9 = new C21533h(z11, interfaceC5985X, null);
                        c6021p2.m6537c0(objM6514H9);
                    }
                    c6021p2.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H9, c6021p2, boolValueOf);
                    c6021p2.m6524S(1576929645);
                    Object objM6514H10 = c6021p2.m6514H();
                    if (objM6514H10 == c5975s) {
                        objM6514H10 = new C18918f(zM8729d2 && ((Boolean) interfaceC5985X.getValue()).booleanValue(), 500, RCHTTPStatusCodes.SUCCESS, 70, new C2550w0(z11, interfaceC10277bM19906b, 6), 240);
                        c6021p2.m6537c0(objM6514H10);
                    }
                    C18918f c18918f = (C18918f) objM6514H10;
                    c6021p2.m6553p(false);
                    AbstractC12935u abstractC12935uM7778d = c7320f.m7778d();
                    c6021p2.m6524S(1576945308);
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) interfaceC17302e;
                    boolean zM6542f5 = c6021p2.m6542f(interfaceC1436k2) | c6021p2.m6542f(str);
                    Object objM6514H11 = c6021p2.m6514H();
                    if (zM6542f5 || objM6514H11 == c5975s) {
                        objM6514H11 = new C3048l(2, str, interfaceC1436k2);
                        c6021p2.m6537c0(objM6514H11);
                    }
                    InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H11;
                    c6021p2.m6553p(false);
                    C16898o0 c16898o0 = new C16898o0(this.f41540Z, (String) obj5, this.f41541o0, (InterfaceC1436k) interfaceC17302e, zM8729d3, (C9436E) obj6);
                    c6021p2.m6524S(1576982089);
                    String str2 = (String) obj5;
                    boolean zM6542f6 = c6021p2.m6542f(interfaceC1436k2) | c6021p2.m6542f(str) | c6021p2.m6542f(str2 != null ? new C22011h0(str2) : null) | c6021p2.m6545h(c1991h) | c6021p2.m6544g(zM9097b) | c6021p2.m6544g(zM8729d) | c6021p2.m6542f((C9436E) obj6) | c6021p2.m6545h(interfaceC20904w);
                    Object objM6514H12 = c6021p2.m6514H();
                    if (zM6542f6 || objM6514H12 == c5975s) {
                        objM6514H12 = new C21536k((String) obj5, this.f41541o0, c1991h, zM9097b, (InterfaceC1436k) interfaceC17302e, zM8729d, (C9436E) obj6, this.f41542p0);
                        c6021p2.m6537c0(objM6514H12);
                    }
                    c6021p2.m6553p(false);
                    C18918f c18918f2 = C18918f.f60363j;
                    AbstractC17563j.m19213a(RichText, abstractC12935uM7778d, interfaceC1436k3, c16898o0, (InterfaceC1442q) objM6514H12, c18918f, c6021p2, (iIntValue2 & 14) | 262144);
                }
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13077e(List list, String str, boolean z6, InterfaceC20904w interfaceC20904w, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3) {
        super(3);
        this.f41543q0 = list;
        this.f41541o0 = str;
        this.f41540Z = z6;
        this.f41542p0 = interfaceC20904w;
        this.f41544r0 = interfaceC1426a;
        this.f41545s0 = interfaceC1426a2;
        this.f41546t0 = interfaceC1426a3;
    }
}
