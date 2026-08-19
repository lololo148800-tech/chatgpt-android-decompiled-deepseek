package p109E3;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import bb.AbstractC11278C;
import bb.C11294T;
import io.sentry.internal.debugmeta.C15384c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import livekit.org.webrtc.MediaStreamTrack;
import p001A.C0072l;
import p001A.RunnableC0000A;
import p003A1.AbstractC0168G;
import p031B3.C0803g;
import p057C3.C1527E;
import p057C3.C1556e;
import p057C3.C1558f;
import p057C3.C1559f0;
import p057C3.C1567l;
import p057C3.InterfaceC1536N;
import p057C3.SurfaceHolderCallbackC1523A;
import p080D0.C1817m0;
import p083D3.C1875m;
import p1016t3.AbstractC19754D;
import p1016t3.C19757G;
import p1016t3.C19778e;
import p1016t3.C19779f;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1031u3.InterfaceC20102e;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20813o;
import p1139z0.C21585H;
import p182H3.AbstractC3199A;
import p182H3.AbstractC3220u;
import p182H3.C3208i;
import p182H3.C3213n;
import p182H3.C3221v;
import p182H3.InterfaceC3209j;
import p182H3.InterfaceC3210k;
import p477Tb.C7296c;
import p509Uk.lpqL.SfpOlmlMATQ;
import p720e6.C13288c;
import p817j$.util.Objects;

/* JADX INFO: renamed from: E3.L */
/* JADX INFO: loaded from: classes.dex */
public final class C2271L extends AbstractC3220u implements InterfaceC1536N {

    /* JADX INFO: renamed from: Q1 */
    public final Context f7006Q1;

    /* JADX INFO: renamed from: R1 */
    public final C21585H f7007R1;

    /* JADX INFO: renamed from: S1 */
    public final C2268I f7008S1;

    /* JADX INFO: renamed from: U1 */
    public int f7009U1;

    /* JADX INFO: renamed from: V1 */
    public boolean f7010V1;

    /* JADX INFO: renamed from: W1 */
    public boolean f7011W1;

    /* JADX INFO: renamed from: X1 */
    public C19788o f7012X1;

    /* JADX INFO: renamed from: Y1 */
    public C19788o f7013Y1;

    /* JADX INFO: renamed from: Z1 */
    public long f7014Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f7015a2;

    /* JADX INFO: renamed from: b2 */
    public boolean f7016b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f7017c2;

    /* JADX INFO: renamed from: d2 */
    public int f7018d2;

