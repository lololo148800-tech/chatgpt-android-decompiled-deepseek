package p315Me;

import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3812N;

/* JADX INFO: renamed from: Me.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5325e extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final Throwable f17515o0;

    public C5325e(Throwable th2) {
        super("error", 2);
        this.f17515o0 = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5325e) && AbstractC16544l.m18089b(this.f17515o0, ((C5325e) obj).f17515o0);
    }

    public final int hashCode() {
        Throwable th2 = this.f17515o0;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    @Override // p228J.AbstractC3812N
    public final String toString() {
        return "█";
    }
}
