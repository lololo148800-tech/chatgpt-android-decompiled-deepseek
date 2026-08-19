package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p001A.C0095w0;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p064Ca.C1622d;
import p090Da.AbstractC1982a;
import p1002s2.InterfaceC19438a;
import p1141z2.AbstractC21727f;
import p1141z2.C21723b;
import p140Fa.C2691k;
import p140Fa.InterfaceC2701u;
import p287La.AbstractC4967a;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8151n5;
import p571X9.AbstractC9106B3;
import p783ha.AbstractC14431a;
import p806ia.C14954d;
import p913o2.AbstractC17803d;
import p986ra.C18904a;
import p986ra.C18905b;
import p986ra.C18906c;
import p986ra.C18907d;
import p986ra.C18909f;
import p986ra.InterfaceC18908e;
import p999s.C19368o;
import za.AbstractC21828k;
import za.C21826i;
import za.InterfaceC21822e;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C19368o implements InterfaceC18908e, InterfaceC2701u, Checkable {

    /* JADX INFO: renamed from: K0 */
    public static final Rect f36527K0 = new Rect();

    /* JADX INFO: renamed from: L0 */
    public static final int[] f36528L0 = {R.attr.state_selected};

    /* JADX INFO: renamed from: M0 */
    public static final int[] f36529M0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A0 */
    public boolean f36530A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f36531B0;

    /* JADX INFO: renamed from: C0 */
    public int f36532C0;

    /* JADX INFO: renamed from: D0 */
    public int f36533D0;

    /* JADX INFO: renamed from: E0 */
    public CharSequence f36534E0;

    /* JADX INFO: renamed from: F0 */
    public final C18907d f36535F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f36536G0;

    /* JADX INFO: renamed from: H0 */
    public final Rect f36537H0;

    /* JADX INFO: renamed from: I0 */
    public final RectF f36538I0;

    /* JADX INFO: renamed from: J0 */
    public final C18905b f36539J0;

    /* JADX INFO: renamed from: s0 */
    public C18909f f36540s0;

    /* JADX INFO: renamed from: t0 */
    public InsetDrawable f36541t0;

    /* JADX INFO: renamed from: u0 */
    public RippleDrawable f36542u0;

    /* JADX INFO: renamed from: v0 */
    public View.OnClickListener f36543v0;

    /* JADX INFO: renamed from: w0 */
    public CompoundButton.OnCheckedChangeListener f36544w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f36545x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f36546y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f36547z0;

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f36538I0;
        rectF.setEmpty();
        if (m13619c() && this.f36543v0 != null) {
            C18909f c18909f = this.f36540s0;
            Rect bounds = c18909f.getBounds();
            rectF.setEmpty();
            if (c18909f.m20258X()) {
                float f10 = c18909f.f60328p1 + c18909f.f60327o1 + c18909f.f60313a1 + c18909f.f60326n1 + c18909f.f60325m1;
                if (c18909f.getLayoutDirection() == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f36537H0;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private C1622d getTextAppearance() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60335w1.f69274f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z6) {
        if (this.f36547z0 != z6) {
            this.f36547z0 = z6;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z6) {
        if (this.f36546y0 != z6) {
            this.f36546y0 = z6;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13618b(int i10) {
        this.f36533D0 = i10;
        if (!this.f36531B0) {
            InsetDrawable insetDrawable = this.f36541t0;
            if (insetDrawable == null) {
                int[] iArr = AbstractC1982a.f5854a;
                m13622f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f36541t0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC1982a.f5854a;
                    m13622f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i10 - ((int) this.f36540s0.f60292L0));
        int iMax2 = Math.max(0, i10 - this.f36540s0.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f36541t0;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC1982a.f5854a;
                m13622f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f36541t0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC1982a.f5854a;
                    m13622f();
                    return;
                }
                return;
            }
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f36541t0 != null) {
            Rect rect = new Rect();
            this.f36541t0.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = AbstractC1982a.f5854a;
                m13622f();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f36541t0 = new InsetDrawable((Drawable) this.f36540s0, i11, i12, i11, i12);
        int[] iArr6 = AbstractC1982a.f5854a;
        m13622f();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13619c() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            Object obj = c18909f.f60310X0;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof InterfaceC19438a) {
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13620d() {
        C18909f c18909f = this.f36540s0;
        return c18909f != null && c18909f.f60315c1;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        if (!this.f36536G0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C18907d c18907d = this.f36535F0;
        AccessibilityManager accessibilityManager = c18907d.f17362h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x4 = motionEvent.getX();
                float y8 = motionEvent.getY();
                Chip chip = c18907d.f60276q;
                int i11 = (chip.m13619c() && chip.getCloseIconTouchBounds().contains(x4, y8)) ? 1 : 0;
                int i12 = c18907d.f17367m;
                if (i12 != i11) {
                    c18907d.f17367m = i11;
                    c18907d.m5805q(i11, 128);
                    c18907d.m5805q(i12, 256);
                }
                if (i11 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i10 = c18907d.f17367m) != Integer.MIN_VALUE) {
                if (i10 == Integer.MIN_VALUE) {
                    return true;
                }
                c18907d.f17367m = Integer.MIN_VALUE;
                c18907d.m5805q(i10, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.f36536G0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C18907d c18907d = this.f36535F0;
        c18907d.getClass();
        boolean zM5801m = false;
        int i11 = 0;
        zM5801m = false;
        zM5801m = false;
        zM5801m = false;
        zM5801m = false;
        zM5801m = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i12 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i12 = 33;
                                } else if (keyCode == 21) {
                                    i12 = 17;
                                } else if (keyCode != 22) {
                                    i12 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z6 = false;
                                while (i11 < repeatCount && c18907d.m5801m(i12, null)) {
                                    i11++;
                                    z6 = true;
                                }
                                zM5801m = z6;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i10 = c18907d.f17366l;
                                if (i10 != Integer.MIN_VALUE) {
                                    chip = c18907d.f60276q;
                                    if (i10 == 0) {
                                        chip.performClick();
                                    } else if (i10 == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.f36543v0;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f36536G0) {
                                            chip.f36535F0.m5805q(1, 1);
                                        }
                                    }
                                }
                                zM5801m = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i10 = c18907d.f17366l;
                    if (i10 != Integer.MIN_VALUE) {
                        chip = c18907d.f60276q;
                        if (i10 == 0) {
                            chip.performClick();
                        } else if (i10 == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.f36543v0;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f36536G0) {
                                chip.f36535F0.m5805q(1, 1);
                            }
                        }
                    }
                    zM5801m = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM5801m = c18907d.m5801m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM5801m = c18907d.m5801m(1, null);
            }
        }
        if (!zM5801m || c18907d.f17366l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p999s.C19368o, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        int i11;
        super.drawableStateChanged();
        C18909f c18909f = this.f36540s0;
        boolean zM20265z = false;
        if (c18909f != null && C18909f.m20234x(c18909f.f60310X0)) {
            C18909f c18909f2 = this.f36540s0;
            ?? IsEnabled = isEnabled();
            if (this.f36530A0) {
                i10 = IsEnabled;
                i10 = IsEnabled + 1;
            }
            i10 = IsEnabled;
            int i12 = i10;
            if (this.f36547z0) {
                i12 = i10 + 1;
            }
            int i13 = i12;
            if (this.f36546y0) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (this.f36530A0) {
                iArr[i11] = 16842908;
                i11++;
            }
            if (this.f36547z0) {
                iArr[i11] = 16843623;
                i11++;
            }
            if (this.f36546y0) {
                iArr[i11] = 16842919;
                i11++;
            }
            if (isChecked()) {
                iArr[i11] = 16842913;
            }
            if (!Arrays.equals(c18909f2.f60291K1, iArr)) {
                c18909f2.f60291K1 = iArr;
                if (c18909f2.m20258X()) {
                    zM20265z = c18909f2.m20265z(c18909f2.getState(), iArr);
                }
            }
        }
        if (zM20265z) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13621e() {
        C18909f c18909f;
        if (!m13619c() || (c18909f = this.f36540s0) == null || !c18909f.f60309W0 || this.f36543v0 == null) {
            AbstractC0738T.m1584l(this, null);
            this.f36536G0 = false;
        } else {
            AbstractC0738T.m1584l(this, this.f36535F0);
            this.f36536G0 = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13622f() {
        this.f36542u0 = new RippleDrawable(AbstractC1982a.m3155a(this.f36540s0.f60300P0), getBackgroundDrawable(), null);
        this.f36540s0.getClass();
        RippleDrawable rippleDrawable = this.f36542u0;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        setBackground(rippleDrawable);
        m13623g();
    }

    /* JADX INFO: renamed from: g */
    public final void m13623g() {
        C18909f c18909f;
        if (TextUtils.isEmpty(getText()) || (c18909f = this.f36540s0) == null) {
            return;
        }
        int iM20262u = (int) (c18909f.m20262u() + c18909f.f60328p1 + c18909f.f60325m1);
        C18909f c18909f2 = this.f36540s0;
        int iM20261t = (int) (c18909f2.m20261t() + c18909f2.f60321i1 + c18909f2.f60324l1);
        if (this.f36541t0 != null) {
            Rect rect = new Rect();
            this.f36541t0.getPadding(rect);
            iM20261t += rect.left;
            iM20262u += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        setPaddingRelative(iM20261t, paddingTop, iM20262u, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f36534E0)) {
            return this.f36534E0;
        }
        if (!m13620d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f36541t0;
        return insetDrawable == null ? this.f36540s0 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60317e1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60318f1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60290K0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return Math.max(0.0f, c18909f.m20263v());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f36540s0;
    }

    public float getChipEndPadding() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60328p1;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getChipIcon() {
        Object obj;
        C18909f c18909f = this.f36540s0;
        if (c18909f == null || (obj = c18909f.f60305S0) == null) {
            return null;
        }
        if (obj instanceof InterfaceC19438a) {
            obj = null;
        }
        return obj;
    }

    public float getChipIconSize() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60307U0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60306T0;
        }
        return null;
    }

    public float getChipMinHeight() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60292L0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60321i1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60296N0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60298O0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getCloseIcon() {
        Object obj;
        C18909f c18909f = this.f36540s0;
        if (c18909f == null || (obj = c18909f.f60310X0) == null) {
            return null;
        }
        if (obj instanceof InterfaceC19438a) {
            obj = null;
        }
        return obj;
    }

    public CharSequence getCloseIconContentDescription() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60314b1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60327o1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60313a1;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60326n1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60312Z0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60297N1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f36536G0) {
            C18907d c18907d = this.f36535F0;
            if (c18907d.f17366l == 1 || c18907d.f17365k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C14954d getHideMotionSpec() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60320h1;
        }
        return null;
    }

    public float getIconEndPadding() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60323k1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60322j1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60300P0;
        }
        return null;
    }

    public C2691k getShapeAppearanceModel() {
        return this.f36540s0.f8246Y.f8220a;
    }

    public C14954d getShowMotionSpec() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60319g1;
        }
        return null;
    }

    public float getTextEndPadding() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60325m1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            return c18909f.f60324l1;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m13624h() {
        TextPaint paint = getPaint();
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            paint.drawableState = c18909f.getState();
        }
        C1622d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m2483e(getContext(), paint, this.f36539J0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC8151n5.m8696d(this, this.f36540s0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36528L0);
        }
        if (m13620d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36529M0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i10, Rect rect) {
        super.onFocusChanged(z6, i10, rect);
        if (this.f36536G0) {
            C18907d c18907d = this.f36535F0;
            int i11 = c18907d.f17366l;
            if (i11 != Integer.MIN_VALUE) {
                c18907d.m5798j(i11);
            }
            if (z6) {
                c18907d.m5801m(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m13620d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f36532C0 != i10) {
            this.f36532C0 = i10;
            m13623g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f36546y0) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z6 = true;
                }
                z6 = false;
            } else {
                if (this.f36546y0) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f36543v0;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f36536G0) {
                        this.f36535F0.m5805q(1, 1);
                    }
                    z6 = true;
                }
                setCloseIconPressed(false);
            }
            z6 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f36534E0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f36542u0) {
            super.setBackground(drawable);
        } else {
            AbstractC15256t.m16482t("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        AbstractC15256t.m16482t("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p999s.C19368o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f36542u0) {
            super.setBackgroundDrawable(drawable);
        } else {
            AbstractC15256t.m16482t("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p999s.C19368o, android.view.View
    public void setBackgroundResource(int i10) {
        AbstractC15256t.m16482t("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        AbstractC15256t.m16482t("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        AbstractC15256t.m16482t("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z6) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20235A(z6);
        }
    }

    public void setCheckableResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20235A(c18909f.f60329q1.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        C18909f c18909f = this.f36540s0;
        if (c18909f == null) {
            this.f36545x0 = z6;
        } else if (c18909f.f60315c1) {
            super.setChecked(z6);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20236B(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z6) {
        setCheckedIconVisible(z6);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20236B(AbstractC9106B3.m9636b(c18909f.f60329q1, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20237C(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20237C(AbstractC17803d.m19556c(c18909f.f60329q1, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20238D(c18909f.f60329q1.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C18909f c18909f = this.f36540s0;
        if (c18909f == null || c18909f.f60290K0 == colorStateList) {
            return;
        }
        c18909f.f60290K0 = colorStateList;
        c18909f.onStateChange(c18909f.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateListM19556c;
        C18909f c18909f = this.f36540s0;
        if (c18909f == null || c18909f.f60290K0 == (colorStateListM19556c = AbstractC17803d.m19556c(c18909f.f60329q1, i10))) {
            return;
        }
        c18909f.f60290K0 = colorStateListM19556c;
        c18909f.onStateChange(c18909f.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20239E(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20239E(c18909f.f60329q1.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(C18909f c18909f) {
        C18909f c18909f2 = this.f36540s0;
        if (c18909f2 != c18909f) {
            if (c18909f2 != null) {
                c18909f2.f60295M1 = new WeakReference(null);
            }
            this.f36540s0 = c18909f;
            c18909f.f60299O1 = false;
            c18909f.f60295M1 = new WeakReference(this);
            m13618b(this.f36533D0);
        }
    }

    public void setChipEndPadding(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f == null || c18909f.f60328p1 == f10) {
            return;
        }
        c18909f.f60328p1 = f10;
        c18909f.invalidateSelf();
        c18909f.m20264y();
    }

    public void setChipEndPaddingResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            float dimension = c18909f.f60329q1.getResources().getDimension(i10);
            if (c18909f.f60328p1 != dimension) {
                c18909f.f60328p1 = dimension;
                c18909f.invalidateSelf();
                c18909f.m20264y();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20240F(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z6) {
        setChipIconVisible(z6);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20240F(AbstractC9106B3.m9636b(c18909f.f60329q1, i10));
        }
    }

    public void setChipIconSize(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20241G(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20241G(c18909f.f60329q1.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20242H(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20242H(AbstractC17803d.m19556c(c18909f.f60329q1, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20243I(c18909f.f60329q1.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f == null || c18909f.f60292L0 == f10) {
            return;
        }
        c18909f.f60292L0 = f10;
        c18909f.invalidateSelf();
        c18909f.m20264y();
    }

    public void setChipMinHeightResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            float dimension = c18909f.f60329q1.getResources().getDimension(i10);
            if (c18909f.f60292L0 != dimension) {
                c18909f.f60292L0 = dimension;
                c18909f.invalidateSelf();
                c18909f.m20264y();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f == null || c18909f.f60321i1 == f10) {
            return;
        }
        c18909f.f60321i1 = f10;
        c18909f.invalidateSelf();
        c18909f.m20264y();
    }

    public void setChipStartPaddingResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            float dimension = c18909f.f60329q1.getResources().getDimension(i10);
            if (c18909f.f60321i1 != dimension) {
                c18909f.f60321i1 = dimension;
                c18909f.invalidateSelf();
                c18909f.m20264y();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20244J(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20244J(AbstractC17803d.m19556c(c18909f.f60329q1, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20245K(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20245K(c18909f.f60329q1.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20246L(drawable);
        }
        m13621e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C18909f c18909f = this.f36540s0;
        if (c18909f == null || c18909f.f60314b1 == charSequence) {
            return;
        }
        String str = C21723b.f68912b;
        C21723b c21723b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C21723b.f68915e : C21723b.f68914d;
        c21723b.getClass();
        C0095w0 c0095w0 = AbstractC21727f.f68922a;
        c18909f.f60314b1 = c21723b.m22234c(charSequence);
        c18909f.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z6) {
        setCloseIconVisible(z6);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20247M(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20247M(c18909f.f60329q1.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20246L(AbstractC9106B3.m9636b(c18909f.f60329q1, i10));
        }
        m13621e();
    }

    public void setCloseIconSize(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20248N(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20248N(c18909f.f60329q1.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20249O(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20249O(c18909f.f60329q1.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20250P(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20250P(AbstractC17803d.m19556c(c18909f.f60329q1, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // p999s.C19368o, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p999s.C19368o, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m3681k(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f36540s0 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.f60297N1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        this.f36531B0 = z6;
        m13618b(this.f36533D0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            AbstractC15256t.m16482t("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(C14954d c14954d) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.f60320h1 = c14954d;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.f60320h1 = C14954d.m16117b(c18909f.f60329q1, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20252R(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20252R(c18909f.f60329q1.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20253S(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20253S(c18909f.f60329q1.getResources().getDimension(i10));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f36540s0 == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.f60301P1 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f36544w0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f36543v0 = onClickListener;
        m13621e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20254T(colorStateList);
        }
        this.f36540s0.getClass();
        m13622f();
    }

    public void setRippleColorResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20254T(AbstractC17803d.m19556c(c18909f.f60329q1, i10));
            this.f36540s0.getClass();
            m13622f();
        }
    }

    @Override // p140Fa.InterfaceC2701u
    public void setShapeAppearanceModel(C2691k c2691k) {
        this.f36540s0.setShapeAppearanceModel(c2691k);
    }

    public void setShowMotionSpec(C14954d c14954d) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.f60319g1 = c14954d;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.f60319g1 = C14954d.m16117b(c18909f.f60329q1, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z6) {
        if (!z6) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z6);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C18909f c18909f = this.f36540s0;
        if (c18909f == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c18909f.f60299O1 ? null : charSequence, bufferType);
        C18909f c18909f2 = this.f36540s0;
        if (c18909f2 == null || TextUtils.equals(c18909f2.f60302Q0, charSequence)) {
            return;
        }
        c18909f2.f60302Q0 = charSequence;
        c18909f2.f60335w1.f69272d = true;
        c18909f2.invalidateSelf();
        c18909f2.m20264y();
    }

    public void setTextAppearance(C1622d c1622d) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20255U(c1622d);
        }
        m13624h();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f == null || c18909f.f60325m1 == f10) {
            return;
        }
        c18909f.f60325m1 = f10;
        c18909f.invalidateSelf();
        c18909f.m20264y();
    }

    public void setTextEndPaddingResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            float dimension = c18909f.f60329q1.getResources().getDimension(i10);
            if (c18909f.f60325m1 != dimension) {
                c18909f.f60325m1 = dimension;
                c18909f.invalidateSelf();
                c18909f.m20264y();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            float fApplyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            C21826i c21826i = c18909f.f60335w1;
            C1622d c1622d = c21826i.f69274f;
            if (c1622d != null) {
                c1622d.f4602k = fApplyDimension;
                c21826i.f69269a.setTextSize(fApplyDimension);
                c18909f.m20264y();
                c18909f.invalidateSelf();
            }
        }
        m13624h();
    }

    public void setTextStartPadding(float f10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f == null || c18909f.f60324l1 == f10) {
            return;
        }
        c18909f.f60324l1 = f10;
        c18909f.invalidateSelf();
        c18909f.m20264y();
    }

    public void setTextStartPaddingResource(int i10) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            float dimension = c18909f.f60329q1.getResources().getDimension(i10);
            if (c18909f.f60324l1 != dimension) {
                c18909f.f60324l1 = dimension;
                c18909f.invalidateSelf();
                c18909f.m20264y();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(AbstractC4967a.m5610a(context, attributeSet, com.openai.chatgpt.R.attr.chipStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.openai.chatgpt.R.attr.chipStyle);
        this.f36537H0 = new Rect();
        this.f36538I0 = new RectF();
        this.f36539J0 = new C18905b(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                AbstractC15256t.m16482t("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", lZYtIbClQJm.PWDuhVXvxZwg, 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                AbstractC15256t.m16482t("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C18909f c18909f = new C18909f(context2, attributeSet);
        int[] iArr = AbstractC14431a.f45371d;
        TypedArray typedArrayM22311f = AbstractC21828k.m22311f(c18909f.f60329q1, attributeSet, iArr, com.openai.chatgpt.R.attr.chipStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c18909f.f60303Q1 = typedArrayM22311f.hasValue(37);
        Context context3 = c18909f.f60329q1;
        ColorStateList colorStateListM8279c = AbstractC7979R3.m8279c(context3, typedArrayM22311f, 24);
        if (c18909f.f60288J0 != colorStateListM8279c) {
            c18909f.f60288J0 = colorStateListM8279c;
            c18909f.onStateChange(c18909f.getState());
        }
        ColorStateList colorStateListM8279c2 = AbstractC7979R3.m8279c(context3, typedArrayM22311f, 11);
        if (c18909f.f60290K0 != colorStateListM8279c2) {
            c18909f.f60290K0 = colorStateListM8279c2;
            c18909f.onStateChange(c18909f.getState());
        }
        float dimension = typedArrayM22311f.getDimension(19, 0.0f);
        if (c18909f.f60292L0 != dimension) {
            c18909f.f60292L0 = dimension;
            c18909f.invalidateSelf();
            c18909f.m20264y();
        }
        if (typedArrayM22311f.hasValue(12)) {
            c18909f.m20239E(typedArrayM22311f.getDimension(12, 0.0f));
        }
        c18909f.m20244J(AbstractC7979R3.m8279c(context3, typedArrayM22311f, 22));
        c18909f.m20245K(typedArrayM22311f.getDimension(23, 0.0f));
        c18909f.m20254T(AbstractC7979R3.m8279c(context3, typedArrayM22311f, 36));
        String text = typedArrayM22311f.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c18909f.f60302Q0, text)) {
            c18909f.f60302Q0 = text;
            c18909f.f60335w1.f69272d = true;
            c18909f.invalidateSelf();
            c18909f.m20264y();
        }
        C1622d c1622d = (!typedArrayM22311f.hasValue(0) || (resourceId = typedArrayM22311f.getResourceId(0, 0)) == 0) ? null : new C1622d(context3, resourceId);
        c1622d.f4602k = typedArrayM22311f.getDimension(1, c1622d.f4602k);
        c18909f.m20255U(c1622d);
        int i10 = typedArrayM22311f.getInt(3, 0);
        if (i10 == 1) {
            c18909f.f60297N1 = TextUtils.TruncateAt.START;
        } else if (i10 == 2) {
            c18909f.f60297N1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i10 == 3) {
            c18909f.f60297N1 = TextUtils.TruncateAt.END;
        }
        c18909f.m20243I(typedArrayM22311f.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c18909f.m20243I(typedArrayM22311f.getBoolean(15, false));
        }
        c18909f.m20240F(AbstractC7979R3.m8282f(context3, typedArrayM22311f, 14));
        if (typedArrayM22311f.hasValue(17)) {
            c18909f.m20242H(AbstractC7979R3.m8279c(context3, typedArrayM22311f, 17));
        }
        c18909f.m20241G(typedArrayM22311f.getDimension(16, -1.0f));
        c18909f.m20251Q(typedArrayM22311f.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c18909f.m20251Q(typedArrayM22311f.getBoolean(26, false));
        }
        c18909f.m20246L(AbstractC7979R3.m8282f(context3, typedArrayM22311f, 25));
        c18909f.m20250P(AbstractC7979R3.m8279c(context3, typedArrayM22311f, 30));
        c18909f.m20248N(typedArrayM22311f.getDimension(28, 0.0f));
        c18909f.m20235A(typedArrayM22311f.getBoolean(6, false));
        c18909f.m20238D(typedArrayM22311f.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c18909f.m20238D(typedArrayM22311f.getBoolean(8, false));
        }
        c18909f.m20236B(AbstractC7979R3.m8282f(context3, typedArrayM22311f, 7));
        if (typedArrayM22311f.hasValue(9)) {
            c18909f.m20237C(AbstractC7979R3.m8279c(context3, typedArrayM22311f, 9));
        }
        c18909f.f60319g1 = C14954d.m16116a(context3, typedArrayM22311f, 39);
        c18909f.f60320h1 = C14954d.m16116a(context3, typedArrayM22311f, 33);
        float dimension2 = typedArrayM22311f.getDimension(21, 0.0f);
        if (c18909f.f60321i1 != dimension2) {
            c18909f.f60321i1 = dimension2;
            c18909f.invalidateSelf();
            c18909f.m20264y();
        }
        c18909f.m20253S(typedArrayM22311f.getDimension(35, 0.0f));
        c18909f.m20252R(typedArrayM22311f.getDimension(34, 0.0f));
        float dimension3 = typedArrayM22311f.getDimension(41, 0.0f);
        if (c18909f.f60324l1 != dimension3) {
            c18909f.f60324l1 = dimension3;
            c18909f.invalidateSelf();
            c18909f.m20264y();
        }
        float dimension4 = typedArrayM22311f.getDimension(40, 0.0f);
        if (c18909f.f60325m1 != dimension4) {
            c18909f.f60325m1 = dimension4;
            c18909f.invalidateSelf();
            c18909f.m20264y();
        }
        c18909f.m20249O(typedArrayM22311f.getDimension(29, 0.0f));
        c18909f.m20247M(typedArrayM22311f.getDimension(27, 0.0f));
        float dimension5 = typedArrayM22311f.getDimension(13, 0.0f);
        if (c18909f.f60328p1 != dimension5) {
            c18909f.f60328p1 = dimension5;
            c18909f.invalidateSelf();
            c18909f.m20264y();
        }
        c18909f.f60301P1 = typedArrayM22311f.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM22311f.recycle();
        AbstractC21828k.m22306a(context2, attributeSet, com.openai.chatgpt.R.attr.chipStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC21828k.m22307b(context2, attributeSet, iArr, com.openai.chatgpt.R.attr.chipStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.openai.chatgpt.R.attr.chipStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_Chip_Action);
        this.f36531B0 = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f36533D0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c18909f);
        c18909f.m3681k(AbstractC0730K.m1548e(this));
        AbstractC21828k.m22306a(context2, attributeSet, com.openai.chatgpt.R.attr.chipStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC21828k.m22307b(context2, attributeSet, iArr, com.openai.chatgpt.R.attr.chipStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.openai.chatgpt.R.attr.chipStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f36535F0 = new C18907d(this, this);
        m13621e();
        if (!zHasValue) {
            setOutlineProvider(new C18906c(this));
        }
        setChecked(this.f36545x0);
        setText(c18909f.f60302Q0);
        setEllipsize(c18909f.f60297N1);
        m13624h();
        if (!this.f36540s0.f60299O1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m13623g();
        if (this.f36531B0) {
            setMinHeight(this.f36533D0);
        }
        this.f36532C0 = getLayoutDirection();
        super.setOnCheckedChangeListener(new C18904a(this, 0));
    }

    public void setCloseIconVisible(boolean z6) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20251Q(z6);
        }
        m13621e();
    }

    public void setCheckedIconVisible(boolean z6) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20238D(z6);
        }
    }

    public void setChipIconVisible(boolean z6) {
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20243I(z6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20255U(new C1622d(c18909f.f60329q1, i10));
        }
        m13624h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        C18909f c18909f = this.f36540s0;
        if (c18909f != null) {
            c18909f.m20255U(new C1622d(c18909f.f60329q1, i10));
        }
        m13624h();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC21822e interfaceC21822e) {
    }
}
