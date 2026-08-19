package p156G1;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: G1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2961h {

    /* JADX INFO: renamed from: a */
    public final AbstractC16546n f8850a;

    /* JADX INFO: renamed from: b */
    public final AbstractC16546n f8851b;

    /* JADX INFO: renamed from: c */
    public final boolean f8852c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2961h(InterfaceC1426a interfaceC1426a, boolean z6, InterfaceC1426a interfaceC1426a2) {
        this.f8850a = (AbstractC16546n) interfaceC1426a;
        this.f8851b = (AbstractC16546n) interfaceC1426a2;
        this.f8852c = z6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: a */
    public final InterfaceC1426a m3784a() {
        return this.f8851b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [Bm.a, kotlin.jvm.internal.n] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollAxisRange(value=");
        sb2.append(((Number) this.f8850a.invoke()).floatValue());
        sb2.append(", maxValue=");
        sb2.append(((Number) this.f8851b.invoke()).floatValue());
        sb2.append(", reverseScrolling=");
        return AbstractC3794B0.m4499x(sb2, this.f8852c, ')');
    }
}
