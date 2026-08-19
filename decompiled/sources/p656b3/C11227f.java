package p656b3;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: b3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C11227f {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f33982a;

    public C11227f(LinkedHashMap linkedHashMap) {
        this.f33982a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11227f) {
            if (this.f33982a.equals(((C11227f) obj).f33982a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f33982a.hashCode();
    }

    public final String toString() {
        return this.f33982a.toString();
    }
}
