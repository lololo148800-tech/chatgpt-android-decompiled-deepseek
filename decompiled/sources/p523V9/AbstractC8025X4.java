package p523V9;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import de.C13080h;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p017Af.C0492w;
import p017Af.C0494y;
import p027Ap.C0693a;
import p039Bc.C0885s;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1073w3.C20811m;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21958S;
import p1155zi.EnumC21973X;
import p130Eo.C2617b;
import p130Eo.InterfaceC2616a;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p229J0.C3941K4;
import p229J0.C3991U3;
import p229J0.C4135t3;
import p343Nk.C5817a;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p382Pf.C6401d;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17790w;

/* JADX INFO: renamed from: V9.X4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8025X4 {
    /* JADX INFO: renamed from: a */
    public static final void m8366a(C21958S c21958s, InterfaceC1426a onUpsell, InterfaceC1426a onDismiss, InterfaceC10459q interfaceC10459q, C3880A3 c3880a3, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        C3880A3 c3880a3M4785f;
        int i12;
        InterfaceC10459q interfaceC10459q3;
        C3880A3 c3880a4;
        AbstractC16544l.m18094g(onUpsell, "onUpsell");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        c6021p.m6526U(203993897);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c21958s) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onUpsell) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 256 : 128;
        }
        int i13 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i13 = i11 | 11264;
        }
        if ((i13 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            c3880a4 = c3880a3;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                interfaceC10459q2 = C10456n.f30959Y;
                c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, true);
                i12 = i13 & (-57345);
            } else {
                c6021p.m6517L();
                i12 = i13 & (-57345);
                interfaceC10459q2 = interfaceC10459q;
                c3880a3M4785f = c3880a3;
            }
            c6021p.m6554q();
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(-289013236);
            boolean zM6545h = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(c21958s);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C13080h(interfaceC20904w, c21958s, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c);
            AbstractC4152w2.m4780a(onDismiss, interfaceC10459q2, c3880a3M4785f, 0.0f, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13379c, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(-848345300, c6021p, new C0885s(c21958s, 25, onUpsell)), c6021p, (i12 >> 6) & 1022, 384, 4072);
            interfaceC10459q3 = interfaceC10459q2;
            c3880a4 = c3880a3M4785f;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(c21958s, onUpsell, onDismiss, interfaceC10459q3, c3880a4, i10, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m8367b(C21958S c21958s, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        char c9;
        int i11;
        int i12;
        String strM19533p;
        boolean z6;
        boolean z10;
        Object objM6514H;
        C10456n c10456n;
        C6021p c6021p2;
        int i13;
        C6021p c6021p3 = c6021p;
        int i14 = i10;
        c6021p3.m6526U(1312714635);
        int i15 = (i14 & 6) == 0 ? (c6021p3.m6545h(c21958s) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= c6021p3.m6545h(interfaceC1426a) ? 32 : 16;
        }
        int i16 = i15;
        if ((i16 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object obj = (InterfaceC20904w) c6021p3.m6548k(AbstractC20875V.f66456a);
            C10456n c10456n2 = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10842a.m11235m(c10456n2, AbstractC7313q.f23201f, 0.0f, 2), 1.0f);
            boolean z11 = false;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p3, 0);
            int i17 = c6021p3.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11244d);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a2 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p3.f19563O) {
                c6021p3.m6549l(interfaceC1426a2);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p3, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i17))) {
                AbstractC0168G.m537z(i17, c6021p3, i17, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d);
            c6021p3.m6524S(-236046378);
            String str = c21958s.f69522d;
            if (str != null) {
                AbstractC4124r4.m4768b(str, AbstractC10842a.m11237o(c10456n2, 0.0f, 0.0f, 0.0f, AbstractC7313q.f23202g, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12152h, c6021p, 0, 0, 65532);
            }
            c6021p3.m6553p(z11);
            c6021p3.m6524S(-236038785);
            String str2 = c21958s.f69521c;
            if (str2 != null) {
                AbstractC4124r4.m4768b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
            }
            c6021p3.m6553p(z11);
            c6021p3.m6524S(-236035693);
            int i18 = 1;
            List<EnumC21973X> list = c21958s.f69524f;
            if (list != null) {
                c6021p3 = c6021p3;
                for (EnumC21973X enumC21973X : list) {
                    c6021p3.m6524S(-236034711);
                    if (enumC21973X == EnumC21973X.GetPro || enumC21973X == EnumC21973X.GetPlus) {
                        int iOrdinal = enumC21973X.ordinal();
                        if (iOrdinal != i18) {
                            c9 = 4;
                            if (iOrdinal != 4) {
                                c6021p3.m6524S(-832590217);
                                c6021p3.m6553p(z11);
                                strM19533p = "";
                            } else {
                                i11 = 2051345234;
                                i12 = R.string.conversation_pro_upgrade_conversation_popup_button;
                            }
                            String str3 = strM19533p;
                            InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(AbstractC10842a.m11235m(c10456n2, 0.0f, AbstractC7313q.f23201f, i18), 1.0f);
                            c6021p3.m6524S(2051359521);
                            boolean zM6545h = c6021p3.m6545h(obj) | c6021p3.m6545h(c21958s) | c6021p3.m6542f(enumC21973X);
                            if ((i16 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = z11;
                            }
                            z10 = zM6545h | z6;
                            objM6514H = c6021p.m6514H();
                            if (!z10 || objM6514H == C6013l.f19514a) {
                                c10456n = c10456n2;
                                C6021p c6021p4 = c6021p3;
                                objM6514H = new C0494y(obj, c21958s, enumC21973X, interfaceC1426a, 10);
                                c6021p4.m6537c0(objM6514H);
                                c6021p2 = c6021p4;
                            } else {
                                c10456n = c10456n2;
                                c6021p2 = c6021p3;
                            }
                            c6021p2.m6553p(z11);
                            c6021p3 = c6021p2;
                            i13 = 1;
                            AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, interfaceC10459qM11244d2, false, null, null, null, null, null, null, AbstractC8411c.m8969c(-738889724, c6021p2, new C3991U3(str3, 6)), c6021p, 805306368, 508);
                        } else {
                            c9 = 4;
                            i11 = 2051349102;
                            i12 = R.string.conversation_upgrade_conversation_popup_button;
                        }
                        strM19533p = AbstractC17792x.m19533p(c6021p3, i11, i12, c6021p3, z11);
                        String str4 = strM19533p;
                        InterfaceC10459q interfaceC10459qM11244d3 = AbstractC10844c.m11244d(AbstractC10842a.m11235m(c10456n2, 0.0f, AbstractC7313q.f23201f, i18), 1.0f);
                        c6021p3.m6524S(2051359521);
                        boolean zM6545h2 = c6021p3.m6545h(obj) | c6021p3.m6545h(c21958s) | c6021p3.m6542f(enumC21973X);
                        if ((i16 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = z11;
                        }
                        z10 = zM6545h2 | z6;
                        objM6514H = c6021p.m6514H();
                        if (z10) {
                            c10456n = c10456n2;
                            C6021p c6021p5 = c6021p3;
                            objM6514H = new C0494y(obj, c21958s, enumC21973X, interfaceC1426a, 10);
                            c6021p5.m6537c0(objM6514H);
                            c6021p2 = c6021p5;
                        } else {
                            c10456n = c10456n2;
                            C6021p c6021p6 = c6021p3;
                            objM6514H = new C0494y(obj, c21958s, enumC21973X, interfaceC1426a, 10);
                            c6021p6.m6537c0(objM6514H);
                            c6021p2 = c6021p6;
                        }
                        c6021p2.m6553p(z11);
                        c6021p3 = c6021p2;
                        i13 = 1;
                        AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, interfaceC10459qM11244d3, false, null, null, null, null, null, null, AbstractC8411c.m8969c(-738889724, c6021p2, new C3991U3(str4, 6)), c6021p, 805306368, 508);
                    } else {
                        c10456n = c10456n2;
                        obj = obj;
                        i13 = i18;
                    }
                    c6021p3.m6553p(z11);
                    i14 = i10;
                    i18 = i13;
                    obj = obj;
                    z11 = z11;
                    c10456n2 = c10456n;
                    c6021p3 = c6021p3;
                }
            }
            C10456n c10456n3 = c10456n2;
            boolean z12 = z11;
            boolean z13 = i18;
            c6021p3.m6553p(z12);
            AbstractC17758g.m19482b(c6021p3, AbstractC10844c.m11245e(c10456n3, AbstractC7313q.f23201f));
            c6021p3.m6553p(z13);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(c21958s, interfaceC1426a, i10, 13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2617b m8368c(InterfaceC2616a interfaceC2616a, C0693a c0693a, Object obj, C5817a evaluator) {
        AbstractC16544l.m18094g(evaluator, "evaluator");
        List listMo2076b = interfaceC2616a.mo2076b(c0693a, obj, evaluator);
        Object objM19344T = AbstractC17680n.m19344T(1, c0693a);
        if (!AbstractC8038Z3.m8398g(objM19344T)) {
            objM19344T = null;
        }
        Map map = objM19344T instanceof Map ? (Map) objM19344T : null;
        return new C2617b(listMo2076b, map, interfaceC2616a.mo3619e(map, c0693a));
    }

    /* JADX INFO: renamed from: d */
    public static long m8369d(C20811m c20811m, int i10, int i11) {
        c20811m.m21344F(i10);
        if (c20811m.m21346a() < 5) {
            return -9223372036854775807L;
        }
        int iM21352g = c20811m.m21352g();
        if ((8388608 & iM21352g) != 0 || ((2096896 & iM21352g) >> 8) != i11 || (iM21352g & 32) == 0 || c20811m.m21365t() < 7 || c20811m.m21346a() < 7 || (c20811m.m21365t() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c20811m.m21350e(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }
}
