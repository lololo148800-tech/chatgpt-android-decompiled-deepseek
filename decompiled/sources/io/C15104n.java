package io;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p492U1.C7545j;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: io.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C15104n extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46984Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15105o f46985Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15104n(C15105o c15105o, int i10) {
        super(0);
        this.f46984Y = i10;
        this.f46985Z = c15105o;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        float fFloatValue;
        switch (this.f46984Y) {
            case 0:
                C15105o c15105o = this.f46985Z;
                int i10 = (int) (((C7545j) c15105o.f46992g.getValue()).f23903a & 4294967295L);
                return Float.valueOf(i10 != 0 ? AbstractC8301I.m8920k(Math.abs(c15105o.m16230c()) / i10, 0.0f, 1.0f) : 0.0f);
            default:
                C15105o c15105o2 = this.f46985Z;
                if (c15105o2.f46987b) {
                    fFloatValue = ((Number) c15105o2.f46991f.getValue()).floatValue() * (((Boolean) c15105o2.f46993h.getValue()).booleanValue() ? -20.0f : 20.0f);
                } else {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
