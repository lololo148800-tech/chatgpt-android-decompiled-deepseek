package p976r;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: r.D */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC18802D extends MenuC18814l implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final C18816n f59780A;

    /* JADX INFO: renamed from: z */
    public final MenuC18814l f59781z;

    public SubMenuC18802D(Context context, MenuC18814l menuC18814l, C18816n c18816n) {
        super(context);
        this.f59781z = menuC18814l;
        this.f59780A = c18816n;
    }

    @Override // p976r.MenuC18814l
    /* JADX INFO: renamed from: d */
    public final boolean mo20098d(C18816n c18816n) {
        return this.f59781z.mo20098d(c18816n);
    }

    @Override // p976r.MenuC18814l
    /* JADX INFO: renamed from: e */
    public final boolean mo20099e(MenuC18814l menuC18814l, MenuItem menuItem) {
        return super.mo20099e(menuC18814l, menuItem) || this.f59781z.mo20099e(menuC18814l, menuItem);
    }

    @Override // p976r.MenuC18814l
    /* JADX INFO: renamed from: f */
    public final boolean mo20100f(C18816n c18816n) {
        return this.f59781z.mo20100f(c18816n);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f59780A;
    }

    @Override // p976r.MenuC18814l
    /* JADX INFO: renamed from: j */
    public final String mo20101j() {
        C18816n c18816n = this.f59780A;
        int i10 = c18816n != null ? c18816n.f59875a : 0;
        if (i10 == 0) {
            return null;
        }
        return AbstractC10763a.m11048f(i10, "android:menu:actionviewstates:");
    }

    @Override // p976r.MenuC18814l
    /* JADX INFO: renamed from: k */
    public final MenuC18814l mo20102k() {
        return this.f59781z.mo20102k();
    }

    @Override // p976r.MenuC18814l
    /* JADX INFO: renamed from: m */
    public final boolean mo20103m() {
        return this.f59781z.mo20103m();
    }

    @Override // p976r.MenuC18814l
    /* JADX INFO: renamed from: n */
    public final boolean mo20104n() {
        return this.f59781z.mo20104n();
    }

    @Override // p976r.MenuC18814l
    /* JADX INFO: renamed from: o */
    public final boolean mo20105o() {
        return this.f59781z.mo20105o();
    }

    @Override // p976r.MenuC18814l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z6) {
        this.f59781z.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m20132u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m20132u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m20132u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f59780A.setIcon(drawable);
        return this;
    }

    @Override // p976r.MenuC18814l, android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f59781z.setQwertyMode(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        m20132u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        m20132u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f59780A.setIcon(i10);
        return this;
    }
}
