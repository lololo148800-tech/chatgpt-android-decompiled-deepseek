package p114E8;

import java.util.Collections;
import java.util.Map;
import p164G8.C3007a;

/* JADX INFO: renamed from: E8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2356c implements InterfaceC2358e {

    /* JADX INFO: renamed from: a */
    public volatile Map f7314a;

    public C2356c(Double d10) {
        double dDoubleValue = d10.doubleValue();
        this.f7314a = Collections.singletonMap("service:,env:", new C2355b((dDoubleValue < 0.0d || dDoubleValue > 1.0d) ? 1.0d : dDoubleValue));
    }

    @Override // p114E8.InterfaceC2358e
    /* JADX INFO: renamed from: a */
    public final boolean mo3438a(C3007a c3007a) {
        return true;
    }
}
