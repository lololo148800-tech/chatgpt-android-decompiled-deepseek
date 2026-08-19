package fj;

import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p729ej.C13433x;

/* JADX INFO: renamed from: fj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C13677i {

    /* JADX INFO: renamed from: a */
    public final C13433x f43170a;

    /* JADX INFO: renamed from: b */
    public final String f43171b;

    public C13677i(C13433x c13433x, String name) {
        AbstractC16544l.m18094g(name, "name");
        this.f43170a = c13433x;
        this.f43171b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13677i)) {
            return false;
        }
        C13677i c13677i = (C13677i) obj;
        return AbstractC16544l.m18089b(this.f43170a, c13677i.f43170a) && AbstractC16544l.m18089b(this.f43171b, c13677i.f43171b);
    }

    public final int hashCode() {
        return this.f43171b.hashCode() + (this.f43170a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkflowNodeId(identifier=");
        sb2.append(this.f43170a);
        sb2.append(", name=");
        return AbstractC9306j0.m9892k(sb2, this.f43171b, ')');
    }
}
