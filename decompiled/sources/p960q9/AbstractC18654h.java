package p960q9;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import p013Ab.C0420b;
import p1022t9.AbstractC19824i;
import p1036u9.C20159e;

/* JADX INFO: renamed from: q9.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18654h {

    /* JADX INFO: renamed from: a */
    public static final C0420b f59411a = new C0420b("GoogleSignInCommon", new String[0]);

    /* JADX INFO: renamed from: a */
    public static void m20020a(Context context) {
        C18655i.m20023t(context).m20034u();
        Set set = AbstractC19824i.f62884a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((AbstractC19824i) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C20159e.m20977a();
    }
}
