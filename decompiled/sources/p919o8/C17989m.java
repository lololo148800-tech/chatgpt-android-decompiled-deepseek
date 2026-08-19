package p919o8;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o8.m */
/* JADX INFO: loaded from: classes.dex */
public final class C17989m {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f57436a;

    public C17989m(LinkedHashMap linkedHashMap) {
        this.f57436a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17989m) && this.f57436a.equals(((C17989m) obj).f57436a);
    }

    public final int hashCode() {
        return this.f57436a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.f57436a + Separators.RPAREN;
    }
}
