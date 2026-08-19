package p182H3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import bb.C11294T;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import p001A.RunnableC0000A;
import p031B3.C0799c;
import p084D4.C1878B;
import p1070w.AbstractC20693b;
import p1070w.BinderC20692a;
import p1070w.C20696e;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20813o;
import p305M3.C5287g;
import p329N3.C5621k;
import p479Td.AbstractC7360k;
import p729ej.C13414e;
import p867l8.C16831c;

/* JADX INFO: renamed from: H3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3202c implements InterfaceC3210k {

    /* JADX INFO: renamed from: Y */
    public int f9659Y;

    /* JADX INFO: renamed from: Z */
    public boolean f9660Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f9661o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f9662p0;

    /* JADX INFO: renamed from: q0 */
    public Object f9663q0;

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public C3202c(Context context) {
        String strM7788e;
        TelephonyManager telephonyManager;
        this.f9661o0 = context == null ? null : context.getApplicationContext();
        int i10 = AbstractC20817s.f66106a;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            strM7788e = AbstractC7360k.m7788e(Locale.getDefault().getCountry());
        } else {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (TextUtils.isEmpty(networkCountryIso)) {
                strM7788e = AbstractC7360k.m7788e(Locale.getDefault().getCountry());
            } else {
                strM7788e = AbstractC7360k.m7788e(networkCountryIso);
            }
        }
        int[] iArrM5826a = C5287g.m5826a(strM7788e);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        C11294T c11294t = C5287g.f17410n;
        map.put(2, (Long) c11294t.get(iArrM5826a[0]));
        map.put(3, (Long) C5287g.f17411o.get(iArrM5826a[1]));
        map.put(4, (Long) C5287g.f17412p.get(iArrM5826a[2]));
        map.put(5, (Long) C5287g.f17413q.get(iArrM5826a[3]));
        map.put(10, (Long) C5287g.f17414r.get(iArrM5826a[4]));
        map.put(9, (Long) C5287g.f17415s.get(iArrM5826a[5]));
        map.put(7, (Long) c11294t.get(iArrM5826a[0]));
        this.f9662p0 = map;
        this.f9659Y = 2000;
        this.f9663q0 = C20813o.f66098a;
        this.f9660Z = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m4054a(C3202c c3202c, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        C3206g c3206g = (C3206g) c3202c.f9662p0;
        AbstractC20800b.m21320h(c3206g.f9681c == null);
        HandlerThread handlerThread = c3206g.f9680b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) c3202c.f9661o0;
        mediaCodec.setCallback(c3206g, handler);
        c3206g.f9681c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        ((InterfaceC3211l) c3202c.f9663q0).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        c3202c.f9659Y = 1;
    }

    /* JADX INFO: renamed from: d */
    public static String m4055d(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(Separators.RPAREN);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public C13414e m4056b() {
        Intent intent = (Intent) this.f9661o0;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f9660Z);
        ((C16831c) this.f9662p0).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.f9663q0;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f9659Y);
        if (Build.VERSION.SDK_INT >= 24) {
            String strM21212a = AbstractC20693b.m21212a();
            if (!TextUtils.isEmpty(strM21212a)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey(SIPHeaderNames.ACCEPT_LANGUAGE)) {
                    bundleExtra.putString(SIPHeaderNames.ACCEPT_LANGUAGE, strM21212a);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        return new C13414e(intent);
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: c */
    public void mo4057c(int i10, C0799c c0799c, long j10, int i11) {
        ((InterfaceC3211l) this.f9663q0).mo4068c(i10, c0799c, j10, i11);
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: e */
    public void mo4058e(int i10, int i11, int i12, long j10) {
        ((InterfaceC3211l) this.f9663q0).mo4069e(i10, i11, i12, j10);
    }

    @Override // p182H3.InterfaceC3210k
    public void flush() {
        ((InterfaceC3211l) this.f9663q0).flush();
        ((MediaCodec) this.f9661o0).flush();
        C3206g c3206g = (C3206g) this.f9662p0;
        synchronized (c3206g.f9679a) {
            c3206g.f9690l++;
            Handler handler = c3206g.f9681c;
            int i10 = AbstractC20817s.f66106a;
            handler.post(new RunnableC0000A(c3206g, 18));
        }
        ((MediaCodec) this.f9661o0).start();
    }

    @Override // p182H3.InterfaceC3210k
    public ByteBuffer getInputBuffer(int i10) {
        return ((MediaCodec) this.f9661o0).getInputBuffer(i10);
    }

    @Override // p182H3.InterfaceC3210k
    public ByteBuffer getOutputBuffer(int i10) {
        return ((MediaCodec) this.f9661o0).getOutputBuffer(i10);
    }

    @Override // p182H3.InterfaceC3210k
    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        C3206g c3206g = (C3206g) this.f9662p0;
        synchronized (c3206g.f9679a) {
            try {
                mediaFormat = c3206g.f9686h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: h */
    public void mo4059h(int i10, long j10) {
        ((MediaCodec) this.f9661o0).releaseOutputBuffer(i10, j10);
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: i */
    public int mo4060i() {
        int i10;
        ((InterfaceC3211l) this.f9663q0).mo4070r();
        C3206g c3206g = (C3206g) this.f9662p0;
        synchronized (c3206g.f9679a) {
            try {
                IllegalStateException illegalStateException = c3206g.f9692n;
                if (illegalStateException != null) {
                    c3206g.f9692n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c3206g.f9688j;
                if (codecException != null) {
                    c3206g.f9688j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c3206g.f9689k;
                if (cryptoException != null) {
                    c3206g.f9689k = null;
                    throw cryptoException;
                }
                i10 = -1;
                if (!(c3206g.f9690l > 0 || c3206g.f9691m)) {
                    C1878B c1878b = c3206g.f9682d;
                    int i11 = c1878b.f5456b;
                    int i12 = c1878b.f5457c;
                    if (!(i11 == i12)) {
                        if (i11 == i12) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i10 = c1878b.f5455a[i11];
                        c1878b.f5456b = (i11 + 1) & c1878b.f5458d;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: j */
    public boolean mo4061j(C3218s c3218s) {
        C3206g c3206g = (C3206g) this.f9662p0;
        synchronized (c3206g.f9679a) {
            c3206g.f9693o = c3218s;
        }
        return true;
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: k */
    public int mo4062k(MediaCodec.BufferInfo bufferInfo) {
        int i10;
        ((InterfaceC3211l) this.f9663q0).mo4070r();
        C3206g c3206g = (C3206g) this.f9662p0;
        synchronized (c3206g.f9679a) {
            try {
                IllegalStateException illegalStateException = c3206g.f9692n;
                if (illegalStateException != null) {
                    c3206g.f9692n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c3206g.f9688j;
                if (codecException != null) {
                    c3206g.f9688j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c3206g.f9689k;
                if (cryptoException != null) {
                    c3206g.f9689k = null;
                    throw cryptoException;
                }
                i10 = -1;
                if (!(c3206g.f9690l > 0 || c3206g.f9691m)) {
                    C1878B c1878b = c3206g.f9683e;
                    int i11 = c1878b.f5456b;
                    int i12 = c1878b.f5457c;
                    if (!(i11 == i12)) {
                        if (i11 == i12) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i10 = c1878b.f5455a[i11];
                        c1878b.f5456b = c1878b.f5458d & (i11 + 1);
                        if (i10 >= 0) {
                            AbstractC20800b.m21321i(c3206g.f9686h);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) c3206g.f9684f.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (i10 == -2) {
                            c3206g.f9686h = (MediaFormat) c3206g.f9685g.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: l */
    public void mo4063l(C5621k c5621k, Handler handler) {
        ((MediaCodec) this.f9661o0).setOnFrameRenderedListener(new C3200a(this, c5621k, 0), handler);
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: m */
    public void mo4064m(int i10) {
        ((MediaCodec) this.f9661o0).setVideoScalingMode(i10);
    }

    @Override // p182H3.InterfaceC3210k
    /* JADX INFO: renamed from: p */
    public void mo4065p(Surface surface) {
        ((MediaCodec) this.f9661o0).setOutputSurface(surface);
    }

    @Override // p182H3.InterfaceC3210k
    public void release() {
        try {
            if (this.f9659Y == 1) {
                ((InterfaceC3211l) this.f9663q0).shutdown();
                C3206g c3206g = (C3206g) this.f9662p0;
                synchronized (c3206g.f9679a) {
                    c3206g.f9691m = true;
                    c3206g.f9680b.quit();
                    c3206g.m4071a();
                }
            }
            this.f9659Y = 2;
            if (this.f9660Z) {
                return;
            }
            try {
                int i10 = AbstractC20817s.f66106a;
                if (i10 >= 30 && i10 < 33) {
                    ((MediaCodec) this.f9661o0).stop();
                }
            } finally {
                ((MediaCodec) this.f9661o0).release();
                this.f9660Z = true;
            }
        } catch (Throwable th2) {
            if (!this.f9660Z) {
                try {
                    int i11 = AbstractC20817s.f66106a;
                    if (i11 >= 30 && i11 < 33) {
                        ((MediaCodec) this.f9661o0).stop();
                    }
                } finally {
                    ((MediaCodec) this.f9661o0).release();
                    this.f9660Z = true;
                }
            }
            throw th2;
        }
    }

    @Override // p182H3.InterfaceC3210k
    public void releaseOutputBuffer(int i10, boolean z6) {
        ((MediaCodec) this.f9661o0).releaseOutputBuffer(i10, z6);
    }

    @Override // p182H3.InterfaceC3210k
    public void setParameters(Bundle bundle) {
        ((InterfaceC3211l) this.f9663q0).setParameters(bundle);
    }

    public C3202c(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC3211l interfaceC3211l) {
        this.f9661o0 = mediaCodec;
        this.f9662p0 = new C3206g(handlerThread);
        this.f9663q0 = interfaceC3211l;
        this.f9659Y = 0;
    }

    public C3202c() {
        this.f9661o0 = new Intent("android.intent.action.VIEW");
        this.f9662p0 = new C16831c();
        this.f9659Y = 0;
        this.f9660Z = true;
    }

    public C3202c(C20696e c20696e) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f9661o0 = intent;
        this.f9662p0 = new C16831c();
        this.f9659Y = 0;
        this.f9660Z = true;
        if (c20696e != null) {
            intent.setPackage(c20696e.f65556b.getPackageName());
            BinderC20692a binderC20692a = c20696e.f65555a;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC20692a);
            PendingIntent pendingIntent = c20696e.f65557c;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
