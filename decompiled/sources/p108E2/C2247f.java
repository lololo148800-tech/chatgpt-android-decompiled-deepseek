package p108E2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p030B2.C0747b;
import p056C2.C1511e;
import p056C2.C1512f;

/* JADX INFO: renamed from: E2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2247f extends C0747b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6890d;

    public /* synthetic */ C2247f(int i10) {
        this.f6890d = i10;
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: c */
    public void mo1590c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f6890d) {
            case 0:
                super.mo1590c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo1590c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: d */
    public final void mo862d(View view, C1512f c1512f) {
        int scrollRange;
        switch (this.f6890d) {
            case 0:
                this.f2118a.onInitializeAccessibilityNodeInfo(view, c1512f.f4042a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c1512f.m2219i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    c1512f.m2222l(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c1512f.m2213b(C1511e.f4029i);
                        c1512f.m2213b(C1511e.f4033m);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c1512f.m2213b(C1511e.f4028h);
                        c1512f.m2213b(C1511e.f4035o);
                    }
                    break;
                }
                break;
            case 1:
                this.f2118a.onInitializeAccessibilityNodeInfo(view, c1512f.f4042a);
                c1512f.m2220j(null);
                break;
            case 2:
                this.f2118a.onInitializeAccessibilityNodeInfo(view, c1512f.f4042a);
                c1512f.m2222l(false);
                break;
            default:
                this.f2118a.onInitializeAccessibilityNodeInfo(view, c1512f.f4042a);
                c1512f.m2220j(null);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    @Override // p030B2.C0747b
    /* JADX INFO: renamed from: g */
    public boolean mo1593g(View view, int i10, Bundle bundle) {
        int iMin;
        switch (this.f6890d) {
            case 0:
                if (super.mo1593g(view, i10, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i10 == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m11404u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i10 == 8192 || i10 == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.m11404u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i10 == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m11404u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.mo1593g(view, i10, bundle);
        }
    }
}
