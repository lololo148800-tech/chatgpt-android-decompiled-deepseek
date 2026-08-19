package io;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1135yn.C21555b;
import p492U1.C7543h;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9101A4;
import p774h1.C14336N;

/* JADX INFO: renamed from: io.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C15045a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46764Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15105o f46765Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15045a(C15105o c15105o, int i10) {
        super(1);
        this.f46764Y = i10;
        this.f46765Z = c15105o;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC15054j interfaceC15054jM16229b;
        switch (this.f46764Y) {
            case 0:
                InterfaceC7537b offset = (InterfaceC7537b) obj;
                AbstractC16544l.m18094g(offset, "$this$offset");
                return new C7543h(AbstractC9101A4.m9631a(0, (int) this.f46765Z.m16230c()));
            case 1:
                C14336N graphicsLayer = (C14336N) obj;
                AbstractC16544l.m18094g(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.m15654f(((Number) this.f46765Z.f46990e.getValue()).floatValue());
                return C17296C.f55119a;
            case 2:
                this.f46765Z.f46992g.setValue(new C7545j(((C7545j) obj).f23903a));
                return C17296C.f55119a;
            case 3:
                this.f46765Z.m16231d(new C15050f(((C21555b) obj).f68263Y));
                return C17296C.f55119a;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                C15105o c15105o = this.f46765Z;
                c15105o.f46988c.setValue(Float.valueOf(c15105o.m16230c() + fFloatValue));
                InterfaceC15054j interfaceC15054jM16229b2 = c15105o.m16229b();
                if (!(interfaceC15054jM16229b2 instanceof C15052h ? true : interfaceC15054jM16229b2 instanceof C15051g)) {
                    if (!(interfaceC15054jM16229b2 instanceof C15053i ? true : interfaceC15054jM16229b2 instanceof C15050f)) {
                        if (interfaceC15054jM16229b2 instanceof C15049e) {
                            throw new IllegalStateException("drags shouldn't be received after the content is dismissed");
                        }
                        throw new C0644w();
                    }
                    interfaceC15054jM16229b = c15105o.m16229b();
                } else if (Math.abs(c15105o.m16230c()) < 0.01f) {
                    interfaceC15054jM16229b = C15052h.f46779a;
                } else {
                    interfaceC15054jM16229b = new C15051g(Math.abs(((Number) c15105o.f46991f.getValue()).floatValue()) > c15105o.f46986a);
                }
                c15105o.m16231d(interfaceC15054jM16229b);
                return C17296C.f55119a;
        }
    }
}
