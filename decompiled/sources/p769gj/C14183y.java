package p769gj;

import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: gj.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C14183y {

    /* JADX INFO: renamed from: a */
    public final Map f44578a;

    public C14183y(Map map) {
        AbstractC16544l.m18094g(map, "map");
        this.f44578a = map;
    }

    /* JADX INFO: renamed from: a */
    public final Object m15505a(C14148B key) {
        AbstractC16544l.m18094g(key, "key");
        Object obj = this.f44578a.get(key);
        if (obj == null) {
            obj = null;
        }
        return obj == null ? new C14181w(new InterfaceC14147A[0]) : obj;
    }

    public final boolean equals(Object obj) {
        C14183y c14183y = obj instanceof C14183y ? (C14183y) obj : null;
        if (c14183y == null) {
            return false;
        }
        return AbstractC16544l.m18089b(c14183y.f44578a, this.f44578a);
    }

    public final int hashCode() {
        return this.f44578a.hashCode();
    }

    public final String toString() {
        return AbstractC12107L1.m13827r(new StringBuilder("ViewEnvironment("), this.f44578a, ')');
    }
}
