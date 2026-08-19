package p976r;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p030B2.AbstractC0739U;
import p030B2.AbstractC0761i;

/* JADX INFO: renamed from: r.l */
/* JADX INFO: loaded from: classes.dex */
public class MenuC18814l implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f59844y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f59845a;

    /* JADX INFO: renamed from: b */
    public final Resources f59846b;

    /* JADX INFO: renamed from: c */
    public boolean f59847c;

    /* JADX INFO: renamed from: d */
    public final boolean f59848d;

    /* JADX INFO: renamed from: e */
    public InterfaceC18812j f59849e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f59850f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f59851g;

    /* JADX INFO: renamed from: h */
    public boolean f59852h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f59853i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f59854j;

    /* JADX INFO: renamed from: k */
    public boolean f59855k;

    /* JADX INFO: renamed from: m */
    public CharSequence f59857m;

    /* JADX INFO: renamed from: n */
    public Drawable f59858n;

    /* JADX INFO: renamed from: o */
    public View f59859o;

    /* JADX INFO: renamed from: v */
    public C18816n f59866v;

    /* JADX INFO: renamed from: x */
    public boolean f59868x;

    /* JADX INFO: renamed from: l */
    public int f59856l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f59860p = false;

    /* JADX INFO: renamed from: q */
    public boolean f59861q = false;

    /* JADX INFO: renamed from: r */
    public boolean f59862r = false;

    /* JADX INFO: renamed from: s */
    public boolean f59863s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f59864t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f59865u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f59867w = false;

    public MenuC18814l(Context context) {
        boolean zM1685q;
        boolean z6 = false;
        this.f59845a = context;
        Resources resources = context.getResources();
        this.f59846b = resources;
        this.f59850f = new ArrayList();
        this.f59851g = new ArrayList();
        this.f59852h = true;
        this.f59853i = new ArrayList();
        this.f59854j = new ArrayList();
        this.f59855k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0739U.f2102a;
            if (Build.VERSION.SDK_INT >= 28) {
                zM1685q = AbstractC0761i.m1685q(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM1685q = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM1685q) {
                z6 = true;
            }
        }
        this.f59848d = z6;
    }

    /* JADX INFO: renamed from: a */
    public final C18816n m20120a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f59844y[i14] << 16) | (65535 & i12);
        C18816n c18816n = new C18816n(this, i10, i11, i12, i15, charSequence, this.f59856l);
        ArrayList arrayList = this.f59850f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C18816n) arrayList.get(size)).f59878d <= i15) {
                i13 = size + 1;
                arrayList.add(i13, c18816n);
                m20127p(true);
                return c18816n;
            }
        }
        i13 = 0;
        arrayList.add(i13, c18816n);
        m20127p(true);
        return c18816n;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m20120a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f59845a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C18816n c18816nM20120a = m20120a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            c18816nM20120a.setIcon(resolveInfo.loadIcon(packageManager));
            c18816nM20120a.f59881g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = c18816nM20120a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m20121b(InterfaceC18826x interfaceC18826x, Context context) {
        this.f59865u.add(new WeakReference(interfaceC18826x));
        interfaceC18826x.mo20117k(context, this);
        this.f59855k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m20122c(boolean z6) {
        if (this.f59863s) {
            return;
        }
        this.f59863s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f59865u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC18826x interfaceC18826x = (InterfaceC18826x) weakReference.get();
            if (interfaceC18826x == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC18826x.mo20086c(this, z6);
            }
        }
        this.f59863s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C18816n c18816n = this.f59866v;
        if (c18816n != null) {
            mo20098d(c18816n);
        }
        this.f59850f.clear();
        m20127p(true);
    }

    public final void clearHeader() {
        this.f59858n = null;
        this.f59857m = null;
        this.f59859o = null;
        m20127p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m20122c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo20098d(C18816n c18816n) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f59865u;
        boolean zMo20116j = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f59866v == c18816n) {
            m20134w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC18826x interfaceC18826x = (InterfaceC18826x) weakReference.get();
                if (interfaceC18826x != null) {
                    zMo20116j = interfaceC18826x.mo20116j(c18816n);
                    if (zMo20116j) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m20133v();
            if (zMo20116j) {
                this.f59866v = null;
            }
        }
        return zMo20116j;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo20099e(MenuC18814l menuC18814l, MenuItem menuItem) {
        InterfaceC18812j interfaceC18812j = this.f59849e;
        return interfaceC18812j != null && interfaceC18812j.mo10219p(menuC18814l, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo20100f(C18816n c18816n) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f59865u;
        boolean zMo20115d = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m20134w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC18826x interfaceC18826x = (InterfaceC18826x) weakReference.get();
            if (interfaceC18826x != null) {
                zMo20115d = interfaceC18826x.mo20115d(c18816n);
                if (zMo20115d) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m20133v();
        if (zMo20115d) {
            this.f59866v = c18816n;
        }
        return zMo20115d;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f59850f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C18816n c18816n = (C18816n) arrayList.get(i11);
            if (c18816n.f59875a == i10) {
                return c18816n;
            }
            if (c18816n.hasSubMenu() && (menuItemFindItem = c18816n.f59889o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C18816n m20123g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f59864t;
        arrayList.clear();
        m20124h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C18816n) arrayList.get(0);
        }
        boolean zMo20104n = mo20104n();
        for (int i11 = 0; i11 < size; i11++) {
            C18816n c18816n = (C18816n) arrayList.get(i11);
            char c9 = zMo20104n ? c18816n.f59884j : c18816n.f59882h;
            char[] cArr = keyData.meta;
            if ((c9 == cArr[0] && (metaState & 2) == 0) || ((c9 == cArr[2] && (metaState & 2) != 0) || (zMo20104n && c9 == '\b' && i10 == 67))) {
                return c18816n;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f59850f.get(i10);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX INFO: renamed from: h */
    public final void m20124h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        boolean zMo20104n = mo20104n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList2 = this.f59850f;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                C18816n c18816n = (C18816n) arrayList2.get(i11);
                if (c18816n.hasSubMenu()) {
                    c18816n.f59889o.m20124h(arrayList, i10, keyEvent);
                }
                char c9 = zMo20104n ? c18816n.f59884j : c18816n.f59882h;
                if ((modifiers & 69647) == ((zMo20104n ? c18816n.f59885k : c18816n.f59883i) & 69647) && c9 != 0) {
                    char[] cArr = keyData.meta;
                    if (c9 != cArr[0] && c9 != cArr[2]) {
                        if (zMo20104n && c9 == '\b') {
                            if (i10 == 67) {
                            }
                        }
                    }
                    if (c18816n.isEnabled()) {
                        arrayList.add(c18816n);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f59868x) {
            return true;
        }
        ArrayList arrayList = this.f59850f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C18816n) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m20125i() {
        ArrayList arrayListM20126l = m20126l();
        if (this.f59855k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f59865u;
            boolean zMo20087e = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC18826x interfaceC18826x = (InterfaceC18826x) weakReference.get();
                if (interfaceC18826x == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo20087e |= interfaceC18826x.mo20087e();
                }
            }
            ArrayList arrayList = this.f59853i;
            ArrayList arrayList2 = this.f59854j;
            if (zMo20087e) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM20126l.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C18816n c18816n = (C18816n) arrayListM20126l.get(i10);
                    if (c18816n.m20138f()) {
                        arrayList.add(c18816n);
                    } else {
                        arrayList2.add(c18816n);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m20126l());
            }
            this.f59855k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return m20123g(i10, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo20101j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m20126l() {
        boolean z6 = this.f59852h;
        ArrayList arrayList = this.f59851g;
        if (!z6) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f59850f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            C18816n c18816n = (C18816n) arrayList2.get(i10);
            if (c18816n.isVisible()) {
                arrayList.add(c18816n);
            }
        }
        this.f59852h = false;
        this.f59855k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo20103m() {
        return this.f59867w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo20104n() {
        return this.f59847c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo20105o() {
        return this.f59848d;
    }

    /* JADX INFO: renamed from: p */
    public final void m20127p(boolean z6) {
        if (this.f59860p) {
            this.f59861q = true;
            if (z6) {
                this.f59862r = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f59852h = true;
            this.f59855k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f59865u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m20134w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC18826x interfaceC18826x = (InterfaceC18826x) weakReference.get();
            if (interfaceC18826x == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC18826x.mo20089h();
            }
        }
        m20133v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return m20128q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        C18816n c18816nM20123g = m20123g(i10, keyEvent);
        boolean zM20128q = c18816nM20123g != null ? m20128q(c18816nM20123g, null, i11) : false;
        if ((i11 & 2) != 0) {
            m20122c(true);
        }
        return zM20128q;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public final boolean m20128q(MenuItem menuItem, InterfaceC18826x interfaceC18826x, int i10) {
        ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o;
        boolean zExpandActionView;
        ActionProviderVisibilityListenerC18817o actionProviderVisibilityListenerC18817o2;
        boolean z6;
        SubMenuC18802D subMenuC18802D;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        InterfaceC18826x interfaceC18826x2;
        C18816n c18816n = (C18816n) menuItem;
        boolean zMo20088g = false;
        if (c18816n == null || !c18816n.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c18816n.f59890p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c18816n)) {
            MenuC18814l menuC18814l = c18816n.f59888n;
            if (menuC18814l.mo20099e(menuC18814l, c18816n)) {
                zExpandActionView = true;
            } else {
                Intent intent = c18816n.f59881g;
                if (intent != null) {
                    try {
                        menuC18814l.f59845a.startActivity(intent);
                    } catch (ActivityNotFoundException e10) {
                        AbstractC15256t.m16466d("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                        actionProviderVisibilityListenerC18817o = c18816n.f59872A;
                        if (actionProviderVisibilityListenerC18817o == null) {
                        }
                        zExpandActionView = false;
                        actionProviderVisibilityListenerC18817o2 = c18816n.f59872A;
                        if (actionProviderVisibilityListenerC18817o2 == null) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (c18816n.m20137e()) {
                            zExpandActionView |= c18816n.expandActionView();
                            if (zExpandActionView) {
                                m20122c(true);
                            }
                        } else if (c18816n.hasSubMenu()) {
                            if ((i10 & 4) == 0) {
                                m20122c(false);
                            }
                            if (!c18816n.hasSubMenu()) {
                                SubMenuC18802D subMenuC18802D2 = new SubMenuC18802D(this.f59845a, this, c18816n);
                                c18816n.f59889o = subMenuC18802D2;
                                subMenuC18802D2.setHeaderTitle(c18816n.f59879e);
                            }
                            subMenuC18802D = c18816n.f59889o;
                            if (z6) {
                                actionProviderVisibilityListenerC18817o2.f59903c.getClass();
                                actionProviderVisibilityListenerC18817o2.f59902b.onPrepareSubMenu(subMenuC18802D);
                            }
                            copyOnWriteArrayList = this.f59865u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (interfaceC18826x != null) {
                                }
                                for (WeakReference weakReference : copyOnWriteArrayList) {
                                    interfaceC18826x2 = (InterfaceC18826x) weakReference.get();
                                    if (interfaceC18826x2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zMo20088g) {
                                        zMo20088g = interfaceC18826x2.mo20088g(subMenuC18802D);
                                    }
                                }
                            }
                            zExpandActionView |= zMo20088g;
                            if (!zExpandActionView) {
                                m20122c(true);
                            }
                        } else {
                            if ((i10 & 4) == 0) {
                                m20122c(false);
                            }
                            if (!c18816n.hasSubMenu()) {
                                SubMenuC18802D subMenuC18802D3 = new SubMenuC18802D(this.f59845a, this, c18816n);
                                c18816n.f59889o = subMenuC18802D3;
                                subMenuC18802D3.setHeaderTitle(c18816n.f59879e);
                            }
                            subMenuC18802D = c18816n.f59889o;
                            if (z6) {
                                actionProviderVisibilityListenerC18817o2.f59903c.getClass();
                                actionProviderVisibilityListenerC18817o2.f59902b.onPrepareSubMenu(subMenuC18802D);
                            }
                            copyOnWriteArrayList = this.f59865u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zMo20088g = interfaceC18826x != null ? interfaceC18826x.mo20088g(subMenuC18802D) : false;
                                while (r8.hasNext()) {
                                    interfaceC18826x2 = (InterfaceC18826x) weakReference.get();
                                    if (interfaceC18826x2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zMo20088g) {
                                        zMo20088g = interfaceC18826x2.mo20088g(subMenuC18802D);
                                    }
                                }
                            }
                            zExpandActionView |= zMo20088g;
                            if (!zExpandActionView) {
                                m20122c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    actionProviderVisibilityListenerC18817o = c18816n.f59872A;
                    if (actionProviderVisibilityListenerC18817o == null && actionProviderVisibilityListenerC18817o.f59902b.onPerformDefaultAction()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        actionProviderVisibilityListenerC18817o2 = c18816n.f59872A;
        if (actionProviderVisibilityListenerC18817o2 == null && actionProviderVisibilityListenerC18817o2.f59902b.hasSubMenu()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (c18816n.m20137e()) {
            zExpandActionView |= c18816n.expandActionView();
            if (zExpandActionView) {
                m20122c(true);
            }
        } else if (c18816n.hasSubMenu() || z6) {
            if ((i10 & 4) == 0) {
                m20122c(false);
            }
            if (!c18816n.hasSubMenu()) {
                SubMenuC18802D subMenuC18802D4 = new SubMenuC18802D(this.f59845a, this, c18816n);
                c18816n.f59889o = subMenuC18802D4;
                subMenuC18802D4.setHeaderTitle(c18816n.f59879e);
            }
            subMenuC18802D = c18816n.f59889o;
            if (z6) {
                actionProviderVisibilityListenerC18817o2.f59903c.getClass();
                actionProviderVisibilityListenerC18817o2.f59902b.onPrepareSubMenu(subMenuC18802D);
            }
            copyOnWriteArrayList = this.f59865u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (interfaceC18826x != null) {
                }
                while (r8.hasNext()) {
                    interfaceC18826x2 = (InterfaceC18826x) weakReference.get();
                    if (interfaceC18826x2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo20088g) {
                        zMo20088g = interfaceC18826x2.mo20088g(subMenuC18802D);
                    }
                }
            }
            zExpandActionView |= zMo20088g;
            if (!zExpandActionView) {
                m20122c(true);
            }
        } else if ((i10 & 1) == 0) {
            m20122c(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: r */
    public final void m20129r(InterfaceC18826x interfaceC18826x) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f59865u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC18826x interfaceC18826x2 = (InterfaceC18826x) weakReference.get();
            if (interfaceC18826x2 == null || interfaceC18826x2 == interfaceC18826x) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f59850f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((C18816n) arrayList.get(i12)).f59876b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((C18816n) arrayList.get(i12)).f59876b != i10) {
                    break;
                }
                if (i12 >= 0) {
                    ArrayList arrayList2 = this.f59850f;
                    if (i12 < arrayList2.size()) {
                        arrayList2.remove(i12);
                    }
                }
                i11 = i13;
            }
            m20127p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f59850f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((C18816n) arrayList.get(i11)).f59875a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            ArrayList arrayList2 = this.f59850f;
            if (i11 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i11);
            m20127p(true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m20130s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo20101j());
        int size = this.f59850f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC18802D) item.getSubMenu()).m20130s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z6, boolean z10) {
        ArrayList arrayList = this.f59850f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C18816n c18816n = (C18816n) arrayList.get(i11);
            if (c18816n.f59876b == i10) {
                c18816n.f59898x = (c18816n.f59898x & (-5)) | (z10 ? 4 : 0);
                c18816n.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f59867w = z6;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z6) {
        ArrayList arrayList = this.f59850f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C18816n c18816n = (C18816n) arrayList.get(i11);
            if (c18816n.f59876b == i10) {
                c18816n.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z6) {
        ArrayList arrayList = this.f59850f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C18816n c18816n = (C18816n) arrayList.get(i11);
            if (c18816n.f59876b == i10) {
                int i12 = c18816n.f59898x;
                int i13 = (i12 & (-9)) | (z6 ? 0 : 8);
                c18816n.f59898x = i13;
                if (i12 != i13) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            m20127p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f59847c = z6;
        m20127p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f59850f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m20131t(Bundle bundle) {
        int size = this.f59850f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC18802D) item.getSubMenu()).m20131t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo20101j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m20132u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f59859o = view;
            this.f59857m = null;
            this.f59858n = null;
        } else {
            if (i10 > 0) {
                this.f59857m = this.f59846b.getText(i10);
            } else if (charSequence != null) {
                this.f59857m = charSequence;
            }
            if (i11 > 0) {
                this.f59858n = this.f59845a.getDrawable(i11);
            } else if (drawable != null) {
                this.f59858n = drawable;
            }
            this.f59859o = null;
        }
        m20127p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m20133v() {
        this.f59860p = false;
        if (this.f59861q) {
            this.f59861q = false;
            m20127p(this.f59862r);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m20134w() {
        if (this.f59860p) {
            return;
        }
        this.f59860p = true;
        this.f59861q = false;
        this.f59862r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return m20120a(0, 0, 0, this.f59846b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f59846b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m20120a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        C18816n c18816nM20120a = m20120a(i10, i11, i12, charSequence);
        SubMenuC18802D subMenuC18802D = new SubMenuC18802D(this.f59845a, this, c18816nM20120a);
        c18816nM20120a.f59889o = subMenuC18802D;
        subMenuC18802D.setHeaderTitle(c18816nM20120a.f59879e);
        return subMenuC18802D;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return m20120a(i10, i11, i12, this.f59846b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f59846b.getString(i13));
    }

    /* JADX INFO: renamed from: k */
    public MenuC18814l mo20102k() {
        return this;
    }
}
