package p976r;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p1015t2.InterfaceMenuItemC19750a;
import p571X9.AbstractC9106B3;
import p784hb.C14437f;

/* JADX INFO: renamed from: r.n */
/* JADX INFO: loaded from: classes.dex */
public final class C18816n implements InterfaceMenuItemC19750a {

    /* JADX INFO: renamed from: A */
    public ActionProviderVisibilityListenerC18817o f59872A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f59873B;

    /* JADX INFO: renamed from: a */
    public final int f59875a;

    /* JADX INFO: renamed from: b */
    public final int f59876b;

    /* JADX INFO: renamed from: c */
    public final int f59877c;

    /* JADX INFO: renamed from: d */
    public final int f59878d;

    /* JADX INFO: renamed from: e */
    public CharSequence f59879e;

    /* JADX INFO: renamed from: f */
    public CharSequence f59880f;

    /* JADX INFO: renamed from: g */
    public Intent f59881g;

    /* JADX INFO: renamed from: h */
    public char f59882h;

    /* JADX INFO: renamed from: j */
    public char f59884j;

    /* JADX INFO: renamed from: l */
    public Drawable f59886l;

    /* JADX INFO: renamed from: n */
    public final MenuC18814l f59888n;

    /* JADX INFO: renamed from: o */
    public SubMenuC18802D f59889o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f59890p;

    /* JADX INFO: renamed from: q */
    public CharSequence f59891q;

    /* JADX INFO: renamed from: r */
    public CharSequence f59892r;

    /* JADX INFO: renamed from: y */
    public int f59899y;

    /* JADX INFO: renamed from: z */
    public View f59900z;

    /* JADX INFO: renamed from: i */
    public int f59883i = 4096;

    /* JADX INFO: renamed from: k */
    public int f59885k = 4096;

    /* JADX INFO: renamed from: m */
    public int f59887m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f59893s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f59894t = null;

    /* JADX INFO: renamed from: u */
    public boolean f59895u = false;

    /* JADX INFO: renamed from: v */
    public boolean f59896v = false;

    /* JADX INFO: renamed from: w */
    public boolean f59897w = false;

    /* JADX INFO: renamed from: x */
    public int f59898x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f59874C = false;

    public C18816n(MenuC18814l menuC18814l, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f59888n = menuC18814l;
        this.f59875a = i11;
        this.f59876b = i10;
        this.f59877c = i12;
        this.f59878d = i13;
        this.f59879e = charSequence;
        this.f59899y = i14;
    }

