package p1025te;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.InterfaceC21915G;

/* JADX INFO: renamed from: te.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C19855F implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21915G f62947a;

    public C19855F(InterfaceC21915G assetPointer) {
        AbstractC16544l.m18094g(assetPointer, "assetPointer");
        this.f62947a = assetPointer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19855F) && AbstractC16544l.m18089b(this.f62947a, ((C19855F) obj).f62947a);
    }

    public final int hashCode() {
        return this.f62947a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
