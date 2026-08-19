package p899n5;

import java.io.Closeable;
import p007A5.AbstractC0371f;
import p026Ao.AbstractC0668b;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p026Ao.C0657F;
import p026Ao.InterfaceC0677k;
import p571X9.AbstractC9195Q2;

/* JADX INFO: renamed from: n5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C17496m extends AbstractC17497n {

    /* JADX INFO: renamed from: Y */
    public final C0654C f55965Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC0682p f55966Z;

    /* JADX INFO: renamed from: o0 */
    public final String f55967o0;

    /* JADX INFO: renamed from: p0 */
    public final Closeable f55968p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f55969q0;

    /* JADX INFO: renamed from: r0 */
    public C0657F f55970r0;

    public C17496m(C0654C c0654c, AbstractC0682p abstractC0682p, String str, Closeable closeable) {
        this.f55965Y = c0654c;
        this.f55966Z = abstractC0682p;
        this.f55967o0 = str;
        this.f55968p0 = closeable;
    }

    @Override // p899n5.AbstractC17497n
    /* JADX INFO: renamed from: O0 */
    public final synchronized InterfaceC0677k mo19197O0() {
        if (this.f55969q0) {
            throw new IllegalStateException("closed");
        }
        C0657F c0657f = this.f55970r0;
        if (c0657f != null) {
            return c0657f;
        }
        C0657F c0657fM1403c = AbstractC0668b.m1403c(this.f55966Z.mo1400j(this.f55965Y));
        this.f55970r0 = c0657fM1403c;
        return c0657fM1403c;
    }

    @Override // p899n5.AbstractC17497n
    /* JADX INFO: renamed from: a */
    public final AbstractC9195Q2 mo19198a() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f55969q0 = true;
            C0657F c0657f = this.f55970r0;
            if (c0657f != null) {
                AbstractC0371f.m1001a(c0657f);
            }
            Closeable closeable = this.f55968p0;
            if (closeable != null) {
                AbstractC0371f.m1001a(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
