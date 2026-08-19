package p003A1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import p1140z1.C21658D;
import p523V9.AbstractC8111i5;
import p563X1.AbstractC9029i;

/* JADX INFO: renamed from: A1.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0151A0 extends ViewGroup {

    /* JADX INFO: renamed from: o0 */
    public final HashMap f626o0;

    /* JADX INFO: renamed from: p0 */
    public final HashMap f627p0;

    public C0151A0(Context context) {
        super(context);
        setClipChildren(false);
        this.f626o0 = new HashMap();
        this.f627p0 = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC9029i, C21658D> getHolderToLayoutNode() {
        return this.f626o0;
    }

    public final HashMap<C21658D, AbstractC9029i> getLayoutNodeToHolder() {
        return this.f627p0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        for (AbstractC9029i abstractC9029i : this.f626o0.keySet()) {
            abstractC9029i.layout(abstractC9029i.getLeft(), abstractC9029i.getTop(), abstractC9029i.getRight(), abstractC9029i.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            AbstractC8111i5.m8591b("widthMeasureSpec should be EXACTLY");
            throw null;
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            AbstractC8111i5.m8591b("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (AbstractC9029i abstractC9029i : this.f626o0.keySet()) {
            int i13 = abstractC9029i.f27550F0;
            if (i13 != Integer.MIN_VALUE && (i12 = abstractC9029i.f27551G0) != Integer.MIN_VALUE) {
                abstractC9029i.measure(i13, i12);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C21658D c21658d = (C21658D) this.f626o0.get(childAt);
            if (childAt.isLayoutRequested() && c21658d != null) {
                C21658D.m22001s0(c21658d, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
