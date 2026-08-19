package mh;

import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;

/* JADX INFO: renamed from: mh.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C17274v implements InterfaceC17277y {

    /* JADX INFO: renamed from: a */
    public final C5551u f55081a;

    /* JADX INFO: renamed from: b */
    public final int f55082b;

    public C17274v(int i10, C5551u startTime) {
        AbstractC16544l.m18094g(startTime, "startTime");
        this.f55081a = startTime;
        this.f55082b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17274v)) {
            return false;
        }
        C17274v c17274v = (C17274v) obj;
        return AbstractC16544l.m18089b(this.f55081a, c17274v.f55081a) && this.f55082b == c17274v.f55082b;
    }

    public final int hashCode() {
        return (this.f55081a.f18004Y.hashCode() * 31) + this.f55082b;
    }

    public final String toString() {
        return "█";
    }
}
