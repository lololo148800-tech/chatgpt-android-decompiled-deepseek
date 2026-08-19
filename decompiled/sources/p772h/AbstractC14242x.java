package p772h;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC16541i;

/* JADX INFO: renamed from: h.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14242x {

    /* JADX INFO: renamed from: a */
    public boolean f44696a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f44697b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public AbstractC16541i f44698c;

    public AbstractC14242x(boolean z6) {
        this.f44696a = z6;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo10143a();

    /* JADX INFO: renamed from: b */
    public final void m15540b() {
        Iterator it = this.f44697b.iterator();
        while (it.hasNext()) {
            ((InterfaceC14221c) it.next()).cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Bm.a, kotlin.jvm.internal.i] */
    /* JADX INFO: renamed from: c */
    public final void m15541c(boolean z6) {
        this.f44696a = z6;
        ?? r6 = this.f44698c;
        if (r6 != 0) {
            r6.invoke();
        }
    }
}
