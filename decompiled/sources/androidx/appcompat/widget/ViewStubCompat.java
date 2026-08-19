package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p880m.AbstractC17123a;
import p999s.InterfaceC19347e1;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: o0 */
    public int f32304o0;

    /* JADX INFO: renamed from: p0 */
    public int f32305p0;

    /* JADX INFO: renamed from: q0 */
    public WeakReference f32306q0;

    /* JADX INFO: renamed from: r0 */
    public LayoutInflater f32307r0;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f32304o0 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC17123a.f54757z, 0, 0);
        this.f32305p0 = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f32304o0 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: a */
    public final View m11174a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f32304o0 == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f32307r0;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f32304o0, viewGroup, false);
        int i10 = this.f32305p0;
        if (i10 != -1) {
            viewInflate.setId(i10);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f32306q0 = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f32305p0;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f32307r0;
    }

    public int getLayoutResource() {
        return this.f32304o0;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f32305p0 = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f32307r0 = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f32304o0 = i10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference weakReference = this.f32306q0;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            m11174a();
        }
    }

    public void setOnInflateListener(InterfaceC19347e1 interfaceC19347e1) {
    }
}
