package p1028u;

import java.util.HashMap;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20084a extends C20089f {

    /* JADX INFO: renamed from: q0 */
    public final HashMap f63601q0 = new HashMap();

    @Override // p1028u.C20089f
    /* JADX INFO: renamed from: f */
    public final C20086c mo20916f(Object obj) {
        return (C20086c) this.f63601q0.get(obj);
    }

    @Override // p1028u.C20089f
    /* JADX INFO: renamed from: i */
    public final Object mo20917i(Object obj, Object obj2) {
        C20086c c20086cMo20916f = mo20916f(obj);
        if (c20086cMo20916f != null) {
            return c20086cMo20916f.f63606Z;
        }
        HashMap map = this.f63601q0;
        C20086c c20086c = new C20086c(obj, obj2);
        this.f63615p0++;
        C20086c c20086c2 = this.f63613Z;
        if (c20086c2 == null) {
            this.f63612Y = c20086c;
            this.f63613Z = c20086c;
        } else {
            c20086c2.f63607o0 = c20086c;
            c20086c.f63608p0 = c20086c2;
            this.f63613Z = c20086c;
        }
        map.put(obj, c20086c);
        return null;
    }

    @Override // p1028u.C20089f
    /* JADX INFO: renamed from: j */
    public final Object mo20918j(Object obj) {
        Object objMo20918j = super.mo20918j(obj);
        this.f63601q0.remove(obj);
        return objMo20918j;
    }
}
