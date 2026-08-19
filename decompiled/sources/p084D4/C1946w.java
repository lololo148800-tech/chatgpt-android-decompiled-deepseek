package p084D4;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: D4.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1946w extends AbstractC1898W {

    /* JADX INFO: renamed from: d */
    public static final int[] f5752d = {R.attr.listDivider};

    /* JADX INFO: renamed from: a */
    public Drawable f5753a;

    /* JADX INFO: renamed from: b */
    public final int f5754b;

    /* JADX INFO: renamed from: c */
    public final Rect f5755c = new Rect();

    public C1946w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f5752d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f5753a = drawable;
        if (drawable == null) {
            AbstractC15256t.m16482t("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f5754b = 1;
    }

    @Override // p084D4.AbstractC1898W
    /* JADX INFO: renamed from: a */
    public final void mo2915a(Rect rect, View view) {
        Drawable drawable = this.f5753a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f5754b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // p084D4.AbstractC1898W
    /* JADX INFO: renamed from: b */
    public final void mo2916b(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f5753a == null) {
            return;
        }
        int i10 = this.f5754b;
        Rect rect = this.f5755c;
        int i11 = 0;
        if (i10 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i11 < childCount) {
                View childAt = recyclerView.getChildAt(i11);
                RecyclerView.m12245M(rect, childAt);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f5753a.setBounds(paddingLeft, iRound - this.f5753a.getIntrinsicHeight(), width, iRound);
                this.f5753a.draw(canvas);
                i11++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i11);
            recyclerView.getLayoutManager().mo2990y(rect, childAt2);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f5753a.setBounds(iRound2 - this.f5753a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f5753a.draw(canvas);
            i11++;
        }
        canvas.restore();
    }
}
