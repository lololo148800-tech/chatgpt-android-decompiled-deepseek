package p917o6;

import p571X9.AbstractC9124E3;

/* JADX INFO: renamed from: o6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17855h extends AbstractC9124E3 {

    /* JADX INFO: renamed from: a */
    public final C17854g f56940a;

    public C17855h(C17854g c17854g) {
        this.f56940a = c17854g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17855h) && this.f56940a.equals(((C17855h) obj).f56940a);
    }

    public final int hashCode() {
        return this.f56940a.f56939a.hashCode();
    }

    public final String toString() {
        return "Element(value=" + this.f56940a + ')';
    }
}
