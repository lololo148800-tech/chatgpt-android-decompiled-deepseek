package p1060v9;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC11852a;
import p1009s9.C19499b;

/* JADX INFO: renamed from: v9.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20499q {

    /* JADX INFO: renamed from: a */
    public Boolean f65092a;

    /* JADX INFO: renamed from: b */
    public boolean f65093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC11852a f65094c;

    /* JADX INFO: renamed from: d */
    public final int f65095d;

    /* JADX INFO: renamed from: e */
    public final Bundle f65096e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC11852a f65097f;

    public AbstractC20499q(AbstractC11852a abstractC11852a, int i10, Bundle bundle) {
        this.f65097f = abstractC11852a;
        Boolean bool = Boolean.TRUE;
        this.f65094c = abstractC11852a;
        this.f65092a = bool;
        this.f65093b = false;
        this.f65095d = i10;
        this.f65096e = bundle;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21145a(C19499b c19499b);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo21146b();

    /* JADX INFO: renamed from: c */
    public final void m21147c() {
        synchronized (this) {
            this.f65092a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21148d() {
        m21147c();
        synchronized (this.f65094c.f36078k) {
            this.f65094c.f36078k.remove(this);
        }
    }
}
