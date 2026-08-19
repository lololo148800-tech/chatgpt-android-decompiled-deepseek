package p111E5;

import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import p026Ao.AbstractC0668b;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p026Ao.C0657F;
import p026Ao.InterfaceC0677k;
import p523V9.AbstractC8206u4;

/* JADX INFO: renamed from: E5.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2332p implements InterfaceC2333q {

    /* JADX INFO: renamed from: Y */
    public final C0654C f7241Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC0682p f7242Z;

    /* JADX INFO: renamed from: o0 */
    public final String f7243o0;

    /* JADX INFO: renamed from: p0 */
    public final AutoCloseable f7244p0;

    /* JADX INFO: renamed from: q0 */
    public final AbstractC8206u4 f7245q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f7246r0 = new Object();

    /* JADX INFO: renamed from: s0 */
    public boolean f7247s0;

    /* JADX INFO: renamed from: t0 */
    public C0657F f7248t0;

    public C2332p(C0654C c0654c, AbstractC0682p abstractC0682p, String str, AutoCloseable autoCloseable, AbstractC8206u4 abstractC8206u4) {
        this.f7241Y = c0654c;
        this.f7242Z = abstractC0682p;
        this.f7243o0 = str;
        this.f7244p0 = autoCloseable;
        this.f7245q0 = abstractC8206u4;
    }

    @Override // p111E5.InterfaceC2333q
    /* JADX INFO: renamed from: O0 */
    public final InterfaceC0677k mo3429O0() {
        synchronized (this.f7246r0) {
            if (this.f7247s0) {
                throw new IllegalStateException("closed");
            }
            C0657F c0657f = this.f7248t0;
            if (c0657f != null) {
                return c0657f;
            }
            C0657F c0657fM1403c = AbstractC0668b.m1403c(this.f7242Z.mo1400j(this.f7241Y));
            this.f7248t0 = c0657fM1403c;
            return c0657fM1403c;
        }
    }

    @Override // p111E5.InterfaceC2333q
    /* JADX INFO: renamed from: R */
    public final AbstractC8206u4 mo3430R() {
        return this.f7245q0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.f7246r0) {
            this.f7247s0 = true;
            C0657F c0657f = this.f7248t0;
            if (c0657f != null) {
                try {
                    c0657f.close();
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception unused) {
                }
                autoCloseable = this.f7244p0;
                if (autoCloseable != null) {
                    try {
                        autoCloseable.close();
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused2) {
                    }
                }
            } else {
                autoCloseable = this.f7244p0;
                if (autoCloseable != null) {
                    autoCloseable.close();
                }
            }
            throw th;
        }
    }

    @Override // p111E5.InterfaceC2333q
    /* JADX INFO: renamed from: x0 */
    public final AbstractC0682p mo3431x0() {
        return this.f7242Z;
    }

    @Override // p111E5.InterfaceC2333q
    /* JADX INFO: renamed from: z0 */
    public final C0654C mo3432z0() {
        C0654C c0654c;
        synchronized (this.f7246r0) {
            if (this.f7247s0) {
                throw new IllegalStateException(lZYtIbClQJm.CNzWqDrHMBtC);
            }
            c0654c = this.f7241Y;
        }
        return c0654c;
    }
}
