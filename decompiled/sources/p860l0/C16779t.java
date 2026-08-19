package p860l0;

import kotlin.jvm.internal.AbstractC16544l;
import p349O0.C5994b0;
import p349O0.C6002f0;

/* JADX INFO: renamed from: l0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C16779t {

    /* JADX INFO: renamed from: a */
    public Object f53848a;

    /* JADX INFO: renamed from: b */
    public Object f53849b;

    /* JADX INFO: renamed from: c */
    public float f53850c = Float.NaN;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C16782u f53851d;

    public C16779t(C16782u c16782u) {
        this.f53851d = c16782u;
    }

    /* JADX INFO: renamed from: a */
    public final void m18544a(float f10, float f11) {
        C16782u c16782u = this.f53851d;
        float fM6409g = c16782u.f53868j.m6409g();
        C5994b0 c5994b0 = c16782u.f53868j;
        c5994b0.m6410h(f10);
        c16782u.f53869k.m6410h(f11);
        if (Float.isNaN(fM6409g)) {
            return;
        }
        boolean z6 = f10 >= fM6409g;
        C16670E0 c16670e0M18548b = c16782u.m18548b();
        C6002f0 c6002f0 = c16782u.f53865g;
        if (c5994b0.m6409g() == c16670e0M18548b.m18495e(c6002f0.getValue())) {
            Object objM18492b = c16782u.m18548b().m18492b(c5994b0.m6409g() + (z6 ? 1.0f : -1.0f), z6);
            if (objM18492b == null) {
                objM18492b = c6002f0.getValue();
            }
            if (z6) {
                this.f53848a = c6002f0.getValue();
                this.f53849b = objM18492b;
            } else {
                this.f53848a = objM18492b;
                this.f53849b = c6002f0.getValue();
            }
        } else {
            Object objM18492b2 = c16782u.m18548b().m18492b(c5994b0.m6409g(), false);
            if (objM18492b2 == null) {
                objM18492b2 = c6002f0.getValue();
            }
            Object objM18492b3 = c16782u.m18548b().m18492b(c5994b0.m6409g(), true);
            if (objM18492b3 == null) {
                objM18492b3 = c6002f0.getValue();
            }
            this.f53848a = objM18492b2;
            this.f53849b = objM18492b3;
        }
        C16670E0 c16670e0M18548b2 = c16782u.m18548b();
        Object obj = this.f53848a;
        AbstractC16544l.m18091d(obj);
        float fM18495e = c16670e0M18548b2.m18495e(obj);
        C16670E0 c16670e0M18548b3 = c16782u.m18548b();
        Object obj2 = this.f53849b;
        AbstractC16544l.m18091d(obj2);
        this.f53850c = Math.abs(fM18495e - c16670e0M18548b3.m18495e(obj2));
        if (Math.abs(c5994b0.m6409g() - c16782u.m18548b().m18495e(c6002f0.getValue())) >= this.f53850c / 2.0f) {
            Object value = z6 ? this.f53849b : this.f53848a;
            if (value == null) {
                value = c6002f0.getValue();
            }
            if (((Boolean) c16782u.f53863e.invoke(value)).booleanValue()) {
                c16782u.m18551e(value);
            }
        }
    }
}
