package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p658b5.C11234e;
import p658b5.C11238i;
import p976r.InterfaceC18812j;
import p976r.MenuC18814l;
import p999s.C19356i;

/* JADX INFO: renamed from: androidx.appcompat.view.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10821d extends AbstractC10818a implements InterfaceC18812j {

    /* JADX INFO: renamed from: o0 */
    public Context f32086o0;

    /* JADX INFO: renamed from: p0 */
    public ActionBarContextView f32087p0;

    /* JADX INFO: renamed from: q0 */
    public C11234e f32088q0;

    /* JADX INFO: renamed from: r0 */
    public WeakReference f32089r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f32090s0;

    /* JADX INFO: renamed from: t0 */
    public MenuC18814l f32091t0;

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: a */
    public final void mo11098a() {
        if (this.f32090s0) {
            return;
        }
        this.f32090s0 = true;
        this.f32088q0.m12501E(this);
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: b */
    public final View mo11099b() {
        WeakReference weakReference = this.f32089r0;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: c */
    public final MenuC18814l mo11100c() {
        return this.f32091t0;
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo11101d() {
        return new C10825h(this.f32087p0.getContext());
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: e */
    public final CharSequence mo11102e() {
        return this.f32087p0.getSubtitle();
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: f */
    public final CharSequence mo11103f() {
        return this.f32087p0.getTitle();
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: g */
    public final void mo11104g() {
        this.f32088q0.m12502F(this, this.f32091t0);
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: h */
    public final boolean mo11105h() {
        return this.f32087p0.f32189G0;
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: i */
    public final void mo11106i(View view) {
        this.f32087p0.setCustomView(view);
        this.f32089r0 = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: j */
    public final void mo11107j(int i10) {
        mo11108k(this.f32086o0.getString(i10));
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: k */
    public final void mo11108k(CharSequence charSequence) {
        this.f32087p0.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: l */
    public final void mo11109l(int i10) {
        mo11110m(this.f32086o0.getString(i10));
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: m */
    public final void mo11110m(CharSequence charSequence) {
        this.f32087p0.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC10818a
    /* JADX INFO: renamed from: n */
    public final void mo11111n(boolean z6) {
        this.f32079Z = z6;
        this.f32087p0.setTitleOptional(z6);
    }

    @Override // p976r.InterfaceC18812j
    /* JADX INFO: renamed from: p */
    public final boolean mo10219p(MenuC18814l menuC18814l, MenuItem menuItem) {
        return ((C11238i) this.f32088q0.f34001Z).m12577v0(this, menuItem);
    }

    @Override // p976r.InterfaceC18812j
    /* JADX INFO: renamed from: y */
    public final void mo10224y(MenuC18814l menuC18814l) {
        mo11104g();
        C19356i c19356i = this.f32087p0.f32194r0;
        if (c19356i != null) {
            c19356i.m20461l();
        }
    }
}
