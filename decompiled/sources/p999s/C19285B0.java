package p999s;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Method;
import p571X9.AbstractC9106B3;
import p880m.AbstractC17123a;
import p976r.InterfaceC18800B;

/* JADX INFO: renamed from: s.B0 */
/* JADX INFO: loaded from: classes.dex */
public class C19285B0 implements InterfaceC18800B {

    /* JADX INFO: renamed from: M0 */
    public static final Method f61092M0;

    /* JADX INFO: renamed from: N0 */
    public static final Method f61093N0;

    /* JADX INFO: renamed from: O0 */
    public static final Method f61094O0;

    /* JADX INFO: renamed from: A0 */
    public View f61095A0;

    /* JADX INFO: renamed from: B0 */
    public AdapterView.OnItemClickListener f61096B0;

    /* JADX INFO: renamed from: C0 */
    public AdapterView.OnItemSelectedListener f61097C0;

    /* JADX INFO: renamed from: H0 */
    public final Handler f61102H0;

    /* JADX INFO: renamed from: J0 */
    public Rect f61104J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f61105K0;

    /* JADX INFO: renamed from: L0 */
    public final C19386x f61106L0;

    /* JADX INFO: renamed from: Y */
    public final Context f61107Y;

    /* JADX INFO: renamed from: Z */
    public ListAdapter f61108Z;

    /* JADX INFO: renamed from: o0 */
    public C19369o0 f61109o0;

    /* JADX INFO: renamed from: r0 */
    public int f61112r0;

    /* JADX INFO: renamed from: s0 */
    public int f61113s0;

    /* JADX INFO: renamed from: u0 */
    public boolean f61115u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f61116v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f61117w0;

    /* JADX INFO: renamed from: z0 */
    public C19389y0 f61120z0;

    /* JADX INFO: renamed from: p0 */
    public final int f61110p0 = -2;

    /* JADX INFO: renamed from: q0 */
    public int f61111q0 = -2;

    /* JADX INFO: renamed from: t0 */
    public final int f61114t0 = 1002;

    /* JADX INFO: renamed from: x0 */
    public int f61118x0 = 0;

    /* JADX INFO: renamed from: y0 */
    public final int f61119y0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: D0 */
    public final RunnableC19387x0 f61098D0 = new RunnableC19387x0(this, 1);

    /* JADX INFO: renamed from: E0 */
    public final ViewOnTouchListenerC19283A0 f61099E0 = new ViewOnTouchListenerC19283A0(this);

    /* JADX INFO: renamed from: F0 */
    public final C19391z0 f61100F0 = new C19391z0(this);

    /* JADX INFO: renamed from: G0 */
    public final RunnableC19387x0 f61101G0 = new RunnableC19387x0(this, 0);

