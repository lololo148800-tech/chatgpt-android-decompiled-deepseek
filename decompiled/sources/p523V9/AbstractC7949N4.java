package p523V9;

import android.gov.nist.core.Separators;
import cd.C11709i;
import ge.C14103t0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p017Af.C0492w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1039ud.C20184a;
import p124Ei.C2458J;
import p124Ei.C2532n1;
import p229J0.AbstractC4141u3;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p229J0.C4135t3;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p403Qd.C6636i;
import p537W0.AbstractC8411c;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p789hg.C14505d;
import tf.C19907L;

/* JADX INFO: renamed from: V9.N4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7949N4 {
    /* JADX INFO: renamed from: a */
    public static final void m8236a(C11709i popupMenuState, C6636i c6636i, boolean z6, InterfaceC1426a onUnarchive, InterfaceC1426a onDelete, InterfaceC1426a onSettings, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(popupMenuState, "popupMenuState");
        AbstractC16544l.m18094g(onUnarchive, "onUnarchive");
        AbstractC16544l.m18094g(onDelete, "onDelete");
        AbstractC16544l.m18094g(onSettings, "onSettings");
        c6021p.m6526U(45625532);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(popupMenuState) : c6021p.m6545h(popupMenuState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c6636i) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onUnarchive) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onDelete) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(onSettings) ? 131072 : 65536;
        }
        int i12 = i11 | 1572864;
        if ((i12 & 599187) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            c6021p.m6524S(-574442734);
            boolean z10 = (i12 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (z10 || objM6514H == obj) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            AbstractC8198t4.m8798a(popupMenuState, interfaceC10459q2, AbstractC8411c.m8969c(646550975, c6021p, new C19907L(onUnarchive, popupMenuState, interfaceC5985X)), c6021p, (i12 & 14) | 384 | ((i12 >> 15) & 112), 0);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                c6021p.m6524S(-574409186);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f || objM6514H2 == obj) {
                    objM6514H2 = new C14103t0(interfaceC5985X, 17);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
                c6021p.m6553p(false);
                c6021p.m6524S(-574407472);
                boolean z11 = (i12 & 57344) == 16384;
                Object objM6514H3 = c6021p.m6514H();
                if (z11 || objM6514H3 == obj) {
                    objM6514H3 = new C14505d(28, onDelete);
                    c6021p.m6537c0(objM6514H3);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H3;
                c6021p.m6553p(false);
                c6021p.m6524S(-574406158);
                boolean z12 = (i12 & 458752) == 131072;
                Object objM6514H4 = c6021p.m6514H();
                if (z12 || objM6514H4 == obj) {
                    objM6514H4 = new C14505d(29, onSettings);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC8078e4.m8494a(interfaceC1426a, interfaceC1426a2, (InterfaceC1426a) objM6514H4, z6, c6021p, (i12 << 3) & 7168);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C20184a(popupMenuState, c6636i, z6, onUnarchive, onDelete, onSettings, interfaceC10459q2, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8237b(C2532n1 c2532n1, InterfaceC1426a onDismissRequest, InterfaceC1436k onMessagesIntent, InterfaceC10459q interfaceC10459q, C3880A3 c3880a3, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        C3880A3 c3880a3M4785f;
        int i12;
        InterfaceC10459q interfaceC10459q3;
        C3880A3 c3880a4;
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        AbstractC16544l.m18094g(onMessagesIntent, "onMessagesIntent");
        c6021p.m6526U(-1888374089);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c2532n1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDismissRequest) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onMessagesIntent) ? 256 : 128;
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
                c3880a3M4785f = AbstractC4152w2.m4785f(6, 2, c6021p, false);
                i12 = i13 & (-57345);
            } else {
                c6021p.m6517L();
                i12 = i13 & (-57345);
                interfaceC10459q2 = interfaceC10459q;
                c3880a3M4785f = c3880a3;
            }
            c6021p.m6554q();
            AbstractC4152w2.m4780a(onDismissRequest, interfaceC10459q2, c3880a3M4785f, 0.0f, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13380d, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(1242532922, c6021p, new C2458J(c2532n1, onMessagesIntent, 0)), c6021p, ((i12 >> 3) & 14) | 805306368 | ((i12 >> 6) & 112), 384, 3560);
            interfaceC10459q3 = interfaceC10459q2;
            c3880a4 = c3880a3M4785f;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w((Object) c2532n1, (Object) onDismissRequest, onMessagesIntent, (Object) interfaceC10459q3, (Object) c3880a4, i10, 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m8238c(int i10, int i11) {
        long j10 = ((long) i10) + ((long) i11);
        int i12 = (int) j10;
        if (j10 == ((long) i12)) {
            return i12;
        }
        throw new ArithmeticException(AbstractC0168G.m532u("overflow: checkedAdd(", i10, ", ", i11, Separators.RPAREN));
    }
}
