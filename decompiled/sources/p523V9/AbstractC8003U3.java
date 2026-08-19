package p523V9;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import il.C15038c;
import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15085k;
import kotlin.jvm.internal.AbstractC16544l;
import ml.AbstractC17285c;
import ml.AbstractC17286d;
import ml.AbstractC17287e;
import ml.AbstractC17288f;
import mm.C17309l;
import p002A0.C0148y;
import p003A1.AbstractC0168G;
import p003A1.C0178J0;
import p003A1.C0227a;
import p003A1.C0254h0;
import p017Af.AbstractC0479j;
import p025An.AbstractC0593T;
import p025An.C0613g0;
import p025An.C0644w;
import p040Bd.C0958L4;
import p040Bd.C1013V0;
import p049Bm.InterfaceC1426a;
import p069Cf.C1648g;
import p1008s8.C19490s;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p156G1.AbstractC2965l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p547Wc.C8816z;
import p571X9.AbstractC9233X;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p636a2.C10474k;
import p636a2.C10477n;
import p636a2.C10479p;
import p636a2.C10481r;
import p666bl.C11490f;
import p666bl.C11501q;
import p666bl.C11502r;
import p911o0.AbstractC17780r;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: V9.U3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8003U3 {
    /* JADX INFO: renamed from: a */
    public static final void m8305a(C1013V0 scheduleGame, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(scheduleGame, "scheduleGame");
        c6021p.m6526U(-1134651997);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(scheduleGame) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8098h0.m8569a(null, 0, AbstractC0479j.f1556b - AbstractC7313q.f23201f, AbstractC8411c.m8969c(1696254225, c6021p, new C0227a(scheduleGame, 3)), c6021p, 3120, 1);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(scheduleGame, i10, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8306b(C0958L4 c0958l4, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1935217648);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c0958l4) : c6021p.m6545h(c0958l4) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10842a.m11235m(C10456n.f30959Y, 0.0f, AbstractC7313q.f23200e, 1), 1.0f);
            c6021p.m6525T(-270267587);
            c6021p.m6525T(-3687241);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C10481r();
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C10481r measurer = (C10481r) objM6514H;
            c6021p.m6525T(-3687241);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new C10477n();
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C10477n scope = (C10477n) objM6514H2;
            c6021p.m6525T(-3687241);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == c5975s) {
                objM6514H3 = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            InterfaceC5985X remeasureRequesterState = (InterfaceC5985X) objM6514H3;
            AbstractC16544l.m18094g(scope, "scope");
            AbstractC16544l.m18094g(remeasureRequesterState, "remeasureRequesterState");
            AbstractC16544l.m18094g(measurer, "measurer");
            c6021p.m6525T(-441911751);
            c6021p.m6525T(-3687241);
            Object objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == c5975s) {
                objM6514H4 = new C10479p(scope);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C10479p c10479p = (C10479p) objM6514H4;
            c6021p.m6525T(-3686930);
            boolean zM6542f = c6021p.m6542f(257);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f || objM6514H5 == c5975s) {
                objM6514H5 = new C17309l(new C10474k(measurer, c10479p, remeasureRequesterState), new C8816z(remeasureRequesterState, 9, c10479p));
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            C17309l c17309l = (C17309l) objM6514H5;
            c6021p.m6553p(false);
            AbstractC21075b0.m21560a(AbstractC2965l.m3789a(interfaceC10459qM11244d, false, new C0254h0(measurer, 12)), AbstractC8411c.m8968b(-819894182, c6021p, new C0148y(scope, (InterfaceC1426a) c17309l.f55137Z, c0958l4, 5)), (InterfaceC21057K) c17309l.f55136Y, c6021p, 48);
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(c0958l4, i10, 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8307c(int i10, int i11, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i12;
        c6021p.m6526U(-1111289659);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6538d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C5984W0 c5984w0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b("8888", AbstractC8071d5.m8483b(c10456n, 0.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12154j, c6021p, 54, 0, 65532);
            AbstractC4124r4.m4768b(String.valueOf(i10), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12154j, c6021p, 0, 0, 65534);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1648g(i10, interfaceC10459q, i11, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C19490s m8308d(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C19490s(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Action", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Action", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Action", e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m8309e(AbstractC17288f abstractC17288f, C15085k c15085k, AbstractC19687c abstractC19687c) {
        C11501q c11501q;
        C11490f c11490f;
        Object obj;
        if (abstractC19687c instanceof C11501q) {
            c11501q = (C11501q) abstractC19687c;
            int i10 = c11501q.f34814p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11501q.f34814p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11501q = new C11501q(abstractC19687c);
            }
        } else {
            c11501q = new C11501q(abstractC19687c);
        }
        Object obj2 = c11501q.f34813o0;
        Object obj3 = EnumC19250a.f61036Y;
        int i11 = c11501q.f34814p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj2);
            if (!(abstractC17288f instanceof AbstractC17285c)) {
                if (abstractC17288f instanceof AbstractC17286d) {
                    C15085k c15085k2 = new C15085k(false);
                    AbstractC8118j4.m8616b(((AbstractC17286d) abstractC17288f).mo7533e(), c15085k, c15085k2);
                    c11490f = new C11490f(abstractC17288f, c15085k2);
                } else {
                    if (!(abstractC17288f instanceof AbstractC17287e)) {
                        if (!(abstractC17288f instanceof C15038c)) {
                            throw new C0644w();
                        }
                        c11501q.f34811Y = abstractC17288f;
                        c11501q.f34814p0 = 4;
                        return c15085k.m16204i(c11501q) == obj3 ? obj3 : abstractC17288f;
                    }
                    C15085k c15085k3 = new C15085k(false);
                    AbstractC8118j4.m8616b((C15085k) AbstractC15070F.m16194v(C0613g0.f1858Y, AbstractC0593T.f1824a, new C11502r((AbstractC17287e) abstractC17288f, null), 2).f34001Z, c15085k, c15085k3);
                    c11490f = new C11490f(abstractC17288f, c15085k3);
                }
                return c11490f;
            }
            byte[] bArrMo9568e = ((AbstractC17285c) abstractC17288f).mo9568e();
            c11501q.f34811Y = abstractC17288f;
            c11501q.f34812Z = c15085k;
            c11501q.f34814p0 = 1;
            if (AbstractC15070F.m16191s(c15085k, bArrMo9568e, 0, bArrMo9568e.length, c11501q) == obj3) {
                obj = c15085k;
                return obj3;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (c11501q.f34811Y != null) {
                            throw new ClassCastException();
                        }
                        AbstractC9233X.m9807c(obj2);
                        throw null;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC17288f abstractC17288f2 = c11501q.f34811Y;
                AbstractC9233X.m9807c(obj2);
                return abstractC17288f2;
            }
            Object obj4 = c11501q.f34812Z;
            abstractC17288f = c11501q.f34811Y;
            AbstractC9233X.m9807c(obj2);
            obj = obj4;
        }
        obj = c15085k;
        c11501q.f34811Y = abstractC17288f;
        c11501q.f34812Z = null;
        c11501q.f34814p0 = 2;
        return ((C15085k) obj).m16204i(c11501q) == obj3 ? obj3 : abstractC17288f;
    }
}
