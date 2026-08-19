package p292Lg;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC21955Q1;

/* JADX INFO: renamed from: Lg.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5038j implements InterfaceC5042n {

    /* JADX INFO: renamed from: a */
    public final AbstractC21955Q1 f16486a;

    public C5038j(AbstractC21955Q1 result) {
        AbstractC16544l.m18094g(result, "result");
        this.f16486a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5038j) && AbstractC16544l.m18089b(this.f16486a, ((C5038j) obj).f16486a);
    }

    public final int hashCode() {
        return this.f16486a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
