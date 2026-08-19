package p629Zl;

import java.util.HashMap;
import p167Gb.C3032c;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Zl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10421b {

    /* JADX INFO: renamed from: a */
    public final String f30885a;

    public C10421b(String str) {
        this.f30885a = str;
    }

    /* JADX INFO: renamed from: a */
    public final Object m10908a(C3032c c3032c) {
        Object obj = ((HashMap) c3032c.f9127Z).get(this);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(this.f30885a);
    }

    /* JADX INFO: renamed from: b */
    public final void m10909b(C3032c c3032c, Object obj) {
        HashMap map = (HashMap) c3032c.f9127Z;
        if (obj == null) {
            map.remove(this);
        } else {
            map.put(this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10421b.class != obj.getClass()) {
            return false;
        }
        return this.f30885a.equals(((C10421b) obj).f30885a);
    }

    public final int hashCode() {
        return this.f30885a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f30885a, "'}", new StringBuilder("Prop{name='"));
    }
}
