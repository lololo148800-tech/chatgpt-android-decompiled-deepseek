package p304M2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p003A1.C0180K;
import p030B2.AbstractC0738T;
import p030B2.C0747b;
import p056C2.C1512f;
import p1061vb.C20513d;
import p544W9.AbstractC8746y3;
import p692d0.AbstractC12978q;
import p692d0.C12960M;
import p959q8.C18639a;
import p960q9.C18655i;
import p986ra.C18907d;

/* JADX INFO: renamed from: M2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5278a extends C0747b {

    /* JADX INFO: renamed from: n */
    public static final Rect f17355n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o */
    public static final C18639a f17356o = new C18639a(10);

    /* JADX INFO: renamed from: p */
    public static final C20513d f17357p = new C20513d();

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f17362h;

    /* JADX INFO: renamed from: i */
    public final Chip f17363i;

    /* JADX INFO: renamed from: j */
    public C0180K f17364j;

    /* JADX INFO: renamed from: d */
    public final Rect f17358d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f17359e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f17360f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f17361g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f17365k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f17366l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f17367m = Integer.MIN_VALUE;

    public AbstractC5278a(Chip chip) {
        if (chip == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f17363i = chip;
        this.f17362h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: b */
    public final C18655i mo636b(View view) {
        if (this.f17364j == null) {
            this.f17364j = new C0180K(this, 1);
        }
        return this.f17364j;
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: d */
    public final void mo862d(View view, C1512f c1512f) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2118a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1512f.f4042a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C18907d) this).f60276q;
        accessibilityNodeInfo.setCheckable(chip.m13620d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c1512f.m2219i(chip.getAccessibilityClassName());
        c1512f.m2223m(chip.getText());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5798j(int i10) {
        if (this.f17366l != i10) {
            return false;
        }
        this.f17366l = Integer.MIN_VALUE;
        C18907d c18907d = (C18907d) this;
        if (i10 == 1) {
            Chip chip = c18907d.f60276q;
            chip.f36530A0 = false;
            chip.refreshDrawableState();
        }
        m5805q(i10, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final C1512f m5799k(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C1512f c1512f = new C1512f(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c1512f.m2219i("android.view.View");
        Rect rect = f17355n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        c1512f.f4043b = -1;
        Chip chip = this.f17363i;
        accessibilityNodeInfoObtain.setParent(chip);
        mo5803o(i10, c1512f);
        if (c1512f.m2217g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f17359e;
        c1512f.m2216f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c1512f.f4044c = i10;
        accessibilityNodeInfoObtain.setSource(chip, i10);
        if (this.f17365k == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c1512f.m2212a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c1512f.m2212a(64);
        }
        boolean z6 = this.f17366l == i10;
        if (z6) {
            c1512f.m2212a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c1512f.m2212a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z6);
        int[] iArr = this.f17361g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f17358d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c1512f.m2216f(rect3);
            if (c1512f.f4043b != -1) {
                C1512f c1512f2 = new C1512f(AccessibilityNodeInfo.obtain());
                for (int i11 = c1512f.f4043b; i11 != -1; i11 = c1512f2.f4043b) {
                    c1512f2.f4043b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c1512f2.f4042a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    mo5803o(i11, c1512f2);
                    c1512f2.m2216f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f17360f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1512f.f4042a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfo2.setVisibleToUser(true);
                    }
                }
            }
        }
        return c1512f;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo5800l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:117:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0113  */
    /* JADX WARN: Code duplicated, block: B:57:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ab  */
    /* JADX INFO: renamed from: m */
    public final boolean m5801m(int i10, Rect rect) {
        int i11;
        int i12;
        Object obj;
        C1512f c1512f;
        int i13;
        Rect rect2;
        int iM14655f;
        Rect rect3;
        int i14;
        C1512f c1512f2;
        int i15;
        int iM9496g;
        int iM9497h;
        ArrayList arrayList = new ArrayList();
        mo5800l(arrayList);
        C12960M c12960m = new C12960M(0);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            c12960m.m14654e(((Integer) arrayList.get(i16)).intValue(), m5799k(((Integer) arrayList.get(i16)).intValue()));
        }
        int i17 = this.f17366l;
        int iM14653d = Integer.MIN_VALUE;
        C1512f c1512f3 = i17 == Integer.MIN_VALUE ? null : (C1512f) c12960m.m14652c(i17);
        C18639a c18639a = f17356o;
        C20513d c20513d = f17357p;
        Chip chip = this.f17363i;
        if (i10 == 1 || i10 == 2) {
            i11 = 0;
            i12 = -1;
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            boolean z6 = chip.getLayoutDirection() == 1;
            c20513d.getClass();
            int iM14655f2 = c12960m.m14655f();
            ArrayList arrayList2 = new ArrayList(iM14655f2);
            for (int i18 = 0; i18 < iM14655f2; i18++) {
                arrayList2.add((C1512f) c12960m.m14656g(i18));
            }
            Collections.sort(arrayList2, new C5279b(z6, c18639a));
            if (i10 == 1) {
                int size = arrayList2.size();
                if (c1512f3 != null) {
                    size = arrayList2.indexOf(c1512f3);
                }
                int i19 = size - 1;
                if (i19 >= 0) {
                    obj = arrayList2.get(i19);
                } else {
                    obj = null;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c1512f3 == null ? -1 : arrayList2.lastIndexOf(c1512f3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            c1512f = (C1512f) obj;
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i20 = this.f17366l;
            if (i20 != Integer.MIN_VALUE) {
                m5802n(i20).m2216f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = chip.getWidth();
                    int height = chip.getHeight();
                    if (i10 == 17) {
                        i12 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i10 == 33) {
                        i12 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i10 == 66) {
                        rect4.set(-1, 0, -1, height);
                        i12 = -1;
                    } else {
                        if (i10 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect4.set(0, -1, width, -1);
                        i12 = -1;
                    }
                }
                rect2 = new Rect(rect4);
                if (i10 != 17) {
                    i11 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i10 != 33) {
                    i11 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i10 != 66) {
                    i11 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                c20513d.getClass();
                iM14655f = c12960m.m14655f();
                rect3 = new Rect();
                c1512f = null;
                for (i14 = i11; i14 < iM14655f; i14++) {
                    c1512f2 = (C1512f) c12960m.m14656g(i14);
                    if (c1512f2 == c1512f3) {
                        c18639a.getClass();
                        c1512f2.m2216f(rect3);
                        if (AbstractC8746y3.m9495f(i10, rect4, rect3)) {
                            if (AbstractC8746y3.m9495f(i10, rect4, rect2) || AbstractC8746y3.m9490a(i10, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                c1512f = c1512f2;
                            } else if (AbstractC8746y3.m9490a(i10, rect4, rect2, rect3)) {
                                int iM9496g2 = AbstractC8746y3.m9496g(i10, rect4, rect3);
                                int iM9497h2 = AbstractC8746y3.m9497h(i10, rect4, rect3);
                                i15 = (iM9497h2 * iM9497h2) + (iM9496g2 * 13 * iM9496g2);
                                iM9496g = AbstractC8746y3.m9496g(i10, rect4, rect2);
                                iM9497h = AbstractC8746y3.m9497h(i10, rect4, rect2);
                                if (i15 < (iM9497h * iM9497h) + (iM9496g * 13 * iM9496g)) {
                                    rect2.set(rect3);
                                    c1512f = c1512f2;
                                }
                            }
                        }
                    }
                }
            }
            i12 = -1;
            rect2 = new Rect(rect4);
            if (i10 != 17) {
                i11 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i10 != 33) {
                i11 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i10 != 66) {
                i11 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i10 == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i11 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            c20513d.getClass();
            iM14655f = c12960m.m14655f();
            rect3 = new Rect();
            c1512f = null;
            while (i14 < iM14655f) {
                c1512f2 = (C1512f) c12960m.m14656g(i14);
                if (c1512f2 == c1512f3) {
                    c18639a.getClass();
                    c1512f2.m2216f(rect3);
                    if (AbstractC8746y3.m9495f(i10, rect4, rect3)) {
                        if (AbstractC8746y3.m9495f(i10, rect4, rect2)) {
                            rect2.set(rect3);
                            c1512f = c1512f2;
                        } else if (AbstractC8746y3.m9490a(i10, rect4, rect2, rect3)) {
                            int iM9496g3 = AbstractC8746y3.m9496g(i10, rect4, rect3);
                            int iM9497h3 = AbstractC8746y3.m9497h(i10, rect4, rect3);
                            i15 = (iM9497h3 * iM9497h3) + (iM9496g3 * 13 * iM9496g3);
                            iM9496g = AbstractC8746y3.m9496g(i10, rect4, rect2);
                            iM9497h = AbstractC8746y3.m9497h(i10, rect4, rect2);
                            if (i15 < (iM9497h * iM9497h) + (iM9496g * 13 * iM9496g)) {
                                rect2.set(rect3);
                                c1512f = c1512f2;
                            }
                        }
                    }
                }
            }
        }
        C1512f c1512f4 = c1512f;
        if (c1512f4 != null) {
            if (c12960m.f41155Y) {
                AbstractC12978q.m14672a(c12960m);
            }
            int i21 = c12960m.f41158p0;
            int i22 = i11;
            while (true) {
                if (i22 >= i21) {
                    i13 = i12;
                    break;
                }
                if (c12960m.f41157o0[i22] == c1512f4) {
                    i13 = i22;
                    break;
                }
                i22++;
            }
            iM14653d = c12960m.m14653d(i13);
        }
        return m5804p(iM14653d);
    }

    /* JADX INFO: renamed from: n */
    public final C1512f m5802n(int i10) {
        if (i10 != -1) {
            return m5799k(i10);
        }
        Chip chip = this.f17363i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C1512f c1512f = new C1512f(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo5800l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c1512f.f4042a.addChild(chip, ((Integer) arrayList.get(i11)).intValue());
        }
        return c1512f;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo5803o(int i10, C1512f c1512f);

    /* JADX INFO: renamed from: p */
    public final boolean m5804p(int i10) {
        int i11;
        Chip chip = this.f17363i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i11 = this.f17366l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m5798j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f17366l = i10;
        C18907d c18907d = (C18907d) this;
        if (i10 == 1) {
            Chip chip2 = c18907d.f60276q;
            chip2.f36530A0 = true;
            chip2.refreshDrawableState();
        }
        m5805q(i10, 8);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m5805q(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i10 == Integer.MIN_VALUE || !this.f17362h.isEnabled() || (parent = (view = this.f17363i).getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            C1512f c1512fM5802n = m5802n(i10);
            accessibilityEventObtain.getText().add(c1512fM5802n.m2217g());
            AccessibilityNodeInfo accessibilityNodeInfo = c1512fM5802n.f4042a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i10);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
