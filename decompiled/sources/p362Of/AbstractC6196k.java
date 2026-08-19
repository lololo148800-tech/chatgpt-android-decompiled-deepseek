package p362Of;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import coil3.compose.AsyncImagePainter$State$Success;
import com.openai.chatgpt.R;
import java.util.Iterator;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p003A1.C0184L0;
import p003A1.C0248f0;
import p003A1.C0257i0;
import p006A4.C0339D;
import p017Af.C0459F;
import p033B5.InterfaceC0832p;
import p039Bc.C0885s;
import p042Bf.C1268j;
import p042Bf.C1269k;
import p042Bf.C1275q;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p059C5.C1588f;
import p059C5.InterfaceC1589g;
import p1010sf.AbstractC19536b;
import p1095x1.C21088i;
import p1095x1.C21089j;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2535p;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4141u3;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p360Od.C6172d;
import p360Od.EnumC6170b;
import p403Qd.EnumC6606L;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC8011V4;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9256a4;
import p571X9.AbstractC9258b0;
import p575Xd.C9449h;
import p575Xd.C9452k;
import p575Xd.C9457p;
import p575Xd.C9460s;
import p575Xd.C9463v;
import p575Xd.C9466y;
import p575Xd.InterfaceC9461t;
import p579Xh.InterfaceC9514a;
import p587Y1.C9588n;
import p594Y9.AbstractC9818V;
import p594Y9.AbstractC9834X3;
import p594Y9.AbstractC9973t4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17731K;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17767k0;
import p911o0.C17790w;

