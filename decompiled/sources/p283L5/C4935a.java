package p283L5;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: L5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4935a {

    /* JADX INFO: renamed from: a */
    public final C4955u f16106a;

    public C4935a(C4955u c4955u) {
        this.f16106a = c4955u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4935a) {
            C4935a c4935a = (C4935a) obj;
            c4935a.getClass();
            if (AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(this.f16106a, c4935a.f16106a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C4955u c4955u = this.f16106a;
        if (c4955u != null) {
            return c4955u.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.f16106a + ')';
    }
}
