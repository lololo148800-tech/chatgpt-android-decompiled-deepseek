package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p030B2.AbstractC0738T;
import p523V9.AbstractC7979R3;
import p783ha.AbstractC14431a;
import p822j2.C16052i;
import p822j2.C16056m;
import p913o2.AbstractC17803d;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC12067e implements InterfaceC12066d {

    /* JADX INFO: renamed from: J0 */
    public final ClockHandView f36788J0;

    /* JADX INFO: renamed from: K0 */
    public final Rect f36789K0;

    /* JADX INFO: renamed from: L0 */
    public final RectF f36790L0;

    /* JADX INFO: renamed from: M0 */
    public final Rect f36791M0;

    /* JADX INFO: renamed from: N0 */
    public final SparseArray f36792N0;

    /* JADX INFO: renamed from: O0 */
    public final C12065c f36793O0;

    /* JADX INFO: renamed from: P0 */
    public final int[] f36794P0;

    /* JADX INFO: renamed from: Q0 */
    public final float[] f36795Q0;

    /* JADX INFO: renamed from: R0 */
    public final int f36796R0;

    /* JADX INFO: renamed from: S0 */
    public final int f36797S0;

    /* JADX INFO: renamed from: T0 */
    public final int f36798T0;

    /* JADX INFO: renamed from: U0 */
    public final int f36799U0;

    /* JADX INFO: renamed from: V0 */
    public final String[] f36800V0;

    /* JADX INFO: renamed from: W0 */
    public float f36801W0;

    /* JADX INFO: renamed from: X0 */
    public final ColorStateList f36802X0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36789K0 = new Rect();
        this.f36790L0 = new RectF();
        this.f36791M0 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f36792N0 = sparseArray;
        this.f36795Q0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45373f, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM8279c = AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 1);
        this.f36802X0 = colorStateListM8279c;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f36788J0 = clockHandView;
        this.f36796R0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM8279c.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM8279c.getDefaultColor());
        this.f36794P0 = new int[]{colorForState, colorForState, colorStateListM8279c.getDefaultColor()};
        clockHandView.f36806q0.add(this);
        int defaultColor = AbstractC17803d.m19556c(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM8279c2 = AbstractC7979R3.m8279c(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM8279c2 != null ? colorStateListM8279c2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC12064b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f36793O0 = new C12065c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f36800V0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z6 = false;
        for (int i10 = 0; i10 < Math.max(this.f36800V0.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.f36800V0.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f36800V0[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z6 = i11 > 1 ? true : z6;
                AbstractC0738T.m1584l(textView, this.f36793O0);
                textView.setTextColor(this.f36802X0);
            }
        }
        ClockHandView clockHandView2 = this.f36788J0;
        if (clockHandView2.f36805p0 && !z6) {
            clockHandView2.f36803A0 = 1;
        }
        clockHandView2.f36805p0 = z6;
        clockHandView2.invalidate();
        this.f36797S0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f36798T0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f36799U0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.AbstractC12067e
    /* JADX INFO: renamed from: l */
    public final void mo13685l() {
        C16056m c16056m = new C16056m();
        c16056m.m17636c(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f36822H0 * 0.66f) : this.f36822H0;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                C16052i c16052i = c16056m.m17640i(((View) it.next()).getId()).f49599d;
                c16052i.f49669z = R.id.circle_center;
                c16052i.f49603A = iRound;
                c16052i.f49604B = size;
                size += 360.0f / list.size();
            }
        }
        c16056m.m17634a(this);
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.f36792N0;
            if (i12 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i12)).setVisibility(0);
            i12++;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m13686m() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f36788J0.f36810u0;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f36792N0;
            int size = sparseArray.size();
            rectF = this.f36790L0;
            rect = this.f36789K0;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f36791M0;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f36794P0, this.f36795Q0, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f36800V0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        m13686m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f36799U0 / Math.max(Math.max(this.f36797S0 / displayMetrics.heightPixels, this.f36798T0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
