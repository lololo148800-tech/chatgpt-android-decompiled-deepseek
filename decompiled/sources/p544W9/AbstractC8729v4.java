package p544W9;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1014t1.C19729f;
import p1014t1.C19738o;
import p346Nn.InterfaceC5888b;
import p346Nn.InterfaceC5934y;
import p759g1.C13800b;

/* JADX INFO: renamed from: W9.v4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8729v4 {
    /* JADX INFO: renamed from: a */
    public static final void m9454a(InterfaceC5934y interfaceC5934y, InterfaceC1436k[] interfaceC1436kArr, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(interfaceC5934y, "<this>");
        if (!(interfaceC5934y instanceof InterfaceC5888b)) {
            throw new IllegalStateException("impossible");
        }
        InterfaceC1436k[] interfaceC1436kArr2 = (InterfaceC1436k[]) Arrays.copyOf(interfaceC1436kArr, interfaceC1436kArr.length);
        AbstractC16529F.m18081e(1, interfaceC1436k);
        ((InterfaceC5888b) interfaceC5934y).mo6294h(interfaceC1436kArr2, interfaceC1436k);
    }

    /* JADX INFO: renamed from: b */
    public static final float m9455b(long j10) {
        if (C13800b.m15306g(j10) == 0.0f && C13800b.m15307h(j10) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(C13800b.m15306g(j10), C13800b.m15307h(j10)))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public static final long m9456c(C19729f c19729f, boolean z6) {
        ?? r10 = c19729f.f62460a;
        int size = r10.size();
        long jM15311l = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C19738o c19738o = (C19738o) r10.get(i11);
            if (c19738o.f62481d && c19738o.f62485h) {
                jM15311l = C13800b.m15311l(jM15311l, z6 ? c19738o.f62480c : c19738o.f62484g);
                i10++;
            }
        }
        if (i10 == 0) {
            return 9205357640488583168L;
        }
        return C13800b.m15302c(i10, jM15311l);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public static final float m9457d(C19729f c19729f, boolean z6) {
        long jM9456c = m9456c(c19729f, z6);
        float fM15304e = 0.0f;
        if (C13800b.m15303d(jM9456c, 9205357640488583168L)) {
            return 0.0f;
        }
        ?? r10 = c19729f.f62460a;
        int size = r10.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C19738o c19738o = (C19738o) r10.get(i11);
            if (c19738o.f62481d && c19738o.f62485h) {
                i10++;
                fM15304e = C13800b.m15304e(C13800b.m15310k(z6 ? c19738o.f62480c : c19738o.f62484g, jM9456c)) + fM15304e;
            }
        }
        return fM15304e / i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    public static final float m9458e(C19729f c19729f) {
        ?? r6 = c19729f.f62460a;
        int size = r6.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= size) {
                break;
            }
            C19738o c19738o = (C19738o) r6.get(i10);
            if (!c19738o.f62485h || !c19738o.f62481d) {
                i12 = 0;
            }
            i11 += i12;
            i10++;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        long jM9456c = m9456c(c19729f, true);
        long jM9456c2 = m9456c(c19729f, false);
        int size2 = r6.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i13 = 0; i13 < size2; i13++) {
            C19738o c19738o2 = (C19738o) r6.get(i13);
            if (c19738o2.f62481d && c19738o2.f62485h) {
                long jM15310k = C13800b.m15310k(c19738o2.f62484g, jM9456c2);
                long jM15310k2 = C13800b.m15310k(c19738o2.f62480c, jM9456c);
                float fM9455b = m9455b(jM15310k2) - m9455b(jM15310k);
                float fM15304e = C13800b.m15304e(C13800b.m15311l(jM15310k2, jM15310k)) / 2.0f;
                if (fM9455b > 180.0f) {
                    fM9455b -= 360.0f;
                } else if (fM9455b < -180.0f) {
                    fM9455b += 360.0f;
                }
                f11 += fM9455b * fM15304e;
                f10 += fM15304e;
            }
        }
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f11 / f10;
    }

    /* JADX INFO: renamed from: f */
    public static final void m9459f(InterfaceC5934y interfaceC5934y, char c9) {
        AbstractC16544l.m18094g(interfaceC5934y, "<this>");
        interfaceC5934y.mo6292b(String.valueOf(c9));
    }

    /* JADX INFO: renamed from: g */
    public static final void m9460g(InterfaceC5934y interfaceC5934y, String ifZero, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(interfaceC5934y, "<this>");
        AbstractC16544l.m18094g(ifZero, "ifZero");
        if (!(interfaceC5934y instanceof InterfaceC5888b)) {
            throw new IllegalStateException("impossible");
        }
        AbstractC16529F.m18081e(1, interfaceC1436k);
        ((InterfaceC5888b) interfaceC5934y).mo6298n(ifZero, interfaceC1436k);
    }
}
