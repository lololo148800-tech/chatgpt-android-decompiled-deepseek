package p292Lg;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC21955Q1;

/* JADX INFO: renamed from: Lg.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C5041m implements InterfaceC5042n {

    /* JADX INFO: renamed from: a */
    public final AbstractC21955Q1 f16489a;

    public C5041m(AbstractC21955Q1 result) {
        AbstractC16544l.m18094g(result, "result");
        this.f16489a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5041m) && AbstractC16544l.m18089b(this.f16489a, ((C5041m) obj).f16489a);
    }

    public final int hashCode() {
        return this.f16489a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
