package p273Kl;

import io.livekit.android.room.C15102a;
import livekit.LivekitRtc$JoinResponse;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p075Cl.C1720c;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p533Vl.C8392d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Kl.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C4736O extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C15102a f15425Y;

    /* JADX INFO: renamed from: Z */
    public Object f15426Z;

    /* JADX INFO: renamed from: o0 */
    public Object f15427o0;

    /* JADX INFO: renamed from: p0 */
    public Object f15428p0;

    /* JADX INFO: renamed from: q0 */
    public C4816c f15429q0;

    /* JADX INFO: renamed from: r0 */
    public int f15430r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f15431s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C15102a f15432t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ LivekitRtc$JoinResponse f15433u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C1720c f15434v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4736O(C15102a c15102a, LivekitRtc$JoinResponse livekitRtc$JoinResponse, C1720c c1720c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f15432t0 = c15102a;
        this.f15433u0 = livekitRtc$JoinResponse;
        this.f15434v0 = c1720c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C4736O c4736o = new C4736O(this.f15432t0, this.f15433u0, this.f15434v0, interfaceC18770c);
        c4736o.f15431s0 = obj;
        return c4736o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4736O) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x012f A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:91:0x01e8, B:80:0x01a8, B:82:0x01b3, B:84:0x01c6, B:67:0x0153, B:69:0x0157, B:72:0x016c, B:74:0x017f, B:76:0x018d, B:73:0x017d, B:27:0x007a, B:59:0x011f, B:61:0x012f), top: B:102:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x016c A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #3 {all -> 0x007f, blocks: (B:91:0x01e8, B:80:0x01a8, B:82:0x01b3, B:84:0x01c6, B:67:0x0153, B:69:0x0157, B:72:0x016c, B:74:0x017f, B:76:0x018d, B:73:0x017d, B:27:0x007a, B:59:0x011f, B:61:0x012f), top: B:102:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x017d A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:91:0x01e8, B:80:0x01a8, B:82:0x01b3, B:84:0x01c6, B:67:0x0153, B:69:0x0157, B:72:0x016c, B:74:0x017f, B:76:0x018d, B:73:0x017d, B:27:0x007a, B:59:0x011f, B:61:0x012f), top: B:102:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x018d A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:91:0x01e8, B:80:0x01a8, B:82:0x01b3, B:84:0x01c6, B:67:0x0153, B:69:0x0157, B:72:0x016c, B:74:0x017f, B:76:0x018d, B:73:0x017d, B:27:0x007a, B:59:0x011f, B:61:0x012f), top: B:102:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c6 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #3 {all -> 0x007f, blocks: (B:91:0x01e8, B:80:0x01a8, B:82:0x01b3, B:84:0x01c6, B:67:0x0153, B:69:0x0157, B:72:0x016c, B:74:0x017f, B:76:0x018d, B:73:0x017d, B:27:0x007a, B:59:0x011f, B:61:0x012f), top: B:102:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17, types: [Kn.a] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C15102a c15102a;
        C1720c c1720c;
        InterfaceC0571F interfaceC0571F;
        C4816c c4816c;
        LivekitRtc$JoinResponse livekitRtc$JoinResponse;
        C15102a c15102a2;
        ?? r10;
        PeerConnection.RTCConfiguration rTCConfiguration;
        ?? r11;
        InterfaceC0571F interfaceC0571F2;
        C4808y c4808y;
        PeerConnection.RTCConfiguration rTCConfiguration2;
        C15102a c15102a3;
        ?? r6;
        LivekitRtc$JoinResponse livekitRtc$JoinResponse2;
        C15102a c15102a4;
        InterfaceC0571F interfaceC0571F3;
        ?? r12;
        C4756Y0 c4756y0;
        C4734N c4734n;
        boolean subscriberPrimary;
        C4716E c4716e;
        DataChannel.Init init;
        C4808y c4808y2;
        C15102a c15102a5;
        DataChannel dataChannel;
        Object objM5444h;
        C15102a c15102a6;
        ?? r13;
        DataChannel.Init init2;
        C4808y c4808y3;
        DataChannel dataChannel2;
        Object objM5444h2;
        C15102a c15102a7;
        ?? r14;
        ?? r15;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        ?? r16 = this.f15430r0;
        C17296C c17296c = C17296C.f55119a;
        try {
            if (r16 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC0571F interfaceC0571F4 = (InterfaceC0571F) this.f15431s0;
                c15102a = this.f15432t0;
                C4816c c4816c2 = c15102a.f46940B;
                AbstractC0575H.m1186o(interfaceC0571F4);
                if (c15102a.f46958r != null && c15102a.f46959s != null) {
                    return c17296c;
                }
                this.f15431s0 = interfaceC0571F4;
                this.f15425Y = c15102a;
                this.f15426Z = c15102a;
                LivekitRtc$JoinResponse livekitRtc$JoinResponse3 = this.f15433u0;
                this.f15427o0 = livekitRtc$JoinResponse3;
                c1720c = this.f15434v0;
                this.f15428p0 = c1720c;
                this.f15429q0 = c4816c2;
                this.f15430r0 = 1;
                if (c4816c2.m5448e(null, this) == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC0571F = interfaceC0571F4;
                c4816c = c4816c2;
                livekitRtc$JoinResponse = livekitRtc$JoinResponse3;
                c15102a2 = c15102a;
            } else if (r16 == 1) {
                c4816c = this.f15429q0;
                C1720c c1720c2 = (C1720c) this.f15428p0;
                LivekitRtc$JoinResponse livekitRtc$JoinResponse4 = (LivekitRtc$JoinResponse) this.f15427o0;
                C15102a c15102a8 = (C15102a) this.f15426Z;
                c15102a = this.f15425Y;
                interfaceC0571F = (InterfaceC0571F) this.f15431s0;
                AbstractC9233X.m9807c(obj);
                c1720c = c1720c2;
                livekitRtc$JoinResponse = livekitRtc$JoinResponse4;
                c15102a2 = c15102a8;
            } else {
                if (r16 != 2) {
                    if (r16 != 3) {
                        if (r16 == 4) {
                            c15102a3 = (C15102a) this.f15427o0;
                            InterfaceC4814a interfaceC4814a = (InterfaceC4814a) this.f15426Z;
                            c15102a6 = this.f15425Y;
                            InterfaceC0571F interfaceC0571F5 = (InterfaceC0571F) this.f15431s0;
                            try {
                                AbstractC9233X.m9807c(obj);
                                interfaceC0571F = interfaceC0571F5;
                                r14 = interfaceC4814a;
                                objM5444h = obj;
                                DataChannel dataChannel3 = (DataChannel) objM5444h;
                                c15102a5 = c15102a3;
                                c15102a3 = c15102a6;
                                dataChannel = dataChannel3;
                                r13 = r14;
                                c15102a5.f46960t = dataChannel;
                                AbstractC0575H.m1186o(interfaceC0571F);
                                init2 = new DataChannel.Init();
                                init2.ordered = true;
                                init2.maxRetransmits = 0;
                                c4808y3 = c15102a3.f46958r;
                                if (c4808y3 != null) {
                                    C4732M c4732m = new C4732M(init2, c15102a3, null);
                                    this.f15431s0 = r13;
                                    this.f15425Y = c15102a3;
                                    this.f15426Z = null;
                                    this.f15427o0 = null;
                                    this.f15428p0 = null;
                                    this.f15429q0 = null;
                                    this.f15430r0 = 5;
                                    objM5444h2 = c4808y3.m5444h(c4732m, this);
                                    if (objM5444h2 == enumC19250a) {
                                        return enumC19250a;
                                    }
                                    c15102a7 = c15102a3;
                                    r16 = r13;
                                } else {
                                    dataChannel2 = null;
                                    r15 = r13;
                                }
                                c15102a3.f46962v = dataChannel2;
                                ((C4816c) r15).m5450g(null);
                                return c17296c;
                            } catch (Throwable th2) {
                                th = th2;
                                r16 = interfaceC4814a;
                            }
                        } else {
                            if (r16 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c15102a7 = this.f15425Y;
                            InterfaceC4814a interfaceC4814a2 = (InterfaceC4814a) this.f15431s0;
                            AbstractC9233X.m9807c(obj);
                            objM5444h2 = obj;
                            r16 = interfaceC4814a2;
                        }
                        dataChannel2 = (DataChannel) objM5444h2;
                        r15 = r16;
                        c15102a3 = c15102a7;
                        c15102a3.f46962v = dataChannel2;
                        ((C4816c) r15).m5450g(null);
                        return c17296c;
                    }
                    rTCConfiguration = (PeerConnection.RTCConfiguration) this.f15428p0;
                    InterfaceC4814a interfaceC4814a3 = (InterfaceC4814a) this.f15427o0;
                    livekitRtc$JoinResponse2 = (LivekitRtc$JoinResponse) this.f15426Z;
                    c15102a4 = this.f15425Y;
                    interfaceC0571F3 = (InterfaceC0571F) this.f15431s0;
                    try {
                        AbstractC9233X.m9807c(obj);
                        r6 = interfaceC4814a3;
                        interfaceC0571F = interfaceC0571F3;
                        ?? r17 = r6;
                        rTCConfiguration2 = rTCConfiguration;
                        c15102a3 = c15102a4;
                        livekitRtc$JoinResponse = livekitRtc$JoinResponse2;
                        r12 = r17;
                        InterfaceC4766d interfaceC4766d = c15102a3.f46942b;
                        c4756y0 = c15102a3.f46957q;
                        c15102a3.f46959s = ((C4708A) interfaceC4766d).m5403a(rTCConfiguration2, c4756y0, null);
                        c4734n = new C4734N(c15102a3);
                        subscriberPrimary = livekitRtc$JoinResponse.getSubscriberPrimary();
                        c4716e = c15102a3.f46956p;
                        if (subscriberPrimary) {
                            c4756y0.f15516c = new C4726J(c15102a3);
                            c4756y0.f15517d = c4734n;
                            c4716e.f15341c = new C4728K(c15102a3);
                        } else {
                            c4716e.f15341c = c4734n;
                        }
                        AbstractC0575H.m1186o(interfaceC0571F);
                        init = new DataChannel.Init();
                        init.ordered = true;
                        c4808y2 = c15102a3.f46958r;
                        if (c4808y2 != null) {
                            C4730L c4730l = new C4730L(init, c15102a3, null);
                            this.f15431s0 = interfaceC0571F;
                            this.f15425Y = c15102a3;
                            this.f15426Z = r12;
                            this.f15427o0 = c15102a3;
                            this.f15428p0 = null;
                            this.f15429q0 = null;
                            this.f15430r0 = 4;
                            objM5444h = c4808y2.m5444h(c4730l, this);
                            if (objM5444h == enumC19250a) {
                                return enumC19250a;
                            }
                            c15102a6 = c15102a3;
                            r14 = r12;
                            DataChannel dataChannel4 = (DataChannel) objM5444h;
                            c15102a5 = c15102a3;
                            c15102a3 = c15102a6;
                            dataChannel = dataChannel4;
                            r13 = r14;
                        } else {
                            c15102a5 = c15102a3;
                            dataChannel = null;
                            r13 = r12;
                        }
                        c15102a5.f46960t = dataChannel;
                        AbstractC0575H.m1186o(interfaceC0571F);
                        init2 = new DataChannel.Init();
                        init2.ordered = true;
                        init2.maxRetransmits = 0;
                        c4808y3 = c15102a3.f46958r;
                        if (c4808y3 != null) {
                            C4732M c4732m2 = new C4732M(init2, c15102a3, null);
                            this.f15431s0 = r13;
                            this.f15425Y = c15102a3;
                            this.f15426Z = null;
                            this.f15427o0 = null;
                            this.f15428p0 = null;
                            this.f15429q0 = null;
                            this.f15430r0 = 5;
                            objM5444h2 = c4808y3.m5444h(c4732m2, this);
                            if (objM5444h2 == enumC19250a) {
                                return enumC19250a;
                            }
                            c15102a7 = c15102a3;
                            r16 = r13;
                            dataChannel2 = (DataChannel) objM5444h2;
                            r15 = r16;
                            c15102a3 = c15102a7;
                        } else {
                            dataChannel2 = null;
                            r15 = r13;
                        }
                        c15102a3.f46962v = dataChannel2;
                        ((C4816c) r15).m5450g(null);
                        return c17296c;
                    } catch (Throwable th3) {
                        th = th3;
                        r16 = interfaceC4814a3;
                    }
                    ((C4816c) r16).m5450g(null);
                    throw th;
                }
                rTCConfiguration = (PeerConnection.RTCConfiguration) this.f15428p0;
                r15 = (InterfaceC4814a) this.f15427o0;
                livekitRtc$JoinResponse = (LivekitRtc$JoinResponse) this.f15426Z;
                c15102a2 = this.f15425Y;
                interfaceC0571F2 = (InterfaceC0571F) this.f15431s0;
                try {
                    AbstractC9233X.m9807c(obj);
                    r11 = r15;
                    interfaceC0571F = interfaceC0571F2;
                    r10 = r11;
                    InterfaceC4766d interfaceC4766d2 = c15102a2.f46942b;
                    C4716E c4716e2 = c15102a2.f46956p;
                    c15102a2.f46958r = ((C4708A) interfaceC4766d2).m5403a(rTCConfiguration, c4716e2, c4716e2);
                    c4808y = c15102a2.f46959s;
                    if (c4808y != null) {
                        this.f15431s0 = interfaceC0571F;
                        this.f15425Y = c15102a2;
                        this.f15426Z = livekitRtc$JoinResponse;
                        this.f15427o0 = r10;
                        this.f15428p0 = rTCConfiguration;
                        this.f15429q0 = null;
                        this.f15430r0 = 3;
                        if (c4808y.m5437a(this) == enumC19250a) {
                            return enumC19250a;
                        }
                        r6 = r10;
                        livekitRtc$JoinResponse2 = livekitRtc$JoinResponse;
                        c15102a4 = c15102a2;
                        interfaceC0571F3 = interfaceC0571F;
                        interfaceC0571F = interfaceC0571F3;
                        ?? r18 = r6;
                        rTCConfiguration2 = rTCConfiguration;
                        c15102a3 = c15102a4;
                        livekitRtc$JoinResponse = livekitRtc$JoinResponse2;
                        r12 = r18;
                    } else {
                        rTCConfiguration2 = rTCConfiguration;
                        c15102a3 = c15102a2;
                        r12 = r10;
                    }
                    InterfaceC4766d interfaceC4766d3 = c15102a3.f46942b;
                    c4756y0 = c15102a3.f46957q;
                    c15102a3.f46959s = ((C4708A) interfaceC4766d3).m5403a(rTCConfiguration2, c4756y0, null);
                    c4734n = new C4734N(c15102a3);
                    subscriberPrimary = livekitRtc$JoinResponse.getSubscriberPrimary();
                    c4716e = c15102a3.f46956p;
                    if (subscriberPrimary) {
                        c4756y0.f15516c = new C4726J(c15102a3);
                        c4756y0.f15517d = c4734n;
                        c4716e.f15341c = new C4728K(c15102a3);
                    } else {
                        c4716e.f15341c = c4734n;
                    }
                    AbstractC0575H.m1186o(interfaceC0571F);
                    init = new DataChannel.Init();
                    init.ordered = true;
                    c4808y2 = c15102a3.f46958r;
                    if (c4808y2 != null) {
                        C4730L c4730l2 = new C4730L(init, c15102a3, null);
                        this.f15431s0 = interfaceC0571F;
                        this.f15425Y = c15102a3;
                        this.f15426Z = r12;
                        this.f15427o0 = c15102a3;
                        this.f15428p0 = null;
                        this.f15429q0 = null;
                        this.f15430r0 = 4;
                        objM5444h = c4808y2.m5444h(c4730l2, this);
                        if (objM5444h == enumC19250a) {
                            return enumC19250a;
                        }
                        c15102a6 = c15102a3;
                        r14 = r12;
                        DataChannel dataChannel5 = (DataChannel) objM5444h;
                        c15102a5 = c15102a3;
                        c15102a3 = c15102a6;
                        dataChannel = dataChannel5;
                        r13 = r14;
                    } else {
                        c15102a5 = c15102a3;
                        dataChannel = null;
                        r13 = r12;
                    }
                    c15102a5.f46960t = dataChannel;
                    AbstractC0575H.m1186o(interfaceC0571F);
                    init2 = new DataChannel.Init();
                    init2.ordered = true;
                    init2.maxRetransmits = 0;
                    c4808y3 = c15102a3.f46958r;
                    if (c4808y3 != null) {
                        C4732M c4732m3 = new C4732M(init2, c15102a3, null);
                        this.f15431s0 = r13;
                        this.f15425Y = c15102a3;
                        this.f15426Z = null;
                        this.f15427o0 = null;
                        this.f15428p0 = null;
                        this.f15429q0 = null;
                        this.f15430r0 = 5;
                        objM5444h2 = c4808y3.m5444h(c4732m3, this);
                        if (objM5444h2 == enumC19250a) {
                            return enumC19250a;
                        }
                        c15102a7 = c15102a3;
                        r16 = r13;
                        dataChannel2 = (DataChannel) objM5444h2;
                        r15 = r16;
                        c15102a3 = c15102a7;
                    } else {
                        dataChannel2 = null;
                        r15 = r13;
                    }
                    c15102a3.f46962v = dataChannel2;
                    ((C4816c) r15).m5450g(null);
                    return c17296c;
                } catch (Throwable th4) {
                    th = th4;
                    r16 = r15;
                }
            }
            AbstractC0575H.m1186o(interfaceC0571F);
            if (c15102a.f46958r != null && c15102a.f46959s != null) {
                c4816c.m5450g(null);
                return c17296c;
            }
            c15102a2.f46955o = livekitRtc$JoinResponse.hasParticipant() ? livekitRtc$JoinResponse.getParticipant().getSid() : null;
            PeerConnection.RTCConfiguration rTCConfigurationM16209a = C15102a.m16209a(c15102a2, new C8392d(livekitRtc$JoinResponse), c1720c);
            C4808y c4808y4 = c15102a2.f46958r;
            if (c4808y4 != null) {
                this.f15431s0 = interfaceC0571F;
                this.f15425Y = c15102a2;
                this.f15426Z = livekitRtc$JoinResponse;
                this.f15427o0 = c4816c;
                this.f15428p0 = rTCConfigurationM16209a;
                this.f15429q0 = null;
                this.f15430r0 = 2;
                if (c4808y4.m5437a(this) == enumC19250a) {
                    return enumC19250a;
                }
                r11 = c4816c;
                rTCConfiguration = rTCConfigurationM16209a;
                interfaceC0571F2 = interfaceC0571F;
                interfaceC0571F = interfaceC0571F2;
                r10 = r11;
            } else {
                r10 = c4816c;
                rTCConfiguration = rTCConfigurationM16209a;
            }
            InterfaceC4766d interfaceC4766d4 = c15102a2.f46942b;
            C4716E c4716e3 = c15102a2.f46956p;
            c15102a2.f46958r = ((C4708A) interfaceC4766d4).m5403a(rTCConfiguration, c4716e3, c4716e3);
            c4808y = c15102a2.f46959s;
            if (c4808y != null) {
                this.f15431s0 = interfaceC0571F;
                this.f15425Y = c15102a2;
                this.f15426Z = livekitRtc$JoinResponse;
                this.f15427o0 = r10;
                this.f15428p0 = rTCConfiguration;
                this.f15429q0 = null;
                this.f15430r0 = 3;
                if (c4808y.m5437a(this) == enumC19250a) {
                    return enumC19250a;
                }
                r6 = r10;
                livekitRtc$JoinResponse2 = livekitRtc$JoinResponse;
                c15102a4 = c15102a2;
                interfaceC0571F3 = interfaceC0571F;
                interfaceC0571F = interfaceC0571F3;
                ?? r19 = r6;
                rTCConfiguration2 = rTCConfiguration;
                c15102a3 = c15102a4;
                livekitRtc$JoinResponse = livekitRtc$JoinResponse2;
                r12 = r19;
            } else {
                rTCConfiguration2 = rTCConfiguration;
                c15102a3 = c15102a2;
                r12 = r10;
            }
            InterfaceC4766d interfaceC4766d5 = c15102a3.f46942b;
            c4756y0 = c15102a3.f46957q;
            c15102a3.f46959s = ((C4708A) interfaceC4766d5).m5403a(rTCConfiguration2, c4756y0, null);
            c4734n = new C4734N(c15102a3);
            subscriberPrimary = livekitRtc$JoinResponse.getSubscriberPrimary();
            c4716e = c15102a3.f46956p;
            if (subscriberPrimary) {
                c4756y0.f15516c = new C4726J(c15102a3);
                c4756y0.f15517d = c4734n;
                c4716e.f15341c = new C4728K(c15102a3);
            } else {
                c4716e.f15341c = c4734n;
            }
            AbstractC0575H.m1186o(interfaceC0571F);
            init = new DataChannel.Init();
            init.ordered = true;
            c4808y2 = c15102a3.f46958r;
            if (c4808y2 != null) {
                C4730L c4730l3 = new C4730L(init, c15102a3, null);
                this.f15431s0 = interfaceC0571F;
                this.f15425Y = c15102a3;
                this.f15426Z = r12;
                this.f15427o0 = c15102a3;
                this.f15428p0 = null;
                this.f15429q0 = null;
                this.f15430r0 = 4;
                objM5444h = c4808y2.m5444h(c4730l3, this);
                if (objM5444h == enumC19250a) {
                    return enumC19250a;
                }
                c15102a6 = c15102a3;
                r14 = r12;
                DataChannel dataChannel6 = (DataChannel) objM5444h;
                c15102a5 = c15102a3;
                c15102a3 = c15102a6;
                dataChannel = dataChannel6;
                r13 = r14;
            } else {
                c15102a5 = c15102a3;
                dataChannel = null;
                r13 = r12;
            }
            c15102a5.f46960t = dataChannel;
            AbstractC0575H.m1186o(interfaceC0571F);
            init2 = new DataChannel.Init();
            init2.ordered = true;
            init2.maxRetransmits = 0;
            c4808y3 = c15102a3.f46958r;
            if (c4808y3 != null) {
                C4732M c4732m4 = new C4732M(init2, c15102a3, null);
                this.f15431s0 = r13;
                this.f15425Y = c15102a3;
                this.f15426Z = null;
                this.f15427o0 = null;
                this.f15428p0 = null;
                this.f15429q0 = null;
                this.f15430r0 = 5;
                objM5444h2 = c4808y3.m5444h(c4732m4, this);
                if (objM5444h2 == enumC19250a) {
                    return enumC19250a;
                }
                c15102a7 = c15102a3;
                r16 = r13;
                dataChannel2 = (DataChannel) objM5444h2;
                r15 = r16;
                c15102a3 = c15102a7;
            } else {
                dataChannel2 = null;
                r15 = r13;
            }
            c15102a3.f46962v = dataChannel2;
            ((C4816c) r15).m5450g(null);
            return c17296c;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
