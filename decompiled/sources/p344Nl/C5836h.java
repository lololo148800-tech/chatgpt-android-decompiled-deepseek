package p344Nl;

import io.livekit.android.room.C15102a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.LivekitRtc$SimulcastCodec;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.VideoTrack;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1160zp.AbstractC22225a;
import p273Kl.AbstractC4764c;
import p273Kl.C4738P;
import p273Kl.C4808y;
import p387Pl.AbstractC6470Q;
import p387Pl.C6459F;
import p387Pl.C6460G;
import p387Pl.C6467N;
import p387Pl.C6469P;
import p387Pl.C6501u;
import p387Pl.EnumC6473U;
import p486Tl.AbstractC7506e;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p557Wl.AbstractC8954j;
import p571X9.AbstractC9233X;
import p583Xl.AbstractC9537d;
import p793ho.C14573E3;
import p793ho.C14769j4;
import p793ho.EnumC14686X2;
import p793ho.EnumC14692Y2;
import p817j$.util.Objects;
import p867l8.C16831c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Nl.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C5836h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f19065Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5842n f19066Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6501u f19067o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ RtpTransceiver.RtpTransceiverInit f19068p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C5828J f19069q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C6459F f19070r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ AbstractC6470Q f19071s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C5828J f19072t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ EnumC6473U f19073u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ List f19074v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5836h(C5842n c5842n, C6501u c6501u, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit, C5828J c5828j, C6459F c6459f, AbstractC6470Q abstractC6470Q, C5828J c5828j2, EnumC6473U enumC6473U, List list, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19066Z = c5842n;
        this.f19067o0 = c6501u;
        this.f19068p0 = rtpTransceiverInit;
        this.f19069q0 = c5828j;
        this.f19070r0 = c6459f;
        this.f19071s0 = abstractC6470Q;
        this.f19072t0 = c5828j2;
        this.f19073u0 = enumC6473U;
        this.f19074v0 = list;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5836h(this.f19066Z, this.f19067o0, this.f19068p0, this.f19069q0, this.f19070r0, this.f19071s0, this.f19072t0, this.f19073u0, this.f19074v0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5836h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws C6469P {
        Object objM5444h;
        Object objM16210b;
        LivekitModels$TrackInfo livekitModels$TrackInfo;
        EnumC8397i enumC8397i;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f19065Y;
        C17296C c17296c = C17296C.f55119a;
        EnumC6473U enumC6473U = this.f19073u0;
        C6501u c6501u = this.f19067o0;
        C5842n c5842n = this.f19066Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
                objM5444h = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
                objM16210b = obj;
            }
            livekitModels$TrackInfo = (LivekitModels$TrackInfo) objM16210b;
            c5842n.f19115w.m16215g();
            C8395g c8395g = AbstractC8396h.Companion;
            enumC8397i = EnumC8397i.f26117Z;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                enumC6473U.toString();
                Objects.toString(livekitModels$TrackInfo);
                AbstractC22225a.f70470a.getClass();
                C16831c.m18567d(new Object[0]);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        C15102a c15102a = c5842n.f19115w;
        VideoTrack videoTrack = c6501u.f21090o;
        this.f19065Y = 1;
        RtpTransceiver.RtpTransceiverInit rtpTransceiverInit = this.f19068p0;
        C4808y c4808y = c15102a.f46958r;
        objM5444h = c4808y != null ? c4808y.m5444h(new C4738P(videoTrack, rtpTransceiverInit, null), this) : null;
        if (objM5444h == enumC19250a) {
            return enumC19250a;
        }
        RtpTransceiver rtpTransceiver = (RtpTransceiver) objM5444h;
        if (rtpTransceiver == null) {
            C8395g c8395g2 = AbstractC8396h.Companion;
            EnumC8397i enumC8397i2 = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                enumC6473U.toString();
                AbstractC22225a.f70470a.getClass();
                C16831c.m18571j(new Object[0]);
            }
            return c17296c;
        }
        AbstractC8954j.m9571a(rtpTransceiver, this.f19069q0.f19040d, c5842n.f19110E);
        RtpSender sender = rtpTransceiver.getSender();
        C6459F c6459f = this.f19070r0;
        c6459f.f20960c = sender;
        C14573E3 c14573e3NewBuilder = LivekitRtc$AddTrackRequest.newBuilder();
        String strM18771id = rtpTransceiver.getSender().m18771id();
        c14573e3NewBuilder.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3NewBuilder.f36981Z).setCid(strM18771id);
        AbstractC6470Q abstractC6470Q = this.f19071s0;
        String str = abstractC6470Q.f20992c;
        c14573e3NewBuilder.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3NewBuilder.f36981Z).setSid(str);
        EnumC14692Y2 enumC14692Y2M7048a = c6501u.f20985d.m7048a();
        c14573e3NewBuilder.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3NewBuilder.f36981Z).setType(enumC14692Y2M7048a);
        Object objM10030a = Boolean.FALSE;
        if (!c6501u.m7052d()) {
            objM10030a = AbstractC9537d.m10030a(new C6467N(c6501u, c6501u, 1));
        }
        boolean zBooleanValue = true ^ ((Boolean) objM10030a).booleanValue();
        c14573e3NewBuilder.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3NewBuilder.f36981Z).setMuted(zBooleanValue);
        EnumC14686X2 enumC14686X2M7049a = abstractC6470Q.f20996g.m7049a();
        c14573e3NewBuilder.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3NewBuilder.f36981Z).setSource(enumC14686X2M7049a);
        C14769j4 c14769j4NewBuilder = LivekitRtc$SimulcastCodec.newBuilder();
        String str2 = enumC6473U.f21004Y;
        c14769j4NewBuilder.m13863d();
        ((LivekitRtc$SimulcastCodec) c14769j4NewBuilder.f36981Z).setCodec(str2);
        String strM18771id2 = rtpTransceiver.getSender().m18771id();
        c14769j4NewBuilder.m13863d();
        ((LivekitRtc$SimulcastCodec) c14769j4NewBuilder.f36981Z).setCid(strM18771id2);
        LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec = (LivekitRtc$SimulcastCodec) c14769j4NewBuilder.m13861b();
        c14573e3NewBuilder.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3NewBuilder.f36981Z).addSimulcastCodecs(livekitRtc$SimulcastCodec);
        String[] strArr = AbstractC7506e.f23823a;
        C6460G c6460gM7064k = c6501u.m7064k();
        C6460G c6460gM7064k2 = c6501u.m7064k();
        List listM7812b = AbstractC7506e.m7812b(c6460gM7064k.f20962a, c6460gM7064k2.f20963b, this.f19074v0, AbstractC4764c.m5435b(str2));
        c14573e3NewBuilder.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3NewBuilder.f36981Z).addAllLayers(listM7812b);
        String strM18749id = c6459f.f20959b.m18749id();
        AbstractC16544l.m18093f(strM18749id, "id(...)");
        String str3 = abstractC6470Q.f20991b;
        EnumC14692Y2 enumC14692Y2M7048a2 = abstractC6470Q.f20993d.m7048a();
        C5828J c5828j = this.f19072t0;
        this.f19065Y = 2;
        objM16210b = c5842n.f19115w.m16210b(strM18749id, str3, enumC14692Y2M7048a2, c5828j.f19044h, c14573e3NewBuilder, this);
        if (objM16210b == enumC19250a) {
            return enumC19250a;
        }
        livekitModels$TrackInfo = (LivekitModels$TrackInfo) objM16210b;
        c5842n.f19115w.m16215g();
        C8395g c8395g3 = AbstractC8396h.Companion;
        enumC8397i = EnumC8397i.f26117Z;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0) {
            enumC6473U.toString();
            Objects.toString(livekitModels$TrackInfo);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18567d(new Object[0]);
        }
        return c17296c;
    }
}
