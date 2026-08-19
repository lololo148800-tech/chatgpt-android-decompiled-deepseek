package p571X9;

import androidx.compose.foundation.layout.AbstractC10844c;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mh.AbstractC17270r;
import mh.C17253a;
import mh.C17254b;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2467N0;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p492U1.InterfaceC7537b;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p737f1.InterfaceC13515g;
import p911o0.AbstractC17780r;
import p911o0.C17718B0;
import p911o0.C17756f;

/* JADX INFO: renamed from: X9.O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9180O {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [U1.b] */
    /* JADX WARN: Type inference failed for: r31v0, types: [O0.p] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX INFO: renamed from: a */
    public static final void m9736a(boolean z6, InterfaceC1426a onRestoreKeyboard, InterfaceC1436k onTranscribe, InterfaceC1426a onClose, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z10;
        ?? M6412g;
        AbstractC16544l.m18094g(onRestoreKeyboard, "onRestoreKeyboard");
        AbstractC16544l.m18094g(onTranscribe, "onTranscribe");
        AbstractC16544l.m18094g(onClose, "onClose");
        c6021p.m6526U(2109406887);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onRestoreKeyboard) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onTranscribe) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onClose) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-504450757);
            Object obj = C6013l.f19514a;
            if (z6) {
                InterfaceC13515g interfaceC13515g = (InterfaceC13515g) c6021p.m6548k(AbstractC0187M0.f705g);
                C17296C c17296c = C17296C.f55119a;
                c6021p.m6524S(-504447787);
                boolean zM6545h = c6021p.m6545h(interfaceC13515g);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == obj) {
                    objM6514H = new C17253a(interfaceC13515g, null);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c);
            }
            c6021p.m6553p(false);
            ?? r14 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            WeakHashMap weakHashMap = C17718B0.f56555v;
            int i12 = C17756f.m19480f(c6021p).f56560e.m19476e().f60089d;
            int i13 = C17756f.m19480f(c6021p).f56558c.m19476e().f60089d;
            c6021p.m6524S(-504439847);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = C5997d.m6429P(0);
                c6021p.m6537c0(objM6514H2);
            }
            C5996c0 c5996c0 = (C5996c0) objM6514H2;
            c6021p.m6553p(false);
            c5996c0.m6413h(Math.max(c5996c0.m6412g(), i13));
            c6021p.m6524S(-504435462);
            Object objM6514H3 = c6021p.m6514H();
            C5975S c5975s = C5975S.f19448r0;
            if (objM6514H3 == obj) {
                objM6514H3 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H3;
            c6021p.m6553p(false);
            int i14 = i11 >> 3;
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(onRestoreKeyboard, c6021p);
            Boolean boolValueOf = Boolean.valueOf(z6);
            c6021p.m6524S(-504430935);
            int i15 = i11 & 14;
            boolean zM6538d = (i15 == 4) | c6021p.m6538d(i13) | c6021p.m6542f(interfaceC5985XM6435V);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6538d || objM6514H4 == obj) {
                z10 = false;
                C17254b c17254b = new C17254b(z6, i13, interfaceC5985X, interfaceC5985XM6435V, null);
                c6021p.m6537c0(c17254b);
                objM6514H4 = c17254b;
            } else {
                z10 = false;
            }
            c6021p.m6553p(z10);
            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, boolValueOf);
            c6021p.m6524S(-504424401);
            boolean z11 = i15 == 4 ? true : z10;
            Object objM6514H5 = c6021p.m6514H();
            if (z11 || objM6514H5 == obj) {
                Boolean bool = (Boolean) interfaceC5985X.getValue();
                bool.booleanValue();
                objM6514H5 = C5997d.m6430Q(bool, c5975s);
                c6021p.m6537c0(objM6514H5);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H5;
            c6021p.m6553p(z10);
            if (i13 == c5996c0.m6412g()) {
                interfaceC5985X2.setValue(Boolean.FALSE);
            }
            int iMo7866k0 = r14.mo7866k0(256);
            if (z6) {
                M6412g = Math.max(iMo7866k0, c5996c0.m6412g());
            } else {
                M6412g = ((Boolean) interfaceC5985X2.getValue()).booleanValue() ? c5996c0.m6412g() : z10;
            }
            InterfaceC10459q interfaceC10459qM11245e = AbstractC10844c.m11245e(interfaceC10459q, r14.mo7861O(Math.max(i12, Math.max(i13, (int) M6412g))));
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30941t0, z10);
            int i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11245e);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC17270r.m18972b(z6, onTranscribe, onClose, AbstractC10844c.m11245e(AbstractC10844c.m11244d(c10456n, 1.0f), r14.mo7861O(M6412g)), c6021p, (i14 & 112) | i15 | (i14 & 896));
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2467N0(z6, onRestoreKeyboard, onTranscribe, onClose, interfaceC10459q, i10, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9737b(int i10, int i11) {
        return i10 == i11;
    }
}