    /* JADX INFO: renamed from: I0 */
    public final Rect f61103I0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f61092M0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f61094O0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f61093N0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C19285B0(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        this.f61107Y = context;
        this.f61102H0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC17123a.f54746o, i10, 0);
        this.f61112r0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f61113s0 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f61115u0 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C19386x c19386x = new C19386x(context, attributeSet, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC17123a.f54750s, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c19386x.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c19386x.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC9106B3.m9636b(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f61106L0 = c19386x;
        c19386x.setInputMethodMode(1);
    }

    @Override // p976r.InterfaceC18800B
    /* JADX INFO: renamed from: a */
    public final boolean mo20082a() {
        return this.f61106L0.isShowing();
    }

    /* JADX INFO: renamed from: b */
    public final int m20348b() {
        return this.f61112r0;
    }

    /* JADX INFO: renamed from: c */
    public final void m20349c(int i10) {
        this.f61112r0 = i10;
    }

    @Override // p976r.InterfaceC18800B
    public final void dismiss() {
        C19386x c19386x = this.f61106L0;
        c19386x.dismiss();
        c19386x.setContentView(null);
        this.f61109o0 = null;
        this.f61102H0.removeCallbacks(this.f61098D0);
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m20350e() {
        return this.f61106L0.getBackground();
    }

    @Override // p976r.InterfaceC18800B
    /* JADX INFO: renamed from: f */
    public final void mo20083f() {
        int i10;
        int iM20485a;
        int iMakeMeasureSpec;
        int paddingBottom;
        C19369o0 c19369o0;
        C19369o0 c19369o1 = this.f61109o0;
        C19386x c19386x = this.f61106L0;
        Context context = this.f61107Y;
        if (c19369o1 == null) {
            C19369o0 c19369o0Mo20355o = mo20355o(context, !this.f61105K0);
            this.f61109o0 = c19369o0Mo20355o;
            c19369o0Mo20355o.setAdapter(this.f61108Z);
            this.f61109o0.setOnItemClickListener(this.f61096B0);
            this.f61109o0.setFocusable(true);
            this.f61109o0.setFocusableInTouchMode(true);
            this.f61109o0.setOnItemSelectedListener(new C19381u0(this));
            this.f61109o0.setOnScrollListener(this.f61100F0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f61097C0;
            if (onItemSelectedListener != null) {
                this.f61109o0.setOnItemSelectedListener(onItemSelectedListener);
            }
            c19386x.setContentView(this.f61109o0);
        }
        Drawable background = c19386x.getBackground();
        Rect rect = this.f61103I0;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.f61115u0) {
                this.f61113s0 = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        boolean z6 = c19386x.getInputMethodMode() == 2;
        View view = this.f61095A0;
        int i12 = this.f61113s0;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f61093N0;
            if (method != null) {
                try {
                    iM20485a = ((Integer) method.invoke(c19386x, view, Integer.valueOf(i12), Boolean.valueOf(z6))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iM20485a = c19386x.getMaxAvailableHeight(view, i12);
                }
            } else {
                iM20485a = c19386x.getMaxAvailableHeight(view, i12);
            }
        } else {
            iM20485a = AbstractC19383v0.m20485a(c19386x, view, i12, z6);
        }
        int i13 = this.f61110p0;
        if (i13 == -1) {
            paddingBottom = iM20485a + i10;
        } else {
            int i14 = this.f61111q0;
            if (i14 != -2) {
                iMakeMeasureSpec = i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iM20471a = this.f61109o0.m20471a(iMakeMeasureSpec, iM20485a);
            paddingBottom = iM20471a + (iM20471a > 0 ? this.f61109o0.getPaddingBottom() + this.f61109o0.getPaddingTop() + i10 : 0);
        }
        boolean z10 = this.f61106L0.getInputMethodMode() == 2;
        c19386x.setWindowLayoutType(this.f61114t0);
        if (c19386x.isShowing()) {
            if (this.f61095A0.isAttachedToWindow()) {
                int width = this.f61111q0;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f61095A0.getWidth();
                }
                if (i13 == -1) {
                    i13 = z10 ? paddingBottom : -1;
                    if (z10) {
                        c19386x.setWidth(this.f61111q0 == -1 ? -1 : 0);
                        c19386x.setHeight(0);
                    } else {
                        c19386x.setWidth(this.f61111q0 == -1 ? -1 : 0);
                        c19386x.setHeight(-1);
                    }
                } else if (i13 == -2) {
                    i13 = paddingBottom;
                }
                c19386x.setOutsideTouchable(true);
                c19386x.update(this.f61095A0, this.f61112r0, this.f61113s0, width < 0 ? -1 : width, i13 < 0 ? -1 : i13);
                return;
            }
            return;
        }
        int width2 = this.f61111q0;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f61095A0.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = paddingBottom;
        }
        c19386x.setWidth(width2);
        c19386x.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f61092M0;
            if (method2 != null) {
                try {
                    method2.invoke(c19386x, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC19385w0.m20487b(c19386x, true);
        }
        c19386x.setOutsideTouchable(true);
        c19386x.setTouchInterceptor(this.f61099E0);
        if (this.f61117w0) {
            c19386x.setOverlapAnchor(this.f61116v0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f61094O0;
            if (method3 != null) {
                try {
                    method3.invoke(c19386x, this.f61104J0);
                } catch (Exception e10) {
                    AbstractC15256t.m16466d("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            AbstractC19385w0.m20486a(c19386x, this.f61104J0);
        }
        c19386x.showAsDropDown(this.f61095A0, this.f61112r0, this.f61113s0, this.f61118x0);
        this.f61109o0.setSelection(-1);
        if ((!this.f61105K0 || this.f61109o0.isInTouchMode()) && (c19369o0 = this.f61109o0) != null) {
            c19369o0.setListSelectionHidden(true);
            c19369o0.requestLayout();
        }
        if (this.f61105K0) {
            return;
        }
        this.f61102H0.post(this.f61101G0);
    }

    /* JADX INFO: renamed from: h */
    public final void m20351h(Drawable drawable) {
        this.f61106L0.setBackgroundDrawable(drawable);
    }

    @Override // p976r.InterfaceC18800B
    /* JADX INFO: renamed from: i */
    public final C19369o0 mo20084i() {
        return this.f61109o0;
    }

    /* JADX INFO: renamed from: j */
    public final void m20352j(int i10) {
        this.f61113s0 = i10;
        this.f61115u0 = true;
    }

    /* JADX INFO: renamed from: m */
    public final int m20353m() {
        if (this.f61115u0) {
            return this.f61113s0;
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public void mo20354n(ListAdapter listAdapter) {
        C19389y0 c19389y0 = this.f61120z0;
        if (c19389y0 == null) {
            this.f61120z0 = new C19389y0(this);
        } else {
            ListAdapter listAdapter2 = this.f61108Z;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c19389y0);
            }
        }
        this.f61108Z = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f61120z0);
        }
        C19369o0 c19369o0 = this.f61109o0;
        if (c19369o0 != null) {
            c19369o0.setAdapter(this.f61108Z);
        }
    }

    /* JADX INFO: renamed from: o */
    public C19369o0 mo20355o(Context context, boolean z6) {
        return new C19369o0(context, z6);
    }

    /* JADX INFO: renamed from: p */
    public final void m20356p(int i10) {
        Drawable background = this.f61106L0.getBackground();
        if (background == null) {
            this.f61111q0 = i10;
            return;
        }
        Rect rect = this.f61103I0;
        background.getPadding(rect);
        this.f61111q0 = rect.left + rect.right + i10;
    }
}
