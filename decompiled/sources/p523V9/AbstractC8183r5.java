package p523V9;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p152Fm.AbstractC2922d;
import p152Fm.C2921c;
import p200Hm.C3511j;
import p917o6.C17859l;

/* JADX INFO: renamed from: V9.r5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8183r5 {
    /* JADX INFO: renamed from: b */
    public static final C0678l m8764b(C0675i c0675i) {
        return c0675i.m1417C0(c0675i.m1420N0());
    }

    /* JADX INFO: renamed from: c */
    public static final void m8765c(C17859l c17859l, Map map) {
        AbstractC16544l.m18094g(c17859l, "<this>");
        c17859l.f56949c.getClass();
    }

    /* JADX INFO: renamed from: d */
    public static final void m8766d(C0675i c0675i, C0678l bytes) {
        AbstractC16544l.m18094g(bytes, "bytes");
        c0675i.m1439i1(bytes.mo1372d());
        c0675i.m1432c1(bytes);
    }

    /* JADX INFO: renamed from: a */
    public static final long m8763a(C2921c c2921c, C3511j c3511j) {
        AbstractC16544l.m18094g(c2921c, "<this>");
        if (c3511j.isEmpty()) {
            throw new IllegalArgumentException(nkFZpTrMPpn.CWMnMwA + c3511j);
        }
        long j10 = c3511j.f10600Z;
        long j11 = c3511j.f10599Y;
        if (j10 < Long.MAX_VALUE) {
            return AbstractC2922d.f8759Z.mo3726e(j11, j10 + 1);
        }
        if (j11 <= Long.MIN_VALUE) {
            return AbstractC2922d.f8759Z.mo3724d();
        }
        return AbstractC2922d.f8759Z.mo3726e(j11 - 1, j10) + 1;
    }
}
