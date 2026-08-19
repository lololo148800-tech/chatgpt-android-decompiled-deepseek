package p594Y9;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Y9.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9890g {

    /* JADX INFO: renamed from: Y */
    public transient C9862c f29402Y;

    /* JADX INFO: renamed from: Z */
    public transient C9855b f29403Z;

    /* JADX INFO: renamed from: a */
    public final Map m10542a() {
        C9855b c9855b = this.f29403Z;
        if (c9855b != null) {
            return c9855b;
        }
        C9896h c9896h = (C9896h) this;
        C9855b c9855b2 = new C9855b(c9896h, c9896h.f29410o0);
        this.f29403Z = c9855b2;
        return c9855b2;
    }

    /* JADX INFO: renamed from: b */
    public final Set m10543b() {
        C9862c c9862c = this.f29402Y;
        if (c9862c != null) {
            return c9862c;
        }
        C9896h c9896h = (C9896h) this;
        C9862c c9862c2 = new C9862c(c9896h, c9896h.f29410o0);
        this.f29402Y = c9862c2;
        return c9862c2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9890g) {
            return m10542a().equals(((AbstractC9890g) obj).m10542a());
        }
        return false;
    }

    public final int hashCode() {
        return ((C9855b) m10542a()).f29365o0.hashCode();
    }

    public final String toString() {
        return ((C9855b) m10542a()).f29365o0.toString();
    }
}
