package p283L5;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: L5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4936b {

    /* JADX INFO: renamed from: a */
    public final C4955u f16107a;

    public C4936b(C4955u c4955u) {
        this.f16107a = c4955u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4936b) {
            if (AbstractC16544l.m18089b(this.f16107a, ((C4936b) obj).f16107a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C4955u c4955u = this.f16107a;
        if (c4955u != null) {
            return c4955u.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.f16107a + ')';
    }
}
