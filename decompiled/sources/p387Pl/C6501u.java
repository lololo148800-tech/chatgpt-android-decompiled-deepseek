package p387Pl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16549q;
import livekit.LivekitRtc$SubscribedQuality;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpParameters;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoSource;
import livekit.org.webrtc.VideoTrack;
import p1160zp.AbstractC22225a;
import p197Hj.C3457c;
import p224Il.C3741a;
import p225Im.InterfaceC3776x;
import p249Jl.SurfaceHolderCallbackC4482b;
import p273Kl.C4714D;
import p273Kl.C4762b;
import p435Rl.AbstractC6925i;
import p435Rl.C6924h;
import p435Rl.C6927k;
import p486Tl.AbstractC7506e;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.C8398j;
import p533Vl.EnumC8397i;
import p583Xl.AbstractC9537d;
import p594Y9.AbstractC9873d3;
import p793ho.EnumC14761i3;
import p817j$.util.Objects;
import p867l8.C16831c;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Pl.u */
/* JADX INFO: loaded from: classes3.dex */
public class C6501u extends AbstractC6482b0 {

    /* JADX INFO: renamed from: k */
    public final Context f21086k;

    /* JADX INFO: renamed from: l */
    public final EglBase f21087l;

    /* JADX INFO: renamed from: m */
    public final C6927k f21088m;

    /* JADX INFO: renamed from: n */
    public final VideoCapturer f21089n;

    /* JADX INFO: renamed from: o */
    public final VideoTrack f21090o;

    /* JADX INFO: renamed from: p */
    public String f21091p;

    /* JADX INFO: renamed from: q */
    public List f21092q;

    /* JADX INFO: renamed from: r */
    public final LinkedHashMap f21093r;

    /* JADX INFO: renamed from: s */
    public final C8398j f21094s;

    /* JADX INFO: renamed from: t */
    public RtpTransceiver f21095t;

    /* JADX INFO: renamed from: u */
    public final C3741a f21096u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ InterfaceC3776x[] f21085v = {AbstractC16526C.f51263a.mo5697f(new C16549q(C6501u.class, "options", "getOptions()Lio/livekit/android/room/track/LocalVideoTrackOptions;", 0))};
    public static final C6498r Companion = new C6498r();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6501u(VideoCapturer capturer, VideoSource videoSource, String str, C6502v options, VideoTrack videoTrack, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, C4762b defaultsManager, C6503w trackFactory, C6927k c6927k) {
        super(str, videoTrack);
        AbstractC16544l.m18094g(capturer, "capturer");
        AbstractC16544l.m18094g(options, "options");
        AbstractC16544l.m18094g(peerConnectionFactory, "peerConnectionFactory");
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(eglBase, "eglBase");
        AbstractC16544l.m18094g(defaultsManager, "defaultsManager");
        AbstractC16544l.m18094g(trackFactory, "trackFactory");
        this.f21086k = context;
        this.f21087l = eglBase;
        this.f21088m = c6927k;
        this.f21089n = capturer;
        this.f21090o = videoTrack;
        this.f21093r = new LinkedHashMap();
        this.f21094s = AbstractC9873d3.m10527a(options, null);
        this.f21096u = new C3741a();
    }

    /* JADX INFO: renamed from: j */
    public static final void m7063j(C6501u c6501u, C16525B c16525b, CameraEnumerator cameraEnumerator) {
        C6502v c6502vM7065l = c6501u.m7065l();
        String str = (String) c16525b.f51262Y;
        ArrayList arrayList = C6924h.f22195a;
        c6501u.f21094s.m8944g(C6502v.m7068a(c6502vM7065l, false, str, C6924h.m7311c(cameraEnumerator, str), 9), f21085v[0]);
    }

    @Override // p387Pl.AbstractC6468O
    /* JADX INFO: renamed from: a */
    public final void mo7038a() {
        super.mo7038a();
        this.f21089n.dispose();
        this.f21096u.close();
    }

    @Override // p387Pl.AbstractC6482b0, p387Pl.AbstractC6468O
    /* JADX INFO: renamed from: c */
    public final MediaStreamTrack mo7051c() {
        return this.f21090o;
    }

    @Override // p387Pl.AbstractC6468O
    /* JADX INFO: renamed from: f */
    public void mo7039f() {
        this.f21089n.stopCapture();
        AbstractC9537d.m10030a(new C3457c(this, 28));
        m7053e(false);
    }

    @Override // p387Pl.AbstractC6482b0
    /* JADX INFO: renamed from: g */
    public final void mo7040g(SurfaceHolderCallbackC4482b renderer) {
        AbstractC16544l.m18094g(renderer, "renderer");
        C6927k c6927k = this.f21088m;
        if (c6927k == null) {
            super.mo7040g(renderer);
        } else {
            synchronized (c6927k) {
                c6927k.f22198b.add(renderer);
            }
        }
    }

    @Override // p387Pl.AbstractC6482b0
    /* JADX INFO: renamed from: h */
    public final VideoTrack mo7051c() {
        return this.f21090o;
    }

