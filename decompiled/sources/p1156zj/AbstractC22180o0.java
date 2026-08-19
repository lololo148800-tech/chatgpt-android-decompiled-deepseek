package p1156zj;

import android.os.Parcelable;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: zj.o0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22180o0 implements Parcelable {

    /* JADX INFO: renamed from: Y */
    public boolean f70246Y;

    /* JADX INFO: renamed from: a */
    public final AbstractC22180o0 m22398a(String str) {
        if (this instanceof C22162i0) {
            return C22162i0.m22385p((C22162i0) this, str, false, 767);
        }
        if (this instanceof C22168k0) {
            return C22168k0.m22391p((C22168k0) this, str, false, 1535);
        }
        if (this instanceof C22150e0) {
            return C22150e0.m22383i((C22150e0) this, false, str, 127);
        }
        return this instanceof C22171l0 ? C22171l0.m22396i((C22171l0) this, str) : this;
    }

    /* JADX INFO: renamed from: b */
    public void mo22384b() {
        Iterator it = mo22381h().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((InterfaceC22096F) it.next()).mo22349j0().iterator();
            while (it2.hasNext()) {
                new File(((C22205x) it2.next()).f70393Y).delete();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC22180o0 mo22377c();

    /* JADX INFO: renamed from: d */
    public abstract C22139a1 mo22378d();

    /* JADX INFO: renamed from: f */
    public abstract int mo22379f();

    /* JADX INFO: renamed from: g */
    public abstract List mo22380g();

    /* JADX INFO: renamed from: h */
    public abstract List mo22381h();
}
