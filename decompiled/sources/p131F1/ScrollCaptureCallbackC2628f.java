package p131F1;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0647x0;
import p083D3.AbstractC1872j;
import p102Dm.AbstractC2119a;
import p1140z1.AbstractC21678Y;
import p153Fn.C2925c;
import p156G1.C2968o;
import p349O0.C5997d;
import p492U1.C7544i;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9233X;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14348d;
import p774h1.C14347c;
import p911o0.AbstractC17792x;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: F1.f */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC2628f implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a */
    public final C2968o f8135a;

    /* JADX INFO: renamed from: b */
    public final C7544i f8136b;

    /* JADX INFO: renamed from: c */
    public final C2635m f8137c;

    /* JADX INFO: renamed from: d */
    public final C2925c f8138d;

    /* JADX INFO: renamed from: e */
    public final C2633k f8139e;

    public ScrollCaptureCallbackC2628f(C2968o c2968o, C7544i c7544i, C2925c c2925c, C2635m c2635m) {
        this.f8135a = c2968o;
        this.f8136b = c7544i;
        this.f8137c = c2635m;
        this.f8138d = AbstractC0575H.m1158F(c2925c, C2631i.f8144Y);
        this.f8139e = new C2633k(c7544i.m7884a(), new C2627e(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m3620a(ScrollCaptureCallbackC2628f scrollCaptureCallbackC2628f, ScrollCaptureSession scrollCaptureSession, C7544i c7544i, AbstractC19687c abstractC19687c) {
        C2625c c2625c;
        int i10;
        int i11;
        ScrollCaptureCallbackC2628f scrollCaptureCallbackC2628f2;
        ScrollCaptureSession scrollCaptureSessionM2826e;
        int i12;
        int i13;
        int iM8921l;
        int iM8921l2;
        int i14;
        AbstractC21678Y abstractC21678YM3793c;
        Canvas canvasLockHardwareCanvas;
        scrollCaptureCallbackC2628f.getClass();
        if (abstractC19687c instanceof C2625c) {
            c2625c = (C2625c) abstractC19687c;
            int i15 = c2625c.f8126t0;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c2625c.f8126t0 = i15 - Integer.MIN_VALUE;
            } else {
                c2625c = new C2625c(scrollCaptureCallbackC2628f, abstractC19687c);
            }
        } else {
            c2625c = new C2625c(scrollCaptureCallbackC2628f, abstractC19687c);
        }
        Object obj = c2625c.f8124r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i16 = c2625c.f8126t0;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = c2625c.f8123q0;
                int i18 = c2625c.f8122p0;
                c7544i = c2625c.f8121o0;
                ScrollCaptureSession scrollCaptureSessionM2826e2 = AbstractC1872j.m2826e(c2625c.f8120Z);
                ScrollCaptureCallbackC2628f scrollCaptureCallbackC2628f3 = c2625c.f8119Y;
                AbstractC9233X.m9807c(obj);
                i11 = i17;
                i10 = i18;
                scrollCaptureSession = scrollCaptureSessionM2826e2;
                scrollCaptureCallbackC2628f = scrollCaptureCallbackC2628f3;
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = c2625c.f8123q0;
                i12 = c2625c.f8122p0;
                c7544i = c2625c.f8121o0;
                scrollCaptureSessionM2826e = AbstractC1872j.m2826e(c2625c.f8120Z);
                scrollCaptureCallbackC2628f2 = c2625c.f8119Y;
                AbstractC9233X.m9807c(obj);
            }
            C2633k c2633k = scrollCaptureCallbackC2628f2.f8139e;
            iM8921l = AbstractC8301I.m8921l(i12 - AbstractC2119a.m3195i(c2633k.f8150b), 0, c2633k.f8149a);
            C2633k c2633k2 = scrollCaptureCallbackC2628f2.f8139e;
            iM8921l2 = AbstractC8301I.m8921l(i13 - AbstractC2119a.m3195i(c2633k2.f8150b), 0, c2633k2.f8149a);
            i14 = c7544i.f23899a;
            if (iM8921l == iM8921l2) {
                return C7544i.f23898e;
            }
            abstractC21678YM3793c = scrollCaptureCallbackC2628f2.f8135a.m3793c();
            if (abstractC21678YM3793c != null) {
                throw new IllegalStateException("Could not find coordinator for semantics node.");
            }
            canvasLockHardwareCanvas = scrollCaptureSessionM2826e.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
                Canvas canvas = AbstractC14348d.f45031a;
                C14347c c14347c = new C14347c();
                c14347c.f45028a = canvasLockHardwareCanvas;
                c14347c.mo15717p(-i14, -iM8921l);
                abstractC21678YM3793c.m22151B0(c14347c, null);
                int iM3195i = AbstractC2119a.m3195i(scrollCaptureCallbackC2628f2.f8139e.f8150b);
                return new C7544i(i14, iM8921l + iM3195i, c7544i.f23901c, iM8921l2 + iM3195i);
            } finally {
                scrollCaptureSessionM2826e.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
            }
        }
        AbstractC9233X.m9807c(obj);
        i10 = c7544i.f23900b;
        C2633k c2633k3 = scrollCaptureCallbackC2628f.f8139e;
        c2625c.f8119Y = scrollCaptureCallbackC2628f;
        c2625c.f8120Z = scrollCaptureSession;
        c2625c.f8121o0 = c7544i;
        c2625c.f8122p0 = i10;
        i11 = c7544i.f23902d;
        c2625c.f8123q0 = i11;
        c2625c.f8126t0 = 1;
        if (i10 > i11) {
            c2633k3.getClass();
            throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
        }
        int i19 = i11 - i10;
        int i20 = c2633k3.f8149a;
        if (i19 > i20) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Expected range (", i19, i20, ") to be ≤ viewportSize=").toString());
        }
        float f10 = i10;
        float f11 = c2633k3.f8150b;
        Object obj2 = C17296C.f55119a;
        if (f10 < f11 || i11 > i20 + f11) {
            Object objM3622b = c2633k3.m3622b((f10 < f11 ? i10 : i11 - i20) - f11, c2625c);
            if (objM3622b != enumC19250a) {
                objM3622b = obj2;
            }
            if (objM3622b == enumC19250a) {
                obj2 = objM3622b;
            }
        }
        if (obj2 == enumC19250a) {
            return enumC19250a;
        }
        C2626d c2626d = C2626d.f8127Z;
        c2625c.f8119Y = scrollCaptureCallbackC2628f;
        c2625c.f8120Z = scrollCaptureSession;
        c2625c.f8121o0 = c7544i;
        c2625c.f8122p0 = i10;
        c2625c.f8123q0 = i11;
        c2625c.f8126t0 = 2;
        if (C5997d.m6424K(c2625c.getContext()).mo876v0(c2626d, c2625c) == enumC19250a) {
            return enumC19250a;
        }
        scrollCaptureCallbackC2628f2 = scrollCaptureCallbackC2628f;
        scrollCaptureSessionM2826e = scrollCaptureSession;
        i12 = i10;
        i13 = i11;
        C2633k c2633k4 = scrollCaptureCallbackC2628f2.f8139e;
        iM8921l = AbstractC8301I.m8921l(i12 - AbstractC2119a.m3195i(c2633k4.f8150b), 0, c2633k4.f8149a);
        C2633k c2633k5 = scrollCaptureCallbackC2628f2.f8139e;
        iM8921l2 = AbstractC8301I.m8921l(i13 - AbstractC2119a.m3195i(c2633k5.f8150b), 0, c2633k5.f8149a);
        i14 = c7544i.f23899a;
        if (iM8921l == iM8921l2) {
            return C7544i.f23898e;
        }
        abstractC21678YM3793c = scrollCaptureCallbackC2628f2.f8135a.m3793c();
        if (abstractC21678YM3793c != null) {
            throw new IllegalStateException("Could not find coordinator for semantics node.");
        }
        canvasLockHardwareCanvas = scrollCaptureSessionM2826e.getSurface().lockHardwareCanvas();
        canvasLockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
        Canvas canvas2 = AbstractC14348d.f45031a;
        C14347c c14347c2 = new C14347c();
        c14347c2.f45028a = canvasLockHardwareCanvas;
        c14347c2.mo15717p(-i14, -iM8921l);
        abstractC21678YM3793c.m22151B0(c14347c2, null);
        int iM3195i2 = AbstractC2119a.m3195i(scrollCaptureCallbackC2628f2.f8139e.f8150b);
        return new C7544i(i14, iM8921l + iM3195i2, c7544i.f23901c, iM8921l2 + iM3195i2);
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC0575H.m1156D(this.f8138d, C0647x0.f1902Y, null, new C2623a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(this.f8138d, null, null, new C2624b(this, scrollCaptureSession, rect, consumer, null), 3);
        c0564b0M1156D.mo1271H0(new C2630h(cancellationSignal, 0));
        cancellationSignal.setOnCancelListener(new C2629g(c0564b0M1156D, 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.m17405p(AbstractC14334L.m15614C(this.f8136b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f8139e.f8150b = 0.0f;
        C2635m c2635m = this.f8137c;
        c2635m.f8152a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