    @Override // p387Pl.AbstractC6482b0
    /* JADX INFO: renamed from: i */
    public final void mo7041i(SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b) {
        C6927k c6927k = this.f21088m;
        if (c6927k == null) {
            AbstractC9537d.m10030a(new C4714D(this, 14, surfaceHolderCallbackC4482b));
        } else {
            synchronized (c6927k) {
                c6927k.f22198b.remove(surfaceHolderCallbackC4482b);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final C6460G m7064k() {
        VideoCapturer videoCapturer = this.f21089n;
        AbstractC6925i abstractC6925i = videoCapturer instanceof AbstractC6925i ? (AbstractC6925i) videoCapturer : null;
        if (abstractC6925i == null) {
            return new C6460G(m7065l().f21100d.f20999a, m7065l().f21100d.f21000b);
        }
        Size sizeFindCaptureFormat = abstractC6925i.findCaptureFormat(m7065l().f21100d.f20999a, m7065l().f21100d.f21000b);
        return new C6460G(sizeFindCaptureFormat.width, sizeFindCaptureFormat.height);
    }

    /* JADX INFO: renamed from: l */
    public final C6502v m7065l() {
        return (C6502v) this.f21094s.m8943c(f21085v[0]);
    }

    /* JADX INFO: renamed from: m */
    public final void m7066m(List list) {
        RtpTransceiver rtpTransceiver = this.f21095t;
        RtpSender sender = rtpTransceiver != null ? rtpTransceiver.getSender() : null;
        if (sender == null) {
            return;
        }
        m7067n(sender, list);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX INFO: renamed from: n */
    public final void m7067n(RtpSender rtpSender, List list) {
        List<RtpParameters.Encoding> list2;
        String str;
        Object next;
        if (m7052d()) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26118o0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                return;
            }
            AbstractC22225a.f70470a.getClass();
            C16831c.m18569g(new Object[0]);
            return;
        }
        try {
            RtpParameters parameters = rtpSender.getParameters();
            if (parameters == null || (list2 = parameters.encodings) == null) {
                return;
            }
            RtpParameters.Encoding encoding = (RtpParameters.Encoding) AbstractC17680n.m19343S(list2);
            boolean z6 = true;
            if ((encoding != null ? encoding.scalabilityMode : null) != null) {
                RtpParameters.Encoding encoding2 = (RtpParameters.Encoding) AbstractC17680n.m19341Q(list2);
                EnumC14761i3 enumC14761i3 = EnumC14761i3.OFF;
                Iterator it = list.iterator();
                EnumC14761i3 quality = enumC14761i3;
                while (it.hasNext()) {
                    LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality = (LivekitRtc$SubscribedQuality) it.next();
                    if (livekitRtc$SubscribedQuality.getEnabled() && (quality == enumC14761i3 || livekitRtc$SubscribedQuality.getQuality().getNumber() > quality.getNumber())) {
                        quality = livekitRtc$SubscribedQuality.getQuality();
                        AbstractC16544l.m18093f(quality, "getQuality(...)");
                    }
                }
                if (quality == enumC14761i3) {
                    if (encoding2.active) {
                        C8395g c8395g2 = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i2 = EnumC8397i.f26116Y;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18570i(new Object[0]);
                        }
                        encoding2.active = false;
                    } else {
                        z6 = false;
                    }
                } else if (encoding2.active) {
                    z6 = false;
                } else {
                    C8395g c8395g3 = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i3 = EnumC8397i.f26116Y;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18570i(new Object[0]);
                    }
                    encoding2.active = true;
                }
            } else {
                Iterator it2 = list.iterator();
                boolean z10 = false;
                while (it2.hasNext()) {
                    LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality2 = (LivekitRtc$SubscribedQuality) it2.next();
                    String[] strArr = AbstractC7506e.f23823a;
                    EnumC14761i3 quality2 = livekitRtc$SubscribedQuality2.getQuality();
                    AbstractC16544l.m18093f(quality2, "getQuality(...)");
                    int iOrdinal = quality2.ordinal();
                    if (iOrdinal == 0) {
                        str = "q";
                    } else if (iOrdinal != 1) {
                        str = iOrdinal != 2 ? null : "f";
                    } else {
                        str = "h";
                    }
                    if (str != null) {
                        Iterator<T> it3 = list2.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (!AbstractC16544l.m18089b(((RtpParameters.Encoding) next).rid, str));
                        RtpParameters.Encoding encoding3 = (RtpParameters.Encoding) next;
                        if (encoding3 == null) {
                            List<RtpParameters.Encoding> list3 = (list2.size() == 1 && livekitRtc$SubscribedQuality2.getQuality() == EnumC14761i3.LOW) ? list2 : null;
                            encoding3 = list3 != null ? (RtpParameters.Encoding) AbstractC17680n.m19341Q(list3) : null;
                            if (encoding3 == null) {
                            }
                        }
                        if (encoding3.active != livekitRtc$SubscribedQuality2.getEnabled()) {
                            encoding3.active = livekitRtc$SubscribedQuality2.getEnabled();
                            C8395g c8395g4 = AbstractC8396h.Companion;
                            EnumC8397i enumC8397i4 = EnumC8397i.f26116Y;
                            AbstractC8396h.Companion.getClass();
                            if (enumC8397i4.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                Objects.toString(livekitRtc$SubscribedQuality2.getQuality());
                                livekitRtc$SubscribedQuality2.getEnabled();
                                AbstractC22225a.f70470a.getClass();
                                C16831c.m18570i(new Object[0]);
                            }
                            z10 = true;
                        }
                    }
                }
                z6 = z10;
            }
            if (z6) {
                rtpSender.setParameters(parameters);
            }
        } catch (Exception unused) {
            C8395g c8395g5 = AbstractC8396h.Companion;
            EnumC8397i enumC8397i5 = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i5.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                return;
            }
            AbstractC22225a.f70470a.getClass();
            C16831c.m18571j(new Object[0]);
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo7059o() {
        this.f21089n.startCapture(m7065l().f21100d.f20999a, m7065l().f21100d.f21000b, m7065l().f21100d.f21001c);
    }
}
