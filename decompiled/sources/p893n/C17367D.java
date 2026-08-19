package p893n;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.AbstractC10818a;
import androidx.appcompat.view.C10825h;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p658b5.C11234e;
import p658b5.C11238i;
import p976r.InterfaceC18812j;
import p976r.MenuC18814l;
import p999s.C19356i;

/* JADX INFO: renamed from: n.D */
/* JADX INFO: loaded from: classes.dex */
public final class C17367D extends AbstractC10818a implements InterfaceC18812j {

    /* JADX INFO: renamed from: o0 */
    public final Context f55405o0;

    /* JADX INFO: renamed from: p0 */
    public final MenuC18814l f55406p0;

    /* JADX INFO: renamed from: q0 */
    public C11234e f55407q0;

    /* JADX INFO: renamed from: r0 */
    public WeakReference f55408r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C17368E f55409s0;

    public C17367D(C17368E c17368e, Context context, C11234e c11234e) {
        this.f55409s0 = c17368e;
        this.f55405o0 = context;
        this.f55407q0 = c11234e;
        MenuC18814l menuC18814l = new MenuC18814l(context);
        menuC18814l.f59856l = 1;
        this.f55406p0 = menuC18814l;
        menuC18814l.f59849e = this;
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: a */
    public final void mo11098a() {
        C17368E c17368e = this.f55409s0;
        if (c17368e.f55420i != this) {
            return;
        }
        boolean z6 = c17368e.f55427p;
        boolean z10 = c17368e.f55428q;
        if (z6 || z10) {
            c17368e.f55421j = this;
            c17368e.f55422k = this.f55407q0;
        } else {
            this.f55407q0.m12501E(this);
        }
        this.f55407q0 = null;
        c17368e.m19040b(false);
        ActionBarContextView actionBarContextView = c17368e.f55417f;
        if (actionBarContextView.f32201y0 == null) {
            actionBarContextView.m11137e();
        }
        c17368e.f55414c.setHideOnContentScrollEnabled(c17368e.f55433v);
        c17368e.f55420i = null;
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: b */
    public final View mo11099b() {
        WeakReference weakReference = this.f55408r0;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: c */
    public final MenuC18814l mo11100c() {
        return this.f55406p0;
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo11101d() {
        return new C10825h(this.f55405o0);
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: e */
    public final CharSequence mo11102e() {
        return this.f55409s0.f55417f.getSubtitle();
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: f */
    public final CharSequence mo11103f() {
        return this.f55409s0.f55417f.getTitle();
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: g */
    public final void mo11104g() {
        if (this.f55409s0.f55420i != this) {
            return;
        }
        MenuC18814l menuC18814l = this.f55406p0;
        menuC18814l.m20134w();
        try {
            this.f55407q0.m12502F(this, menuC18814l);
        } finally {
            menuC18814l.m20133v();
        }
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: h */
    public final boolean mo11105h() {
        return this.f55409s0.f55417f.f32189G0;
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: i */
    public final void mo11106i(View view) {
        this.f55409s0.f55417f.setCustomView(view);
        this.f55408r0 = new WeakReference(view);
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: j */
    public final void mo11107j(int i10) {
        mo11108k(this.f55409s0.f55412a.getResources().getString(i10));
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: k */
    public final void mo11108k(CharSequence charSequence) {
        this.f55409s0.f55417f.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: l */
    public final void mo11109l(int i10) {
        mo11110m(this.f55409s0.f55412a.getResources().getString(i10));
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: m */
    public final void mo11110m(CharSequence charSequence) {
        this.f55409s0.f55417f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: n */
    public final void mo11111n(boolean z6) {
        this.f32079Z = z6;
        this.f55409s0.f55417f.setTitleOptional(z6);
    }

    @Override // p976r.InterfaceC18812j
    /* JADX INFO: renamed from: p */
    public final boolean mo10219p(MenuC18814l menuC18814l, MenuItem menuItem) {
        C11234e c11234e = this.f55407q0;
        if (c11234e != null) {
            return ((C11238i) c11234e.f34001Z).m12577v0(this, menuItem);
        }
        return false;
    }

    @Override // p976r.InterfaceC18812j
    /* JADX INFO: renamed from: y */
    public final void mo10224y(MenuC18814l menuC18814l) {
        if (this.f55407q0 == null) {
            return;
        }
        mo11104g();
        C19356i c19356i = this.f55409s0.f55417f.f32194r0;
        if (c19356i != null) {
            c19356i.m20461l();
        }
    }
}
