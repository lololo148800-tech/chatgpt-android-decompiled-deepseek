package p822j2;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p001A.AbstractC0010F;
import p760g2.AbstractC13813j;
import p760g2.C13806c;
import p760g2.C13807d;
import p760g2.C13808e;
import p760g2.C13810g;
import p775h2.C14372b;
import p775h2.InterfaceC14373c;

/* JADX INFO: renamed from: j2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16048e implements InterfaceC14373c {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f49571a;

    /* JADX INFO: renamed from: b */
    public int f49572b;

    /* JADX INFO: renamed from: c */
    public int f49573c;

    /* JADX INFO: renamed from: d */
    public int f49574d;

    /* JADX INFO: renamed from: e */
    public int f49575e;

    /* JADX INFO: renamed from: f */
    public int f49576f;

    /* JADX INFO: renamed from: g */
    public int f49577g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ConstraintLayout f49578h;

    public C16048e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f49578h = constraintLayout;
        this.f49571a = constraintLayout2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17618c(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
        }
        return false;
    }

    @Override // p775h2.InterfaceC14373c
    /* JADX INFO: renamed from: a */
    public final void mo10945a() {
        ConstraintLayout constraintLayout = this.f49571a;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            constraintLayout.getChildAt(i10);
        }
        int size = constraintLayout.f32847p0.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((AbstractC16045b) constraintLayout.f32847p0.get(i11)).getClass();
            }
        }
    }

    @Override // p775h2.InterfaceC14373c
    /* JADX INFO: renamed from: b */
    public final void mo10946b(C13807d c13807d, C14372b c14372b) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i10;
        int iMakeMeasureSpec3;
        boolean z6;
        int measuredWidth;
        int baseline;
        int i11;
        if (c13807d == null) {
            return;
        }
        if (c13807d.f43670h0 == 8) {
            c14372b.f45071e = 0;
            c14372b.f45072f = 0;
            c14372b.f45073g = 0;
            return;
        }
        if (c13807d.f43649U == null) {
            return;
        }
        int i12 = c14372b.f45067a;
        int i13 = c14372b.f45068b;
        int i14 = c14372b.f45069c;
        int i15 = c14372b.f45070d;
        int i16 = this.f49572b + this.f49573c;
        int i17 = this.f49574d;
        View view = (View) c13807d.f43668g0;
        int iM24h = AbstractC0010F.m24h(i12);
        C13806c c13806c = c13807d.f43640L;
        C13806c c13806c2 = c13807d.f43638J;
        if (iM24h == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else if (iM24h == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f49576f, i17, -2);
        } else if (iM24h == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f49576f, i17, -2);
            boolean z10 = c13807d.f43690s == 1;
            int i18 = c14372b.f45076j;
            if (i18 == 1 || i18 == 2) {
                boolean z11 = view.getMeasuredHeight() == c13807d.m15383l();
                if (c14372b.f45076j == 2 || !z10 || ((z10 && z11) || c13807d.mo15336B())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c13807d.m15387r(), 1073741824);
                }
            }
        } else if (iM24h != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i19 = this.f49576f;
            int i20 = c13806c2 != null ? c13806c2.f43626g : 0;
            if (c13806c != null) {
                i20 += c13806c.f43626g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i19, i17 + i20, -1);
        }
        int iM24h2 = AbstractC0010F.m24h(i13);
        if (iM24h2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else if (iM24h2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f49577g, i16, -2);
        } else if (iM24h2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f49577g, i16, -2);
            boolean z12 = c13807d.f43691t == 1;
            int i21 = c14372b.f45076j;
            if (i21 == 1 || i21 == 2) {
                boolean z13 = view.getMeasuredWidth() == c13807d.m15387r();
                if (c14372b.f45076j == 2 || !z12 || ((z12 && z13) || c13807d.mo15337C())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c13807d.m15383l(), 1073741824);
                }
            }
        } else if (iM24h2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i22 = this.f49577g;
            int i23 = c13806c2 != null ? c13807d.f43639K.f43626g : 0;
            if (c13806c != null) {
                i23 += c13807d.f43641M.f43626g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i22, i16 + i23, -1);
        }
        C13808e c13808e = c13807d.f43649U;
        ConstraintLayout constraintLayout = this.f49578h;
        if (c13808e != null && AbstractC13813j.m15419c(constraintLayout.f32854w0, 256) && view.getMeasuredWidth() == c13807d.m15387r() && view.getMeasuredWidth() < c13808e.m15387r() && view.getMeasuredHeight() == c13807d.m15383l() && view.getMeasuredHeight() < c13808e.m15383l() && view.getBaseline() == c13807d.f43658b0 && !c13807d.m15358A() && m17618c(c13807d.f43636H, iMakeMeasureSpec, c13807d.m15387r()) && m17618c(c13807d.f43637I, iMakeMeasureSpec2, c13807d.m15383l())) {
            c14372b.f45071e = c13807d.m15387r();
            c14372b.f45072f = c13807d.m15383l();
            c14372b.f45073g = c13807d.f43658b0;
            return;
        }
        boolean z14 = i12 == 3;
        boolean z15 = i13 == 3;
        boolean z16 = i13 == 4 || i13 == 1;
        boolean z17 = i12 == 4 || i12 == 1;
        boolean z18 = z14 && c13807d.f43652X > 0.0f;
        boolean z19 = z15 && c13807d.f43652X > 0.0f;
        if (view == null) {
            return;
        }
        C16047d c16047d = (C16047d) view.getLayoutParams();
        int i24 = c14372b.f45076j;
        if (i24 != 1 && i24 != 2 && z14 && c13807d.f43690s == 0 && z15 && c13807d.f43691t == 0) {
            z6 = false;
            measuredWidth = 0;
            i11 = -1;
            baseline = 0;
            iMax = 0;
        } else {
            if ((view instanceof AbstractC16061r) && (c13807d instanceof C13810g)) {
                ((AbstractC16061r) view).mo11360j((C13810g) c13807d, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c13807d.f43636H = iMakeMeasureSpec;
            c13807d.f43637I = iMakeMeasureSpec2;
            c13807d.f43667g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i25 = c13807d.f43693v;
            int iMax2 = i25 > 0 ? Math.max(i25, measuredWidth2) : measuredWidth2;
            int i26 = c13807d.f43694w;
            if (i26 > 0) {
                iMax2 = Math.min(i26, iMax2);
            }
            int i27 = c13807d.f43696y;
            iMax = i27 > 0 ? Math.max(i27, measuredHeight) : measuredHeight;
            int i28 = iMakeMeasureSpec;
            int i29 = c13807d.f43697z;
            if (i29 > 0) {
                iMax = Math.min(i29, iMax);
            }
            if (!AbstractC13813j.m15419c(constraintLayout.f32854w0, 1)) {
                if (z18 && z16) {
                    iMax2 = (int) ((iMax * c13807d.f43652X) + 0.5f);
                } else if (z19 && z17) {
                    iMax = (int) ((iMax2 / c13807d.f43652X) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z6 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    i10 = 1073741824;
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else {
                    i10 = 1073741824;
                    iMakeMeasureSpec3 = i28;
                }
                if (measuredHeight != iMax) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i10);
                }
                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                c13807d.f43636H = iMakeMeasureSpec3;
                c13807d.f43637I = iMakeMeasureSpec2;
                z6 = false;
                c13807d.f43667g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i11 = -1;
        }
        boolean z20 = baseline != i11 ? true : z6;
        if (measuredWidth != c14372b.f45069c || iMax != c14372b.f45070d) {
            z6 = true;
        }
        c14372b.f45075i = z6;
        boolean z21 = c16047d.f49534c0 ? true : z20;
        if (z21 && baseline != -1 && c13807d.f43658b0 != baseline) {
            c14372b.f45075i = true;
        }
        c14372b.f45071e = measuredWidth;
        c14372b.f45072f = iMax;
        c14372b.f45074h = z21;
        c14372b.f45073g = baseline;
    }
}