/* JADX INFO: renamed from: Of.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6196k {

    /* JADX INFO: renamed from: a */
    public static final float f20175a = 96;

    /* JADX WARN: Code duplicated, block: B:105:0x0288  */
    /* JADX WARN: Code duplicated, block: B:106:0x028a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0293  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:75:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Code duplicated, block: B:93:0x0225  */
    /* JADX WARN: Code duplicated, block: B:96:0x0239  */
    /* JADX WARN: Code duplicated, block: B:98:0x0267  */
    /* JADX INFO: renamed from: a */
    public static final void m6724a(C6172d action, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, InterfaceC1436k onActionClick, C6021p c6021p, int i10) {
        int i11;
        String strM8677e;
        int i12;
        int i13;
        int i14;
        int i15;
        InterfaceC1426a interfaceC1426a;
        C21694h c21694h;
        boolean z6;
        boolean zBooleanValue;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objM6514H;
        boolean zM6542f;
        Object objM6514H2;
        AbstractC16544l.m18094g(action, "action");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        AbstractC16544l.m18094g(onActionClick, "onActionClick");
        c6021p.m6526U(-1398918310);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(action) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onActionClick) ? 2048 : 1024;
        }
        int i16 = i11;
        if ((i16 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(373438357);
            C9463v c9463v = action.f20091a;
            boolean z13 = action.f20095e;
            String strM8676d = z13 ? AbstractC8142m4.m8676d(R.string.tool_host_local_action, c6021p) : c9463v.f28480b;
            c6021p.m6553p(false);
            InterfaceC9461t interfaceC9461t = (InterfaceC9461t) AbstractC17680n.m19343S(c9463v.f28485g);
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C6195j.f20174Y, c6021p, 3072, 6);
            EnumC6170b enumC6170b = EnumC6170b.f20087o0;
            EnumC6170b enumC6170b2 = action.f20093c;
            EnumC6606L enumC6606L = action.f20094d;
            if (enumC6170b2 == enumC6170b) {
                i12 = 373450119;
                i13 = R.string.tool_function_title_declined;
            } else {
                if (strM8676d == null && enumC6606L.m7161a()) {
                    c6021p.m6524S(-1307845775);
                    c6021p.m6553p(false);
                    strM8677e = "";
                } else if (strM8676d == null) {
                    i12 = 373454333;
                    i13 = R.string.tool_status_active;
                } else if (z13 && m6730g(action)) {
                    c6021p.m6524S(373458070);
                    strM8677e = AbstractC8142m4.m8677e(R.string.tool_function_title_waiting_for_input, new Object[]{strM8676d}, c6021p);
                    c6021p.m6553p(false);
                } else if (m6730g(action)) {
                    c6021p.m6524S(373462038);
                    strM8677e = AbstractC8142m4.m8677e(R.string.tool_function_title_waiting_for_input, new Object[]{strM8676d}, c6021p);
                    c6021p.m6553p(false);
                } else {
                    EnumC6606L enumC6606L2 = EnumC6606L.f21328Z;
                    if (enumC6606L == enumC6606L2 && (interfaceC9461t instanceof C9460s)) {
                        c6021p.m6524S(373468180);
                        strM8677e = AbstractC8142m4.m8677e(R.string.tool_function_title_signin_finished, new Object[]{strM8676d}, c6021p);
                        c6021p.m6553p(false);
                    } else if (enumC6606L == enumC6606L2) {
                        c6021p.m6524S(373472557);
                        strM8677e = AbstractC8142m4.m8677e(R.string.tool_function_title_finished, new Object[]{strM8676d}, c6021p);
                        c6021p.m6553p(false);
                    } else if (enumC6606L.m7161a()) {
                        c6021p.m6524S(373475984);
                        strM8677e = AbstractC8142m4.m8677e(R.string.tool_function_title_interrupted, new Object[]{strM8676d}, c6021p);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(373479088);
                        strM8677e = AbstractC8142m4.m8677e(R.string.tool_function_title_in_progress, new Object[]{strM8676d}, c6021p);
                        c6021p.m6553p(false);
                    }
                }
                String str = strM8677e;
                i14 = i16 >> 6;
                C17790w c17790wM19515a = AbstractC17788v.m19515a(new C17764j(AbstractC7313q.f23199d, false, null), C10444b.f30946y0, c6021p, 0);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                if (enumC6606L == EnumC6606L.f21327Y) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                AbstractC8011V4.m8325a(str, z6, null, 3, c6021p, 3072, 4);
                c6021p.m6524S(-1095699392);
                if (!enumC6606L.m7161a() && m6730g(action) && !z13) {
                    m6725b(action, onActionClick, null, c6021p, (i14 & 112) | (i16 & 14));
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-1095692267);
                zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                Object obj = C6013l.f19514a;
                if (zBooleanValue) {
                    c6021p.m6524S(-1095688408);
                    zM6542f = c6021p.m6542f(interfaceC5985X);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f || objM6514H2 == obj) {
                        objM6514H2 = new C0339D(interfaceC5985X, 27);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    z10 = true;
                    z11 = false;
                    m6726c(action, (InterfaceC1426a) objM6514H2, onIntent, onActionClick, c6021p, (i16 & 14) | ((i16 << 3) & 896) | (i16 & 7168));
                } else {
                    z10 = true;
                    z11 = false;
                }
                r5.m6553p(z11);
                r5.m6524S(-1095683541);
                if (z13 && m6730g(action)) {
                    r5.m6524S(-1095679708);
                    if ((i16 & 112) == 32) {
                        z12 = z10;
                    } else {
                        z12 = z11;
                    }
                    objM6514H = c6021p.m6514H();
                    if (z12 || objM6514H == obj) {
                        objM6514H = new C0459F(26, onIntent);
                        r5.m6537c0(objM6514H);
                    }
                    r5.m6553p(z11);
                    AbstractC9258b0.m9832b(action, (InterfaceC1426a) objM6514H, c6021p, i16 & 14);
                }
                r5.m6553p(z11);
                r5.m6553p(z10);
            }
            strM8677e = AbstractC17792x.m19533p(c6021p, i12, i13, c6021p, false);
            String str2 = strM8677e;
            i14 = i16 >> 6;
            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(new C17764j(AbstractC7313q.f23199d, false, null), C10444b.f30946y0, c6021p, 0);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a2);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
            if (enumC6606L == EnumC6606L.f21327Y) {
                z6 = true;
            } else {
                z6 = false;
            }
            AbstractC8011V4.m8325a(str2, z6, null, 3, c6021p, 3072, 4);
            c6021p.m6524S(-1095699392);
            if (!enumC6606L.m7161a()) {
                m6725b(action, onActionClick, null, c6021p, (i14 & 112) | (i16 & 14));
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-1095692267);
            zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            Object obj2 = C6013l.f19514a;
            if (zBooleanValue) {
                c6021p.m6524S(-1095688408);
                zM6542f = c6021p.m6542f(interfaceC5985X);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f) {
                    objM6514H2 = new C0339D(interfaceC5985X, 27);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C0339D(interfaceC5985X, 27);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                z10 = true;
                z11 = false;
                m6726c(action, (InterfaceC1426a) objM6514H2, onIntent, onActionClick, c6021p, (i16 & 14) | ((i16 << 3) & 896) | (i16 & 7168));
            } else {
                z10 = true;
                z11 = false;
            }
            r5.m6553p(z11);
            r5.m6524S(-1095683541);
            if (z13) {
                r5.m6524S(-1095679708);
                if ((i16 & 112) == 32) {
                    z12 = z10;
                } else {
                    z12 = z11;
                }
                objM6514H = c6021p.m6514H();
                if (z12) {
                    objM6514H = new C0459F(26, onIntent);
                    r5.m6537c0(objM6514H);
                } else {
                    objM6514H = new C0459F(26, onIntent);
                    r5.m6537c0(objM6514H);
                }
                r5.m6553p(z11);
                AbstractC9258b0.m9832b(action, (InterfaceC1426a) objM6514H, c6021p, i16 & 14);
            }
            r5.m6553p(z11);
            r5.m6553p(z10);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(action, onIntent, interfaceC10459q, onActionClick, i10, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6725b(C6172d c6172d, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-640625694);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(c6172d) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17756f c17756f = AbstractC17770m.f56724a;
            AbstractC17731K.m19460a(c10456n, AbstractC17770m.m19500g(AbstractC7313q.f23199d), null, 0, 0, null, AbstractC8411c.m8969c(579633671, c6021p, new C0885s(c6172d, 8, interfaceC1436k)), c6021p, ((i12 >> 6) & 14) | 1572864, 60);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(c6172d, interfaceC1436k, interfaceC10459q2, i10, 21);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m6726c(C6172d c6172d, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1754778204);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c6172d) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k2) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(1821309785);
            boolean z6 = (i11 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2535p(14, interfaceC1426a);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9973t4.m10617b((InterfaceC1426a) objM6514H, new C9588n(3, false, false), AbstractC8411c.m8969c(-1490660947, c6021p, new C1268j(interfaceC1426a, c6172d, interfaceC1436k, interfaceC1436k2)), c6021p, 432, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(c6172d, interfaceC1426a, interfaceC1436k, interfaceC1436k2, i10, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:104:0x021f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0231  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:63:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x0108  */
    /* JADX WARN: Code duplicated, block: B:68:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x0163  */
    /* JADX WARN: Code duplicated, block: B:79:0x0165  */
    /* JADX WARN: Code duplicated, block: B:83:0x016b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x017b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d3  */
    /* JADX INFO: renamed from: d */
    public static final void m6727d(InterfaceC9461t interfaceC9461t, InterfaceC1436k interfaceC1436k, C6172d c6172d, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        C17767k0 c17767k0M11223a;
        boolean z6;
        boolean z10;
        boolean zM6545h;
        Object objM6514H;
        boolean z11;
        boolean zM6545h2;
        Object objM6514H2;
        boolean z12;
        boolean zM6545h3;
        Object objM6514H3;
        InterfaceC10459q interfaceC10459q4;
        boolean z13;
        boolean zM6545h4;
        Object objM6514H4;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(2053630814);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(interfaceC9461t) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(c6172d) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 == 0) {
            if ((i10 & 3072) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 2048 : 1024;
            }
            if ((i12 & 1171) == 1170 || !c6021p.m6562y()) {
                if (i13 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c17767k0M11223a = AbstractC10842a.m11223a(AbstractC7313q.f23201f + AbstractC7313q.f23198c, 0.0f, 2);
                z6 = interfaceC9461t instanceof C9449h;
                C5975S c5975s = C6013l.f19514a;
                if (z6) {
                    c6021p.m6524S(232892880);
                    c6021p.m6524S(232893343);
                    if ((i12 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM6545h4 = z13 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                    objM6514H4 = c6021p.m6514H();
                    if (zM6545h4 || objM6514H4 == c5975s) {
                        objM6514H4 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 0);
                        c6021p.m6537c0(objM6514H4);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H4, interfaceC10459q3, false, null, null, null, null, c17767k0M11223a, null, AbstractC8411c.m8969c(1826280646, c6021p, new C6193h(interfaceC9461t, 0)), c6021p, ((i12 >> 6) & 112) | 805306368, 380);
                    c6021p.m6553p(false);
                } else if (interfaceC9461t instanceof C9452k) {
                    c6021p.m6524S(232911637);
                    c6021p.m6524S(232912671);
                    if ((i12 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zM6545h3 = z12 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                    objM6514H3 = c6021p.m6514H();
                    if (zM6545h3 || objM6514H3 == c5975s) {
                        objM6514H3 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 1);
                        c6021p.m6537c0(objM6514H3);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H3, interfaceC10459q3, false, null, null, null, null, c17767k0M11223a, null, AbstractC6191f.f20162a, c6021p, ((i12 >> 6) & 112) | 805306368, 380);
                    c6021p.m6553p(false);
                } else if (interfaceC9461t instanceof C9457p) {
                    c6021p.m6524S(232920724);
                    c6021p.m6524S(232921439);
                    if ((i12 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zM6545h2 = z11 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6545h2 || objM6514H2 == c5975s) {
                        objM6514H2 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 2);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H2, interfaceC10459q3, false, null, null, null, null, c17767k0M11223a, null, AbstractC8411c.m8969c(-1741812592, c6021p, new C6193h(interfaceC9461t, 1)), c6021p, ((i12 >> 6) & 112) | 805306368, 380);
                    c6021p.m6553p(false);
                } else if (interfaceC9461t instanceof C9460s) {
                    c6021p.m6524S(232939395);
                    c6021p.m6524S(232940191);
                    if ((i12 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zM6545h = z10 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                    objM6514H = c6021p.m6514H();
                    if (zM6545h || objM6514H == c5975s) {
                        objM6514H = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 3);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, interfaceC10459q3, false, null, null, null, null, null, null, AbstractC8411c.m8969c(1577834797, c6021p, new C6193h(interfaceC9461t, 2)), c6021p, ((i12 >> 6) & 112) | 805306368, 508);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-1368610388);
                    c6021p.m6553p(false);
                }
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1275q((Object) interfaceC9461t, (Object) interfaceC1436k, (Object) c6172d, interfaceC10459q4, i10, i11, 3);
            }
        }
        i12 |= 3072;
        interfaceC10459q2 = interfaceC10459q;
        if ((i12 & 1171) == 1170) {
            if (i13 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c17767k0M11223a = AbstractC10842a.m11223a(AbstractC7313q.f23201f + AbstractC7313q.f23198c, 0.0f, 2);
            z6 = interfaceC9461t instanceof C9449h;
            C5975S c5975s2 = C6013l.f19514a;
            if (z6) {
                c6021p.m6524S(232892880);
                c6021p.m6524S(232893343);
                if ((i12 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM6545h4 = z13 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                objM6514H4 = c6021p.m6514H();
                if (zM6545h4) {
                    objM6514H4 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 0);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 0);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H4, interfaceC10459q3, false, null, null, null, null, c17767k0M11223a, null, AbstractC8411c.m8969c(1826280646, c6021p, new C6193h(interfaceC9461t, 0)), c6021p, ((i12 >> 6) & 112) | 805306368, 380);
                c6021p.m6553p(false);
            } else if (interfaceC9461t instanceof C9452k) {
                c6021p.m6524S(232911637);
                c6021p.m6524S(232912671);
                if ((i12 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zM6545h3 = z12 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                objM6514H3 = c6021p.m6514H();
                if (zM6545h3) {
                    objM6514H3 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 1);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 1);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H3, interfaceC10459q3, false, null, null, null, null, c17767k0M11223a, null, AbstractC6191f.f20162a, c6021p, ((i12 >> 6) & 112) | 805306368, 380);
                c6021p.m6553p(false);
            } else if (interfaceC9461t instanceof C9457p) {
                c6021p.m6524S(232920724);
                c6021p.m6524S(232921439);
                if ((i12 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zM6545h2 = z11 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H2 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 2);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 2);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H2, interfaceC10459q3, false, null, null, null, null, c17767k0M11223a, null, AbstractC8411c.m8969c(-1741812592, c6021p, new C6193h(interfaceC9461t, 1)), c6021p, ((i12 >> 6) & 112) | 805306368, 380);
                c6021p.m6553p(false);
            } else if (interfaceC9461t instanceof C9460s) {
                c6021p.m6524S(232939395);
                c6021p.m6524S(232940191);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zM6545h = z10 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                objM6514H = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 3);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 3);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, interfaceC10459q3, false, null, null, null, null, null, null, AbstractC8411c.m8969c(1577834797, c6021p, new C6193h(interfaceC9461t, 2)), c6021p, ((i12 >> 6) & 112) | 805306368, 508);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1368610388);
                c6021p.m6553p(false);
            }
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            if (i13 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c17767k0M11223a = AbstractC10842a.m11223a(AbstractC7313q.f23201f + AbstractC7313q.f23198c, 0.0f, 2);
            z6 = interfaceC9461t instanceof C9449h;
            C5975S c5975s3 = C6013l.f19514a;
            if (z6) {
                c6021p.m6524S(232892880);
                c6021p.m6524S(232893343);
                if ((i12 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM6545h4 = z13 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                objM6514H4 = c6021p.m6514H();
                if (zM6545h4) {
                    objM6514H4 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 0);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 0);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H4, interfaceC10459q3, false, null, null, null, null, c17767k0M11223a, null, AbstractC8411c.m8969c(1826280646, c6021p, new C6193h(interfaceC9461t, 0)), c6021p, ((i12 >> 6) & 112) | 805306368, 380);
                c6021p.m6553p(false);
            } else if (interfaceC9461t instanceof C9452k) {
                c6021p.m6524S(232911637);
                c6021p.m6524S(232912671);
                if ((i12 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zM6545h3 = z12 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                objM6514H3 = c6021p.m6514H();
                if (zM6545h3) {
                    objM6514H3 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 1);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 1);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H3, interfaceC10459q3, false, null, null, null, null, c17767k0M11223a, null, AbstractC6191f.f20162a, c6021p, ((i12 >> 6) & 112) | 805306368, 380);
                c6021p.m6553p(false);
            } else if (interfaceC9461t instanceof C9457p) {
                c6021p.m6524S(232920724);
                c6021p.m6524S(232921439);
                if ((i12 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zM6545h2 = z11 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H2 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 2);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    objM6514H2 = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 2);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H2, interfaceC10459q3, false, null, null, null, null, c17767k0M11223a, null, AbstractC8411c.m8969c(-1741812592, c6021p, new C6193h(interfaceC9461t, 1)), c6021p, ((i12 >> 6) & 112) | 805306368, 380);
                c6021p.m6553p(false);
            } else if (interfaceC9461t instanceof C9460s) {
                c6021p.m6524S(232939395);
                c6021p.m6524S(232940191);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zM6545h = z10 | ((i12 & 896) == 256) | c6021p.m6545h(interfaceC9461t);
                objM6514H = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 3);
                    c6021p.m6537c0(objM6514H);
                } else {
                    objM6514H = new C6192g(interfaceC1436k, c6172d, interfaceC9461t, 3);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, interfaceC10459q3, false, null, null, null, null, null, null, AbstractC8411c.m8969c(1577834797, c6021p, new C6193h(interfaceC9461t, 2)), c6021p, ((i12 >> 6) & 112) | 805306368, 508);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1368610388);
                c6021p.m6553p(false);
            }
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1275q((Object) interfaceC9461t, (Object) interfaceC1436k, (Object) c6172d, interfaceC10459q4, i10, i11, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m6728e(C9466y c9466y, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1658506591);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c9466y) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            String str = c9466y.f28489c;
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(AbstractC9256a4.m9830c(str), c6021p, 0);
            long j10 = C14365u.f45055e;
            long j11 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w;
            String str2 = c9466y.f28487a;
            if (str2 == null) {
                str2 = "";
            }
            AbstractC19536b.m20624a(false, abstractC17140aM8631b, str2, str != null ? str : "", null, c10456n, j10, j11, c6021p, ((i12 << 12) & 458752) | 1597446, 0);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(c9466y, interfaceC10459q2, i10, 25);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m6729f(C9466y c9466y, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        Object next;
        Object objM19235b;
        InterfaceC0832p interfaceC0832pMo3165c;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-345965971);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(c9466y) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(733270045);
            String str = c9466y.f28488b;
            boolean zM6542f = c6021p.m6542f(str);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                objM6514H = C5997d.m6430Q(C1588f.f4457a, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            String strM8676d = AbstractC8142m4.m8676d(R.string.conversation_image_content_description, c6021p);
            c6021p.m6524S(617413469);
            Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof InterfaceC9514a));
            if (next != null) {
                objM19235b = (InterfaceC9514a) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                c6021p.m6553p(false);
            }
            InterfaceC9514a interfaceC9514a = (InterfaceC9514a) objM19235b;
            if (interfaceC9514a == null || (interfaceC0832pMo3165c = interfaceC9514a.mo3165c()) == null) {
                throw new IllegalStateException("No ImageLoader");
            }
            InterfaceC10459q interfaceC10459qM10458b = AbstractC9818V.m10458b(AbstractC8079e5.m8501a(AbstractC10844c.m11252l(c10456n, f20175a), ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b), !(((InterfaceC1589g) interfaceC5985X.getValue()) instanceof AsyncImagePainter$State$Success), false, 0.0f, 14);
            c6021p.m6524S(733287249);
            boolean zM6542f2 = c6021p.m6542f(str) | ((i12 & 112) == 32);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C6186a(str, interfaceC1436k);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qM10458b, false, null, (InterfaceC1426a) objM6514H2, 7);
            C21088i c21088i = C21089j.f67011Z;
            c6021p.m6524S(733295415);
            boolean zM6542f3 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                objM6514H3 = new C0248f0(interfaceC5985X, 29);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(733294263);
            boolean zM6542f4 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f4 || objM6514H4 == obj) {
                objM6514H4 = new C6194i(interfaceC5985X, 0);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H4;
            c6021p.m6553p(false);
            c6021p.m6524S(733293111);
            boolean zM6542f5 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f5 || objM6514H5 == obj) {
                objM6514H5 = new C6194i(interfaceC5985X, 1);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            AbstractC7881F0.m8163b(c9466y.f28488b, strM8676d, interfaceC0832pMo3165c, interfaceC10459qM11209d, null, null, null, interfaceC1436k2, interfaceC1436k3, (InterfaceC1436k) objM6514H5, c21088i, null, c6021p, 0, 48, 62576);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(c9466y, interfaceC1436k, interfaceC10459q2, i10, 20);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m6730g(C6172d c6172d) {
        if (c6172d.f20093c == EnumC6170b.f20088p0) {
            if (c6172d.f20094d == EnumC6606L.f21327Y) {
                return true;
            }
        }
        return false;
    }
}
