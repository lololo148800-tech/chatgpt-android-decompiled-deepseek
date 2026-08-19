package p111E5;

import android.content.res.AssetFileDescriptor;
import androidx.work.impl.WorkDatabase;
import io.sentry.C15525z;
import io.sentry.metrics.AbstractC15408c;
import io.sentry.metrics.C15406a;
import java.io.ByteArrayInputStream;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p228J.AbstractC3794B0;
import p520V5.AbstractC7785n;
import p594Y9.C9895g4;
import p658b5.C11233d;

/* JADX INFO: renamed from: E5.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC2341y implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7269b;

    public /* synthetic */ CallableC2341y(Object obj, int i10) {
        this.f7268a = i10;
        this.f7269b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z6 = false;
        switch (this.f7268a) {
            case 0:
                return (AssetFileDescriptor) this.f7269b;
            case 1:
                return AbstractC7785n.m8045c((ByteArrayInputStream) this.f7269b, null);
            case 2:
                WorkDatabase workDatabase = (WorkDatabase) ((C9895g4) this.f7269b).f29409Y;
                Long lM12497A = workDatabase.mo12349l().m12497A("next_alarm_manager_id");
                int iLongValue = lM12497A != null ? (int) lM12497A.longValue() : 0;
                workDatabase.mo12349l().m12499C(new C11233d("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 3:
                C15525z c15525z = (C15525z) this.f7269b;
                c15525z.getClass();
                try {
                    c15525z.f48484e.getClass();
                    c15525z.f48481b = InetAddress.getLocalHost().getCanonicalHostName();
                    c15525z.f48482c = System.currentTimeMillis() + c15525z.f48480a;
                    return null;
                } finally {
                    c15525z.f48483d.set(false);
                }
            default:
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry entry : ((C15406a) this.f7269b).f48026a.entrySet()) {
                    ((Long) entry.getKey()).getClass();
                    Collection collectionValues = ((Map) entry.getValue()).values();
                    int i10 = AbstractC15408c.f48029b;
                    Iterator it = collectionValues.iterator();
                    if (it.hasNext()) {
                        throw AbstractC3794B0.m4497v(it);
                    }
                }
                return sb2.toString().getBytes(C15406a.f48025b);
        }
    }
}
