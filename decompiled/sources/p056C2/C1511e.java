package p056C2;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import p030B2.AbstractC0718B;

/* JADX INFO: renamed from: C2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1511e {

    /* JADX INFO: renamed from: e */
    public static final C1511e f4025e;

    /* JADX INFO: renamed from: f */
    public static final C1511e f4026f;

    /* JADX INFO: renamed from: g */
    public static final C1511e f4027g;

    /* JADX INFO: renamed from: h */
    public static final C1511e f4028h;

    /* JADX INFO: renamed from: i */
    public static final C1511e f4029i;

    /* JADX INFO: renamed from: j */
    public static final C1511e f4030j;

    /* JADX INFO: renamed from: k */
    public static final C1511e f4031k;

    /* JADX INFO: renamed from: l */
    public static final C1511e f4032l;

    /* JADX INFO: renamed from: m */
    public static final C1511e f4033m;

    /* JADX INFO: renamed from: n */
    public static final C1511e f4034n;

    /* JADX INFO: renamed from: o */
    public static final C1511e f4035o;

    /* JADX INFO: renamed from: p */
    public static final C1511e f4036p;

    /* JADX INFO: renamed from: a */
    public final Object f4037a;

    /* JADX INFO: renamed from: b */
    public final int f4038b;

    /* JADX INFO: renamed from: c */
    public final Class f4039c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1522p f4040d;

    static {
        new C1511e(1, (String) null);
        new C1511e(2, (String) null);
        new C1511e(4, (String) null);
        new C1511e(8, (String) null);
        f4025e = new C1511e(16, (String) null);
        new C1511e(32, (String) null);
        f4026f = new C1511e(64, (String) null);
        f4027g = new C1511e(128, (String) null);
        new C1511e(256, AbstractC1515i.class);
        new C1511e(512, AbstractC1515i.class);
        new C1511e(1024, AbstractC1516j.class);
        new C1511e(2048, AbstractC1516j.class);
        f4028h = new C1511e(4096, (String) null);
        f4029i = new C1511e(8192, (String) null);
        new C1511e(16384, (String) null);
        new C1511e(32768, (String) null);
        new C1511e(65536, (String) null);
        new C1511e(131072, AbstractC1520n.class);
        f4030j = new C1511e(262144, (String) null);
        f4031k = new C1511e(524288, (String) null);
        f4032l = new C1511e(1048576, (String) null);
        new C1511e(2097152, AbstractC1521o.class);
        int i10 = Build.VERSION.SDK_INT;
        new C1511e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C1511e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC1518l.class);
        f4033m = new C1511e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f4034n = new C1511e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f4035o = new C1511e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f4036p = new C1511e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C1511e(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C1511e(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C1511e(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C1511e(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C1511e(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C1511e(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, AbstractC1519m.class);
        new C1511e(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC1517k.class);
        new C1511e(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C1511e(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C1511e(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C1511e(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C1511e(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C1511e(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C1511e(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C1511e(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C1511e(i10 >= 34 ? AbstractC0718B.m1491b() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C1511e(int i10, String str) {
        this(null, i10, str, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m2210a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f4037a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1511e)) {
            return false;
        }
        Object obj2 = ((C1511e) obj).f4037a;
        Object obj3 = this.f4037a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f4037a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strM2211d = C1512f.m2211d(this.f4038b);
        if (strM2211d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f4037a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM2211d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strM2211d);
        return sb2.toString();
    }

    public C1511e(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public C1511e(Object obj, int i10, String str, InterfaceC1522p interfaceC1522p, Class cls) {
        this.f4038b = i10;
        this.f4040d = interfaceC1522p;
        if (obj == null) {
            this.f4037a = new AccessibilityNodeInfo.AccessibilityAction(i10, str);
        } else {
            this.f4037a = obj;
        }
        this.f4039c = cls;
    }
}
