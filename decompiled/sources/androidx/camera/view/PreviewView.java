package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.AbstractC11067C;
import androidx.lifecycle.C11069E;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0738T;
import p140Fa.C2685e;
import p178H.AbstractC3136b0;
import p178H.C3170s0;
import p178H.C3178w0;
import p178H.InterfaceC3122O;
import p178H.InterfaceC3140d0;
import p197Hj.ViewOnLayoutChangeListenerC3456b;
import p228J.InterfaceC3866v;
import p253K.AbstractC4503n;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8488H2;
import p561X.AbstractC8987a;
import p561X.AbstractC8995i;
import p561X.AbstractC8997k;
import p561X.C8989c;
import p561X.C8990d;
import p561X.C8991e;
import p561X.C8996j;
import p561X.C9000n;
import p561X.C9005s;
import p561X.EnumC8992f;
import p561X.EnumC8993g;
import p561X.EnumC8994h;
import p585Y.C9541a;
import p608Z.AbstractC10131a;
import p634a0.C10442a;
import p720e6.C13287b;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* JADX INFO: renamed from: A0 */
    public static final /* synthetic */ int f32346A0 = 0;

    /* JADX INFO: renamed from: o0 */
    public EnumC8992f f32347o0;

    /* JADX INFO: renamed from: p0 */
    public AbstractC8995i f32348p0;

    /* JADX INFO: renamed from: q0 */
    public final C9000n f32349q0;

    /* JADX INFO: renamed from: r0 */
    public final C8989c f32350r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f32351s0;

    /* JADX INFO: renamed from: t0 */
    public final C11069E f32352t0;

    /* JADX INFO: renamed from: u0 */
    public final AtomicReference f32353u0;

    /* JADX INFO: renamed from: v0 */
    public final C8996j f32354v0;

    /* JADX INFO: renamed from: w0 */
    public InterfaceC3866v f32355w0;

    /* JADX INFO: renamed from: x0 */
    public final C8991e f32356x0;

    /* JADX INFO: renamed from: y0 */
    public final ViewOnLayoutChangeListenerC3456b f32357y0;

    /* JADX INFO: renamed from: z0 */
    public final C13287b f32358z0;

    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f32347o0 = EnumC8992f.PERFORMANCE;
        C8989c c8989c = new C8989c();
        c8989c.f27434h = EnumC8993g.FILL_CENTER;
        this.f32350r0 = c8989c;
        this.f32351s0 = true;
        this.f32352t0 = new C11069E(EnumC8994h.f27446Y);
        this.f32353u0 = new AtomicReference();
        this.f32354v0 = new C8996j(c8989c);
        this.f32356x0 = new C8991e(this);
        this.f32357y0 = new ViewOnLayoutChangeListenerC3456b(this, 1);
        this.f32358z0 = new C13287b(this, 28);
        AbstractC8488H2.m9140a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = AbstractC8997k.f27455a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        AbstractC0738T.m1583k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, c8989c.f27434h.f27445Y);
            for (EnumC8993g enumC8993g : EnumC8993g.values()) {
                if (enumC8993g.f27445Y == integer) {
                    setScaleType(enumC8993g);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (EnumC8992f enumC8992f : EnumC8992f.values()) {
                        if (enumC8992f.f27439Y == integer2) {
                            setImplementationMode(enumC8992f);
                            typedArrayObtainStyledAttributes.recycle();
                            new C8990d(this);
                            AbstractC16544l.m18094g(context, "context");
                            ViewConfiguration.get(context).getScaledTouchSlop();
                            new GestureDetector(context, new C9541a(new C2685e()));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            C9000n c9000n = new C9000n(context, null, 0, 0);
                            c9000n.setBackgroundColor(-1);
                            c9000n.setAlpha(0.0f);
                            c9000n.setElevation(Float.MAX_VALUE);
                            this.f32349q0 = c9000n;
                            c9000n.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11193b(C3170s0 c3170s0, EnumC8992f enumC8992f) {
        boolean zEquals = c3170s0.f9537d.mo122r().mo142g().equals("androidx.camera.camera2.legacy");
        boolean z6 = (AbstractC10131a.f30036a.m4579f(SurfaceViewStretchedQuirk.class) == null && AbstractC10131a.f30036a.m4579f(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z6) {
            return true;
        }
        int iOrdinal = enumC8992f.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + enumC8992f);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private InterfaceC3122O getScreenFlashInternal() {
        return this.f32349q0.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i10;
    }

    private void setScreenFlashUiInfo(InterfaceC3122O interfaceC3122O) {
        AbstractC8072d6.m8486c("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    /* JADX INFO: renamed from: a */
    public final void m11194a() {
        Rect rect;
        Display display;
        InterfaceC3866v interfaceC3866v;
        AbstractC8488H2.m9140a();
        if (this.f32348p0 != null) {
            if (this.f32351s0 && (display = getDisplay()) != null && (interfaceC3866v = this.f32355w0) != null) {
                int iMo143h = interfaceC3866v.mo143h(display.getRotation());
                int rotation = display.getRotation();
                C8989c c8989c = this.f32350r0;
                if (c8989c.f27433g) {
                    c8989c.f27429c = iMo143h;
                    c8989c.f27431e = rotation;
                }
            }
            this.f32348p0.m9586f();
        }
        C8996j c8996j = this.f32354v0;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        c8996j.getClass();
        AbstractC8488H2.m9140a();
        synchronized (c8996j) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = c8996j.f27454b) != null) {
                    c8996j.f27453a.m9573a(size, layoutDirection, rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Bitmap getBitmap() {
        Bitmap bitmapMo9582b;
        AbstractC8488H2.m9140a();
        AbstractC8995i abstractC8995i = this.f32348p0;
        if (abstractC8995i == null || (bitmapMo9582b = abstractC8995i.mo9582b()) == null) {
            return null;
        }
        FrameLayout frameLayout = abstractC8995i.f27450b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        C8989c c8989c = abstractC8995i.f27451c;
        if (!c8989c.m9578f()) {
            return bitmapMo9582b;
        }
        Matrix matrixM9576d = c8989c.m9576d();
        RectF rectFM9577e = c8989c.m9577e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapMo9582b.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixM9576d);
        matrix.postScale(rectFM9577e.width() / c8989c.f27427a.getWidth(), rectFM9577e.height() / c8989c.f27427a.getHeight());
        matrix.postTranslate(rectFM9577e.left, rectFM9577e.top);
        canvas.drawBitmap(bitmapMo9582b, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public AbstractC8987a getController() {
        AbstractC8488H2.m9140a();
        return null;
    }

    public EnumC8992f getImplementationMode() {
        AbstractC8488H2.m9140a();
        return this.f32347o0;
    }

    public AbstractC3136b0 getMeteringPointFactory() {
        AbstractC8488H2.m9140a();
        return this.f32354v0;
    }

    public C10442a getOutputTransform() {
        Matrix matrixM9575c;
        C8989c c8989c = this.f32350r0;
        AbstractC8488H2.m9140a();
        try {
            matrixM9575c = c8989c.m9575c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixM9575c = null;
        }
        Rect rect = c8989c.f27428b;
        if (matrixM9575c == null || rect == null) {
            AbstractC8072d6.m8486c("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = AbstractC4503n.f14693a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(AbstractC4503n.f14693a, rectF2, Matrix.ScaleToFit.FILL);
        matrixM9575c.preConcat(matrix);
        if (this.f32348p0 instanceof C9005s) {
            matrixM9575c.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            AbstractC8072d6.m8492i("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new C10442a();
    }

    public AbstractC11067C getPreviewStreamState() {
        return this.f32352t0;
    }

    public EnumC8993g getScaleType() {
        AbstractC8488H2.m9140a();
        return this.f32350r0.f27434h;
    }

    public InterfaceC3122O getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        AbstractC8488H2.m9140a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        C8989c c8989c = this.f32350r0;
        if (!c8989c.m9578f()) {
            return null;
        }
        Matrix matrix = new Matrix(c8989c.f27430d);
        matrix.postConcat(c8989c.m9575c(size, layoutDirection));
        return matrix;
    }

    public InterfaceC3140d0 getSurfaceProvider() {
        AbstractC8488H2.m9140a();
        return this.f32358z0;
    }

    public C3178w0 getViewPort() {
        AbstractC8488H2.m9140a();
        if (getDisplay() == null) {
            return null;
        }
        getDisplay().getRotation();
        AbstractC8488H2.m9140a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new C3178w0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f32356x0, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f32357y0);
        AbstractC8995i abstractC8995i = this.f32348p0;
        if (abstractC8995i != null) {
            abstractC8995i.mo9583c();
        }
        AbstractC8488H2.m9140a();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f32357y0);
        AbstractC8995i abstractC8995i = this.f32348p0;
        if (abstractC8995i != null) {
            abstractC8995i.mo9584d();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f32356x0);
    }

    public void setController(AbstractC8987a abstractC8987a) {
        AbstractC8488H2.m9140a();
        AbstractC8488H2.m9140a();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(EnumC8992f enumC8992f) {
        AbstractC8488H2.m9140a();
        this.f32347o0 = enumC8992f;
    }

    public void setScaleType(EnumC8993g enumC8993g) {
        AbstractC8488H2.m9140a();
        this.f32350r0.f27434h = enumC8993g;
        m11194a();
        AbstractC8488H2.m9140a();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i10) {
        this.f32349q0.setBackgroundColor(i10);
    }

    public void setScreenFlashWindow(Window window) {
        AbstractC8488H2.m9140a();
        this.f32349q0.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
