package p1036u9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import io.sentry.android.core.AbstractC15256t;
import p003A1.C0284r0;
import p377P9.HandlerC6378d;

/* JADX INFO: renamed from: u9.d */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC20158d extends HandlerC6378d {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                AbstractC15256t.m16485w("BasePendingResult", AbstractC10763a.m11048f(i10, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).m13185e(Status.f36050t0);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            throw new ClassCastException();
        }
        try {
            throw null;
        } catch (RuntimeException e10) {
            C0284r0 c0284r0 = BasePendingResult.f36056j;
            throw e10;
        }
    }
}
