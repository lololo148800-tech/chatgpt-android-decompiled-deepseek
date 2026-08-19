package p175Gl;

import android.javax.sip.C10808o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.FrameCryptor;
import livekit.org.webrtc.FrameCryptorAlgorithm;
import livekit.org.webrtc.FrameCryptorFactory;
import livekit.org.webrtc.FrameCryptorKeyProvider;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import mm.C17309l;
import p001A.C0031P0;
import p009A7.FlM.nkFZpTrMPpn;
import p229J0.C4171z3;
import p273Kl.C4727J0;
import p344Nl.C5825G;
import p344Nl.C5842n;
import p344Nl.C5846r;
import p387Pl.AbstractC6468O;
import p387Pl.AbstractC6470Q;
import p387Pl.C6457D;
import p387Pl.C6487g;
import p387Pl.C6501u;
import p387Pl.C6504x;

/* JADX INFO: renamed from: Gl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3103b {

    /* JADX INFO: renamed from: a */
    public C4727J0 f9331a;

    /* JADX INFO: renamed from: b */
    public C10808o f9332b;

    /* JADX INFO: renamed from: c */
    public PeerConnectionFactory f9333c;

    /* JADX INFO: renamed from: d */
    public LinkedHashMap f9334d;

    /* JADX INFO: renamed from: e */
    public FrameCryptorAlgorithm f9335e;

    /* JADX INFO: renamed from: f */
    public C4171z3 f9336f;

    /* JADX INFO: renamed from: g */
    public boolean f9337g;

    /* JADX INFO: renamed from: d */
    public static EnumC3105d m3927d(FrameCryptor.FrameCryptionState frameCryptionState) {
        switch (frameCryptionState == null ? -1 : AbstractC3102a.f9330a[frameCryptionState.ordinal()]) {
            case 1:
                return EnumC3105d.f9339Y;
            case 2:
                return EnumC3105d.f9340Z;
            case 3:
                return EnumC3105d.f9341o0;
            case 4:
                return EnumC3105d.f9342p0;
            case 5:
                return EnumC3105d.f9343q0;
            case 6:
                return EnumC3105d.f9344r0;
            case 7:
                return EnumC3105d.f9345s0;
            default:
                return EnumC3105d.f9345s0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3928a(AbstractC6468O abstractC6468O, AbstractC6470Q abstractC6470Q, C5842n participant, C4727J0 room) {
        AbstractC16544l.m18094g(participant, "participant");
        AbstractC16544l.m18094g(room, "room");
        AbstractC6468O abstractC6468OM7055c = abstractC6470Q.m7055c();
        AbstractC16544l.m18091d(abstractC6468OM7055c);
        RtpSender sender = null;
        if (abstractC6468OM7055c instanceof C6487g) {
            AbstractC6468O abstractC6468OM7055c2 = abstractC6470Q.m7055c();
            AbstractC16544l.m18091d(abstractC6468OM7055c2);
            RtpTransceiver rtpTransceiver = ((C6487g) abstractC6468OM7055c2).f21049l;
            if (rtpTransceiver != null) {
                sender = rtpTransceiver.getSender();
            }
        } else {
            if (!(abstractC6468OM7055c instanceof C6501u)) {
                throw new IllegalArgumentException("unsupported track type");
            }
            AbstractC6468O abstractC6468OM7055c3 = abstractC6470Q.m7055c();
            AbstractC16544l.m18091d(abstractC6468OM7055c3);
            RtpTransceiver rtpTransceiver2 = ((C6501u) abstractC6468OM7055c3).f21095t;
            if (rtpTransceiver2 != null) {
                sender = rtpTransceiver2.getSender();
            }
        }
        if (sender == null) {
            throw new IllegalArgumentException("rtpSender is null");
        }
        String strM6218b = participant.m6218b();
        AbstractC16544l.m18091d(strM6218b);
        String str = abstractC6470Q.f20992c;
        AbstractC6468O abstractC6468OM7055c4 = abstractC6470Q.m7055c();
        AbstractC16544l.m18091d(abstractC6468OM7055c4);
        AbstractC16544l.m18093f(abstractC6468OM7055c4.f20985d.name().toLowerCase(Locale.ROOT), "toLowerCase(...)");
        FrameCryptor frameCryptorCreateFrameCryptorForRtpSender = FrameCryptorFactory.createFrameCryptorForRtpSender(this.f9333c, sender, strM6218b, this.f9335e, (FrameCryptorKeyProvider) this.f9332b.f32040Z);
        LinkedHashMap linkedHashMap = this.f9334d;
        C17309l c17309l = new C17309l(str, new C5846r(strM6218b));
        AbstractC16544l.m18091d(frameCryptorCreateFrameCryptorForRtpSender);
        linkedHashMap.put(c17309l, frameCryptorCreateFrameCryptorForRtpSender);
        frameCryptorCreateFrameCryptorForRtpSender.setEnabled(this.f9337g);
        frameCryptorCreateFrameCryptorForRtpSender.setObserver(new C0031P0(this, room, abstractC6470Q, participant, 2));
    }

    /* JADX INFO: renamed from: c */
    public final void m3930c() {
        LinkedHashMap linkedHashMap = this.f9334d;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((FrameCryptor) it.next()).dispose();
        }
        linkedHashMap.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m3931e(C4727J0 c4727j0, C4171z3 c4171z3) {
        Map mapM5409d;
        Map mapM6220d;
        if (!AbstractC16544l.m18089b(this.f9331a, c4727j0)) {
            m3930c();
        }
        this.f9337g = true;
        this.f9331a = c4727j0;
        this.f9336f = c4171z3;
        C5842n c5842n = c4727j0.f15400y;
        if (c5842n != null && (mapM6220d = c5842n.m6220d()) != null) {
            for (Map.Entry entry : mapM6220d.entrySet()) {
                C4727J0 c4727j1 = this.f9331a;
                AbstractC16544l.m18091d(c4727j1);
                AbstractC6470Q abstractC6470Q = (AbstractC6470Q) entry.getValue();
                if (abstractC6470Q.m7055c() != null) {
                    AbstractC6468O abstractC6468OM7055c = abstractC6470Q.m7055c();
                    AbstractC16544l.m18091d(abstractC6468OM7055c);
                    m3928a(abstractC6468OM7055c, abstractC6470Q, c4727j1.f15400y, c4727j0);
                }
            }
        }
        C4727J0 c4727j2 = this.f9331a;
        if (c4727j2 == null || (mapM5409d = c4727j2.m5409d()) == null) {
            return;
        }
        Iterator it = mapM5409d.entrySet().iterator();
        while (it.hasNext()) {
            C5825G c5825g = (C5825G) ((Map.Entry) it.next()).getValue();
            Iterator it2 = c5825g.m6220d().entrySet().iterator();
            while (it2.hasNext()) {
                AbstractC6470Q abstractC6470Q2 = (AbstractC6470Q) ((Map.Entry) it2.next()).getValue();
                if (abstractC6470Q2.m7055c() != null) {
                    AbstractC6468O abstractC6468OM7055c2 = abstractC6470Q2.m7055c();
                    AbstractC16544l.m18091d(abstractC6468OM7055c2);
                    m3929b(abstractC6468OM7055c2, abstractC6470Q2, c5825g, c4727j0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3929b(AbstractC6468O abstractC6468O, AbstractC6470Q abstractC6470Q, C5825G participant, C4727J0 room) {
        RtpReceiver rtpReceiver;
        AbstractC16544l.m18094g(participant, "participant");
        AbstractC16544l.m18094g(room, "room");
        AbstractC6468O abstractC6468OM7055c = abstractC6470Q.m7055c();
        AbstractC16544l.m18091d(abstractC6468OM7055c);
        if (abstractC6468OM7055c instanceof C6504x) {
            AbstractC6468O abstractC6468OM7055c2 = abstractC6470Q.m7055c();
            AbstractC16544l.m18091d(abstractC6468OM7055c2);
            rtpReceiver = ((C6504x) abstractC6468OM7055c2).f21102j;
        } else {
            if (!(abstractC6468OM7055c instanceof C6457D)) {
                throw new IllegalArgumentException("unsupported track type");
            }
            AbstractC6468O abstractC6468OM7055c3 = abstractC6470Q.m7055c();
            AbstractC16544l.m18091d(abstractC6468OM7055c3);
            rtpReceiver = ((C6457D) abstractC6468OM7055c3).f20953p;
        }
        AbstractC16544l.m18091d(rtpReceiver);
        String strM6218b = participant.m6218b();
        AbstractC16544l.m18091d(strM6218b);
        String str = abstractC6470Q.f20992c;
        AbstractC6468O abstractC6468OM7055c4 = abstractC6470Q.m7055c();
        AbstractC16544l.m18091d(abstractC6468OM7055c4);
        AbstractC16544l.m18093f(abstractC6468OM7055c4.f20985d.name().toLowerCase(Locale.ROOT), nkFZpTrMPpn.rTnStukVBJk);
        FrameCryptor frameCryptorCreateFrameCryptorForRtpReceiver = FrameCryptorFactory.createFrameCryptorForRtpReceiver(this.f9333c, rtpReceiver, strM6218b, this.f9335e, (FrameCryptorKeyProvider) this.f9332b.f32040Z);
        LinkedHashMap linkedHashMap = this.f9334d;
        C17309l c17309l = new C17309l(str, new C5846r(strM6218b));
        AbstractC16544l.m18091d(frameCryptorCreateFrameCryptorForRtpReceiver);
        linkedHashMap.put(c17309l, frameCryptorCreateFrameCryptorForRtpReceiver);
        frameCryptorCreateFrameCryptorForRtpReceiver.setEnabled(this.f9337g);
        frameCryptorCreateFrameCryptorForRtpReceiver.setObserver(new C0031P0(this, room, abstractC6470Q, participant, 3));
    }
}
