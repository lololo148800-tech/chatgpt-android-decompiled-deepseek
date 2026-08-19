package p723e9;

import java.util.HashMap;
import p522V8.EnumC7837d;
import p782h9.InterfaceC14430a;

/* JADX INFO: renamed from: e9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13343a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC14430a f42328a;

    /* JADX INFO: renamed from: b */
    public final HashMap f42329b;

    public C13343a(InterfaceC14430a interfaceC14430a, HashMap map) {
        this.f42328a = interfaceC14430a;
        this.f42329b = map;
    }

    /* JADX INFO: renamed from: a */
    public final long m14937a(EnumC7837d enumC7837d, long j10, int i10) {
        long time = j10 - this.f42328a.getTime();
        C13344b c13344b = (C13344b) this.f42329b.get(enumC7837d);
        long j11 = c13344b.f42330a;
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * ((long) i11)))), time), c13344b.f42331b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13343a)) {
            return false;
        }
        C13343a c13343a = (C13343a) obj;
        return this.f42328a.equals(c13343a.f42328a) && this.f42329b.equals(c13343a.f42329b);
    }

    public final int hashCode() {
        return ((this.f42328a.hashCode() ^ 1000003) * 1000003) ^ this.f42329b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f42328a + ", values=" + this.f42329b + "}";
    }
}
