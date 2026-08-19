package p344Nl;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import androidx.work.impl.utils.p651oZ.HhJS;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.C12168l;
import io.livekit.android.room.C15102a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$SimulcastCodecInfo;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitModels$UserPacket;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.org.webrtc.AudioTrack;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpParameters;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.ScreenCapturerAndroid;
import livekit.org.webrtc.SurfaceTextureHelper;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoSource;
import livekit.org.webrtc.VideoTrack;
import mm.C17296C;
import mm.C17308k;
import mm.C17309l;
import p002A0.C0146w;
import p016Ae.C0453o;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1436k;
import p101Dl.C2100a;
import p101Dl.C2103d;
import p101Dl.InterfaceC2110k;
import p1113xn.AbstractC21322p;
import p112E6.C2343b;
import p1160zp.AbstractC22225a;
import p153Fn.C2925c;
import p175Gl.C3103b;
import p193Hf.C3350b0;
import p199Hl.C3465A;
import p199Hl.C3480e;
import p201Hn.C3516e;
import p229J0.C4171z3;
import p248Jk.InterfaceC4478i;
import p273Kl.AbstractC4764c;
import p273Kl.C4727J0;
import p273Kl.C4738P;
import p273Kl.C4758Z0;
import p273Kl.C4761a1;
import p273Kl.C4762b;
import p273Kl.C4787n0;
import p273Kl.C4808y;
import p273Kl.EnumC4759a;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p310M9.C5311e;
import p341Ni.C5768Z;
import p387Pl.AbstractC6468O;
import p387Pl.AbstractC6470Q;
import p387Pl.C6460G;
import p387Pl.C6469P;
import p387Pl.C6471S;
import p387Pl.C6474V;
import p387Pl.C6487g;
import p387Pl.C6488h;
import p387Pl.C6489i;
import p387Pl.C6491k;
import p387Pl.C6494n;
import p387Pl.C6495o;
import p387Pl.C6496p;
import p387Pl.C6497q;
import p387Pl.C6498r;
import p387Pl.C6501u;
import p387Pl.C6502v;
import p387Pl.C6503w;
import p387Pl.EnumC6464K;
import p387Pl.EnumC6483c;
import p387Pl.InterfaceC6477Y;
import p435Rl.AbstractC6925i;
import p435Rl.C6924h;
import p435Rl.C6926j;
import p435Rl.C6927k;
import p435Rl.C6931o;
import p435Rl.InterfaceC6919c;
import p486Tl.AbstractC7506e;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p544W9.AbstractC8446A2;
import p557Wl.AbstractC8954j;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p793ho.C14573E3;
import p793ho.C14719c3;
import p793ho.C14739f2;
import p793ho.EnumC14692Y2;
import p793ho.EnumC14746g2;
import p817j$.util.Objects;
import p867l8.C16831c;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p913o2.AbstractC17803d;
import p972qm.C18777j;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Nl.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C5842n extends AbstractC5821C {

    /* JADX INFO: renamed from: A */
    public final C6496p f19106A;

    /* JADX INFO: renamed from: B */
    public final C6503w f19107B;

    /* JADX INFO: renamed from: C */
    public final C6489i f19108C;

    /* JADX INFO: renamed from: D */
    public final C4762b f19109D;

    /* JADX INFO: renamed from: E */
    public final InterfaceC1436k f19110E;

    /* JADX INFO: renamed from: F */
    public List f19111F;

    /* JADX INFO: renamed from: G */
    public final LinkedHashMap f19112G;

    /* JADX INFO: renamed from: H */
    public final LinkedHashMap f19113H;

    /* JADX INFO: renamed from: v */
    public boolean f19114v;

    /* JADX INFO: renamed from: w */
    public final C15102a f19115w;

    /* JADX INFO: renamed from: x */
    public final PeerConnectionFactory f19116x;

    /* JADX INFO: renamed from: y */
    public final Context f19117y;

    /* JADX INFO: renamed from: z */
    public final EglBase f19118z;

    /* JADX INFO: renamed from: l */
    public static List m6240l(C6460G c6460g, C5828J c5828j) {
        int i10;
        int i11;
        Object next;
        C6474V c6474vMo7047b = c5828j.f19038b;
        boolean z6 = c5828j.f19039c;
        if ((c6474vMo7047b == null && !z6) || (i10 = c6460g.f20962a) == 0 || (i11 = c6460g.f20963b) == 0) {
            return C17689w.f56480Y;
        }
        if (c6474vMo7047b == null) {
            List listM7811a = AbstractC7506e.m7811a(i10, i11);
            int iMax = Math.max(i10, i11);
            Iterator it = listM7811a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((InterfaceC6477Y) next).mo7046a().f20999a < iMax);
            InterfaceC6477Y interfaceC6477Y = (InterfaceC6477Y) next;
            if (interfaceC6477Y == null) {
                interfaceC6477Y = (InterfaceC6477Y) AbstractC17680n.m19351a0(listM7811a);
            }
            c6474vMo7047b = interfaceC6477Y.mo7047b();
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26117Z;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                Objects.toString(c6474vMo7047b);
                AbstractC22225a.f70470a.getClass();
                C16831c.m18567d(new Object[0]);
            }
        }
        ArrayList arrayList = new ArrayList();
        String str = c5828j.f19041e;
        if (str != null && AbstractC4764c.m5435b(c5828j.f19040d)) {
            RtpParameters.Encoding encodingM7057a = c6474vMo7047b.m7057a(null, 1.0d);
            encodingM7057a.scalabilityMode = str;
            arrayList.add(encodingM7057a);
            return arrayList;
        }
        if (z6) {
            List listM7811a2 = AbstractC7506e.m7811a(i10, i11);
            InterfaceC6477Y interfaceC6477Y2 = (InterfaceC6477Y) listM7811a2.get(1);
            InterfaceC6477Y interfaceC6477Y3 = (InterfaceC6477Y) listM7811a2.get(0);
            int iMax2 = Math.max(i10, i11);
            if (iMax2 >= 960) {
                C6471S c6471sMo7046a = interfaceC6477Y3.mo7046a();
                double d10 = iMax2;
                double dMax = d10 / ((double) Math.max(c6471sMo7046a.f20999a, c6471sMo7046a.f21000b));
                C6471S c6471sMo7046a2 = interfaceC6477Y2.mo7046a();
                double dMax2 = d10 / ((double) Math.max(c6471sMo7046a2.f20999a, c6471sMo7046a2.f21000b));
                m6241m(arrayList, interfaceC6477Y3.mo7047b(), dMax);
                m6241m(arrayList, interfaceC6477Y2.mo7047b(), dMax2);
            } else {
                C6471S c6471sMo7046a3 = interfaceC6477Y3.mo7046a();
                m6241m(arrayList, interfaceC6477Y3.mo7047b(), ((double) iMax2) / ((double) Math.max(c6471sMo7046a3.f20999a, c6471sMo7046a3.f21000b)));
            }
            m6241m(arrayList, c6474vMo7047b, 1.0d);
        } else {
            arrayList.add(c6474vMo7047b.m7057a(null, 1.0d));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static final void m6241m(ArrayList arrayList, C6474V c6474v, double d10) {
        if (d10 >= 1.0d) {
            int size = arrayList.size();
            String[] strArr = AbstractC7506e.f23823a;
            if (size >= 3) {
                throw new IllegalStateException("Attempting to add more encodings than we have rids for!");
            }
            arrayList.add(c6474v.m7057a(strArr[arrayList.size()], d10));
            return;
        }
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26119p0;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        AbstractC22225a.f70470a.getClass();
        C16831c.m18571j(new Object[0]);
    }

    /* JADX INFO: renamed from: n */
    public static C6487g m6242n(C5842n c5842n) {
        C6488h options = c5842n.f19109D.f15538a;
        c5842n.getClass();
        AbstractC16544l.m18094g(options, "options");
        C6487g.Companion.getClass();
        Context context = c5842n.f19117y;
        AbstractC16544l.m18094g(context, "context");
        PeerConnectionFactory factory = c5842n.f19116x;
        AbstractC16544l.m18094g(factory, "factory");
        C6489i audioTrackFactory = c5842n.f19108C;
        AbstractC16544l.m18094g(audioTrackFactory, "audioTrackFactory");
        if (AbstractC17803d.m19554a(context, "android.permission.RECORD_AUDIO") != 0) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18571j(new Object[0]);
            }
        }
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.optional.addAll(AbstractC17681o.m19382k(new MediaConstraints.KeyValuePair("googEchoCancellation", String.valueOf(options.f21053b)), new MediaConstraints.KeyValuePair("googAutoGainControl", String.valueOf(options.f21054c)), new MediaConstraints.KeyValuePair("googHighpassFilter", String.valueOf(options.f21055d)), new MediaConstraints.KeyValuePair("googNoiseSuppression", String.valueOf(options.f21052a)), new MediaConstraints.KeyValuePair("googTypingNoiseDetection", String.valueOf(options.f21056e))));
        AudioTrack audioTrackCreateAudioTrack = factory.createAudioTrack(UUID.randomUUID().toString(), factory.createAudioSource(mediaConstraints));
        AbstractC16544l.m18091d(audioTrackCreateAudioTrack);
        C5311e c5311e = audioTrackFactory.f21057a;
        InterfaceC2110k interfaceC2110k = (InterfaceC2110k) ((C0453o) c5311e.f17484Z).get();
        C3516e c3516e = AbstractC0593T.f1824a;
        AbstractC8446A2.m9048a(c3516e);
        return new C6487g("", audioTrackCreateAudioTrack, options, interfaceC2110k, c3516e, (C2103d) ((InterfaceC4478i) c5311e.f17485o0).get(), (C2100a) ((InterfaceC4478i) c5311e.f17486p0).get());
    }

    /* JADX INFO: renamed from: o */
    public static C6494n m6243o(C5842n c5842n, Intent mediaProjectionPermissionResultData) {
        C6502v c6502vM7068a = C6502v.m7068a(c5842n.f19109D.f15542e, false, null, null, 15);
        c5842n.getClass();
        AbstractC16544l.m18094g(mediaProjectionPermissionResultData, "mediaProjectionPermissionResultData");
        C6502v c6502vM7068a2 = C6502v.m7068a(c6502vM7068a, true, null, null, 14);
        C6494n.Companion.getClass();
        PeerConnectionFactory peerConnectionFactory = c5842n.f19116x;
        AbstractC16544l.m18094g(peerConnectionFactory, "peerConnectionFactory");
        Context context = c5842n.f19117y;
        AbstractC16544l.m18094g(context, "context");
        EglBase rootEglBase = c5842n.f19118z;
        AbstractC16544l.m18094g(rootEglBase, "rootEglBase");
        C6496p screencastVideoTrackFactory = c5842n.f19106A;
        AbstractC16544l.m18094g(screencastVideoTrackFactory, "screencastVideoTrackFactory");
        VideoSource videoSourceCreateVideoSource = peerConnectionFactory.createVideoSource(c6502vM7068a2.f21097a);
        videoSourceCreateVideoSource.setVideoProcessor(null);
        C6491k c6491k = new C6491k();
        ScreenCapturerAndroid screenCapturerAndroid = new ScreenCapturerAndroid(mediaProjectionPermissionResultData, c6491k);
        screenCapturerAndroid.initialize(SurfaceTextureHelper.create("ScreenVideoCaptureThread", rootEglBase.getEglBaseContext()), context, videoSourceCreateVideoSource.getCapturerObserver());
        VideoTrack videoTrackCreateVideoTrack = peerConnectionFactory.createVideoTrack(UUID.randomUUID().toString(), videoSourceCreateVideoSource);
        AbstractC16544l.m18091d(videoTrackCreateVideoTrack);
        C6495o c6495o = screencastVideoTrackFactory.f21075a;
        return new C6494n(screenCapturerAndroid, videoSourceCreateVideoSource, "", c6502vM7068a2, videoTrackCreateVideoTrack, c6491k, (PeerConnectionFactory) c6495o.f21070a.get(), (Context) c6495o.f21071b.f14617a, (EglBase) c6495o.f21072c.get(), (C4762b) c6495o.f21073d.get(), (C6503w) c6495o.f21074e.get());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    public static C6501u m6244p(C5842n c5842n) {
        C17309l c17309l;
        C6931o c6931o = null;
        C6502v c6502vM7068a = C6502v.m7068a(c5842n.f19109D.f15540c, false, null, null, 15);
        c5842n.getClass();
        C6498r c6498r = C6501u.Companion;
        PeerConnectionFactory peerConnectionFactory = c5842n.f19116x;
        Context context = c5842n.f19117y;
        EglBase rootEglBase = c5842n.f19118z;
        C6503w trackFactory = c5842n.f19107B;
        c6498r.getClass();
        AbstractC16544l.m18094g(peerConnectionFactory, "peerConnectionFactory");
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(rootEglBase, "rootEglBase");
        AbstractC16544l.m18094g(trackFactory, "trackFactory");
        if (AbstractC17803d.m19554a(context, "android.permission.CAMERA") != 0) {
            throw new SecurityException("Camera permissions are required to create a camera video track.");
        }
        ArrayList arrayList = C6924h.f22195a;
        InterfaceC6919c interfaceC6919cM7312d = C6924h.m7312d(context);
        C6926j c6926j = new C6926j();
        CameraEnumerator cameraEnumeratorProvideEnumerator = interfaceC6919cM7312d.provideEnumerator(context);
        String strM7310b = C6924h.m7310b(cameraEnumeratorProvideEnumerator, c6502vM7068a.f21098b, c6502vM7068a.f21099c, true);
        if (strM7310b == null) {
            c17309l = null;
        } else {
            VideoCapturer videoCapturerProvideCapturer = interfaceC6919cM7312d.provideCapturer(context, c6502vM7068a, c6926j);
            C6502v c6502vM7068a2 = C6502v.m7068a(c6502vM7068a, false, strM7310b, C6924h.m7311c(cameraEnumeratorProvideEnumerator, strM7310b), 9);
            if (!(videoCapturerProvideCapturer instanceof AbstractC6925i)) {
                C8395g c8395g = AbstractC8396h.Companion;
                EnumC8397i enumC8397i = EnumC8397i.f26119p0;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    videoCapturerProvideCapturer.getClass();
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18571j(new Object[0]);
                }
            }
            c17309l = new C17309l(videoCapturerProvideCapturer, c6502vM7068a2);
        }
        if (c17309l == null) {
            C8395g c8395g2 = AbstractC8396h.Companion;
            EnumC8397i enumC8397i2 = EnumC8397i.f26117Z;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18567d(new Object[0]);
            }
            c17309l = null;
        }
        if (c17309l == null) {
            throw new C17308k("An operation is not implemented.");
        }
        VideoCapturer capturer = (VideoCapturer) c17309l.f55136Y;
        C6502v options = (C6502v) c17309l.f55137Z;
        AbstractC16544l.m18094g(capturer, "capturer");
        AbstractC16544l.m18094g(options, "options");
        VideoSource videoSourceCreateVideoSource = peerConnectionFactory.createVideoSource(options.f21097a);
        C6471S c6471s = options.f21100d;
        if (c6471s.f21002d) {
            int i10 = c6471s.f20999a;
            int i11 = c6471s.f21000b;
            C6931o c6931o2 = new C6931o();
            c6931o2.f22205c = i10;
            c6931o2.f22206d = i11;
            c6931o2.f22200b = null;
            c6931o = c6931o2;
        }
        videoSourceCreateVideoSource.setVideoProcessor(c6931o);
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("VideoCaptureThread", rootEglBase.getEglBaseContext());
        C6927k c6927k = new C6927k();
        CapturerObserver capturerObserver = videoSourceCreateVideoSource.getCapturerObserver();
        AbstractC16544l.m18093f(capturerObserver, "getCapturerObserver(...)");
        synchronized (c6927k) {
            c6927k.f22197a.add(capturerObserver);
        }
        capturer.initialize(surfaceTextureHelperCreate, context, c6927k);
        VideoTrack videoTrackCreateVideoTrack = peerConnectionFactory.createVideoTrack(UUID.randomUUID().toString(), videoSourceCreateVideoSource);
        AbstractC16544l.m18091d(videoTrackCreateVideoTrack);
        C6495o c6495o = trackFactory.f21101a;
        C6501u c6501u = new C6501u(capturer, videoSourceCreateVideoSource, "", options, videoTrackCreateVideoTrack, (PeerConnectionFactory) c6495o.f21070a.get(), (Context) c6495o.f21071b.f14617a, (EglBase) c6495o.f21072c.get(), (C4762b) c6495o.f21073d.get(), (C6503w) c6495o.f21074e.get(), c6927k);
        c6501u.f21096u.m4435e(videoTrackCreateVideoTrack, new C2343b(surfaceTextureHelperCreate));
        return c6501u;
    }

    /* JADX INFO: renamed from: s */
    public static Object m6245s(C5842n c5842n, C6487g c6487g, AbstractC19687c abstractC19687c) {
        return c5842n.m6250r(c6487g, new C5831c(c5842n.f19109D.f15539b), abstractC19687c);
    }

    /* JADX INFO: renamed from: t */
    public static Object m6246t(C5842n c5842n, byte[] bArr, C5768Z c5768z) throws C6469P {
        EnumC14746g2 enumC14746g2;
        EnumC6483c enumC6483c = EnumC6483c.f21039Y;
        c5842n.getClass();
        if (bArr.length > 15000) {
            throw new IllegalArgumentException("cannot publish data larger than 15000");
        }
        int iOrdinal = enumC6483c.ordinal();
        if (iOrdinal == 0) {
            enumC14746g2 = EnumC14746g2.RELIABLE;
        } else {
            if (iOrdinal != 1) {
                throw new C0644w();
            }
            enumC14746g2 = EnumC14746g2.LOSSY;
        }
        C14719c3 c14719c3NewBuilder = LivekitModels$UserPacket.newBuilder();
        C12168l c12168lM14010j = AbstractC12171m.m14010j(bArr, 0, bArr.length);
        c14719c3NewBuilder.m13863d();
        ((LivekitModels$UserPacket) c14719c3NewBuilder.f36981Z).setPayload(c12168lM14010j);
        String str = c5842n.f18994a;
        c14719c3NewBuilder.m13863d();
        ((LivekitModels$UserPacket) c14719c3NewBuilder.f36981Z).setParticipantSid(str);
        C14739f2 c14739f2NewBuilder = LivekitModels$DataPacket.newBuilder();
        c14739f2NewBuilder.m13863d();
        ((LivekitModels$DataPacket) c14739f2NewBuilder.f36981Z).setUser((LivekitModels$UserPacket) c14719c3NewBuilder.m13861b());
        c14739f2NewBuilder.m13863d();
        ((LivekitModels$DataPacket) c14739f2NewBuilder.f36981Z).setKind(enumC14746g2);
        Object objM16218j = c5842n.f19115w.m16218j((LivekitModels$DataPacket) c14739f2NewBuilder.m13861b(), c5768z);
        return objM16218j == EnumC19250a.f61036Y ? objM16218j : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: w */
    public static Object m6247w(C5842n c5842n, C6501u c6501u, C5828J c5828j, AbstractC19687c abstractC19687c, int i10) {
        if ((i10 & 2) != 0) {
            c5828j = new C5828J(c5842n.f19109D.f15541d);
        }
        return c5842n.m6252v(c6501u, c5828j, abstractC19687c);
    }

    @Override // p344Nl.AbstractC5821C
    /* JADX INFO: renamed from: c */
    public final AbstractC6470Q mo6219c(EnumC6464K enumC6464K) {
        AbstractC6470Q abstractC6470QMo6219c = super.mo6219c(enumC6464K);
        if (abstractC6470QMo6219c instanceof C6497q) {
            return (C6497q) abstractC6470QMo6219c;
        }
        return null;
    }

    @Override // p344Nl.AbstractC5821C
    /* JADX INFO: renamed from: j */
    public final void mo6226j(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        boolean zM7054a;
        super.mo6226j(livekitModels$ParticipantInfo);
        for (LivekitModels$TrackInfo livekitModels$TrackInfo : livekitModels$ParticipantInfo.getTracksList()) {
            Object obj = m6220d().get(livekitModels$TrackInfo.getSid());
            C6497q c6497q = obj instanceof C6497q ? (C6497q) obj : null;
            if (c6497q != null && livekitModels$TrackInfo.getMuted() != (zM7054a = c6497q.m7054a())) {
                this.f19115w.m16220l(this.f18994a, zM7054a);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6248k() {
        for (AbstractC6470Q abstractC6470Q : m6220d().values()) {
            AbstractC6468O abstractC6468OM7055c = abstractC6470Q.m7055c();
            if (abstractC6468OM7055c != null) {
                abstractC6468OM7055c.mo7039f();
                m6255z(abstractC6468OM7055c, false);
                try {
                    abstractC6468OM7055c.mo7038a();
                } catch (Exception unused) {
                    C8395g c8395g = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i = EnumC8397i.f26117Z;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        abstractC6470Q.toString();
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18567d(new Object[0]);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final List m6249q() {
        Collection<AbstractC6470Q> collectionValues = m6220d().values();
        ArrayList arrayList = new ArrayList();
        for (AbstractC6470Q abstractC6470Q : collectionValues) {
            C6497q c6497q = abstractC6470Q instanceof C6497q ? (C6497q) abstractC6470Q : null;
            if (c6497q != null) {
                arrayList.add(c6497q);
            }
        }
        return AbstractC17680n.m19322C0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m6250r(C6487g c6487g, C5831c c5831c, AbstractC19687c abstractC19687c) throws C6469P {
        C5837i c5837i;
        C5842n c5842n;
        if (abstractC19687c instanceof C5837i) {
            c5837i = (C5837i) abstractC19687c;
            int i10 = c5837i.f19079q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5837i.f19079q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5837i = new C5837i(this, abstractC19687c);
            }
        } else {
            c5837i = new C5837i(this, abstractC19687c);
        }
        C5837i c5837i2 = c5837i;
        Object objM6251u = c5837i2.f19077o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5837i2.f19079q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM6251u);
            RtpParameters.Encoding encoding = new RtpParameters.Encoding(null, true, null);
            Integer num = c5831c.f19051b;
            if (num != null && num.intValue() > 0) {
                encoding.maxBitrateBps = c5831c.f19051b;
            }
            List listM9974d = AbstractC9393x3.m9974d(encoding);
            C4171z3 c4171z3 = new C4171z3(c5831c, 22);
            c5837i2.f19075Y = this;
            c5837i2.f19076Z = c6487g;
            c5837i2.f19079q0 = 1;
            objM6251u = m6251u(c6487g, c5831c, c4171z3, listM9974d, c5837i2);
            if (objM6251u == enumC19250a) {
                return enumC19250a;
            }
            c5842n = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6487g = c5837i2.f19076Z;
            c5842n = c5837i2.f19075Y;
            AbstractC9233X.m9807c(objM6251u);
        }
        C6497q c6497q = (C6497q) objM6251u;
        if (c6497q != null) {
            c5842n.f19112G.put(c6497q, AbstractC0575H.m1156D(c5842n.f18996c, null, null, new C5838j(c6487g, c5842n, c6497q, null), 3));
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: v */
    public final Object m6252v(C6501u c6501u, C5828J c5828j, AbstractC19687c abstractC19687c) throws C6469P {
        boolean zM5435b = AbstractC4764c.m5435b(c5828j.f19040d);
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = c5828j;
        if (zM5435b) {
            this.f19114v = true;
            if (c5828j.f19042f == null) {
                c16525b.f51262Y = C5828J.m6236h(c5828j, null, null, null, new C5832d(), 479);
            }
            C5828J c5828j2 = (C5828J) c16525b.f51262Y;
            if (c5828j2.f19041e == null) {
                c16525b.f51262Y = C5828J.m6236h(c5828j2, null, null, "L3T3_KEY", null, 495);
            }
        }
        List listM6240l = m6240l(c6501u.m7064k(), (C5828J) c16525b.f51262Y);
        String[] strArr = AbstractC7506e.f23823a;
        Object objM6251u = m6251u(c6501u, (InterfaceC5826H) c16525b.f51262Y, new C0146w(c6501u, c16525b, AbstractC7506e.m7812b(c6501u.m7064k().f20962a, c6501u.m7064k().f20963b, listM6240l, zM5435b), 27), listM6240l, abstractC19687c);
        return objM6251u == EnumC19250a.f61036Y ? objM6251u : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m6253x(AbstractC19687c abstractC19687c) throws Throwable {
        C5840l c5840l;
        C5842n c5842n;
        Iterator it;
        if (abstractC19687c instanceof C5840l) {
            c5840l = (C5840l) abstractC19687c;
            int i10 = c5840l.f19097q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5840l.f19097q0 = i10 - Integer.MIN_VALUE;
            } else {
                c5840l = new C5840l(this, abstractC19687c);
            }
        } else {
            c5840l = new C5840l(this, abstractC19687c);
        }
        Object obj = c5840l.f19095o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5840l.f19097q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            List list = this.f19111F;
            List listM19322C0 = list != null ? AbstractC17680n.m19322C0(list) : C17689w.f56480Y;
            this.f19111F = null;
            c5842n = this;
            it = listM19322C0.iterator();
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c5840l.f19094Z;
            c5842n = c5840l.f19093Y;
            AbstractC9233X.m9807c(obj);
        }
        while (it.hasNext()) {
            C6497q c6497q = (C6497q) it.next();
            AbstractC6468O abstractC6468OM7055c = c6497q.m7055c();
            if (abstractC6468OM7055c != null) {
                c5842n.m6255z(abstractC6468OM7055c, false);
                if (c6497q.m7054a()) {
                    continue;
                } else {
                    boolean z6 = abstractC6468OM7055c instanceof C6487g;
                    InterfaceC5826H interfaceC5826H = c6497q.f21076k;
                    if (z6) {
                        AbstractC16544l.m18092e(interfaceC5826H, "null cannot be cast to non-null type io.livekit.android.room.participant.AudioTrackPublishOptions");
                        c5840l.f19093Y = c5842n;
                        c5840l.f19094Z = it;
                        c5840l.f19097q0 = 1;
                        if (c5842n.m6250r((C6487g) abstractC6468OM7055c, (C5831c) interfaceC5826H, c5840l) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else {
                        if (!(abstractC6468OM7055c instanceof C6501u)) {
                            throw new IllegalStateException("LocalParticipant has a non local track publish?");
                        }
                        AbstractC16544l.m18092e(interfaceC5826H, "null cannot be cast to non-null type io.livekit.android.room.participant.VideoTrackPublishOptions");
                        c5840l.f19093Y = c5842n;
                        c5840l.f19094Z = it;
                        c5840l.f19097q0 = 2;
                        if (c5842n.m6252v((C6501u) abstractC6468OM7055c, (C5828J) interfaceC5826H, c5840l) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: y */
    public final Object m6254y(EnumC6464K enumC6464K, boolean z6, Intent intent, AbstractC19687c abstractC19687c) throws Throwable {
        C5841m c5841m;
        InterfaceC4814a interfaceC4814a;
        Intent intent2;
        boolean z10;
        EnumC6464K source;
        C5842n c5842n;
        InterfaceC4814a interfaceC4814a2;
        AbstractC6468O abstractC6468OM7055c;
        C6494n c6494nM6243o;
        C5842n c5842n2;
        C5828J c5828j;
        if (abstractC19687c instanceof C5841m) {
            c5841m = (C5841m) abstractC19687c;
            int i10 = c5841m.f19105t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5841m.f19105t0 = i10 - Integer.MIN_VALUE;
            } else {
                c5841m = new C5841m(this, abstractC19687c);
            }
        } else {
            c5841m = new C5841m(this, abstractC19687c);
        }
        Object obj = c5841m.f19103r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5841m.f19105t0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                Object obj2 = this.f19113H.get(enumC6464K);
                AbstractC16544l.m18091d(obj2);
                interfaceC4814a = (InterfaceC4814a) obj2;
                c5841m.f19098Y = this;
                c5841m.f19099Z = enumC6464K;
                intent2 = intent;
                c5841m.f19100o0 = intent2;
                c5841m.f19101p0 = interfaceC4814a;
                z10 = z6;
                c5841m.f19102q0 = z10;
                c5841m.f19105t0 = 1;
                if (((C4816c) interfaceC4814a).m5448e(null, c5841m) == enumC19250a) {
                    return enumC19250a;
                }
                source = enumC6464K;
                c5842n = this;
            } else if (i11 != 1) {
                try {
                    if (i11 != 2 && i11 != 3) {
                        if (i11 == 4) {
                            c6494nM6243o = (C6494n) c5841m.f19100o0;
                            InterfaceC4814a interfaceC4814a3 = (InterfaceC4814a) c5841m.f19099Z;
                            c5842n2 = (C5842n) c5841m.f19098Y;
                            try {
                                AbstractC9233X.m9807c(obj);
                                interfaceC4814a = interfaceC4814a3;
                                c6494nM6243o.mo7059o();
                                c5828j = new C5828J(c5842n2.f19109D.f15543f);
                                c5841m.f19098Y = interfaceC4814a;
                                c5841m.f19099Z = null;
                                c5841m.f19100o0 = null;
                                c5841m.f19105t0 = 5;
                                if (m6247w(c5842n2, c6494nM6243o, c5828j, c5841m, 4) == enumC19250a) {
                                    return enumC19250a;
                                }
                                interfaceC4814a2 = interfaceC4814a;
                                interfaceC4814a = interfaceC4814a2;
                                ((C4816c) interfaceC4814a).m5450g(null);
                                return C17296C.f55119a;
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC4814a2 = interfaceC4814a3;
                            }
                        } else {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC4814a2 = (InterfaceC4814a) c5841m.f19098Y;
                        }
                        ((C4816c) interfaceC4814a2).m5450g(null);
                        throw th;
                    }
                    interfaceC4814a2 = (InterfaceC4814a) c5841m.f19098Y;
                    AbstractC9233X.m9807c(obj);
                    interfaceC4814a = interfaceC4814a2;
                    ((C4816c) interfaceC4814a).m5450g(null);
                    return C17296C.f55119a;
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                boolean z11 = c5841m.f19102q0;
                InterfaceC4814a interfaceC4814a4 = c5841m.f19101p0;
                Intent intent3 = (Intent) c5841m.f19100o0;
                source = (EnumC6464K) c5841m.f19099Z;
                c5842n = (C5842n) c5841m.f19098Y;
                AbstractC9233X.m9807c(obj);
                interfaceC4814a = interfaceC4814a4;
                intent2 = intent3;
                z10 = z11;
            }
            c5842n.getClass();
            AbstractC16544l.m18094g(source, "source");
            AbstractC6470Q abstractC6470QMo6219c = super.mo6219c(source);
            C6497q c6497q = abstractC6470QMo6219c instanceof C6497q ? (C6497q) abstractC6470QMo6219c : null;
            if (z10) {
                if (c6497q != null) {
                    c6497q.mo7036d(false);
                    if (source == EnumC6464K.f20969Y && (c6497q.m7055c() instanceof C6501u)) {
                        AbstractC6468O abstractC6468OM7055c2 = c6497q.m7055c();
                        C6501u c6501u = abstractC6468OM7055c2 instanceof C6501u ? (C6501u) abstractC6468OM7055c2 : null;
                        if (c6501u != null) {
                            c6501u.mo7059o();
                        }
                    }
                } else {
                    int iOrdinal = source.ordinal();
                    if (iOrdinal == 0) {
                        C6501u c6501uM6244p = m6244p(c5842n);
                        c6501uM6244p.mo7059o();
                        c5841m.f19098Y = interfaceC4814a;
                        c5841m.f19099Z = null;
                        c5841m.f19100o0 = null;
                        c5841m.f19101p0 = null;
                        c5841m.f19105t0 = 2;
                        if (m6247w(c5842n, c6501uM6244p, null, c5841m, 6) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else if (iOrdinal == 1) {
                        C6487g c6487gM6242n = m6242n(c5842n);
                        c5841m.f19098Y = interfaceC4814a;
                        c5841m.f19099Z = null;
                        c5841m.f19100o0 = null;
                        c5841m.f19101p0 = null;
                        c5841m.f19105t0 = 3;
                        if (m6245s(c5842n, c6487gM6242n, c5841m) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else if (iOrdinal != 2) {
                        C8395g c8395g = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i = EnumC8397i.f26119p0;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18571j(new Object[0]);
                        }
                    } else {
                        if (intent2 == null) {
                            throw new IllegalArgumentException("Media Projection permission result data is required to create a screen share track.");
                        }
                        c6494nM6243o = m6243o(c5842n, intent2);
                        c5841m.f19098Y = c5842n;
                        c5841m.f19099Z = interfaceC4814a;
                        c5841m.f19100o0 = c6494nM6243o;
                        c5841m.f19101p0 = null;
                        c5841m.f19105t0 = 4;
                        if (c6494nM6243o.m7061q(c5841m) == enumC19250a) {
                            return enumC19250a;
                        }
                        c5842n2 = c5842n;
                        c6494nM6243o.mo7059o();
                        c5828j = new C5828J(c5842n2.f19109D.f15543f);
                        c5841m.f19098Y = interfaceC4814a;
                        c5841m.f19099Z = null;
                        c5841m.f19100o0 = null;
                        c5841m.f19105t0 = 5;
                        if (m6247w(c5842n2, c6494nM6243o, c5828j, c5841m, 4) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    interfaceC4814a2 = interfaceC4814a;
                    interfaceC4814a = interfaceC4814a2;
                }
            } else if (c6497q != null && (abstractC6468OM7055c = c6497q.m7055c()) != null) {
                if (c6497q.f20996g == EnumC6464K.f20971o0) {
                    c5842n.m6255z(abstractC6468OM7055c, true);
                } else {
                    c6497q.mo7036d(true);
                    if (c6497q.f20996g == EnumC6464K.f20969Y && (abstractC6468OM7055c instanceof C6501u)) {
                        ((C6501u) abstractC6468OM7055c).f21089n.stopCapture();
                    }
                }
            }
            ((C4816c) interfaceC4814a).m5450g(null);
            return C17296C.f55119a;
        } catch (Throwable th4) {
            th = th4;
            interfaceC4814a2 = interfaceC4814a;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m6255z(AbstractC6468O abstractC6468O, boolean z6) throws Throwable {
        Object next;
        Iterator it = m6249q().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC16544l.m18089b(((C6497q) next).m7055c(), abstractC6468O));
        C6497q c6497q = (C6497q) next;
        if (c6497q == null) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26117Z;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                return;
            }
            AbstractC22225a.f70470a.getClass();
            C16831c.m18567d(new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = this.f19112G;
        InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) linkedHashMap.get(c6497q);
        if (interfaceC0627n0 != null) {
            interfaceC0627n0.mo1275e(null);
            linkedHashMap.remove(interfaceC0627n0);
        }
        String str = c6497q.f20992c;
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(m6220d());
        linkedHashMapM19256r.remove(str);
        m6225i(linkedHashMapM19256r);
        C15102a c15102a = this.f19115w;
        if (c15102a.m16214f() == EnumC4759a.f15525Z) {
            MediaStreamTrack rtcTrack = abstractC6468O.mo7051c();
            AbstractC16544l.m18094g(rtcTrack, "rtcTrack");
            AbstractC0575H.m1161I(C18777j.f59682Y, new C4787n0(c15102a, rtcTrack, null));
        }
        if (z6) {
            abstractC6468O.mo7039f();
        }
        C4727J0 c4727j0 = this.f19010q;
        if (c4727j0 != null) {
            c4727j0.m5417l(c6497q, this);
        }
        this.f18997d.m12669r(new C3480e(this, c6497q, 3), this.f18996c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5842n(C15102a engine, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, C6496p screencastVideoTrackFactory, C6503w videoTrackFactory, C6489i audioTrackFactory, C4762b defaultsManager, AbstractC0563B coroutineDispatcher, InterfaceC1436k capabilitiesGetter) {
        super("", null, coroutineDispatcher);
        AbstractC16544l.m18094g(engine, "engine");
        AbstractC16544l.m18094g(peerConnectionFactory, "peerConnectionFactory");
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(eglBase, MMVKXkcLpuHFDi.XGGgCgxPPk);
        AbstractC16544l.m18094g(screencastVideoTrackFactory, "screencastVideoTrackFactory");
        AbstractC16544l.m18094g(videoTrackFactory, "videoTrackFactory");
        AbstractC16544l.m18094g(audioTrackFactory, "audioTrackFactory");
        AbstractC16544l.m18094g(defaultsManager, "defaultsManager");
        AbstractC16544l.m18094g(coroutineDispatcher, "coroutineDispatcher");
        AbstractC16544l.m18094g(capabilitiesGetter, "capabilitiesGetter");
        this.f19114v = false;
        this.f19115w = engine;
        this.f19116x = peerConnectionFactory;
        this.f19117y = context;
        this.f19118z = eglBase;
        this.f19106A = screencastVideoTrackFactory;
        this.f19107B = videoTrackFactory;
        this.f19108C = audioTrackFactory;
        this.f19109D = defaultsManager;
        this.f19110E = capabilitiesGetter;
        this.f19112G = new LinkedHashMap();
        EnumC6464K[] enumC6464KArrValues = EnumC6464K.values();
        int iM19257b = AbstractC17660E.m19257b(enumC6464KArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b < 16 ? 16 : iM19257b);
        for (EnumC6464K enumC6464K : enumC6464KArrValues) {
            linkedHashMap.put(enumC6464K, AbstractC4817d.m5451a());
        }
        this.f19113H = linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:59:0x0180  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0210  */
    /* JADX WARN: Code duplicated, block: B:83:0x0218  */
    /* JADX WARN: Code duplicated, block: B:84:0x021b  */
    /* JADX WARN: Code duplicated, block: B:86:0x021e  */
    /* JADX WARN: Code duplicated, block: B:88:0x022d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0234  */
    /* JADX WARN: Code duplicated, block: B:92:0x0244  */
    /* JADX WARN: Code duplicated, block: B:95:0x0252  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x02d3, please report this as an issue */
    /* JADX INFO: renamed from: u */
    public final Object m6251u(AbstractC6468O abstractC6468O, InterfaceC5826H interfaceC5826H, InterfaceC1436k interfaceC1436k, List list, AbstractC19687c abstractC19687c) throws C6469P {
        C5839k c5839k;
        InterfaceC5826H interfaceC5826H2;
        C5842n c5842n;
        String str;
        List list2;
        List listM6240l;
        InterfaceC5826H interfaceC5826H3;
        AbstractC6468O abstractC6468O2;
        LivekitModels$TrackInfo livekitModels$TrackInfo;
        C5842n c5842n2;
        InterfaceC5826H interfaceC5826H4;
        String str2;
        String lowerCase;
        String str3;
        RtpTransceiver rtpTransceiver;
        C6497q c6497q;
        EnumC8397i enumC8397i;
        C4727J0 c4727j0;
        C3103b c3103b;
        C3465A c3465a;
        C2925c c2925c;
        C5828J c5828j;
        RtpParameters.Encoding encoding;
        Integer num;
        C4758Z0 c4758z0;
        Integer num2;
        int iIntValue;
        C4808y c4808y;
        AbstractC6468O abstractC6468O3 = abstractC6468O;
        if (abstractC19687c instanceof C5839k) {
            c5839k = (C5839k) abstractC19687c;
            int i10 = c5839k.f19092u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5839k.f19092u0 = i10 - Integer.MIN_VALUE;
            } else {
                c5839k = new C5839k(this, abstractC19687c);
            }
        } else {
            c5839k = new C5839k(this, abstractC19687c);
        }
        Object obj = c5839k.f19090s0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5839k.f19092u0;
        if (i11 != 0) {
            if (i11 == 1) {
                String str4 = c5839k.f19088q0;
                list2 = c5839k.f19087p0;
                interfaceC5826H2 = c5839k.f19086o0;
                AbstractC6468O abstractC6468O4 = c5839k.f19085Z;
                c5842n = c5839k.f19084Y;
                AbstractC9233X.m9807c(obj);
                str = str4;
                abstractC6468O3 = abstractC6468O4;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                livekitModels$TrackInfo = c5839k.f19089r0;
                str2 = c5839k.f19088q0;
                listM6240l = c5839k.f19087p0;
                InterfaceC5826H interfaceC5826H5 = c5839k.f19086o0;
                abstractC6468O2 = c5839k.f19085Z;
                c5842n2 = c5839k.f19084Y;
                AbstractC9233X.m9807c(obj);
                interfaceC5826H4 = interfaceC5826H5;
            }
            rtpTransceiver = (RtpTransceiver) obj;
            if (abstractC6468O2 instanceof C6501u) {
                ((C6501u) abstractC6468O2).f21095t = rtpTransceiver;
            } else {
                if (abstractC6468O2 instanceof C6487g) {
                    throw new IllegalArgumentException("Trying to publish a non local track of type " + abstractC6468O2.getClass());
                }
                ((C6487g) abstractC6468O2).f21049l = rtpTransceiver;
            }
            if (rtpTransceiver == null) {
                return null;
            }
            C15102a c15102a = c5842n2.f19115w;
            RtpSender sender = rtpTransceiver.getSender();
            AbstractC16544l.m18093f(sender, "getSender(...)");
            c15102a.getClass();
            abstractC6468O2.f20988g = new C3350b0(c15102a.f46958r, 23, sender);
            if (!listM6240l.isEmpty() && (interfaceC5826H4 instanceof C5828J)) {
                c5828j = (C5828J) interfaceC5826H4;
                if (AbstractC4764c.m5435b(c5828j.f19040d)) {
                    encoding = (RtpParameters.Encoding) AbstractC17680n.m19343S(listM6240l);
                    if (encoding != null) {
                        num = encoding.maxBitrateBps;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        AbstractC16544l.m18091d(str2);
                        num2 = ((RtpParameters.Encoding) AbstractC17680n.m19341Q(listM6240l)).maxBitrateBps;
                        if (num2 != null) {
                            iIntValue = num2.intValue() / 1000;
                        } else {
                            iIntValue = 0;
                        }
                        c4758z0 = new C4758Z0(iIntValue, c5828j.f19040d);
                        C15102a c15102a2 = c5842n2.f19115w;
                        c15102a2.getClass();
                        c4808y = c15102a2.f46958r;
                        if (c4808y != null) {
                            c4808y.f15684g.put(new C4761a1(str2), c4758z0);
                        }
                    }
                }
            }
            if (interfaceC5826H4 instanceof C5828J) {
                C5828J c5828j2 = (C5828J) interfaceC5826H4;
                AbstractC8954j.m9571a(rtpTransceiver, c5828j2.f19040d, c5842n2.f19110E);
                ((C6501u) abstractC6468O2).f21091p = c5828j2.f19040d;
                RtpParameters parameters = rtpTransceiver.getSender().getParameters();
                parameters.degradationPreference = c5828j2.f19045i;
                rtpTransceiver.getSender().setParameters(parameters);
            }
            c6497q = new C6497q(livekitModels$TrackInfo, abstractC6468O2, c5842n2, interfaceC5826H4);
            c5842n2.m6217a(c6497q);
            C8395g c8395g = AbstractC8396h.Companion;
            enumC8397i = EnumC8397i.f26116Y;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18570i(new Object[0]);
            }
            c4727j0 = c5842n2.f19010q;
            if (c4727j0 != null) {
                c3103b = c4727j0.f15397v;
                if (c3103b != null) {
                    AbstractC6468O abstractC6468OM7055c = c6497q.m7055c();
                    AbstractC16544l.m18091d(abstractC6468OM7055c);
                    c3103b.m3928a(abstractC6468OM7055c, c6497q, c5842n2, c4727j0);
                }
                c3465a = new C3465A(c4727j0, c6497q, c5842n2);
                c2925c = c4727j0.f15388m;
                if (c2925c != null) {
                    AbstractC16544l.m18103p("coroutineScope");
                    throw null;
                }
                c4727j0.f15389n.m12669r(c3465a, c2925c);
            }
            c5842n2.f18997d.m12669r(new C3480e(c5842n2), c5842n2.f18996c);
            return c6497q;
        }
        AbstractC9233X.m9807c(obj);
        List listM6249q = m6249q();
        if (!(listM6249q instanceof Collection) || !listM6249q.isEmpty()) {
            Iterator it = listM6249q.iterator();
            while (it.hasNext()) {
                if (AbstractC16544l.m18089b(((C6497q) it.next()).m7055c(), abstractC6468O3)) {
                    return null;
                }
            }
        }
        String strM18749id = abstractC6468O.mo7051c().m18749id();
        C14573E3 c14573e3NewBuilder = LivekitRtc$AddTrackRequest.newBuilder();
        AbstractC16544l.m18091d(c14573e3NewBuilder);
        interfaceC1436k.invoke(c14573e3NewBuilder);
        AbstractC16544l.m18091d(strM18749id);
        String name = interfaceC5826H.getName();
        if (name == null) {
            name = abstractC6468O3.f20984c;
        }
        EnumC14692Y2 enumC14692Y2M7048a = abstractC6468O3.f20985d.m7048a();
        String strMo6229a = interfaceC5826H.mo6229a();
        c5839k.f19084Y = this;
        c5839k.f19085Z = abstractC6468O3;
        c5839k.f19086o0 = interfaceC5826H;
        c5839k.f19087p0 = list;
        c5839k.f19088q0 = strM18749id;
        c5839k.f19092u0 = 1;
        Object objM16210b = this.f19115w.m16210b(strM18749id, name, enumC14692Y2M7048a, strMo6229a, c14573e3NewBuilder, c5839k);
        if (objM16210b == enumC19250a) {
            return enumC19250a;
        }
        interfaceC5826H2 = interfaceC5826H;
        c5842n = this;
        str = strM18749id;
        obj = objM16210b;
        list2 = list;
        LivekitModels$TrackInfo livekitModels$TrackInfo2 = (LivekitModels$TrackInfo) obj;
        if (interfaceC5826H2 instanceof C5828J) {
            List<LivekitModels$SimulcastCodecInfo> codecsList = livekitModels$TrackInfo2.getCodecsList();
            AbstractC16544l.m18093f(codecsList, "getCodecsList(...)");
            LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo = (LivekitModels$SimulcastCodecInfo) AbstractC17680n.m19343S(codecsList);
            String mimeType = livekitModels$SimulcastCodecInfo != null ? livekitModels$SimulcastCodecInfo.getMimeType() : null;
            if (mimeType != null) {
                List listM21697e0 = AbstractC21322p.m21697e0(mimeType, new String[]{Separators.SLASH}, 0, 6);
                if (mimeType.length() <= 1) {
                    listM21697e0 = null;
                }
                if (listM21697e0 == null || (str3 = (String) listM21697e0.get(1)) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = str3.toLowerCase(Locale.ROOT);
                    AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
                }
                if (lowerCase != null) {
                    C5828J c5828j3 = (C5828J) interfaceC5826H2;
                    if (lowerCase.equals(c5828j3.f19040d)) {
                        InterfaceC5826H interfaceC5826H6 = interfaceC5826H2;
                        listM6240l = list2;
                        interfaceC5826H3 = interfaceC5826H6;
                    } else {
                        C8395g c8395g2 = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i2 = EnumC8397i.f26117Z;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            "falling back to server selected codec: ".concat(lowerCase);
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18567d(new Object[0]);
                        }
                        C5828J c5828jM6236h = C5828J.m6236h(c5828j3, null, lowerCase, null, null, 503);
                        AbstractC16544l.m18092e(abstractC6468O3, HhJS.QskbtaIFxHQoXCn);
                        C6460G c6460gM7064k = ((C6501u) abstractC6468O3).m7064k();
                        c5842n.getClass();
                        listM6240l = m6240l(c6460gM7064k, c5828jM6236h);
                        interfaceC5826H3 = c5828jM6236h;
                    }
                } else {
                    InterfaceC5826H interfaceC5826H7 = interfaceC5826H2;
                    listM6240l = list2;
                    interfaceC5826H3 = interfaceC5826H7;
                }
            } else {
                InterfaceC5826H interfaceC5826H8 = interfaceC5826H2;
                listM6240l = list2;
                interfaceC5826H3 = interfaceC5826H8;
            }
        } else {
            InterfaceC5826H interfaceC5826H9 = interfaceC5826H2;
            listM6240l = list2;
            interfaceC5826H3 = interfaceC5826H9;
        }
        RtpTransceiver.RtpTransceiverInit rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, AbstractC9393x3.m9974d(c5842n.f18994a), listM6240l);
        MediaStreamTrack mediaStreamTrackMo7051c = abstractC6468O3.mo7051c();
        c5839k.f19084Y = c5842n;
        c5839k.f19085Z = abstractC6468O3;
        c5839k.f19086o0 = interfaceC5826H3;
        c5839k.f19087p0 = listM6240l;
        c5839k.f19088q0 = str;
        c5839k.f19089r0 = livekitModels$TrackInfo2;
        c5839k.f19092u0 = 2;
        C4808y c4808y2 = c5842n.f19115w.f46958r;
        Object objM5444h = c4808y2 != null ? c4808y2.m5444h(new C4738P(mediaStreamTrackMo7051c, rtpTransceiverInit, null), c5839k) : null;
        if (objM5444h == enumC19250a) {
            return enumC19250a;
        }
        C5842n c5842n3 = c5842n;
        abstractC6468O2 = abstractC6468O3;
        livekitModels$TrackInfo = livekitModels$TrackInfo2;
        obj = objM5444h;
        c5842n2 = c5842n3;
        String str5 = str;
        interfaceC5826H4 = interfaceC5826H3;
        str2 = str5;
        rtpTransceiver = (RtpTransceiver) obj;
        if (abstractC6468O2 instanceof C6501u) {
            ((C6501u) abstractC6468O2).f21095t = rtpTransceiver;
        } else {
            if (abstractC6468O2 instanceof C6487g) {
                throw new IllegalArgumentException("Trying to publish a non local track of type " + abstractC6468O2.getClass());
            }
            ((C6487g) abstractC6468O2).f21049l = rtpTransceiver;
        }
        if (rtpTransceiver == null) {
            return null;
        }
        C15102a c15102a3 = c5842n2.f19115w;
        RtpSender sender2 = rtpTransceiver.getSender();
        AbstractC16544l.m18093f(sender2, "getSender(...)");
        c15102a3.getClass();
        abstractC6468O2.f20988g = new C3350b0(c15102a3.f46958r, 23, sender2);
        if (!listM6240l.isEmpty()) {
            c5828j = (C5828J) interfaceC5826H4;
            if (AbstractC4764c.m5435b(c5828j.f19040d)) {
                encoding = (RtpParameters.Encoding) AbstractC17680n.m19343S(listM6240l);
                if (encoding != null) {
                    num = encoding.maxBitrateBps;
                } else {
                    num = null;
                }
                if (num != null) {
                    AbstractC16544l.m18091d(str2);
                    num2 = ((RtpParameters.Encoding) AbstractC17680n.m19341Q(listM6240l)).maxBitrateBps;
                    if (num2 != null) {
                        iIntValue = num2.intValue() / 1000;
                    } else {
                        iIntValue = 0;
                    }
                    c4758z0 = new C4758Z0(iIntValue, c5828j.f19040d);
                    C15102a c15102a4 = c5842n2.f19115w;
                    c15102a4.getClass();
                    c4808y = c15102a4.f46958r;
                    if (c4808y != null) {
                        c4808y.f15684g.put(new C4761a1(str2), c4758z0);
                    }
                }
            }
        }
        if (interfaceC5826H4 instanceof C5828J) {
            C5828J c5828j4 = (C5828J) interfaceC5826H4;
            AbstractC8954j.m9571a(rtpTransceiver, c5828j4.f19040d, c5842n2.f19110E);
            ((C6501u) abstractC6468O2).f21091p = c5828j4.f19040d;
            RtpParameters parameters2 = rtpTransceiver.getSender().getParameters();
            parameters2.degradationPreference = c5828j4.f19045i;
            rtpTransceiver.getSender().setParameters(parameters2);
        }
        c6497q = new C6497q(livekitModels$TrackInfo, abstractC6468O2, c5842n2, interfaceC5826H4);
        c5842n2.m6217a(c6497q);
        C8395g c8395g3 = AbstractC8396h.Companion;
        enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        c4727j0 = c5842n2.f19010q;
        if (c4727j0 != null) {
            c3103b = c4727j0.f15397v;
            if (c3103b != null) {
                AbstractC6468O abstractC6468OM7055c2 = c6497q.m7055c();
                AbstractC16544l.m18091d(abstractC6468OM7055c2);
                c3103b.m3928a(abstractC6468OM7055c2, c6497q, c5842n2, c4727j0);
            }
            c3465a = new C3465A(c4727j0, c6497q, c5842n2);
            c2925c = c4727j0.f15388m;
            if (c2925c != null) {
                AbstractC16544l.m18103p("coroutineScope");
                throw null;
            }
            c4727j0.f15389n.m12669r(c3465a, c2925c);
        }
        c5842n2.f18997d.m12669r(new C3480e(c5842n2), c5842n2.f18996c);
        return c6497q;
    }
}
