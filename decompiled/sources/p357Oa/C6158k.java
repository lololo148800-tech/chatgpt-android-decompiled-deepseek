package p357Oa;

/* JADX INFO: renamed from: Oa.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6158k extends AbstractRunnableC6156i {

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f20043Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f20044o0;

    public /* synthetic */ C6158k(Object obj, int i10) {
        this.f20043Z = i10;
        this.f20044o0 = obj;
    }

    @Override // p357Oa.AbstractRunnableC6156i
    /* JADX INFO: renamed from: a */
    public final void mo6140a() {
        switch (this.f20043Z) {
            case 0:
                synchronized (((C6161n) this.f20044o0).f20055f) {
                    try {
                        if (((C6161n) this.f20044o0).f20060k.get() > 0 && ((C6161n) this.f20044o0).f20060k.decrementAndGet() > 0) {
                            ((C6161n) this.f20044o0).f20051b.m7758K("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C6161n c6161n = (C6161n) this.f20044o0;
                        if (c6161n.f20062m != null) {
                            c6161n.f20051b.m7758K("Unbind from service.", new Object[0]);
                            C6161n c6161n2 = (C6161n) this.f20044o0;
                            c6161n2.f20050a.unbindService(c6161n2.f20061l);
                            C6161n c6161n3 = (C6161n) this.f20044o0;
                            c6161n3.f20056g = false;
                            c6161n3.f20062m = null;
                            c6161n3.f20061l = null;
                        }
                        ((C6161n) this.f20044o0).m6719d();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                ServiceConnectionC6160m serviceConnectionC6160m = (ServiceConnectionC6160m) this.f20044o0;
                C6161n c6161n4 = (C6161n) serviceConnectionC6160m.f20048b;
                c6161n4.f20051b.m7758K("unlinkToDeath", new Object[0]);
                c6161n4.f20062m.asBinder().unlinkToDeath(c6161n4.f20059j, 0);
                C6161n c6161n5 = (C6161n) serviceConnectionC6160m.f20048b;
                c6161n5.f20062m = null;
                c6161n5.f20056g = false;
                return;
        }
    }
}
