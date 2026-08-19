package p613Z4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.AbstractC16544l;
import p444S4.C7011q;
import p719e5.C13285a;

/* JADX INFO: renamed from: Z4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10163j extends AbstractC10157d {

    /* JADX INFO: renamed from: g */
    public final ConnectivityManager f30098g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10163j(Context context, C13285a taskExecutor) {
        super(context, taskExecutor);
        AbstractC16544l.m18094g(taskExecutor, "taskExecutor");
        Object systemService = ((Context) this.f30090b).getSystemService("connectivity");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f30098g = (ConnectivityManager) systemService;
    }

    @Override // p613Z4.AbstractC10159f
    /* JADX INFO: renamed from: a */
    public final Object mo10755a() {
        return AbstractC10162i.m10761a(this.f30098g);
    }

    @Override // p613Z4.AbstractC10157d
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo10756e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // p613Z4.AbstractC10157d
    /* JADX INFO: renamed from: f */
    public final void mo10757f(Intent intent) {
        AbstractC16544l.m18094g(intent, "intent");
        if (AbstractC16544l.m18089b(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            C7011q.m7408d().m7410a(AbstractC10162i.f30097a, "Network broadcast received");
            m10760b(AbstractC10162i.m10761a(this.f30098g));
        }
    }
}
