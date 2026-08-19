package p344Nl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$TrackInfo;
import livekit.org.webrtc.AudioTrack;
import livekit.org.webrtc.FrameCryptor;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.VideoTrack;
import mm.C17309l;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p1160zp.AbstractC22225a;
import p153Fn.C2925c;
import p175Gl.C3103b;
import p193Hf.C3350b0;
import p199Hl.C3466B;
import p199Hl.C3468D;
import p199Hl.C3480e;
import p199Hl.C3484i;
import p199Hl.C3487l;
import p199Hl.C3495t;
import p273Kl.C4727J0;
import p273Kl.C4750V0;
import p387Pl.AbstractC6468O;
import p387Pl.AbstractC6470Q;
import p387Pl.C6454A;
import p387Pl.C6457D;
import p387Pl.C6469P;
import p387Pl.C6504x;
import p533Vl.AbstractC8396h;
import p533Vl.C8389a;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9306j0;
import p658b5.C11248s;
import p867l8.C16831c;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17665J;

/* JADX INFO: renamed from: Nl.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C5825G extends AbstractC5821C {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f19027y = 0;

    /* JADX INFO: renamed from: v */
    public final C4750V0 f19028v;

    /* JADX INFO: renamed from: w */
    public final AbstractC0563B f19029w;

    /* JADX INFO: renamed from: x */
    public final C8389a f19030x;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5825G(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo, C4750V0 signalClient, AbstractC0563B ioDispatcher, AbstractC0563B defaultDispatcher) {
        AbstractC16544l.m18094g(signalClient, "signalClient");
        AbstractC16544l.m18094g(ioDispatcher, "ioDispatcher");
        AbstractC16544l.m18094g(defaultDispatcher, "defaultDispatcher");
        String sid = livekitModels$ParticipantInfo.getSid();
        AbstractC16544l.m18093f(sid, "getSid(...)");
        String identity = livekitModels$ParticipantInfo.getIdentity();
        AbstractC16544l.m18093f(identity, "getIdentity(...)");
        super(sid, identity, defaultDispatcher);
        this.f19028v = signalClient;
        this.f19029w = ioDispatcher;
        this.f19030x = new C8389a(defaultDispatcher.plus(AbstractC0575H.m1176e()));
        super.mo6226j(livekitModels$ParticipantInfo);
    }

    @Override // p344Nl.AbstractC5821C
    /* JADX INFO: renamed from: j */
    public final void mo6226j(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        super.mo6226j(livekitModels$ParticipantInfo);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (LivekitModels$TrackInfo livekitModels$TrackInfo : livekitModels$ParticipantInfo.getTracksList()) {
            String sid = livekitModels$TrackInfo.getSid();
            AbstractC16544l.m18091d(sid);
            Object obj = m6220d().get(sid);
            C6454A c6454a = obj instanceof C6454A ? (C6454A) obj : null;
            if (c6454a == null) {
                c6454a = new C6454A(livekitModels$TrackInfo, this, this.f19029w);
                linkedHashMap2.put(sid, c6454a);
                m6217a(c6454a);
            } else {
                c6454a.m7056e(livekitModels$TrackInfo);
            }
            linkedHashMap.put(sid, c6454a);
        }
        for (C6454A publication : linkedHashMap2.values()) {
            if (this.f19010q != null) {
                AbstractC16544l.m18094g(publication, "publication");
            }
            this.f18997d.m12669r(new C3484i(this, publication), this.f18996c);
        }
        Iterator it = AbstractC17665J.m19264d(m6220d().keySet(), linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            AbstractC6470Q abstractC6470Q = (AbstractC6470Q) m6220d().get((String) it.next());
            if (abstractC6470Q != null) {
                m6228l(abstractC6470Q.f20992c);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6227k(MediaStreamTrack mediaStreamTrack, String str, C3350b0 c3350b0, RtpReceiver receiver, boolean z6, int i10) throws C6469P {
        AbstractC6468O c6457d;
        AbstractC16544l.m18094g(receiver, "receiver");
        Object obj = m6220d().get(str);
        C6454A c6454a = obj instanceof C6454A ? (C6454A) obj : null;
        C11248s c11248s = this.f18997d;
        if (c6454a == null) {
            if (i10 != 0) {
                AbstractC0575H.m1156D(this.f19030x, null, null, new C5824F(this, mediaStreamTrack, str, c3350b0, receiver, z6, i10, null), 3);
                return;
            }
            new C6469P("Could not find published track with sid: ".concat(str), null);
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26120q0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                C5849u.m6256a(this.f18994a);
                AbstractC22225a.f70470a.getClass();
                C16831c.m18568f(new Object[0]);
            }
            C4727J0 c4727j0 = this.f19010q;
            if (c4727j0 != null) {
                C3495t c3495t = new C3495t(c4727j0);
                C2925c c2925c = c4727j0.f15388m;
                if (c2925c == null) {
                    AbstractC16544l.m18103p("coroutineScope");
                    throw null;
                }
                c4727j0.f15389n.m12669r(c3495t, c2925c);
            }
            c11248s.m12669r(new C3480e(this), this.f18996c);
            return;
        }
        String strKind = mediaStreamTrack.kind();
        if (AbstractC16544l.m18089b(strKind, MediaStreamTrack.AUDIO_TRACK_KIND)) {
            c6457d = new C6504x((AudioTrack) mediaStreamTrack, receiver);
        } else {
            if (!AbstractC16544l.m18089b(strKind, MediaStreamTrack.VIDEO_TRACK_KIND)) {
                throw new C6469P(AbstractC9306j0.m9889h("invalid track type: ", strKind), null);
            }
            c6457d = new C6457D((VideoTrack) mediaStreamTrack, z6, this.f19029w, receiver);
        }
        c6457d.f20988g = c3350b0;
        c6454a.m7037g(c6457d);
        c6454a.f20942p = true;
        String str2 = c6454a.f20991b;
        AbstractC16544l.m18094g(str2, "<set-?>");
        c6457d.f20984c = str2;
        c6457d.f20986e = c6454a.f20992c;
        m6217a(c6454a);
        c6457d.m7053e(true);
        C4727J0 c4727j1 = this.f19010q;
        if (c4727j1 != null) {
            C3103b c3103b = c4727j1.f15397v;
            if (c3103b != null) {
                c3103b.m3929b(c6457d, c6454a, this, c4727j1);
            }
            C3466B c3466b = new C3466B(c4727j1, c6457d, c6454a, this);
            C2925c c2925c2 = c4727j1.f15388m;
            if (c2925c2 == null) {
                AbstractC16544l.m18103p("coroutineScope");
                throw null;
            }
            c4727j1.f15389n.m12669r(c3466b, c2925c2);
        }
        c11248s.m12669r(new C3480e(this), this.f18996c);
    }

    /* JADX INFO: renamed from: l */
    public final void m6228l(String trackSid) {
        AbstractC16544l.m18094g(trackSid, "trackSid");
        Object obj = m6220d().get(trackSid);
        C6454A c6454a = obj instanceof C6454A ? (C6454A) obj : null;
        if (c6454a == null) {
            return;
        }
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(m6220d());
        linkedHashMapM19256r.remove(trackSid);
        m6225i(linkedHashMapM19256r);
        AbstractC6468O abstractC6468OM7055c = c6454a.m7055c();
        C11248s c11248s = this.f18997d;
        if (abstractC6468OM7055c != null) {
            try {
                abstractC6468OM7055c.mo7039f();
            } catch (Exception unused) {
            }
            C4727J0 c4727j0 = this.f19010q;
            if (c4727j0 != null) {
                C3103b c3103b = c4727j0.f15397v;
                if (c3103b != null) {
                    String str = c6454a.f20992c;
                    String strM6218b = m6218b();
                    LinkedHashMap linkedHashMap = c3103b.f9334d;
                    FrameCryptor frameCryptor = (FrameCryptor) linkedHashMap.get(new C17309l(str, strM6218b != null ? new C5846r(strM6218b) : null));
                    if (frameCryptor != null) {
                        frameCryptor.setEnabled(false);
                        frameCryptor.dispose();
                        AbstractC16529F.m18079c(linkedHashMap).remove(new C17309l(str, strM6218b != null ? new C5846r(strM6218b) : null));
                    }
                }
                C3495t c3495t = new C3495t(c4727j0);
                C2925c c2925c = c4727j0.f15388m;
                if (c2925c == null) {
                    AbstractC16544l.m18103p("coroutineScope");
                    throw null;
                }
                c4727j0.f15389n.m12669r(c3495t, c2925c);
            }
            c11248s.m12669r(new C3480e(this), this.f18996c);
        }
        C4727J0 c4727j1 = this.f19010q;
        if (c4727j1 != null) {
            C3468D c3468d = new C3468D(c4727j1, c6454a, this);
            C2925c c2925c2 = c4727j1.f15388m;
            if (c2925c2 == null) {
                AbstractC16544l.m18103p("coroutineScope");
                throw null;
            }
            c4727j1.f15389n.m12669r(c3468d, c2925c2);
        }
        c11248s.m12669r(new C3487l(this, c6454a), this.f18996c);
        c6454a.m7037g(null);
    }
}
