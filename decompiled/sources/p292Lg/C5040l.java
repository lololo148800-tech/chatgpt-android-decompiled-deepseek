package p292Lg;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC21955Q1;

/* JADX INFO: renamed from: Lg.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C5040l implements InterfaceC5042n {

    /* JADX INFO: renamed from: a */
    public final AbstractC21955Q1 f16488a;

    public C5040l(AbstractC21955Q1 result) {
        AbstractC16544l.m18094g(result, "result");
        this.f16488a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5040l) && AbstractC16544l.m18089b(this.f16488a, ((C5040l) obj).f16488a);
    }

    public final int hashCode() {
        return this.f16488a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
