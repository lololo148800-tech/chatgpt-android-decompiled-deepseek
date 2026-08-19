package bb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p499U9.AbstractC7589s;
import p523V9.C8217w;
import p817j$.util.Objects;

/* JADX INFO: renamed from: bb.q */
/* JADX INFO: loaded from: classes.dex */
public final class C11324q extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: v0 */
    public static final Object f34244v0 = new Object();

    /* JADX INFO: renamed from: Y */
    public transient Object f34245Y;

    /* JADX INFO: renamed from: Z */
    public transient int[] f34246Z;

    /* JADX INFO: renamed from: o0 */
    public transient Object[] f34247o0;

    /* JADX INFO: renamed from: p0 */
    public transient Object[] f34248p0;

    /* JADX INFO: renamed from: q0 */
    public transient int f34249q0;

    /* JADX INFO: renamed from: r0 */
    public transient int f34250r0;

    /* JADX INFO: renamed from: s0 */
    public transient C11322o f34251s0;

    /* JADX INFO: renamed from: t0 */
    public transient C11322o f34252t0;

    /* JADX INFO: renamed from: u0 */
    public transient C8217w f34253u0;

    /* JADX INFO: renamed from: a */
    public static C11324q m12743a() {
        C11324q c11324q = new C11324q();
        c11324q.f34249q0 = Math.min(Math.max(8, 1), 1073741823);
        return c11324q;
    }

    /* JADX INFO: renamed from: b */
    public final Map m12744b() {
        Object obj = this.f34245Y;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m12745c() {
        return (1 << (this.f34249q0 & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m12748f()) {
            return;
        }
        this.f34249q0 += 32;
        Map mapM12744b = m12744b();
        if (mapM12744b != null) {
            this.f34249q0 = Math.min(Math.max(size(), 3), 1073741823);
            mapM12744b.clear();
            this.f34245Y = null;
            this.f34250r0 = 0;
            return;
        }
        Arrays.fill(m12751j(), 0, this.f34250r0, (Object) null);
        Arrays.fill(m12752k(), 0, this.f34250r0, (Object) null);
        Object obj = this.f34245Y;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m12750h(), 0, this.f34250r0, 0);
        this.f34250r0 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM12744b = m12744b();
        if (mapM12744b != null) {
            return mapM12744b.containsKey(obj);
        }
        return m12746d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM12744b = m12744b();
        if (mapM12744b != null) {
            return mapM12744b.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f34250r0; i10++) {
            if (AbstractC7589s.m7931f(obj, m12752k()[i10])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m12746d(Object obj) {
        if (m12748f()) {
            return -1;
        }
        int iM12737q = AbstractC11320m.m12737q(obj);
        int iM12745c = m12745c();
        Object obj2 = this.f34245Y;
        Objects.requireNonNull(obj2);
        int iM12738r = AbstractC11320m.m12738r(iM12737q & iM12745c, obj2);
        if (iM12738r == 0) {
            return -1;
        }
        int i10 = ~iM12745c;
        int i11 = iM12737q & i10;
        do {
            int i12 = iM12738r - 1;
            int i13 = m12750h()[i12];
            if ((i13 & i10) == i11 && AbstractC7589s.m7931f(obj, m12751j()[i12])) {
                return i12;
            }
            iM12738r = i13 & iM12745c;
        } while (iM12738r != 0);
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m12747e(int i10, int i11) {
        Object obj = this.f34245Y;
        Objects.requireNonNull(obj);
        int[] iArrM12750h = m12750h();
        Object[] objArrM12751j = m12751j();
        Object[] objArrM12752k = m12752k();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrM12751j[i10] = null;
            objArrM12752k[i10] = null;
            iArrM12750h[i10] = 0;
            return;
        }
        Object obj2 = objArrM12751j[i12];
        objArrM12751j[i10] = obj2;
        objArrM12752k[i10] = objArrM12752k[i12];
        objArrM12751j[i12] = null;
        objArrM12752k[i12] = null;
        iArrM12750h[i10] = iArrM12750h[i12];
        iArrM12750h[i12] = 0;
        int iM12737q = AbstractC11320m.m12737q(obj2) & i11;
        int iM12738r = AbstractC11320m.m12738r(iM12737q, obj);
        if (iM12738r == size) {
            AbstractC11320m.m12739s(iM12737q, obj, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iM12738r - 1;
            int i14 = iArrM12750h[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrM12750h[i13] = AbstractC11320m.m12732l(i14, i10 + 1, i11);
                return;
            }
            iM12738r = i15;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C11322o c11322o = this.f34252t0;
        if (c11322o != null) {
            return c11322o;
        }
        C11322o c11322o2 = new C11322o(this, 0);
        this.f34252t0 = c11322o2;
        return c11322o2;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12748f() {
        return this.f34245Y == null;
    }

    /* JADX INFO: renamed from: g */
    public final Object m12749g(Object obj) {
        boolean zM12748f = m12748f();
        Object obj2 = f34244v0;
        if (zM12748f) {
            return obj2;
        }
        int iM12745c = m12745c();
        Object obj3 = this.f34245Y;
        Objects.requireNonNull(obj3);
        int iM12734n = AbstractC11320m.m12734n(obj, null, iM12745c, obj3, m12750h(), m12751j(), null);
        if (iM12734n == -1) {
            return obj2;
        }
        Object obj4 = m12752k()[iM12734n];
        m12747e(iM12734n, iM12745c);
        this.f34250r0--;
        this.f34249q0 += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM12744b = m12744b();
        if (mapM12744b != null) {
            return mapM12744b.get(obj);
        }
        int iM12746d = m12746d(obj);
        if (iM12746d == -1) {
            return null;
        }
        return m12752k()[iM12746d];
    }

    /* JADX INFO: renamed from: h */
    public final int[] m12750h() {
        int[] iArr = this.f34246Z;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object[] m12751j() {
        Object[] objArr = this.f34247o0;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: k */
    public final Object[] m12752k() {
        Object[] objArr = this.f34248p0;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C11322o c11322o = this.f34251s0;
        if (c11322o != null) {
            return c11322o;
        }
        C11322o c11322o2 = new C11322o(this, 1);
        this.f34251s0 = c11322o2;
        return c11322o2;
    }

    /* JADX INFO: renamed from: l */
    public final int m12753l(int i10, int i11, int i12, int i13) {
        Object objM12725e = AbstractC11320m.m12725e(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            AbstractC11320m.m12739s(i12 & i14, objM12725e, i13 + 1);
        }
        Object obj = this.f34245Y;
        Objects.requireNonNull(obj);
        int[] iArrM12750h = m12750h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iM12738r = AbstractC11320m.m12738r(i15, obj);
            while (iM12738r != 0) {
                int i16 = iM12738r - 1;
                int i17 = iArrM12750h[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iM12738r2 = AbstractC11320m.m12738r(i19, objM12725e);
                AbstractC11320m.m12739s(i19, objM12725e, iM12738r);
                iArrM12750h[i16] = AbstractC11320m.m12732l(i18, iM12738r2, i14);
                iM12738r = i17 & i10;
            }
        }
        this.f34245Y = objM12725e;
        this.f34249q0 = AbstractC11320m.m12732l(this.f34249q0, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x0104 A[LOOP:1: B:42:0x00ed->B:45:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8 A[EDGE_INSN: B:66:0x00e8->B:40:0x00e8 BREAK  A[LOOP:1: B:42:0x00ed->B:45:0x0104], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0102 -> B:40:0x00e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.C11324q.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM12744b = m12744b();
        if (mapM12744b != null) {
            return mapM12744b.remove(obj);
        }
        Object objM12749g = m12749g(obj);
        if (objM12749g == f34244v0) {
            return null;
        }
        return objM12749g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM12744b = m12744b();
        return mapM12744b != null ? mapM12744b.size() : this.f34250r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C8217w c8217w = this.f34253u0;
        if (c8217w != null) {
            return c8217w;
        }
        C8217w c8217w2 = new C8217w((Serializable) this, 7);
        this.f34253u0 = c8217w2;
        return c8217w2;
    }
}
