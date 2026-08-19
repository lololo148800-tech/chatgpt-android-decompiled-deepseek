package nf;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2053b;

/* JADX INFO: renamed from: nf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C17605d implements InterfaceC2053b {

    /* JADX INFO: renamed from: a */
    public final C17608g f56358a;

    public C17605d(C17608g artifact) {
        AbstractC16544l.m18094g(artifact, "artifact");
        this.f56358a = artifact;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17605d) && AbstractC16544l.m18089b(this.f56358a, ((C17605d) obj).f56358a);
    }

    public final int hashCode() {
        return this.f56358a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
