package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p523V9.AbstractC8034Z;
import p806ia.AbstractC14951a;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: o0 */
    public TextView f36699o0;

    /* JADX INFO: renamed from: p0 */
    public Button f36700p0;

    /* JADX INFO: renamed from: q0 */
    public final TimeInterpolator f36701q0;

    /* JADX INFO: renamed from: r0 */
    public int f36702r0;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36701q0 = AbstractC8034Z.m8390e(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC14951a.f46572b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13652a(int i10, int i11, int i12) {
        boolean z6;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f36699o0.getPaddingTop() == i11 && this.f36699o0.getPaddingBottom() == i12) {
            return z6;
        }
        TextView textView = this.f36699o0;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i11, textView.getPaddingEnd(), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f36700p0;
    }

    public TextView getMessageView() {
        return this.f36699o0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36699o0 = (TextView) findViewById(R.id.snackbar_text);
        this.f36700p0 = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f36699o0.getLayout();
        boolean z6 = layout != null && layout.getLineCount() > 1;
        if (!z6 || this.f36702r0 <= 0 || this.f36700p0.getMeasuredWidth() <= this.f36702r0) {
            if (!z6) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m13652a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m13652a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f36702r0 = i10;
    }
}
