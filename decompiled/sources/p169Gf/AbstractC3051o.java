package p169Gf;

import android.os.SystemClock;
import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.layout.AbstractC10842a;
import com.openai.chatgpt.R;
import gd.C13940g1;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p017Af.AbstractC0454A;
import p017Af.C0471b;
import p025An.C0644w;
import p039Bc.C0885s;
import p040Bd.C0960M0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21984a1;
import p1155zi.C22011h0;
import p124Ei.C2452G;
import p349O0.AbstractC5993b;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C5998d0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC6008i0;
import p403Qd.C6651p0;
import p403Qd.EnumC6606L;
import p478Tc.AbstractC7313q;
import p492U1.C7540e;
import p523V9.AbstractC8011V4;
import p523V9.AbstractC8160o6;
import p537W0.AbstractC8411c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13508z;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13764h;
import p758g0.C13781p0;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p911o0.C17790w;

/* JADX INFO: renamed from: Gf.o */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3051o {

    /* JADX INFO: renamed from: a */
    public static final float f9208a = 20;

    /* JADX INFO: renamed from: a */
    public static final void m3923a(int i10, int i11, int i12, int i13, C6021p c6021p, InterfaceC10459q interfaceC10459q, String str) {
        int i14;
        float f10;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-331225553);
        if ((i12 & 6) == 0) {
            i14 = (c6021p.m6538d(i10) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c6021p.m6538d(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= c6021p.m6542f(str) ? 256 : 128;
        }
        int i15 = i13 & 8;
        if (i15 != 0) {
            i14 |= 3072;
        } else if ((i12 & 3072) == 0) {
            i14 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i14 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            InterfaceC10459q interfaceC10459q3 = i15 != 0 ? C10456n.f30959Y : interfaceC10459q;
            boolean z6 = false;
            boolean z10 = i10 < i11 && str != null;
            if (z10) {
                f10 = 1.0f;
            } else {
                if (z10) {
                    throw new C0644w();
                }
                f10 = 0.0f;
            }
            InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b(f10, null, "Favicon alpha", c6021p, 3072, 22);
            if (str != null && i10 < i11) {
                z6 = true;
            }
            AbstractC10831a.m11201d(z6, interfaceC10459q3, AbstractC13508z.m15013e(new C13781p0(100, 100, AbstractC13725A.f43289b), 2), null, null, AbstractC8411c.m8969c(-1561173753, c6021p, new C0885s(str, 5, interfaceC5982V0M15261b)), c6021p, ((i14 >> 6) & 112) | 196608, 24);
            interfaceC10459q2 = interfaceC10459q3;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3047k(i10, i11, str, interfaceC10459q2, i12, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3924b(String str, String str2, EnumC6606L status, C6651p0 summaryData, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        C0960M0 c0960m0;
        boolean z6;
        AbstractC16544l.m18094g(status, "status");
        AbstractC16544l.m18094g(summaryData, "summaryData");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(1981777385);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str2 != null ? new C21984a1(str2) : null) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(status) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(summaryData) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((i12 & 74899) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17756f c17756f = AbstractC17770m.f56724a;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30946y0, c6021p, 0);
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            boolean zM8729d = AbstractC8160o6.m8729d(C13940g1.f43990c, c6021p);
            c6021p.m6524S(999704678);
            if (!zM8729d || status != EnumC6606L.f21327Y || str2 == null || (c0960m0 = summaryData.f21415b) == null) {
                interfaceC10459q2 = null;
            } else {
                c6021p.m6524S(999716230);
                int i14 = i12 & 57344;
                int i15 = i12 & 112;
                boolean z10 = (i14 == 16384) | (i15 == 32);
                Object objM6514H = c6021p.m6514H();
                C5975S c5975s = C6013l.f19514a;
                if (z10 || objM6514H == c5975s) {
                    z6 = false;
                    objM6514H = new C3048l(0, str2, onIntent);
                    c6021p.m6537c0(objM6514H);
                } else {
                    z6 = false;
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(z6);
                c6021p.m6524S(999719143);
                boolean z11 = (i14 == 16384) | ((i12 & 14) == 4) | (i15 == 32);
                Object objM6514H2 = c6021p.m6514H();
                if (z11 || objM6514H2 == c5975s) {
                    objM6514H2 = new C0471b(onIntent, str, str2, 2);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                interfaceC10459q2 = null;
                AbstractC0454A.m1105a(str2, c0960m0, interfaceC1436k, (InterfaceC1439n) objM6514H2, null, c6021p, (i12 >> 3) & 14);
            }
            c6021p.m6553p(false);
            m3925c(status, summaryData, interfaceC10459q2, c6021p, (i12 >> 6) & 126);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2452G(str, str2, status, summaryData, onIntent, interfaceC10459q, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
    /* JADX WARN: Code duplicated, block: B:67:0x0185  */
    /* JADX WARN: Code duplicated, block: B:68:0x0189  */
    /* JADX WARN: Code duplicated, block: B:73:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:76:0x021c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0221  */
    /* JADX WARN: Code duplicated, block: B:81:0x023d  */
    /* JADX WARN: Code duplicated, block: B:82:0x023f  */
    /* JADX WARN: Code duplicated, block: B:88:0x027a  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m3925c(EnumC6606L status, C6651p0 summaryData, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        int i12;
        int i13;
        String strM19533p;
        boolean zM6544g;
        Object objM6514H;
        Object obj;
        C5998d0 c5998d0;
        Object objM530s;
        C5996c0 c5996c0;
        boolean z6;
        float f10;
        float fM6412g;
        boolean z10;
        boolean zM6542f;
        Object objM6514H2;
        int i14;
        InterfaceC1426a interfaceC1426a;
        C21694h c21694h;
        float f11;
        boolean z11;
        InterfaceC10459q interfaceC10459q2;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(status, "status");
        AbstractC16544l.m18094g(summaryData, "summaryData");
        c6021p.m6526U(1855859552);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(status) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(summaryData) ? 32 : 16;
        }
        int i15 = i11 | 384;
        if ((i15 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            int iOrdinal = status.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    c6021p.m6524S(125457273);
                    c6021p.m6553p(false);
                    strM19533p = null;
                } else if (iOrdinal == 2) {
                    i12 = -827246348;
                    i13 = R.string.tool_status_interrupted;
                } else {
                    if (iOrdinal != 3) {
                        c6021p.m6524S(-827362812);
                        c6021p.m6553p(false);
                        throw new C0644w();
                    }
                    i12 = -827239728;
                    i13 = R.string.tool_status_errored;
                }
                if (strM19533p == null) {
                    c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C3050n(status, summaryData, c10456n, i10, 1);
                        return;
                    }
                    return;
                }
                List list = summaryData.f21416c;
                boolean zIsEmpty = list.isEmpty();
                c6021p.m6524S(-827235215);
                zM6544g = c6021p.m6544g(zIsEmpty);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (zM6544g || objM6514H == obj) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    int i16 = AbstractC5993b.f19471b;
                    Object c5998d1 = new C5998d0(jUptimeMillis);
                    c6021p.m6537c0(c5998d1);
                    objM6514H = c5998d1;
                }
                c5998d0 = (C5998d0) objM6514H;
                objM530s = AbstractC0168G.m530s(-827230939, c6021p, false);
                if (objM530s == obj) {
                    objM530s = C5997d.m6429P(0);
                    c6021p.m6537c0(objM530s);
                }
                c5996c0 = (C5996c0) objM530s;
                c6021p.m6553p(false);
                if (c5996c0.m6412g() == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                f10 = f9208a;
                if (z6) {
                    fM6412g = 0;
                } else {
                    if (!z6) {
                        throw new C0644w();
                    }
                    fM6412g = f10 + (f10 * 0.6666667f * (c5996c0.m6412g() - 1)) + AbstractC7313q.f23199d;
                }
                InterfaceC5982V0 interfaceC5982V0M15260a = AbstractC13764h.m15260a(fM6412g, null, "Text start padding", c6021p, 384, 10);
                c6021p.m6524S(-827213061);
                if ((i15 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zM6542f = z10 | c6021p.m6542f(c5998d0);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f || objM6514H2 == obj) {
                    objM6514H2 = new C3049m(summaryData, c5996c0, c5998d0, null);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, list);
                InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(c10456n, 0.0f, 1, 0.0f, 0.0f, 13);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                m3923a(0, c5996c0.m6412g(), 6, 8, c6021p, null, (String) AbstractC17680n.m19344T(0, list));
                m3923a(1, c5996c0.m6412g(), 3078, 0, c6021p, AbstractC10842a.m11237o(c10456n, f10 * 0.6666667f, 0.0f, 0.0f, 0.0f, 14), (String) AbstractC17680n.m19344T(1, list));
                int iM6412g = c5996c0.m6412g();
                String str = (String) AbstractC17680n.m19344T(2, list);
                InterfaceC10459q interfaceC10459qM11237o2 = AbstractC10842a.m11237o(c10456n, f10 * 2.0f * 0.6666667f, 0.0f, 0.0f, 0.0f, 14);
                if (c5996c0.m6412g() > 0) {
                    f11 = AbstractC7313q.f23198c;
                } else {
                    f11 = 0;
                }
                m3923a(2, iM6412g, 6, 0, c6021p, AbstractC10842a.m11237o(interfaceC10459qM11237o2, 0.0f, 0.0f, f11, 0.0f, 11), str);
                if (status == EnumC6606L.f21327Y) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC8011V4.m8325a(strM19533p, z11, AbstractC10842a.m11237o(c10456n, ((C7540e) interfaceC5982V0M15260a.getValue()).f23894Y, 0.0f, 0.0f, 0.0f, 14), 0, c6021p, 0, 8);
                c6021p.m6553p(true);
                interfaceC10459q2 = c10456n;
            } else {
                i12 = -827243316;
                i13 = R.string.tool_searching;
            }
            strM19533p = AbstractC17792x.m19533p(c6021p, i12, i13, c6021p, false);
            if (strM19533p == null) {
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C3050n(status, summaryData, c10456n, i10, 1);
                    return;
                }
                return;
            }
            List list2 = summaryData.f21416c;
            boolean zIsEmpty2 = list2.isEmpty();
            c6021p.m6524S(-827235215);
            zM6544g = c6021p.m6544g(zIsEmpty2);
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            if (zM6544g) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i17 = AbstractC5993b.f19471b;
                Object c5998d2 = new C5998d0(jUptimeMillis2);
                c6021p.m6537c0(c5998d2);
                objM6514H = c5998d2;
            } else {
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                int i18 = AbstractC5993b.f19471b;
                Object c5998d3 = new C5998d0(jUptimeMillis3);
                c6021p.m6537c0(c5998d3);
                objM6514H = c5998d3;
            }
            c5998d0 = (C5998d0) objM6514H;
            objM530s = AbstractC0168G.m530s(-827230939, c6021p, false);
            if (objM530s == obj) {
                objM530s = C5997d.m6429P(0);
                c6021p.m6537c0(objM530s);
            }
            c5996c0 = (C5996c0) objM530s;
            c6021p.m6553p(false);
            if (c5996c0.m6412g() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            f10 = f9208a;
            if (z6) {
                fM6412g = 0;
            } else {
                if (!z6) {
                    throw new C0644w();
                }
                fM6412g = f10 + (f10 * 0.6666667f * (c5996c0.m6412g() - 1)) + AbstractC7313q.f23199d;
            }
            InterfaceC5982V0 interfaceC5982V0M15260a2 = AbstractC13764h.m15260a(fM6412g, null, "Text start padding", c6021p, 384, 10);
            c6021p.m6524S(-827213061);
            if ((i15 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            zM6542f = z10 | c6021p.m6542f(c5998d0);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f) {
                objM6514H2 = new C3049m(summaryData, c5996c0, c5998d0, null);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C3049m(summaryData, c5996c0, c5998d0, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, list2);
            InterfaceC10459q interfaceC10459qM11237o3 = AbstractC10842a.m11237o(c10456n, 0.0f, 1, 0.0f, 0.0f, 13);
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o3);
            InterfaceC21700k.f68875m0.getClass();
            interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e2);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
            m3923a(0, c5996c0.m6412g(), 6, 8, c6021p, null, (String) AbstractC17680n.m19344T(0, list2));
            m3923a(1, c5996c0.m6412g(), 3078, 0, c6021p, AbstractC10842a.m11237o(c10456n, f10 * 0.6666667f, 0.0f, 0.0f, 0.0f, 14), (String) AbstractC17680n.m19344T(1, list2));
            int iM6412g2 = c5996c0.m6412g();
            String str2 = (String) AbstractC17680n.m19344T(2, list2);
            InterfaceC10459q interfaceC10459qM11237o4 = AbstractC10842a.m11237o(c10456n, f10 * 2.0f * 0.6666667f, 0.0f, 0.0f, 0.0f, 14);
            if (c5996c0.m6412g() > 0) {
                f11 = AbstractC7313q.f23198c;
            } else {
                f11 = 0;
            }
            m3923a(2, iM6412g2, 6, 0, c6021p, AbstractC10842a.m11237o(interfaceC10459qM11237o4, 0.0f, 0.0f, f11, 0.0f, 11), str2);
            if (status == EnumC6606L.f21327Y) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC8011V4.m8325a(strM19533p, z11, AbstractC10842a.m11237o(c10456n, ((C7540e) interfaceC5982V0M15260a2.getValue()).f23894Y, 0.0f, 0.0f, 0.0f, 14), 0, c6021p, 0, 8);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C3050n(status, summaryData, interfaceC10459q2, i10, 0);
        }
    }
}
