package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p999s.AbstractC19379t0;
import p999s.C19377s0;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC19379t0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: j */
    public static int m11152j(View view) {
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m11152j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    @Override // p999s.AbstractC19379t0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i18 = gravity & 112;
        int i19 = gravity & 8388615;
        int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - measuredHeight : (((i13 - i11) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C19377s0 c19377s0 = (C19377s0) childAt.getLayoutParams();
                int i21 = ((LinearLayout.LayoutParams) c19377s0).gravity;
                if (i21 < 0) {
                    i21 = i19;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i16 = ((LinearLayout.LayoutParams) c19377s0).leftMargin + paddingLeft;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) c19377s0).rightMargin;
                    }
                    if (m20484i(i20)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i22 = paddingTop + ((LinearLayout.LayoutParams) c19377s0).topMargin;
                    childAt.layout(i16, i22, measuredWidth + i16, i22 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c19377s0).bottomMargin + i22;
                } else {
                    i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c19377s0).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) c19377s0).rightMargin;
                }
                i16 = i14 - i15;
                if (m20484i(i20)) {
                    paddingTop += intrinsicHeight;
                }
                int i23 = paddingTop + ((LinearLayout.LayoutParams) c19377s0).topMargin;
                childAt.layout(i16, i23, measuredWidth + i16, i23 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c19377s0).bottomMargin + i23;
            }
        }
    }

    @Override // p999s.AbstractC19379t0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iCombineMeasuredStates;
        int iM11152j;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i10, i11);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i10, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            iM11152j = m11152j(view2);
            measuredHeight = view2.getMeasuredHeight() - iM11152j;
            paddingBottom += iM11152j;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM11152j = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i13 = size - paddingBottom;
        if (view2 != null) {
            int i14 = paddingBottom - iM11152j;
            int iMin = Math.min(i13, measuredHeight);
            if (iMin > 0) {
                i13 -= iMin;
                iM11152j += iMin;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(iM11152j, 1073741824));
            paddingBottom = i14 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i13, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i10, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i11, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                if (childAt3.getVisibility() != 8) {
                    C19377s0 c19377s0 = (C19377s0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c19377s0).width == -1) {
                        int i17 = ((LinearLayout.LayoutParams) c19377s0).height;
                        ((LinearLayout.LayoutParams) c19377s0).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i11, 0);
                        ((LinearLayout.LayoutParams) c19377s0).height = i17;
                    }
                }
            }
        }
    }
}
