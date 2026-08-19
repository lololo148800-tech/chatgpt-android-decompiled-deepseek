package p291Lf;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Lf.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C5020q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1426a f16383a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f16384b;

    public C5020q(InterfaceC1426a onClick, InterfaceC1436k onLongClick) {
        AbstractC16544l.m18094g(onClick, "onClick");
        AbstractC16544l.m18094g(onLongClick, "onLongClick");
        this.f16383a = onClick;
        this.f16384b = onLongClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5020q)) {
            return false;
        }
        C5020q c5020q = (C5020q) obj;
        return AbstractC16544l.m18089b(this.f16383a, c5020q.f16383a) && AbstractC16544l.m18089b(this.f16384b, c5020q.f16384b);
    }

    public final int hashCode() {
        return this.f16384b.hashCode() + (this.f16383a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
