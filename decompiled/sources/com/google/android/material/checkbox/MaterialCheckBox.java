package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxGroupComponent;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import org.xmlpull.v1.XmlPullParserException;
import p038Ba.C0853c;
import p103Dn.C2153Q0;
import p228J.AbstractC3794B0;
import p239Ja.C4308k;
import p287La.AbstractC4967a;
import p353O4.C6115b;
import p353O4.C6117d;
import p353O4.C6118e;
import p353O4.C6119f;
import p523V9.AbstractC7972Q3;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8070d4;
import p571X9.AbstractC9106B3;
import p658b5.C11242m;
import p783ha.AbstractC14431a;
import p955q2.AbstractC18619k;
import p994rk.C19136Y;
import p999s.C19368o;
import qa.C18659a;
import sk.C19665d;
import za.AbstractC21828k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCheckBox extends C19368o {

    /* JADX INFO: renamed from: M0 */
    public static final int[] f36503M0 = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: N0 */
    public static final int[] f36504N0 = {R.attr.state_error};

    /* JADX INFO: renamed from: O0 */
    public static final int[][] f36505O0 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: P0 */
    public static final int f36506P0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: A0 */
    public Drawable f36507A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f36508B0;

    /* JADX INFO: renamed from: C0 */
    public ColorStateList f36509C0;

    /* JADX INFO: renamed from: D0 */
    public ColorStateList f36510D0;

    /* JADX INFO: renamed from: E0 */
    public PorterDuff.Mode f36511E0;

    /* JADX INFO: renamed from: F0 */
    public int f36512F0;

    /* JADX INFO: renamed from: G0 */
    public int[] f36513G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f36514H0;

    /* JADX INFO: renamed from: I0 */
    public CharSequence f36515I0;

    /* JADX INFO: renamed from: J0 */
    public CompoundButton.OnCheckedChangeListener f36516J0;

    /* JADX INFO: renamed from: K0 */
    public final C6119f f36517K0;

    /* JADX INFO: renamed from: L0 */
    public final C0853c f36518L0;

    /* JADX INFO: renamed from: s0 */
    public final LinkedHashSet f36519s0;

    /* JADX INFO: renamed from: t0 */
    public final LinkedHashSet f36520t0;

    /* JADX INFO: renamed from: u0 */
    public ColorStateList f36521u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f36522v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f36523w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f36524x0;

    /* JADX INFO: renamed from: y0 */
    public CharSequence f36525y0;

    /* JADX INFO: renamed from: z0 */
    public Drawable f36526z0;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        C6119f c6119f;
        int next;
        super(AbstractC4967a.m5610a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f36519s0 = new LinkedHashSet();
        this.f36520t0 = new LinkedHashSet();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            c6119f = new C6119f(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = AbstractC18619k.f59299a;
            Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            c6119f.f19923Y = drawable;
            drawable.setCallback(c6119f.f19921r0);
            new C6118e(c6119f.f19923Y.getConstantState());
        } else {
            int i10 = C6119f.f19916s0;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Resources resources2 = context2.getResources();
                Resources.Theme theme2 = context2.getTheme();
                C6119f c6119f2 = new C6119f(context2);
                c6119f2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                c6119f = c6119f2;
            } catch (IOException e10) {
                AbstractC15256t.m16466d("AnimatedVDCompat", "parser error", e10);
                c6119f = null;
            } catch (XmlPullParserException e11) {
                AbstractC15256t.m16466d("AnimatedVDCompat", "parser error", e11);
                c6119f = null;
            }
        }
        this.f36517K0 = c6119f;
        this.f36518L0 = new C0853c(this, 2);
        Context context3 = getContext();
        this.f36526z0 = getButtonDrawable();
        this.f36509C0 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC14431a.f45385r;
        AbstractC21828k.m22306a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        AbstractC21828k.m22307b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C11242m c11242m = new C11242m(context3, typedArrayObtainStyledAttributes);
        this.f36507A0 = c11242m.m12601B(2);
        if (this.f36526z0 != null && AbstractC7972Q3.m8264e(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f36506P0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f36526z0 = AbstractC9106B3.m9636b(context3, R.drawable.mtrl_checkbox_button);
                this.f36508B0 = true;
                if (this.f36507A0 == null) {
                    this.f36507A0 = AbstractC9106B3.m9636b(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f36510D0 = AbstractC7979R3.m8280d(context3, c11242m, 3);
        this.f36511E0 = AbstractC21828k.m22312g(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f36522v0 = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f36523w0 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f36524x0 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f36525y0 = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c11242m.m12606H();
        m13616a();
    }

    private String getButtonStateDescription() {
        int i10 = this.f36512F0;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i10 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f36521u0 == null) {
            int iM8478e = AbstractC8070d4.m8478e(this, R.attr.colorControlActivated);
            int iM8478e2 = AbstractC8070d4.m8478e(this, R.attr.colorError);
            int iM8478e3 = AbstractC8070d4.m8478e(this, R.attr.colorSurface);
            int iM8478e4 = AbstractC8070d4.m8478e(this, R.attr.colorOnSurface);
            this.f36521u0 = new ColorStateList(f36505O0, new int[]{AbstractC8070d4.m8480g(1.0f, iM8478e3, iM8478e2), AbstractC8070d4.m8480g(1.0f, iM8478e3, iM8478e), AbstractC8070d4.m8480g(0.54f, iM8478e3, iM8478e4), AbstractC8070d4.m8480g(0.38f, iM8478e3, iM8478e4), AbstractC8070d4.m8480g(0.38f, iM8478e3, iM8478e4)});
        }
        return this.f36521u0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f36509C0;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: a */
    public final void m13616a() {
        int intrinsicWidth;
        int intrinsicHeight;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C4308k c4308k;
        Drawable drawableMutate = this.f36526z0;
        ColorStateList colorStateList3 = this.f36509C0;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f36526z0 = drawableMutate;
        Drawable drawableMutate2 = this.f36507A0;
        ColorStateList colorStateList4 = this.f36510D0;
        PorterDuff.Mode mode = this.f36511E0;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f36507A0 = drawableMutate2;
        if (this.f36508B0) {
            C6119f c6119f = this.f36517K0;
            if (c6119f != null) {
                Drawable drawable = c6119f.f19923Y;
                C0853c c0853c = this.f36518L0;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0853c.f2367a == null) {
                        c0853c.f2367a = new C6115b(c0853c);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0853c.f2367a);
                }
                ArrayList arrayList = c6119f.f19920q0;
                C6117d c6117d = c6119f.f19917Z;
                if (arrayList != null && c0853c != null) {
                    arrayList.remove(c0853c);
                    if (c6119f.f19920q0.size() == 0 && (c4308k = c6119f.f19919p0) != null) {
                        c6117d.f19911b.removeListener(c4308k);
                        c6119f.f19919p0 = null;
                    }
                }
                Drawable drawable2 = c6119f.f19923Y;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0853c.f2367a == null) {
                        c0853c.f2367a = new C6115b(c0853c);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0853c.f2367a);
                } else if (c0853c != null) {
                    if (c6119f.f19920q0 == null) {
                        c6119f.f19920q0 = new ArrayList();
                    }
                    if (!c6119f.f19920q0.contains(c0853c)) {
                        c6119f.f19920q0.add(c0853c);
                        if (c6119f.f19919p0 == null) {
                            c6119f.f19919p0 = new C4308k(c6119f, 4);
                        }
                        c6117d.f19911b.addListener(c6119f.f19919p0);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f36526z0;
                if ((drawable3 instanceof AnimatedStateListDrawable) && c6119f != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c6119f, false);
                    ((AnimatedStateListDrawable) this.f36526z0).addTransition(R.id.indeterminate, R.id.unchecked, c6119f, false);
                }
            }
        }
        Drawable drawable4 = this.f36526z0;
        if (drawable4 != null && (colorStateList2 = this.f36509C0) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f36507A0;
        if (drawable5 != null && (colorStateList = this.f36510D0) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f36526z0;
        Drawable drawable7 = this.f36507A0;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            if (drawable7.getIntrinsicWidth() == -1 || drawable7.getIntrinsicHeight() == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
                intrinsicHeight = drawable6.getIntrinsicHeight();
            } else if (drawable7.getIntrinsicWidth() > drawable6.getIntrinsicWidth() || drawable7.getIntrinsicHeight() > drawable6.getIntrinsicHeight()) {
                float intrinsicWidth2 = drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight();
                if (intrinsicWidth2 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth3 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth3 / intrinsicWidth2);
                    intrinsicWidth = intrinsicWidth3;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
                }
            } else {
                intrinsicWidth = drawable7.getIntrinsicWidth();
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f36526z0;
    }

    public Drawable getButtonIconDrawable() {
        return this.f36507A0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f36510D0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f36511E0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f36509C0;
    }

    public int getCheckedState() {
        return this.f36512F0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f36525y0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f36512F0 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36522v0 && this.f36509C0 == null && this.f36510D0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36503M0);
        }
        if (this.f36524x0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36504N0);
        }
        for (int i11 = 0; i11 < iArrOnCreateDrawableState.length; i11++) {
            int i12 = iArrOnCreateDrawableState[i11];
            if (i12 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i12 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i11] = 16842912;
            }
            this.f36513G0 = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f36513G0 = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f36523w0 || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (AbstractC21828k.m22310e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f36524x0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f36525y0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C18659a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C18659a c18659a = (C18659a) parcelable;
        super.onRestoreInstanceState(c18659a.getSuperState());
        setCheckedState(c18659a.f59416Y);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C18659a c18659a = new C18659a(super.onSaveInstanceState());
        c18659a.f59416Y = getCheckedState();
        return c18659a;
    }

    @Override // p999s.C19368o, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC9106B3.m9636b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f36507A0 = drawable;
        m13616a();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(AbstractC9106B3.m9636b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f36510D0 == colorStateList) {
            return;
        }
        this.f36510D0 = colorStateList;
        m13616a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f36511E0 == mode) {
            return;
        }
        this.f36511E0 = mode;
        m13616a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f36509C0 == colorStateList) {
            return;
        }
        this.f36509C0 = colorStateList;
        m13616a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m13616a();
    }

    public void setCenterIfNoTextEnabled(boolean z6) {
        this.f36523w0 = z6;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        setCheckedState(z6 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f36512F0 != i10) {
            this.f36512F0 = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f36515I0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f36514H0) {
                return;
            }
            this.f36514H0 = true;
            LinkedHashSet<C19136Y> linkedHashSet = this.f36520t0;
            if (linkedHashSet != null) {
                for (C19136Y c19136y : linkedHashSet) {
                    InputCheckboxGroupComponent inputCheckboxGroupComponent = c19136y.f60838a;
                    ArrayList arrayList = c19136y.f60839b;
                    C19665d c19665d = inputCheckboxGroupComponent.stringSetController;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        String str = null;
                        if (it.hasNext()) {
                            MaterialCheckBox materialCheckBox = (MaterialCheckBox) it.next();
                            if (materialCheckBox.isChecked()) {
                                Object tag = materialCheckBox.getTag();
                                AbstractC16544l.m18092e(tag, "null cannot be cast to non-null type kotlin.String");
                                str = (String) tag;
                            }
                            if (str != null) {
                                linkedHashSet2.add(str);
                            }
                        }
                    }
                    c19665d.getClass();
                    C2153Q0 c2153q0 = (C2153Q0) c19665d.f62329Z;
                    c2153q0.getClass();
                    c2153q0.m3251l(null, linkedHashSet2);
                }
            }
            if (this.f36512F0 != 2 && (onCheckedChangeListener = this.f36516J0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f36514H0 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f36525y0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z6) {
        if (this.f36524x0 == z6) {
            return;
        }
        this.f36524x0 = z6;
        refreshDrawableState();
        Iterator it = this.f36519s0.iterator();
        if (it.hasNext()) {
            throw AbstractC3794B0.m4497v(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f36516J0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f36515I0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f36522v0 = z6;
        if (z6) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p999s.C19368o, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f36526z0 = drawable;
        this.f36508B0 = false;
        m13616a();
    }
}
