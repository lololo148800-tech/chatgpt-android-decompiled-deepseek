package p077Cn;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Cn.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C1748p extends C1749q {

    /* JADX INFO: renamed from: a */
    public final Throwable f5019a;

    public C1748p(Throwable th2) {
        this.f5019a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1748p) {
            if (AbstractC16544l.m18089b(this.f5019a, ((C1748p) obj).f5019a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f5019a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // p077Cn.C1749q
    public final String toString() {
        return "Closed(" + this.f5019a + ')';
    }
}
