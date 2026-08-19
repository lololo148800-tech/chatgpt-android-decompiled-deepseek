package p976r;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p1015t2.InterfaceMenuItemC19750a;

/* JADX INFO: renamed from: r.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18803a implements InterfaceMenuItemC19750a {

    /* JADX INFO: renamed from: a */
    public CharSequence f59782a;

    /* JADX INFO: renamed from: b */
    public CharSequence f59783b;

    /* JADX INFO: renamed from: c */
    public Intent f59784c;

    /* JADX INFO: renamed from: d */
    public char f59785d;

    /* JADX INFO: renamed from: e */
    public int f59786e;

    /* JADX INFO: renamed from: f */
    public char f59787f;

    /* JADX INFO: renamed from: g */
    public int f59788g;

    /* JADX INFO: renamed from: h */
    public Drawable f59789h;

    /* JADX INFO: renamed from: i */
    public Context f59790i;

    /* JADX INFO: renamed from: j */
    public CharSequence f59791j;

    /* JADX INFO: renamed from: k */
    public CharSequence f59792k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f59793l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f59794m;

    /* JADX INFO: renamed from: n */
    public boolean f59795n;

    /* JADX INFO: renamed from: o */
    public boolean f59796o;

    /* JADX INFO: renamed from: p */
    public int f59797p;

    @Override // p1015t2.InterfaceMenuItemC19750a
    /* JADX INFO: renamed from: a */
    public final InterfaceMenuItemC19750a mo20106a(ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o) {
        throw new UnsupportedOperationException();
    }

    @Override // p1015t2.InterfaceMenuItemC19750a
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC18817o mo20107b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m20108c() {
        Drawable drawable = this.f59789h;
        if (drawable != null) {
            if (this.f59795n || this.f59796o) {
                this.f59789h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f59789h = drawableMutate;
                if (this.f59795n) {
                    drawableMutate.setTintList(this.f59793l);
                }
                if (this.f59796o) {
                    this.f59789h.setTintMode(this.f59794m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f59788g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f59787f;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f59791j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f59789h;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f59793l;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f59794m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f59784c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f59786e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f59785d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f59782a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f59783b;
        return charSequence != null ? charSequence : this.f59782a;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f59792k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f59797p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f59797p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f59797p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f59797p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        this.f59787f = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        this.f59797p = (z6 ? 1 : 0) | (this.f59797p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        this.f59797p = (z6 ? 2 : 0) | (this.f59797p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f59791j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        this.f59797p = (z6 ? 16 : 0) | (this.f59797p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f59789h = drawable;
        m20108c();
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f59793l = colorStateList;
        this.f59795n = true;
        m20108c();
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f59794m = mode;
        this.f59796o = true;
        m20108c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f59784c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        this.f59785d = c9;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f59785d = c9;
        this.f59787f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f59782a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f59783b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f59792k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        this.f59797p = (this.f59797p & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i10) {
        this.f59787f = Character.toLowerCase(c9);
        this.f59788g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final InterfaceMenuItemC19750a setContentDescription(CharSequence charSequence) {
        this.f59791j = charSequence;
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i10) {
        this.f59785d = c9;
        this.f59786e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f59782a = this.f59790i.getResources().getString(i10);
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final InterfaceMenuItemC19750a setTooltipText(CharSequence charSequence) {
        this.f59792k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f59789h = this.f59790i.getDrawable(i10);
        m20108c();
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i10, int i11) {
        this.f59785d = c9;
        this.f59786e = KeyEvent.normalizeMetaState(i10);
        this.f59787f = Character.toLowerCase(c10);
        this.f59788g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
