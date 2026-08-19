package p111E5;

import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p026Ao.InterfaceC0677k;
import p523V9.AbstractC8206u4;

/* JADX INFO: renamed from: E5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2335s implements InterfaceC2333q {

    /* JADX INFO: renamed from: Y */
    public final AbstractC0682p f7251Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC8206u4 f7252Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f7253o0 = new Object();

    /* JADX INFO: renamed from: p0 */
    public boolean f7254p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC0677k f7255q0;

    public C2335s(InterfaceC0677k interfaceC0677k, AbstractC0682p abstractC0682p, AbstractC8206u4 abstractC8206u4) {
        this.f7251Y = abstractC0682p;
        this.f7252Z = abstractC8206u4;
        this.f7255q0 = interfaceC0677k;
    }

    @Override // p111E5.InterfaceC2333q
    /* JADX INFO: renamed from: O0 */
    public final InterfaceC0677k mo3429O0() {
        InterfaceC0677k interfaceC0677k;
        synchronized (this.f7253o0) {
            try {
                if (this.f7254p0) {
                    throw new IllegalStateException("closed");
                }
                interfaceC0677k = this.f7255q0;
                if (interfaceC0677k == null) {
                    AbstractC0682p abstractC0682p = this.f7251Y;
                    AbstractC16544l.m18091d(null);
                    abstractC0682p.mo1400j(null);
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC0677k;
    }

    @Override // p111E5.InterfaceC2333q
    /* JADX INFO: renamed from: R */
    public final AbstractC8206u4 mo3430R() {
        return this.f7252Z;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f7253o0) {
            this.f7254p0 = true;
            InterfaceC0677k interfaceC0677k = this.f7255q0;
            if (interfaceC0677k != null) {
                try {
                    interfaceC0677k.close();
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // p111E5.InterfaceC2333q
    /* JADX INFO: renamed from: x0 */
    public final AbstractC0682p mo3431x0() {
        return this.f7251Y;
    }

    @Override // p111E5.InterfaceC2333q
    /* JADX INFO: renamed from: z0 */
    public final C0654C mo3432z0() {
        synchronized (this.f7253o0) {
            if (this.f7254p0) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }
}
