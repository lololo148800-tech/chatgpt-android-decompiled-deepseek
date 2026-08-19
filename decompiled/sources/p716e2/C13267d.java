package p716e2;

import java.util.HashMap;
import p671c2.C11561a;
import p760g2.C13807d;

/* JADX INFO: renamed from: e2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13267d {

    /* JADX INFO: renamed from: a */
    public final C13807d f41934a;

    /* JADX INFO: renamed from: b */
    public int f41935b;

    /* JADX INFO: renamed from: c */
    public int f41936c;

    /* JADX INFO: renamed from: d */
    public final HashMap f41937d;

    public C13267d(C13807d c13807d) {
        this.f41934a = null;
        this.f41935b = 0;
        this.f41936c = 0;
        this.f41937d = new HashMap();
        this.f41934a = c13807d;
    }

    /* JADX INFO: renamed from: a */
    public final void m14871a(C13267d c13267d) {
        c13267d.getClass();
        HashMap map = this.f41937d;
        map.clear();
        for (C11561a c11561a : c13267d.f41937d.values()) {
            String str = c11561a.f34955a;
            C11561a c11561a2 = new C11561a();
            c11561a2.f34957c = Integer.MIN_VALUE;
            c11561a2.f34958d = Float.NaN;
            c11561a2.f34955a = str;
            c11561a2.f34956b = c11561a.f34956b;
            c11561a2.f34957c = c11561a.f34957c;
            c11561a2.f34958d = c11561a.f34958d;
            map.put(str, c11561a2);
        }
    }

    public C13267d(C13267d c13267d) {
        this.f41934a = null;
        this.f41935b = 0;
        this.f41936c = 0;
        this.f41937d = new HashMap();
        this.f41934a = c13267d.f41934a;
        this.f41935b = c13267d.f41935b;
        this.f41936c = c13267d.f41936c;
        m14871a(c13267d);
    }
}
