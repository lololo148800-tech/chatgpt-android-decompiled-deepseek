package io.livekit.android.room;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16549q;
import livekit.LivekitModels$ClientConfiguration;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.LivekitRtc$ICEServer;
import livekit.LivekitRtc$JoinResponse;
import livekit.LivekitRtc$MuteTrackRequest;
import livekit.LivekitRtc$ReconnectResponse;
import livekit.LivekitRtc$SignalRequest;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnection;
import mm.C17296C;
import p003A1.C0227a;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0644w;
import p075Cl.C1720c;
import p075Cl.C1722e;
import p103Dn.C2127D0;
import p1160zp.AbstractC22225a;
import p193Hf.C3350b0;
import p197Hj.C3457c;
import p199Hl.C3494s;
import p225Im.InterfaceC3776x;
import p273Kl.C4716E;
import p273Kl.C4718F;
import p273Kl.C4727J0;
import p273Kl.C4750V0;
import p273Kl.C4756Y0;
import p273Kl.C4763b0;
import p273Kl.C4783l0;
import p273Kl.C4789o0;
import p273Kl.C4801u0;
import p273Kl.C4808y;
import p273Kl.EnumC4759a;
import p273Kl.EnumC4795r0;
import p273Kl.InterfaceC4766d;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p334Na.AbstractC5695b;
import p387Pl.C6469P;
import p523V9.AbstractC8154o0;
import p533Vl.AbstractC8394f;
import p533Vl.AbstractC8396h;
import p533Vl.C8389a;
import p533Vl.C8392d;
import p533Vl.C8393e;
import p533Vl.C8395g;
import p533Vl.C8398j;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9233X;
import p583Xl.AbstractC9537d;
import p594Y9.AbstractC9873d3;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p793ho.C14573E3;
import p793ho.C14646Q3;
import p793ho.C14720c4;
import p793ho.EnumC14691Y1;
import p793ho.EnumC14692Y2;
import p793ho.EnumC14746g2;
import p793ho.EnumC14781l2;
import p813ij.C15026j;
import p867l8.C16831c;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p972qm.C18778k;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: io.livekit.android.room.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15102a {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ InterfaceC3776x[] f46938C = {AbstractC16526C.f51263a.mo5697f(new C16549q(C15102a.class, "connectionState", "getConnectionState()Lio/livekit/android/room/ConnectionState;", 0))};
    public static final C4718F Companion = new C4718F();

    /* JADX INFO: renamed from: A */
    public C8389a f46939A;

    /* JADX INFO: renamed from: B */
    public final C4816c f46940B;

    /* JADX INFO: renamed from: a */
    public final C4750V0 f46941a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4766d f46942b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0563B f46943c;

    /* JADX INFO: renamed from: d */
    public C4727J0 f46944d;

    /* JADX INFO: renamed from: e */
    public final C8398j f46945e;

    /* JADX INFO: renamed from: f */
    public final EnumC4795r0 f46946f;

    /* JADX INFO: renamed from: g */
    public C0564B0 f46947g;

    /* JADX INFO: renamed from: h */
    public boolean f46948h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f46949i;

    /* JADX INFO: renamed from: j */
    public C4801u0 f46950j;

    /* JADX INFO: renamed from: k */
    public String f46951k;

    /* JADX INFO: renamed from: l */
    public String f46952l;

    /* JADX INFO: renamed from: m */
    public C1720c f46953m;

    /* JADX INFO: renamed from: n */
    public C1722e f46954n;

    /* JADX INFO: renamed from: o */
    public String f46955o;

    /* JADX INFO: renamed from: p */
    public final C4716E f46956p;

    /* JADX INFO: renamed from: q */
    public final C4756Y0 f46957q;

    /* JADX INFO: renamed from: r */
    public C4808y f46958r;

    /* JADX INFO: renamed from: s */
    public C4808y f46959s;

    /* JADX INFO: renamed from: t */
    public DataChannel f46960t;

    /* JADX INFO: renamed from: u */
    public DataChannel f46961u;

    /* JADX INFO: renamed from: v */
    public DataChannel f46962v;

    /* JADX INFO: renamed from: w */
    public DataChannel f46963w;

    /* JADX INFO: renamed from: x */
    public boolean f46964x;

    /* JADX INFO: renamed from: y */
    public boolean f46965y;

    /* JADX INFO: renamed from: z */
    public boolean f46966z;

    public C15102a(C4750V0 client, InterfaceC4766d pctFactory, AbstractC0563B ioDispatcher) {
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(pctFactory, "pctFactory");
        AbstractC16544l.m18094g(ioDispatcher, "ioDispatcher");
        this.f46941a = client;
        this.f46942b = pctFactory;
        this.f46943c = ioDispatcher;
        this.f46945e = AbstractC9873d3.m10527a(EnumC4759a.f15526o0, new C0227a(this, 12));
        this.f46946f = EnumC4795r0.f15640Y;
        this.f46949i = new LinkedHashMap();
        this.f46956p = new C4716E(this, client);
        this.f46957q = new C4756Y0(this, client);
        this.f46965y = true;
        this.f46939A = new C8389a(AbstractC5695b.m6138e(AbstractC0575H.m1176e(), ioDispatcher));
        this.f46940B = AbstractC4817d.m5451a();
        client.f15485i = this;
    }

    /* JADX INFO: renamed from: a */
    public static final PeerConnection.RTCConfiguration m16209a(C15102a c15102a, AbstractC8394f abstractC8394f, C1720c c1720c) {
        List<LivekitRtc$ICEServer> iceServersList;
        C17689w c17689w;
        PeerConnection.RTCConfiguration rTCConfiguration;
        c15102a.getClass();
        ArrayList arrayList = new ArrayList();
        boolean z6 = abstractC8394f instanceof C8392d;
        if (z6) {
            iceServersList = ((LivekitRtc$JoinResponse) ((C8392d) abstractC8394f).f26113a).getIceServersList();
        } else {
            if (!(abstractC8394f instanceof C8393e)) {
                throw new C0644w();
            }
            iceServersList = ((LivekitRtc$ReconnectResponse) ((C8393e) abstractC8394f).f26114a).getIceServersList();
        }
        Iterator<LivekitRtc$ICEServer> it = iceServersList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c17689w = C17689w.f56480Y;
            if (!zHasNext) {
                break;
            }
            LivekitRtc$ICEServer next = it.next();
            AbstractC16544l.m18091d(next);
            PeerConnection.IceServer.Builder builder = PeerConnection.IceServer.builder(next.getUrlsList());
            String username = next.getUsername();
            String str = "";
            if (username == null) {
                username = "";
            }
            PeerConnection.IceServer.Builder username2 = builder.setUsername(username);
            String credential = next.getCredential();
            if (credential != null) {
                str = credential;
            }
            PeerConnection.IceServer iceServerCreateIceServer = username2.setPassword(str).setTlsAlpnProtocols(c17689w).setTlsEllipticCurves(c17689w).createIceServer();
            AbstractC16544l.m18093f(iceServerCreateIceServer, "createIceServer(...)");
            arrayList.add(iceServerCreateIceServer);
        }
        if (arrayList.isEmpty()) {
            C4750V0.Companion.getClass();
            arrayList.addAll(C4750V0.f15476B);
        }
        PeerConnection.RTCConfiguration rTCConfiguration2 = c1720c.f4938c;
        if (rTCConfiguration2 != null) {
            rTCConfiguration = new PeerConnection.RTCConfiguration(c17689w);
            rTCConfiguration.iceTransportsType = rTCConfiguration2.iceTransportsType;
            List<PeerConnection.IceServer> iceServers = rTCConfiguration2.iceServers;
            rTCConfiguration.iceServers = iceServers;
            rTCConfiguration.bundlePolicy = rTCConfiguration2.bundlePolicy;
            rTCConfiguration.certificate = rTCConfiguration2.certificate;
            rTCConfiguration.rtcpMuxPolicy = rTCConfiguration2.rtcpMuxPolicy;
            rTCConfiguration.tcpCandidatePolicy = rTCConfiguration2.tcpCandidatePolicy;
            rTCConfiguration.candidateNetworkPolicy = rTCConfiguration2.candidateNetworkPolicy;
            rTCConfiguration.audioJitterBufferMaxPackets = rTCConfiguration2.audioJitterBufferMaxPackets;
            rTCConfiguration.audioJitterBufferFastAccelerate = rTCConfiguration2.audioJitterBufferFastAccelerate;
            rTCConfiguration.iceConnectionReceivingTimeout = rTCConfiguration2.iceConnectionReceivingTimeout;
            rTCConfiguration.iceBackupCandidatePairPingInterval = rTCConfiguration2.iceBackupCandidatePairPingInterval;
            rTCConfiguration.keyType = rTCConfiguration2.keyType;
            rTCConfiguration.continualGatheringPolicy = rTCConfiguration2.continualGatheringPolicy;
            rTCConfiguration.iceCandidatePoolSize = rTCConfiguration2.iceCandidatePoolSize;
            rTCConfiguration.pruneTurnPorts = rTCConfiguration2.pruneTurnPorts;
            rTCConfiguration.turnPortPrunePolicy = rTCConfiguration2.turnPortPrunePolicy;
            rTCConfiguration.presumeWritableWhenFullyRelayed = rTCConfiguration2.presumeWritableWhenFullyRelayed;
            rTCConfiguration.surfaceIceCandidatesOnIceTransportTypeChanged = rTCConfiguration2.surfaceIceCandidatesOnIceTransportTypeChanged;
            rTCConfiguration.iceCheckIntervalStrongConnectivityMs = rTCConfiguration2.iceCheckIntervalStrongConnectivityMs;
            rTCConfiguration.iceCheckIntervalWeakConnectivityMs = rTCConfiguration2.iceCheckIntervalWeakConnectivityMs;
            rTCConfiguration.iceCheckMinInterval = rTCConfiguration2.iceCheckMinInterval;
            rTCConfiguration.iceUnwritableTimeMs = rTCConfiguration2.iceUnwritableTimeMs;
            rTCConfiguration.iceUnwritableMinChecks = rTCConfiguration2.iceUnwritableMinChecks;
            rTCConfiguration.stunCandidateKeepaliveIntervalMs = rTCConfiguration2.stunCandidateKeepaliveIntervalMs;
            rTCConfiguration.stableWritableConnectionPingIntervalMs = rTCConfiguration2.stableWritableConnectionPingIntervalMs;
            rTCConfiguration.disableIPv6OnWifi = rTCConfiguration2.disableIPv6OnWifi;
            rTCConfiguration.maxIPv6Networks = rTCConfiguration2.maxIPv6Networks;
            rTCConfiguration.enableDscp = rTCConfiguration2.enableDscp;
            rTCConfiguration.enableCpuOveruseDetection = rTCConfiguration2.enableCpuOveruseDetection;
            rTCConfiguration.suspendBelowMinBitrate = rTCConfiguration2.suspendBelowMinBitrate;
            rTCConfiguration.screencastMinBitrate = rTCConfiguration2.screencastMinBitrate;
            rTCConfiguration.networkPreference = rTCConfiguration2.networkPreference;
            rTCConfiguration.sdpSemantics = rTCConfiguration2.sdpSemantics;
            rTCConfiguration.turnCustomizer = rTCConfiguration2.turnCustomizer;
            rTCConfiguration.activeResetSrtpParams = rTCConfiguration2.activeResetSrtpParams;
            rTCConfiguration.cryptoOptions = rTCConfiguration2.cryptoOptions;
            rTCConfiguration.turnLoggingId = rTCConfiguration2.turnLoggingId;
            rTCConfiguration.enableImplicitRollback = rTCConfiguration2.enableImplicitRollback;
            rTCConfiguration.offerExtmapAllowMixed = rTCConfiguration2.offerExtmapAllowMixed;
            rTCConfiguration.enableIceGatheringOnAnyAddressPorts = rTCConfiguration2.enableIceGatheringOnAnyAddressPorts;
            AbstractC16544l.m18093f(iceServers, "iceServers");
            ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(iceServers);
            List<PeerConnection.IceServer> list = c1720c.f4937b;
            if (list != null) {
                for (PeerConnection.IceServer iceServer : list) {
                    if (!arrayListM19323D0.contains(iceServer)) {
                        arrayListM19323D0.add(iceServer);
                    }
                }
            }
            if (arrayListM19323D0.isEmpty()) {
                List<PeerConnection.IceServer> iceServers2 = rTCConfiguration.iceServers;
                AbstractC16544l.m18093f(iceServers2, "iceServers");
                for (PeerConnection.IceServer iceServer2 : iceServers2) {
                    if (!arrayListM19323D0.contains(iceServer2)) {
                        arrayListM19323D0.add(iceServer2);
                    }
                }
            }
            rTCConfiguration.iceServers = arrayListM19323D0;
        } else {
            PeerConnection.RTCConfiguration rTCConfiguration3 = new PeerConnection.RTCConfiguration(arrayList);
            rTCConfiguration3.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
            rTCConfiguration3.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
            rTCConfiguration = rTCConfiguration3;
        }
        LivekitModels$ClientConfiguration clientConfiguration = null;
        if (z6) {
            Object obj = ((C8392d) abstractC8394f).f26113a;
            if (((LivekitRtc$JoinResponse) obj).hasClientConfiguration()) {
                clientConfiguration = ((LivekitRtc$JoinResponse) obj).getClientConfiguration();
            }
        } else {
            if (!(abstractC8394f instanceof C8393e)) {
                throw new C0644w();
            }
            Object obj2 = ((C8393e) abstractC8394f).f26114a;
            if (((LivekitRtc$ReconnectResponse) obj2).hasClientConfiguration()) {
                clientConfiguration = ((LivekitRtc$ReconnectResponse) obj2).getClientConfiguration();
            }
        }
        if (clientConfiguration != null && clientConfiguration.getForceRelay() == EnumC14691Y1.ENABLED) {
            rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.RELAY;
        }
        return rTCConfiguration;
    }

    /* JADX INFO: renamed from: b */
    public final Object m16210b(String str, String name, EnumC14692Y2 enumC14692Y2, String str2, C14573E3 c14573e3, AbstractC19687c abstractC19687c) throws C6469P {
        EnumC14781l2 enumC14781l2;
        C15026j c15026j;
        LinkedHashMap linkedHashMap = this.f46949i;
        if (linkedHashMap.get(str) != null) {
            throw new C6469P(AbstractC10763a.m11054l("Track with same ID ", str, " has already been published!"), null);
        }
        C18778k c18778k = new C18778k(AbstractC8154o0.m8714e(abstractC19687c));
        linkedHashMap.put(str, c18778k);
        C4750V0 c4750v0 = this.f46941a;
        c4750v0.getClass();
        AbstractC16544l.m18094g(name, "name");
        C1722e c1722e = c4750v0.f15489m;
        if (c1722e == null || (c15026j = c1722e.f4952c) == null || (enumC14781l2 = (EnumC14781l2) c15026j.f46725Z) == null) {
            enumC14781l2 = EnumC14781l2.NONE;
        }
        c14573e3.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3.f36981Z).setCid(str);
        c14573e3.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3.f36981Z).setName(name);
        c14573e3.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3.f36981Z).setType(enumC14692Y2);
        if (str2 != null) {
            c14573e3.m13863d();
            ((LivekitRtc$AddTrackRequest) c14573e3.f36981Z).setStream(str2);
        } else {
            c14573e3.m13863d();
            ((LivekitRtc$AddTrackRequest) c14573e3.f36981Z).clearStream();
        }
        c14573e3.m13863d();
        ((LivekitRtc$AddTrackRequest) c14573e3.f36981Z).setEncryption(enumC14781l2);
        C14720c4 c14720c4NewBuilder = LivekitRtc$SignalRequest.newBuilder();
        c14720c4NewBuilder.m13863d();
        ((LivekitRtc$SignalRequest) c14720c4NewBuilder.f36981Z).setAddTrack((LivekitRtc$AddTrackRequest) c14573e3.m13861b());
        c4750v0.m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder.m13861b());
        Object objM20051a = c18778k.m20051a();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM20051a;
    }

    /* JADX INFO: renamed from: c */
    public final void m16211c(String reason) {
        AbstractC16544l.m18094g(reason, "reason");
        if (this.f46965y) {
            return;
        }
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            "Close - ".concat(reason);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        this.f46965y = true;
        C0564B0 c0564b0 = this.f46947g;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        this.f46947g = null;
        this.f46939A.close();
        this.f46966z = false;
        this.f46951k = null;
        this.f46952l = null;
        this.f46953m = null;
        this.f46954n = null;
        this.f46955o = null;
        this.f46950j = null;
        AbstractC9537d.m10030a(new C3457c(this, 15));
        C4750V0.m5421k(this.f46941a, reason, 5);
        m16219k(EnumC4759a.f15526o0);
    }

    /* JADX INFO: renamed from: d */
    public final DataChannel m16212d(EnumC14746g2 enumC14746g2) {
        int iOrdinal = enumC14746g2.ordinal();
        if (iOrdinal == 0) {
            return this.f46960t;
        }
        if (iOrdinal != 1) {
            return null;
        }
        return this.f46962v;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0108 -> B:48:0x00c5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public final java.lang.Object m16213e(p793ho.EnumC14746g2 r16, sm.AbstractC19687c r17) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.room.C15102a.m16213e(ho.g2, sm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    public final EnumC4759a m16214f() {
        return (EnumC4759a) this.f46945e.m8943c(f46938C[0]);
    }

    /* JADX INFO: renamed from: g */
    public final void m16215g() {
        if (this.f46941a.f15482f) {
            this.f46966z = true;
            AbstractC0575H.m1156D(this.f46939A, null, null, new C4763b0(this, null), 3);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m16216h(Exception exc) {
        C4727J0 c4727j0;
        if (m16214f() != EnumC4759a.f15524Y || (c4727j0 = this.f46944d) == null) {
            return;
        }
        ((C2127D0) c4727j0.f15389n.f34081Z).mo3231f(new C3494s(c4727j0));
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m16217i() {
        C0564B0 c0564b0 = this.f46947g;
        if (c0564b0 != null && c0564b0.mo1274a()) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26117Z;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18567d(new Object[0]);
            }
            return;
        }
        if (this.f46965y) {
            C8395g c8395g2 = AbstractC8396h.Companion;
            EnumC8397i enumC8397i2 = EnumC8397i.f26117Z;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18567d(new Object[0]);
            }
            return;
        }
        C16525B c16525b = new C16525B();
        String str = this.f46951k;
        c16525b.f51262Y = str;
        String str2 = this.f46952l;
        if (str != null && str2 != null) {
            boolean z6 = this.f46948h;
            this.f46948h = false;
            C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(this.f46939A, null, null, new C4783l0(c16525b, this, z6, str2, null), 3);
            this.f46947g = c0564b0M1156D;
            c0564b0M1156D.mo1271H0(new C3350b0(this, 25, c0564b0M1156D));
            return;
        }
        C8395g c8395g3 = AbstractC8396h.Companion;
        EnumC8397i enumC8397i3 = EnumC8397i.f26119p0;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18571j(new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m16218j(LivekitModels$DataPacket livekitModels$DataPacket, AbstractC19687c abstractC19687c) throws C6469P {
        C4789o0 c4789o0;
        C15102a c15102a;
        if (abstractC19687c instanceof C4789o0) {
            c4789o0 = (C4789o0) abstractC19687c;
            int i10 = c4789o0.f15621q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4789o0.f15621q0 = i10 - Integer.MIN_VALUE;
            } else {
                c4789o0 = new C4789o0(this, abstractC19687c);
            }
        } else {
            c4789o0 = new C4789o0(this, abstractC19687c);
        }
        Object obj = c4789o0.f15619o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c4789o0.f15621q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            EnumC14746g2 kind = livekitModels$DataPacket.getKind();
            AbstractC16544l.m18093f(kind, "getKind(...)");
            c4789o0.f15617Y = this;
            c4789o0.f15618Z = livekitModels$DataPacket;
            c4789o0.f15621q0 = 1;
            if (m16213e(kind, c4789o0) == enumC19250a) {
                return enumC19250a;
            }
            c15102a = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            livekitModels$DataPacket = c4789o0.f15618Z;
            c15102a = c4789o0.f15617Y;
            AbstractC9233X.m9807c(obj);
        }
        DataChannel.Buffer buffer = new DataChannel.Buffer(ByteBuffer.wrap(livekitModels$DataPacket.toByteArray()), true);
        EnumC14746g2 kind2 = livekitModels$DataPacket.getKind();
        AbstractC16544l.m18093f(kind2, "getKind(...)");
        DataChannel dataChannelM16212d = c15102a.m16212d(kind2);
        if (dataChannelM16212d != null) {
            dataChannelM16212d.send(buffer);
            return C17296C.f55119a;
        }
        throw new C6469P("channel not established for " + livekitModels$DataPacket.getKind().name(), null);
    }

    /* JADX INFO: renamed from: k */
    public final void m16219k(EnumC4759a enumC4759a) {
        this.f46945e.m8944g(enumC4759a, f46938C[0]);
    }

    /* JADX INFO: renamed from: l */
    public final void m16220l(String sid, boolean z6) {
        AbstractC16544l.m18094g(sid, "sid");
        C4750V0 c4750v0 = this.f46941a;
        c4750v0.getClass();
        C14646Q3 c14646q3NewBuilder = LivekitRtc$MuteTrackRequest.newBuilder();
        c14646q3NewBuilder.m13863d();
        ((LivekitRtc$MuteTrackRequest) c14646q3NewBuilder.f36981Z).setSid(sid);
        c14646q3NewBuilder.m13863d();
        ((LivekitRtc$MuteTrackRequest) c14646q3NewBuilder.f36981Z).setMuted(z6);
        LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest = (LivekitRtc$MuteTrackRequest) c14646q3NewBuilder.m13861b();
        C14720c4 c14720c4NewBuilder = LivekitRtc$SignalRequest.newBuilder();
        c14720c4NewBuilder.m13863d();
        ((LivekitRtc$SignalRequest) c14720c4NewBuilder.f36981Z).setMute(livekitRtc$MuteTrackRequest);
        c4750v0.m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder.m13861b());
    }

    static {
        new MediaConstraints().optional.add(new MediaConstraints.KeyValuePair("DtlsSrtpKeyAgreement", MMVKXkcLpuHFDi.pAPYejiUw));
    }
}