    public C2271L(Context context, InterfaceC3209j interfaceC3209j, Handler handler, SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A, C2268I c2268i) {
        super(1, interfaceC3209j, 44100.0f);
        this.f7006Q1 = context.getApplicationContext();
        this.f7008S1 = c2268i;
        this.f7018d2 = -1000;
        this.f7007R1 = new C21585H(handler, 3, surfaceHolderCallbackC1523A);
        c2268i.f6997s = new C13288c(this);
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: C */
    public final C1558f mo3332C(C3213n c3213n, C19788o c19788o, C19788o c19788o2) {
        C1558f c1558fM4077b = c3213n.m4077b(c19788o, c19788o2);
        boolean z6 = this.f9750Q0 == null && mo3346p0(c19788o2);
        int i10 = c1558fM4077b.f4337e;
        if (z6) {
            i10 |= 32768;
        }
        if (m3349v0(c3213n, c19788o2) > this.f7009U1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C1558f(c3213n.f9703a, c19788o, c19788o2, i11 == 0 ? c1558fM4077b.f4336d : 0, i11);
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: N */
    public final float mo3333N(float f10, C19788o[] c19788oArr) {
        int iMax = -1;
        for (C19788o c19788o : c19788oArr) {
            int i10 = c19788o.f62730B;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: O */
    public final ArrayList mo3334O(C3221v c3221v, C19788o c19788o, boolean z6) {
        C11294T c11294tM4050g;
        if (c19788o.f62752m == null) {
            c11294tM4050g = C11294T.f34185q0;
        } else if (this.f7008S1.m3315f(c19788o) != 0) {
            List listM4048e = AbstractC3199A.m4048e("audio/raw", false, false);
            C3213n c3213n = listM4048e.isEmpty() ? null : (C3213n) listM4048e.get(0);
            if (c3213n != null) {
                c11294tM4050g = AbstractC11278C.m12695y(c3213n);
            } else {
                c11294tM4050g = AbstractC3199A.m4050g(c3221v, c19788o, z6, false);
            }
        } else {
            c11294tM4050g = AbstractC3199A.m4050g(c3221v, c19788o, z6, false);
        }
        Pattern pattern = AbstractC3199A.f9651a;
        ArrayList arrayList = new ArrayList(c11294tM4050g);
        Collections.sort(arrayList, new C1817m0(new C0072l(c19788o, 27), 1));
        return arrayList;
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: Q */
    public final void mo3336Q(C0803g c0803g) {
        C19788o c19788o;
        C2261B c2261b;
        if (AbstractC20817s.f66106a < 29 || (c19788o = c0803g.f2224o0) == null || !Objects.equals(c19788o.f62752m, "audio/opus") || !this.f9780u1) {
            return;
        }
        ByteBuffer byteBuffer = c0803g.f2229t0;
        byteBuffer.getClass();
        C19788o c19788o2 = c0803g.f2224o0;
        c19788o2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            C2268I c2268i = this.f7008S1;
            AudioTrack audioTrack = c2268i.f7001w;
            if (audioTrack == null || !C2268I.m3309m(audioTrack) || (c2261b = c2268i.f6999u) == null || !c2261b.f6923k) {
                return;
            }
            c2268i.f7001w.setOffloadDelayPadding(c19788o2.f62732D, i10);
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: V */
    public final void mo3337V(Exception exc) {
        AbstractC20800b.m21325m("MediaCodecAudioRenderer", "Audio codec error", exc);
        C21585H c21585h = this.f7007R1;
        Handler handler = (Handler) c21585h.f68344Z;
        if (handler != null) {
            handler.post(new RunnableC2289m(c21585h, exc, 4));
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: W */
    public final void mo3338W(long j10, long j11, String str) {
        C21585H c21585h = this.f7007R1;
        Handler handler = (Handler) c21585h.f68344Z;
        if (handler != null) {
            handler.post(new RunnableC2289m(c21585h, str, j10, j11));
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: X */
    public final void mo3339X(String str) {
        C21585H c21585h = this.f7007R1;
        Handler handler = (Handler) c21585h.f68344Z;
        if (handler != null) {
            handler.post(new RunnableC2289m(c21585h, str, 8));
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: Y */
    public final C1558f mo3340Y(C15384c c15384c) throws C1567l {
        C19788o c19788o = (C19788o) c15384c.f47968o0;
        c19788o.getClass();
        this.f7012X1 = c19788o;
        C1558f c1558fMo3340Y = super.mo3340Y(c15384c);
        C21585H c21585h = this.f7007R1;
        Handler handler = (Handler) c21585h.f68344Z;
        if (handler != null) {
            handler.post(new RunnableC2289m(c21585h, c19788o, c1558fMo3340Y));
        }
        return c1558fMo3340Y;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0104 A[Catch: n -> 0x0102, TryCatch #0 {n -> 0x0102, blocks: (B:42:0x00d9, B:45:0x00e1, B:47:0x00e5, B:49:0x00ee, B:53:0x00fc, B:56:0x0104, B:60:0x010b, B:61:0x0110), top: B:65:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: Z */
    public final void mo3341Z(C19788o c19788o, MediaFormat mediaFormat) throws C1567l {
        int iM21419t;
        int i10;
        C19788o c19788o2 = this.f7013Y1;
        boolean z6 = true;
        int[] iArr = null;
        if (c19788o2 != null) {
            c19788o = c19788o2;
        } else if (this.f9756W0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(c19788o.f62752m)) {
                iM21419t = c19788o.f62731C;
            } else if (AbstractC20817s.f66106a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM21419t = mediaFormat.containsKey("v-bits-per-sample") ? AbstractC20817s.m21419t(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iM21419t = mediaFormat.getInteger("pcm-encoding");
            }
            C19787n c19787n = new C19787n();
            c19787n.f62714l = AbstractC19754D.m20711i("audio/raw");
            c19787n.f62695B = iM21419t;
            c19787n.f62696C = c19788o.f62732D;
            c19787n.f62697D = c19788o.f62733E;
            c19787n.f62712j = c19788o.f62750k;
            c19787n.f62703a = c19788o.f62740a;
            c19787n.f62704b = c19788o.f62741b;
            c19787n.f62705c = AbstractC11278C.m12691t(c19788o.f62742c);
            c19787n.f62706d = c19788o.f62743d;
            c19787n.f62707e = c19788o.f62744e;
            c19787n.f62708f = c19788o.f62745f;
            c19787n.f62728z = mediaFormat.getInteger("channel-count");
            c19787n.f62694A = mediaFormat.getInteger("sample-rate");
            C19788o c19788o3 = new C19788o(c19787n);
            boolean z10 = this.f7010V1;
            int i11 = c19788o3.f62729A;
            if (z10 && i11 == 6 && (i10 = c19788o.f62729A) < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.f7011W1) {
                if (i11 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i11 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i11 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i11 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i11 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            c19788o = c19788o3;
        }
        try {
            int i13 = AbstractC20817s.f66106a;
            C2268I c2268i = this.f7008S1;
            if (i13 >= 29) {
                if (this.f9780u1) {
                    C1559f0 c1559f0 = this.f4298p0;
                    c1559f0.getClass();
                    if (c1559f0.f4339a != 0) {
                        C1559f0 c1559f1 = this.f4298p0;
                        c1559f1.getClass();
                        int i14 = c1559f1.f4339a;
                        c2268i.getClass();
                        if (i13 < 29) {
                            z6 = false;
                        }
                        AbstractC20800b.m21320h(z6);
                        c2268i.f6989l = i14;
                    } else {
                        c2268i.getClass();
                        if (i13 >= 29) {
                            z6 = false;
                        }
                        AbstractC20800b.m21320h(z6);
                        c2268i.f6989l = 0;
                    }
                } else {
                    c2268i.getClass();
                    if (i13 >= 29) {
                        z6 = false;
                    }
                    AbstractC20800b.m21320h(z6);
                    c2268i.f6989l = 0;
                }
            }
            c2268i.m3311b(c19788o, iArr);
        } catch (C2290n e10) {
            throw m2389b(e10, e10.f7079Y, false, 5001);
        }
    }

    @Override // p057C3.AbstractC1554d, p057C3.InterfaceC1551b0
    /* JADX INFO: renamed from: a */
    public final void mo2224a(int i10, Object obj) {
        C2268I c2268i = this.f7008S1;
        if (i10 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (c2268i.f6956P != fFloatValue) {
                c2268i.f6956P = fFloatValue;
                if (c2268i.m3321l()) {
                    if (AbstractC20817s.f66106a >= 21) {
                        c2268i.f7001w.setVolume(c2268i.f6956P);
                        return;
                    }
                    AudioTrack audioTrack = c2268i.f7001w;
                    float f10 = c2268i.f6956P;
                    audioTrack.setStereoVolume(f10, f10);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            C19778e c19778e = (C19778e) obj;
            c19778e.getClass();
            if (c2268i.f6941A.equals(c19778e)) {
                return;
            }
            c2268i.f6941A = c19778e;
            if (c2268i.f6974d0) {
                return;
            }
            C2286j c2286j = c2268i.f7003y;
            if (c2286j != null) {
                c2286j.f7070i = c19778e;
                c2286j.m3379a(C2281e.m3373c(c2286j.f7062a, c19778e, c2286j.f7069h));
            }
            c2268i.m3313d();
            return;
        }
        if (i10 == 6) {
            C19779f c19779f = (C19779f) obj;
            c19779f.getClass();
            if (c2268i.f6970b0.equals(c19779f)) {
                return;
            }
            if (c2268i.f7001w != null) {
                c2268i.f6970b0.getClass();
            }
            c2268i.f6970b0 = c19779f;
            return;
        }
        if (i10 == 12) {
            if (AbstractC20817s.f66106a >= 23) {
                AbstractC2270K.m3331a(c2268i, obj);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.f7018d2 = ((Integer) obj).intValue();
            InterfaceC3210k interfaceC3210k = this.f9756W0;
            if (interfaceC3210k != null && AbstractC20817s.f66106a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f7018d2));
                interfaceC3210k.setParameters(bundle);
                return;
            }
            return;
        }
        if (i10 == 9) {
            obj.getClass();
            c2268i.f6945E = ((Boolean) obj).booleanValue();
            C2262C c2262c = new C2262C(c2268i.m3328t() ? C19757G.f62563d : c2268i.f6944D, -9223372036854775807L, -9223372036854775807L);
            if (c2268i.m3321l()) {
                c2268i.f6942B = c2262c;
                return;
            } else {
                c2268i.f6943C = c2262c;
                return;
            }
        }
        if (i10 != 10) {
            if (i10 == 11) {
                this.f9751R0 = (C1527E) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (c2268i.f6968a0 != iIntValue) {
            c2268i.f6968a0 = iIntValue;
            c2268i.f6966Z = iIntValue != 0;
            c2268i.m3313d();
        }
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: a0 */
    public final void mo3342a0() {
        this.f7008S1.getClass();
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: c0 */
    public final void mo3343c0() {
        this.f7008S1.f6953M = true;
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: d */
    public final void mo2329d(C19757G c19757g) {
        C2268I c2268i = this.f7008S1;
        c2268i.getClass();
        c2268i.f6944D = new C19757G(AbstractC20817s.m21407h(c19757g.f62564a, 0.1f, 8.0f), AbstractC20817s.m21407h(c19757g.f62565b, 0.1f, 8.0f));
        if (c2268i.m3328t()) {
            c2268i.m3327s();
            return;
        }
        C2262C c2262c = new C2262C(c19757g, -9223372036854775807L, -9223372036854775807L);
        if (c2268i.m3321l()) {
            c2268i.f6942B = c2262c;
        } else {
            c2268i.f6943C = c2262c;
        }
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: e */
    public final long mo2330e() {
        if (this.f4302t0 == 2) {
            m3350w0();
        }
        return this.f7014Z1;
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: f */
    public final boolean mo2331f() {
        boolean z6 = this.f7017c2;
        this.f7017c2 = false;
        return z6;
    }

    @Override // p057C3.InterfaceC1536N
    /* JADX INFO: renamed from: g */
    public final C19757G mo2332g() {
        return this.f7008S1.f6944D;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: g0 */
    public final boolean mo3344g0(long j10, long j11, InterfaceC3210k interfaceC3210k, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z6, boolean z10, C19788o c19788o) throws C1567l {
        int i13;
        int i14;
        byteBuffer.getClass();
        if (this.f7013Y1 != null && (i11 & 2) != 0) {
            interfaceC3210k.getClass();
            interfaceC3210k.releaseOutputBuffer(i10, false);
            return true;
        }
        C2268I c2268i = this.f7008S1;
        if (z6) {
            if (interfaceC3210k != null) {
                interfaceC3210k.releaseOutputBuffer(i10, false);
            }
            this.f9742L1.f4316f += i12;
            c2268i.f6953M = true;
            return true;
        }
        try {
            if (!c2268i.m3318i(byteBuffer, j12, i12)) {
                return false;
            }
            if (interfaceC3210k != null) {
                interfaceC3210k.releaseOutputBuffer(i10, false);
            }
            this.f9742L1.f4315e += i12;
            return true;
        } catch (C2291o e10) {
            C19788o c19788o2 = this.f7012X1;
            if (this.f9780u1) {
                C1559f0 c1559f0 = this.f4298p0;
                c1559f0.getClass();
                if (c1559f0.f4339a != 0) {
                    i14 = 5004;
                } else {
                    i14 = 5001;
                }
            } else {
                i14 = 5001;
            }
            throw m2389b(e10, c19788o2, e10.f7081Z, i14);
        } catch (C2293q e11) {
            if (this.f9780u1) {
                C1559f0 c1559f1 = this.f4298p0;
                c1559f1.getClass();
                if (c1559f1.f4339a != 0) {
                    i13 = 5003;
                } else {
                    i13 = 5002;
                }
            } else {
                i13 = 5002;
            }
            throw m2389b(e11, c19788o, e11.f7083Z, i13);
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: i */
    public final String mo2392i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: j0 */
    public final void mo3345j0() throws C1567l {
        try {
            C2268I c2268i = this.f7008S1;
            if (!c2268i.f6962V && c2268i.m3321l() && c2268i.m3312c()) {
                c2268i.m3324p();
                c2268i.f6962V = true;
            }
        } catch (C2293q e10) {
            throw m2389b(e10, e10.f7084o0, e10.f7083Z, this.f9780u1 ? 5003 : 5002);
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: k */
    public final boolean mo2394k() {
        if (this.f9734H1) {
            C2268I c2268i = this.f7008S1;
            if (!c2268i.m3321l() || (c2268i.f6962V && !c2268i.m3319j())) {
                return true;
            }
        }
        return false;
    }

    @Override // p182H3.AbstractC3220u, p057C3.AbstractC1554d
    /* JADX INFO: renamed from: l */
    public final boolean mo2395l() {
        return this.f7008S1.m3319j() || super.mo2395l();
    }

    @Override // p182H3.AbstractC3220u, p057C3.AbstractC1554d
    /* JADX INFO: renamed from: m */
    public final void mo2396m() {
        C21585H c21585h = this.f7007R1;
        this.f7016b2 = true;
        this.f7012X1 = null;
        try {
            this.f7008S1.m3313d();
            try {
                super.mo2396m();
            } finally {
                c21585h.m21924i(this.f9742L1);
            }
        } catch (Throwable th2) {
            try {
                super.mo2396m();
                throw th2;
            } finally {
                c21585h.m21924i(this.f9742L1);
            }
        }
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: n */
    public final void mo2397n(boolean z6, boolean z10) {
        C1556e c1556e = new C1556e();
        this.f9742L1 = c1556e;
        C21585H c21585h = this.f7007R1;
        Handler handler = (Handler) c21585h.f68344Z;
        if (handler != null) {
            handler.post(new RunnableC2289m(c21585h, c1556e, 0));
        }
        C1559f0 c1559f0 = this.f4298p0;
        c1559f0.getClass();
        boolean z11 = c1559f0.f4340b;
        C2268I c2268i = this.f7008S1;
        if (z11) {
            c2268i.getClass();
            AbstractC20800b.m21320h(AbstractC20817s.f66106a >= 21);
            AbstractC20800b.m21320h(c2268i.f6966Z);
            if (!c2268i.f6974d0) {
                c2268i.f6974d0 = true;
                c2268i.m3313d();
            }
        } else if (c2268i.f6974d0) {
            c2268i.f6974d0 = false;
            c2268i.m3313d();
        }
        C1875m c1875m = this.f4300r0;
        c1875m.getClass();
        c2268i.f6996r = c1875m;
        C20813o c20813o = this.f4301s0;
        c20813o.getClass();
        c2268i.f6983i.f7107J = c20813o;
    }

    @Override // p182H3.AbstractC3220u, p057C3.AbstractC1554d
    /* JADX INFO: renamed from: o */
    public final void mo2398o(long j10, boolean z6) throws C1567l {
        super.mo2398o(j10, z6);
        this.f7008S1.m3313d();
        this.f7014Z1 = j10;
        this.f7017c2 = false;
        this.f7015a2 = true;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: p */
    public final void mo2399p() {
        C2283g c2283g;
        C2286j c2286j = this.f7008S1.f7003y;
        if (c2286j == null || !c2286j.f7071j) {
            return;
        }
        c2286j.f7068g = null;
        int i10 = AbstractC20817s.f66106a;
        Context context = c2286j.f7062a;
        if (i10 >= 23 && (c2283g = c2286j.f7065d) != null) {
            AbstractC2282f.m3377b(context, c2283g);
        }
        C2285i c2285i = c2286j.f7066e;
        if (c2285i != null) {
            context.unregisterReceiver(c2285i);
        }
        C2284h c2284h = c2286j.f7067f;
        if (c2284h != null) {
            c2284h.f7057a.unregisterContentObserver(c2284h);
        }
        c2286j.f7071j = false;
    }

    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: p0 */
    public final boolean mo3346p0(C19788o c19788o) {
        C1559f0 c1559f0 = this.f4298p0;
        c1559f0.getClass();
        if (c1559f0.f4339a != 0) {
            int iM3348u0 = m3348u0(c19788o);
            if ((iM3348u0 & 512) != 0) {
                C1559f0 c1559f1 = this.f4298p0;
                c1559f1.getClass();
                if (c1559f1.f4339a == 2 || (iM3348u0 & 1024) != 0 || (c19788o.f62732D == 0 && c19788o.f62733E == 0)) {
                    return true;
                }
            }
        }
        return this.f7008S1.m3315f(c19788o) != 0;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: q */
    public final void mo2400q() {
        C2268I c2268i = this.f7008S1;
        this.f7017c2 = false;
        try {
            try {
                m4088E();
                m4106i0();
                C7296c c7296c = this.f9750Q0;
                if (c7296c != null) {
                    c7296c.m7754F(null);
                }
                this.f9750Q0 = null;
                if (this.f7016b2) {
                    this.f7016b2 = false;
                    c2268i.m3326r();
                }
            } catch (Throwable th2) {
                C7296c c7296c2 = this.f9750Q0;
                if (c7296c2 != null) {
                    c7296c2.m7754F(null);
                }
                this.f9750Q0 = null;
                throw th2;
            }
        } catch (Throwable th3) {
            if (this.f7016b2) {
                this.f7016b2 = false;
                c2268i.m3326r();
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: q0 */
    public final int mo3347q0(C3221v c3221v, C19788o c19788o) {
        int iM3348u0;
        C11294T c11294tM4050g;
        C3213n c3213n;
        boolean z6;
        if (!MediaStreamTrack.AUDIO_TRACK_KIND.equals(AbstractC19754D.m20706d(c19788o.f62752m))) {
            return AbstractC0168G.m522k(0, 0, 0, 0);
        }
        int i10 = AbstractC20817s.f66106a >= 21 ? 32 : 0;
        boolean z10 = true;
        int i11 = c19788o.f62738J;
        boolean z11 = i11 != 0;
        boolean z12 = i11 == 0 || i11 == 2;
        int i12 = 8;
        C2268I c2268i = this.f7008S1;
        if (z12) {
            if (z11) {
                List listM4048e = AbstractC3199A.m4048e("audio/raw", false, false);
                if ((listM4048e.isEmpty() ? null : (C3213n) listM4048e.get(0)) == null) {
                    iM3348u0 = 0;
                }
            }
            iM3348u0 = m3348u0(c19788o);
            if (c2268i.m3315f(c19788o) != 0) {
                return AbstractC0168G.m522k(4, 8, i10, iM3348u0);
            }
        } else {
            iM3348u0 = 0;
        }
        String str = c19788o.f62752m;
        if ("audio/raw".equals(str) && c2268i.m3315f(c19788o) == 0) {
            return AbstractC0168G.m522k(1, 0, 0, 0);
        }
        C19787n c19787n = new C19787n();
        c19787n.f62714l = AbstractC19754D.m20711i("audio/raw");
        c19787n.f62728z = c19788o.f62729A;
        c19787n.f62694A = c19788o.f62730B;
        c19787n.f62695B = 2;
        if (c2268i.m3315f(new C19788o(c19787n)) == 0) {
            return AbstractC0168G.m522k(1, 0, 0, 0);
        }
        if (str == null) {
            c11294tM4050g = C11294T.f34185q0;
        } else if (c2268i.m3315f(c19788o) != 0) {
            List listM4048e2 = AbstractC3199A.m4048e("audio/raw", false, false);
            C3213n c3213n2 = listM4048e2.isEmpty() ? null : (C3213n) listM4048e2.get(0);
            if (c3213n2 != null) {
                c11294tM4050g = AbstractC11278C.m12695y(c3213n2);
            } else {
                c11294tM4050g = AbstractC3199A.m4050g(c3221v, c19788o, false, false);
            }
        } else {
            c11294tM4050g = AbstractC3199A.m4050g(c3221v, c19788o, false, false);
        }
        if (c11294tM4050g.isEmpty()) {
            return AbstractC0168G.m522k(1, 0, 0, 0);
        }
        if (!z12) {
            return AbstractC0168G.m522k(2, 0, 0, 0);
        }
        C3213n c3213n3 = (C3213n) c11294tM4050g.get(0);
        boolean zM4079d = c3213n3.m4079d(c19788o);
        if (!zM4079d) {
            int i13 = 1;
            while (true) {
                if (i13 >= c11294tM4050g.f34187p0) {
                    c3213n = c3213n3;
                    z6 = true;
                    z10 = zM4079d;
                    break;
                }
                c3213n = (C3213n) c11294tM4050g.get(i13);
                if (c3213n.m4079d(c19788o)) {
                    z6 = false;
                    break;
                }
                i13++;
            }
        } else {
            c3213n = c3213n3;
            z6 = true;
            z10 = zM4079d;
            break;
        }
        int i14 = z10 ? 4 : 3;
        if (z10 && c3213n.m4080e(c19788o)) {
            i12 = 16;
        }
        return (c3213n.f9709g ? 64 : 0) | i10 | i14 | i12 | (z6 ? 128 : 0) | iM3348u0;
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: r */
    public final void mo2401r() {
        this.f7008S1.m3323o();
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: s */
    public final void mo2402s() {
        m3350w0();
        C2268I c2268i = this.f7008S1;
        c2268i.f6965Y = false;
        if (c2268i.m3321l()) {
            C2297u c2297u = c2268i.f6983i;
            c2297u.m3386d();
            if (c2297u.f7132y == -9223372036854775807L) {
                C2296t c2296t = c2297u.f7113f;
                c2296t.getClass();
                c2296t.m3381a();
            } else {
                c2297u.f7098A = c2297u.m3384b();
                if (!C2268I.m3309m(c2268i.f7001w)) {
                    return;
                }
            }
            c2268i.f7001w.pause();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final int m3348u0(C19788o c19788o) {
        C2288l c2288lM3314e = this.f7008S1.m3314e(c19788o);
        if (!c2288lM3314e.f7074a) {
            return 0;
        }
        int i10 = c2288lM3314e.f7075b ? 1536 : 512;
        return c2288lM3314e.f7076c ? i10 | 2048 : i10;
    }

    /* JADX INFO: renamed from: v0 */
    public final int m3349v0(C3213n c3213n, C19788o c19788o) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(c3213n.f9703a) || (i10 = AbstractC20817s.f66106a) >= 24 || (i10 == 23 && AbstractC20817s.m21389C(this.f7006Q1))) {
            return c19788o.f62753n;
        }
        return -1;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m3350w0() {
        long jMax;
        ArrayDeque arrayDeque;
        long jM21418s;
        boolean zMo2394k = mo2394k();
        C2268I c2268i = this.f7008S1;
        if (!c2268i.m3321l() || c2268i.f6954N) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(c2268i.f6983i.m3383a(zMo2394k), AbstractC20817s.m21394H(c2268i.f6999u.f6917e, c2268i.m3317h()));
            while (true) {
                arrayDeque = c2268i.f6985j;
                if (arrayDeque.isEmpty() || jMin < ((C2262C) arrayDeque.getFirst()).f6927c) {
                    break;
                } else {
                    c2268i.f6943C = (C2262C) arrayDeque.remove();
                }
            }
            long j10 = jMin - c2268i.f6943C.f6927c;
            boolean zIsEmpty = arrayDeque.isEmpty();
            InterfaceC20102e interfaceC20102e = c2268i.f6969b;
            if (zIsEmpty) {
                jM21418s = c2268i.f6943C.f6926b + interfaceC20102e.mo2435g(j10);
            } else {
                C2262C c2262c = (C2262C) arrayDeque.getFirst();
                jM21418s = c2262c.f6926b - AbstractC20817s.m21418s(c2268i.f6943C.f6925a.f62564a, c2262c.f6927c - jMin);
            }
            long jMo2436n = interfaceC20102e.mo2436n();
            jMax = AbstractC20817s.m21394H(c2268i.f6999u.f6917e, jMo2436n) + jM21418s;
            long j11 = c2268i.f6986j0;
            if (jMo2436n > j11) {
                long jM21394H = AbstractC20817s.m21394H(c2268i.f6999u.f6917e, jMo2436n - j11);
                c2268i.f6986j0 = jMo2436n;
                c2268i.f6988k0 += jM21394H;
                if (c2268i.f6990l0 == null) {
                    c2268i.f6990l0 = new Handler(Looper.myLooper());
                }
                c2268i.f6990l0.removeCallbacksAndMessages(null);
                c2268i.f6990l0.postDelayed(new RunnableC0000A(c2268i, 11), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f7015a2) {
                jMax = Math.max(this.f7014Z1, jMax);
            }
            this.f7014Z1 = jMax;
            this.f7015a2 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    @Override // p182H3.AbstractC3220u
    /* JADX INFO: renamed from: P */
    public final C3208i mo3335P(C3213n c3213n, C19788o c19788o, MediaCrypto mediaCrypto, float f10) {
        boolean z6;
        C19788o[] c19788oArr = this.f4304v0;
        c19788oArr.getClass();
        int iM3349v0 = m3349v0(c3213n, c19788o);
        if (c19788oArr.length != 1) {
            for (C19788o c19788o2 : c19788oArr) {
                if (c3213n.m4077b(c19788o, c19788o2).f4336d != 0) {
                    iM3349v0 = Math.max(iM3349v0, m3349v0(c3213n, c19788o2));
                }
            }
        }
        this.f7009U1 = iM3349v0;
        int i10 = AbstractC20817s.f66106a;
        String str = c3213n.f9703a;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(AbstractC20817s.f66108c)) {
            String str2 = AbstractC20817s.f66107b;
            if (str2.startsWith("zeroflte") || str2.startsWith(SfpOlmlMATQ.LgkNFnkGTLkurn) || str2.startsWith("heroqlte")) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        this.f7010V1 = z6;
        this.f7011W1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        int i11 = this.f7009U1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c3213n.f9705c);
        mediaFormat.setInteger("channel-count", c19788o.f62729A);
        int i12 = c19788o.f62730B;
        mediaFormat.setInteger("sample-rate", i12);
        AbstractC20800b.m21331s(mediaFormat, c19788o.f62755p);
        AbstractC20800b.m21330r(mediaFormat, "max-input-size", i11);
        if (i10 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                if (i10 == 23) {
                    String str3 = AbstractC20817s.f66109d;
                    if (!"ZTE B2017G".equals(str3) && !"AXON 7 mini".equals(str3)) {
                        mediaFormat.setFloat("operating-rate", f10);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f10);
                }
            }
        }
        String str4 = c19788o.f62752m;
        if (i10 <= 28 && "audio/ac4".equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24) {
            C19787n c19787n = new C19787n();
            c19787n.f62714l = AbstractC19754D.m20711i("audio/raw");
            c19787n.f62728z = c19788o.f62729A;
            c19787n.f62694A = i12;
            c19787n.f62695B = 4;
            if (this.f7008S1.m3315f(new C19788o(c19787n)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i10 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f7018d2));
        }
        this.f7013Y1 = (!"audio/raw".equals(c3213n.f9704b) || "audio/raw".equals(str4)) ? null : c19788o;
        return new C3208i(c3213n, mediaFormat, c19788o, null, mediaCrypto);
    }

    @Override // p057C3.AbstractC1554d
    /* JADX INFO: renamed from: h */
    public final InterfaceC1536N mo2391h() {
        return this;
    }
}
