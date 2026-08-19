package p184H5;

import kotlin.jvm.internal.AbstractC16544l;
import p033B5.InterfaceC0829m;
import p111E5.EnumC2324h;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: H5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3234a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0829m f9806a;

    /* JADX INFO: renamed from: b */
    public final boolean f9807b;

    /* JADX INFO: renamed from: c */
    public final EnumC2324h f9808c;

    /* JADX INFO: renamed from: d */
    public final String f9809d;

    public C3234a(InterfaceC0829m interfaceC0829m, boolean z6, EnumC2324h enumC2324h, String str) {
        this.f9806a = interfaceC0829m;
        this.f9807b = z6;
        this.f9808c = enumC2324h;
        this.f9809d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3234a)) {
            return false;
        }
        C3234a c3234a = (C3234a) obj;
        return AbstractC16544l.m18089b(this.f9806a, c3234a.f9806a) && this.f9807b == c3234a.f9807b && this.f9808c == c3234a.f9808c && AbstractC16544l.m18089b(this.f9809d, c3234a.f9809d);
    }

    public final int hashCode() {
        int iHashCode = (this.f9808c.hashCode() + (((this.f9806a.hashCode() * 31) + (this.f9807b ? 1231 : 1237)) * 31)) * 31;
        String str = this.f9809d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExecuteResult(image=");
        sb2.append(this.f9806a);
        sb2.append(", isSampled=");
        sb2.append(this.f9807b);
        sb2.append(", dataSource=");
        sb2.append(this.f9808c);
        sb2.append(", diskCacheKey=");
        return AbstractC9306j0.m9892k(sb2, this.f9809d, ')');
    }
}
