package p594Y9;

import java.util.Iterator;
import java.util.List;
import p204I1.C3587c;
import p204I1.C3590f;
import p204I1.C3604t;

/* JADX INFO: renamed from: Y9.H4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9740H4 {
    /* JADX INFO: renamed from: e */
    public static final C3590f m10330e(List list) {
        C3604t c3604t = new C3604t(0, 0, 0L, null, 511);
        C3587c c3587c = new C3587c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int iM4295g = c3587c.m4295g(c3604t);
            try {
                c3587c.m4291c("•\t");
                c3587c.m4291c(str);
                c3587c.m4293e(iM4295g);
            } catch (Throwable th2) {
                c3587c.m4293e(iM4295g);
                throw th2;
            }
        }
        return c3587c.m4297i();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo10331a() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo10333c();

    /* JADX INFO: renamed from: d */
    public abstract void mo10334d();

    /* JADX INFO: renamed from: b */
    public void mo10332b() {
    }
}
