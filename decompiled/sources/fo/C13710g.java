package fo;

import android.util.Log;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: fo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C13710g {
    /* JADX INFO: renamed from: a */
    public final void m15176a(String message) {
        AbstractC16544l.m18095h(message, "message");
        if (message.length() < 4000) {
            Log.d("LeakCanary", message);
            return;
        }
        Iterator it = AbstractC21322p.m21685S(message).iterator();
        while (it.hasNext()) {
            Log.d("LeakCanary", (String) it.next());
        }
    }
}
