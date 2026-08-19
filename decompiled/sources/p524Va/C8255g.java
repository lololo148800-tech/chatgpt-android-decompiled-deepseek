package p524Va;

import p357Oa.ServiceConnectionC6160m;

/* JADX INFO: renamed from: Va.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8255g extends AbstractRunnableC8253e {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f25740Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f25741o0;

    public /* synthetic */ C8255g(Object obj, int i10) {
        this.f25740Z = i10;
        this.f25741o0 = obj;
    }

    @Override // p524Va.AbstractRunnableC8253e
    /* JADX INFO: renamed from: a */
    public final void mo7946a() {
        switch (this.f25740Z) {
            case 0:
                synchronized (((C8256h) this.f25741o0).f25748f) {
                    try {
                        if (((C8256h) this.f25741o0).f25753k.get() > 0 && ((C8256h) this.f25741o0).f25753k.decrementAndGet() > 0) {
                            ((C8256h) this.f25741o0).f25744b.m5360c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C8256h c8256h = (C8256h) this.f25741o0;
                        if (c8256h.f25755m != null) {
                            c8256h.f25744b.m5360c("Unbind from service.", new Object[0]);
                            C8256h c8256h2 = (C8256h) this.f25741o0;
                            c8256h2.f25743a.unbindService(c8256h2.f25754l);
                            C8256h c8256h3 = (C8256h) this.f25741o0;
                            c8256h3.f25749g = false;
                            c8256h3.f25755m = null;
                            c8256h3.f25754l = null;
                        }
                        ((C8256h) this.f25741o0).m8893c();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                ServiceConnectionC6160m serviceConnectionC6160m = (ServiceConnectionC6160m) this.f25741o0;
                C8256h c8256h4 = (C8256h) serviceConnectionC6160m.f20048b;
                c8256h4.f25744b.m5360c("unlinkToDeath", new Object[0]);
                c8256h4.f25755m.asBinder().unlinkToDeath(c8256h4.f25752j, 0);
                C8256h c8256h5 = (C8256h) serviceConnectionC6160m.f20048b;
                c8256h5.f25755m = null;
                c8256h5.f25749g = false;
                return;
        }
    }
}
