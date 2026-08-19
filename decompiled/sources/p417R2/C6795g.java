package p417R2;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: R2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6795g {

    /* JADX INFO: renamed from: a */
    public final String f21804a;

    public C6795g(String name) {
        AbstractC16544l.m18094g(name, "name");
        this.f21804a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6795g)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f21804a, ((C6795g) obj).f21804a);
    }

    public final int hashCode() {
        return this.f21804a.hashCode();
    }

    public final String toString() {
        return this.f21804a;
    }
}
