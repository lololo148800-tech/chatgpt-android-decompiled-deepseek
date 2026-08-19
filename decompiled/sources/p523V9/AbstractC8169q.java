package p523V9;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: V9.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8169q {

    /* JADX INFO: renamed from: Y */
    public transient C8129l f25594Y;

    /* JADX INFO: renamed from: Z */
    public transient C8121k f25595Z;

    /* JADX INFO: renamed from: a */
    public final Map m8751a() {
        C8121k c8121k = this.f25595Z;
        if (c8121k != null) {
            return c8121k;
        }
        C8177r c8177r = (C8177r) this;
        C8121k c8121k2 = new C8121k(c8177r, c8177r.f25620o0, 0);
        this.f25595Z = c8121k2;
        return c8121k2;
    }

    /* JADX INFO: renamed from: b */
    public final Set m8752b() {
        C8129l c8129l = this.f25594Y;
        if (c8129l != null) {
            return c8129l;
        }
        C8177r c8177r = (C8177r) this;
        C8129l c8129l2 = new C8129l(c8177r, c8177r.f25620o0);
        this.f25594Y = c8129l2;
        return c8129l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8169q) {
            return m8751a().equals(((AbstractC8169q) obj).m8751a());
        }
        return false;
    }

    public final int hashCode() {
        return ((C8225x) ((C8121k) m8751a()).f25458p0).hashCode();
    }

    public final String toString() {
        return ((C8225x) ((C8121k) m8751a()).f25458p0).toString();
    }
}