    /* JADX INFO: renamed from: c */
    public static void m20135c(int i10, int i11, String str, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // p1015t2.InterfaceMenuItemC19750a
    /* JADX INFO: renamed from: a */
    public final InterfaceMenuItemC19750a mo20106a(ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o) {
        this.f59900z = null;
        this.f59872A = actionProviderVisibilityListenerC18817o;
        this.f59888n.m20127p(true);
        ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o2 = this.f59872A;
        if (actionProviderVisibilityListenerC18817o2 != null) {
            actionProviderVisibilityListenerC18817o2.f59901a = new C14437f(this);
            actionProviderVisibilityListenerC18817o2.f59902b.setVisibilityListener(actionProviderVisibilityListenerC18817o2);
        }
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC18817o mo20107b() {
        return this.f59872A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f59899y & 8) == 0) {
            return false;
        }
        if (this.f59900z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f59873B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f59888n.mo20098d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m20136d(Drawable drawable) {
        if (drawable != null && this.f59897w && (this.f59895u || this.f59896v)) {
            drawable = drawable.mutate();
            if (this.f59895u) {
                drawable.setTintList(this.f59893s);
            }
            if (this.f59896v) {
                drawable.setTintMode(this.f59894t);
            }
            this.f59897w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20137e() {
        ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o;
        if ((this.f59899y & 8) == 0) {
            return false;
        }
        if (this.f59900z == null && (actionProviderVisibilityListenerC18817o = this.f59872A) != null) {
            this.f59900z = actionProviderVisibilityListenerC18817o.f59902b.onCreateActionView(this);
        }
        return this.f59900z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m20137e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f59873B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f59888n.mo20100f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20138f() {
        return (this.f59898x & 32) == 32;
    }

    /* JADX INFO: renamed from: g */
    public final void m20139g(boolean z6) {
        if (z6) {
            this.f59898x |= 32;
        } else {
            this.f59898x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f59900z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o = this.f59872A;
        if (actionProviderVisibilityListenerC18817o == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC18817o.f59902b.onCreateActionView(this);
        this.f59900z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f59885k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f59884j;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f59891q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f59876b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f59886l;
        if (drawable != null) {
            return m20136d(drawable);
        }
        int i10 = this.f59887m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableM9636b = AbstractC9106B3.m9636b(this.f59888n.f59845a, i10);
        this.f59887m = 0;
        this.f59886l = drawableM9636b;
        return m20136d(drawableM9636b);
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f59893s;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f59894t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f59881g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f59875a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f59883i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f59882h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f59877c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f59889o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f59879e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f59880f;
        return charSequence != null ? charSequence : this.f59879e;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f59892r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f59889o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f59874C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f59898x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f59898x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f59898x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o = this.f59872A;
        if (actionProviderVisibilityListenerC18817o == null || !actionProviderVisibilityListenerC18817o.f59902b.overridesItemVisibility()) {
            return (this.f59898x & 8) == 0;
        }
        return (this.f59898x & 8) == 0 && this.f59872A.f59902b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f59900z = view;
        this.f59872A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f59875a) > 0) {
            view.setId(i10);
        }
        MenuC18814l menuC18814l = this.f59888n;
        menuC18814l.f59855k = true;
        menuC18814l.m20127p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        if (this.f59884j == c9) {
            return this;
        }
        this.f59884j = Character.toLowerCase(c9);
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        int i10 = this.f59898x;
        int i11 = (z6 ? 1 : 0) | (i10 & (-2));
        this.f59898x = i11;
        if (i10 != i11) {
            this.f59888n.m20127p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        int i10 = this.f59898x;
        if ((i10 & 4) != 0) {
            MenuC18814l menuC18814l = this.f59888n;
            menuC18814l.getClass();
            ArrayList arrayList = menuC18814l.f59850f;
            int size = arrayList.size();
            menuC18814l.m20134w();
            for (int i11 = 0; i11 < size; i11++) {
                C18816n c18816n = (C18816n) arrayList.get(i11);
                if (c18816n.f59876b == this.f59876b && (c18816n.f59898x & 4) != 0 && c18816n.isCheckable()) {
                    boolean z10 = c18816n == this;
                    int i12 = c18816n.f59898x;
                    int i13 = (z10 ? 2 : 0) | (i12 & (-3));
                    c18816n.f59898x = i13;
                    if (i12 != i13) {
                        c18816n.f59888n.m20127p(false);
                    }
                }
            }
            menuC18814l.m20133v();
        } else {
            int i14 = (i10 & (-3)) | (z6 ? 2 : 0);
            this.f59898x = i14;
            if (i10 != i14) {
                this.f59888n.m20127p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.f59898x |= 16;
        } else {
            this.f59898x &= -17;
        }
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f59887m = 0;
        this.f59886l = drawable;
        this.f59897w = true;
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f59893s = colorStateList;
        this.f59895u = true;
        this.f59897w = true;
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f59894t = mode;
        this.f59896v = true;
        this.f59897w = true;
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f59881g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        if (this.f59882h == c9) {
            return this;
        }
        this.f59882h = c9;
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f59873B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f59890p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f59882h = c9;
        this.f59884j = Character.toLowerCase(c10);
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f59899y = i10;
        MenuC18814l menuC18814l = this.f59888n;
        menuC18814l.f59855k = true;
        menuC18814l.m20127p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f59879e = charSequence;
        this.f59888n.m20127p(false);
        SubMenuC18802D subMenuC18802D = this.f59889o;
        if (subMenuC18802D != null) {
            subMenuC18802D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f59880f = charSequence;
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        int i10 = this.f59898x;
        int i11 = (z6 ? 0 : 8) | (i10 & (-9));
        this.f59898x = i11;
        if (i10 != i11) {
            MenuC18814l menuC18814l = this.f59888n;
            menuC18814l.f59852h = true;
            menuC18814l.m20127p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f59879e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final InterfaceMenuItemC19750a setContentDescription(CharSequence charSequence) {
        this.f59891q = charSequence;
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final InterfaceMenuItemC19750a setTooltipText(CharSequence charSequence) {
        this.f59892r = charSequence;
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i10) {
        if (this.f59884j == c9 && this.f59885k == i10) {
            return this;
        }
        this.f59884j = Character.toLowerCase(c9);
        this.f59885k = KeyEvent.normalizeMetaState(i10);
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i10) {
        if (this.f59882h == c9 && this.f59883i == i10) {
            return this;
        }
        this.f59882h = c9;
        this.f59883i = KeyEvent.normalizeMetaState(i10);
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // p1015t2.InterfaceMenuItemC19750a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i10, int i11) {
        this.f59882h = c9;
        this.f59883i = KeyEvent.normalizeMetaState(i10);
        this.f59884j = Character.toLowerCase(c10);
        this.f59885k = KeyEvent.normalizeMetaState(i11);
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f59886l = null;
        this.f59887m = i10;
        this.f59897w = true;
        this.f59888n.m20127p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f59888n.f59845a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f59888n.f59845a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f59900z = viewInflate;
        this.f59872A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f59875a) > 0) {
            viewInflate.setId(i11);
        }
        MenuC18814l menuC18814l = this.f59888n;
        menuC18814l.f59855k = true;
        menuC18814l.m20127p(true);
        return this;
    }
}
