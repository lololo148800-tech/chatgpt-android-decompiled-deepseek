package androidx.appcompat.view;

import android.content.res.ColorStateList;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p030B2.AbstractC0773o;
import p1015t2.InterfaceMenuItemC19750a;
import p976r.ActionProviderVisibilityListenerC18817o;
import p976r.C18816n;
import p976r.MenuItemC18821s;

/* JADX INFO: renamed from: androidx.appcompat.view.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10824g {

    /* JADX INFO: renamed from: A */
    public CharSequence f32097A;

    /* JADX INFO: renamed from: B */
    public CharSequence f32098B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C10825h f32101E;

    /* JADX INFO: renamed from: a */
    public final Menu f32102a;

    /* JADX INFO: renamed from: h */
    public boolean f32109h;

    /* JADX INFO: renamed from: i */
    public int f32110i;

    /* JADX INFO: renamed from: j */
    public int f32111j;

    /* JADX INFO: renamed from: k */
    public CharSequence f32112k;

    /* JADX INFO: renamed from: l */
    public CharSequence f32113l;

    /* JADX INFO: renamed from: m */
    public int f32114m;

    /* JADX INFO: renamed from: n */
    public char f32115n;

    /* JADX INFO: renamed from: o */
    public int f32116o;

    /* JADX INFO: renamed from: p */
    public char f32117p;

    /* JADX INFO: renamed from: q */
    public int f32118q;

    /* JADX INFO: renamed from: r */
    public int f32119r;

    /* JADX INFO: renamed from: s */
    public boolean f32120s;

    /* JADX INFO: renamed from: t */
    public boolean f32121t;

    /* JADX INFO: renamed from: u */
    public boolean f32122u;

    /* JADX INFO: renamed from: v */
    public int f32123v;

    /* JADX INFO: renamed from: w */
    public int f32124w;

    /* JADX INFO: renamed from: x */
    public String f32125x;

    /* JADX INFO: renamed from: y */
    public String f32126y;

    /* JADX INFO: renamed from: z */
    public ActionProviderVisibilityListenerC18817o f32127z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f32099C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f32100D = null;

    /* JADX INFO: renamed from: b */
    public int f32103b = 0;

    /* JADX INFO: renamed from: c */
    public int f32104c = 0;

    /* JADX INFO: renamed from: d */
    public int f32105d = 0;

    /* JADX INFO: renamed from: e */
    public int f32106e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f32107f = true;

    /* JADX INFO: renamed from: g */
    public boolean f32108g = true;

    public C10824g(C10825h c10825h, Menu menu) {
        this.f32101E = c10825h;
        this.f32102a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m11114a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f32101E.f32132c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            AbstractC15256t.m16483u("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11115b(MenuItem menuItem) {
        boolean z6 = false;
        menuItem.setChecked(this.f32120s).setVisible(this.f32121t).setEnabled(this.f32122u).setCheckable(this.f32119r >= 1).setTitleCondensed(this.f32113l).setIcon(this.f32114m);
        int i10 = this.f32123v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        String str = this.f32126y;
        C10825h c10825h = this.f32101E;
        if (str != null) {
            if (c10825h.f32132c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c10825h.f32133d == null) {
                c10825h.f32133d = C10825h.m11116a(c10825h.f32132c);
            }
            Object obj = c10825h.f32133d;
            String str2 = this.f32126y;
            MenuItemOnMenuItemClickListenerC10823f menuItemOnMenuItemClickListenerC10823f = new MenuItemOnMenuItemClickListenerC10823f();
            menuItemOnMenuItemClickListenerC10823f.f32095a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC10823f.f32096b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC10823f.f32094c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC10823f);
            } catch (Exception e10) {
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbM11058p.append(cls.getName());
                InflateException inflateException = new InflateException(sbM11058p.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f32119r >= 2) {
            if (menuItem instanceof C18816n) {
                C18816n c18816n = (C18816n) menuItem;
                c18816n.f59898x = (c18816n.f59898x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC18821s) {
                MenuItemC18821s menuItemC18821s = (MenuItemC18821s) menuItem;
                try {
                    Method method = menuItemC18821s.f59910e;
                    InterfaceMenuItemC19750a interfaceMenuItemC19750a = menuItemC18821s.f59909d;
                    if (method == null) {
                        menuItemC18821s.f59910e = interfaceMenuItemC19750a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC18821s.f59910e.invoke(interfaceMenuItemC19750a, Boolean.TRUE);
                } catch (Exception e11) {
                    AbstractC15256t.m16483u("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str3 = this.f32125x;
        if (str3 != null) {
            menuItem.setActionView((View) m11114a(str3, C10825h.f32128e, c10825h.f32130a));
            z6 = true;
        }
        int i11 = this.f32124w;
        if (i11 > 0) {
            if (z6) {
                AbstractC15256t.m16482t("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o = this.f32127z;
        if (actionProviderVisibilityListenerC18817o != null) {
            if (menuItem instanceof InterfaceMenuItemC19750a) {
                ((InterfaceMenuItemC19750a) menuItem).mo20106a(actionProviderVisibilityListenerC18817o);
            } else {
                AbstractC15256t.m16482t("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f32097A;
        boolean z10 = menuItem instanceof InterfaceMenuItemC19750a;
        if (z10) {
            ((InterfaceMenuItemC19750a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0773o.m1725i(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f32098B;
        if (z10) {
            ((InterfaceMenuItemC19750a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0773o.m1729m(menuItem, charSequence2);
        }
        char c9 = this.f32115n;
        int i12 = this.f32116o;
        if (z10) {
            ((InterfaceMenuItemC19750a) menuItem).setAlphabeticShortcut(c9, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0773o.m1723g(menuItem, c9, i12);
        }
        char c10 = this.f32117p;
        int i13 = this.f32118q;
        if (z10) {
            ((InterfaceMenuItemC19750a) menuItem).setNumericShortcut(c10, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0773o.m1728l(menuItem, c10, i13);
        }
        PorterDuff.Mode mode = this.f32100D;
        if (mode != null) {
            if (z10) {
                ((InterfaceMenuItemC19750a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0773o.m1727k(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f32099C;
        if (colorStateList != null) {
            if (z10) {
                ((InterfaceMenuItemC19750a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0773o.m1726j(menuItem, colorStateList);
            }
        }
    }
}
