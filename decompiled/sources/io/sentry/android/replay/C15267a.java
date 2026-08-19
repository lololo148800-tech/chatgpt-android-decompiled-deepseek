package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.sentry.ThreadFactoryC15522y;
import io.sentry.util.C15501f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1113xn.C21319m;
import p741f5.RunnableC13542a;

/* JADX INFO: renamed from: io.sentry.android.replay.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15267a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C15267a f47669Z = new C15267a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C15267a f47670o0 = new C15267a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C15267a f47671p0 = new C15267a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C15267a f47672q0 = new C15267a(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C15267a f47673r0 = new C15267a(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C15267a f47674s0 = new C15267a(0, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C15267a f47675t0 = new C15267a(0, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C15267a f47676u0 = new C15267a(0, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C15267a f47677v0 = new C15267a(0, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C15267a f47678w0 = new C15267a(0, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C15267a f47679x0 = new C15267a(0, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C15267a f47680y0 = new C15267a(0, 11);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47681Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15267a(int i10, int i11) {
        super(i10);
        this.f47681Y = i11;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() throws NoSuchFieldException {
        Method method;
        switch (this.f47681Y) {
            case 0:
                return new C21319m("_[a-z]");
            case 1:
                return new C15501f();
            case 2:
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC15522y(2));
            case 3:
                C15300n c15300n = new C15300n();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC13542a(c15300n, 9));
                return c15300n;
            case 4:
                return new Paint();
            case 5:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                AbstractC16544l.m18093f(bitmapCreateBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
                return bitmapCreateBitmap;
            case 6:
                Class cls = (Class) C15307u.f47821a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 7:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable th2) {
                    Log.w("WindowManagerSpy", th2);
                    return null;
                }
            case 8:
                Class cls2 = (Class) C15307u.f47821a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 9:
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC15522y(3));
            case 10:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable th3) {
                    Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th3);
                    return null;
                }
            default:
                Class cls3 = (Class) AbstractC15318x.f47859a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException e10) {
                    Log.d("WindowSpy", "Unexpected exception retrieving " + cls3 + "#mWindow on API " + Build.VERSION.SDK_INT, e10);
                    return null;
                }
        }
    }
}
