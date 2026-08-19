package p951pp;

import io.sentry.clientreport.C15333a;
import np.InterfaceC17709a;
import p817j$.util.concurrent.ConcurrentHashMap;
import p849k7.C16361n;
import p975qp.InterfaceC18797a;

/* JADX INFO: renamed from: pp.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C18534d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59049a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17709a f59050b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC18797a f59051c;

    public C18534d(int i10) {
        this.f59049a = i10;
        switch (i10) {
            case 1:
                this.f59050b = new C18537g();
                new ConcurrentHashMap();
                this.f59051c = new C15333a(4);
                break;
            default:
                this.f59050b = new C18533c();
                new ConcurrentHashMap();
                this.f59051c = new C16361n();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC17709a m19898a() {
        switch (this.f59049a) {
            case 0:
                return (C18533c) this.f59050b;
            default:
                return (C18537g) this.f59050b;
        }
    }
}
