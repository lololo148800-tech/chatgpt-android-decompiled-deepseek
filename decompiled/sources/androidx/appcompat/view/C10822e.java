package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p976r.MenuC18799A;

/* JADX INFO: renamed from: androidx.appcompat.view.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10822e extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f32092a;

    /* JADX INFO: renamed from: b */
    public final AbstractC10818a f32093b;

    public C10822e(Context context, AbstractC10818a abstractC10818a) {
        this.f32092a = context;
        this.f32093b = abstractC10818a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f32093b.mo11098a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f32093b.mo11099b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC18799A(this.f32092a, this.f32093b.mo11100c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f32093b.mo11101d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f32093b.mo11102e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f32093b.f32078Y;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f32093b.mo11103f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f32093b.f32079Z;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f32093b.mo11104g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f32093b.mo11105h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f32093b.mo11106i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f32093b.mo11108k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f32093b.f32078Y = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f32093b.mo11110m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z6) {
        this.f32093b.mo11111n(z6);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f32093b.mo11107j(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f32093b.mo11109l(i10);
    }
}
