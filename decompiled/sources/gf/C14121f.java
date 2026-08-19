package gf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: gf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C14121f implements InterfaceC14124i {

    /* JADX INFO: renamed from: a */
    public final String f44456a;

    public C14121f(String name) {
        AbstractC16544l.m18094g(name, "name");
        this.f44456a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14121f) && AbstractC16544l.m18089b(this.f44456a, ((C14121f) obj).f44456a);
    }

    public final int hashCode() {
        return this.f44456a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
