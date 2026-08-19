package p322Ml;

import android.net.ConnectivityManager;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p867l8.C16831c;

/* JADX INFO: renamed from: Ml.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5488a implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final ConnectivityManager.NetworkCallback f17916Y;

    /* JADX INFO: renamed from: Z */
    public final C5489b f17917Z;

    /* JADX INFO: renamed from: o0 */
    public final AtomicBoolean f17918o0;

    /* JADX INFO: renamed from: p0 */
    public final AtomicBoolean f17919p0;

    public C5488a(ConnectivityManager.NetworkCallback networkCallback, C5489b c5489b) {
        AbstractC16544l.m18094g(networkCallback, "networkCallback");
        this.f17916Y = networkCallback;
        this.f17917Z = c5489b;
        this.f17918o0 = new AtomicBoolean(false);
        this.f17919p0 = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5915a() {
        if (!this.f17919p0.get() && this.f17918o0.compareAndSet(true, false)) {
            try {
                C5489b c5489b = this.f17917Z;
                ConnectivityManager.NetworkCallback networkCallback = this.f17916Y;
                AbstractC16544l.m18094g(networkCallback, "networkCallback");
                c5489b.f17920a.unregisterNetworkCallback(networkCallback);
            } catch (IllegalArgumentException unused) {
                C8395g c8395g = AbstractC8396h.Companion;
                EnumC8397i enumC8397i = EnumC8397i.f26119p0;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18571j(new Object[0]);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f17919p0.get()) {
                return;
            }
            if (this.f17918o0.get()) {
                m5915a();
            }
            this.f17919p0.set(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
