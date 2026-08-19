package p472T6;

import android.content.SharedPreferences;
import android.javax.sip.C10808o;
import android.text.TextUtils;
import com.auth0.android.result.Credentials;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0624m;
import p221Ii.RunnableC3724c;
import p446S6.C7022a;
import p477Tb.C7296c;
import p523V9.AbstractC8154o0;
import p959q8.C18639a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: T6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7258a {

    /* JADX INFO: renamed from: a */
    public final C7022a f23026a;

    /* JADX INFO: renamed from: b */
    public final C10808o f23027b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f23028c;

    public C7258a(C7022a c7022a, C10808o c10808o) {
        new C18639a(17);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC16544l.m18093f(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f23026a = c7022a;
        this.f23027b = c10808o;
        this.f23028c = executorServiceNewSingleThreadExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7706a(AbstractC19687c abstractC19687c) {
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19687c));
        c0624m.m1262r();
        this.f23028c.execute(new RunnableC3724c(this, 19, new C7296c(c0624m, 25)));
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }

    /* JADX INFO: renamed from: b */
    public final void m7707b(Credentials credentials) {
        AbstractC16544l.m18094g(credentials, "credentials");
        if (TextUtils.isEmpty(credentials.getAccessToken()) && TextUtils.isEmpty(credentials.getIdToken())) {
            throw new C7259b("Credentials must have a valid date of expiration and a valid access_token or id_token value.", null);
        }
        String accessToken = credentials.getAccessToken();
        C10808o c10808o = this.f23027b;
        c10808o.m11089w("com.auth0.access_token", accessToken);
        c10808o.m11089w("com.auth0.refresh_token", credentials.getRefreshToken());
        c10808o.m11089w("com.auth0.id_token", credentials.getIdToken());
        c10808o.m11089w("com.auth0.token_type", credentials.getType());
        long time = credentials.getExpiresAt().getTime();
        SharedPreferences sharedPreferences = (SharedPreferences) c10808o.f32040Z;
        sharedPreferences.edit().putLong("com.auth0.expires_at", time).apply();
        c10808o.m11089w("com.auth0.scope", credentials.getScope());
        sharedPreferences.edit().putLong("com.auth0.cache_expires_at", credentials.getExpiresAt().getTime()).apply();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7708c(long j10, long j11) {
        if (j10 <= 0) {
            return false;
        }
        return j10 <= (j11 * ((long) 1000)) + System.currentTimeMillis();
    }
}
