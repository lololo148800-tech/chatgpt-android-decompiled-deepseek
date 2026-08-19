package p501Ub;

import android.content.Context;
import p1060v9.AbstractC20502t;
import p890mb.C17209f;

/* JADX INFO: renamed from: Ub.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7604f {

    /* JADX INFO: renamed from: b */
    public static final Object f24040b = new Object();

    /* JADX INFO: renamed from: c */
    public static C7604f f24041c;

    /* JADX INFO: renamed from: a */
    public C17209f f24042a;

    /* JADX INFO: renamed from: c */
    public static C7604f m7950c() {
        C7604f c7604f;
        synchronized (f24040b) {
            AbstractC20502t.m21159j("MlKitContext has not been initialized", f24041c != null);
            c7604f = f24041c;
            AbstractC20502t.m21157h(c7604f);
        }
        return c7604f;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7951a(Class cls) {
        AbstractC20502t.m21159j("MlKitContext has been deleted", f24041c == this);
        AbstractC20502t.m21157h(this.f24042a);
        return this.f24042a.mo12555a(cls);
    }

    /* JADX INFO: renamed from: b */
    public final Context m7952b() {
        return (Context) m7951a(Context.class);
    }
}
