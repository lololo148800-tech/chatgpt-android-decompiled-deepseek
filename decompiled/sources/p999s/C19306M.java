package p999s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.view.C10820c;
import p084D4.C1904b;
import p571X9.AbstractC9106B3;
import p658b5.C11242m;
import p880m.AbstractC17123a;
import p976r.ViewTreeObserverOnGlobalLayoutListenerC18806d;

/* JADX INFO: renamed from: s.M */
/* JADX INFO: loaded from: classes.dex */
public final class C19306M extends Spinner {

    /* JADX INFO: renamed from: w0 */
    public static final int[] f61169w0 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: o0 */
    public final C1904b f61170o0;

    /* JADX INFO: renamed from: p0 */
    public final Context f61171p0;

    /* JADX INFO: renamed from: q0 */
    public final C19290E f61172q0;

    /* JADX INFO: renamed from: r0 */
    public SpinnerAdapter f61173r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f61174s0;

    /* JADX INFO: renamed from: t0 */
    public final InterfaceC19304L f61175t0;

    /* JADX INFO: renamed from: u0 */
    public int f61176u0;

    /* JADX INFO: renamed from: v0 */
    public final Rect f61177v0;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public C19306M(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.openai.chatgpt.R.attr.spinnerStyle);
        this.f61177v0 = new Rect();
        AbstractC19311O0.m20394a(this, getContext());
        int[] iArr = AbstractC17123a.f54752u;
        C11242m c11242mM12599G = C11242m.m12599G(context, attributeSet, iArr, com.openai.chatgpt.R.attr.spinnerStyle);
        this.f61170o0 = new C1904b(this);
        TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f61171p0 = new C10820c(context, resourceId);
        } else {
            this.f61171p0 = context;
        }
        int i10 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f61169w0, com.openai.chatgpt.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i10 != 0) {
                        DialogInterfaceOnClickListenerC19294G dialogInterfaceOnClickListenerC19294G = new DialogInterfaceOnClickListenerC19294G(this);
                        this.f61175t0 = dialogInterfaceOnClickListenerC19294G;
                        dialogInterfaceOnClickListenerC19294G.f61136o0 = typedArray.getString(2);
                    } else if (i10 == 1) {
                        C19300J c19300j = new C19300J(this, this.f61171p0, attributeSet);
                        C11242m c11242mM12599G2 = C11242m.m12599G(this.f61171p0, attributeSet, iArr, com.openai.chatgpt.R.attr.spinnerStyle);
                        this.f61176u0 = ((TypedArray) c11242mM12599G2.f34019Z).getLayoutDimension(3, -2);
                        c19300j.m20351h(c11242mM12599G2.m12601B(1));
                        c19300j.f61145P0 = typedArray.getString(2);
                        c11242mM12599G2.m12606H();
                        this.f61175t0 = c19300j;
                        this.f61172q0 = new C19290E(this, this, c19300j);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.openai.chatgpt.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    c11242mM12599G.m12606H();
                    this.f61174s0 = true;
                    spinnerAdapter = this.f61173r0;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f61173r0 = null;
                    }
                    this.f61170o0.m3003k(attributeSet, com.openai.chatgpt.R.attr.spinnerStyle);
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th3) {
            th = th3;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i10 != 0) {
            DialogInterfaceOnClickListenerC19294G dialogInterfaceOnClickListenerC19294G2 = new DialogInterfaceOnClickListenerC19294G(this);
            this.f61175t0 = dialogInterfaceOnClickListenerC19294G2;
            dialogInterfaceOnClickListenerC19294G2.f61136o0 = typedArray.getString(2);
        } else if (i10 == 1) {
            C19300J c19300j2 = new C19300J(this, this.f61171p0, attributeSet);
            C11242m c11242mM12599G3 = C11242m.m12599G(this.f61171p0, attributeSet, iArr, com.openai.chatgpt.R.attr.spinnerStyle);
            this.f61176u0 = ((TypedArray) c11242mM12599G3.f34019Z).getLayoutDimension(3, -2);
            c19300j2.m20351h(c11242mM12599G3.m12601B(1));
            c19300j2.f61145P0 = typedArray.getString(2);
            c11242mM12599G3.m12606H();
            this.f61175t0 = c19300j2;
            this.f61172q0 = new C19290E(this, this, c19300j2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.openai.chatgpt.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c11242mM12599G.m12606H();
        this.f61174s0 = true;
        spinnerAdapter = this.f61173r0;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f61173r0 = null;
        }
        this.f61170o0.m3003k(attributeSet, com.openai.chatgpt.R.attr.spinnerStyle);
    }

    /* JADX INFO: renamed from: a */
    public final int m20392a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f61177v0;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1904b c1904b = this.f61170o0;
        if (c1904b != null) {
            c1904b.m2993a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        return interfaceC19304L != null ? interfaceC19304L.mo20365b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        return interfaceC19304L != null ? interfaceC19304L.mo20374m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f61175t0 != null ? this.f61176u0 : super.getDropDownWidth();
    }

    public final InterfaceC19304L getInternalPopup() {
        return this.f61175t0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        return interfaceC19304L != null ? interfaceC19304L.mo20368e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f61171p0;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        return interfaceC19304L != null ? interfaceC19304L.mo20367d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1904b c1904b = this.f61170o0;
        if (c1904b != null) {
            return c1904b.m3000h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1904b c1904b = this.f61170o0;
        if (c1904b != null) {
            return c1904b.m3001i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        if (interfaceC19304L == null || !interfaceC19304L.mo20364a()) {
            return;
        }
        interfaceC19304L.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f61175t0 == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m20392a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C19302K c19302k = (C19302K) parcelable;
        super.onRestoreInstanceState(c19302k.getSuperState());
        if (!c19302k.f61160Y || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18806d(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C19302K c19302k = new C19302K(super.onSaveInstanceState());
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        c19302k.f61160Y = interfaceC19304L != null && interfaceC19304L.mo20364a();
        return c19302k;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C19290E c19290e = this.f61172q0;
        if (c19290e == null || !c19290e.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        if (interfaceC19304L == null) {
            return super.performClick();
        }
        if (interfaceC19304L.mo20364a()) {
            return true;
        }
        this.f61175t0.mo20373l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1904b c1904b = this.f61170o0;
        if (c1904b != null) {
            c1904b.m3005m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1904b c1904b = this.f61170o0;
        if (c1904b != null) {
            c1904b.m3006n(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        if (interfaceC19304L == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            interfaceC19304L.mo20372k(i10);
            interfaceC19304L.mo20366c(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        if (interfaceC19304L != null) {
            interfaceC19304L.mo20371j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f61175t0 != null) {
            this.f61176u0 = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        if (interfaceC19304L != null) {
            interfaceC19304L.mo20370h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(AbstractC9106B3.m9636b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        if (interfaceC19304L != null) {
            interfaceC19304L.mo20369g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1904b c1904b = this.f61170o0;
        if (c1904b != null) {
            c1904b.m3011s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1904b c1904b = this.f61170o0;
        if (c1904b != null) {
            c1904b.m3012t(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f61174s0) {
            this.f61173r0 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC19304L interfaceC19304L = this.f61175t0;
        if (interfaceC19304L != null) {
            Context context = this.f61171p0;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C19296H c19296h = new C19296H();
            c19296h.f61140a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c19296h.f61141b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC19292F.m20363a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC19304L.mo20354n(c19296h);
        }
    }
}
