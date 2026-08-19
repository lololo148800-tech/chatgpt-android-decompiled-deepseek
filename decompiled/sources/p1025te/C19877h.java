package p1025te;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: te.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C19877h implements InterfaceC19878i {

    /* JADX INFO: renamed from: a */
    public final Float f63018a;

    public C19877h(Float f10) {
        this.f63018a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19877h) && AbstractC16544l.m18089b(this.f63018a, ((C19877h) obj).f63018a);
    }

    public final int hashCode() {
        Float f10 = this.f63018a;
        if (f10 == null) {
            return 0;
        }
        return f10.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
