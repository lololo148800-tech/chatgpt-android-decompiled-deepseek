package p557Wl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpCapabilities;
import livekit.org.webrtc.RtpTransceiver;
import p049Bm.InterfaceC1436k;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p817j$.util.Objects;
import p867l8.C16831c;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Wl.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8954j {
    /* JADX INFO: renamed from: a */
    public static final void m9571a(RtpTransceiver rtpTransceiver, String targetCodec, InterfaceC1436k capabilitiesGetter) {
        AbstractC16544l.m18094g(targetCodec, "targetCodec");
        AbstractC16544l.m18094g(capabilitiesGetter, "capabilitiesGetter");
        RtpCapabilities rtpCapabilities = (RtpCapabilities) capabilitiesGetter.invoke(MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO);
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        List<RtpCapabilities.CodecCapability> codecs = rtpCapabilities.codecs;
        AbstractC16544l.m18093f(codecs, "codecs");
        for (RtpCapabilities.CodecCapability codecCapability : codecs) {
            C8395g c8395g2 = AbstractC8396h.Companion;
            EnumC8397i enumC8397i2 = EnumC8397i.f26116Y;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                String str = codecCapability.name;
                Objects.toString(codecCapability.kind);
                Objects.toString(codecCapability.parameters);
                AbstractC22225a.f70470a.getClass();
                C16831c.m18570i(new Object[0]);
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (RtpCapabilities.CodecCapability codecCapability2 : rtpCapabilities.codecs) {
            String mimeType = codecCapability2.mimeType;
            AbstractC16544l.m18093f(mimeType, "mimeType");
            String lowerCase = mimeType.toLowerCase(Locale.ROOT);
            AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals("audio/opus")) {
                arrayList.add(codecCapability2);
            } else if (!lowerCase.equals("video/".concat(targetCodec))) {
                arrayList3.add(codecCapability2);
            } else if (!targetCodec.equals("h264")) {
                arrayList.add(codecCapability2);
            } else if (AbstractC16544l.m18089b(codecCapability2.parameters.get("profile-level-id"), "42e01f")) {
                arrayList.add(codecCapability2);
            } else {
                arrayList2.add(codecCapability2);
            }
        }
        rtpTransceiver.setCodecPreferences(AbstractC17680n.m19361k0(arrayList3, AbstractC17680n.m19361k0(arrayList2, arrayList)));
    }
}
