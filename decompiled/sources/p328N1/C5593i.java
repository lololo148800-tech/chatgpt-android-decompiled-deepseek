package p328N1;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: N1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5593i {

    /* JADX INFO: renamed from: a */
    public final Object f18124a;

    public /* synthetic */ C5593i(Object obj) {
        this.f18124a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5593i) {
            return AbstractC16544l.m18089b(this.f18124a, ((C5593i) obj).f18124a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f18124a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f18124a + ')';
    }
}
