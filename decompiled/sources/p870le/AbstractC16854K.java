package p870le;

import androidx.compose.animation.AbstractC10831a;
import com.openai.chatgpt.R;
import ge.C14089m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p039Bc.C0886t;
import p042Bf.C1276r;
import p049Bm.InterfaceC1436k;
import p1025te.C19866Q;
import p1042uh.C20263a0;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2463L0;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p328N1.C5609y;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13508z;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17781r0;

/* JADX INFO: renamed from: le.K */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16854K {

    /* JADX INFO: renamed from: a */
    public static final float f54069a;

    static {
        float f10 = AbstractC7313q.f23196a;
        f54069a = AbstractC7313q.f23205j * 4;
    }

    /* JADX INFO: renamed from: a */
    public static final void m18575a(List list, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(64009313);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC10831a.m11201d(z6 && !list.isEmpty(), interfaceC10459q, AbstractC13508z.m15013e(null, 3).m14995a(AbstractC13508z.m15022n(null, C16883h.f54211x0, 1)), AbstractC13508z.m15014f(null, 3).m14996a(AbstractC13508z.m15024p(null, C16883h.f54212y0, 1)), null, AbstractC8411c.m8969c(-1054550215, c6021p, new C16853J(list, interfaceC1436k, 1)), c6021p, ((i11 >> 3) & 112) | 200064, 16);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(list, interfaceC1436k, interfaceC10459q, z6, i10, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m18576b(C19866Q c19866q, InterfaceC1436k onInputIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        boolean z6;
        boolean z10;
        Object objM6514H;
        InterfaceC10459q interfaceC10459q3;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(onInputIntent, "onInputIntent");
        c6021p.m6526U(-1814802563);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(c19866q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onInputIntent) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 384) == 0) {
                i12 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
            }
            if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                if (i13 != 0) {
                    interfaceC10459q2 = C10456n.f30959Y;
                } else {
                    interfaceC10459q2 = interfaceC10459q;
                }
                c6021p.m6524S(958095425);
                z6 = false;
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H = c6021p.m6514H();
                if (z10 || objM6514H == C6013l.f19514a) {
                    objM6514H = new C14089m0(6, onInputIntent);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(false);
                if (!c19866q.f62982m.isEmpty() && c19866q.f62980k == null) {
                    z6 = true;
                }
                m18575a(c19866q.f62982m, interfaceC1436k, interfaceC10459q2, z6, c6021p, i12 & 896);
                interfaceC10459q3 = interfaceC10459q2;
            } else {
                c6021p.m6517L();
                interfaceC10459q3 = interfaceC10459q;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1276r((Object) c19866q, (Object) onInputIntent, interfaceC10459q3, i10, i11, 13);
            }
        }
        i12 |= 384;
        if ((i12 & 147) == 146) {
            if (i13 != 0) {
                interfaceC10459q2 = C10456n.f30959Y;
            } else {
                interfaceC10459q2 = interfaceC10459q;
            }
            c6021p.m6524S(958095425);
            z6 = false;
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            objM6514H = c6021p.m6514H();
            if (z10) {
                objM6514H = new C14089m0(6, onInputIntent);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C14089m0(6, onInputIntent);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            if (!c19866q.f62982m.isEmpty()) {
                z6 = true;
            }
            m18575a(c19866q.f62982m, interfaceC1436k2, interfaceC10459q2, z6, c6021p, i12 & 896);
            interfaceC10459q3 = interfaceC10459q2;
        } else {
            if (i13 != 0) {
                interfaceC10459q2 = C10456n.f30959Y;
            } else {
                interfaceC10459q2 = interfaceC10459q;
            }
            c6021p.m6524S(958095425);
            z6 = false;
            if ((i12 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            objM6514H = c6021p.m6514H();
            if (z10) {
                objM6514H = new C14089m0(6, onInputIntent);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C14089m0(6, onInputIntent);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            if (!c19866q.f62982m.isEmpty()) {
                z6 = true;
            }
            m18575a(c19866q.f62982m, interfaceC1436k3, interfaceC10459q2, z6, c6021p, i12 & 896);
            interfaceC10459q3 = interfaceC10459q2;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r((Object) c19866q, (Object) onInputIntent, interfaceC10459q3, i10, i11, 13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m18577c(C20263a0 c20263a0, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10) {
        int i11;
        boolean z10;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1305070538);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c20263a0) : c6021p.m6545h(c20263a0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p, 0);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(1492101134);
            if (z6) {
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_at_mention_gizmo_subtitle, c6021p), null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131066);
                z10 = false;
            } else {
                z10 = false;
            }
            c6021p.m6553p(z10);
            AbstractC4124r4.m4768b(c20263a0.f64086c.f64081a, c10456n, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q, 0L, null, C5609y.f18157t0, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, 196656, 3120, 120792);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0886t(c20263a0, interfaceC10459q2, z6, i10);
        }
    }
}
