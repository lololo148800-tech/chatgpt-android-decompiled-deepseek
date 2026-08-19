package p117Eb;

import com.google.firebase.messaging.FirebaseMessaging;
import p523V9.AbstractC7845A4;
import p720e6.C13287b;
import p746fa.InterfaceC13596e;
import p985r9.C18891a;

/* JADX INFO: renamed from: Eb.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2384n implements InterfaceC13596e {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7411Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ FirebaseMessaging f7412Z;

    public /* synthetic */ C2384n(FirebaseMessaging firebaseMessaging, int i10) {
        this.f7411Y = i10;
        this.f7412Z = firebaseMessaging;
    }

    @Override // p746fa.InterfaceC13596e
    public final void onSuccess(Object obj) {
        boolean z6;
        switch (this.f7411Y) {
            case 0:
                C2364B c2364b = (C2364B) obj;
                if (!this.f7412Z.f36856e.m3402n() || c2364b.f7346h.m3573a() == null) {
                    return;
                }
                synchronized (c2364b) {
                    z6 = c2364b.f7345g;
                }
                if (z6) {
                    return;
                }
                c2364b.m3458h(0L);
                return;
            default:
                C18891a c18891a = (C18891a) obj;
                C13287b c13287b = FirebaseMessaging.f36849k;
                FirebaseMessaging firebaseMessaging = this.f7412Z;
                firebaseMessaging.getClass();
                if (c18891a != null) {
                    AbstractC7845A4.m8094b(c18891a.f60227Y);
                    firebaseMessaging.m13709e();
                    return;
                }
                return;
        }
    }
}
