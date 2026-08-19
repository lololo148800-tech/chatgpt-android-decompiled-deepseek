package p1015t2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p976r.ActionProviderVisibilityListenerC18817o;

/* JADX INFO: renamed from: t2.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC19750a extends MenuItem {
    /* JADX INFO: renamed from: a */
    InterfaceMenuItemC19750a mo20106a(ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o);

    /* JADX INFO: renamed from: b */
    ActionProviderVisibilityListenerC18817o mo20107b();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c9, int i10);

    @Override // android.view.MenuItem
    InterfaceMenuItemC19750a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c9, int i10);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c9, char c10, int i10, int i11);

    @Override // android.view.MenuItem
    InterfaceMenuItemC19750a setTooltipText(CharSequence charSequence);
}
