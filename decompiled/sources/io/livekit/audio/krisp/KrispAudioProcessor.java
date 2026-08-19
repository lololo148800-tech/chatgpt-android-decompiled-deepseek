package io.livekit.audio.krisp;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.javax.sip.C10808o;
import android.os.Looper;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17356w;
import p101Dl.InterfaceC2111l;
import p1113xn.AbstractC21329w;
import p1160zp.AbstractC22225a;
import p328N1.C5586b;
import p523V9.AbstractC7942M5;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p712dp.C13187c;
import p791hj.C14522e;
import p867l8.C16831c;
import p959q8.C18639a;
import p974qo.C18792h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0015J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m18067d2 = {"Lio/livekit/audio/krisp/KrispAudioProcessor;", "LDl/l;", "", "model", "", "nativeKrispInitBlob", "([B)I", "sampleRateHz", "numChannels", "Lmm/C;", "nativeInitialize", "(II)V", "newRate", "nativeReset", "(I)V", "numBands", "numFrames", "Ljava/nio/ByteBuffer;", "buffer", "nativeProcess", "(IILjava/nio/ByteBuffer;)V", "q8/a", "krisp-noise-cancellation_release"}, m18068k = 1, m18069mv = {1, 8, 0})
public final class KrispAudioProcessor implements InterfaceC2111l {

    /* JADX INFO: renamed from: k */
    public static final C18639a f46969k = new C18639a(20);

    /* JADX INFO: renamed from: l */
    public static volatile KrispAudioProcessor f46970l;

    /* JADX INFO: renamed from: a */
    public final C5586b f46971a;

    /* JADX INFO: renamed from: f */
    public C18792h f46976f;

    /* JADX INFO: renamed from: h */
    public int f46978h;

    /* JADX INFO: renamed from: i */
    public int f46979i;

    /* JADX INFO: renamed from: j */
    public boolean f46980j;

    /* JADX INFO: renamed from: b */
    public final C17356w f46972b = new C17356w();

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f46973c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final Object f46974d = new Object();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f46975e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public final Object f46977g = new Object();

    static {
        System.loadLibrary("krisp_noise_cancellation");
    }

    public KrispAudioProcessor(C5586b c5586b) {
        this.f46971a = c5586b;
    }

    private final native void nativeInitialize(int sampleRateHz, int numChannels);

    private final native int nativeKrispInitBlob(byte[] model);

    private final native void nativeProcess(int numBands, int numFrames, ByteBuffer buffer);

    private final native void nativeReset(int newRate);

    /* JADX INFO: renamed from: a */
    public final void m16221a(URL url, String str) {
        synchronized (this.f46977g) {
            try {
                C18792h c18792h = this.f46976f;
                if (c18792h != null) {
                    c18792h.cancel();
                }
                this.f46976f = null;
                this.f46975e.set(false);
                C14522e c14522e = new C14522e(3);
                String string = url.toString();
                AbstractC16544l.m18093f(string, "url.toString()");
                C13187c c13187c = new C13187c(1);
                c13187c.m14844f(null, string);
                c14522e.f45762Z = c13187c.m14841c();
                c14522e.m16024r(SIPHeaderNames.AUTHORIZATION, "Bearer " + str);
                c14522e.m16024r(SIPHeaderNames.CONTENT_TYPE, "application/json");
                c14522e.m16028v("GET", null);
                C18792h c18792hM19035b = this.f46972b.m19035b(c14522e.m16017i());
                c18792hM19035b.m20062d(new C10808o(this, 28));
                this.f46976f = c18792hM19035b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16222b(String url, String token) {
        AbstractC16544l.m18094g(url, "url");
        AbstractC16544l.m18094g(token, "token");
        if (url.length() != 0) {
            token.length();
        }
        try {
            if (AbstractC21329w.m21734u(url, "ws://", false)) {
                url = AbstractC21329w.m21731r(url, "ws://", "http://");
            } else if (AbstractC21329w.m21734u(url, "wss://", false)) {
                url = AbstractC21329w.m21731r(url, "wss://", "https://");
            }
            URL url2 = new URL(url);
            m16221a(new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), "/settings"), token);
        } catch (Exception e10) {
            System.out.println(e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16223c() {
        if (this.f46973c.get()) {
            return;
        }
        synchronized (this.f46974d) {
            try {
                if (this.f46973c.get()) {
                    return;
                }
                if (AbstractC16544l.m18089b(Looper.myLooper(), Looper.getMainLooper())) {
                    C8395g c8395g = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i = EnumC8397i.f26119p0;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18571j(new Object[0]);
                    }
                }
                try {
                    InputStream inputStreamOpen = this.f46971a.f18097a.getAssets().open("c6.f.s.ced125.kw");
                    try {
                        byte[] bArr = new byte[inputStreamOpen.available()];
                        inputStreamOpen.read(bArr);
                        if (nativeKrispInitBlob(bArr) != 0) {
                            C8395g c8395g2 = AbstractC8396h.Companion;
                            EnumC8397i enumC8397i2 = EnumC8397i.f26120q0;
                            AbstractC8396h.Companion.getClass();
                            if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                AbstractC22225a.f70470a.getClass();
                                C16831c.m18568f(new Object[0]);
                            }
                            AbstractC7942M5.m8232a(inputStreamOpen, null);
                            return;
                        }
                        AbstractC7942M5.m8232a(inputStreamOpen, null);
                        if (!this.f46973c.compareAndSet(false, true)) {
                            C8395g c8395g3 = AbstractC8396h.Companion;
                            EnumC8397i enumC8397i3 = EnumC8397i.f26119p0;
                            AbstractC8396h.Companion.getClass();
                            if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                AbstractC22225a.f70470a.getClass();
                                C16831c.m18571j(new Object[0]);
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            AbstractC7942M5.m8232a(inputStreamOpen, th2);
                            throw th3;
                        }
                    }
                } catch (IOException unused) {
                    C8395g c8395g4 = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i4 = EnumC8397i.f26120q0;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i4.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18568f(new Object[0]);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16224d(int i10, int i11) {
        if (m16225e()) {
            this.f46980j = false;
            nativeInitialize(i10, i11);
        } else {
            this.f46978h = i10;
            this.f46979i = i11;
            this.f46980j = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16225e() {
        return this.f46973c.get() && this.f46975e.get();
    }

    /* JADX INFO: renamed from: f */
    public final void m16226f(int i10, int i11, ByteBuffer buffer) {
        AbstractC16544l.m18094g(buffer, "buffer");
        if (m16225e()) {
            if (this.f46980j) {
                this.f46980j = false;
                m16224d(this.f46978h, this.f46979i);
            }
            nativeProcess(i10, i11, buffer);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m16227g(int i10) {
        if (m16225e()) {
            this.f46980j = false;
            nativeReset(i10);
        } else {
            this.f46978h = i10;
            this.f46980j = true;
        }
    }
}
