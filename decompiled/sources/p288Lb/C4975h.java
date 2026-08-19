package p288Lb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p001A.AbstractC0010F;
import p214Ib.C3671n;
import p214Ib.C3675r;
import p214Ib.C3676s;
import p214Ib.C3678u;
import p228J.AbstractC3794B0;
import p265Kb.C4619l;
import p379Pb.C6381b;
import p379Pb.C6383d;

/* JADX INFO: renamed from: Lb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4975h extends C6381b {

    /* JADX INFO: renamed from: F0 */
    public static final C4974g f16210F0 = new C4974g();

    /* JADX INFO: renamed from: G0 */
    public static final Object f16211G0 = new Object();

    /* JADX INFO: renamed from: B0 */
    public Object[] f16212B0;

    /* JADX INFO: renamed from: C0 */
    public int f16213C0;

    /* JADX INFO: renamed from: D0 */
    public String[] f16214D0;

    /* JADX INFO: renamed from: E0 */
    public int[] f16215E0;

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: D */
    public final void mo5613D() {
        int iM24h = AbstractC0010F.m24h(mo5616N0());
        if (iM24h == 1) {
            mo5614E();
            return;
        }
        if (iM24h != 9) {
            if (iM24h == 3) {
                mo5618P();
                return;
            }
            if (iM24h == 4) {
                m5628e1(true);
                return;
            }
            m5631g1();
            int i10 = this.f16213C0;
            if (i10 > 0) {
                int[] iArr = this.f16215E0;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
        }
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: E */
    public final void mo5614E() {
        m5623b1(2);
        m5631g1();
        m5631g1();
        int i10 = this.f16213C0;
        if (i10 > 0) {
            int[] iArr = this.f16215E0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: E0 */
    public final long mo5615E0() {
        int iMo5616N0 = mo5616N0();
        if (iMo5616N0 != 7 && iMo5616N0 != 6) {
            throw new IllegalStateException("Expected " + AbstractC3794B0.m4474I(7) + " but was " + AbstractC3794B0.m4474I(iMo5616N0) + m5625d1());
        }
        long jMo4382p = ((C3678u) m5629f1()).mo4382p();
        m5631g1();
        int i10 = this.f16213C0;
        if (i10 > 0) {
            int[] iArr = this.f16215E0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jMo4382p;
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: N0 */
    public final int mo5616N0() {
        if (this.f16213C0 == 0) {
            return 10;
        }
        Object objM5629f1 = m5629f1();
        if (objM5629f1 instanceof Iterator) {
            boolean z6 = this.f16212B0[this.f16213C0 - 2] instanceof C3676s;
            Iterator it = (Iterator) objM5629f1;
            if (!it.hasNext()) {
                return z6 ? 4 : 2;
            }
            if (z6) {
                return 5;
            }
            m5632h1(it.next());
            return mo5616N0();
        }
        if (objM5629f1 instanceof C3676s) {
            return 3;
        }
        if (objM5629f1 instanceof C3671n) {
            return 1;
        }
        if (objM5629f1 instanceof C3678u) {
            Serializable serializable = ((C3678u) objM5629f1).f11175Y;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objM5629f1 instanceof C3675r) {
            return 9;
        }
        if (objM5629f1 == f16211G0) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new C6383d("Custom JsonElement subclass " + objM5629f1.getClass().getName() + " is not supported");
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: O */
    public final double mo5617O() throws C6383d {
        int iMo5616N0 = mo5616N0();
        if (iMo5616N0 != 7 && iMo5616N0 != 6) {
            throw new IllegalStateException("Expected " + AbstractC3794B0.m4474I(7) + " but was " + AbstractC3794B0.m4474I(iMo5616N0) + m5625d1());
        }
        C3678u c3678u = (C3678u) m5629f1();
        double dDoubleValue = c3678u.f11175Y instanceof Number ? c3678u.mo4383q().doubleValue() : Double.parseDouble(c3678u.mo4384r());
        if (!this.f20777Z && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new C6383d("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        m5631g1();
        int i10 = this.f16213C0;
        if (i10 > 0) {
            int[] iArr = this.f16215E0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dDoubleValue;
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: P */
    public final void mo5618P() {
        m5623b1(4);
        this.f16214D0[this.f16213C0 - 1] = null;
        m5631g1();
        m5631g1();
        int i10 = this.f16213C0;
        if (i10 > 0) {
            int[] iArr = this.f16215E0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: S0 */
    public final boolean mo5619S0() {
        m5623b1(8);
        boolean zMo4380f = ((C3678u) m5631g1()).mo4380f();
        int i10 = this.f16213C0;
        if (i10 > 0) {
            int[] iArr = this.f16215E0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zMo4380f;
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: T */
    public final String mo5620T() {
        return m5624c1(false);
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: a */
    public final void mo5621a() {
        m5623b1(1);
        m5632h1(((C3671n) m5629f1()).f11172Y.iterator());
        this.f16215E0[this.f16213C0 - 1] = 0;
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: a0 */
    public final String mo5622a0() {
        return m5628e1(false);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m5623b1(int i10) {
        if (mo5616N0() == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + AbstractC3794B0.m4474I(i10) + " but was " + AbstractC3794B0.m4474I(mo5616N0()) + m5625d1());
    }

    /* JADX INFO: renamed from: c1 */
    public final String m5624c1(boolean z6) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f16213C0;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f16212B0;
            Object obj = objArr[i10];
            if (obj instanceof C3671n) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f16215E0[i10];
                    if (z6 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof C3676s) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f16214D0[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    @Override // p379Pb.C6381b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16212B0 = new Object[]{f16211G0};
        this.f16213C0 = 1;
    }

    /* JADX INFO: renamed from: d1 */
    public final String m5625d1() {
        return " at path " + m5624c1(false);
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: e */
    public final void mo5626e() {
        m5623b1(3);
        m5632h1(((C4619l) ((C3676s) m5629f1()).f11174Y.entrySet()).iterator());
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: e0 */
    public final void mo5627e0() {
        m5623b1(9);
        m5631g1();
        int i10 = this.f16213C0;
        if (i10 > 0) {
            int[] iArr = this.f16215E0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final String m5628e1(boolean z6) {
        m5623b1(5);
        Map.Entry entry = (Map.Entry) ((Iterator) m5629f1()).next();
        String str = (String) entry.getKey();
        this.f16214D0[this.f16213C0 - 1] = z6 ? "<skipped>" : str;
        m5632h1(entry.getValue());
        return str;
    }

    /* JADX INFO: renamed from: f1 */
    public final Object m5629f1() {
        return this.f16212B0[this.f16213C0 - 1];
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: g0 */
    public final int mo5630g0() {
        int iMo5616N0 = mo5616N0();
        if (iMo5616N0 != 7 && iMo5616N0 != 6) {
            throw new IllegalStateException("Expected " + AbstractC3794B0.m4474I(7) + " but was " + AbstractC3794B0.m4474I(iMo5616N0) + m5625d1());
        }
        int iMo4381i = ((C3678u) m5629f1()).mo4381i();
        m5631g1();
        int i10 = this.f16213C0;
        if (i10 > 0) {
            int[] iArr = this.f16215E0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iMo4381i;
    }

    /* JADX INFO: renamed from: g1 */
    public final Object m5631g1() {
        Object[] objArr = this.f16212B0;
        int i10 = this.f16213C0 - 1;
        this.f16213C0 = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m5632h1(Object obj) {
        int i10 = this.f16213C0;
        Object[] objArr = this.f16212B0;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f16212B0 = Arrays.copyOf(objArr, i11);
            this.f16215E0 = Arrays.copyOf(this.f16215E0, i11);
            this.f16214D0 = (String[]) Arrays.copyOf(this.f16214D0, i11);
        }
        Object[] objArr2 = this.f16212B0;
        int i12 = this.f16213C0;
        this.f16213C0 = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // p379Pb.C6381b
    public final boolean hasNext() {
        int iMo5616N0 = mo5616N0();
        return (iMo5616N0 == 4 || iMo5616N0 == 2 || iMo5616N0 == 10) ? false : true;
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: j0 */
    public final String mo5633j0() {
        return m5624c1(true);
    }

    @Override // p379Pb.C6381b
    public final String toString() {
        return C4975h.class.getSimpleName() + m5625d1();
    }

    @Override // p379Pb.C6381b
    /* JADX INFO: renamed from: x */
    public final String mo5634x() {
        int iMo5616N0 = mo5616N0();
        if (iMo5616N0 != 6 && iMo5616N0 != 7) {
            throw new IllegalStateException("Expected " + AbstractC3794B0.m4474I(6) + " but was " + AbstractC3794B0.m4474I(iMo5616N0) + m5625d1());
        }
        String strMo4384r = ((C3678u) m5631g1()).mo4384r();
        int i10 = this.f16213C0;
        if (i10 > 0) {
            int[] iArr = this.f16215E0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return strMo4384r;
    }
}
