package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p030B2.C0750c0;
import p729ej.C13414e;
import p893n.LayoutInflaterFactory2C17390v;
import p976r.MenuC18814l;
import p999s.C19330Y0;
import p999s.C19345e;
import p999s.C19356i;
import p999s.InterfaceC19349f0;
import p999s.InterfaceC19352g0;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: o0 */
    public TypedValue f32249o0;

    /* JADX INFO: renamed from: p0 */
    public TypedValue f32250p0;

    /* JADX INFO: renamed from: q0 */
    public TypedValue f32251q0;

    /* JADX INFO: renamed from: r0 */
    public TypedValue f32252r0;

    /* JADX INFO: renamed from: s0 */
    public TypedValue f32253s0;

    /* JADX INFO: renamed from: t0 */
    public TypedValue f32254t0;

    /* JADX INFO: renamed from: u0 */
    public final Rect f32255u0;

    /* JADX INFO: renamed from: v0 */
    public InterfaceC19349f0 f32256v0;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f32255u0 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f32253s0 == null) {
            this.f32253s0 = new TypedValue();
        }
        return this.f32253s0;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f32254t0 == null) {
            this.f32254t0 = new TypedValue();
        }
        return this.f32254t0;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f32251q0 == null) {
            this.f32251q0 = new TypedValue();
        }
        return this.f32251q0;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f32252r0 == null) {
            this.f32252r0 = new TypedValue();
        }
        return this.f32252r0;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f32249o0 == null) {
            this.f32249o0 = new TypedValue();
        }
        return this.f32249o0;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f32250p0 == null) {
            this.f32250p0 = new TypedValue();
        }
        return this.f32250p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC19349f0 interfaceC19349f0 = this.f32256v0;
        if (interfaceC19349f0 != null) {
            interfaceC19349f0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C19356i c19356i;
        super.onDetachedFromWindow();
        InterfaceC19349f0 interfaceC19349f0 = this.f32256v0;
        if (interfaceC19349f0 != null) {
            LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) ((C13414e) interfaceC19349f0).f42490Y;
            InterfaceC19352g0 interfaceC19352g0 = layoutInflaterFactory2C17390v.f55529D0;
            if (interfaceC19352g0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC19352g0;
                actionBarOverlayLayout.m11144k();
                ActionMenuView actionMenuView = ((C19330Y0) actionBarOverlayLayout.f32226s0).f61223a.f32292o0;
                if (actionMenuView != null && (c19356i = actionMenuView.f32238H0) != null) {
                    c19356i.m20459f();
                    C19345e c19345e = c19356i.f61292F0;
                    if (c19345e != null && c19345e.m20143b()) {
                        c19345e.f59921i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C17390v.f55534I0 != null) {
                layoutInflaterFactory2C17390v.f55573x0.getDecorView().removeCallbacks(layoutInflaterFactory2C17390v.f55535J0);
                if (layoutInflaterFactory2C17390v.f55534I0.isShowing()) {
                    try {
                        layoutInflaterFactory2C17390v.f55534I0.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C17390v.f55534I0 = null;
            }
            C0750c0 c0750c0 = layoutInflaterFactory2C17390v.f55536K0;
            if (c0750c0 != null) {
                c0750c0.m1600b();
            }
            MenuC18814l menuC18814l = layoutInflaterFactory2C17390v.m19088D(0).f55514h;
            if (menuC18814l != null) {
                menuC18814l.m20122c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z6;
        int iMakeMeasureSpec2;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z10 = true;
        boolean z11 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.f32255u0;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i10;
            z6 = false;
        } else {
            TypedValue typedValue = z11 ? this.f32252r0 : this.f32251q0;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                iMakeMeasureSpec = i10;
                z6 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z6 = true;
                    } else {
                        iMakeMeasureSpec = i10;
                        z6 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z6 = true;
                } else {
                    iMakeMeasureSpec = i10;
                    z6 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i11;
        } else {
            TypedValue typedValue2 = z11 ? this.f32253s0 : this.f32254t0;
            if (typedValue2 == null || (i14 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i11;
            } else {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i11;
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i11;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z6 || mode != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            TypedValue typedValue3 = z11 ? this.f32250p0 : this.f32249o0;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z10 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        i13 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z10 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    i13 -= rect.left + rect.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z10 = false;
                }
            }
        }
        if (z10) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC19349f0 interfaceC19349f0) {
        this.f32256v0 = interfaceC19349f0;
    }
}
