package p999s;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p030B2.AbstractC0739U;
import p030B2.AbstractC0761i;

/* JADX INFO: renamed from: s.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLongClickListenerC19338b1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w0 */
    public static ViewOnLongClickListenerC19338b1 f61242w0;

    /* JADX INFO: renamed from: x0 */
    public static ViewOnLongClickListenerC19338b1 f61243x0;

    /* JADX INFO: renamed from: Y */
    public final View f61244Y;

    /* JADX INFO: renamed from: Z */
    public final CharSequence f61245Z;

    /* JADX INFO: renamed from: o0 */
    public final int f61246o0;

    /* JADX INFO: renamed from: p0 */
    public final RunnableC19335a1 f61247p0;

    /* JADX INFO: renamed from: q0 */
    public final RunnableC19335a1 f61248q0;

    /* JADX INFO: renamed from: r0 */
    public int f61249r0;

    /* JADX INFO: renamed from: s0 */
    public int f61250s0;

    /* JADX INFO: renamed from: t0 */
    public C19341c1 f61251t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f61252u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f61253v0;

    /* JADX WARN: Type inference failed for: r0v0, types: [s.a1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [s.a1] */
    public ViewOnLongClickListenerC19338b1(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.f61247p0 = new Runnable(this) { // from class: s.a1

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ ViewOnLongClickListenerC19338b1 f61241Z;

            {
                this.f61241Z = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f61241Z.m20437c(false);
                        break;
                    default:
                        this.f61241Z.m20436a();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f61248q0 = new Runnable(this) { // from class: s.a1

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ ViewOnLongClickListenerC19338b1 f61241Z;

            {
                this.f61241Z = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f61241Z.m20437c(false);
                        break;
                    default:
                        this.f61241Z.m20436a();
                        break;
                }
            }
        };
        this.f61244Y = view;
        this.f61245Z = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0739U.f2102a;
        this.f61246o0 = Build.VERSION.SDK_INT >= 28 ? AbstractC0761i.m1679k(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f61253v0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: b */
    public static void m20435b(ViewOnLongClickListenerC19338b1 viewOnLongClickListenerC19338b1) {
        ViewOnLongClickListenerC19338b1 viewOnLongClickListenerC19338b2 = f61242w0;
        if (viewOnLongClickListenerC19338b2 != null) {
            viewOnLongClickListenerC19338b2.f61244Y.removeCallbacks(viewOnLongClickListenerC19338b2.f61247p0);
        }
        f61242w0 = viewOnLongClickListenerC19338b1;
        if (viewOnLongClickListenerC19338b1 != null) {
            viewOnLongClickListenerC19338b1.f61244Y.postDelayed(viewOnLongClickListenerC19338b1.f61247p0, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20436a() {
        ViewOnLongClickListenerC19338b1 viewOnLongClickListenerC19338b1 = f61243x0;
        View view = this.f61244Y;
        if (viewOnLongClickListenerC19338b1 == this) {
            f61243x0 = null;
            C19341c1 c19341c1 = this.f61251t0;
            if (c19341c1 != null) {
                View view2 = (View) c19341c1.f61255Z;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c19341c1.f61254Y).getSystemService("window")).removeView(view2);
                }
                this.f61251t0 = null;
                this.f61253v0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                AbstractC15256t.m16465c("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f61242w0 == this) {
            m20435b(null);
        }
        view.removeCallbacks(this.f61248q0);
    }

    /* JADX INFO: renamed from: c */
    public final void m20437c(boolean z6) {
        int height;
        int i10;
        int i11;
        long longPressTimeout;
        long j10;
        long j11;
        View view = this.f61244Y;
        if (view.isAttachedToWindow()) {
            m20435b(null);
            ViewOnLongClickListenerC19338b1 viewOnLongClickListenerC19338b1 = f61243x0;
            if (viewOnLongClickListenerC19338b1 != null) {
                viewOnLongClickListenerC19338b1.m20436a();
            }
            f61243x0 = this;
            this.f61252u0 = z6;
            Context context = view.getContext();
            C19341c1 c19341c1 = new C19341c1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            c19341c1.f61257p0 = layoutParams;
            c19341c1.f61258q0 = new Rect();
            c19341c1.f61259r0 = new int[2];
            c19341c1.f61260s0 = new int[2];
            c19341c1.f61254Y = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            c19341c1.f61255Z = viewInflate;
            c19341c1.f61256o0 = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(C19341c1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f61251t0 = c19341c1;
            int width = this.f61249r0;
            int i12 = this.f61250s0;
            boolean z10 = this.f61252u0;
            View view2 = (View) c19341c1.f61255Z;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) c19341c1.f61254Y;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) c19341c1.f61256o0).setText(this.f61245Z);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) c19341c1.f61257p0;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i10 = i12 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i10 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z10 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                AbstractC15256t.m16465c("TooltipPopup", "Cannot find app view");
            } else {
                Rect rect = (Rect) c19341c1.f61258q0;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i11 = 0;
                } else {
                    Resources resources = context2.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) c19341c1.f61260s0;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c19341c1.f61259r0;
                view.getLocationOnScreen(iArr2);
                int i13 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i13;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams2.x = (i13 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i14 = iArr2[1];
                int i15 = ((i10 + i14) - dimensionPixelOffset3) - measuredHeight;
                int i16 = i14 + height + dimensionPixelOffset3;
                if (z10) {
                    if (i15 >= 0) {
                        layoutParams2.y = i15;
                    } else {
                        layoutParams2.y = i16;
                    }
                } else if (measuredHeight + i16 <= rect.height()) {
                    layoutParams2.y = i16;
                } else {
                    layoutParams2.y = i15;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f61252u0) {
                j11 = 2500;
            } else {
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            RunnableC19335a1 runnableC19335a1 = this.f61248q0;
            view.removeCallbacks(runnableC19335a1);
            view.postDelayed(runnableC19335a1, j11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f61251t0 != null && this.f61252u0) {
            return false;
        }
        View view2 = this.f61244Y;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f61253v0 = true;
                m20436a();
            }
        } else if (view2.isEnabled() && this.f61251t0 == null) {
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (this.f61253v0) {
                this.f61249r0 = x4;
                this.f61250s0 = y8;
                this.f61253v0 = false;
                m20435b(this);
            } else {
                int iAbs = Math.abs(x4 - this.f61249r0);
                int i10 = this.f61246o0;
                if (iAbs > i10 || Math.abs(y8 - this.f61250s0) > i10) {
                    this.f61249r0 = x4;
                    this.f61250s0 = y8;
                    this.f61253v0 = false;
                    m20435b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f61249r0 = view.getWidth() / 2;
        this.f61250s0 = view.getHeight() / 2;
        m20437c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m20436a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
