package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p880m.AbstractC17123a;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: o0 */
    public boolean f32246o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f32247p0;

    /* JADX INFO: renamed from: q0 */
    public int f32248q0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32248q0 = -1;
        int[] iArr = AbstractC17123a.f54742k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC0738T.m1583k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f32246o0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f32246o0);
        }
    }

    private void setStacked(boolean z6) {
        if (this.f32247p0 != z6) {
            if (!z6 || this.f32246o0) {
                this.f32247p0 = z6;
                setOrientation(z6 ? 1 : 0);
                setGravity(z6 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z6 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z6;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f32246o0) {
            if (size > this.f32248q0 && this.f32247p0) {
                setStacked(false);
            }
            this.f32248q0 = size;
        }
        if (this.f32247p0 || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z6 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f32246o0 && !this.f32247p0 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z6 = true;
        }
        if (z6) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            i12 = -1;
            if (i13 >= childCount) {
                i13 = -1;
                break;
            } else if (getChildAt(i13).getVisibility() == 0) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            View childAt = getChildAt(i13);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f32247p0) {
                int childCount2 = getChildCount();
                for (int i14 = i13 + 1; i14 < childCount2; i14++) {
                    if (getChildAt(i14).getVisibility() == 0) {
                        i12 = i14;
                        break;
                    }
                }
                paddingBottom = i12 >= 0 ? getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f32246o0 != z6) {
            this.f32246o0 = z6;
            if (!z6 && this.f32247p0) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
