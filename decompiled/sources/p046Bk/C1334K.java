package p046Bk;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.openai.chatgpt.R;
import ma.AbstractC17201a;
import p006A4.C0349j;
import p571X9.AbstractC9345p3;
import p769gj.C14183y;

/* JADX INFO: renamed from: Bk.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C1334K extends AbstractC17201a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1338M f3521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomSheetBehavior f3522b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C14183y f3523c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3524d;

    public C1334K(C1338M c1338m, BottomSheetBehavior bottomSheetBehavior, C14183y c14183y, int i10) {
        this.f3521a = c1338m;
        this.f3522b = bottomSheetBehavior;
        this.f3523c = c14183y;
        this.f3524d = i10;
    }

    @Override // ma.AbstractC17201a
    /* JADX INFO: renamed from: a */
    public final void mo2027a(View view, float f10) {
        C14183y c14183y = this.f3523c;
        C1338M c1338m = this.f3521a;
        if (f10 <= 0.0f) {
            c1338m.m2029a().f4922e.setVisibility(8);
            AbstractC9345p3.m9937a(c14183y, this.f3524d);
        } else {
            c1338m.m2029a().f4922e.setVisibility(0);
            c1338m.m2029a().f4922e.setAlpha(f10);
            AbstractC9345p3.m9937a(c14183y, c1338m.m2029a().f4918a.getContext().getColor(R.color.blackScreenStatusBarColor));
        }
    }

    @Override // ma.AbstractC17201a
    /* JADX INFO: renamed from: b */
    public final void mo2028b(View view, int i10) {
        if (i10 == 1) {
            this.f3522b.m13586A(3);
            return;
        }
        if (i10 != 5) {
            return;
        }
        C1338M c1338m = this.f3521a;
        C0349j c0349j = c1338m.f3536d;
        if (c0349j != null) {
            c0349j.invoke(Boolean.TRUE, null);
        }
        c1338m.f3536d = null;
        c1338m.m2029a().f4923f.m14584c();
    }
}
