package p674c5;

import androidx.work.impl.WorkDatabase;
import p444S4.C7011q;
import p470T4.C7241f;
import p658b5.C11246q;
import p719e5.C13285a;

/* JADX INFO: renamed from: c5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C11661n {

    /* JADX INFO: renamed from: a */
    public final C13285a f35316a;

    /* JADX INFO: renamed from: b */
    public final C7241f f35317b;

    /* JADX INFO: renamed from: c */
    public final C11246q f35318c;

    static {
        C7011q.m7409f("WMFgUpdater");
    }

    public C11661n(WorkDatabase workDatabase, C7241f c7241f, C13285a c13285a) {
        this.f35317b = c7241f;
        this.f35316a = c13285a;
        this.f35318c = workDatabase.mo12356t();
    }
}
