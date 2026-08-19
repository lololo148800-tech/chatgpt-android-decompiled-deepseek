package p145Ff;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: Ff.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C2730h implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final Map f8383a;

    public C2730h(Map urls) {
        AbstractC16544l.m18094g(urls, "urls");
        this.f8383a = urls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2730h) && AbstractC16544l.m18089b(this.f8383a, ((C2730h) obj).f8383a);
    }

    public final int hashCode() {
        return this.f8383a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
