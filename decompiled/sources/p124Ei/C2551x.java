package p124Ei;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1135yn.C21555b;
import p502Uc.AbstractC7625i;

/* JADX INFO: renamed from: Ei.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C2551x {

    /* JADX INFO: renamed from: a */
    public final List f7965a;

    /* JADX INFO: renamed from: b */
    public final long f7966b;

    /* JADX INFO: renamed from: c */
    public final long f7967c;

    public C2551x(List list) {
        this(list, AbstractC7625i.f24108a, AbstractC7625i.f24109b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2551x)) {
            return false;
        }
        C2551x c2551x = (C2551x) obj;
        return AbstractC16544l.m18089b(this.f7965a, c2551x.f7965a) && C21555b.m21834d(this.f7966b, c2551x.f7966b) && C21555b.m21834d(this.f7967c, c2551x.f7967c);
    }

    public final int hashCode() {
        return C21555b.m21837g(this.f7967c) + ((C21555b.m21837g(this.f7966b) + (this.f7965a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C2551x(List list, long j10, long j11) {
        this.f7965a = list;
        this.f7966b = j10;
        this.f7967c = j11;
    }
}
