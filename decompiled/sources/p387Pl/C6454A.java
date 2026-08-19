package p387Pl;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitRtc$SignalRequest;
import livekit.LivekitRtc$UpdateTrackSettings;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.VideoTrack;
import mm.C17296C;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0644w;
import p273Kl.C4750V0;
import p315Me.Myis.CxcULo;
import p344Nl.C5825G;
import p482Tg.C7448e;
import p793ho.C14617L4;
import p793ho.C14720c4;
import p793ho.EnumC14761i3;

/* JADX INFO: renamed from: Pl.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C6454A extends AbstractC6470Q {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f20936r = 0;

    /* JADX INFO: renamed from: k */
    public final AbstractC0563B f20937k;

    /* JADX INFO: renamed from: l */
    public C0564B0 f20938l;

    /* JADX INFO: renamed from: m */
    public boolean f20939m;

    /* JADX INFO: renamed from: n */
    public final EnumC6480a0 f20940n;

    /* JADX INFO: renamed from: o */
    public C6460G f20941o;

    /* JADX INFO: renamed from: p */
    public boolean f20942p;

    /* JADX INFO: renamed from: q */
    public final C7448e f20943q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6454A(LivekitModels$TrackInfo livekitModels$TrackInfo, C5825G c5825g, AbstractC0563B ioDispatcher) {
        super(livekitModels$TrackInfo, null, c5825g);
        AbstractC16544l.m18094g(ioDispatcher, "ioDispatcher");
        this.f20937k = ioDispatcher;
        this.f20940n = EnumC6480a0.f21032Y;
        this.f20942p = true;
        this.f20943q = new C7448e(new C16525B(), AbstractC0575H.m1174c(ioDispatcher), new C6505y(this, null));
    }

    @Override // p387Pl.AbstractC6470Q
    /* JADX INFO: renamed from: b */
    public final boolean mo7035b() {
        if (this.f20942p) {
            return super.mo7035b();
        }
        return false;
    }

    @Override // p387Pl.AbstractC6470Q
    /* JADX INFO: renamed from: d */
    public final void mo7036d(boolean z6) {
        if (super.m7054a() == z6) {
            return;
        }
        this.f20995f.m8944g(Boolean.valueOf(z6), AbstractC6470Q.f20989j[1]);
        Object obj = this.f20998i.get();
        C5825G c5825g = obj instanceof C5825G ? (C5825G) obj : null;
        if (c5825g == null) {
            return;
        }
        if (z6) {
            c5825g.m6221e(this);
        } else {
            c5825g.m6222f(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7037g(AbstractC6468O abstractC6468O) {
        if (!AbstractC16544l.m18089b(abstractC6468O, super.m7055c())) {
            C0564B0 c0564b0 = this.f20938l;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
            this.f20938l = null;
        }
        this.f20990a.m8944g(abstractC6468O, AbstractC6470Q.f20989j[0]);
        if (abstractC6468O != null) {
            this.f20938l = AbstractC0575H.m1156D(AbstractC0575H.m1174c(this.f20937k), null, null, new C6506z(abstractC6468O, this, null), 3);
            if (abstractC6468O instanceof C6457D) {
                C6457D c6457d = (C6457D) abstractC6468O;
                if (c6457d.f20948k) {
                    this.f20941o = c6457d.f20952o;
                    C7448e c7448e = this.f20943q;
                    AbstractC16544l.m18094g(c7448e, "<this>");
                    C17296C c17296c = C17296C.f55119a;
                    c7448e.invoke(c17296c);
                    this.f20939m = !c6457d.f20951n;
                    AbstractC16544l.m18094g(c7448e, "<this>");
                    c7448e.invoke(c17296c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m7034f(C6454A c6454a) {
        EnumC14761i3 enumC14761i3;
        Object obj = c6454a.f20998i.get();
        EnumC14761i3 enumC14761i4 = null;
        C5825G c5825g = obj instanceof C5825G ? (C5825G) obj : null;
        if (c5825g == null) {
            return;
        }
        AbstractC6468O abstractC6468OM7055c = super.m7055c();
        MediaStreamTrack mediaStreamTrackMo7051c = abstractC6468OM7055c != null ? abstractC6468OM7055c.mo7051c() : null;
        if (mediaStreamTrackMo7051c instanceof VideoTrack) {
            ((VideoTrack) mediaStreamTrackMo7051c).setShouldReceive(!c6454a.f20939m);
        }
        String str = c6454a.f20992c;
        boolean z6 = c6454a.f20939m;
        C6460G c6460g = c6454a.f20941o;
        EnumC14761i3 enumC14761i5 = EnumC14761i3.HIGH;
        EnumC6480a0 enumC6480a0 = c6454a.f20940n;
        if (enumC6480a0 != null) {
            int iOrdinal = enumC6480a0.ordinal();
            if (iOrdinal == 0) {
                enumC14761i3 = EnumC14761i3.LOW;
            } else if (iOrdinal == 1) {
                enumC14761i3 = EnumC14761i3.MEDIUM;
            } else {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                enumC14761i4 = enumC14761i5;
            }
            enumC14761i4 = enumC14761i3;
        }
        C4750V0 c4750v0 = c5825g.f19028v;
        c4750v0.getClass();
        AbstractC16544l.m18094g(str, CxcULo.EPBlceRJSrB);
        C14617L4 c14617l4NewBuilder = LivekitRtc$UpdateTrackSettings.newBuilder();
        c14617l4NewBuilder.m13863d();
        ((LivekitRtc$UpdateTrackSettings) c14617l4NewBuilder.f36981Z).addTrackSids(str);
        c14617l4NewBuilder.m13863d();
        ((LivekitRtc$UpdateTrackSettings) c14617l4NewBuilder.f36981Z).setDisabled(z6);
        if (c6460g != null) {
            c14617l4NewBuilder.m13863d();
            ((LivekitRtc$UpdateTrackSettings) c14617l4NewBuilder.f36981Z).setWidth(c6460g.f20962a);
            c14617l4NewBuilder.m13863d();
            ((LivekitRtc$UpdateTrackSettings) c14617l4NewBuilder.f36981Z).setHeight(c6460g.f20963b);
        } else if (enumC14761i4 != null) {
            c14617l4NewBuilder.m13863d();
            ((LivekitRtc$UpdateTrackSettings) c14617l4NewBuilder.f36981Z).setQuality(enumC14761i4);
        } else {
            c14617l4NewBuilder.m13863d();
            ((LivekitRtc$UpdateTrackSettings) c14617l4NewBuilder.f36981Z).setQuality(enumC14761i5);
        }
        C14720c4 c14720c4NewBuilder = LivekitRtc$SignalRequest.newBuilder();
        c14720c4NewBuilder.m13863d();
        ((LivekitRtc$SignalRequest) c14720c4NewBuilder.f36981Z).setTrackSetting((LivekitRtc$UpdateTrackSettings) c14617l4NewBuilder.m13861b());
        c4750v0.m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder.m13861b());
    }
}
