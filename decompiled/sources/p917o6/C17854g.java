package p917o6;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17854g {

    /* JADX INFO: renamed from: a */
    public final Set f56939a;

    public C17854g(Set set) {
        this.f56939a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17854g) && AbstractC16544l.m18089b(this.f56939a, ((C17854g) obj).f56939a);
    }

    public final int hashCode() {
        return this.f56939a.hashCode();
    }

    public final String toString() {
        return "BPossibleTypes(possibleTypes=" + this.f56939a + ')';
    }
}
