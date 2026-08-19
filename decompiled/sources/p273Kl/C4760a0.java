package p273Kl;

import android.javax.sip.C10808o;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12175n0;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import io.livekit.android.room.C15102a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitRtc$JoinResponse;
import livekit.org.webrtc.FrameCryptorKeyProvider;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p075Cl.C1720c;
import p075Cl.C1722e;
import p109E3.C2292p;
import p1160zp.AbstractC22225a;
import p153Fn.C2925c;
import p175Gl.C3103b;
import p199Hl.C3495t;
import p225Im.InterfaceC3776x;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9233X;
import p583Xl.AbstractC9537d;
import p867l8.C16831c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4760a0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f15530Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f15531Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15102a f15532o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f15533p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f15534q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C1720c f15535r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C1722e f15536s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4760a0(C15102a c15102a, String str, String str2, C1720c c1720c, C1722e c1722e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15532o0 = c15102a;
        this.f15533p0 = str;
        this.f15534q0 = str2;
        this.f15535r0 = c1720c;
        this.f15536s0 = c1722e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4760a0 c4760a0 = new C4760a0(this.f15532o0, this.f15533p0, this.f15534q0, this.f15535r0, this.f15536s0, interfaceC18770c);
        c4760a0.f15531Z = obj;
        return c4760a0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4760a0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01a4  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws C2292p {
        InterfaceC0571F interfaceC0571F;
        LivekitRtc$JoinResponse livekitRtc$JoinResponse;
        byte[] bArr;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f15530Y;
        C15102a c15102a = this.f15532o0;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC0571F = (InterfaceC0571F) this.f15531Z;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                livekitRtc$JoinResponse = (LivekitRtc$JoinResponse) this.f15531Z;
                AbstractC9233X.m9807c(obj);
            }
            if (!c15102a.f46964x) {
                c15102a.m16215g();
            }
            c15102a.f46941a.m5427q();
            return livekitRtc$JoinResponse;
        }
        AbstractC9233X.m9807c(obj);
        interfaceC0571F = (InterfaceC0571F) this.f15531Z;
        C4750V0 c4750v0 = c15102a.f46941a;
        this.f15531Z = interfaceC0571F;
        this.f15530Y = 1;
        obj = c4750v0.m5426p(this.f15533p0, this.f15534q0, this.f15535r0, this.f15536s0, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        LivekitRtc$JoinResponse response = (LivekitRtc$JoinResponse) obj;
        AbstractC0575H.m1186o(interfaceC0571F);
        C4727J0 c4727j0 = c15102a.f46944d;
        if (c4727j0 != null) {
            AbstractC16544l.m18094g(response, "response");
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26118o0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                response.getServerVersion();
                AbstractC22225a.f70470a.getClass();
                C16831c.m18569g(new Object[0]);
            }
            if (response.getRoom().getSid() != null) {
                String sid = response.getRoom().getSid();
                AbstractC16544l.m18093f(sid, "getSid(...)");
                c4727j0.m5419n(sid);
            } else {
                c4727j0.m5419n(null);
            }
            String name = response.getRoom().getName();
            InterfaceC3776x[] interfaceC3776xArr = C4727J0.f15367I;
            c4727j0.f15392q.m8944g(name, interfaceC3776xArr[1]);
            c4727j0.f15394s.m8944g(response.getRoom().getMetadata(), interfaceC3776xArr[3]);
            if (c4727j0.f15397v != null && response.getSifTrailer().size() != 0) {
                C3103b c3103b = c4727j0.f15397v;
                AbstractC16544l.m18091d(c3103b);
                AbstractC12171m sifTrailer = response.getSifTrailer();
                int size = sifTrailer.size();
                if (size == 0) {
                    bArr = AbstractC12175n0.f37051b;
                } else {
                    byte[] bArr2 = new byte[size];
                    sifTrailer.mo14000p(size, bArr2);
                    bArr = bArr2;
                }
                AbstractC16544l.m18093f(bArr, "toByteArray(...)");
                C10808o c10808o = c3103b.f9332b;
                c10808o.getClass();
                ((FrameCryptorKeyProvider) c10808o.f32040Z).setSifTrailer(bArr);
            }
            if (response.getRoom().getActiveRecording() != c4727j0.m5414i()) {
                boolean activeRecording = response.getRoom().getActiveRecording();
                InterfaceC3776x interfaceC3776x = interfaceC3776xArr[4];
                c4727j0.f15395t.m8944g(Boolean.valueOf(activeRecording), interfaceC3776x);
                c4727j0.m5414i();
                C3495t c3495t = new C3495t(c4727j0);
                C2925c c2925c = c4727j0.f15388m;
                if (c2925c == null) {
                    AbstractC16544l.m18103p("coroutineScope");
                    throw null;
                }
                c4727j0.f15389n.m12669r(c3495t, c2925c);
            }
            if (!response.hasParticipant()) {
                throw new C2292p(YladLSetV.Zal, null);
            }
            LivekitModels$ParticipantInfo participant = response.getParticipant();
            AbstractC16544l.m18093f(participant, "getParticipant(...)");
            c4727j0.f15400y.mo6226j(participant);
            List<LivekitModels$ParticipantInfo> otherParticipantsList = response.getOtherParticipantsList();
            AbstractC16544l.m18093f(otherParticipantsList, "getOtherParticipantsList(...)");
            if (!otherParticipantsList.isEmpty()) {
                List<LivekitModels$ParticipantInfo> otherParticipantsList2 = response.getOtherParticipantsList();
                AbstractC16544l.m18093f(otherParticipantsList2, "getOtherParticipantsList(...)");
                for (LivekitModels$ParticipantInfo livekitModels$ParticipantInfo : otherParticipantsList2) {
                    String identity = livekitModels$ParticipantInfo.getIdentity();
                    AbstractC16544l.m18093f(identity, "getIdentity(...)");
                    c4727j0.m5410e(livekitModels$ParticipantInfo, identity);
                }
            }
        }
        c15102a.f46965y = false;
        c15102a.f46964x = response.getSubscriberPrimary();
        this.f15531Z = response;
        this.f15530Y = 2;
        Object objM10032c = AbstractC9537d.m10032c(new C4736O(c15102a, response, this.f15535r0, null), this);
        if (objM10032c != EnumC19250a.f61036Y) {
            objM10032c = C17296C.f55119a;
        }
        if (objM10032c == enumC19250a) {
            return enumC19250a;
        }
        livekitRtc$JoinResponse = response;
        if (!c15102a.f46964x) {
            c15102a.m16215g();
        }
        c15102a.f46941a.m5427q();
        return livekitRtc$JoinResponse;
    }
}
