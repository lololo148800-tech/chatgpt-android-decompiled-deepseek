package p594Y9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import ge.C14020C0;
import ge.C14022D0;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p229J0.AbstractC4034c4;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7314r;
import p523V9.AbstractC8079e5;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p635a1.InterfaceC10459q;
import p911o0.AbstractC17758g;
import p927og.C18190a;
import p990rg.C18982i;
import p990rg.C18983j;

/* JADX INFO: renamed from: Y9.A4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9698A4 {
    /* JADX INFO: renamed from: a */
    public static final void m10290a(C18982i prompt, InterfaceC1436k onClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(prompt, "prompt");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(-307490295);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(prompt) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C20416d c20416dM21079a = AbstractC20417e.m21079a(AbstractC7314r.f23209b);
            InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(interfaceC10459q, c20416dM21079a);
            c6021p.m6524S(1241190399);
            boolean z6 = ((i11 & 112) == 32) | ((i11 & 14) == 4);
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C14020C0(onClick, prompt, 1);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC4034c4.m4725a(AbstractC10833a.m11209d(interfaceC10459qM8501a, false, null, (InterfaceC1426a) objM6514H, 7), c20416dM21079a, 0L, 0L, AbstractC7306j.f23143a, 0.0f, null, AbstractC8411c.m8969c(-2130022386, c6021p, new C18190a(prompt, 2)), c6021p, 12582912, 108);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(prompt, onClick, interfaceC10459q, i10, 19);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10291b(C18983j starterPrompts, InterfaceC1436k onClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(starterPrompts, "starterPrompts");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(688193088);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(starterPrompts) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC17758g.m19481a(AbstractC10844c.m11244d(interfaceC10459q, 1.0f), null, false, AbstractC8411c.m8969c(-49463510, c6021p, new C14022D0(starterPrompts, onClick, 1)), c6021p, 3072, 6);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(starterPrompts, onClick, interfaceC10459q, i10, 20);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m10292c(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM10299b = AbstractC9704B4.m10299b(obj);
        int i11 = iM10299b & i10;
        int iM10293d = m10293d(i11, obj3);
        if (iM10293d != 0) {
            int i12 = ~i10;
            int i13 = iM10299b & i12;
            int i14 = -1;
            while (true) {
                int i15 = iM10293d - 1;
                int i16 = iArr[i15];
                if ((i16 & i12) != i13 || !AbstractC9728F4.m10319b(obj, objArr[i15]) || (objArr2 != null && !AbstractC9728F4.m10319b(obj2, objArr2[i15]))) {
                    int i17 = i16 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i14 = i15;
                    iM10293d = i17;
                } else {
                    int i18 = i16 & i10;
                    if (i14 == -1) {
                        m10295f(i11, obj3, i18);
                    } else {
                        iArr[i14] = (i18 & i10) | (iArr[i14] & i12);
                    }
                    return i15;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static int m10293d(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    /* JADX INFO: renamed from: e */
    public static Object m10294e(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i10 <= 256) {
            return new byte[i10];
        }
        return i10 <= 65536 ? new short[i10] : new int[i10];
    }

    /* JADX INFO: renamed from: f */
    public static void m10295f(int i10, Object obj, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
