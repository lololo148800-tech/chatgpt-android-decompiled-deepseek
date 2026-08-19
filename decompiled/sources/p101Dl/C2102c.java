package p101Dl;

import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: Dl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2102c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2111l f6448a = null;

    /* JADX INFO: renamed from: b */
    public final boolean f6449b = false;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2111l f6450c = null;

    /* JADX INFO: renamed from: d */
    public final boolean f6451d = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2102c)) {
            return false;
        }
        C2102c c2102c = (C2102c) obj;
        return AbstractC16544l.m18089b(this.f6448a, c2102c.f6448a) && this.f6449b == c2102c.f6449b && AbstractC16544l.m18089b(this.f6450c, c2102c.f6450c) && this.f6451d == c2102c.f6451d;
    }

    public final int hashCode() {
        InterfaceC2111l interfaceC2111l = this.f6448a;
        int iHashCode = (((interfaceC2111l == null ? 0 : interfaceC2111l.hashCode()) * 31) + (this.f6449b ? 1231 : 1237)) * 31;
        InterfaceC2111l interfaceC2111l2 = this.f6450c;
        return ((iHashCode + (interfaceC2111l2 != null ? interfaceC2111l2.hashCode() : 0)) * 31) + (this.f6451d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioProcessorOptions(capturePostProcessor=");
        sb2.append(this.f6448a);
        sb2.append(", capturePostBypass=");
        sb2.append(this.f6449b);
        sb2.append(", renderPreProcessor=");
        sb2.append(this.f6450c);
        sb2.append(", renderPreBypass=");
        return AbstractC3794B0.m4499x(sb2, this.f6451d, ')');
    }
}
