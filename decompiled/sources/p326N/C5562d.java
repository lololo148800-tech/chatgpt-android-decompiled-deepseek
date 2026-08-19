package p326N;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import p004A2.InterfaceC0310a;
import p414R.C6771e;
import p414R.C6773g;
import p414R.C6779m;
import p439S.C6972c;
import p439S.C6974e;
import p465T.AbstractC7173i;

/* JADX INFO: renamed from: N.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5562d implements InterfaceC0310a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f18031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f18032c;

    public /* synthetic */ C5562d(Object obj, int i10, Object obj2) {
        this.f18030a = i10;
        this.f18031b = obj;
        this.f18032c = obj2;
    }

    @Override // p004A2.InterfaceC0310a
    public final void accept(Object obj) {
        switch (this.f18030a) {
            case 0:
                ((Surface) this.f18031b).release();
                ((SurfaceTexture) this.f18032c).release();
                break;
            case 1:
                C6771e c6771e = (C6771e) this.f18031b;
                c6771e.getClass();
                C6779m c6779m = (C6779m) this.f18032c;
                c6779m.close();
                Surface surface = (Surface) c6771e.f21730t0.remove(c6779m);
                if (surface != null) {
                    C6773g c6773g = c6771e.f21723Y;
                    AbstractC7173i.m7546d((AtomicBoolean) c6773g.f21738o0, true);
                    AbstractC7173i.m7545c((Thread) c6773g.f21740q0);
                    c6773g.m7219m(surface, true);
                }
                break;
            default:
                C6974e c6974e = (C6974e) this.f18031b;
                c6974e.getClass();
                C6779m c6779m2 = (C6779m) this.f18032c;
                c6779m2.close();
                Surface surface2 = (Surface) c6974e.f22300t0.remove(c6779m2);
                if (surface2 != null) {
                    C6972c c6972c = c6974e.f22293Y;
                    AbstractC7173i.m7546d((AtomicBoolean) c6972c.f21738o0, true);
                    AbstractC7173i.m7545c((Thread) c6972c.f21740q0);
                    c6972c.m7219m(surface2, true);
                }
                break;
        }
    }
}
