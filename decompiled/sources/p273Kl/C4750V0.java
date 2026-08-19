package p273Kl;

import android.gov.nist.core.Separators;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import bo.AbstractC11516d;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12128W0;
import com.google.protobuf.C12181p0;
import io.livekit.android.room.C15102a;
import io.livekit.android.room.IceCandidateJSON;
import io.livekit.android.room.RegionInfo;
import io.livekit.android.room.RegionSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitModels$ClientInfo;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$Room;
import livekit.LivekitModels$SpeakerInfo;
import livekit.LivekitRtc$ConnectionQualityInfo;
import livekit.LivekitRtc$LeaveRequest;
import livekit.LivekitRtc$RegionInfo;
import livekit.LivekitRtc$RegionSettings;
import livekit.LivekitRtc$SessionDescription;
import livekit.LivekitRtc$SignalRequest;
import livekit.LivekitRtc$SignalResponse;
import livekit.LivekitRtc$StreamStateInfo;
import livekit.LivekitRtc$SubscribedCodec;
import livekit.LivekitRtc$SubscribedQuality;
import livekit.LivekitRtc$SubscribedQualityUpdate;
import livekit.LivekitRtc$SubscriptionPermissionUpdate;
import livekit.LivekitRtc$TrackPublishedResponse;
import livekit.LivekitRtc$TrackSubscribed;
import livekit.LivekitRtc$TrackUnpublishedResponse;
import livekit.LivekitRtc$TrickleRequest;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.SessionDescription;
import livekit.org.webrtc.VideoTrack;
import mm.C17296C;
import mm.C17309l;
import mo.AbstractC17329F;
import mo.C17327D;
import mo.C17356w;
import mo.C17358y;
import mo.InterfaceC17332I;
import mo.InterfaceC17333J;
import p002A0.C0138o;
import p003A1.C0286s;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0624m;
import p025An.C0644w;
import p026Ao.C0678l;
import p033B5.C0842z;
import p075Cl.C1720c;
import p075Cl.C1722e;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1159zo.C22221g;
import p1160zp.AbstractC22225a;
import p153Fn.C2925c;
import p199Hl.AbstractC3470F;
import p199Hl.C3480e;
import p199Hl.C3486k;
import p199Hl.C3489n;
import p199Hl.C3491p;
import p199Hl.C3495t;
import p199Hl.C3496u;
import p199Hl.EnumC3478c;
import p225Im.InterfaceC3776x;
import p334Na.AbstractC5695b;
import p344Nl.AbstractC5821C;
import p344Nl.AbstractC5843o;
import p344Nl.C5825G;
import p344Nl.C5828J;
import p344Nl.C5832d;
import p344Nl.C5834f;
import p344Nl.C5836h;
import p344Nl.C5842n;
import p344Nl.C5846r;
import p344Nl.C5849u;
import p344Nl.EnumC5835g;
import p344Nl.InterfaceC5826H;
import p379Pb.LVf.efyhmdM;
import p387Pl.AbstractC6468O;
import p387Pl.AbstractC6470Q;
import p387Pl.C6454A;
import p387Pl.C6459F;
import p387Pl.C6465L;
import p387Pl.C6472T;
import p387Pl.C6497q;
import p387Pl.C6501u;
import p387Pl.EnumC6466M;
import p387Pl.EnumC6473U;
import p510Ul.C7720a;
import p510Ul.EnumC7721b;
import p523V9.AbstractC8154o0;
import p533Vl.AbstractC8394f;
import p533Vl.AbstractC8396h;
import p533Vl.C8389a;
import p533Vl.C8392d;
import p533Vl.C8393e;
import p533Vl.C8395g;
import p533Vl.C8398j;
import p533Vl.EnumC8397i;
import p571X9.AbstractC9147I2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p583Xl.AbstractC9537d;
import p658b5.C11248s;
import p791hj.C14522e;
import p793ho.C14581F4;
import p793ho.C14704a2;
import p793ho.C14720c4;
import p793ho.C14734e4;
import p793ho.C14802o2;
import p793ho.EnumC14634O3;
import p793ho.EnumC14711b2;
import p793ho.EnumC14727d4;
import p793ho.EnumC14732e2;
import p793ho.EnumC14741f4;
import p793ho.EnumC14748g4;
import p793ho.EnumC14767j2;
import p793ho.EnumC14790m4;
import p793ho.EnumC14816q2;
import p817j$.util.Objects;
import p867l8.C16831c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p930oj.C18219a;
import p959q8.C18639a;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Kl.V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4750V0 extends AbstractC9147I2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17332I f15477a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11516d f15478b;

    /* JADX INFO: renamed from: c */
    public final C17356w f15479c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0563B f15480d;

    /* JADX INFO: renamed from: e */
    public final C7720a f15481e;

    /* JADX INFO: renamed from: f */
    public boolean f15482f;

    /* JADX INFO: renamed from: g */
    public C22221g f15483g;

    /* JADX INFO: renamed from: h */
    public boolean f15484h;

    /* JADX INFO: renamed from: i */
    public C15102a f15485i;

    /* JADX INFO: renamed from: j */
    public C18219a f15486j;

    /* JADX INFO: renamed from: k */
    public String f15487k;

    /* JADX INFO: renamed from: l */
    public C1720c f15488l;

    /* JADX INFO: renamed from: m */
    public C1722e f15489m;

    /* JADX INFO: renamed from: n */
    public C0624m f15490n;

    /* JADX INFO: renamed from: o */
    public C8389a f15491o;

    /* JADX INFO: renamed from: p */
    public final C2127D0 f15492p;

    /* JADX INFO: renamed from: q */
    public final Object f15493q;

    /* JADX INFO: renamed from: r */
    public C0564B0 f15494r;

    /* JADX INFO: renamed from: s */
    public final C2127D0 f15495s;

    /* JADX INFO: renamed from: t */
    public final Object f15496t;

    /* JADX INFO: renamed from: u */
    public C0564B0 f15497u;

    /* JADX INFO: renamed from: v */
    public C0564B0 f15498v;

    /* JADX INFO: renamed from: w */
    public C0564B0 f15499w;

    /* JADX INFO: renamed from: x */
    public long f15500x;

    /* JADX INFO: renamed from: y */
    public long f15501y;

    /* JADX INFO: renamed from: z */
    public long f15502z;
    public static final C4733M0 Companion = new C4733M0();

    /* JADX INFO: renamed from: A */
    public static final List f15475A = AbstractC17681o.m19382k(EnumC14727d4.f46070w0, EnumC14727d4.f46062o0, EnumC14727d4.f46060Y, EnumC14727d4.f46061Z, EnumC14727d4.f46071x0, EnumC14727d4.f46067t0);

    /* JADX INFO: renamed from: B */
    public static final List f15476B = AbstractC17681o.m19382k(PeerConnection.IceServer.builder("stun:stun.l.google.com:19302").createIceServer(), PeerConnection.IceServer.builder("stun:stun1.l.google.com:19302").createIceServer());

    public C4750V0(InterfaceC17332I websocketFactory, AbstractC11516d json, C17356w okHttpClient, AbstractC0563B ioDispatcher, C7720a networkInfo) {
        AbstractC16544l.m18094g(websocketFactory, "websocketFactory");
        AbstractC16544l.m18094g(json, "json");
        AbstractC16544l.m18094g(okHttpClient, "okHttpClient");
        AbstractC16544l.m18094g(ioDispatcher, "ioDispatcher");
        AbstractC16544l.m18094g(networkInfo, "networkInfo");
        this.f15477a = websocketFactory;
        this.f15478b = json;
        this.f15479c = okHttpClient;
        this.f15480d = ioDispatcher;
        this.f15481e = networkInfo;
        this.f15492p = AbstractC2124C.m3203b(Integer.MAX_VALUE, 0, null, 6);
        this.f15493q = new Object();
        this.f15495s = AbstractC2124C.m3203b(Integer.MAX_VALUE, 0, null, 6);
        this.f15496t = new Object();
        EnumC4759a enumC4759a = EnumC4759a.f15524Y;
    }

    /* JADX INFO: renamed from: k */
    public static void m5421k(C4750V0 c4750v0, String reason, int i10) {
        boolean z6 = (i10 & 4) != 0;
        c4750v0.getClass();
        AbstractC16544l.m18094g(reason, "reason");
        C8395g c8395g = AbstractC8396h.Companion;
        new Exception();
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        c4750v0.f15482f = false;
        c4750v0.f15484h = false;
        C8389a c8389a = c4750v0.f15491o;
        if (c8389a != null) {
            c8389a.close();
        }
        C0564B0 c0564b0 = c4750v0.f15494r;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        c4750v0.f15494r = null;
        C0564B0 c0564b1 = c4750v0.f15497u;
        if (c0564b1 != null) {
            c0564b1.mo1275e(null);
        }
        c4750v0.f15497u = null;
        C0564B0 c0564b2 = c4750v0.f15498v;
        if (c0564b2 != null) {
            c0564b2.mo1275e(null);
        }
        c4750v0.f15498v = null;
        C0564B0 c0564b3 = c4750v0.f15499w;
        if (c0564b3 != null) {
            c0564b3.mo1275e(null);
        }
        c4750v0.f15499w = null;
        C22221g c22221g = c4750v0.f15483g;
        if (c22221g != null) {
            c22221g.m22406b(1000, reason);
        }
        c4750v0.f15483g = null;
        C0624m c0624m = c4750v0.f15490n;
        if (c0624m != null) {
            c0624m.mo1244b(null);
        }
        c4750v0.f15490n = null;
        if (z6) {
            c4750v0.f15492p.mo3230e();
        }
        c4750v0.f15495s.mo3230e();
        c4750v0.f15487k = null;
        c4750v0.f15488l = null;
        c4750v0.f15489m = null;
    }

    /* JADX INFO: renamed from: m */
    public static SessionDescription m5422m(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        SessionDescription.Type type;
        String type2 = livekitRtc$SessionDescription.getType();
        if (type2 != null) {
            int iHashCode = type2.hashCode();
            if (iHashCode != -1412808770) {
                if (iHashCode != -1395375040) {
                    if (iHashCode == 105650780 && type2.equals("offer")) {
                        type = SessionDescription.Type.OFFER;
                        return new SessionDescription(type, livekitRtc$SessionDescription.getSdp());
                    }
                } else if (type2.equals("pranswer")) {
                    type = SessionDescription.Type.PRANSWER;
                    return new SessionDescription(type, livekitRtc$SessionDescription.getSdp());
                }
            } else if (type2.equals("answer")) {
                type = SessionDescription.Type.ANSWER;
                return new SessionDescription(type, livekitRtc$SessionDescription.getSdp());
            }
        }
        throw new IllegalArgumentException("invalid RTC SdpType: " + livekitRtc$SessionDescription.getType());
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: e */
    public final void mo4337e(C22221g c22221g, int i10, String str) {
        if (c22221g.equals(this.f15483g)) {
            m5425o(i10, str);
        }
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: f */
    public final void mo4338f(C22221g c22221g, int i10, String str) {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        AbstractC22225a.f70470a.getClass();
        C16831c.m18570i(new Object[0]);
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: h */
    public final void mo4340h(String str, C22221g c22221g) {
        if (c22221g.equals(this.f15483g)) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                return;
            }
            AbstractC22225a.f70470a.getClass();
            C16831c.m18571j(new Object[0]);
        }
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: i */
    public final void mo4341i(C22221g c22221g, C0678l c0678l) throws Throwable {
        if (c22221g.equals(this.f15483g)) {
            byte[] bArrMo1382q = c0678l.mo1382q();
            C14734e4 c14734e4NewBuilder = LivekitRtc$SignalResponse.newBuilder();
            c14734e4NewBuilder.getClass();
            int length = bArrMo1382q.length;
            C12087F c12087fM13737b = C12087F.m13737b();
            c14734e4NewBuilder.m13863d();
            try {
                C12128W0.f36987c.m13869b(c14734e4NewBuilder.f36981Z).mo13794h(c14734e4NewBuilder.f36981Z, bArrMo1382q, 0, length, new C0138o(c12087fM13737b));
                LivekitRtc$SignalResponse livekitRtc$SignalResponse = (LivekitRtc$SignalResponse) c14734e4NewBuilder.m13861b();
                if (c22221g.equals(this.f15483g)) {
                    C8395g c8395g = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i = EnumC8397i.f26116Y;
                    AbstractC8396h.Companion.getClass();
                    EnumC8397i enumC8397i2 = AbstractC8396h.f26115a;
                    if (enumC8397i.compareTo(enumC8397i2) >= 0 && AbstractC22225a.m22419a() > 0) {
                        livekitRtc$SignalResponse.toString();
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18570i(new Object[0]);
                    }
                    if (!this.f15482f) {
                        if (livekitRtc$SignalResponse.hasJoin()) {
                            this.f15482f = true;
                            m5433w();
                            long j10 = 1000;
                            this.f15500x = ((long) livekitRtc$SignalResponse.getJoin().getPingTimeout()) * j10;
                            this.f15501y = ((long) livekitRtc$SignalResponse.getJoin().getPingInterval()) * j10;
                            m5432v();
                            try {
                                this.f15486j = new C18219a(livekitRtc$SignalResponse.getJoin().getServerVersion());
                            } catch (Throwable unused) {
                                C8395g c8395g2 = AbstractC8396h.Companion;
                                EnumC8397i enumC8397i3 = EnumC8397i.f26119p0;
                                AbstractC8396h.Companion.getClass();
                                if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                    AbstractC22225a.f70470a.getClass();
                                    C16831c.m18571j(new Object[0]);
                                }
                            }
                            C0624m c0624m = this.f15490n;
                            if (c0624m != null) {
                                c0624m.resumeWith(new C8392d(livekitRtc$SignalResponse.getJoin()));
                                return;
                            }
                            return;
                        }
                        if (livekitRtc$SignalResponse.hasLeave()) {
                            m5424n(c22221g, livekitRtc$SignalResponse);
                            return;
                        }
                        if (!this.f15484h) {
                            if (EnumC8397i.f26120q0.compareTo(enumC8397i2) < 0 || AbstractC22225a.m22419a() <= 0) {
                                return;
                            }
                            livekitRtc$SignalResponse.toString();
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18568f(new Object[0]);
                            return;
                        }
                        this.f15484h = false;
                        this.f15482f = true;
                        m5432v();
                        if (livekitRtc$SignalResponse.hasReconnect()) {
                            C0624m c0624m2 = this.f15490n;
                            if (c0624m2 != null) {
                                c0624m2.resumeWith(new C8393e(new C8392d(livekitRtc$SignalResponse.getReconnect())));
                                return;
                            }
                            return;
                        }
                        C0624m c0624m3 = this.f15490n;
                        if (c0624m3 != null) {
                            c0624m3.resumeWith(new C8393e(new C8393e(C17296C.f55119a)));
                        }
                    }
                    this.f15495s.mo3231f(new C17309l(c22221g, livekitRtc$SignalResponse));
                }
            } catch (C12181p0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused2) {
                throw C12181p0.m14066g();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final Object m5423l(String str, String str2, C1720c c1720c, C1722e c1722e, AbstractC19687c abstractC19687c) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        EnumC7721b enumC7721b;
        m5421k(this, "Starting new connection", 1);
        StringBuilder sb2 = new StringBuilder();
        AbstractC16544l.m18094g(str, "<this>");
        if (AbstractC21329w.m21734u(str, "http", false)) {
            str = AbstractC21329w.m21732s(str, "http", "ws");
        }
        sb2.append(str);
        sb2.append("/rtc");
        C14704a2 c14704a2NewBuilder = LivekitModels$ClientInfo.newBuilder();
        EnumC14711b2 enumC14711b2 = EnumC14711b2.ANDROID;
        c14704a2NewBuilder.m13863d();
        ((LivekitModels$ClientInfo) c14704a2NewBuilder.f36981Z).setSdk(enumC14711b2);
        c14704a2NewBuilder.m13863d();
        ((LivekitModels$ClientInfo) c14704a2NewBuilder.f36981Z).setVersion("2.11.0");
        c14704a2NewBuilder.m13863d();
        ((LivekitModels$ClientInfo) c14704a2NewBuilder.f36981Z).setOs("android");
        String str3 = Build.VERSION.RELEASE;
        String string = "";
        if (str3 == null) {
            str3 = "";
        }
        c14704a2NewBuilder.m13863d();
        ((LivekitModels$ClientInfo) c14704a2NewBuilder.f36981Z).setOsVersion(str3);
        String str4 = Build.MANUFACTURER;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = Build.MODEL;
        if (str5 == null) {
            str5 = "";
        }
        String string2 = AbstractC21322p.m21711s0(str4 + ' ' + str5).toString();
        c14704a2NewBuilder.m13863d();
        ((LivekitModels$ClientInfo) c14704a2NewBuilder.f36981Z).setDeviceModel(string2);
        LivekitModels$ClientInfo livekitModels$ClientInfo = (LivekitModels$ClientInfo) c14704a2NewBuilder.m13861b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C17309l("access_token", str2));
        arrayList.add(new C17309l("protocol", String.valueOf(c1720c.f4941f.f15309Y)));
        if (c1720c.f4942g) {
            arrayList.add(new C17309l("reconnect", "1"));
            String str6 = c1720c.f4943h;
            if (str6 != null) {
                arrayList.add(new C17309l("sid", str6));
            }
        }
        arrayList.add(new C17309l("auto_subscribe", String.valueOf(c1720c.f4936a ? 1 : 0)));
        arrayList.add(new C17309l("adaptive_stream", String.valueOf(c1722e.f4950a ? 1 : 0)));
        arrayList.add(new C17309l("sdk", "android"));
        arrayList.add(new C17309l("version", livekitModels$ClientInfo.getVersion()));
        arrayList.add(new C17309l("device_model", livekitModels$ClientInfo.getDeviceModel()));
        arrayList.add(new C17309l("os", livekitModels$ClientInfo.getOs()));
        arrayList.add(new C17309l("os_version", livekitModels$ClientInfo.getOsVersion()));
        Object systemService = this.f15481e.f24328a.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            enumC7721b = EnumC7721b.UNKNOWN;
        } else if (networkCapabilities.hasTransport(1)) {
            enumC7721b = EnumC7721b.WIFI;
        } else if (networkCapabilities.hasTransport(3)) {
            enumC7721b = EnumC7721b.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            enumC7721b = EnumC7721b.CELLULAR;
        } else if (networkCapabilities.hasTransport(4)) {
            enumC7721b = EnumC7721b.VPN;
        } else if (networkCapabilities.hasTransport(2)) {
            enumC7721b = EnumC7721b.BLUETOOTH;
        } else {
            enumC7721b = (networkCapabilities.hasTransport(5) || networkCapabilities.hasTransport(6) || networkCapabilities.hasTransport(8)) ? EnumC7721b.OTHER : EnumC7721b.UNKNOWN;
        }
        arrayList.add(new C17309l("network", enumC7721b.f24337Y));
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            C17309l c17309l = (C17309l) obj;
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(string, i10 == 0 ? Separators.QUESTION : Separators.AND);
            sbM9895n.append((String) c17309l.f55136Y);
            sbM9895n.append('=');
            sbM9895n.append((String) c17309l.f55137Z);
            string = sbM9895n.toString();
            i10 = i11;
        }
        sb2.append(string);
        String string3 = sb2.toString();
        this.f15484h = c1720c.f4942g;
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26118o0;
        AbstractC8396h.Companion.getClass();
        if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18569g(new Object[0]);
        }
        this.f15491o = new C8389a(AbstractC5695b.m6138e(AbstractC0575H.m1176e(), this.f15480d));
        this.f15487k = string3;
        this.f15488l = c1720c;
        this.f15489m = c1722e;
        C14522e c14522e = new C14522e(3);
        c14522e.m16010B(string3);
        C17358y c17358yM16017i = c14522e.m16017i();
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19687c));
        c0624m.m1262r();
        this.f15490n = c0624m;
        this.f15483g = ((C17356w) this.f15477a).m19036c(c17358yM16017i, this);
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x03dc  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n */
    public final void m5424n(InterfaceC17333J interfaceC17333J, LivekitRtc$SignalResponse livekitRtc$SignalResponse) throws Throwable {
        EnumC3478c enumC3478c;
        C4801u0 c4801u0;
        EnumC5835g enumC5835g;
        AbstractC6470Q abstractC6470Q;
        AbstractC6468O abstractC6468OM7055c;
        EnumC6466M enumC6466M;
        C15102a c15102a;
        List list;
        C17309l c17309l;
        C18777j c18777j = C18777j.f59682Y;
        int i10 = 28;
        int i11 = 0;
        if (!AbstractC16544l.m18089b(interfaceC17333J, this.f15483g)) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26116Y;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                return;
            }
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
            return;
        }
        EnumC14741f4 messageCase = livekitRtc$SignalResponse.getMessageCase();
        int i12 = messageCase == null ? -1 : AbstractC4735N0.f15424a[messageCase.ordinal()];
        if (i12 == -1 || i12 == 23) {
            C8395g c8395g2 = AbstractC8396h.Companion;
            EnumC8397i enumC8397i2 = EnumC8397i.f26116Y;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i2.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                return;
            }
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
            return;
        }
        switch (i12) {
            case 1:
                LivekitRtc$SessionDescription answer = livekitRtc$SignalResponse.getAnswer();
                AbstractC16544l.m18093f(answer, "getAnswer(...)");
                SessionDescription sessionDescriptionM5422m = m5422m(answer);
                C15102a c15102a2 = this.f15485i;
                if (c15102a2 != null) {
                    c15102a2.getClass();
                    PeerConnection.SignalingState signalingState = (PeerConnection.SignalingState) AbstractC0575H.m1161I(c18777j, new C4767d0(c15102a2, null));
                    C8395g c8395g3 = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i3 = EnumC8397i.f26116Y;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        Objects.toString(sessionDescriptionM5422m.type);
                        Objects.toString(signalingState);
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18570i(new Object[0]);
                    }
                    AbstractC0575H.m1156D(c15102a2.f46939A, null, null, new C4765c0(c15102a2, sessionDescriptionM5422m, null), 3);
                    return;
                }
                return;
            case 2:
                LivekitRtc$SessionDescription offer = livekitRtc$SignalResponse.getOffer();
                AbstractC16544l.m18093f(offer, "getOffer(...)");
                SessionDescription sessionDescriptionM5422m2 = m5422m(offer);
                C15102a c15102a3 = this.f15485i;
                if (c15102a3 != null) {
                    c15102a3.getClass();
                    PeerConnection.SignalingState signalingState2 = (PeerConnection.SignalingState) AbstractC0575H.m1161I(c18777j, new C4775h0(c15102a3, null));
                    C8395g c8395g4 = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i4 = EnumC8397i.f26116Y;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i4.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        Objects.toString(sessionDescriptionM5422m2.type);
                        Objects.toString(signalingState2);
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18570i(new Object[0]);
                    }
                    AbstractC0575H.m1156D(c15102a3.f46939A, null, null, new C4773g0(c15102a3, sessionDescriptionM5422m2, null), 3);
                    return;
                }
                return;
            case 3:
                String candidateInit = livekitRtc$SignalResponse.getTrickle().getCandidateInit();
                AbstractC16544l.m18093f(candidateInit, "getCandidateInit(...)");
                AbstractC11516d abstractC11516d = this.f15478b;
                abstractC11516d.getClass();
                IceCandidateJSON iceCandidateJSON = (IceCandidateJSON) abstractC11516d.m12903b(candidateInit, IceCandidateJSON.INSTANCE.serializer());
                IceCandidate iceCandidate = new IceCandidate(iceCandidateJSON.f46932c, iceCandidateJSON.f46931b, iceCandidateJSON.f46930a);
                C15102a c15102a4 = this.f15485i;
                if (c15102a4 != null) {
                    EnumC14748g4 target = livekitRtc$SignalResponse.getTrickle().getTarget();
                    AbstractC16544l.m18093f(target, "getTarget(...)");
                    C8395g c8395g5 = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i5 = EnumC8397i.f26116Y;
                    AbstractC8396h.Companion.getClass();
                    EnumC8397i enumC8397i6 = AbstractC8396h.f26115a;
                    if (enumC8397i5.compareTo(enumC8397i6) >= 0 && AbstractC22225a.m22419a() > 0) {
                        iceCandidate.toString();
                        target.toString();
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18570i(new Object[0]);
                    }
                    int iOrdinal = target.ordinal();
                    C17296C c17296c = C17296C.f55119a;
                    if (iOrdinal == 0) {
                        C4808y c4808y = c15102a4.f46958r;
                        if (c4808y != null) {
                            C0286s c0286s = new C0286s(c4808y, i10, iceCandidate);
                            if (!c4808y.f15685h.get()) {
                                AbstractC9537d.m10030a(new C0286s(c4808y, c0286s));
                            }
                        } else {
                            c17296c = null;
                        }
                        if (c17296c != null || EnumC8397i.f26119p0.compareTo(enumC8397i6) < 0 || AbstractC22225a.m22419a() <= 0) {
                            return;
                        }
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18571j(new Object[0]);
                        return;
                    }
                    if (iOrdinal != 1) {
                        if (EnumC8397i.f26118o0.compareTo(enumC8397i6) < 0 || AbstractC22225a.m22419a() <= 0) {
                            return;
                        }
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18569g(new Object[0]);
                        return;
                    }
                    C4808y c4808y2 = c15102a4.f46959s;
                    if (c4808y2 != null) {
                        C0286s c0286s2 = new C0286s(c4808y2, i10, iceCandidate);
                        if (!c4808y2.f15685h.get()) {
                            AbstractC9537d.m10030a(new C0286s(c4808y2, c0286s2));
                        }
                    } else {
                        c17296c = null;
                    }
                    if (c17296c != null || EnumC8397i.f26119p0.compareTo(enumC8397i6) < 0 || AbstractC22225a.m22419a() <= 0) {
                        return;
                    }
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18571j(new Object[0]);
                    return;
                }
                return;
            case 4:
                C15102a c15102a5 = this.f15485i;
                if (c15102a5 != null) {
                    List<LivekitModels$ParticipantInfo> participantsList = livekitRtc$SignalResponse.getUpdate().getParticipantsList();
                    AbstractC16544l.m18093f(participantsList, "getParticipantsList(...)");
                    C4727J0 c4727j0 = c15102a5.f46944d;
                    if (c4727j0 != null) {
                        for (LivekitModels$ParticipantInfo livekitModels$ParticipantInfo : participantsList) {
                            String sid = livekitModels$ParticipantInfo.getSid();
                            AbstractC16544l.m18093f(sid, "getSid(...)");
                            String identity = livekitModels$ParticipantInfo.getIdentity();
                            LinkedHashMap linkedHashMap = c4727j0.f15368A;
                            if (identity == null || AbstractC21322p.m21681O(identity)) {
                                C14802o2 c14802o2 = (C14802o2) livekitModels$ParticipantInfo.toBuilder();
                                C5846r c5846r = (C5846r) linkedHashMap.get(new C5849u(sid));
                                String str = c5846r != null ? c5846r.f19130a : null;
                                if (str == null) {
                                    str = "";
                                }
                                c14802o2.m13863d();
                                ((LivekitModels$ParticipantInfo) c14802o2.f36981Z).setIdentity(str);
                                livekitModels$ParticipantInfo = (LivekitModels$ParticipantInfo) c14802o2.m13861b();
                            }
                            String identity2 = livekitModels$ParticipantInfo.getIdentity();
                            AbstractC16544l.m18093f(identity2, "getIdentity(...)");
                            C5842n c5842n = c4727j0.f15400y;
                            String strM6218b = c5842n.m6218b();
                            if (strM6218b == null ? false : AbstractC16544l.m18089b(strM6218b, identity2)) {
                                c5842n.mo6226j(livekitModels$ParticipantInfo);
                            } else {
                                boolean zContainsKey = c4727j0.m5409d().containsKey(new C5846r(identity2));
                                if (livekitModels$ParticipantInfo.getState() == EnumC14816q2.DISCONNECTED) {
                                    c4727j0.m5413h(identity2);
                                } else {
                                    C5825G c5825gM5410e = c4727j0.m5410e(livekitModels$ParticipantInfo, identity2);
                                    if (zContainsKey) {
                                        c5825gM5410e.mo6226j(livekitModels$ParticipantInfo);
                                        linkedHashMap.put(new C5849u(sid), new C5846r(identity2));
                                    } else {
                                        C3496u c3496u = new C3496u(c4727j0, c5825gM5410e);
                                        C2925c c2925c = c4727j0.f15388m;
                                        if (c2925c == null) {
                                            AbstractC16544l.m18103p("coroutineScope");
                                            throw null;
                                        }
                                        c4727j0.f15389n.m12669r(c3496u, c2925c);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                C15102a c15102a6 = this.f15485i;
                if (c15102a6 != null) {
                    LivekitRtc$TrackSubscribed trackSubscribed = livekitRtc$SignalResponse.getTrackSubscribed();
                    AbstractC16544l.m18093f(trackSubscribed, "getTrackSubscribed(...)");
                    C4727J0 c4727j1 = c15102a6.f46944d;
                    if (c4727j1 != null) {
                        C5842n c5842n2 = c4727j1.f15400y;
                        Object obj = c5842n2.m6220d().get(trackSubscribed.getTrackSid());
                        C6497q c6497q = obj instanceof C6497q ? (C6497q) obj : null;
                        if (c6497q == null) {
                            C8395g c8395g6 = AbstractC8396h.Companion;
                            EnumC8397i enumC8397i7 = EnumC8397i.f26119p0;
                            AbstractC8396h.Companion.getClass();
                            if (enumC8397i7.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                                return;
                            }
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18571j(new Object[0]);
                            return;
                        }
                        C2925c c2925c2 = c4727j1.f15388m;
                        if (c2925c2 == null) {
                            AbstractC16544l.m18103p("coroutineScope");
                            throw null;
                        }
                        AbstractC0575H.m1156D(c2925c2, null, null, new C4723H0(c4727j1, c6497q, null), 3);
                        if (c5842n2.m6220d().containsKey(c6497q.f20992c)) {
                            c5842n2.f18997d.m12669r(new C3480e(c5842n2, c6497q, 2), c5842n2.f18996c);
                            return;
                        }
                        C8395g c8395g7 = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i8 = EnumC8397i.f26119p0;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i8.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                            return;
                        }
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18571j(new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                C15102a c15102a7 = this.f15485i;
                if (c15102a7 != null) {
                    LivekitRtc$TrackPublishedResponse trackPublished = livekitRtc$SignalResponse.getTrackPublished();
                    AbstractC16544l.m18093f(trackPublished, "getTrackPublished(...)");
                    String cid = trackPublished.getCid();
                    if (cid == null) {
                        C8395g c8395g8 = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i9 = EnumC8397i.f26120q0;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i9.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                            return;
                        }
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18568f(new Object[0]);
                        return;
                    }
                    if (trackPublished.getTrack() == null) {
                        C8395g c8395g9 = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i10 = EnumC8397i.f26117Z;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i10.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                            AbstractC22225a.f70470a.getClass();
                            C16831c.m18567d(new Object[0]);
                        }
                    }
                    C8395g c8395g10 = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i11 = EnumC8397i.f26116Y;
                    AbstractC8396h.Companion.getClass();
                    EnumC8397i enumC8397i12 = AbstractC8396h.f26115a;
                    if (enumC8397i11.compareTo(enumC8397i12) >= 0 && AbstractC22225a.m22419a() > 0) {
                        "local track published ".concat(cid);
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18570i(new Object[0]);
                    }
                    InterfaceC18770c interfaceC18770c = (InterfaceC18770c) c15102a7.f46949i.remove(cid);
                    if (interfaceC18770c != null) {
                        interfaceC18770c.resumeWith(trackPublished.getTrack());
                        return;
                    } else {
                        if (EnumC8397i.f26117Z.compareTo(enumC8397i12) < 0 || AbstractC22225a.m22419a() <= 0) {
                            return;
                        }
                        "missing track resolver for: ".concat(cid);
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18567d(new Object[0]);
                        return;
                    }
                }
                return;
            case 7:
                C15102a c15102a8 = this.f15485i;
                if (c15102a8 != null) {
                    List<LivekitModels$SpeakerInfo> speakersList = livekitRtc$SignalResponse.getSpeakersChanged().getSpeakersList();
                    AbstractC16544l.m18093f(speakersList, "getSpeakersList(...)");
                    C4727J0 c4727j2 = c15102a8.f46944d;
                    if (c4727j2 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        InterfaceC3776x interfaceC3776x = C4727J0.f15367I[6];
                        C8398j c8398j = c4727j2.f15369B;
                        for (AbstractC5821C abstractC5821C : (List) c8398j.m8943c(interfaceC3776x)) {
                            linkedHashMap2.put(new C5849u(abstractC5821C.f18994a), abstractC5821C);
                        }
                        for (LivekitModels$SpeakerInfo livekitModels$SpeakerInfo : speakersList) {
                            String sid2 = livekitModels$SpeakerInfo.getSid();
                            AbstractC16544l.m18093f(sid2, "getSid(...)");
                            AbstractC5821C abstractC5821CM5411f = c4727j2.m5411f(sid2);
                            if (abstractC5821CM5411f != null) {
                                abstractC5821CM5411f.m6223g(livekitModels$SpeakerInfo.getLevel());
                                abstractC5821CM5411f.m6224h(livekitModels$SpeakerInfo.getActive());
                                if (livekitModels$SpeakerInfo.getActive()) {
                                    linkedHashMap2.put(new C5849u(sid2), abstractC5821CM5411f);
                                } else {
                                    linkedHashMap2.remove(new C5849u(sid2));
                                }
                            }
                        }
                        List listM19322C0 = AbstractC17680n.m19322C0(AbstractC17680n.m19370t0(AbstractC17680n.m19322C0(linkedHashMap2.values()), new C0842z(7)));
                        InterfaceC3776x[] interfaceC3776xArr = C4727J0.f15367I;
                        c8398j.m8944g(listM19322C0, interfaceC3776xArr[6]);
                        C3489n c3489n = new C3489n(c4727j2, (List) c8398j.m8943c(interfaceC3776xArr[6]));
                        C2925c c2925c3 = c4727j2.f15388m;
                        if (c2925c3 != null) {
                            c4727j2.f15389n.m12669r(c3489n, c2925c3);
                            return;
                        } else {
                            AbstractC16544l.m18103p("coroutineScope");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            case 8:
                C8395g c8395g11 = AbstractC8396h.Companion;
                EnumC8397i enumC8397i13 = EnumC8397i.f26117Z;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i13.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                    return;
                }
                AbstractC22225a.f70470a.getClass();
                C16831c.m18567d(new Object[0]);
                return;
            case 9:
                C15102a c15102a9 = this.f15485i;
                if (c15102a9 != null) {
                    LivekitRtc$LeaveRequest leave = livekitRtc$SignalResponse.getLeave();
                    AbstractC16544l.m18093f(leave, "getLeave(...)");
                    C8395g c8395g12 = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i14 = EnumC8397i.f26117Z;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i14.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        leave.getReason().name();
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18567d(new Object[0]);
                    }
                    if (leave.hasRegions() && (c4801u0 = c15102a9.f46950j) != null) {
                        RegionSettings.Companion companion = RegionSettings.INSTANCE;
                        LivekitRtc$RegionSettings regions = leave.getRegions();
                        AbstractC16544l.m18093f(regions, "getRegions(...)");
                        companion.getClass();
                        List<LivekitRtc$RegionInfo> regionsList = regions.getRegionsList();
                        AbstractC16544l.m18093f(regionsList, "getRegionsList(...)");
                        List<LivekitRtc$RegionInfo> list2 = regionsList;
                        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                        for (LivekitRtc$RegionInfo livekitRtc$RegionInfo : list2) {
                            String region = livekitRtc$RegionInfo.getRegion();
                            AbstractC16544l.m18093f(region, "getRegion(...)");
                            String url = livekitRtc$RegionInfo.getUrl();
                            AbstractC16544l.m18093f(url, "getUrl(...)");
                            arrayList.add(new RegionInfo(region, livekitRtc$RegionInfo.getDistance(), url));
                        }
                        c4801u0.f15662e = new RegionSettings(arrayList);
                        c4801u0.f15663f = SystemClock.elapsedRealtime();
                    }
                    if (leave.getAction() == EnumC14634O3.RESUME) {
                        c15102a9.f46948h = false;
                        return;
                    }
                    if (leave.getAction() == EnumC14634O3.RECONNECT || leave.getCanReconnect()) {
                        c15102a9.f46948h = true;
                        return;
                    }
                    C4718F c4718f = C15102a.Companion;
                    c15102a9.m16211c("Normal Closure");
                    EnumC14767j2 reason = leave.getReason();
                    switch (reason != null ? AbstractC3470F.f10534a[reason.ordinal()] : -1) {
                        case -1:
                        case 11:
                        case 12:
                            enumC3478c = EnumC3478c.f10547Y;
                            break;
                        case 0:
                        default:
                            throw new C0644w();
                        case 1:
                            enumC3478c = EnumC3478c.f10548Z;
                            break;
                        case 2:
                            enumC3478c = EnumC3478c.f10549o0;
                            break;
                        case 3:
                            enumC3478c = EnumC3478c.f10550p0;
                            break;
                        case 4:
                            enumC3478c = EnumC3478c.f10551q0;
                            break;
                        case 5:
                            enumC3478c = EnumC3478c.f10552r0;
                            break;
                        case 6:
                            enumC3478c = EnumC3478c.f10553s0;
                            break;
                        case 7:
                            enumC3478c = EnumC3478c.f10554t0;
                            break;
                        case 8:
                            enumC3478c = EnumC3478c.f10555u0;
                            break;
                        case 9:
                            enumC3478c = EnumC3478c.f10556v0;
                            break;
                        case 10:
                            enumC3478c = EnumC3478c.f10557w0;
                            break;
                    }
                    C4727J0 c4727j3 = c15102a9.f46944d;
                    if (c4727j3 != null) {
                        c4727j3.m5415j(enumC3478c);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                C15102a c15102a10 = this.f15485i;
                if (c15102a10 != null) {
                    String sid3 = livekitRtc$SignalResponse.getMute().getSid();
                    AbstractC16544l.m18093f(sid3, "getSid(...)");
                    boolean muted = livekitRtc$SignalResponse.getMute().getMuted();
                    C4727J0 c4727j4 = c15102a10.f46944d;
                    if (c4727j4 != null) {
                        C5842n c5842n3 = c4727j4.f15400y;
                        c5842n3.getClass();
                        AbstractC6470Q abstractC6470Q2 = (AbstractC6470Q) c5842n3.m6220d().get(sid3);
                        if (abstractC6470Q2 == null) {
                            return;
                        }
                        abstractC6470Q2.mo7036d(muted);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                C15102a c15102a11 = this.f15485i;
                if (c15102a11 != null) {
                    LivekitModels$Room room = livekitRtc$SignalResponse.getRoomUpdate().getRoom();
                    AbstractC16544l.m18093f(room, "getRoom(...)");
                    C4727J0 room2 = c15102a11.f46944d;
                    if (room2 != null) {
                        if (room.getSid() != null) {
                            String sid4 = room.getSid();
                            AbstractC16544l.m18093f(sid4, "getSid(...)");
                            room2.m5419n(sid4);
                        }
                        InterfaceC3776x[] interfaceC3776xArr2 = C4727J0.f15367I;
                        InterfaceC3776x interfaceC3776x2 = interfaceC3776xArr2[3];
                        C8398j c8398j2 = room2.f15394s;
                        String str2 = (String) c8398j2.m8943c(interfaceC3776x2);
                        c8398j2.m8944g(room.getMetadata(), interfaceC3776xArr2[3]);
                        boolean zM5414i = room2.m5414i();
                        room2.f15395t.m8944g(Boolean.valueOf(room.getActiveRecording()), interfaceC3776xArr2[4]);
                        boolean zM18089b = AbstractC16544l.m18089b(str2, (String) c8398j2.m8943c(interfaceC3776xArr2[3]));
                        C11248s c11248s = room2.f15389n;
                        if (!zM18089b) {
                            C3495t c3495t = new C3495t(room2);
                            C2925c c2925c4 = room2.f15388m;
                            if (c2925c4 == null) {
                                AbstractC16544l.m18103p("coroutineScope");
                                throw null;
                            }
                            c11248s.m12669r(c3495t, c2925c4);
                        }
                        if (zM5414i != room2.m5414i()) {
                            room2.m5414i();
                            AbstractC16544l.m18094g(room2, "room");
                            C3495t c3495t2 = new C3495t(room2);
                            C2925c c2925c5 = room2.f15388m;
                            if (c2925c5 != null) {
                                c11248s.m12669r(c3495t2, c2925c5);
                                return;
                            } else {
                                AbstractC16544l.m18103p("coroutineScope");
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                C15102a c15102a12 = this.f15485i;
                if (c15102a12 != null) {
                    List<LivekitRtc$ConnectionQualityInfo> updatesList = livekitRtc$SignalResponse.getConnectionQuality().getUpdatesList();
                    AbstractC16544l.m18093f(updatesList, "getUpdatesList(...)");
                    C4727J0 c4727j5 = c15102a12.f46944d;
                    if (c4727j5 != null) {
                        for (LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo : updatesList) {
                            C5834f c5834f = EnumC5835g.Companion;
                            EnumC14732e2 quality = livekitRtc$ConnectionQualityInfo.getQuality();
                            AbstractC16544l.m18093f(quality, "getQuality(...)");
                            c5834f.getClass();
                            int iOrdinal2 = quality.ordinal();
                            if (iOrdinal2 == 0) {
                                enumC5835g = EnumC5835g.f19061o0;
                            } else if (iOrdinal2 == 1) {
                                enumC5835g = EnumC5835g.f19060Z;
                            } else if (iOrdinal2 == 2) {
                                enumC5835g = EnumC5835g.f19059Y;
                            } else if (iOrdinal2 == 3) {
                                enumC5835g = EnumC5835g.f19063q0;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new C0644w();
                                }
                                enumC5835g = EnumC5835g.f19062p0;
                            }
                            String participantSid = livekitRtc$ConnectionQualityInfo.getParticipantSid();
                            AbstractC16544l.m18093f(participantSid, "getParticipantSid(...)");
                            AbstractC5821C abstractC5821CM5411f2 = c4727j5.m5411f(participantSid);
                            if (abstractC5821CM5411f2 == null) {
                                return;
                            }
                            abstractC5821CM5411f2.f19007n.m8944g(enumC5835g, AbstractC5821C.f18993u[8]);
                            C3491p c3491p = new C3491p(c4727j5, abstractC5821CM5411f2, enumC5835g);
                            C2925c c2925c6 = c4727j5.f15388m;
                            if (c2925c6 == null) {
                                AbstractC16544l.m18103p("coroutineScope");
                                throw null;
                            }
                            c4727j5.f15389n.m12669r(c3491p, c2925c6);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                C15102a c15102a13 = this.f15485i;
                if (c15102a13 != null) {
                    List<LivekitRtc$StreamStateInfo> streamStatesList = livekitRtc$SignalResponse.getStreamStateUpdate().getStreamStatesList();
                    AbstractC16544l.m18093f(streamStatesList, "getStreamStatesList(...)");
                    C4727J0 c4727j6 = c15102a13.f46944d;
                    if (c4727j6 != null) {
                        for (LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo : streamStatesList) {
                            String participantSid2 = livekitRtc$StreamStateInfo.getParticipantSid();
                            AbstractC16544l.m18093f(participantSid2, "getParticipantSid(...)");
                            AbstractC5821C abstractC5821CM5411f3 = c4727j6.m5411f(participantSid2);
                            if (abstractC5821CM5411f3 != null && (abstractC6470Q = (AbstractC6470Q) abstractC5821CM5411f3.m6220d().get(livekitRtc$StreamStateInfo.getTrackSid())) != null && (abstractC6468OM7055c = abstractC6470Q.m7055c()) != null) {
                                C6465L c6465l = EnumC6466M.Companion;
                                EnumC14790m4 state = livekitRtc$StreamStateInfo.getState();
                                AbstractC16544l.m18093f(state, "getState(...)");
                                c6465l.getClass();
                                int iOrdinal3 = state.ordinal();
                                if (iOrdinal3 == 0) {
                                    enumC6466M = EnumC6466M.f20974Y;
                                } else if (iOrdinal3 == 1) {
                                    enumC6466M = EnumC6466M.f20975Z;
                                } else {
                                    if (iOrdinal3 != 2) {
                                        throw new C0644w();
                                    }
                                    enumC6466M = EnumC6466M.f20976o0;
                                }
                                abstractC6468OM7055c.f20987f.m8944g(enumC6466M, AbstractC6468O.f20981h[0]);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                C18219a c18219a = new C18219a("0.15.1");
                C18219a c18219a2 = this.f15486j;
                if ((c18219a2 != null ? c18219a2.compareTo(c18219a) : 1) > 0 && (c15102a = this.f15485i) != null) {
                    LivekitRtc$SubscribedQualityUpdate subscribedQualityUpdate = livekitRtc$SignalResponse.getSubscribedQualityUpdate();
                    AbstractC16544l.m18093f(subscribedQualityUpdate, "getSubscribedQualityUpdate(...)");
                    C4727J0 c4727j7 = c15102a.f46944d;
                    if (c4727j7 != null) {
                        C5842n c5842n4 = c4727j7.f15400y;
                        c5842n4.getClass();
                        if (c5842n4.f19114v) {
                            String trackSid = subscribedQualityUpdate.getTrackSid();
                            List<LivekitRtc$SubscribedCodec> subscribedCodecsList = subscribedQualityUpdate.getSubscribedCodecsList();
                            List<LivekitRtc$SubscribedQuality> subscribedQualitiesList = subscribedQualityUpdate.getSubscribedQualitiesList();
                            Object obj2 = c5842n4.m6220d().get(trackSid);
                            C6497q c6497q2 = obj2 instanceof C6497q ? (C6497q) obj2 : null;
                            if (c6497q2 == null) {
                                return;
                            }
                            AbstractC6468O abstractC6468OM7055c2 = c6497q2.m7055c();
                            C6501u c6501u = abstractC6468OM7055c2 instanceof C6501u ? (C6501u) abstractC6468OM7055c2 : null;
                            if (c6501u == null) {
                                return;
                            }
                            InterfaceC5826H interfaceC5826H = c6497q2.f21076k;
                            C5828J c5828j = interfaceC5826H instanceof C5828J ? (C5828J) interfaceC5826H : null;
                            if (c5828j == null) {
                                return;
                            }
                            AbstractC16544l.m18091d(subscribedCodecsList);
                            List<LivekitRtc$SubscribedCodec> list3 = subscribedCodecsList;
                            if (!list3.isEmpty()) {
                                C8395g c8395g13 = AbstractC8396h.Companion;
                                EnumC8397i enumC8397i15 = EnumC8397i.f26116Y;
                                AbstractC8396h.Companion.getClass();
                                if (enumC8397i15.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                    subscribedCodecsList.toString();
                                    AbstractC22225a.f70470a.getClass();
                                    C16831c.m18570i(new Object[0]);
                                }
                                String str3 = c6501u.f21091p;
                                LinkedHashMap linkedHashMap3 = c6501u.f21093r;
                                if (str3 != null || list3.isEmpty()) {
                                    c6501u.f21092q = subscribedCodecsList;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec : subscribedCodecsList) {
                                        if (AbstractC16544l.m18089b(c6501u.f21091p, livekitRtc$SubscribedCodec.getCodec())) {
                                            List<LivekitRtc$SubscribedQuality> qualitiesList = livekitRtc$SubscribedCodec.getQualitiesList();
                                            AbstractC16544l.m18093f(qualitiesList, "getQualitiesList(...)");
                                            c6501u.m7066m(qualitiesList);
                                        } else {
                                            try {
                                                C6472T c6472t = EnumC6473U.Companion;
                                                String codec = livekitRtc$SubscribedCodec.getCodec();
                                                AbstractC16544l.m18093f(codec, "getCodec(...)");
                                                c6472t.getClass();
                                                EnumC6473U[] enumC6473UArrValues = EnumC6473U.values();
                                                int length = enumC6473UArrValues.length;
                                                int i13 = i11;
                                                while (true) {
                                                    if (i13 >= length) {
                                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                    }
                                                    EnumC6473U enumC6473U = enumC6473UArrValues[i13];
                                                    if (enumC6473U.f21004Y.equalsIgnoreCase(codec)) {
                                                        C8395g c8395g14 = AbstractC8396h.Companion;
                                                        EnumC8397i enumC8397i16 = EnumC8397i.f26117Z;
                                                        AbstractC8396h.Companion.getClass();
                                                        EnumC8397i enumC8397i17 = AbstractC8396h.f26115a;
                                                        if (enumC8397i16.compareTo(enumC8397i17) >= 0 && AbstractC22225a.m22419a() > 0) {
                                                            livekitRtc$SubscribedCodec.getCodec();
                                                            AbstractC22225a.f70470a.getClass();
                                                            C16831c.m18567d(new Object[0]);
                                                        }
                                                        C6459F c6459f = (C6459F) linkedHashMap3.get(enumC6473U);
                                                        if ((c6459f != null ? c6459f.f20960c : null) == null) {
                                                            Iterator<LivekitRtc$SubscribedQuality> it = livekitRtc$SubscribedCodec.getQualitiesList().iterator();
                                                            while (it.hasNext()) {
                                                                if (it.next().getEnabled()) {
                                                                    arrayList2.add(enumC6473U);
                                                                }
                                                            }
                                                        } else {
                                                            if (enumC8397i16.compareTo(enumC8397i17) >= 0 && AbstractC22225a.m22419a() > 0) {
                                                                livekitRtc$SubscribedCodec.getCodec();
                                                                AbstractC22225a.f70470a.getClass();
                                                                C16831c.m18567d(new Object[0]);
                                                            }
                                                            RtpSender rtpSender = c6459f.f20960c;
                                                            AbstractC16544l.m18091d(rtpSender);
                                                            List<LivekitRtc$SubscribedQuality> qualitiesList2 = livekitRtc$SubscribedCodec.getQualitiesList();
                                                            AbstractC16544l.m18093f(qualitiesList2, "getQualitiesList(...)");
                                                            c6501u.m7067n(rtpSender, qualitiesList2);
                                                        }
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            } catch (Exception unused) {
                                                C8395g c8395g15 = AbstractC8396h.Companion;
                                                EnumC8397i enumC8397i18 = EnumC8397i.f26119p0;
                                                AbstractC8396h.Companion.getClass();
                                                if (enumC8397i18.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                                    livekitRtc$SubscribedCodec.getCodec();
                                                    AbstractC22225a.f70470a.getClass();
                                                    C16831c.m18571j(new Object[0]);
                                                }
                                            }
                                            i11 = 0;
                                        }
                                    }
                                    list = arrayList2;
                                } else {
                                    List<LivekitRtc$SubscribedQuality> qualitiesList3 = ((LivekitRtc$SubscribedCodec) AbstractC17680n.m19341Q(subscribedCodecsList)).getQualitiesList();
                                    AbstractC16544l.m18093f(qualitiesList3, "getQualitiesList(...)");
                                    c6501u.m7066m(qualitiesList3);
                                    list = C17689w.f56480Y;
                                }
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    EnumC6473U enumC6473U2 = (EnumC6473U) it2.next();
                                    if (AbstractC5843o.f19119a.contains(enumC6473U2.f21004Y)) {
                                        C8395g c8395g16 = AbstractC8396h.Companion;
                                        EnumC8397i enumC8397i19 = EnumC8397i.f26117Z;
                                        AbstractC8396h.Companion.getClass();
                                        EnumC8397i enumC8397i20 = AbstractC8396h.f26115a;
                                        if (enumC8397i19.compareTo(enumC8397i20) >= 0 && AbstractC22225a.m22419a() > 0) {
                                            enumC6473U2.toString();
                                            AbstractC22225a.f70470a.getClass();
                                            C16831c.m18567d(new Object[0]);
                                        }
                                        AbstractC6470Q abstractC6470Q3 = (AbstractC6470Q) c5842n4.m6220d().get(c6501u.f20986e);
                                        if (abstractC6470Q3 == null) {
                                            if (EnumC8397i.f26119p0.compareTo(enumC8397i20) >= 0 && AbstractC22225a.m22419a() > 0) {
                                                AbstractC22225a.f70470a.getClass();
                                                C16831c.m18571j(new Object[0]);
                                            }
                                            it2 = it2;
                                        } else {
                                            C5832d c5832d = c5828j.f19042f;
                                            String str4 = c5832d != null ? c5832d.f19056a : null;
                                            String str5 = enumC6473U2.f21004Y;
                                            if (str4 == null) {
                                                c17309l = null;
                                            } else if (AbstractC16544l.m18089b(c5828j.f19040d, c5832d.f19056a)) {
                                                c17309l = null;
                                            } else {
                                                if (!str5.equals(c5832d.f19056a) && EnumC8397i.f26119p0.compareTo(enumC8397i20) >= 0 && AbstractC22225a.m22419a() > 0) {
                                                    enumC6473U2.toString();
                                                    AbstractC22225a.f70470a.getClass();
                                                    C16831c.m18571j(new Object[0]);
                                                }
                                                C5828J c5828jM6236h = C5828J.m6236h(c5828j, c5832d.f19057b, str5, null, null, 501);
                                                c17309l = new C17309l(c5828jM6236h, C5842n.m6240l(c6501u.m7064k(), c5828jM6236h));
                                            }
                                            if (c17309l != null) {
                                                C5828J c5828j2 = (C5828J) c17309l.f55136Y;
                                                List encodings = (List) c17309l.f55137Z;
                                                AbstractC16544l.m18094g(encodings, "encodings");
                                                if (linkedHashMap3.containsKey(enumC6473U2)) {
                                                    throw new IllegalStateException(enumC6473U2 + " already added!");
                                                }
                                                VideoTrack rtcTrack = c6501u.f21090o;
                                                AbstractC16544l.m18094g(rtcTrack, "rtcTrack");
                                                C6459F c6459f2 = new C6459F();
                                                c6459f2.f20958a = str5;
                                                c6459f2.f20959b = rtcTrack;
                                                c6459f2.f20960c = null;
                                                c6459f2.f20961d = encodings;
                                                linkedHashMap3.put(enumC6473U2, c6459f2);
                                                c5842n4 = c5842n4;
                                                linkedHashMap3 = linkedHashMap3;
                                                AbstractC0575H.m1156D(c5842n4.f18996c, null, null, new C5836h(c5842n4, c6501u, new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, AbstractC9393x3.m9974d(c5842n4.f18994a), encodings), c5828j2, c6459f2, abstractC6470Q3, c5828j, enumC6473U2, encodings, null), 3);
                                            } else if (EnumC8397i.f26118o0.compareTo(enumC8397i20) >= 0 && AbstractC22225a.m22419a() > 0) {
                                                AbstractC22225a.f70470a.getClass();
                                                C16831c.m18569g(new Object[0]);
                                            }
                                            c6501u = c6501u;
                                            c5842n4 = c5842n4;
                                            linkedHashMap3 = linkedHashMap3;
                                            it2 = it2;
                                        }
                                        c6501u = c6501u;
                                        c5842n4 = c5842n4;
                                        linkedHashMap3 = linkedHashMap3;
                                        it2 = it2;
                                    }
                                }
                            }
                            C6501u c6501u2 = c6501u;
                            AbstractC16544l.m18091d(subscribedQualitiesList);
                            if (subscribedQualitiesList.isEmpty()) {
                                return;
                            }
                            c6501u2.m7066m(subscribedQualitiesList);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                C15102a c15102a14 = this.f15485i;
                if (c15102a14 != null) {
                    LivekitRtc$SubscriptionPermissionUpdate subscriptionPermissionUpdate = livekitRtc$SignalResponse.getSubscriptionPermissionUpdate();
                    AbstractC16544l.m18093f(subscriptionPermissionUpdate, "getSubscriptionPermissionUpdate(...)");
                    C4727J0 c4727j8 = c15102a14.f46944d;
                    if (c4727j8 != null) {
                        String participantSid3 = subscriptionPermissionUpdate.getParticipantSid();
                        AbstractC16544l.m18093f(participantSid3, "getParticipantSid(...)");
                        AbstractC5821C abstractC5821CM5411f4 = c4727j8.m5411f(participantSid3);
                        C5825G c5825g = abstractC5821CM5411f4 instanceof C5825G ? (C5825G) abstractC5821CM5411f4 : null;
                        if (c5825g == null) {
                            return;
                        }
                        Object obj3 = c5825g.m6220d().get(subscriptionPermissionUpdate.getTrackSid());
                        C6454A c6454a = obj3 instanceof C6454A ? (C6454A) obj3 : null;
                        if (c6454a == null || c6454a.f20942p == subscriptionPermissionUpdate.getAllowed()) {
                            return;
                        }
                        boolean allowed = subscriptionPermissionUpdate.getAllowed();
                        c6454a.f20942p = allowed;
                        c5825g.f18997d.m12669r(new C3486k(c5825g, c6454a, allowed), c5825g.f19030x);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                C15102a c15102a15 = this.f15485i;
                if (c15102a15 != null) {
                    String refreshToken = livekitRtc$SignalResponse.getRefreshToken();
                    AbstractC16544l.m18093f(refreshToken, "getRefreshToken(...)");
                    c15102a15.f46952l = refreshToken;
                    C4801u0 c4801u1 = c15102a15.f46950j;
                    if (c4801u1 == null) {
                        return;
                    }
                    c4801u1.f15659b = refreshToken;
                    return;
                }
                return;
            case 17:
                C15102a c15102a16 = this.f15485i;
                if (c15102a16 != null) {
                    LivekitRtc$TrackUnpublishedResponse trackUnpublished = livekitRtc$SignalResponse.getTrackUnpublished();
                    AbstractC16544l.m18093f(trackUnpublished, "getTrackUnpublished(...)");
                    C4727J0 c4727j9 = c15102a16.f46944d;
                    if (c4727j9 != null) {
                        C5842n c5842n5 = c4727j9.f15400y;
                        c5842n5.getClass();
                        AbstractC6470Q abstractC6470Q4 = (AbstractC6470Q) c5842n5.m6220d().get(trackUnpublished.getTrackSid());
                        AbstractC6468O abstractC6468OM7055c3 = abstractC6470Q4 != null ? abstractC6470Q4.m7055c() : null;
                        if (abstractC6468OM7055c3 != null) {
                            c5842n5.m6255z(abstractC6468OM7055c3, true);
                            return;
                        }
                        C8395g c8395g17 = AbstractC8396h.Companion;
                        EnumC8397i enumC8397i21 = EnumC8397i.f26119p0;
                        AbstractC8396h.Companion.getClass();
                        if (enumC8397i21.compareTo(AbstractC8396h.f26115a) < 0 || AbstractC22225a.m22419a() <= 0) {
                            return;
                        }
                        trackUnpublished.getTrackSid();
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18571j(new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                C0564B0 c0564b0 = this.f15499w;
                if (c0564b0 != null) {
                    c0564b0.mo1275e(null);
                }
                this.f15499w = null;
                return;
            case 19:
                this.f15502z = new Date().getTime() - livekitRtc$SignalResponse.getPongResp().getLastPingTimestamp();
                C0564B0 c0564b1 = this.f15499w;
                if (c0564b1 != null) {
                    c0564b1.mo1275e(null);
                }
                this.f15499w = null;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5425o(int i10, String str) {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        EnumC8397i enumC8397i2 = AbstractC8396h.f26115a;
        if (enumC8397i.compareTo(enumC8397i2) >= 0 && AbstractC22225a.m22419a() > 0) {
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        this.f15482f = false;
        C15102a c15102a = this.f15485i;
        if (c15102a != null) {
            if (EnumC8397i.f26118o0.compareTo(enumC8397i2) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18569g(new Object[0]);
            }
            c15102a.m16217i();
        }
        this.f15492p.mo3230e();
        this.f15495s.mo3230e();
        C0564B0 c0564b0 = this.f15498v;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        C0564B0 c0564b1 = this.f15499w;
        if (c0564b1 != null) {
            c0564b1.mo1275e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: p */
    public final Object m5426p(String str, String str2, C1720c c1720c, C1722e c1722e, AbstractC19687c abstractC19687c) {
        C4737O0 c4737o0;
        if (abstractC19687c instanceof C4737O0) {
            c4737o0 = (C4737O0) abstractC19687c;
            int i10 = c4737o0.f15437o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4737o0.f15437o0 = i10 - Integer.MIN_VALUE;
            } else {
                c4737o0 = new C4737O0(this, abstractC19687c);
            }
        } else {
            c4737o0 = new C4737O0(this, abstractC19687c);
        }
        C4737O0 c4737o1 = c4737o0;
        Object objM5423l = c4737o1.f15435Y;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c4737o1.f15437o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM5423l);
            c4737o1.f15437o0 = 1;
            objM5423l = m5423l(str, str2, c1720c, c1722e, c4737o1);
            if (objM5423l == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM5423l);
        }
        AbstractC8394f abstractC8394f = (AbstractC8394f) objM5423l;
        AbstractC16544l.m18092e(abstractC8394f, "null cannot be cast to non-null type io.livekit.android.util.Either.Left<livekit.LivekitRtc.JoinResponse>");
        return ((C8392d) abstractC8394f).f26113a;
    }

    /* JADX INFO: renamed from: q */
    public final void m5427q() {
        if (this.f15497u != null) {
            return;
        }
        synchronized (this.f15496t) {
            try {
                if (this.f15497u == null) {
                    C8389a c8389a = this.f15491o;
                    if (c8389a == null) {
                        AbstractC16544l.m18103p("coroutineScope");
                        throw null;
                    }
                    this.f15497u = AbstractC0575H.m1156D(c8389a, null, null, new C4741Q0(this, null), 3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final Object m5428r(String str, String str2, String str3, AbstractC19687c abstractC19687c) {
        C4742R0 c4742r0;
        if (abstractC19687c instanceof C4742R0) {
            c4742r0 = (C4742R0) abstractC19687c;
            int i10 = c4742r0.f15450o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c4742r0.f15450o0 = i10 - Integer.MIN_VALUE;
            } else {
                c4742r0 = new C4742R0(this, abstractC19687c);
            }
        } else {
            c4742r0 = new C4742R0(this, abstractC19687c);
        }
        C4742R0 c4742r1 = c4742r0;
        Object objM5423l = c4742r1.f15448Y;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c4742r1.f15450o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM5423l);
            C1720c c1720c = this.f15488l;
            if (c1720c == null) {
                c1720c = new C1720c();
            }
            EnumC4710B protocolVersion = c1720c.f4941f;
            AbstractC16544l.m18094g(protocolVersion, "protocolVersion");
            C1720c c1720c2 = new C1720c(c1720c.f4936a, c1720c.f4937b, c1720c.f4938c, c1720c.f4939d, c1720c.f4940e, protocolVersion);
            c1720c2.f4942g = true;
            c1720c2.f4943h = str3;
            C1722e c1722e = this.f15489m;
            if (c1722e == null) {
                c1722e = new C1722e(null, 0 == true ? 1 : 0, 511);
            }
            c4742r1.f15450o0 = 1;
            objM5423l = m5423l(str, str2, c1720c2, c1722e, c4742r1);
            if (objM5423l == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM5423l);
        }
        AbstractC8394f abstractC8394f = (AbstractC8394f) objM5423l;
        AbstractC16544l.m18092e(abstractC8394f, "null cannot be cast to non-null type io.livekit.android.util.Either.Right<io.livekit.android.util.Either<livekit.LivekitRtc.ReconnectResponse, kotlin.Unit>>");
        return ((C8393e) abstractC8394f).f26114a;
    }

    /* JADX INFO: renamed from: s */
    public final void m5429s(IceCandidate candidate, EnumC14748g4 enumC14748g4) {
        AbstractC16544l.m18094g(candidate, "candidate");
        String str = candidate.sdp;
        String str2 = candidate.sdpMid;
        int i10 = candidate.sdpMLineIndex;
        AbstractC16544l.m18091d(str);
        IceCandidateJSON iceCandidateJSON = new IceCandidateJSON(str, i10, str2);
        C14581F4 c14581f4NewBuilder = LivekitRtc$TrickleRequest.newBuilder();
        AbstractC11516d abstractC11516d = this.f15478b;
        abstractC11516d.getClass();
        String strM12905d = abstractC11516d.m12905d(IceCandidateJSON.INSTANCE.serializer(), iceCandidateJSON);
        c14581f4NewBuilder.m13863d();
        ((LivekitRtc$TrickleRequest) c14581f4NewBuilder.f36981Z).setCandidateInit(strM12905d);
        c14581f4NewBuilder.m13863d();
        ((LivekitRtc$TrickleRequest) c14581f4NewBuilder.f36981Z).setTarget(enumC14748g4);
        LivekitRtc$TrickleRequest livekitRtc$TrickleRequest = (LivekitRtc$TrickleRequest) c14581f4NewBuilder.m13861b();
        C14720c4 c14720c4NewBuilder = LivekitRtc$SignalRequest.newBuilder();
        c14720c4NewBuilder.m13863d();
        ((LivekitRtc$SignalRequest) c14720c4NewBuilder.f36981Z).setTrickle(livekitRtc$TrickleRequest);
        m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder.m13861b());
    }

    /* JADX INFO: renamed from: t */
    public final void m5430t(LivekitRtc$SignalRequest livekitRtc$SignalRequest) {
        if (f15475A.contains(livekitRtc$SignalRequest.getMessageCase())) {
            m5431u(livekitRtc$SignalRequest);
        } else {
            this.f15492p.mo3231f(livekitRtc$SignalRequest);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m5431u(LivekitRtc$SignalRequest livekitRtc$SignalRequest) {
        C8395g c8395g = AbstractC8396h.Companion;
        EnumC8397i enumC8397i = EnumC8397i.f26116Y;
        AbstractC8396h.Companion.getClass();
        EnumC8397i enumC8397i2 = AbstractC8396h.f26115a;
        if (enumC8397i.compareTo(enumC8397i2) >= 0 && AbstractC22225a.m22419a() > 0) {
            Objects.toString(livekitRtc$SignalRequest);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18570i(new Object[0]);
        }
        if (!this.f15482f || this.f15483g == null) {
            if (EnumC8397i.f26119p0.compareTo(enumC8397i2) < 0 || AbstractC22225a.m22419a() <= 0) {
                return;
            }
            Objects.toString(livekitRtc$SignalRequest);
            AbstractC22225a.f70470a.getClass();
            C16831c.m18571j(new Object[0]);
            return;
        }
        C0678l c0678l = C0678l.f1971p0;
        byte[] byteArray = livekitRtc$SignalRequest.toByteArray();
        AbstractC16544l.m18093f(byteArray, "toByteArray(...)");
        C0678l c0678lM19998t = C18639a.m19998t(byteArray, 0, -1234567890);
        C22221g c22221g = this.f15483g;
        if ((c22221g != null ? c22221g.m22413i(2, c0678lM19998t) : false) || EnumC8397i.f26120q0.compareTo(enumC8397i2) < 0 || AbstractC22225a.m22419a() <= 0) {
            return;
        }
        livekitRtc$SignalRequest.toString();
        AbstractC22225a.f70470a.getClass();
        C16831c.m18568f(new Object[0]);
    }

    /* JADX INFO: renamed from: v */
    public final void m5432v() {
        if (this.f15498v != null || this.f15501y == 0) {
            return;
        }
        C8389a c8389a = this.f15491o;
        if (c8389a != null) {
            this.f15498v = AbstractC0575H.m1156D(c8389a, null, null, new C4744S0(this, null), 3);
        } else {
            AbstractC16544l.m18103p("coroutineScope");
            throw null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5433w() {
        if (this.f15494r != null) {
            return;
        }
        synchronized (this.f15493q) {
            try {
                if (this.f15494r == null) {
                    C8389a c8389a = this.f15491o;
                    if (c8389a == null) {
                        AbstractC16544l.m18103p("coroutineScope");
                        throw null;
                    }
                    this.f15494r = AbstractC0575H.m1156D(c8389a, null, null, new C4748U0(this, null), 3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p571X9.AbstractC9147I2
    /* JADX INFO: renamed from: g */
    public final void mo4339g(C22221g c22221g, Exception exc, C17327D c17327d) {
        String localizedMessage;
        if (c22221g.equals(this.f15483g)) {
            try {
                String strM21732s = this.f15487k;
                if (strM21732s != null) {
                    if (AbstractC21329w.m21734u(strM21732s, "ws", false)) {
                        strM21732s = AbstractC21329w.m21732s(strM21732s, "ws", "http");
                    }
                    String strM21732s2 = AbstractC21329w.m21732s(strM21732s, efyhmdM.phaVYlqu, "/rtc/validate?");
                    C14522e c14522e = new C14522e(3);
                    c14522e.m16010B(strM21732s2);
                    C17327D c17327dM20063e = this.f15479c.m19035b(c14522e.m16017i()).m20063e();
                    AbstractC17329F abstractC17329F = c17327dM20063e.f55179s0;
                    localizedMessage = (c17327dM20063e.m18985a() || abstractC17329F == null) ? null : abstractC17329F.m18991k();
                    if (abstractC17329F != null) {
                        try {
                            abstractC17329F.close();
                        } catch (Throwable unused) {
                            C8395g c8395g = AbstractC8396h.Companion;
                            EnumC8397i enumC8397i = EnumC8397i.f26120q0;
                            AbstractC8396h.Companion.getClass();
                            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                                AbstractC22225a.f70470a.getClass();
                                C16831c.m18568f(new Object[0]);
                            }
                        }
                    }
                } else {
                    localizedMessage = null;
                }
            } catch (Throwable unused2) {
                localizedMessage = null;
            }
            if (localizedMessage != null) {
                C8395g c8395g2 = AbstractC8396h.Companion;
                EnumC8397i enumC8397i2 = EnumC8397i.f26120q0;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    "websocket failure: ".concat(localizedMessage);
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18568f(new Object[0]);
                }
                Exception exc2 = new Exception(localizedMessage);
                C15102a c15102a = this.f15485i;
                if (c15102a != null) {
                    c15102a.m16216h(exc2);
                }
                C0624m c0624m = this.f15490n;
                if (c0624m != null) {
                    c0624m.mo1244b(exc2);
                }
            } else {
                C8395g c8395g3 = AbstractC8396h.Companion;
                EnumC8397i enumC8397i3 = EnumC8397i.f26120q0;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i3.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    Objects.toString(c17327d);
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18568f(new Object[0]);
                }
                C15102a c15102a2 = this.f15485i;
                if (c15102a2 != null) {
                    c15102a2.m16216h(exc);
                }
                C0624m c0624m2 = this.f15490n;
                if (c0624m2 != null) {
                    c0624m2.mo1244b(exc);
                }
            }
            if (this.f15482f) {
                if (localizedMessage == null) {
                    String string = c17327d != null ? c17327d.toString() : null;
                    localizedMessage = string == null ? exc.getLocalizedMessage() : string;
                }
                if (localizedMessage == null) {
                    localizedMessage = "websocket failure";
                }
                m5425o(c17327d != null ? c17327d.f55176p0 : 3500, localizedMessage);
            }
        }
    }
}
