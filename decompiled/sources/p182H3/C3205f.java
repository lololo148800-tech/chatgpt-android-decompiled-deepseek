package p182H3;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p003A1.AbstractC0224Z;
import p007A5.C0376k;
import p031B3.C0799c;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: H3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3205f implements InterfaceC3211l {

    /* JADX INFO: renamed from: s0 */
    public static final ArrayDeque f9671s0 = new ArrayDeque();

    /* JADX INFO: renamed from: t0 */
    public static final Object f9672t0 = new Object();

    /* JADX INFO: renamed from: Y */
    public final MediaCodec f9673Y;

    /* JADX INFO: renamed from: Z */
    public final HandlerThread f9674Z;

    /* JADX INFO: renamed from: o0 */
    public HandlerC3203d f9675o0;

    /* JADX INFO: renamed from: p0 */
    public final AtomicReference f9676p0;

    /* JADX INFO: renamed from: q0 */
    public final C0376k f9677q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f9678r0;

    public C3205f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C0376k c0376k = new C0376k(13, false);
        this.f9673Y = mediaCodec;
        this.f9674Z = handlerThread;
        this.f9677q0 = c0376k;
        this.f9676p0 = new AtomicReference();
    }

    /* JADX INFO: renamed from: a */
    public static C3204e m4066a() {
        ArrayDeque arrayDeque = f9671s0;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C3204e();
                }
                return (C3204e) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4067b(C3204e c3204e) {
        ArrayDeque arrayDeque = f9671s0;
        synchronized (arrayDeque) {
            arrayDeque.add(c3204e);
        }
    }

    @Override // p182H3.InterfaceC3211l
    /* JADX INFO: renamed from: c */
    public final void mo4068c(int i10, C0799c c0799c, long j10, int i11) {
        mo4070r();
        C3204e c3204eM4066a = m4066a();
        c3204eM4066a.f9666a = i10;
        c3204eM4066a.f9667b = 0;
        c3204eM4066a.f9669d = j10;
        c3204eM4066a.f9670e = i11;
        int i12 = c0799c.f2219f;
        MediaCodec.CryptoInfo cryptoInfo = c3204eM4066a.f9668c;
        cryptoInfo.numSubSamples = i12;
        int[] iArr = c0799c.f2217d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c0799c.f2218e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c0799c.f2215b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c0799c.f2214a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c0799c.f2216c;
        if (AbstractC20817s.f66106a >= 24) {
            AbstractC0224Z.m715q();
            cryptoInfo.setPattern(AbstractC0224Z.m705g(c0799c.f2220g, c0799c.f2221h));
        }
        this.f9675o0.obtainMessage(2, c3204eM4066a).sendToTarget();
    }

    @Override // p182H3.InterfaceC3211l
    /* JADX INFO: renamed from: e */
    public final void mo4069e(int i10, int i11, int i12, long j10) {
        mo4070r();
        C3204e c3204eM4066a = m4066a();
        c3204eM4066a.f9666a = i10;
        c3204eM4066a.f9667b = i11;
        c3204eM4066a.f9669d = j10;
        c3204eM4066a.f9670e = i12;
        HandlerC3203d handlerC3203d = this.f9675o0;
        int i13 = AbstractC20817s.f66106a;
        handlerC3203d.obtainMessage(1, c3204eM4066a).sendToTarget();
    }

    @Override // p182H3.InterfaceC3211l
    public final void flush() {
        if (this.f9678r0) {
            try {
                HandlerC3203d handlerC3203d = this.f9675o0;
                handlerC3203d.getClass();
                handlerC3203d.removeCallbacksAndMessages(null);
                C0376k c0376k = this.f9677q0;
                c0376k.m1012d();
                HandlerC3203d handlerC3203d2 = this.f9675o0;
                handlerC3203d2.getClass();
                handlerC3203d2.obtainMessage(3).sendToTarget();
                synchronized (c0376k) {
                    while (!c0376k.f1278Z) {
                        c0376k.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // p182H3.InterfaceC3211l
    /* JADX INFO: renamed from: r */
    public final void mo4070r() {
        RuntimeException runtimeException = (RuntimeException) this.f9676p0.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p182H3.InterfaceC3211l
    public final void setParameters(Bundle bundle) {
        mo4070r();
        HandlerC3203d handlerC3203d = this.f9675o0;
        int i10 = AbstractC20817s.f66106a;
        handlerC3203d.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p182H3.InterfaceC3211l
    public final void shutdown() {
        if (this.f9678r0) {
            flush();
            this.f9674Z.quit();
        }
        this.f9678r0 = false;
    }

    @Override // p182H3.InterfaceC3211l
    public final void start() {
        if (this.f9678r0) {
            return;
        }
        HandlerThread handlerThread = this.f9674Z;
        handlerThread.start();
        this.f9675o0 = new HandlerC3203d(this, handlerThread.getLooper());
        this.f9678r0 = true;
    }
}
