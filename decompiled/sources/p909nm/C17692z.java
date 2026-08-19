package p909nm;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: nm.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C17692z {

    /* JADX INFO: renamed from: a */
    public final int f56483a;

    /* JADX INFO: renamed from: b */
    public final Object f56484b;

    public C17692z(int i10, Object obj) {
        this.f56483a = i10;
        this.f56484b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17692z)) {
            return false;
        }
        C17692z c17692z = (C17692z) obj;
        return this.f56483a == c17692z.f56483a && AbstractC16544l.m18089b(this.f56484b, c17692z.f56484b);
    }

    public final int hashCode() {
        int i10 = this.f56483a * 31;
        Object obj = this.f56484b;
        return i10 + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f56483a + ", value=" + this.f56484b + ')';
    }
}
