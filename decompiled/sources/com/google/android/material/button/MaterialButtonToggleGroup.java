package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.C12068f;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import na.C17543d;
import p003A1.C0195P;
import p030B2.AbstractC0738T;
import p140Fa.C2681a;
import p140Fa.C2690j;
import p140Fa.C2691k;
import p189Ha.C3271e;
import p287La.AbstractC4967a;
import p729ej.C13414e;
import p783ha.AbstractC14431a;
import za.AbstractC21828k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: y0 */
    public static final /* synthetic */ int f36484y0 = 0;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f36485o0;

    /* JADX INFO: renamed from: p0 */
    public final C13414e f36486p0;

    /* JADX INFO: renamed from: q0 */
    public final LinkedHashSet f36487q0;

    /* JADX INFO: renamed from: r0 */
    public final C0195P f36488r0;

    /* JADX INFO: renamed from: s0 */
    public Integer[] f36489s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f36490t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f36491u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f36492v0;

    /* JADX INFO: renamed from: w0 */
    public final int f36493w0;

    /* JADX INFO: renamed from: x0 */
    public HashSet f36494x0;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC4967a.m5610a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f36485o0 = new ArrayList();
        this.f36486p0 = new C13414e(this);
        this.f36487q0 = new LinkedHashSet();
        this.f36488r0 = new C0195P(this, 7);
        this.f36490t0 = false;
        this.f36494x0 = new HashSet();
        TypedArray typedArrayM22311f = AbstractC21828k.m22311f(getContext(), attributeSet, AbstractC14431a.f45381n, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM22311f.getBoolean(3, false));
        this.f36493w0 = typedArrayM22311f.getResourceId(1, -1);
        this.f36492v0 = typedArrayM22311f.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM22311f.getBoolean(0, true));
        typedArrayM22311f.recycle();
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (m13610c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m13610c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && m13610c(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f36486p0);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m13608a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i10 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            AbstractC15256t.m16465c("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m13609b(materialButton.getId(), materialButton.f36472C0);
        C2691k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f36485o0.add(new C17543d(shapeAppearanceModel.f8278e, shapeAppearanceModel.f8281h, shapeAppearanceModel.f8279f, shapeAppearanceModel.f8280g));
        materialButton.setEnabled(isEnabled());
        AbstractC0738T.m1584l(materialButton, new C3271e(this, 2));
    }

    /* JADX INFO: renamed from: b */
    public final void m13609b(int i10, boolean z6) {
        if (i10 == -1) {
            AbstractC15256t.m16465c("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f36494x0);
        if (z6 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f36491u0 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z6 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f36492v0 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        m13611d(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13610c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: d */
    public final void m13611d(Set set) {
        HashSet hashSet = this.f36494x0;
        this.f36494x0 = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.f36490t0 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f36490t0 = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.f36487q0.iterator();
                while (it.hasNext()) {
                    ((C12068f) it.next()).m13689a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f36488r0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f36489s0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m13612e() {
        C17543d c17543d;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            if (materialButton.getVisibility() != 8) {
                C2690j c2690jM3694e = materialButton.getShapeAppearanceModel().m3694e();
                C17543d c17543d2 = (C17543d) this.f36485o0.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z6 = getOrientation() == 0;
                    C2681a c2681a = C17543d.f56121e;
                    if (i10 == firstVisibleChildIndex) {
                        c17543d = z6 ? AbstractC21828k.m22310e(this) ? new C17543d(c2681a, c2681a, c17543d2.f56123b, c17543d2.f56124c) : new C17543d(c17543d2.f56122a, c17543d2.f56125d, c2681a, c2681a) : new C17543d(c17543d2.f56122a, c2681a, c17543d2.f56123b, c2681a);
                    } else if (i10 != lastVisibleChildIndex) {
                        c17543d2 = null;
                    } else if (z6) {
                        c17543d = AbstractC21828k.m22310e(this) ? new C17543d(c17543d2.f56122a, c17543d2.f56125d, c2681a, c2681a) : new C17543d(c2681a, c2681a, c17543d2.f56123b, c17543d2.f56124c);
                    } else {
                        c17543d = new C17543d(c2681a, c17543d2.f56125d, c2681a, c17543d2.f56124c);
                    }
                    c17543d2 = c17543d;
                }
                if (c17543d2 == null) {
                    c2690jM3694e.f8265e = new C2681a(0.0f);
                    c2690jM3694e.f8266f = new C2681a(0.0f);
                    c2690jM3694e.f8267g = new C2681a(0.0f);
                    c2690jM3694e.f8268h = new C2681a(0.0f);
                } else {
                    c2690jM3694e.f8265e = c17543d2.f56122a;
                    c2690jM3694e.f8268h = c17543d2.f56125d;
                    c2690jM3694e.f8266f = c17543d2.f56123b;
                    c2690jM3694e.f8267g = c17543d2.f56124c;
                }
                materialButton.setShapeAppearanceModel(c2690jM3694e.m3689a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f36491u0 || this.f36494x0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f36494x0.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            if (this.f36494x0.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f36489s0;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        AbstractC15256t.m16482t("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f36493w0;
        if (i10 != -1) {
            m13611d(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f36491u0 ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        m13612e();
        m13608a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f36485o0.remove(iIndexOfChild);
        }
        m13612e();
        m13608a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z6);
        }
    }

    public void setSelectionRequired(boolean z6) {
        this.f36492v0 = z6;
    }

    public void setSingleSelection(boolean z6) {
        if (this.f36491u0 != z6) {
            this.f36491u0 = z6;
            m13611d(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName((this.f36491u0 ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
