package p111E5;

import kotlin.jvm.internal.AbstractC16544l;
import p033B5.InterfaceC0829m;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: E5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2325i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0829m f7229a;

    /* JADX INFO: renamed from: b */
    public final boolean f7230b;

    public C2325i(InterfaceC0829m interfaceC0829m, boolean z6) {
        this.f7229a = interfaceC0829m;
        this.f7230b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2325i)) {
            return false;
        }
        C2325i c2325i = (C2325i) obj;
        return AbstractC16544l.m18089b(this.f7229a, c2325i.f7229a) && this.f7230b == c2325i.f7230b;
    }

    public final int hashCode() {
        return (this.f7229a.hashCode() * 31) + (this.f7230b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DecodeResult(image=");
        sb2.append(this.f7229a);
        sb2.append(", isSampled=");
        return AbstractC3794B0.m4499x(sb2, this.f7230b, ')');
    }
}
