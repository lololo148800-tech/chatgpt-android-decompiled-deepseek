package p166Ga;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p228J.AbstractC3794B0;
import p477Tb.C7296c;
import p523V9.AbstractC7925K4;
import p544W9.AbstractC8752z3;
import p862l2.AbstractC16803b;

/* JADX INFO: renamed from: Ga.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3027a extends AbstractC8752z3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9113a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC16803b f9114b;

    public /* synthetic */ C3027a(AbstractC16803b abstractC16803b, int i10) {
        this.f9113a = i10;
        this.f9114b = abstractC16803b;
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: a */
    public final int mo3891a(View view, int i10) {
        switch (this.f9113a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9114b;
                return AbstractC7925K4.m8214e(i10, sideSheetBehavior.f36677a.m7765y(), sideSheetBehavior.f36689m);
            default:
                return view.getLeft();
        }
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: b */
    public final int mo3892b(View view, int i10) {
        switch (this.f9113a) {
            case 0:
                return view.getTop();
            default:
                return AbstractC7925K4.m8214e(i10, ((BottomSheetBehavior) this.f9114b).m13600x(), mo3894h());
        }
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: g */
    public int mo3893g(View view) {
        switch (this.f9113a) {
            case 0:
                return ((SideSheetBehavior) this.f9114b).f36689m;
            default:
                return super.mo3893g(view);
        }
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: h */
    public int mo3894h() {
        switch (this.f9113a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f9114b;
                return bottomSheetBehavior.f36420J ? bottomSheetBehavior.f36431U : bottomSheetBehavior.f36418H;
            default:
                return super.mo3894h();
        }
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: j */
    public final void mo3895j(int i10) {
        switch (this.f9113a) {
            case 0:
                if (i10 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9114b;
                    if (sideSheetBehavior.f36683g) {
                        sideSheetBehavior.m13648r(1);
                    }
                }
                break;
            default:
                if (i10 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f9114b;
                    if (bottomSheetBehavior.f36422L) {
                        bottomSheetBehavior.m13587B(1);
                    }
                }
                break;
        }
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: k */
    public final void mo3896k(View view, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f9113a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9114b;
                WeakReference weakReference = sideSheetBehavior.f36692p;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    C7296c c7296c = sideSheetBehavior.f36677a;
                    int left = view.getLeft();
                    view.getRight();
                    int i12 = ((SideSheetBehavior) c7296c.f23104Z).f36689m;
                    if (left <= i12) {
                        marginLayoutParams.rightMargin = i12 - left;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f36696t;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                C7296c c7296c2 = sideSheetBehavior.f36677a;
                int i13 = ((SideSheetBehavior) c7296c2.f23104Z).f36689m;
                c7296c2.m7765y();
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC3794B0.m4497v(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f9114b).m13599t(i11);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: l */
    public final void mo3897l(View view, float f10, float f11) {
        switch (this.f9113a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9114b;
                C7296c c7296c = sideSheetBehavior.f36677a;
                c7296c.getClass();
                int i10 = 3;
                if (f10 >= 0.0f) {
                    float right = view.getRight();
                    SideSheetBehavior sideSheetBehavior2 = (SideSheetBehavior) c7296c.f23104Z;
                    if (Math.abs((sideSheetBehavior2.f36687k * f10) + right) > 0.5f) {
                        if ((Math.abs(f10) > Math.abs(f11) && f11 > 500) || view.getLeft() > (sideSheetBehavior2.f36689m - c7296c.m7765y()) / 2) {
                            i10 = 5;
                        }
                    } else if (f10 == 0.0f || Math.abs(f10) <= Math.abs(f11)) {
                        int left = view.getLeft();
                        if (Math.abs(left - c7296c.m7765y()) >= Math.abs(left - sideSheetBehavior2.f36689m)) {
                            i10 = 5;
                        }
                    } else {
                        i10 = 5;
                    }
                }
                sideSheetBehavior.m13650t(view, i10, true);
                break;
            default:
                int i11 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f9114b;
                if (f11 < 0.0f) {
                    if (bottomSheetBehavior.f36439b) {
                        i11 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f36416F) {
                            i11 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.f36420J && bottomSheetBehavior.m13588C(view, f11)) {
                    if (Math.abs(f10) >= Math.abs(f11) || f11 <= bottomSheetBehavior.f36445e) {
                        if (view.getTop() > (bottomSheetBehavior.m13600x() + bottomSheetBehavior.f36431U) / 2) {
                            i11 = 5;
                        } else if (bottomSheetBehavior.f36439b || Math.abs(view.getTop() - bottomSheetBehavior.m13600x()) < Math.abs(view.getTop() - bottomSheetBehavior.f36416F)) {
                            i11 = 3;
                        }
                    } else {
                        i11 = 5;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f36439b) {
                        int i12 = bottomSheetBehavior.f36416F;
                        if (top2 < i12) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f36418H)) {
                                i11 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i12) < Math.abs(top2 - bottomSheetBehavior.f36418H)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i11 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f36415E) < Math.abs(top2 - bottomSheetBehavior.f36418H)) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                } else if (bottomSheetBehavior.f36439b) {
                    i11 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f36416F) < Math.abs(top3 - bottomSheetBehavior.f36418H)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i11 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.m13589D(view, i11, true);
                break;
        }
    }

    @Override // p544W9.AbstractC8752z3
    /* JADX INFO: renamed from: m */
    public final boolean mo3898m(View view, int i10) {
        WeakReference weakReference;
        switch (this.f9113a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f9114b;
                return (sideSheetBehavior.f36684h == 1 || (weakReference = sideSheetBehavior.f36691o) == null || weakReference.get() != view) ? false : true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f9114b;
                int i11 = bottomSheetBehavior.f36423M;
                if (i11 == 1 || bottomSheetBehavior.f36440b0) {
                    return false;
                }
                if (i11 == 3 && bottomSheetBehavior.f36436Z == i10) {
                    WeakReference weakReference2 = bottomSheetBehavior.f36433W;
                    View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.f36432V;
                return weakReference3 != null && weakReference3.get() == view;
        }
    }
}
