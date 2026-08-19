package p160G5;

import kotlin.jvm.internal.AbstractC16544l;
import p033B5.InterfaceC0829m;
import p111E5.EnumC2324h;

/* JADX INFO: renamed from: G5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3002h implements InterfaceC2999e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0829m f9025a;

    /* JADX INFO: renamed from: b */
    public final boolean f9026b;

    /* JADX INFO: renamed from: c */
    public final EnumC2324h f9027c;

    public C3002h(InterfaceC0829m interfaceC0829m, boolean z6, EnumC2324h enumC2324h) {
        this.f9025a = interfaceC0829m;
        this.f9026b = z6;
        this.f9027c = enumC2324h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3002h)) {
            return false;
        }
        C3002h c3002h = (C3002h) obj;
        return AbstractC16544l.m18089b(this.f9025a, c3002h.f9025a) && this.f9026b == c3002h.f9026b && this.f9027c == c3002h.f9027c;
    }

    public final int hashCode() {
        return this.f9027c.hashCode() + (((this.f9025a.hashCode() * 31) + (this.f9026b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f9025a + ", isSampled=" + this.f9026b + ", dataSource=" + this.f9027c + ')';
    }
}
