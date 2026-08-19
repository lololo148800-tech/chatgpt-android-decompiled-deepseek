package p342Nj;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.view.Surface;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.replay.video.C15310a;
import io.sentry.android.replay.video.C15311b;
import io.sentry.android.replay.video.C15312c;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.EnumC17307j;
import mm.InterfaceC17306i;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1426a;
import p1145z7.C21809f;
import p1145z7.C21810g;
import p1145z7.InterfaceC21804a;
import p571X9.AbstractC9227W;
import p672c3.C11616l0;
import p676c7.EnumC11684c;
import p722e8.C13298H;
import p984r8.C18887a;

/* JADX INFO: renamed from: Nj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5808b implements InterfaceC21804a {

    /* JADX INFO: renamed from: Y */
    public final Object f18957Y;

    /* JADX INFO: renamed from: Z */
    public final Object f18958Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f18959o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f18960p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f18961q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f18962r0;

    /* JADX INFO: renamed from: s0 */
    public final Object f18963s0;

    /* JADX INFO: renamed from: t0 */
    public final Object f18964t0;

    /* JADX INFO: renamed from: u0 */
    public Object f18965u0;

    public C5808b(C15524y1 options, C15310a c15310a) {
        AbstractC16544l.m18094g(options, "options");
        this.f18957Y = options;
        this.f18958Z = c15310a;
        this.f18959o0 = null;
        EnumC17307j enumC17307j = EnumC17307j.f55134Z;
        InterfaceC17306i interfaceC17306iM9799b = AbstractC9227W.m9799b(enumC17307j, C15312c.f47838Y);
        this.f18960p0 = interfaceC17306iM9799b;
        MediaCodec mediaCodecCreateByCodecName = ((Boolean) interfaceC17306iM9799b.getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(c15310a.f47831f);
        AbstractC16544l.m18093f(mediaCodecCreateByCodecName, "if (hasExynosCodec) {\n  …onfig.mimeType)\n        }");
        this.f18961q0 = mediaCodecCreateByCodecName;
        this.f18962r0 = AbstractC9227W.m9799b(enumC17307j, new C13298H(this, 19));
        this.f18963s0 = new MediaCodec.BufferInfo();
        String absolutePath = c15310a.f47826a.getAbsolutePath();
        AbstractC16544l.m18093f(absolutePath, "muxerConfig.file.absolutePath");
        this.f18964t0 = new C15311b(absolutePath, c15310a.f47829d);
    }

    /* JADX INFO: renamed from: b */
    public void m6198b() {
        MediaCodec mediaCodec = (MediaCodec) this.f18961q0;
        try {
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f18959o0;
            if (interfaceC1426a != null) {
                interfaceC1426a.invoke();
            }
            m6197a(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = (Surface) this.f18965u0;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = ((C15311b) this.f18964t0).f47833b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th2) {
            ((C15524y1) this.f18957Y).getLogger().mo16297h(EnumC15375i1.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: c */
    public String mo6199c() {
        return (String) this.f18963s0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: d */
    public String mo6200d() {
        return (String) this.f18964t0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: e */
    public String mo6201e() {
        return (String) this.f18965u0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: f */
    public String mo6202f() {
        return (String) this.f18962r0.getValue();
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: g */
    public String mo6203g() {
        return (String) this.f18958Z;
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: h */
    public String mo6204h() {
        return (String) this.f18959o0;
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: j */
    public String mo6205j() {
        return (String) this.f18957Y;
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: l */
    public String mo6206l() {
        return (String) this.f18960p0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: m */
    public EnumC11684c mo6207m() {
        return (EnumC11684c) this.f18961q0.getValue();
    }

    /* JADX INFO: renamed from: a */
    public void m6197a(boolean z6) {
        ByteBuffer byteBuffer;
        C15524y1 c15524y1 = (C15524y1) this.f18957Y;
        InterfaceC15127H logger = c15524y1.getLogger();
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        logger.mo16298o(enumC15375i1, "[Encoder]: drainCodec(" + z6 + ')', new Object[0]);
        MediaCodec mediaCodec = (MediaCodec) this.f18961q0;
        if (z6) {
            c15524y1.getLogger().mo16298o(enumC15375i1, "[Encoder]: sending EOS to encoder", new Object[0]);
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        while (true) {
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.f18963s0;
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z6) {
                    return;
                } else {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = mediaCodec.getOutputBuffers();
            } else {
                C15311b c15311b = (C15311b) this.f18964t0;
                if (iDequeueOutputBuffer == -2) {
                    if (c15311b.f47834c) {
                        throw new RuntimeException("format changed twice");
                    }
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    AbstractC16544l.m18093f(outputFormat, "mediaCodec.outputFormat");
                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                    MediaMuxer mediaMuxer = c15311b.f47833b;
                    c15311b.f47835d = mediaMuxer.addTrack(outputFormat);
                    mediaMuxer.start();
                    c15311b.f47834c = true;
                } else if (iDequeueOutputBuffer < 0) {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, AbstractC10763a.m11048f(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                } else {
                    if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                        throw new RuntimeException(AbstractC0010F.m19c(iDequeueOutputBuffer, VjclRfeKsMflo.emVZhJbGnxLV, " was null"));
                    }
                    if ((bufferInfo.flags & 2) != 0) {
                        c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (!c15311b.f47834c) {
                            throw new RuntimeException("muxer hasn't started");
                        }
                        int i10 = c15311b.f47836e;
                        c15311b.f47836e = i10 + 1;
                        long j10 = c15311b.f47832a * ((long) i10);
                        c15311b.f47837f = j10;
                        bufferInfo.presentationTimeUs = j10;
                        c15311b.f47833b.writeSampleData(c15311b.f47835d, byteBuffer, bufferInfo);
                        c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, AbstractC10763a.m11056n(new StringBuilder("[Encoder]: sent "), bufferInfo.size, " bytes to muxer"), new Object[0]);
                    }
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        if (z6) {
                            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                            return;
                        } else {
                            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                            return;
                        }
                    }
                }
            }
        }
    }

    public C5808b(Context appContext) {
        AbstractC16544l.m18094g(appContext, "appContext");
        String str = Build.BRAND;
        str = str == null ? "" : str;
        String str2 = Build.MODEL;
        str2 = str2 == null ? "" : str2;
        String str3 = Build.ID;
        str3 = str3 == null ? "" : str3;
        String str4 = Build.VERSION.RELEASE;
        String str5 = str4 != null ? str4 : "";
        EnumC17307j enumC17307j = EnumC17307j.f55133Y;
        this.f18961q0 = AbstractC9227W.m9799b(enumC17307j, new C11616l0(appContext, str2));
        this.f18962r0 = AbstractC9227W.m9799b(enumC17307j, new C21810g(this, 0));
        this.f18963s0 = AbstractC9227W.m9799b(enumC17307j, new C18887a(str, 6));
        this.f18957Y = str2;
        this.f18958Z = str3;
        this.f18959o0 = "Android";
        this.f18960p0 = str5;
        this.f18964t0 = AbstractC9227W.m9799b(enumC17307j, new C21810g(this, 1));
        this.f18965u0 = AbstractC9227W.m9799b(enumC17307j, C21809f.f69171Y);
    }

    public C5808b(String str, String str2, String str3, String str4, String str5, String str6, Map map, String str7, int i10) {
        str2 = (i10 & 2) != 0 ? null : str2;
        str5 = (i10 & 16) != 0 ? null : str5;
        str6 = (i10 & 32) != 0 ? null : str6;
        map = (i10 & 128) != 0 ? null : map;
        str7 = (i10 & 256) != 0 ? null : str7;
        this.f18957Y = str;
        this.f18958Z = str2;
        this.f18959o0 = str3;
        this.f18960p0 = str4;
        this.f18961q0 = str5;
        this.f18962r0 = str6;
        this.f18963s0 = null;
        this.f18965u0 = map;
        this.f18964t0 = str7;
    }
}
