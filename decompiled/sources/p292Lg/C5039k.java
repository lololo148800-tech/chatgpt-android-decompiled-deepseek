package p292Lg;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC21955Q1;

/* JADX INFO: renamed from: Lg.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C5039k implements InterfaceC5042n {

    /* JADX INFO: renamed from: a */
    public final AbstractC21955Q1 f16487a;

    public C5039k(AbstractC21955Q1 result) {
        AbstractC16544l.m18094g(result, "result");
        this.f16487a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5039k) && AbstractC16544l.m18089b(this.f16487a, ((C5039k) obj).f16487a);
    }

    public final int hashCode() {
        return this.f16487a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
