package p544W9;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p1153zg.C21886c;
import p204I1.C3581L;
import p349O0.C6018n0;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p530Vi.AbstractC8301I;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9231W3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p895n1.C17425e;
import p953q0.C18557O;
import ug.AbstractC20236s;
import ug.C20231n;

/* JADX INFO: renamed from: W9.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8676n {

    /* JADX INFO: renamed from: a */
    public static C17425e f26622a;

    /* JADX INFO: renamed from: a */
    public static final void m9364a(AbstractC20236s state, InterfaceC1426a onRetry, InterfaceC1426a onLogout, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(onRetry, "onRetry");
        AbstractC16544l.m18094g(onLogout, "onLogout");
        c6021p.m6526U(-1798142907);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(state) : c6021p.m6545h(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onRetry) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onLogout) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            C20231n c20231n = (C20231n) (state instanceof C20231n ? state : null);
            String strM9804b = c20231n != null ? AbstractC9231W3.m9804b(c20231n.f64026b, c8870f.f27152e, c8870f.f27148a) : null;
            c6021p.m6524S(-437064495);
            if (strM9804b == null) {
                strM9804b = AbstractC8142m4.m8676d(R.string.design_error_network, c6021p);
            }
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(c10456n, null, 0L, null, false, AbstractC8411c.m8969c(-487033719, c6021p, new C21886c(strM9804b, onRetry, onLogout, 1)), c6021p, ((i12 >> 9) & 14) | 196608, 30);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(state, onRetry, onLogout, interfaceC10459q2, i10, 12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m9365b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        if (i11 >= 0) {
            long j10 = (((long) i11) & 4294967295L) | (((long) i10) << 32);
            int i12 = C3581L.f10907c;
            return j10;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }

    /* JADX INFO: renamed from: c */
    public static final long m9366c(int i10, long j10) {
        int i11 = C3581L.f10907c;
        int i12 = (int) (j10 >> 32);
        int iM8921l = AbstractC8301I.m8921l(i12, 0, i10);
        int i13 = (int) (4294967295L & j10);
        int iM8921l2 = AbstractC8301I.m8921l(i13, 0, i10);
        return (iM8921l == i12 && iM8921l2 == i13) ? j10 : m9365b(iM8921l, iM8921l2);
    }

    /* JADX INFO: renamed from: d */
    public static final String m9367d(long j10, CharSequence charSequence) {
        return charSequence.subSequence(C3581L.m4270f(j10), C3581L.m4269e(j10)).toString();
    }
}
