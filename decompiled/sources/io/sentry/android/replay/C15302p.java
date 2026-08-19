package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: io.sentry.android.replay.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C15302p extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47798Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ViewTreeObserverOnDrawListenerC15303q f47799Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15302p(ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q, int i10) {
        super(0);
        this.f47798Y = i10;
        this.f47799Z = viewTreeObserverOnDrawListenerC15303q;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f47798Y) {
            case 0:
                Matrix matrix = new Matrix();
                C15304r c15304r = this.f47799Z.f47800Y;
                matrix.preScale(c15304r.f47815c, c15304r.f47816d);
                return matrix;
            default:
                return new Canvas((Bitmap) this.f47799Z.f47807t0.getValue());
        }
    }
}
