package p751ff;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ff.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C13635f implements InterfaceC13636g {

    /* JADX INFO: renamed from: a */
    public final String f43079a;

    public C13635f(String name) {
        AbstractC16544l.m18094g(name, "name");
        this.f43079a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13635f) && AbstractC16544l.m18089b(this.f43079a, ((C13635f) obj).f43079a);
    }

    public final int hashCode() {
        return this.f43079a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
