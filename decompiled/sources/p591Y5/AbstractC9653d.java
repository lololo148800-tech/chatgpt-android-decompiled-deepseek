package p591Y5;

import android.view.animation.BaseInterpolator;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p193Hf.C3354c1;
import p499U9.C7591u;
import p802i6.C14935a;

/* JADX INFO: renamed from: Y5.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9653d {

    /* JADX INFO: renamed from: c */
    public final InterfaceC9651b f29084c;

    /* JADX INFO: renamed from: e */
    public C15384c f29086e;

    /* JADX INFO: renamed from: a */
    public final ArrayList f29082a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public boolean f29083b = false;

    /* JADX INFO: renamed from: d */
    public float f29085d = 0.0f;

    /* JADX INFO: renamed from: f */
    public Object f29087f = null;

    /* JADX INFO: renamed from: g */
    public float f29088g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f29089h = -1.0f;

    public AbstractC9653d(List list) {
        InterfaceC9651b c3354c1;
        if (list.isEmpty()) {
            c3354c1 = new C7591u(20);
        } else {
            c3354c1 = list.size() == 1 ? new C3354c1(list) : new C9652c(list);
        }
        this.f29084c = c3354c1;
    }

    /* JADX INFO: renamed from: a */
    public final void m10230a(InterfaceC9650a interfaceC9650a) {
        this.f29082a.add(interfaceC9650a);
    }

    /* JADX INFO: renamed from: b */
    public float mo10231b() {
        if (this.f29089h == -1.0f) {
            this.f29089h = this.f29084c.mo4179y();
        }
        return this.f29089h;
    }

    /* JADX INFO: renamed from: c */
    public final float m10232c() {
        BaseInterpolator baseInterpolator;
        C14935a c14935aMo4176k = this.f29084c.mo4176k();
        if (c14935aMo4176k == null || c14935aMo4176k.m16097c() || (baseInterpolator = c14935aMo4176k.f46527d) == null) {
            return 0.0f;
        }
        return baseInterpolator.getInterpolation(m10233d());
    }

    /* JADX INFO: renamed from: d */
    public final float m10233d() {
        if (this.f29083b) {
            return 0.0f;
        }
        C14935a c14935aMo4176k = this.f29084c.mo4176k();
        if (c14935aMo4176k.m16097c()) {
            return 0.0f;
        }
        return (this.f29085d - c14935aMo4176k.m16096b()) / (c14935aMo4176k.m16095a() - c14935aMo4176k.m16096b());
    }

    /* JADX INFO: renamed from: e */
    public Object mo10234e() {
        BaseInterpolator baseInterpolator;
        float fM10233d = m10233d();
        C15384c c15384c = this.f29086e;
        InterfaceC9651b interfaceC9651b = this.f29084c;
        if (c15384c == null && interfaceC9651b.mo4175b(fM10233d)) {
            return this.f29087f;
        }
        C14935a c14935aMo4176k = interfaceC9651b.mo4176k();
        BaseInterpolator baseInterpolator2 = c14935aMo4176k.f46528e;
        Object objMo10235f = (baseInterpolator2 == null || (baseInterpolator = c14935aMo4176k.f46529f) == null) ? mo10235f(c14935aMo4176k, m10232c()) : mo10236g(c14935aMo4176k, fM10233d, baseInterpolator2.getInterpolation(fM10233d), baseInterpolator.getInterpolation(fM10233d));
        this.f29087f = objMo10235f;
        return objMo10235f;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo10235f(C14935a c14935a, float f10);

    /* JADX INFO: renamed from: g */
    public Object mo10236g(C14935a c14935a, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX INFO: renamed from: h */
    public void mo10237h() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29082a;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((InterfaceC9650a) arrayList.get(i10)).mo9610a();
            i10++;
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo10238i(float f10) {
        InterfaceC9651b interfaceC9651b = this.f29084c;
        if (interfaceC9651b.isEmpty()) {
            return;
        }
        if (this.f29088g == -1.0f) {
            this.f29088g = interfaceC9651b.mo4174B();
        }
        float f11 = this.f29088g;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.f29088g = interfaceC9651b.mo4174B();
            }
            f10 = this.f29088g;
        } else if (f10 > mo10231b()) {
            f10 = mo10231b();
        }
        if (f10 == this.f29085d) {
            return;
        }
        this.f29085d = f10;
        if (interfaceC9651b.mo4177m(f10)) {
            mo10237h();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10239j(C15384c c15384c) {
        C15384c c15384c2 = this.f29086e;
        if (c15384c2 != null) {
            c15384c2.getClass();
        }
        this.f29086e = c15384c;
    }
}
