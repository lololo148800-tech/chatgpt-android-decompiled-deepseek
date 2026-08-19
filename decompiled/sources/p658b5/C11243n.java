package p658b5;

import kotlin.jvm.internal.AbstractC16544l;
import p444S4.EnumC7019y;

/* JADX INFO: renamed from: b5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C11243n {

    /* JADX INFO: renamed from: a */
    public String f34021a;

    /* JADX INFO: renamed from: b */
    public EnumC7019y f34022b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11243n)) {
            return false;
        }
        C11243n c11243n = (C11243n) obj;
        return AbstractC16544l.m18089b(this.f34021a, c11243n.f34021a) && this.f34022b == c11243n.f34022b;
    }

    public final int hashCode() {
        return this.f34022b.hashCode() + (this.f34021a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f34021a + ", state=" + this.f34022b + ')';
    }
}
