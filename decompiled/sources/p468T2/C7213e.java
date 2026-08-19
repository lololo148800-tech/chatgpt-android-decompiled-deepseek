package p468T2;

import android.os.Build;
import java.util.ArrayList;
import p310M9.C5311e;
import p571X9.AbstractC9172M3;
import p571X9.AbstractC9178N3;
import p658b5.C11238i;

/* JADX INFO: renamed from: T2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7213e extends AbstractC9172M3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7214f f22887a;

    public C7213e(C7214f c7214f) {
        this.f22887a = c7214f;
    }

    @Override // p571X9.AbstractC9172M3
    /* JADX INFO: renamed from: a */
    public final void mo7603a(Throwable th2) {
        ((C7218j) this.f22887a.f22889b).m7613e(th2);
    }

    @Override // p571X9.AbstractC9172M3
    /* JADX INFO: renamed from: b */
    public final void mo7604b(C11238i c11238i) {
        C7214f c7214f = this.f22887a;
        c7214f.f22890c = c11238i;
        C11238i c11238i2 = (C11238i) c7214f.f22890c;
        C7218j c7218j = (C7218j) c7214f.f22889b;
        c7214f.f22888a = new C5311e(c11238i2, c7218j.f22902g, c7218j.f22904i, Build.VERSION.SDK_INT >= 34 ? AbstractC7221m.m7618a() : AbstractC9178N3.m9735b());
        C7218j c7218j2 = (C7218j) c7214f.f22889b;
        c7218j2.getClass();
        ArrayList arrayList = new ArrayList();
        c7218j2.f22896a.writeLock().lock();
        try {
            c7218j2.f22898c = 1;
            arrayList.addAll(c7218j2.f22897b);
            c7218j2.f22897b.clear();
            c7218j2.f22896a.writeLock().unlock();
            c7218j2.f22899d.post(new RunnableC7216h(arrayList, c7218j2.f22898c, (Throwable) null));
        } catch (Throwable th2) {
            c7218j2.f22896a.writeLock().unlock();
            throw th2;
        }
    }
}
