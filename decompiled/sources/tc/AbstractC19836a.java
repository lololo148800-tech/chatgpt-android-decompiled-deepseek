package tc;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: tc.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19836a {

    /* JADX INFO: renamed from: a */
    public static final List f62903a = AbstractC17681o.m19382k("0.pool.ntp.org", "1.pool.ntp.org", "2.pool.ntp.org", "3.pool.ntp.org");

    /* JADX INFO: renamed from: b */
    public static final long f62904b;

    /* JADX INFO: renamed from: c */
    public static final long f62905c;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.toMillis(1L);
        timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f62904b = timeUnit2.toMillis(6L);
        f62905c = timeUnit2.toMillis(5L);
    }
}
