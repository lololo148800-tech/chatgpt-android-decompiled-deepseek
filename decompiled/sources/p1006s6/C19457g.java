package p1006s6;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p009A7.FlM.nkFZpTrMPpn;
import p060C6.C1609f;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: s6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C19457g implements InterfaceC19455e {

    /* JADX INFO: renamed from: Y */
    public final Map f61747Y;

    /* JADX INFO: renamed from: Z */
    public final List f61748Z;

    /* JADX INFO: renamed from: o0 */
    public EnumC19454d f61749o0;

    /* JADX INFO: renamed from: p0 */
    public Object f61750p0;

    /* JADX INFO: renamed from: q0 */
    public Object[] f61751q0;

    /* JADX INFO: renamed from: r0 */
    public Map[] f61752r0;

    /* JADX INFO: renamed from: s0 */
    public Iterator[] f61753s0;

    /* JADX INFO: renamed from: t0 */
    public int[] f61754t0;

    /* JADX INFO: renamed from: u0 */
    public int f61755u0;

    public C19457g(List pathRoot, Map map) {
        AbstractC16544l.m18094g(pathRoot, "pathRoot");
        this.f61747Y = map;
        this.f61748Z = pathRoot;
        this.f61751q0 = new Object[64];
        this.f61752r0 = new Map[64];
        this.f61753s0 = new Iterator[64];
        this.f61754t0 = new int[64];
        this.f61749o0 = m20584e(map);
        this.f61750p0 = map;
    }

    /* JADX INFO: renamed from: e */
    public static EnumC19454d m20584e(Object obj) {
        if (obj == null) {
            return EnumC19454d.f61743v0;
        }
        if (obj instanceof List) {
            return EnumC19454d.f61734Y;
        }
        if (obj instanceof Map) {
            return EnumC19454d.f61736o0;
        }
        if (obj instanceof Integer) {
            return EnumC19454d.f61740s0;
        }
        if (obj instanceof Long) {
            return EnumC19454d.f61741t0;
        }
        if (obj instanceof Double) {
            return EnumC19454d.f61740s0;
        }
        if (obj instanceof C19453c) {
            return EnumC19454d.f61740s0;
        }
        if (obj instanceof String) {
            return EnumC19454d.f61739r0;
        }
        return obj instanceof Boolean ? EnumC19454d.f61742u0 : EnumC19454d.f61745x0;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: B0 */
    public final int mo20558B0(List names) {
        AbstractC16544l.m18094g(names, "names");
        while (hasNext()) {
            String strMo20570a0 = mo20570a0();
            int iIndexOf = this.f61754t0[this.f61755u0 - 1];
            if (iIndexOf >= names.size() || !AbstractC16544l.m18089b(names.get(iIndexOf), strMo20570a0)) {
                iIndexOf = names.indexOf(strMo20570a0);
                if (iIndexOf != -1) {
                    this.f61754t0[this.f61755u0 - 1] = iIndexOf + 1;
                }
            } else {
                int[] iArr = this.f61754t0;
                int i10 = this.f61755u0 - 1;
                iArr[i10] = iArr[i10] + 1;
            }
            if (iIndexOf != -1) {
                return iIndexOf;
            }
            m20585a();
        }
        return -1;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: D */
    public final void mo20559D() {
        m20585a();
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: D0 */
    public final void mo20560D0() {
        Map[] mapArr = this.f61752r0;
        int i10 = this.f61755u0;
        Map map = mapArr[i10 - 1];
        this.f61751q0[i10 - 1] = null;
        AbstractC16544l.m18091d(map);
        this.f61753s0[i10 - 1] = map.entrySet().iterator();
        this.f61754t0[this.f61755u0 - 1] = 0;
        m20585a();
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: E0 */
    public final long mo20562E0() {
        long jLongValue;
        int iOrdinal = this.f61749o0.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            throw new C1609f("Expected a Long but was " + this.f61749o0 + " at path " + m20586k());
        }
        Object obj = this.f61750p0;
        if (obj instanceof Integer) {
            jLongValue = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Number) obj).doubleValue();
            long j10 = (long) dDoubleValue;
            if (j10 != dDoubleValue) {
                throw new IllegalStateException((dDoubleValue + " cannot be converted to Long").toString());
            }
            jLongValue = j10;
        } else if (obj instanceof String) {
            jLongValue = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof C19453c)) {
                throw new IllegalStateException(("Expected Int but got " + obj + " instead").toString());
            }
            jLongValue = Long.parseLong(((C19453c) obj).f61733a);
        }
        m20585a();
        return jLongValue;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: O */
    public final double mo20563O() {
        double dDoubleValue;
        int iOrdinal = this.f61749o0.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            throw new C1609f("Expected a Double but was " + this.f61749o0 + " at path " + m20586k());
        }
        Object obj = this.f61750p0;
        if (obj instanceof Integer) {
            dDoubleValue = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            long jLongValue = ((Number) obj).longValue();
            double d10 = jLongValue;
            if (((long) d10) != jLongValue) {
                throw new IllegalStateException((jLongValue + " cannot be converted to Double").toString());
            }
            dDoubleValue = d10;
        } else if (obj instanceof Double) {
            dDoubleValue = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            dDoubleValue = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof C19453c)) {
                throw new IllegalStateException(("Expected a Double but got " + obj + " instead").toString());
            }
            dDoubleValue = Double.parseDouble(((C19453c) obj).f61733a);
        }
        m20585a();
        return dDoubleValue;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: S0 */
    public final boolean mo20566S0() {
        if (this.f61749o0 == EnumC19454d.f61742u0) {
            Object obj = this.f61750p0;
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            m20585a();
            return ((Boolean) obj).booleanValue();
        }
        throw new C1609f("Expected BOOLEAN but was " + this.f61749o0 + " at path " + m20586k());
    }

    /* JADX INFO: renamed from: a */
    public final void m20585a() {
        int i10 = this.f61755u0;
        if (i10 == 0) {
            this.f61749o0 = EnumC19454d.f61744w0;
            return;
        }
        Iterator it = this.f61753s0[i10 - 1];
        AbstractC16544l.m18091d(it);
        Object[] objArr = this.f61751q0;
        int i11 = this.f61755u0 - 1;
        Object obj = objArr[i11];
        if (obj instanceof Integer) {
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Int");
            objArr[i11] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (!it.hasNext()) {
            this.f61749o0 = this.f61751q0[this.f61755u0 + (-1)] instanceof Integer ? EnumC19454d.f61735Z : EnumC19454d.f61737p0;
            return;
        }
        Object next = it.next();
        this.f61750p0 = next;
        this.f61749o0 = next instanceof Map.Entry ? EnumC19454d.f61738q0 : m20584e(next);
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: a0 */
    public final String mo20570a0() {
        if (this.f61749o0 != EnumC19454d.f61738q0) {
            throw new C1609f("Expected NAME but was " + this.f61749o0 + " at path " + m20586k());
        }
        Object obj = this.f61750p0;
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
        Map.Entry entry = (Map.Entry) obj;
        this.f61751q0[this.f61755u0 - 1] = entry.getKey();
        this.f61750p0 = entry.getValue();
        this.f61749o0 = m20584e(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: e0 */
    public final void mo20572e0() {
        if (this.f61749o0 == EnumC19454d.f61743v0) {
            m20585a();
            return;
        }
        throw new C1609f("Expected NULL but was " + this.f61749o0 + " at path " + m20586k());
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: g0 */
    public final int mo20573g0() {
        int iIntValue;
        int i10;
        int iOrdinal = this.f61749o0.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            throw new C1609f("Expected an Int but was " + this.f61749o0 + " at path " + m20586k());
        }
        Object obj = this.f61750p0;
        if (obj instanceof Integer) {
            iIntValue = ((Number) obj).intValue();
        } else {
            if (obj instanceof Long) {
                long jLongValue = ((Number) obj).longValue();
                i10 = (int) jLongValue;
                if (i10 != jLongValue) {
                    throw new IllegalStateException((jLongValue + " cannot be converted to Int").toString());
                }
            } else if (obj instanceof Double) {
                double dDoubleValue = ((Number) obj).doubleValue();
                i10 = (int) dDoubleValue;
                if (i10 != dDoubleValue) {
                    throw new IllegalStateException((dDoubleValue + " cannot be converted to Int").toString());
                }
            } else if (obj instanceof String) {
                iIntValue = Integer.parseInt((String) obj);
            } else {
                if (!(obj instanceof C19453c)) {
                    throw new IllegalStateException(("Expected an Int but got " + obj + " instead").toString());
                }
                iIntValue = Integer.parseInt(((C19453c) obj).f61733a);
            }
            iIntValue = i10;
        }
        m20585a();
        return iIntValue;
    }

    @Override // p1006s6.InterfaceC19455e
    public final boolean hasNext() {
        int iOrdinal = this.f61749o0.ordinal();
        return (iOrdinal == 1 || iOrdinal == 3) ? false : true;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: j */
    public final InterfaceC19455e mo20574j() {
        int i10 = this.f61755u0 - 1;
        this.f61755u0 = i10;
        this.f61753s0[i10] = null;
        this.f61751q0[i10] = null;
        this.f61752r0[i10] = null;
        m20585a();
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final String m20586k() {
        return AbstractC17680n.m19349Y(mo20578n(), Separators.DOT, null, null, 0, null, null, 62);
    }

    /* JADX INFO: renamed from: m */
    public final void m20587m() {
        int i10 = this.f61755u0;
        Object[] objArr = this.f61751q0;
        if (i10 == objArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(...)");
            this.f61751q0 = objArrCopyOf;
            Map[] mapArr = this.f61752r0;
            Object[] objArrCopyOf2 = Arrays.copyOf(mapArr, mapArr.length * 2);
            AbstractC16544l.m18093f(objArrCopyOf2, "copyOf(...)");
            this.f61752r0 = (Map[]) objArrCopyOf2;
            int[] iArr = this.f61754t0;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(...)");
            this.f61754t0 = iArrCopyOf;
            Iterator[] itArr = this.f61753s0;
            Object[] objArrCopyOf3 = Arrays.copyOf(itArr, itArr.length * 2);
            AbstractC16544l.m18093f(objArrCopyOf3, "copyOf(...)");
            this.f61753s0 = (Iterator[]) objArrCopyOf3;
        }
        this.f61755u0++;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: n */
    public final ArrayList mo20578n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f61748Z);
        int i10 = this.f61755u0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f61751q0[i11];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: p */
    public final InterfaceC19455e mo20580p() {
        if (this.f61749o0 != EnumC19454d.f61735Z) {
            throw new C1609f("Expected END_ARRAY but was " + this.f61749o0 + " at path " + m20586k());
        }
        int i10 = this.f61755u0 - 1;
        this.f61755u0 = i10;
        this.f61753s0[i10] = null;
        this.f61751q0[i10] = null;
        m20585a();
        return this;
    }

    @Override // p1006s6.InterfaceC19455e
    public final EnumC19454d peek() {
        return this.f61749o0;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: q */
    public final InterfaceC19455e mo20581q() {
        if (this.f61749o0 != EnumC19454d.f61734Y) {
            throw new C1609f("Expected BEGIN_ARRAY but was " + this.f61749o0 + " at path " + m20586k());
        }
        Object obj = this.f61750p0;
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        m20587m();
        this.f61751q0[this.f61755u0 - 1] = -1;
        this.f61753s0[this.f61755u0 - 1] = ((List) obj).iterator();
        m20585a();
        return this;
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: x */
    public final String mo20582x() {
        int iOrdinal = this.f61749o0.ordinal();
        if (iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7) {
            Object obj = this.f61750p0;
            AbstractC16544l.m18091d(obj);
            String string = obj.toString();
            m20585a();
            return string;
        }
        throw new C1609f("Expected a String but was " + this.f61749o0 + " at path " + m20586k());
    }

    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: y0 */
    public final C19453c mo20583y0() {
        C19453c c19453c;
        int iOrdinal = this.f61749o0.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            throw new C1609f("Expected a Number but was " + this.f61749o0 + " at path " + m20586k());
        }
        Object obj = this.f61750p0;
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double)) {
            c19453c = new C19453c(obj.toString());
        } else if (obj instanceof String) {
            c19453c = new C19453c((String) obj);
        } else {
            if (!(obj instanceof C19453c)) {
                throw new IllegalStateException(("Expected JsonNumber but got " + obj + " instead").toString());
            }
            c19453c = (C19453c) obj;
        }
        m20585a();
        return c19453c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1006s6.InterfaceC19455e
    /* JADX INFO: renamed from: o */
    public final InterfaceC19455e mo20579o() {
        if (this.f61749o0 != EnumC19454d.f61736o0) {
            throw new C1609f("Expected BEGIN_OBJECT but was " + this.f61749o0 + " at path " + m20586k());
        }
        m20587m();
        Map[] mapArr = this.f61752r0;
        int i10 = this.f61755u0 - 1;
        Object obj = this.f61750p0;
        AbstractC16544l.m18092e(obj, nkFZpTrMPpn.fIHMYRGNt);
        mapArr[i10] = obj;
        mo20560D0();
        return this;
    }

    public /* synthetic */ C19457g(Map map) {
        this(C17689w.f56480Y, map);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
