package p030B2;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p658b5.C11248s;
import p817j$.util.DesugarCollections;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0764j0 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final AbstractC0754e0 f2156a;

    /* JADX INFO: renamed from: b */
    public List f2157b;

    /* JADX INFO: renamed from: c */
    public ArrayList f2158c;

    /* JADX INFO: renamed from: d */
    public final HashMap f2159d;

    public C0764j0(AbstractC0754e0 abstractC0754e0) {
        super(abstractC0754e0.f2130Y);
        this.f2159d = new HashMap();
        this.f2156a = abstractC0754e0;
    }

    /* JADX INFO: renamed from: a */
    public final C0770m0 m1701a(WindowInsetsAnimation windowInsetsAnimation) {
        C0770m0 c0770m0 = (C0770m0) this.f2159d.get(windowInsetsAnimation);
        if (c0770m0 == null) {
            c0770m0 = new C0770m0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0770m0.f2166a = new C0766k0(windowInsetsAnimation);
            }
            this.f2159d.put(windowInsetsAnimation, c0770m0);
        }
        return c0770m0;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2156a.mo1615d(m1701a(windowInsetsAnimation));
        this.f2159d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        AbstractC0754e0 abstractC0754e0 = this.f2156a;
        m1701a(windowInsetsAnimation);
        abstractC0754e0.mo1616e();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2158c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2158c = arrayList2;
            this.f2157b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM1793j = AbstractC0791x.m1793j(list.get(size));
            C0770m0 c0770m0M1701a = m1701a(windowInsetsAnimationM1793j);
            c0770m0M1701a.f2166a.mo1705d(windowInsetsAnimationM1793j.getFraction());
            this.f2158c.add(c0770m0M1701a);
        }
        return this.f2156a.mo1617f(C0794y0.m1812g(null, windowInsets), this.f2157b).m1817f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        AbstractC0754e0 abstractC0754e0 = this.f2156a;
        m1701a(windowInsetsAnimation);
        C11248s c11248sMo1618g = abstractC0754e0.mo1618g(new C11248s(bounds));
        c11248sMo1618g.getClass();
        AbstractC0791x.m1795l();
        return AbstractC0791x.m1791h(((C18862c) c11248sMo1618g.f34081Z).m20173d(), ((C18862c) c11248sMo1618g.f34082o0).m20173d());
    }
}
