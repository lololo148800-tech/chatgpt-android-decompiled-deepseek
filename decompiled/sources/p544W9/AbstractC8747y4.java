package p544W9;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p124Ei.C2467N0;
import p204I1.C3581L;
import p349O0.C6018n0;
import p349O0.C6021p;
import p350O1.C6045C;
import p537W0.AbstractC8411c;
import p587Y1.C9588n;
import p594Y9.AbstractC9973t4;
import p870le.C16896n0;

/* JADX INFO: renamed from: W9.y4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8747y4 {
    /* JADX INFO: renamed from: a */
    public static final void m9498a(C6045C value, InterfaceC1436k onValueChange, boolean z6, InterfaceC1426a onSendClick, InterfaceC1426a onDismiss, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(onValueChange, "onValueChange");
        AbstractC16544l.m18094g(onSendClick, "onSendClick");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        c6021p.m6526U(-1106228708);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(value) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onValueChange) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onSendClick) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9973t4.m10617b(onDismiss, new C9588n(7), AbstractC8411c.m8969c(-1407235149, c6021p, new C16896n0(1, onDismiss, onSendClick, onValueChange, value, z6)), c6021p, ((i12 >> 12) & 14) | 432, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2467N0(i10, onSendClick, onDismiss, onValueChange, value, z6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m9499b(long j10, long j11) {
        int iM4268d;
        int iM4270f = C3581L.m4270f(j10);
        int iM4269e = C3581L.m4269e(j10);
        if (C3581L.m4270f(j11) >= C3581L.m4269e(j10) || C3581L.m4270f(j10) >= C3581L.m4269e(j11)) {
            if (iM4269e > C3581L.m4270f(j11)) {
                iM4270f -= C3581L.m4268d(j11);
                iM4268d = C3581L.m4268d(j11);
                iM4269e -= iM4268d;
            }
        } else if (C3581L.m4265a(j11, j10)) {
            iM4270f = C3581L.m4270f(j11);
            iM4269e = iM4270f;
        } else {
            if (C3581L.m4265a(j10, j11)) {
                iM4268d = C3581L.m4268d(j11);
            } else {
                int iM4270f2 = C3581L.m4270f(j11);
                if (iM4270f >= C3581L.m4269e(j11) || iM4270f2 > iM4270f) {
                    iM4269e = C3581L.m4270f(j11);
                } else {
                    iM4270f = C3581L.m4270f(j11);
                    iM4268d = C3581L.m4268d(j11);
                }
            }
            iM4269e -= iM4268d;
        }
        return AbstractC8676n.m9365b(iM4270f, iM4269e);
    }
}
