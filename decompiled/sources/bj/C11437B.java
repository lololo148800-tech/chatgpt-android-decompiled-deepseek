package bj;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p026Ao.C0675i;
import p026Ao.InterfaceC0677k;
import p232J3.C4206F;

/* JADX INFO: renamed from: bj.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11437B extends AbstractC11477x {

    /* JADX INFO: renamed from: t0 */
    public static final Object f34554t0 = new Object();

    /* JADX INFO: renamed from: s0 */
    public Object[] f34555s0;

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: C0 */
    public final int mo12799C0(C11475v c11475v) {
        int i10 = this.f34697Y;
        Object obj = i10 != 0 ? this.f34555s0[i10 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f34554t0) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = c11475v.f34684a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (c11475v.f34684a[i11].equals(str)) {
                m12810W0();
                return i11;
            }
        }
        return -1;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: D */
    public final void mo12800D() {
        if (this.f34702r0) {
            throw new C11473t("Cannot skip unexpected " + mo12805S() + " at " + m12867E());
        }
        int i10 = this.f34697Y;
        if (i10 > 1) {
            this.f34699o0[i10 - 2] = "null";
        }
        Object obj = i10 != 0 ? this.f34555s0[i10 - 1] : null;
        if (obj instanceof C11436A) {
            throw new C11473t("Expected a value but was " + mo12805S() + " at path " + m12867E());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f34555s0;
            int i11 = i10 - 1;
            objArr[i11] = ((Map.Entry) objArr[i11]).getValue();
        } else {
            if (i10 > 0) {
                m12810W0();
                return;
            }
            throw new C11473t("Expected a value but was " + mo12805S() + " at path " + m12867E());
        }
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: E0 */
    public final long mo12801E0() {
        long jLongValueExact;
        EnumC11476w enumC11476w = EnumC11476w.f34692s0;
        Object objM12811X0 = m12811X0(Object.class, enumC11476w);
        if (objM12811X0 instanceof Number) {
            jLongValueExact = ((Number) objM12811X0).longValue();
        } else {
            if (!(objM12811X0 instanceof String)) {
                throw m12869N0(objM12811X0, enumC11476w);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objM12811X0);
                } catch (NumberFormatException unused) {
                    throw m12869N0(objM12811X0, enumC11476w);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objM12811X0).longValueExact();
            }
        }
        m12810W0();
        return jLongValueExact;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: H0 */
    public final void mo12802H0() {
        if (!this.f34702r0) {
            this.f34555s0[this.f34697Y - 1] = ((Map.Entry) m12811X0(Map.Entry.class, EnumC11476w.f34690q0)).getValue();
            this.f34699o0[this.f34697Y - 2] = "null";
        } else {
            EnumC11476w enumC11476wMo12805S = mo12805S();
            mo12813a0();
            throw new C11473t("Cannot skip unexpected " + enumC11476wMo12805S + " at " + m12867E());
        }
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: O */
    public final double mo12803O() throws C4206F {
        double dDoubleValue;
        EnumC11476w enumC11476w = EnumC11476w.f34692s0;
        Object objM12811X0 = m12811X0(Object.class, enumC11476w);
        if (objM12811X0 instanceof Number) {
            dDoubleValue = ((Number) objM12811X0).doubleValue();
        } else {
            if (!(objM12811X0 instanceof String)) {
                throw m12869N0(objM12811X0, enumC11476w);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objM12811X0);
            } catch (NumberFormatException unused) {
                throw m12869N0(objM12811X0, enumC11476w);
            }
        }
        if (this.f34701q0 || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            m12810W0();
            return dDoubleValue;
        }
        throw new C4206F("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + m12867E());
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: P */
    public final InterfaceC0677k mo12804P() throws IOException {
        Object objM12871r0 = m12871r0();
        C0675i c0675i = new C0675i();
        C11479z c11479z = new C11479z(c0675i);
        try {
            c11479z.m12836S(objM12871r0);
            c11479z.close();
            return c0675i;
        } catch (Throwable th2) {
            try {
                c11479z.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: S */
    public final EnumC11476w mo12805S() {
        int i10 = this.f34697Y;
        if (i10 == 0) {
            return EnumC11476w.f34695v0;
        }
        Object obj = this.f34555s0[i10 - 1];
        if (obj instanceof C11436A) {
            return ((C11436A) obj).f34551Y;
        }
        if (obj instanceof List) {
            return EnumC11476w.f34686Y;
        }
        if (obj instanceof Map) {
            return EnumC11476w.f34688o0;
        }
        if (obj instanceof Map.Entry) {
            return EnumC11476w.f34690q0;
        }
        if (obj instanceof String) {
            return EnumC11476w.f34691r0;
        }
        if (obj instanceof Boolean) {
            return EnumC11476w.f34693t0;
        }
        if (obj instanceof Number) {
            return EnumC11476w.f34692s0;
        }
        if (obj == null) {
            return EnumC11476w.f34694u0;
        }
        if (obj == f34554t0) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m12869N0(obj, "a JSON value");
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: S0 */
    public final boolean mo12806S0() {
        Boolean bool = (Boolean) m12811X0(Boolean.class, EnumC11476w.f34693t0);
        m12810W0();
        return bool.booleanValue();
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: T */
    public final AbstractC11477x mo12807T() {
        C11437B c11437b = new C11437B(this);
        c11437b.f34555s0 = (Object[]) this.f34555s0.clone();
        for (int i10 = 0; i10 < c11437b.f34697Y; i10++) {
            Object[] objArr = c11437b.f34555s0;
            Object obj = objArr[i10];
            if (obj instanceof C11436A) {
                C11436A c11436a = (C11436A) obj;
                objArr[i10] = new C11436A(c11436a.f34551Y, c11436a.f34552Z, c11436a.f34553o0);
            }
        }
        return c11437b;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m12808V0(Object obj) {
        int i10 = this.f34697Y;
        if (i10 == this.f34555s0.length) {
            if (i10 == 256) {
                throw new C11473t("Nesting too deep at " + m12867E());
            }
            int[] iArr = this.f34698Z;
            this.f34698Z = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f34699o0;
            this.f34699o0 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f34700p0;
            this.f34700p0 = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f34555s0;
            this.f34555s0 = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f34555s0;
        int i11 = this.f34697Y;
        this.f34697Y = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: W */
    public final void mo12809W() {
        if (hasNext()) {
            m12808V0(mo12813a0());
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m12810W0() {
        int i10 = this.f34697Y;
        int i11 = i10 - 1;
        this.f34697Y = i11;
        Object[] objArr = this.f34555s0;
        objArr[i11] = null;
        this.f34698Z[i11] = 0;
        if (i11 > 0) {
            int[] iArr = this.f34700p0;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            Object obj = objArr[i10 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    m12808V0(it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final Object m12811X0(Class cls, EnumC11476w enumC11476w) {
        int i10 = this.f34697Y;
        Object obj = i10 != 0 ? this.f34555s0[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && enumC11476w == EnumC11476w.f34694u0) {
            return null;
        }
        if (obj == f34554t0) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m12869N0(obj, enumC11476w);
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: a */
    public final void mo12812a() {
        List list = (List) m12811X0(List.class, EnumC11476w.f34686Y);
        C11436A c11436a = new C11436A(EnumC11476w.f34687Z, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f34555s0;
        int i10 = this.f34697Y;
        objArr[i10 - 1] = c11436a;
        this.f34698Z[i10 - 1] = 1;
        this.f34700p0[i10 - 1] = 0;
        if (c11436a.hasNext()) {
            m12808V0(c11436a.next());
        }
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: a0 */
    public final String mo12813a0() {
        EnumC11476w enumC11476w = EnumC11476w.f34690q0;
        Map.Entry entry = (Map.Entry) m12811X0(Map.Entry.class, enumC11476w);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw m12869N0(key, enumC11476w);
        }
        String str = (String) key;
        this.f34555s0[this.f34697Y - 1] = entry.getValue();
        this.f34699o0[this.f34697Y - 2] = str;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Arrays.fill(this.f34555s0, 0, this.f34697Y, (Object) null);
        this.f34555s0[0] = f34554t0;
        this.f34698Z[0] = 8;
        this.f34697Y = 1;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: e */
    public final void mo12814e() {
        Map map = (Map) m12811X0(Map.class, EnumC11476w.f34688o0);
        C11436A c11436a = new C11436A(EnumC11476w.f34689p0, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f34555s0;
        int i10 = this.f34697Y;
        objArr[i10 - 1] = c11436a;
        this.f34698Z[i10 - 1] = 3;
        if (c11436a.hasNext()) {
            m12808V0(c11436a.next());
        }
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: e0 */
    public final void mo12815e0() {
        m12811X0(Void.class, EnumC11476w.f34694u0);
        m12810W0();
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: g0 */
    public final int mo12816g0() {
        int iIntValueExact;
        EnumC11476w enumC11476w = EnumC11476w.f34692s0;
        Object objM12811X0 = m12811X0(Object.class, enumC11476w);
        if (objM12811X0 instanceof Number) {
            iIntValueExact = ((Number) objM12811X0).intValue();
        } else {
            if (!(objM12811X0 instanceof String)) {
                throw m12869N0(objM12811X0, enumC11476w);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objM12811X0);
                } catch (NumberFormatException unused) {
                    throw m12869N0(objM12811X0, enumC11476w);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objM12811X0).intValueExact();
            }
        }
        m12810W0();
        return iIntValueExact;
    }

    @Override // bj.AbstractC11477x
    public final boolean hasNext() {
        int i10 = this.f34697Y;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f34555s0[i10 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: k */
    public final void mo12817k() {
        EnumC11476w enumC11476w = EnumC11476w.f34687Z;
        C11436A c11436a = (C11436A) m12811X0(C11436A.class, enumC11476w);
        if (c11436a.f34551Y != enumC11476w || c11436a.hasNext()) {
            throw m12869N0(c11436a, enumC11476w);
        }
        m12810W0();
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: m */
    public final void mo12818m() {
        EnumC11476w enumC11476w = EnumC11476w.f34689p0;
        C11436A c11436a = (C11436A) m12811X0(C11436A.class, enumC11476w);
        if (c11436a.f34551Y != enumC11476w || c11436a.hasNext()) {
            throw m12869N0(c11436a, enumC11476w);
        }
        this.f34699o0[this.f34697Y - 1] = null;
        m12810W0();
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: v0 */
    public final int mo12819v0(C11475v c11475v) {
        EnumC11476w enumC11476w = EnumC11476w.f34690q0;
        Map.Entry entry = (Map.Entry) m12811X0(Map.Entry.class, enumC11476w);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw m12869N0(key, enumC11476w);
        }
        String str = (String) key;
        int length = c11475v.f34684a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c11475v.f34684a[i10].equals(str)) {
                this.f34555s0[this.f34697Y - 1] = entry.getValue();
                this.f34699o0[this.f34697Y - 2] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // bj.AbstractC11477x
    /* JADX INFO: renamed from: x */
    public final String mo12820x() {
        int i10 = this.f34697Y;
        Object obj = i10 != 0 ? this.f34555s0[i10 - 1] : null;
        if (obj instanceof String) {
            m12810W0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            m12810W0();
            return obj.toString();
        }
        if (obj == f34554t0) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m12869N0(obj, EnumC11476w.f34691r0);
    }
}
