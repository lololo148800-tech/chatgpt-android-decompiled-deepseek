package p520V5;

import android.animation.Animator;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p003A1.C0284r0;
import p117Eb.C2392v;
import p197Hj.C3455a;
import p540W5.C8430a;
import p614Z5.C10166a;
import p640a6.C10510e;
import p640a6.C10513h;
import p640a6.InterfaceC10511f;
import p660b6.C11252d;
import p698d6.C13030c;
import p698d6.C13032e;
import p742f6.AbstractC13565q;
import p779h6.AbstractC14413b;
import p779h6.AbstractC14417f;
import p779h6.AbstractC14418g;
import p779h6.ChoreographerFrameCallbackC14415d;
import p779h6.ThreadFactoryC14414c;
import p960q9.C18655i;

/* JADX INFO: renamed from: V5.w */
/* JADX INFO: loaded from: classes.dex */
public final class C7794w extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: d1 */
    public static final boolean f24631d1;

    /* JADX INFO: renamed from: e1 */
    public static final List f24632e1;

    /* JADX INFO: renamed from: f1 */
    public static final ThreadPoolExecutor f24633f1;

    /* JADX INFO: renamed from: A0 */
    public C13030c f24634A0;

    /* JADX INFO: renamed from: B0 */
    public int f24635B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f24636C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f24637D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f24638E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f24639F0;

    /* JADX INFO: renamed from: G0 */
    public EnumC7769G f24640G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f24641H0;

    /* JADX INFO: renamed from: I0 */
    public final Matrix f24642I0;

    /* JADX INFO: renamed from: J0 */
    public Bitmap f24643J0;

    /* JADX INFO: renamed from: K0 */
    public Canvas f24644K0;

    /* JADX INFO: renamed from: L0 */
    public Rect f24645L0;

    /* JADX INFO: renamed from: M0 */
    public RectF f24646M0;

    /* JADX INFO: renamed from: N0 */
    public C8430a f24647N0;

    /* JADX INFO: renamed from: O0 */
    public Rect f24648O0;

    /* JADX INFO: renamed from: P0 */
    public Rect f24649P0;

    /* JADX INFO: renamed from: Q0 */
    public RectF f24650Q0;

    /* JADX INFO: renamed from: R0 */
    public RectF f24651R0;

    /* JADX INFO: renamed from: S0 */
    public Matrix f24652S0;

    /* JADX INFO: renamed from: T0 */
    public Matrix f24653T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f24654U0;

    /* JADX INFO: renamed from: V0 */
    public EnumC7772a f24655V0;

    /* JADX INFO: renamed from: W0 */
    public final C3455a f24656W0;

    /* JADX INFO: renamed from: X0 */
    public final Semaphore f24657X0;

    /* JADX INFO: renamed from: Y */
    public C7781j f24658Y;

    /* JADX INFO: renamed from: Y0 */
    public Handler f24659Y0;

    /* JADX INFO: renamed from: Z */
    public final ChoreographerFrameCallbackC14415d f24660Z;

    /* JADX INFO: renamed from: Z0 */
    public RunnableC7791t f24661Z0;

    /* JADX INFO: renamed from: a1 */
    public final RunnableC7791t f24662a1;

    /* JADX INFO: renamed from: b1 */
    public float f24663b1;

    /* JADX INFO: renamed from: c1 */
    public int f24664c1;

    /* JADX INFO: renamed from: o0 */
    public final boolean f24665o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f24666p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f24667q0;

    /* JADX INFO: renamed from: r0 */
    public final ArrayList f24668r0;

    /* JADX INFO: renamed from: s0 */
    public C10166a f24669s0;

    /* JADX INFO: renamed from: t0 */
    public String f24670t0;

    /* JADX INFO: renamed from: u0 */
    public C2392v f24671u0;

    /* JADX INFO: renamed from: v0 */
    public Map f24672v0;

    /* JADX INFO: renamed from: w0 */
    public String f24673w0;

    /* JADX INFO: renamed from: x0 */
    public final C18655i f24674x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f24675y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f24676z0;

    static {
        f24631d1 = Build.VERSION.SDK_INT <= 25;
        f24632e1 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f24633f1 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC14414c());
    }

    public C7794w() {
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = new ChoreographerFrameCallbackC14415d();
        this.f24660Z = choreographerFrameCallbackC14415d;
        this.f24665o0 = true;
        this.f24666p0 = false;
        this.f24667q0 = false;
        this.f24664c1 = 1;
        this.f24668r0 = new ArrayList();
        this.f24674x0 = new C18655i(19);
        this.f24675y0 = false;
        this.f24676z0 = true;
        this.f24635B0 = 255;
        this.f24639F0 = false;
        this.f24640G0 = EnumC7769G.f24552Y;
        this.f24641H0 = false;
        this.f24642I0 = new Matrix();
        this.f24654U0 = false;
        C3455a c3455a = new C3455a(this, 2);
        this.f24656W0 = c3455a;
        this.f24657X0 = new Semaphore(1);
        this.f24662a1 = new RunnableC7791t(this, 1);
        this.f24663b1 = -3.4028235E38f;
        choreographerFrameCallbackC14415d.addUpdateListener(c3455a);
    }

    /* JADX INFO: renamed from: f */
    public static void m8053f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: a */
    public final void m8054a(final C10510e c10510e, final Object obj, final C15384c c15384c) {
        C13030c c13030c = this.f24634A0;
        if (c13030c == null) {
            this.f24668r0.add(new InterfaceC7793v() { // from class: V5.q
                @Override // p520V5.InterfaceC7793v
                public final void run() {
                    this.f24617a.m8054a(c10510e, obj, c15384c);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (c10510e == C10510e.f31150c) {
            c13030c.mo9614f(c15384c, obj);
        } else {
            InterfaceC10511f interfaceC10511f = c10510e.f31152b;
            if (interfaceC10511f != null) {
                interfaceC10511f.mo9614f(c15384c, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f24634A0.mo9615g(c10510e, 0, arrayList, new C10510e(new String[0]));
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((C10510e) arrayList.get(i10)).f31152b.mo9614f(c15384c, obj);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == InterfaceC7763A.f24538z) {
                m8072t(this.f24660Z.m15915a());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8055b(Context context) {
        if (this.f24666p0) {
            return true;
        }
        if (this.f24665o0) {
            if (context == null) {
                return true;
            }
            C0284r0 c0284r0 = AbstractC14418g.f45308a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m8056c() {
        C7781j c7781j = this.f24658Y;
        if (c7781j == null) {
            return;
        }
        C15384c c15384c = AbstractC13565q.f42911a;
        Rect rect = c7781j.f24590k;
        C13030c c13030c = new C13030c(this, new C13032e(Collections.emptyList(), c7781j, "__container", -1L, 1, -1L, null, Collections.emptyList(), new C11252d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null, 1), c7781j.f24589j, c7781j);
        this.f24634A0 = c13030c;
        if (this.f24637D0) {
            c13030c.mo14782r(true);
        }
        this.f24634A0.f41367J = this.f24676z0;
    }

    /* JADX INFO: renamed from: d */
    public final void m8057d() {
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = this.f24660Z;
        if (choreographerFrameCallbackC14415d.f45304y0) {
            choreographerFrameCallbackC14415d.cancel();
            if (!isVisible()) {
                this.f24664c1 = 1;
            }
        }
        this.f24658Y = null;
        this.f24634A0 = null;
        this.f24669s0 = null;
        this.f24663b1 = -3.4028235E38f;
        choreographerFrameCallbackC14415d.f45303x0 = null;
        choreographerFrameCallbackC14415d.f45301v0 = -2.1474836E9f;
        choreographerFrameCallbackC14415d.f45302w0 = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7781j c7781j;
        C13030c c13030c = this.f24634A0;
        if (c13030c == null) {
            return;
        }
        EnumC7772a enumC7772a = this.f24655V0;
        if (enumC7772a == null) {
            enumC7772a = EnumC7772a.f24556Y;
        }
        boolean z6 = enumC7772a == EnumC7772a.f24557Z;
        ThreadPoolExecutor threadPoolExecutor = f24633f1;
        Semaphore semaphore = this.f24657X0;
        RunnableC7791t runnableC7791t = this.f24662a1;
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = this.f24660Z;
        if (z6) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z6) {
                    return;
                }
                semaphore.release();
                if (c13030c.f41366I == choreographerFrameCallbackC14415d.m15915a()) {
                    return;
                }
            } catch (Throwable th2) {
                if (z6) {
                    semaphore.release();
                    if (c13030c.f41366I != choreographerFrameCallbackC14415d.m15915a()) {
                        threadPoolExecutor.execute(runnableC7791t);
                    }
                }
                throw th2;
            }
        }
        if (z6 && (c7781j = this.f24658Y) != null) {
            float f10 = this.f24663b1;
            float fM15915a = choreographerFrameCallbackC14415d.m15915a();
            this.f24663b1 = fM15915a;
            if (Math.abs(fM15915a - f10) * c7781j.m8040b() >= 50.0f) {
                m8072t(choreographerFrameCallbackC14415d.m15915a());
            }
        }
        if (this.f24667q0) {
            try {
                if (this.f24641H0) {
                    m8064l(canvas, c13030c);
                } else {
                    m8059g(canvas);
                }
            } catch (Throwable unused2) {
                AbstractC14413b.f45287a.getClass();
            }
        } else if (this.f24641H0) {
            m8064l(canvas, c13030c);
        } else {
            m8059g(canvas);
        }
        this.f24654U0 = false;
        if (z6) {
            semaphore.release();
            if (c13030c.f41366I == choreographerFrameCallbackC14415d.m15915a()) {
                return;
            }
            threadPoolExecutor.execute(runnableC7791t);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8058e() {
        C7781j c7781j = this.f24658Y;
        if (c7781j == null) {
            return;
        }
        EnumC7769G enumC7769G = this.f24640G0;
        int i10 = Build.VERSION.SDK_INT;
        boolean z6 = c7781j.f24594o;
        int i11 = c7781j.f24595p;
        int iOrdinal = enumC7769G.ordinal();
        boolean z10 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z6 && i10 < 28) || i11 > 4 || i10 <= 25))) {
            z10 = true;
        }
        this.f24641H0 = z10;
    }

    /* JADX INFO: renamed from: g */
    public final void m8059g(Canvas canvas) {
        C13030c c13030c = this.f24634A0;
        C7781j c7781j = this.f24658Y;
        if (c13030c == null || c7781j == null) {
            return;
        }
        Matrix matrix = this.f24642I0;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            matrix.preScale(bounds.width() / c7781j.f24590k.width(), bounds.height() / c7781j.f24590k.height());
            matrix.preTranslate(bounds.left, bounds.top);
        }
        c13030c.mo9613e(canvas, matrix, this.f24635B0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f24635B0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C7781j c7781j = this.f24658Y;
        if (c7781j == null) {
            return -1;
        }
        return c7781j.f24590k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C7781j c7781j = this.f24658Y;
        if (c7781j == null) {
            return -1;
        }
        return c7781j.f24590k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final Context m8060h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final C2392v m8061i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f24671u0 == null) {
            C2392v c2392v = new C2392v(getCallback());
            this.f24671u0 = c2392v;
            String str = this.f24673w0;
            if (str != null) {
                c2392v.f7437o0 = str;
            }
        }
        return this.f24671u0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f24654U0) {
            return;
        }
        this.f24654U0 = true;
        if ((!f24631d1 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = this.f24660Z;
        if (choreographerFrameCallbackC14415d == null) {
            return false;
        }
        return choreographerFrameCallbackC14415d.f45304y0;
    }

    /* JADX INFO: renamed from: j */
    public final void m8062j() {
        this.f24668r0.clear();
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = this.f24660Z;
        choreographerFrameCallbackC14415d.m15921g(true);
        Iterator it = choreographerFrameCallbackC14415d.f45294o0.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC14415d);
        }
        if (isVisible()) {
            return;
        }
        this.f24664c1 = 1;
    }

    /* JADX INFO: renamed from: k */
    public final void m8063k() {
        if (this.f24634A0 == null) {
            this.f24668r0.add(new C7792u(this, 1));
            return;
        }
        m8058e();
        boolean zM8055b = m8055b(m8060h());
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = this.f24660Z;
        if (zM8055b || choreographerFrameCallbackC14415d.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC14415d.f45304y0 = true;
                boolean zM15918d = choreographerFrameCallbackC14415d.m15918d();
                for (Animator.AnimatorListener animatorListener : choreographerFrameCallbackC14415d.f45293Z) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC14415d, zM15918d);
                    } else {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC14415d);
                    }
                }
                choreographerFrameCallbackC14415d.m15922h((int) (choreographerFrameCallbackC14415d.m15918d() ? choreographerFrameCallbackC14415d.m15916b() : choreographerFrameCallbackC14415d.m15917c()));
                choreographerFrameCallbackC14415d.f45297r0 = 0L;
                choreographerFrameCallbackC14415d.f45300u0 = 0;
                if (choreographerFrameCallbackC14415d.f45304y0) {
                    choreographerFrameCallbackC14415d.m15921g(false);
                    Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC14415d);
                }
                this.f24664c1 = 1;
            } else {
                this.f24664c1 = 2;
            }
        }
        if (m8055b(m8060h())) {
            return;
        }
        Iterator it = f24632e1.iterator();
        C10513h c10513hM8042d = null;
        while (it.hasNext()) {
            c10513hM8042d = this.f24658Y.m8042d((String) it.next());
            if (c10513hM8042d != null) {
                break;
            }
        }
        if (c10513hM8042d != null) {
            m8066n((int) c10513hM8042d.f31156b);
        } else {
            m8066n((int) (choreographerFrameCallbackC14415d.f45295p0 < 0.0f ? choreographerFrameCallbackC14415d.m15917c() : choreographerFrameCallbackC14415d.m15916b()));
        }
        choreographerFrameCallbackC14415d.m15921g(true);
        choreographerFrameCallbackC14415d.m15919e(choreographerFrameCallbackC14415d.m15918d());
        if (isVisible()) {
            return;
        }
        this.f24664c1 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d5  */
    /* JADX INFO: renamed from: l */
    public final void m8064l(Canvas canvas, C13030c c13030c) {
        boolean z6;
        if (this.f24658Y == null || c13030c == null) {
            return;
        }
        if (this.f24644K0 == null) {
            this.f24644K0 = new Canvas();
            this.f24651R0 = new RectF();
            this.f24652S0 = new Matrix();
            this.f24653T0 = new Matrix();
            this.f24645L0 = new Rect();
            this.f24646M0 = new RectF();
            this.f24647N0 = new C8430a();
            this.f24648O0 = new Rect();
            this.f24649P0 = new Rect();
            this.f24650Q0 = new RectF();
        }
        canvas.getMatrix(this.f24652S0);
        canvas.getClipBounds(this.f24645L0);
        Rect rect = this.f24645L0;
        this.f24646M0.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f24652S0.mapRect(this.f24646M0);
        m8053f(this.f24645L0, this.f24646M0);
        if (this.f24676z0) {
            this.f24651R0.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c13030c.mo9612c(this.f24651R0, null, false);
        }
        this.f24652S0.mapRect(this.f24651R0);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.f24651R0;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z6 = !((ViewGroup) parent).getClipChildren();
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        if (!z6) {
            RectF rectF2 = this.f24651R0;
            Rect rect2 = this.f24645L0;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.f24651R0.width());
        int iCeil2 = (int) Math.ceil(this.f24651R0.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        Bitmap bitmap = this.f24643J0;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.f24643J0.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.f24643J0 = bitmapCreateBitmap;
            this.f24644K0.setBitmap(bitmapCreateBitmap);
            this.f24654U0 = true;
        } else if (this.f24643J0.getWidth() > iCeil || this.f24643J0.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f24643J0, 0, 0, iCeil, iCeil2);
            this.f24643J0 = bitmapCreateBitmap2;
            this.f24644K0.setBitmap(bitmapCreateBitmap2);
            this.f24654U0 = true;
        }
        if (this.f24654U0) {
            Matrix matrix = this.f24642I0;
            matrix.set(this.f24652S0);
            matrix.preScale(fWidth, fHeight);
            RectF rectF3 = this.f24651R0;
            matrix.postTranslate(-rectF3.left, -rectF3.top);
            this.f24643J0.eraseColor(0);
            c13030c.mo9613e(this.f24644K0, matrix, this.f24635B0);
            this.f24652S0.invert(this.f24653T0);
            this.f24653T0.mapRect(this.f24650Q0, this.f24651R0);
            m8053f(this.f24649P0, this.f24650Q0);
        }
        this.f24648O0.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f24643J0, this.f24648O0, this.f24649P0, this.f24647N0);
    }

    /* JADX INFO: renamed from: m */
    public final void m8065m() {
        if (this.f24634A0 == null) {
            this.f24668r0.add(new C7792u(this, 0));
            return;
        }
        m8058e();
        boolean zM8055b = m8055b(m8060h());
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = this.f24660Z;
        if (zM8055b || choreographerFrameCallbackC14415d.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC14415d.f45304y0 = true;
                choreographerFrameCallbackC14415d.m15921g(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC14415d);
                choreographerFrameCallbackC14415d.f45297r0 = 0L;
                if (choreographerFrameCallbackC14415d.m15918d() && choreographerFrameCallbackC14415d.f45299t0 == choreographerFrameCallbackC14415d.m15917c()) {
                    choreographerFrameCallbackC14415d.m15922h(choreographerFrameCallbackC14415d.m15916b());
                } else if (!choreographerFrameCallbackC14415d.m15918d() && choreographerFrameCallbackC14415d.f45299t0 == choreographerFrameCallbackC14415d.m15916b()) {
                    choreographerFrameCallbackC14415d.m15922h(choreographerFrameCallbackC14415d.m15917c());
                }
                Iterator it = choreographerFrameCallbackC14415d.f45294o0.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(choreographerFrameCallbackC14415d);
                }
                this.f24664c1 = 1;
            } else {
                this.f24664c1 = 3;
            }
        }
        if (m8055b(m8060h())) {
            return;
        }
        m8066n((int) (choreographerFrameCallbackC14415d.f45295p0 < 0.0f ? choreographerFrameCallbackC14415d.m15917c() : choreographerFrameCallbackC14415d.m15916b()));
        choreographerFrameCallbackC14415d.m15921g(true);
        choreographerFrameCallbackC14415d.m15919e(choreographerFrameCallbackC14415d.m15918d());
        if (isVisible()) {
            return;
        }
        this.f24664c1 = 1;
    }

    /* JADX INFO: renamed from: n */
    public final void m8066n(int i10) {
        if (this.f24658Y == null) {
            this.f24668r0.add(new C7787p(this, i10, 2));
        } else {
            this.f24660Z.m15922h(i10);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m8067o(int i10) {
        if (this.f24658Y == null) {
            this.f24668r0.add(new C7787p(this, i10, 0));
            return;
        }
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = this.f24660Z;
        choreographerFrameCallbackC14415d.m15923i(choreographerFrameCallbackC14415d.f45301v0, i10 + 0.99f);
    }

    /* JADX INFO: renamed from: p */
    public final void m8068p(String str) {
        C7781j c7781j = this.f24658Y;
        if (c7781j == null) {
            this.f24668r0.add(new C7786o(this, str, 1));
            return;
        }
        C10513h c10513hM8042d = c7781j.m8042d(str);
        if (c10513hM8042d == null) {
            throw new IllegalArgumentException(AbstractC10763a.m11054l("Cannot find marker with name ", str, Separators.DOT));
        }
        m8067o((int) (c10513hM8042d.f31156b + c10513hM8042d.f31157c));
    }

    /* JADX INFO: renamed from: q */
    public final void m8069q(String str) {
        C7781j c7781j = this.f24658Y;
        ArrayList arrayList = this.f24668r0;
        if (c7781j == null) {
            arrayList.add(new C7786o(this, str, 0));
            return;
        }
        C10513h c10513hM8042d = c7781j.m8042d(str);
        if (c10513hM8042d == null) {
            throw new IllegalArgumentException(AbstractC10763a.m11054l("Cannot find marker with name ", str, Separators.DOT));
        }
        int i10 = (int) c10513hM8042d.f31156b;
        int i11 = ((int) c10513hM8042d.f31157c) + i10;
        if (this.f24658Y == null) {
            arrayList.add(new C7790s(this, i10, i11));
        } else {
            this.f24660Z.m15923i(i10, i11 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8070r(int i10) {
        if (this.f24658Y == null) {
            this.f24668r0.add(new C7787p(this, i10, 1));
        } else {
            ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = this.f24660Z;
            choreographerFrameCallbackC14415d.m15923i(i10, (int) choreographerFrameCallbackC14415d.f45302w0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m8071s(String str) {
        C7781j c7781j = this.f24658Y;
        if (c7781j == null) {
            this.f24668r0.add(new C7786o(this, str, 2));
            return;
        }
        C10513h c10513hM8042d = c7781j.m8042d(str);
        if (c10513hM8042d == null) {
            throw new IllegalArgumentException(AbstractC10763a.m11054l("Cannot find marker with name ", str, Separators.DOT));
        }
        m8070r((int) c10513hM8042d.f31156b);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f24635B0 = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC14413b.m15913b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z6, z10);
        if (z6) {
            int i10 = this.f24664c1;
            if (i10 == 2) {
                m8063k();
            } else if (i10 == 3) {
                m8065m();
            }
        } else if (this.f24660Z.f45304y0) {
            m8062j();
            this.f24664c1 = 3;
        } else if (zIsVisible) {
            this.f24664c1 = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m8063k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f24668r0.clear();
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = this.f24660Z;
        choreographerFrameCallbackC14415d.m15921g(true);
        choreographerFrameCallbackC14415d.m15919e(choreographerFrameCallbackC14415d.m15918d());
        if (isVisible()) {
            return;
        }
        this.f24664c1 = 1;
    }

    /* JADX INFO: renamed from: t */
    public final void m8072t(float f10) {
        C7781j c7781j = this.f24658Y;
        if (c7781j == null) {
            this.f24668r0.add(new C7789r(this, f10, 2));
        } else {
            this.f24660Z.m15922h(AbstractC14417f.m15928e(c7781j.f24591l, c7781j.f24592m, f10));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
