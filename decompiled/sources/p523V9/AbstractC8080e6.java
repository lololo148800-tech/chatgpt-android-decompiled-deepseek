package p523V9;

import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import de.C13077e;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0292u;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1039ud.C20184a;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1127yf.C21531f;
import p1155zi.C22011h0;
import p179H0.C3191i;
import p179H0.C3193k;
import p179H0.C3196n;
import p291Lf.AbstractC5023t;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p479Td.C7320F;
import p537W0.AbstractC8411c;
import p575Xd.C9436E;
import p635a1.InterfaceC10459q;
import p962qc.AbstractC18671e;

/* JADX INFO: renamed from: V9.e6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8080e6 {
    /* JADX INFO: renamed from: a */
    public static final void m8506a(String str, String messageId, C7320F content, boolean z6, C9436E safeUrls, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z10;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(safeUrls, "safeUrls");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-1295812469);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(messageId) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(content) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(safeUrls) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 1048576 : 524288;
        }
        int i12 = i11;
        if ((599187 & i12) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(302222910);
            if (z6 || content.f23221e.isEmpty()) {
                z10 = false;
                i12 = i12;
            } else {
                c6021p.m6524S(302225601);
                boolean z11 = ((458752 & i12) == 131072) | ((i12 & 14) == 4) | ((i12 & 112) == 32) | ((i12 & 896) == 256);
                Object objM6514H = c6021p.m6514H();
                if (z11 || objM6514H == C6013l.f19514a) {
                    C21531f c21531f = new C21531f(onIntent, str, messageId, content, null);
                    c6021p.m6537c0(c21531f);
                    objM6514H = c21531f;
                }
                z10 = false;
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, onIntent);
            }
            c6021p.m6553p(z10);
            AbstractC18671e.m20038a(interfaceC10459q, AbstractC5023t.m5651b(c6021p), AbstractC8411c.m8969c(327074518, c6021p, new C13077e(content, z6, onIntent, messageId, str, safeUrls, (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a))), c6021p, ((i12 >> 18) & 14) | 384, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C20184a(str, messageId, content, z6, safeUrls, onIntent, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10459q m8507b(InterfaceC10459q interfaceC10459q, C3196n c3196n) {
        return AbstractC10866a.m11313a(interfaceC10459q, new C3193k(new C0292u(1, c3196n, C3196n.class, "onPull", "onPull$material_release(F)F", 0, 6), new C3191i(2, c3196n, C3196n.class, "onRelease", "onRelease$material_release(F)F", 4, 0), true), null);
    }

    /* JADX INFO: renamed from: c */
    public static final String m8508c(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            return f10 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i10 = (int) f11;
        if (f11 - i10 >= 0.5f) {
            i10++;
        }
        float f12 = i10 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }
}
