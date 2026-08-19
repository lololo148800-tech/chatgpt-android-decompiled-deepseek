package p572Xa;

import p357Oa.ServiceConnectionC6160m;

/* JADX INFO: renamed from: Xa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9407a extends AbstractRunnableC9428v {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f28364Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f28365o0;

    public /* synthetic */ C9407a(Object obj, int i10) {
        this.f28364Z = i10;
        this.f28365o0 = obj;
    }

    @Override // p572Xa.AbstractRunnableC9428v
    /* JADX INFO: renamed from: b */
    public final void mo7271b() {
        switch (this.f28364Z) {
            case 0:
                ServiceConnectionC6160m serviceConnectionC6160m = (ServiceConnectionC6160m) this.f28365o0;
                C9408b c9408b = (C9408b) serviceConnectionC6160m.f20048b;
                c9408b.f28368b.m10000b("unlinkToDeath", new Object[0]);
                c9408b.f28380n.asBinder().unlinkToDeath(c9408b.f28377k, 0);
                C9408b c9408b2 = (C9408b) serviceConnectionC6160m.f20048b;
                c9408b2.f28380n = null;
                c9408b2.f28373g = false;
                return;
            default:
                synchronized (((C9408b) this.f28365o0).f28372f) {
                    try {
                        if (((C9408b) this.f28365o0).f28378l.get() > 0 && ((C9408b) this.f28365o0).f28378l.decrementAndGet() > 0) {
                            ((C9408b) this.f28365o0).f28368b.m10000b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C9408b c9408b3 = (C9408b) this.f28365o0;
                        if (c9408b3.f28380n != null) {
                            c9408b3.f28368b.m10000b("Unbind from service.", new Object[0]);
                            C9408b c9408b4 = (C9408b) this.f28365o0;
                            c9408b4.f28367a.unbindService(c9408b4.f28379m);
                            C9408b c9408b5 = (C9408b) this.f28365o0;
                            c9408b5.f28373g = false;
                            c9408b5.f28380n = null;
                            c9408b5.f28379m = null;
                        }
                        ((C9408b) this.f28365o0).m9987d();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
