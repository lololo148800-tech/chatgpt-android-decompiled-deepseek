package p571X9;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X9.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9293h {

    /* JADX INFO: renamed from: Y */
    public transient C9269d f28078Y;

    /* JADX INFO: renamed from: Z */
    public transient C9263c f28079Z;

    /* JADX INFO: renamed from: a */
    public final Map m9870a() {
        C9263c c9263c = this.f28079Z;
        if (c9263c != null) {
            return c9263c;
        }
        C9299i c9299i = (C9299i) this;
        C9263c c9263c2 = new C9263c(c9299i, c9299i.f28088o0);
        this.f28079Z = c9263c2;
        return c9263c2;
    }

    /* JADX INFO: renamed from: b */
    public final Set m9871b() {
        C9269d c9269d = this.f28078Y;
        if (c9269d != null) {
            return c9269d;
        }
        C9299i c9299i = (C9299i) this;
        C9269d c9269d2 = new C9269d(c9299i, c9299i.f28088o0);
        this.f28078Y = c9269d2;
        return c9269d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9293h) {
            return m9870a().equals(((AbstractC9293h) obj).m9870a());
        }
        return false;
    }

    public final int hashCode() {
        return ((C9263c) m9870a()).f28048o0.hashCode();
    }

    public final String toString() {
        return ((C9263c) m9870a()).f28048o0.toString();
    }
}
