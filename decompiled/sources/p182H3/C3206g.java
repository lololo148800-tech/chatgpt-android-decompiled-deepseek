package p182H3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p057C3.C1527E;
import p084D4.C1878B;

/* JADX INFO: renamed from: H3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3206g extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f9680b;

    /* JADX INFO: renamed from: c */
    public Handler f9681c;

    /* JADX INFO: renamed from: h */
    public MediaFormat f9686h;

    /* JADX INFO: renamed from: i */
    public MediaFormat f9687i;

    /* JADX INFO: renamed from: j */
    public MediaCodec.CodecException f9688j;

    /* JADX INFO: renamed from: k */
    public MediaCodec.CryptoException f9689k;

    /* JADX INFO: renamed from: l */
    public long f9690l;

    /* JADX INFO: renamed from: m */
    public boolean f9691m;

    /* JADX INFO: renamed from: n */
    public IllegalStateException f9692n;

    /* JADX INFO: renamed from: o */
    public C3218s f9693o;

    /* JADX INFO: renamed from: a */
    public final Object f9679a = new Object();

    /* JADX INFO: renamed from: d */
    public final C1878B f9682d = new C1878B();

    /* JADX INFO: renamed from: e */
    public final C1878B f9683e = new C1878B();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f9684f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f9685g = new ArrayDeque();

    public C3206g(HandlerThread handlerThread) {
        this.f9680b = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public final void m4071a() {
        ArrayDeque arrayDeque = this.f9685g;
        if (!arrayDeque.isEmpty()) {
            this.f9687i = (MediaFormat) arrayDeque.getLast();
        }
        C1878B c1878b = this.f9682d;
        c1878b.f5457c = c1878b.f5456b;
        C1878B c1878b2 = this.f9683e;
        c1878b2.f5457c = c1878b2.f5456b;
        this.f9684f.clear();
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m4072b(IllegalStateException illegalStateException) {
        synchronized (this.f9679a) {
            this.f9692n = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f9679a) {
            this.f9689k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f9679a) {
            this.f9688j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        C1527E c1527e;
        synchronized (this.f9679a) {
            this.f9682d.m2860a(i10);
            C3218s c3218s = this.f9693o;
            if (c3218s != null && (c1527e = c3218s.f9715a.f9751R0) != null) {
                c1527e.m2257a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        C1527E c1527e;
        synchronized (this.f9679a) {
            try {
                MediaFormat mediaFormat = this.f9687i;
                if (mediaFormat != null) {
                    this.f9683e.m2860a(-2);
                    this.f9685g.add(mediaFormat);
                    this.f9687i = null;
                }
                this.f9683e.m2860a(i10);
                this.f9684f.add(bufferInfo);
                C3218s c3218s = this.f9693o;
                if (c3218s != null && (c1527e = c3218s.f9715a.f9751R0) != null) {
                    c1527e.m2257a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f9679a) {
            this.f9683e.m2860a(-2);
            this.f9685g.add(mediaFormat);
            this.f9687i = null;
        }
    }
}
