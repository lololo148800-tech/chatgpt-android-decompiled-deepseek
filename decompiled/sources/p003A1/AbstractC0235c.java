package p003A1;

import android.content.Context;
import android.content.IntentFilter;
import android.gov.nist.core.Separators;
import android.view.MenuItem;
import android.view.View;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1015t2.InterfaceMenuItemC19750a;
import p1072w2.C20791c;
import p109E3.C2285i;
import p1113xn.AbstractC21329w;
import p588Y2.C9614S;
import p594Y9.AbstractC9991w4;
import p692d0.C12959L;
import p857kl.AbstractC16474v;
import p857kl.C16473u;
import p893n.LayoutInflaterFactory2C17390v;
import p909nm.AbstractC17681o;
import p976r.MenuItemC18821s;

/* JADX INFO: renamed from: A1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0235c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f877a;

    /* JADX INFO: renamed from: b */
    public Object f878b;

    /* JADX INFO: renamed from: c */
    public Object f879c;

    public /* synthetic */ AbstractC0235c(Object obj, int i10, Object obj2) {
        this.f877a = i10;
        this.f878b = obj;
        this.f879c = obj2;
    }

    /* JADX INFO: renamed from: c */
    public void m769c() {
        C2285i c2285i = (C2285i) this.f878b;
        if (c2285i != null) {
            try {
                ((LayoutInflaterFactory2C17390v) this.f879c).f55572w0.unregisterReceiver(c2285i);
            } catch (IllegalArgumentException unused) {
            }
            this.f878b = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m770d() {
        C9614S c9614s = (C9614S) this.f878b;
        C20791c c20791c = (C20791c) this.f879c;
        LinkedHashSet linkedHashSet = c9614s.f28952e;
        if (linkedHashSet.remove(c20791c) && linkedHashSet.isEmpty()) {
            c9614s.m10156b();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract IntentFilter mo771e();

    /* JADX INFO: renamed from: f */
    public abstract int[] mo772f(int i10);

    /* JADX INFO: renamed from: g */
    public abstract int mo773g();

    /* JADX INFO: renamed from: h */
    public MenuItem m774h(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC19750a)) {
            return menuItem;
        }
        InterfaceMenuItemC19750a interfaceMenuItemC19750a = (InterfaceMenuItemC19750a) menuItem;
        if (((C12959L) this.f879c) == null) {
            this.f879c = new C12959L(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C12959L) this.f879c).get(interfaceMenuItemC19750a);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC18821s menuItemC18821s = new MenuItemC18821s((Context) this.f878b, interfaceMenuItemC19750a);
        ((C12959L) this.f879c).put(interfaceMenuItemC19750a, menuItemC18821s);
        return menuItemC18821s;
    }

    /* JADX INFO: renamed from: i */
    public int[] m775i(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = (int[]) this.f879c;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    /* JADX INFO: renamed from: j */
    public String m776j() {
        String str = (String) this.f878b;
        if (str != null) {
            return str;
        }
        AbstractC16544l.m18103p("text");
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m777k() {
        C9614S c9614s = (C9614S) this.f878b;
        View view = c9614s.f28950c.f33135Q0;
        AbstractC16544l.m18093f(view, "operation.fragment.mView");
        int iM10634c = AbstractC9991w4.m10634c(view);
        int i10 = c9614s.f28948a;
        return iM10634c == i10 || !(iM10634c == 2 || i10 == 2);
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo778l();

    /* JADX INFO: renamed from: m */
    public String m779m(String name) {
        AbstractC16544l.m18094g(name, "name");
        List list = (List) this.f879c;
        int iM19381j = AbstractC17681o.m19381j(list);
        if (iM19381j < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            C16473u c16473u = (C16473u) list.get(i10);
            if (AbstractC21329w.m21726m(c16473u.f51112a, name)) {
                return c16473u.f51113b;
            }
            if (i10 == iM19381j) {
                return null;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract int[] mo780n(int i10);

    /* JADX INFO: renamed from: o */
    public void m781o() {
        m769c();
        IntentFilter intentFilterMo771e = mo771e();
        if (intentFilterMo771e.countActions() == 0) {
            return;
        }
        if (((C2285i) this.f878b) == null) {
            this.f878b = new C2285i(this, 3);
        }
        ((LayoutInflaterFactory2C17390v) this.f879c).f55572w0.registerReceiver((C2285i) this.f878b, intentFilterMo771e);
    }

    public String toString() {
        switch (this.f877a) {
            case 3:
                List<C16473u> list = (List) this.f879c;
                boolean zIsEmpty = list.isEmpty();
                String str = (String) this.f878b;
                if (zIsEmpty) {
                    return str;
                }
                int length = str.length();
                int i10 = 0;
                int length2 = 0;
                for (C16473u c16473u : list) {
                    length2 += c16473u.f51113b.length() + c16473u.f51112a.length() + 3;
                }
                StringBuilder sb2 = new StringBuilder(length + length2);
                sb2.append(str);
                int iM19381j = AbstractC17681o.m19381j(list);
                if (iM19381j >= 0) {
                    while (true) {
                        C16473u c16473u2 = (C16473u) list.get(i10);
                        sb2.append("; ");
                        sb2.append(c16473u2.f51112a);
                        sb2.append(Separators.EQUALS);
                        String str2 = c16473u2.f51113b;
                        if (AbstractC16474v.m18045a(str2)) {
                            sb2.append(AbstractC16474v.m18046b(str2));
                        } else {
                            sb2.append(str2);
                        }
                        if (i10 != iM19381j) {
                            i10++;
                        }
                    }
                }
                String string = sb2.toString();
                AbstractC16544l.m18091d(string);
                return string;
            default:
                return super.toString();
        }
    }

    public AbstractC0235c(String content, List parameters) {
        this.f877a = 3;
        AbstractC16544l.m18094g(content, "content");
        AbstractC16544l.m18094g(parameters, "parameters");
        this.f878b = content;
        this.f879c = parameters;
    }

    public AbstractC0235c(Context context) {
        this.f877a = 5;
        this.f878b = context;
    }

    public AbstractC0235c() {
        this.f877a = 0;
        this.f879c = new int[2];
    }

    public AbstractC0235c(LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v) {
        this.f877a = 4;
        this.f879c = layoutInflaterFactory2C17390v;
    }
}
