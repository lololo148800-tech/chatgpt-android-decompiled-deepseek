package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.C15108A1;
import io.sentry.C15180a;
import io.sentry.C15347d1;
import io.sentry.C15516w;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15472s;
import io.sentry.android.core.internal.util.C15232d;
import io.sentry.protocol.C15421A;
import io.sentry.util.thread.InterfaceC15505a;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p028B.RunnableC0696c;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotEventProcessor implements InterfaceC15472s {

    /* JADX INFO: renamed from: Y */
    public final SentryAndroidOptions f47382Y;

    /* JADX INFO: renamed from: Z */
    public final C15184B f47383Z;

    /* JADX INFO: renamed from: o0 */
    public final C15232d f47384o0;

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C15184B c15184b) {
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47382Y = sentryAndroidOptions;
        this.f47383Z = c15184b;
        this.f47384o0 = new C15232d(2000L, 3);
        if (sentryAndroidOptions.isAttachScreenshot()) {
            AbstractC8471E3.m9104b("Screenshot");
        }
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: a */
    public final C15108A1 mo16376a(C15108A1 c15108a1, C15516w c15516w) {
        return c15108a1;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0142 A[Catch: all -> 0x00f9, TryCatch #3 {all -> 0x00f9, blocks: (B:40:0x00a3, B:42:0x00c3, B:51:0x00f5, B:73:0x0142, B:75:0x014e, B:76:0x0158, B:56:0x0104, B:64:0x0112, B:65:0x0115, B:66:0x0116, B:68:0x0121, B:70:0x0139, B:69:0x0129, B:55:0x00fd, B:43:0x00cd, B:45:0x00eb), top: B:98:0x00a3, outer: #4, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x014e A[Catch: all -> 0x00f9, TryCatch #3 {all -> 0x00f9, blocks: (B:40:0x00a3, B:42:0x00c3, B:51:0x00f5, B:73:0x0142, B:75:0x014e, B:76:0x0158, B:56:0x0104, B:64:0x0112, B:65:0x0115, B:66:0x0116, B:68:0x0121, B:70:0x0139, B:69:0x0129, B:55:0x00fd, B:43:0x00cd, B:45:0x00eb), top: B:98:0x00a3, outer: #4, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0158 A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #3 {all -> 0x00f9, blocks: (B:40:0x00a3, B:42:0x00c3, B:51:0x00f5, B:73:0x0142, B:75:0x014e, B:76:0x0158, B:56:0x0104, B:64:0x0112, B:65:0x0115, B:66:0x0116, B:68:0x0121, B:70:0x0139, B:69:0x0129, B:55:0x00fd, B:43:0x00cd, B:45:0x00eb), top: B:98:0x00a3, outer: #4, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Type inference failed for: r11v3, types: [io.sentry.android.core.internal.util.h] */
    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: e */
    public final C15347d1 mo16380e(C15347d1 c15347d1, C15516w c15516w) {
        byte[] bArr;
        boolean z6;
        if (!c15347d1.m16576e()) {
            return c15347d1;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f47382Y;
        if (!sentryAndroidOptions.isAttachScreenshot()) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "attachScreenshot is disabled.", new Object[0]);
            return c15347d1;
        }
        WeakReference weakReference = (WeakReference) C15184B.f47304b.f47305a;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if (activity != null && !AbstractC8465D3.m9091e(c15516w)) {
            boolean zM16440a = this.f47384o0.m16440a();
            sentryAndroidOptions.getBeforeScreenshotCaptureCallback();
            if (zM16440a) {
                return c15347d1;
            }
            InterfaceC15505a mainThreadChecker = sentryAndroidOptions.getMainThreadChecker();
            InterfaceC15127H logger = sentryAndroidOptions.getLogger();
            C15184B c15184b = this.f47383Z;
            if (activity.isFinishing() || activity.isDestroyed()) {
                logger.mo16298o(EnumC15375i1.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            } else {
                Window window = activity.getWindow();
                if (window == null) {
                    logger.mo16298o(EnumC15375i1.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
                } else {
                    View viewPeekDecorView = window.peekDecorView();
                    if (viewPeekDecorView == null) {
                        logger.mo16298o(EnumC15375i1.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
                    } else {
                        View rootView = viewPeekDecorView.getRootView();
                        if (rootView == null) {
                            logger.mo16298o(EnumC15375i1.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
                        } else if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
                            logger.mo16298o(EnumC15375i1.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
                        } else {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                                    c15184b.getClass();
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                                        handlerThread.start();
                                        try {
                                            Handler handler = new Handler(handlerThread.getLooper());
                                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                            PixelCopy.request(window, bitmapCreateBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.core.internal.util.h
                                                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                                public final void onPixelCopyFinished(int i10) {
                                                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                    CountDownLatch countDownLatch2 = countDownLatch;
                                                    atomicBoolean2.set(i10 == 0);
                                                    countDownLatch2.countDown();
                                                }
                                            }, handler);
                                            z6 = countDownLatch.await(1000L, TimeUnit.MILLISECONDS) && atomicBoolean.get();
                                            handlerThread.quit();
                                        } catch (Throwable th2) {
                                            try {
                                                logger.mo16297h(EnumC15375i1.ERROR, "Taking screenshot using PixelCopy failed.", th2);
                                                handlerThread.quit();
                                                z6 = false;
                                            } catch (Throwable th3) {
                                                handlerThread.quit();
                                                throw th3;
                                            }
                                        }
                                        if (z6) {
                                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                                            if (byteArrayOutputStream.size() <= 0) {
                                                logger.mo16298o(EnumC15375i1.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                            } else {
                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                bArr = byteArray;
                                            }
                                            if (bArr == null) {
                                                return c15347d1;
                                            }
                                            c15516w.f48468c = new C15180a("screenshot.png", "image/png", bArr);
                                            c15516w.m16729c("android:activity", activity);
                                        }
                                    } else {
                                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                                        if (mainThreadChecker.mo16438a()) {
                                            rootView.draw(canvas);
                                            countDownLatch.countDown();
                                        } else {
                                            activity.runOnUiThread(new RunnableC0696c(rootView, canvas, logger, countDownLatch, 8));
                                        }
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                                            if (byteArrayOutputStream.size() <= 0) {
                                                logger.mo16298o(EnumC15375i1.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                            } else {
                                                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                bArr = byteArray2;
                                            }
                                            if (bArr == null) {
                                                return c15347d1;
                                            }
                                            c15516w.f48468c = new C15180a("screenshot.png", "image/png", bArr);
                                            c15516w.m16729c("android:activity", activity);
                                        }
                                    }
                                    byteArrayOutputStream.close();
                                } catch (Throwable th4) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th4;
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th6) {
                                logger.mo16297h(EnumC15375i1.ERROR, "Taking screenshot failed.", th6);
                            }
                        }
                    }
                }
            }
            bArr = null;
            if (bArr == null) {
                return c15347d1;
            }
            c15516w.f48468c = new C15180a("screenshot.png", "image/png", bArr);
            c15516w.m16729c("android:activity", activity);
        }
        return c15347d1;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: k */
    public final C15421A mo16381k(C15421A c15421a, C15516w c15516w) {
        return c15421a;
    }
}
