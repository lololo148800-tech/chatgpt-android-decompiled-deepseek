package p003A1;

import android.media.Image;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.io.File;
import java.util.Collection;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17312o;
import p001A.C0042V0;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0624m;
import p031B3.AbstractC0801e;
import p045Bj.C1311i;
import p050Bn.RunnableC1453g;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2149O0;
import p103Dn.InterfaceC2186j;
import p1068vo.C20659i;
import p112E6.C2346e;
import p1139z0.C21585H;
import p1139z0.C21637r;
import p1139z0.C21651y;
import p1156zj.C22170l;
import p124Ei.AbstractC2511g1;
import p153Fn.AbstractC2935m;
import p153Fn.C2925c;
import p178H.InterfaceC3153k;
import p199Hl.AbstractC3474J;
import p199Hl.C3471G;
import p199Hl.C3472H;
import p199Hl.C3473I;
import p199Hl.C3485j;
import p228J.InterfaceC3864u;
import p341Ni.C5784h0;
import p344Nl.AbstractC5821C;
import p387Pl.AbstractC6470Q;
import p387Pl.C6454A;
import p387Pl.C6460G;
import p482Tg.C7448e;
import p523V9.AbstractC8154o0;
import p544W9.AbstractC8706s;
import p557Wl.C8949e;
import p571X9.AbstractC9393x3;
import p647ak.C10713l;
import p747fb.InterfaceFutureC13608b;
import p909nm.AbstractC17680n;
import p949pj.C18429B;
import p949pj.C18430C;
import p949pj.C18450X;
import p949pj.C18484p0;
import p949pj.InterfaceC18431D;
import p972qm.InterfaceC18770c;
import p993rj.C19024D;
import p993rj.C19025E;
import p993rj.C19033M;
import p993rj.C19040b;
import p993rj.C19047i;
import p993rj.C19048j;
import p993rj.C19049k;
import p993rj.C19050l;
import p993rj.C19051m;
import p993rj.C19052n;
import p993rj.InterfaceC19053o;
import p996rm.EnumC19250a;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: A1.S1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0205S1 implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f791Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f792Z;

    public /* synthetic */ C0205S1(Object obj, int i10) {
        this.f791Y = i10;
        this.f792Z = obj;
    }

    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        InterfaceC3153k interfaceC3153k;
        InterfaceC3864u interfaceC3864uMo107c;
        C1311i c1311i;
        C1311i c1311i2;
        switch (this.f791Y) {
            case 0:
                ((C0245e1) this.f792Z).f936Y.m6410h(((Number) obj).floatValue());
                return C17296C.f55119a;
            case 1:
                ((Collection) this.f792Z).add(obj);
                return C17296C.f55119a;
            case 2:
                Object objMo395a = ((C2346e) this.f792Z).mo395a(obj, interfaceC18770c);
                return objMo395a == EnumC19250a.f61036Y ? objMo395a : C17296C.f55119a;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C17296C c17296c = C17296C.f55119a;
                InterfaceC2149O0 interfaceC2149O0 = (InterfaceC2149O0) this.f792Z;
                if (interfaceC2149O0 == null || (interfaceC3153k = (InterfaceC3153k) interfaceC2149O0.getValue()) == null || (interfaceC3864uMo107c = interfaceC3153k.mo107c()) == null) {
                    return c17296c;
                }
                InterfaceFutureC13608b interfaceFutureC13608bMo299c = interfaceC3864uMo107c.mo299c(zBooleanValue);
                AbstractC16544l.m18093f(interfaceFutureC13608bMo299c, "enableTorch(...)");
                float f10 = AbstractC2511g1.f7806a;
                C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(interfaceC18770c));
                c0624m.m1262r();
                interfaceFutureC13608bMo299c.mo5766a(new RunnableC1453g(c0624m, 1), Executors.newSingleThreadExecutor());
                Object objM1261q = c0624m.m1261q();
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                if (objM1261q != enumC19250a) {
                    objM1261q = c17296c;
                }
                return objM1261q == enumC19250a ? objM1261q : c17296c;
            case 4:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C8949e c8949e = (C8949e) ((C5784h0) this.f792Z).f18871w.f15385j;
                c8949e.getClass();
                c8949e.f27362e.m8944g(Boolean.valueOf(!zBooleanValue2), C8949e.f27357f[3]);
                return C17296C.f55119a;
            case 5:
                AbstractC3474J abstractC3474J = (AbstractC3474J) obj;
                boolean z6 = abstractC3474J instanceof C3473I;
                C17296C c17296c2 = C17296C.f55119a;
                C6454A c6454a = (C6454A) this.f792Z;
                if (z6) {
                    boolean z10 = ((C3473I) abstractC3474J).f10537c;
                    int i10 = C6454A.f20936r;
                    c6454a.f20939m = !z10;
                    C7448e c7448e = c6454a.f20943q;
                    AbstractC16544l.m18094g(c7448e, "<this>");
                    c7448e.invoke(c17296c2);
                } else if (abstractC3474J instanceof C3472H) {
                    C6460G c6460g = ((C3472H) abstractC3474J).f10536c;
                    int i11 = C6454A.f20936r;
                    c6454a.f20941o = c6460g;
                    C7448e c7448e2 = c6454a.f20943q;
                    AbstractC16544l.m18094g(c7448e2, "<this>");
                    c7448e2.invoke(c17296c2);
                } else if (abstractC3474J instanceof C3471G) {
                    C3471G c3471g = (C3471G) abstractC3474J;
                    int i12 = C6454A.f20936r;
                    AbstractC5821C abstractC5821C = (AbstractC5821C) c6454a.f20998i.get();
                    if (abstractC5821C != null) {
                        AbstractC16544l.m18094g(c3471g, CsqksqyPE.lBFprhVWKIr);
                        AbstractC6470Q abstractC6470Q = (AbstractC6470Q) abstractC5821C.m6220d().get(c3471g.f10538b.f20986e);
                        if (abstractC6470Q != null) {
                            abstractC5821C.f18997d.m12669r(new C3485j(abstractC5821C, abstractC6470Q, c3471g.f10535c), abstractC5821C.f18996c);
                        }
                    }
                }
                return c17296c2;
            case 6:
                InterfaceC18431D interfaceC18431D = (InterfaceC18431D) obj;
                boolean zM18089b = AbstractC16544l.m18089b(interfaceC18431D, C18430C.f58796a);
                C10713l c10713l = (C10713l) this.f792Z;
                if (zM18089b) {
                    C1311i c1311i3 = c10713l.f31837e;
                    if (c1311i3 != null) {
                        c1311i3.invoke(new C18484p0());
                    }
                } else if ((interfaceC18431D instanceof C18429B) && ((C18429B) interfaceC18431D).f58795a && (c1311i = c10713l.f31837e) != null) {
                    c1311i.invoke(new C18450X());
                }
                return C17296C.f55119a;
            case 7:
                InterfaceC19053o interfaceC19053o = (InterfaceC19053o) obj;
                if (!AbstractC16544l.m18089b(interfaceC19053o, C19049k.f60711a)) {
                    boolean zM18089b2 = AbstractC16544l.m18089b(interfaceC19053o, C19052n.f60714a);
                    C0042V0 c0042v0 = (C0042V0) this.f792Z;
                    if (zM18089b2) {
                        C2153Q0 c2153q0 = (C2153Q0) c0042v0.f208q0;
                        C18430C c18430c = C18430C.f58799d;
                        c2153q0.getClass();
                        c2153q0.m3251l(null, c18430c);
                    } else if (AbstractC16544l.m18089b(interfaceC19053o, C19050l.f60712a)) {
                        C2153Q0 c2153q1 = (C2153Q0) c0042v0.f208q0;
                        C18429B c18429b = new C18429B(c0042v0.f204Y);
                        c2153q1.getClass();
                        c2153q1.m3251l(null, c18429b);
                        c0042v0.f207p0 = ((C19025E) c0042v0.f205Z).m20285a();
                        c0042v0.f204Y = false;
                    } else if (interfaceC19053o instanceof C19051m) {
                        AbstractC0801e abstractC0801e = ((C19051m) interfaceC19053o).f60713a;
                        if (abstractC0801e instanceof C19047i) {
                            C19025E c19025e = (C19025E) c0042v0.f205Z;
                            int i13 = c19025e.f60649h + 1;
                            C19033M c19033m = c19025e.f60644c;
                            if (i13 >= AbstractC17680n.m19361k0(c19033m.f60678b, AbstractC9393x3.m9974d(c19033m.f60677a)).size()) {
                                C2153Q0 c2153q2 = (C2153Q0) c0042v0.f208q0;
                                C18430C c18430c2 = C18430C.f58796a;
                                c2153q2.getClass();
                                c2153q2.m3251l(null, c18430c2);
                            } else {
                                c19025e.f60649h++;
                                C0564B0 c0564b0 = (C0564B0) c0042v0.f209r0;
                                if (c0564b0 != null) {
                                    c0564b0.mo1275e(null);
                                }
                                c0042v0.f207p0 = ((C19025E) c0042v0.f205Z).m20285a();
                                AbstractC0575H.m1156D((C2925c) c0042v0.f206o0, AbstractC2935m.f8797a, null, new C19040b(c0042v0, null), 2);
                            }
                        } else if (abstractC0801e instanceof C19048j) {
                            C2153Q0 c2153q3 = (C2153Q0) c0042v0.f208q0;
                            C18430C c18430c3 = C18430C.f58797b;
                            c2153q3.getClass();
                            c2153q3.m3251l(null, c18430c3);
                        }
                    }
                }
                return C17296C.f55119a;
            case 8:
                Image image = (Image) obj;
                C19024D c19024d = (C19024D) this.f792Z;
                c19024d.getClass();
                try {
                    if (AbstractC16544l.m18089b(c19024d.f60637v.getValue(), C19050l.f60712a)) {
                        c19024d.f60615C.open();
                        AbstractC8706s.m9414b(image, null);
                    } else if (c19024d.f60633r || c19024d.f60634s) {
                        if (c19024d.f60634s) {
                            File fileM20282d = c19024d.m20282d(image);
                            if (fileM20282d != null) {
                                C2153Q0 c2153q4 = c19024d.f60636u;
                                C17312o c17312o = new C17312o(fileM20282d);
                                c2153q4.getClass();
                                c2153q4.m3251l(null, c17312o);
                            }
                        } else if (c19024d.f60633r) {
                            try {
                                c19024d.f60619d.mo19876g(image, c19024d.f60627l);
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        AbstractC8706s.m9414b(image, null);
                    } else {
                        AbstractC8706s.m9414b(image, null);
                    }
                    return C17296C.f55119a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC8706s.m9414b(image, th2);
                        throw th3;
                    }
                }
            case 9:
                C21585H c21585h = (C21585H) this.f792Z;
                if (Build.VERSION.SDK_INT >= 34) {
                    C21637r.f68542a.m21984a(c21585h.m21930t(), (View) c21585h.f68344Z);
                }
                return C17296C.f55119a;
            case 10:
                ((C20659i) this.f792Z).mo21210d();
                return C17296C.f55119a;
            case 11:
                C20659i c20659i = ((C21651y) this.f792Z).f68609c;
                c20659i.m21208b().updateCursorAnchorInfo((View) c20659i.f65541a, (CursorAnchorInfo) obj);
                return C17296C.f55119a;
            default:
                InterfaceC18431D interfaceC18431D2 = (InterfaceC18431D) obj;
                boolean zM18089b3 = AbstractC16544l.m18089b(interfaceC18431D2, C18430C.f58796a);
                C22170l c22170l = (C22170l) this.f792Z;
                if (zM18089b3) {
                    C1311i c1311i4 = c22170l.f70158h;
                    if (c1311i4 != null) {
                        c1311i4.invoke(new C18484p0());
                    }
                } else if ((interfaceC18431D2 instanceof C18429B) && ((C18429B) interfaceC18431D2).f58795a && (c1311i2 = c22170l.f70158h) != null) {
                    c1311i2.invoke(new C18450X());
                }
                return C17296C.f55119a;
        }
    }
}
