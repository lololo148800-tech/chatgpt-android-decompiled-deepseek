package p557Wl;

import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitRtc$SessionDescription;
import livekit.org.webrtc.SessionDescription;
import p793ho.C14713b4;

/* JADX INFO: renamed from: Wl.o */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8959o {
    /* JADX INFO: renamed from: a */
    public static final LivekitRtc$SessionDescription m9572a(SessionDescription sessionDescription) {
        AbstractC16544l.m18094g(sessionDescription, "<this>");
        C14713b4 c14713b4NewBuilder = LivekitRtc$SessionDescription.newBuilder();
        String str = sessionDescription.description;
        c14713b4NewBuilder.m13863d();
        ((LivekitRtc$SessionDescription) c14713b4NewBuilder.f36981Z).setSdp(str);
        String strCanonicalForm = sessionDescription.type.canonicalForm();
        c14713b4NewBuilder.m13863d();
        ((LivekitRtc$SessionDescription) c14713b4NewBuilder.f36981Z).setType(strCanonicalForm);
        return (LivekitRtc$SessionDescription) c14713b4NewBuilder.m13861b();
    }
}
