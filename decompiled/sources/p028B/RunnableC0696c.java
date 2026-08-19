package p028B;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import androidx.work.impl.WorkDatabase;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC15303q;
import io.sentry.android.replay.viewhierarchy.AbstractC15316d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0083q0;
import p001A.C0084r;
import p001A.RunnableC0066i;
import p117Eb.C2392v;
import p178H.C3123P;
import p178H.C3170s0;
import p178H.C3175v;
import p178H.InterfaceC3121N;
import p414R.C6771e;
import p439S.C6974e;
import p444S4.C6995a;
import p470T4.AbstractC7245j;
import p470T4.InterfaceC7243h;
import p509Uk.lpqL.SfpOlmlMATQ;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8716t3;
import p544W9.AbstractC8722u3;
import p544W9.AbstractC8734w3;
import p561X.C9005s;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p658b5.C11239j;

/* JADX INFO: renamed from: B.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0696c implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2023Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f2024Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f2025o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f2026p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f2027q0;

    public /* synthetic */ RunnableC0696c(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2023Y = i10;
        this.f2024Z = obj;
        this.f2025o0 = obj2;
        this.f2026p0 = obj3;
        this.f2027q0 = obj4;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [io.sentry.android.replay.o] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2023Y) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((C0084r) this.f2024Z).f335b).onCaptureCompleted((CameraCaptureSession) this.f2025o0, (CaptureRequest) this.f2026p0, (TotalCaptureResult) this.f2027q0);
                return;
            case 1:
                ((CameraCaptureSession.CaptureCallback) ((C0084r) this.f2024Z).f335b).onCaptureProgressed((CameraCaptureSession) this.f2025o0, (CaptureRequest) this.f2026p0, (CaptureResult) this.f2027q0);
                return;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((C0084r) this.f2024Z).f335b).onCaptureFailed((CameraCaptureSession) this.f2025o0, (CaptureRequest) this.f2026p0, (CaptureFailure) this.f2027q0);
                return;
            case 3:
                ((C3123P) this.f2024Z).m3959F((C2392v) this.f2025o0, (Executor) this.f2026p0, (InterfaceC3121N) this.f2027q0);
                return;
            case 4:
                C3175v c3175v = (C3175v) this.f2025o0;
                Map map = (Map) this.f2026p0;
                C10142i c10142i = (C10142i) this.f2027q0;
                C6771e c6771e = (C6771e) this.f2024Z;
                c6771e.getClass();
                try {
                    c6771e.f21723Y.mo7214h(c3175v, map);
                    c10142i.m10747a(null);
                    return;
                } catch (RuntimeException e10) {
                    c10142i.m10748b(e10);
                    return;
                }
            case 5:
                C3175v c3175v2 = (C3175v) this.f2025o0;
                Map map2 = (Map) this.f2026p0;
                C10142i c10142i2 = (C10142i) this.f2027q0;
                C6974e c6974e = (C6974e) this.f2024Z;
                c6974e.getClass();
                try {
                    c6974e.f22293Y.mo7214h(c3175v2, map2);
                    c10142i2.m10747a(null);
                    return;
                } catch (RuntimeException e11) {
                    c10142i2.m10748b(e11);
                    return;
                }
            case 6:
                List list = (List) this.f2024Z;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC7243h) it.next()).mo7653e(((C11239j) this.f2025o0).f34012a);
                }
                AbstractC7245j.m7655b((C6995a) this.f2026p0, (WorkDatabase) this.f2027q0, list);
                return;
            case 7:
                C9005s c9005s = (C9005s) this.f2024Z;
                c9005s.getClass();
                AbstractC8072d6.m8486c("TextureViewImpl", "Safe to release surface.");
                C0083q0 c0083q0 = c9005s.f27481l;
                if (c0083q0 != null) {
                    c0083q0.m271f();
                    c9005s.f27481l = null;
                }
                ((Surface) this.f2025o0).release();
                if (c9005s.f27476g == ((C10145l) this.f2026p0)) {
                    c9005s.f27476g = null;
                }
                if (c9005s.f27477h == ((C3170s0) this.f2027q0)) {
                    c9005s.f27477h = null;
                    return;
                }
                return;
            case 8:
                View view = (View) this.f2024Z;
                Canvas canvas = (Canvas) this.f2025o0;
                InterfaceC15127H interfaceC15127H = (InterfaceC15127H) this.f2026p0;
                CountDownLatch countDownLatch = (CountDownLatch) this.f2027q0;
                try {
                    view.draw(canvas);
                    break;
                } catch (Throwable th2) {
                    try {
                        interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Taking screenshot failed (view.draw).", th2);
                    } finally {
                        countDownLatch.countDown();
                    }
                    break;
                }
                return;
            default:
                Window window = (Window) this.f2025o0;
                final View view2 = (View) this.f2027q0;
                final ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q = (ViewTreeObserverOnDrawListenerC15303q) this.f2024Z;
                AbstractC16544l.m18094g(viewTreeObserverOnDrawListenerC15303q, SfpOlmlMATQ.ZWU);
                final Bitmap bitmap = (Bitmap) this.f2026p0;
                try {
                    viewTreeObserverOnDrawListenerC15303q.f47810w0.set(false);
                    PixelCopy.request(window, bitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.o
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i10) {
                            ViewTreeObserverOnDrawListenerC15303q this$0 = viewTreeObserverOnDrawListenerC15303q;
                            Bitmap bitmap2 = bitmap;
                            View view3 = view2;
                            AbstractC16544l.m18094g(this$0, "this$0");
                            C15524y1 c15524y1 = this$0.f47801Z;
                            if (i10 != 0) {
                                c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i10));
                                bitmap2.recycle();
                            } else if (this$0.f47810w0.get()) {
                                c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                                bitmap2.recycle();
                            } else {
                                AbstractC15316d abstractC15316dM9464a = AbstractC8734w3.m9464a(view3, null, 0, c15524y1);
                                AbstractC8722u3.m9439b(view3, abstractC15316dM9464a, c15524y1);
                                AbstractC8716t3.m9426c(this$0.f47803p0, c15524y1, "screenshot_recorder.mask", new RunnableC0066i(bitmap2, this$0, abstractC15316dM9464a, 22));
                            }
                        }
                    }, (Handler) viewTreeObserverOnDrawListenerC15303q.f47802o0.f45413Y);
                    return;
                } catch (Throwable th3) {
                    viewTreeObserverOnDrawListenerC15303q.f47801Z.getLogger().mo16297h(EnumC15375i1.WARNING, "Failed to capture replay recording", th3);
                    bitmap.recycle();
                    return;
                }
        }
    }
}
