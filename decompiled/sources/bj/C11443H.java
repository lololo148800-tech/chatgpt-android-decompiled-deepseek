package bj;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: renamed from: bj.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C11443H implements Map.Entry {

    /* JADX INFO: renamed from: Y */
    public C11443H f34583Y;

    /* JADX INFO: renamed from: Z */
    public C11443H f34584Z;

    /* JADX INFO: renamed from: o0 */
    public C11443H f34585o0;

    /* JADX INFO: renamed from: p0 */
    public C11443H f34586p0;

    /* JADX INFO: renamed from: q0 */
    public C11443H f34587q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f34588r0;

    /* JADX INFO: renamed from: s0 */
    public final int f34589s0;

    /* JADX INFO: renamed from: t0 */
    public Object f34590t0;

    /* JADX INFO: renamed from: u0 */
    public int f34591u0;

    public C11443H() {
        this.f34588r0 = null;
        this.f34589s0 = -1;
        this.f34587q0 = this;
        this.f34586p0 = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f34588r0;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f34590t0;
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
        return this.f34588r0;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34590t0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f34588r0;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f34590t0;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f34590t0;
        this.f34590t0 = obj;
        return obj2;
    }

    public final String toString() {
        return this.f34588r0 + Separators.EQUALS + this.f34590t0;
    }

    public C11443H(C11443H c11443h, Object obj, int i10, C11443H c11443h2, C11443H c11443h3) {
        this.f34583Y = c11443h;
        this.f34588r0 = obj;
        this.f34589s0 = i10;
        this.f34591u0 = 1;
        this.f34586p0 = c11443h2;
        this.f34587q0 = c11443h3;
        c11443h3.f34586p0 = this;
        c11443h2.f34587q0 = this;
    }
}
