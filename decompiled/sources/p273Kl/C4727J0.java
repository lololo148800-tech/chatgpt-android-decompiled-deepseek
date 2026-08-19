package p273Kl;

import android.content.Context;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.room.C15102a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16549q;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitRtc$LeaveRequest;
import livekit.LivekitRtc$SignalRequest;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.FrameCryptor;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.audio.AudioDeviceModule;
import mm.C17296C;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p003A1.C0227a;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1436k;
import p075Cl.C1720c;
import p075Cl.C1722e;
import p101Dl.InterfaceC2101b;
import p101Dl.InterfaceC2110k;
import p101Dl.InterfaceC2112m;
import p1160zp.AbstractC22225a;
import p153Fn.C2925c;
import p175Gl.C3103b;
import p175Gl.C3104c;
import p199Hl.AbstractC3469E;
import p199Hl.C3468D;
import p199Hl.C3480e;
import p199Hl.C3497v;
import p199Hl.EnumC3478c;
import p201Hn.C3516e;
import p224Il.C3741a;
import p225Im.InterfaceC3776x;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p322Ml.C5488a;
import p344Nl.AbstractC5821C;
import p344Nl.C5825G;
import p344Nl.C5827I;
import p344Nl.C5830b;
import p344Nl.C5842n;
import p344Nl.C5844p;
import p344Nl.C5845q;
import p344Nl.C5846r;
import p344Nl.C5849u;
import p387Pl.AbstractC6470Q;
import p387Pl.C6488h;
import p387Pl.C6489i;
import p387Pl.C6496p;
import p387Pl.C6497q;
import p387Pl.C6502v;
import p387Pl.C6503w;
import p486Tl.C7507f;
import p525Vb.C8258a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.C8398j;
import p533Vl.EnumC8397i;
import p544W9.AbstractC8446A2;
import p594Y9.AbstractC9873d3;
import p658b5.C11248s;
import p793ho.C14640P3;
import p793ho.C14720c4;
import p793ho.EnumC14634O3;
import p793ho.EnumC14767j2;
import p813ij.C15026j;
import p867l8.C16831c;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Kl.J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4727J0 {

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ InterfaceC3776x[] f15367I;

    /* JADX INFO: renamed from: A */
    public final LinkedHashMap f15368A;

    /* JADX INFO: renamed from: B */
    public final C8398j f15369B;

    /* JADX INFO: renamed from: C */
    public boolean f15370C;

    /* JADX INFO: renamed from: D */
    public C1720c f15371D;

    /* JADX INFO: renamed from: E */
    public final C4816c f15372E;

    /* JADX INFO: renamed from: F */
    public C4801u0 f15373F;

    /* JADX INFO: renamed from: G */
    public final LinkedHashMap f15374G;

    /* JADX INFO: renamed from: H */
    public final C5488a f15375H;

    /* JADX INFO: renamed from: a */
    public final C15102a f15376a;

    /* JADX INFO: renamed from: b */
    public final EglBase f15377b;

    /* JADX INFO: renamed from: c */
    public final C4762b f15378c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0563B f15379d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0563B f15380e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2101b f15381f;

    /* JADX INFO: renamed from: g */
    public final C3741a f15382g;

    /* JADX INFO: renamed from: h */
    public final C3104c f15383h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2112m f15384i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2110k f15385j;

    /* JADX INFO: renamed from: k */
    public final AudioDeviceModule f15386k;

    /* JADX INFO: renamed from: l */
    public final C4803v0 f15387l;

    /* JADX INFO: renamed from: m */
    public C2925c f15388m;

    /* JADX INFO: renamed from: n */
    public final C11248s f15389n;

    /* JADX INFO: renamed from: o */
    public final C11248s f15390o;

    /* JADX INFO: renamed from: p */
    public final C8398j f15391p;

    /* JADX INFO: renamed from: q */
    public final C8398j f15392q;

    /* JADX INFO: renamed from: r */
    public final C8398j f15393r;

    /* JADX INFO: renamed from: s */
    public final C8398j f15394s;

    /* JADX INFO: renamed from: t */
    public final C8398j f15395t;

    /* JADX INFO: renamed from: u */
    public final boolean f15396u;

    /* JADX INFO: renamed from: v */
    public C3103b f15397v;

    /* JADX INFO: renamed from: w */
    public boolean f15398w;

    /* JADX INFO: renamed from: x */
    public C15026j f15399x;

    /* JADX INFO: renamed from: y */
    public final C5842n f15400y;

    /* JADX INFO: renamed from: z */
    public final C8398j f15401z;

    static {
        C16549q c16549q = new C16549q(C4727J0.class, "sid", "getSid-CC6JpwI()Ljava/lang/String;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f15367I = new InterfaceC3776x[]{c16527d.mo5697f(c16549q), AbstractC0168G.m528q(C4727J0.class, DiagnosticsEntry.NAME_KEY, "getName()Ljava/lang/String;", 0, c16527d), AbstractC0168G.m528q(C4727J0.class, "state", "getState()Lio/livekit/android/room/Room$State;", 0, c16527d), AbstractC0168G.m528q(C4727J0.class, "metadata", "getMetadata()Ljava/lang/String;", 0, c16527d), AbstractC0168G.m528q(C4727J0.class, "isRecording", "isRecording()Z", 0, c16527d), AbstractC0168G.m528q(C4727J0.class, "mutableRemoteParticipants", "getMutableRemoteParticipants()Ljava/util/Map;", 0, c16527d), AbstractC0168G.m528q(C4727J0.class, "mutableActiveSpeakers", "getMutableActiveSpeakers()Ljava/util/List;", 0, c16527d)};
    }

    public C4727J0(Context context, C15102a engine, EglBase eglBase, C5845q localParticipantFactory, C4762b defaultsManager, AbstractC0563B defaultDispatcher, AbstractC0563B ioDispatcher, InterfaceC2101b audioHandler, C3741a closeableManager, C3104c e2EEManagerFactory, InterfaceC2112m communicationWorkaround, InterfaceC2110k audioProcessingController, C8258a lkObjects, InterfaceC1436k networkCallbackManagerFactory, AudioDeviceModule audioDeviceModule, C4803v0 regionUrlProviderFactory, C7507f connectionWarmer) {
        AbstractC16544l.m18094g(engine, "engine");
        AbstractC16544l.m18094g(eglBase, "eglBase");
        AbstractC16544l.m18094g(localParticipantFactory, "localParticipantFactory");
        AbstractC16544l.m18094g(defaultsManager, "defaultsManager");
        AbstractC16544l.m18094g(defaultDispatcher, "defaultDispatcher");
        AbstractC16544l.m18094g(ioDispatcher, "ioDispatcher");
        AbstractC16544l.m18094g(audioHandler, "audioHandler");
        AbstractC16544l.m18094g(closeableManager, "closeableManager");
        AbstractC16544l.m18094g(e2EEManagerFactory, "e2EEManagerFactory");
        AbstractC16544l.m18094g(communicationWorkaround, "communicationWorkaround");
        AbstractC16544l.m18094g(audioProcessingController, "audioProcessingController");
        AbstractC16544l.m18094g(lkObjects, "lkObjects");
        AbstractC16544l.m18094g(networkCallbackManagerFactory, "networkCallbackManagerFactory");
        AbstractC16544l.m18094g(audioDeviceModule, "audioDeviceModule");
        AbstractC16544l.m18094g(regionUrlProviderFactory, "regionUrlProviderFactory");
        AbstractC16544l.m18094g(connectionWarmer, "connectionWarmer");
        this.f15376a = engine;
        this.f15377b = eglBase;
        this.f15378c = defaultsManager;
        this.f15379d = defaultDispatcher;
        this.f15380e = ioDispatcher;
        this.f15381f = audioHandler;
        this.f15382g = closeableManager;
        this.f15383h = e2EEManagerFactory;
        this.f15384i = communicationWorkaround;
        this.f15385j = audioProcessingController;
        this.f15386k = audioDeviceModule;
        this.f15387l = regionUrlProviderFactory;
        C11248s c11248s = new C11248s(6);
        this.f15389n = c11248s;
        this.f15390o = c11248s;
        engine.f46944d = this;
        this.f15391p = AbstractC9873d3.m10527a(null, null);
        this.f15392q = AbstractC9873d3.m10527a(null, null);
        this.f15393r = AbstractC9873d3.m10527a(EnumC4807x0.f15675o0, new C0227a(this, 13));
        this.f15394s = AbstractC9873d3.m10527a(null, null);
        this.f15395t = AbstractC9873d3.m10527a(Boolean.FALSE, null);
        this.f15396u = true;
        C5844p c5844p = localParticipantFactory.f19129a;
        C15102a c15102a = (C15102a) c5844p.f19120a.get();
        PeerConnectionFactory peerConnectionFactory = (PeerConnectionFactory) c5844p.f19121b.get();
        Context context2 = (Context) c5844p.f19122c.f14617a;
        EglBase eglBase2 = (EglBase) c5844p.f19123d.get();
        C6496p c6496p = (C6496p) c5844p.f19124e.f14617a;
        C6503w c6503w = (C6503w) c5844p.f19125f.get();
        C6489i c6489i = (C6489i) c5844p.f19126g.f14617a;
        C4762b c4762b = (C4762b) c5844p.f19127h.get();
        C3516e c3516e = AbstractC0593T.f1824a;
        AbstractC8446A2.m9048a(c3516e);
        C5842n c5842n = new C5842n(c15102a, peerConnectionFactory, context2, eglBase2, c6496p, c6503w, c6489i, c4762b, c3516e, (InterfaceC1436k) c5844p.f19128i.get());
        c5842n.f19010q = this;
        this.f15400y = c5842n;
        this.f15401z = AbstractC9873d3.m10527a(C17690x.f56481Y, null);
        this.f15368A = new LinkedHashMap();
        this.f15369B = AbstractC9873d3.m10527a(C17689w.f56480Y, null);
        this.f15371D = new C1720c();
        this.f15372E = AbstractC4817d.m5451a();
        this.f15374G = new LinkedHashMap();
        this.f15375H = (C5488a) networkCallbackManagerFactory.invoke(new C4721G0(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public static final void m5406a(C4727J0 c4727j0) {
        C3103b c3103b = c4727j0.f15397v;
        if (c3103b != null) {
            c3103b.m3930c();
        }
        c4727j0.f15397v = null;
        c4727j0.f15400y.m6248k();
        Iterator it = AbstractC17680n.m19326F0(c4727j0.m5409d().keySet()).iterator();
        while (it.hasNext()) {
            c4727j0.m5413h(((C5846r) it.next()).f19130a);
        }
        c4727j0.m5419n(null);
        InterfaceC3776x[] interfaceC3776xArr = f15367I;
        c4727j0.f15394s.m8944g(null, interfaceC3776xArr[3]);
        c4727j0.f15392q.m8944g(null, interfaceC3776xArr[1]);
        InterfaceC3776x interfaceC3776x = interfaceC3776xArr[4];
        c4727j0.f15395t.m8944g(Boolean.FALSE, interfaceC3776x);
        c4727j0.f15368A.clear();
    }

    /* JADX INFO: renamed from: b */
    public static final Object m5407b(C4727J0 c4727j0, AbstractC3469E abstractC3469E, InterfaceC18770c interfaceC18770c) {
        Object objM12670s;
        EnumC4807x0 enumC4807x0M5412g = c4727j0.m5412g();
        EnumC4807x0 enumC4807x0 = EnumC4807x0.f15674Z;
        C17296C c17296c = C17296C.f55119a;
        return (enumC4807x0M5412g == enumC4807x0 && (objM12670s = c4727j0.f15389n.m12670s(abstractC3469E, interfaceC18770c)) == EnumC19250a.f61036Y) ? objM12670s : c17296c;
    }

    /* JADX INFO: renamed from: c */
    public final void m5408c() throws Throwable {
        C4750V0 c4750v0 = this.f15376a.f46941a;
        c4750v0.getClass();
        C14720c4 c14720c4NewBuilder = LivekitRtc$SignalRequest.newBuilder();
        C14640P3 c14640p3NewBuilder = LivekitRtc$LeaveRequest.newBuilder();
        EnumC14767j2 enumC14767j2 = EnumC14767j2.CLIENT_INITIATED;
        c14640p3NewBuilder.m13863d();
        ((LivekitRtc$LeaveRequest) c14640p3NewBuilder.f36981Z).setReason(enumC14767j2);
        EnumC14634O3 enumC14634O3 = EnumC14634O3.DISCONNECT;
        c14640p3NewBuilder.m13863d();
        ((LivekitRtc$LeaveRequest) c14640p3NewBuilder.f36981Z).setAction(enumC14634O3);
        LivekitRtc$LeaveRequest livekitRtc$LeaveRequest = (LivekitRtc$LeaveRequest) c14640p3NewBuilder.m13861b();
        c14720c4NewBuilder.m13863d();
        ((LivekitRtc$SignalRequest) c14720c4NewBuilder.f36981Z).setLeave(livekitRtc$LeaveRequest);
        c4750v0.m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder.m13861b());
        EnumC3478c enumC3478c = EnumC3478c.f10548Z;
        if (m5412g() == EnumC4807x0.f15675o0) {
            return;
        }
        AbstractC0575H.m1161I(C18777j.f59682Y, new C4719F0(this, enumC3478c, null));
    }

    /* JADX INFO: renamed from: d */
    public final Map m5409d() {
        return (Map) this.f15401z.m8943c(f15367I[5]);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized C5825G m5410e(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo, String str) {
        C16525B c16525b = new C16525B();
        Object obj = m5409d().get(new C5846r(str));
        c16525b.f51262Y = obj;
        if (obj != null) {
            return (C5825G) obj;
        }
        C5825G c5825g = new C5825G(livekitModels$ParticipantInfo, this.f15376a.f46941a, this.f15380e, this.f15379d);
        c16525b.f51262Y = c5825g;
        c5825g.f19010q = this;
        C2925c c2925c = this.f15388m;
        if (c2925c == null) {
            AbstractC16544l.m18103p("coroutineScope");
            throw null;
        }
        AbstractC0575H.m1156D(c2925c, null, null, new C4717E0(c16525b, this, null), 3);
        ((C5825G) c16525b.f51262Y).mo6226j(livekitModels$ParticipantInfo);
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(m5409d());
        linkedHashMapM19256r.put(new C5846r(str), c16525b.f51262Y);
        this.f15401z.m8944g(linkedHashMapM19256r, f15367I[5]);
        this.f15368A.put(new C5849u(((C5825G) c16525b.f51262Y).f18994a), new C5846r(str));
        return (C5825G) c16525b.f51262Y;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC5821C m5411f(String sid) {
        AbstractC16544l.m18094g(sid, "sid");
        C5842n c5842n = this.f15400y;
        return sid.equals(c5842n.f18994a) ? c5842n : (AbstractC5821C) m5409d().get(this.f15368A.get(new C5849u(sid)));
    }

    /* JADX INFO: renamed from: g */
    public final EnumC4807x0 m5412g() {
        return (EnumC4807x0) this.f15393r.m8943c(f15367I[2]);
    }

    /* JADX INFO: renamed from: h */
    public final void m5413h(String str) {
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(m5409d());
        C5825G c5825g = (C5825G) linkedHashMapM19256r.remove(new C5846r(str));
        if (c5825g == null) {
            return;
        }
        Iterator it = AbstractC17680n.m19322C0(c5825g.m6220d().values()).iterator();
        while (it.hasNext()) {
            c5825g.m6228l(((AbstractC6470Q) it.next()).f20992c);
        }
        this.f15401z.m8944g(linkedHashMapM19256r, f15367I[5]);
        C3497v c3497v = new C3497v(this, c5825g);
        C2925c c2925c = this.f15388m;
        if (c2925c != null) {
            this.f15389n.m12669r(c3497v, c2925c);
        } else {
            AbstractC16544l.m18103p("coroutineScope");
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5414i() {
        return ((Boolean) this.f15395t.m8943c(f15367I[4])).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m5415j(EnumC3478c enumC3478c) throws Throwable {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            enumC3478c.toString();
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        if (m5412g() == EnumC4807x0.f15675o0) {
            return;
        }
        AbstractC0575H.m1161I(C18777j.f59682Y, new C4719F0(this, enumC3478c, null));
    }

    /* JADX INFO: renamed from: k */
    public final void m5416k() {
        C5842n c5842n = this.f15400y;
        List<C6497q> listM19322C0 = AbstractC17680n.m19322C0(c5842n.m6249q());
        if (c5842n.f19111F == null) {
            c5842n.f19111F = listM19322C0;
        }
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(c5842n.m6220d());
        linkedHashMapM19256r.clear();
        c5842n.m6225i(linkedHashMapM19256r);
        for (C6497q c6497q : listM19322C0) {
            C4727J0 c4727j0 = c5842n.f19010q;
            if (c4727j0 != null) {
                c4727j0.m5417l(c6497q, c5842n);
            }
            c5842n.f18997d.m12669r(new C3480e(c5842n, c6497q, 3), c5842n.f18996c);
        }
        Iterator it = AbstractC17680n.m19326F0(m5409d().keySet()).iterator();
        while (it.hasNext()) {
            m5413h(((C5846r) it.next()).f19130a);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5417l(C6497q publication, C5842n participant) {
        AbstractC16544l.m18094g(publication, "publication");
        AbstractC16544l.m18094g(participant, "participant");
        C3103b c3103b = this.f15397v;
        if (c3103b != null) {
            AbstractC16544l.m18091d(publication.m7055c());
            String str = publication.f20992c;
            String strM6218b = participant.m6218b();
            LinkedHashMap linkedHashMap = c3103b.f9334d;
            FrameCryptor frameCryptor = (FrameCryptor) linkedHashMap.get(new C17309l(str, strM6218b != null ? new C5846r(strM6218b) : null));
            if (frameCryptor != null) {
                frameCryptor.setEnabled(false);
                frameCryptor.dispose();
                AbstractC16529F.m18079c(linkedHashMap).remove(new C17309l(str, strM6218b != null ? new C5846r(strM6218b) : null));
            }
        }
        C3468D c3468d = new C3468D(this, publication, participant);
        C2925c c2925c = this.f15388m;
        if (c2925c != null) {
            this.f15389n.m12669r(c3468d, c2925c);
        } else {
            AbstractC16544l.m18103p("coroutineScope");
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5418m(C1722e c1722e) {
        C4762b c4762b = this.f15378c;
        C6488h c6488h = c1722e.f4953d;
        if (c6488h != null) {
            c4762b.getClass();
            c4762b.f15538a = c6488h;
        }
        C6502v c6502v = c1722e.f4954e;
        if (c6502v != null) {
            c4762b.getClass();
            c4762b.f15540c = c6502v;
        }
        C5830b c5830b = c1722e.f4955f;
        if (c5830b != null) {
            c4762b.getClass();
            c4762b.f15539b = c5830b;
        }
        C5827I c5827i = c1722e.f4956g;
        if (c5827i != null) {
            c4762b.getClass();
            c4762b.f15541d = c5827i;
        }
        C6502v c6502v2 = c1722e.f4957h;
        if (c6502v2 != null) {
            c4762b.getClass();
            c4762b.f15542e = c6502v2;
        }
        C5827I c5827i2 = c1722e.f4958i;
        if (c5827i2 != null) {
            c4762b.getClass();
            c4762b.f15543f = c5827i2;
        }
        this.f15398w = c1722e.f4950a;
        this.f15400y.f19114v = c1722e.f4951b;
        this.f15399x = c1722e.f4952c;
    }

    /* JADX INFO: renamed from: n */
    public final void m5419n(String str) {
        this.f15391p.m8944g(str != null ? new C4805w0(str) : null, f15367I[0]);
    }

    /* JADX INFO: renamed from: o */
    public final void m5420o(EnumC4807x0 enumC4807x0) {
        this.f15393r.m8944g(enumC4807x0, f15367I[2]);
    }
}
