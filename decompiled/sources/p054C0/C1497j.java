package p054C0;

import java.util.LinkedHashMap;
import java.util.Map;
import p017Af.C0485p;
import p080D0.AbstractC1823p0;
import p080D0.C1821o0;
import p080D0.C1826r;
import p080D0.C1840y;
import p080D0.InterfaceC1812k;
import p080D0.InterfaceC1815l0;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1095x1.InterfaceC21098s;
import p259K5.C4539a;
import p259K5.C4542d;
import p259K5.C4544f;
import p305M3.C5281a;
import p372P3.C6330l;
import p372P3.C6338t;
import p372P3.C6339u;
import p372P3.InterfaceC6310B;
import p658b5.C11234e;
import p658b5.C11248s;
import p759g1.C13800b;
import p846k4.InterfaceC16338g;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: C0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1497j implements InterfaceC1812k, InterfaceC16338g {

    /* JADX INFO: renamed from: Y */
    public long f3970Y;

    /* JADX INFO: renamed from: Z */
    public long f3971Z;

    /* JADX INFO: renamed from: o0 */
    public Object f3972o0;

    /* JADX INFO: renamed from: p0 */
    public Object f3973p0;

    public C1497j(long j10, int i10) {
        AbstractC20800b.m21320h(((C5281a) this.f3972o0) == null);
        this.f3970Y = j10;
        this.f3971Z = j10 + ((long) i10);
    }

    /* JADX INFO: renamed from: b */
    public static final long m2152b(C1497j c1497j, long j10, long j11) {
        c1497j.getClass();
        if (j11 == 0) {
            return j10;
        }
        long j12 = 4;
        return (j10 / j12) + ((j11 / j12) * ((long) 3));
    }

    @Override // p846k4.InterfaceC16338g
    /* JADX INFO: renamed from: a */
    public long mo2153a(C6330l c6330l) {
        long j10 = this.f3971Z;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f3971Z = -1L;
        return j11;
    }

    @Override // p846k4.InterfaceC16338g
    /* JADX INFO: renamed from: c */
    public InterfaceC6310B mo2154c() {
        AbstractC20800b.m21320h(this.f3970Y != -1);
        return new C6338t((C6339u) this.f3972o0, this.f3970Y, 0);
    }

    /* JADX INFO: renamed from: d */
    public void m2155d(Object obj, Object obj2, C4542d c4542d) {
        C4542d c4542d2 = (C4542d) obj2;
        ((C4544f) ((C11248s) this.f3973p0).f34081Z).m5309c((C4539a) obj, c4542d2.f14847a, c4542d2.f14848b, c4542d2.f14849c);
    }

    @Override // p846k4.InterfaceC16338g
    /* JADX INFO: renamed from: e */
    public void mo2156e(long j10) {
        long[] jArr = (long[]) ((C11234e) this.f3973p0).f34001Z;
        this.f3971Z = jArr[AbstractC20817s.m21404e(jArr, j10, true)];
    }

    /* JADX INFO: renamed from: f */
    public long m2157f() {
        if (this.f3971Z == -1) {
            long jM2158h = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.f3972o0).entrySet()) {
                jM2158h += m2158h(entry.getKey(), entry.getValue());
            }
            this.f3971Z = jM2158h;
        }
        return this.f3971Z;
    }

    @Override // p080D0.InterfaceC1812k
    /* JADX INFO: renamed from: g */
    public boolean mo461g(long j10, C1826r c1826r) {
        InterfaceC21098s interfaceC21098s = (InterfaceC21098s) ((C1494g) this.f3972o0).invoke();
        if (interfaceC21098s == null) {
            return true;
        }
        if (!interfaceC21098s.mo21522h()) {
            return false;
        }
        InterfaceC1815l0 interfaceC1815l0 = (InterfaceC1815l0) this.f3973p0;
        if (!AbstractC1823p0.m2652a(interfaceC1815l0, this.f3971Z)) {
            return false;
        }
        if (!((C1821o0) interfaceC1815l0).m2649b(interfaceC21098s, j10, this.f3970Y, c1826r, false)) {
            return true;
        }
        this.f3970Y = j10;
        return true;
    }

    /* JADX INFO: renamed from: h */
    public long m2158h(Object obj, Object obj2) throws Exception {
        try {
            long j10 = ((C4542d) obj2).f14849c;
            if (j10 >= 0) {
                return j10;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j10).toString());
        } catch (Exception e10) {
            this.f3971Z = -1L;
            throw e10;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2159i(long j10) {
        while (m2157f() > j10) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3972o0;
            if (linkedHashMap.isEmpty()) {
                if (m2157f() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) AbstractC17680n.m19340P(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f3971Z = m2157f() - m2158h(key, value);
            m2155d(key, value, null);
        }
    }

    @Override // p080D0.InterfaceC1812k
    /* JADX INFO: renamed from: o */
    public void mo462o() {
        C1840y c1840y = ((C1821o0) ((InterfaceC1815l0) this.f3973p0)).f5249h;
        if (c1840y != null) {
            c1840y.invoke();
        }
    }

    @Override // p080D0.InterfaceC1812k
    /* JADX INFO: renamed from: p */
    public boolean mo463p(long j10, C1826r c1826r) {
        InterfaceC21098s interfaceC21098s = (InterfaceC21098s) ((C1494g) this.f3972o0).invoke();
        if (interfaceC21098s == null || !interfaceC21098s.mo21522h()) {
            return false;
        }
        C1821o0 c1821o0 = (C1821o0) ((InterfaceC1815l0) this.f3973p0);
        C0485p c0485p = c1821o0.f5247f;
        if (c0485p != null) {
            c0485p.mo985d(Boolean.FALSE, interfaceC21098s, new C13800b(j10), c1826r);
        }
        this.f3970Y = j10;
        return AbstractC1823p0.m2652a(c1821o0, this.f3971Z);
    }

    public C1497j(String str, byte[] bArr, long j10, long j11) {
        this.f3972o0 = str;
        this.f3973p0 = bArr;
        this.f3970Y = j10;
        this.f3971Z = j11;
    }
}
