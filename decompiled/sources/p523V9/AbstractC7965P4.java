package p523V9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC11112u;
import p049Bm.InterfaceC1439n;
import p124Ei.C2552x0;
import p124Ei.C2554y0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p914o3.AbstractC17814e;

/* JADX INFO: renamed from: V9.P4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7965P4 {
    /* JADX INFO: renamed from: a */
    public static final void m8250a(int i10, C6021p c6021p, boolean z6) {
        int i11;
        c6021p.m6526U(750661253);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC11112u interfaceC11112u = (InterfaceC11112u) c6021p.m6548k(AbstractC17814e.f56807a);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            Boolean boolValueOf = Boolean.valueOf(z6);
            c6021p.m6524S(-469997957);
            boolean zM6545h = ((i11 & 14) == 4) | c6021p.m6545h(interfaceC11112u) | c6021p.m6545h(context);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C2552x0(interfaceC11112u, z6, context, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, boolValueOf);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2554y0(z6, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8251b(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    /* JADX INFO: renamed from: c */
    public static final int m8252c(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 >= i11) {
                return i11;
            }
            int i13 = i11 % i12;
            if (i13 < 0) {
                i13 += i12;
            }
            int i14 = i10 % i12;
            if (i14 < 0) {
                i14 += i12;
            }
            int i15 = (i13 - i14) % i12;
            if (i15 < 0) {
                i15 += i12;
            }
            return i11 - i15;
        }
        if (i12 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i10 <= i11) {
            return i11;
        }
        int i16 = -i12;
        int i17 = i10 % i16;
        if (i17 < 0) {
            i17 += i16;
        }
        int i18 = i11 % i16;
        if (i18 < 0) {
            i18 += i16;
        }
        int i19 = (i17 - i18) % i16;
        if (i19 < 0) {
            i19 += i16;
        }
        return i11 + i19;
    }
}
