package p736f0;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p228J.AbstractC3794B0;
import p635a1.InterfaceC10446d;
import p758g0.InterfaceC13726B;

/* JADX INFO: renamed from: f0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C13501s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10446d f42744a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f42745b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13726B f42746c;

    /* JADX INFO: renamed from: d */
    public final boolean f42747d;

    public C13501s(InterfaceC1436k interfaceC1436k, InterfaceC10446d interfaceC10446d, InterfaceC13726B interfaceC13726B, boolean z6) {
        this.f42744a = interfaceC10446d;
        this.f42745b = interfaceC1436k;
        this.f42746c = interfaceC13726B;
        this.f42747d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13501s)) {
            return false;
        }
        C13501s c13501s = (C13501s) obj;
        return AbstractC16544l.m18089b(this.f42744a, c13501s.f42744a) && AbstractC16544l.m18089b(this.f42745b, c13501s.f42745b) && AbstractC16544l.m18089b(this.f42746c, c13501s.f42746c) && this.f42747d == c13501s.f42747d;
    }

    public final int hashCode() {
        return ((this.f42746c.hashCode() + ((this.f42745b.hashCode() + (this.f42744a.hashCode() * 31)) * 31)) * 31) + (this.f42747d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeSize(alignment=");
        sb2.append(this.f42744a);
        sb2.append(", size=");
        sb2.append(this.f42745b);
        sb2.append(", animationSpec=");
        sb2.append(this.f42746c);
        sb2.append(", clip=");
        return AbstractC3794B0.m4499x(sb2, this.f42747d, ')');
    }
}
