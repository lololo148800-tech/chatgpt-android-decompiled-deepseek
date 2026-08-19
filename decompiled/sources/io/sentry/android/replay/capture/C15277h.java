package io.sentry.android.replay.capture;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C15277h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47732Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15278i f47733Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15277h(C15278i c15278i, int i10) {
        super(1);
        this.f47732Y = i10;
        this.f47733Z = c15278i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f47732Y) {
            case 0:
                AbstractC15283n segment = (AbstractC15283n) obj;
                AbstractC16544l.m18094g(segment, "segment");
                if (segment instanceof C15281l) {
                    C15278i c15278i = this.f47733Z;
                    c15278i.f47738w.add(segment);
                    c15278i.m16501m(c15278i.m16499k() + 1);
                }
                break;
            default:
                AbstractC15283n segment2 = (AbstractC15283n) obj;
                AbstractC16544l.m18094g(segment2, "segment");
                if (segment2 instanceof C15281l) {
                    C15278i c15278i2 = this.f47733Z;
                    c15278i2.f47738w.add(segment2);
                    c15278i2.m16501m(c15278i2.m16499k() + 1);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
