package p030B2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.sentry.android.core.AbstractC15256t;

/* JADX INFO: renamed from: B2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0775p {

    /* JADX INFO: renamed from: a */
    public ViewParent f2174a;

    /* JADX INFO: renamed from: b */
    public ViewParent f2175b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f2176c;

    /* JADX INFO: renamed from: d */
    public boolean f2177d;

    /* JADX INFO: renamed from: e */
    public int[] f2178e;

    public C0775p(ViewGroup viewGroup) {
        this.f2176c = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1733a(float f10, float f11, boolean z6) {
        ViewParent viewParentM1737e;
        if (!this.f2177d || (viewParentM1737e = m1737e(0)) == null) {
            return false;
        }
        try {
            return viewParentM1737e.onNestedFling(this.f2176c, f10, f11, z6);
        } catch (AbstractMethodError e10) {
            AbstractC15256t.m16466d("ViewParentCompat", "ViewParent " + viewParentM1737e + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1734b(float f10, float f11) {
        ViewParent viewParentM1737e;
        if (!this.f2177d || (viewParentM1737e = m1737e(0)) == null) {
            return false;
        }
        try {
            return viewParentM1737e.onNestedPreFling(this.f2176c, f10, f11);
        } catch (AbstractMethodError e10) {
            AbstractC15256t.m16466d("ViewParentCompat", "ViewParent " + viewParentM1737e + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1735c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentM1737e;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f2177d || (viewParentM1737e = m1737e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f2176c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f2178e == null) {
                this.f2178e = new int[2];
            }
            iArr3 = this.f2178e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM1737e instanceof InterfaceC0777q) {
            ((InterfaceC0777q) viewParentM1737e).mo1746h(viewGroup, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                viewParentM1737e.onNestedPreScroll(viewGroup, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                AbstractC15256t.m16466d("ViewParentCompat", "ViewParent " + viewParentM1737e + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1736d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentM1737e;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f2177d || (viewParentM1737e = m1737e(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f2176c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f2178e == null) {
                this.f2178e = new int[2];
            }
            int[] iArr4 = this.f2178e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentM1737e instanceof InterfaceC0779r) {
            ((InterfaceC0779r) viewParentM1737e).mo1748c(viewGroup, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (viewParentM1737e instanceof InterfaceC0777q) {
                ((InterfaceC0777q) viewParentM1737e).mo1742d(viewGroup, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    viewParentM1737e.onNestedScroll(viewGroup, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    AbstractC15256t.m16466d("ViewParentCompat", "ViewParent " + viewParentM1737e + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final ViewParent m1737e(int i10) {
        if (i10 == 0) {
            return this.f2174a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f2175b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1738f(int i10) {
        return m1737e(i10) != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1739g(int i10, int i11) {
        boolean zOnStartNestedScroll;
        if (m1738f(i11)) {
            return true;
        }
        if (this.f2177d) {
            View view = this.f2176c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z6 = parent instanceof InterfaceC0777q;
                if (z6) {
                    zOnStartNestedScroll = ((InterfaceC0777q) parent).mo1743e(view2, view, i10, i11);
                } else if (i11 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                    } catch (AbstractMethodError e10) {
                        AbstractC15256t.m16466d("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        zOnStartNestedScroll = false;
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i11 == 0) {
                        this.f2174a = parent;
                    } else if (i11 == 1) {
                        this.f2175b = parent;
                    }
                    if (z6) {
                        ((InterfaceC0777q) parent).mo1744f(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i10);
                        } catch (AbstractMethodError e11) {
                            AbstractC15256t.m16466d("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m1740h(int i10) {
        ViewParent viewParentM1737e = m1737e(i10);
        if (viewParentM1737e != null) {
            boolean z6 = viewParentM1737e instanceof InterfaceC0777q;
            ViewGroup viewGroup = this.f2176c;
            if (z6) {
                ((InterfaceC0777q) viewParentM1737e).mo1745g(viewGroup, i10);
            } else if (i10 == 0) {
                try {
                    viewParentM1737e.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    AbstractC15256t.m16466d("ViewParentCompat", "ViewParent " + viewParentM1737e + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f2174a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f2175b = null;
            }
        }
    }
}
