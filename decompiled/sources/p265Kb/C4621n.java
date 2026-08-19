package p265Kb;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: renamed from: Kb.n */
/* JADX INFO: loaded from: classes.dex */
public final class C4621n implements Map.Entry {

    /* JADX INFO: renamed from: Y */
    public C4621n f15055Y;

    /* JADX INFO: renamed from: Z */
    public C4621n f15056Z;

    /* JADX INFO: renamed from: o0 */
    public C4621n f15057o0;

    /* JADX INFO: renamed from: p0 */
    public C4621n f15058p0;

    /* JADX INFO: renamed from: q0 */
    public C4621n f15059q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f15060r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f15061s0;

    /* JADX INFO: renamed from: t0 */
    public Object f15062t0;

    /* JADX INFO: renamed from: u0 */
    public int f15063u0;

    public C4621n(boolean z6) {
        this.f15060r0 = null;
        this.f15061s0 = z6;
        this.f15059q0 = this;
        this.f15058p0 = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f15060r0;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f15062t0;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15060r0;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15062t0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f15060r0;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f15062t0;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f15061s0) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f15062t0;
        this.f15062t0 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f15060r0 + Separators.EQUALS + this.f15062t0;
    }

    public C4621n(boolean z6, C4621n c4621n, Object obj, C4621n c4621n2, C4621n c4621n3) {
        this.f15055Y = c4621n;
        this.f15060r0 = obj;
        this.f15061s0 = z6;
        this.f15063u0 = 1;
        this.f15058p0 = c4621n2;
        this.f15059q0 = c4621n3;
        c4621n3.f15058p0 = this;
        c4621n2.f15059q0 = this;
    }
}
