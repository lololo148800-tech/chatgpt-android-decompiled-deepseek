package p204I1;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: I1.N */
/* JADX INFO: loaded from: classes.dex */
public final class C3583N {

    /* JADX INFO: renamed from: a */
    public final String f10913a;

    public C3583N(String str) {
        this.f10913a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3583N) {
            return AbstractC16544l.m18089b(this.f10913a, ((C3583N) obj).f10913a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10913a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("UrlAnnotation(url="), this.f10913a, ')');
    }
}
