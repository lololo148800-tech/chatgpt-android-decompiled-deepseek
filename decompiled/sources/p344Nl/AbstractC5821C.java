package p344Nl;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16549q;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$ParticipantPermission;
import p003A1.AbstractC0168G;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p103Dn.AbstractC2124C;
import p103Dn.C2133G0;
import p103Dn.C2137I0;
import p124Ei.C2499c1;
import p124Ei.C2502d1;
import p129En.C2604o;
import p153Fn.C2925c;
import p199Hl.C3467C;
import p199Hl.C3480e;
import p199Hl.C3501z;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p273Kl.C4727J0;
import p341Ni.C5772b0;
import p387Pl.AbstractC6468O;
import p387Pl.AbstractC6470Q;
import p387Pl.EnumC6462I;
import p387Pl.EnumC6464K;
import p533Vl.C8398j;
import p533Vl.C8399k;
import p594Y9.AbstractC9873d3;
import p658b5.C11248s;
import p793ho.EnumC14809p2;
import p909nm.AbstractC17659D;
import p909nm.C17689w;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Nl.C */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5821C {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ InterfaceC3776x[] f18993u;

    /* JADX INFO: renamed from: a */
    public String f18994a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0563B f18995b;

    /* JADX INFO: renamed from: c */
    public C2925c f18996c;

    /* JADX INFO: renamed from: d */
    public final C11248s f18997d;

    /* JADX INFO: renamed from: e */
    public final C11248s f18998e;

    /* JADX INFO: renamed from: f */
    public final C8398j f18999f;

    /* JADX INFO: renamed from: g */
    public final C8398j f19000g;

    /* JADX INFO: renamed from: h */
    public final C8398j f19001h;

    /* JADX INFO: renamed from: i */
    public final C8398j f19002i;

    /* JADX INFO: renamed from: j */
    public final C8398j f19003j;

    /* JADX INFO: renamed from: k */
    public final C8398j f19004k;

    /* JADX INFO: renamed from: l */
    public final C8398j f19005l;

    /* JADX INFO: renamed from: m */
    public final C8398j f19006m;

    /* JADX INFO: renamed from: n */
    public final C8398j f19007n;

    /* JADX INFO: renamed from: o */
    public final C8398j f19008o;

    /* JADX INFO: renamed from: p */
    public final C8398j f19009p;

    /* JADX INFO: renamed from: q */
    public C4727J0 f19010q;

    /* JADX INFO: renamed from: r */
    public final C8398j f19011r;

    /* JADX INFO: renamed from: s */
    public final C8399k f19012s;

    /* JADX INFO: renamed from: t */
    public final C8399k f19013t;

    static {
        C16549q c16549q = new C16549q(AbstractC5821C.class, "participantInfo", "getParticipantInfo()Llivekit/LivekitModels$ParticipantInfo;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f18993u = new InterfaceC3776x[]{c16527d.mo5697f(c16549q), AbstractC0168G.m528q(AbstractC5821C.class, "identity", "getIdentity-4WamZwg()Ljava/lang/String;", 0, c16527d), AbstractC0168G.m528q(AbstractC5821C.class, "audioLevel", "getAudioLevel()F", 0, c16527d), AbstractC0168G.m528q(AbstractC5821C.class, "isSpeaking", "isSpeaking()Z", 0, c16527d), AbstractC0168G.m528q(AbstractC5821C.class, DiagnosticsEntry.NAME_KEY, "getName()Ljava/lang/String;", 0, c16527d), AbstractC0168G.m528q(AbstractC5821C.class, "metadata", "getMetadata()Ljava/lang/String;", 0, c16527d), AbstractC0168G.m528q(AbstractC5821C.class, "attributes", "getAttributes()Ljava/util/Map;", 0, c16527d), AbstractC0168G.m528q(AbstractC5821C.class, "permissions", "getPermissions()Lio/livekit/android/room/participant/ParticipantPermission;", 0, c16527d), AbstractC0168G.m528q(AbstractC5821C.class, "connectionQuality", "getConnectionQuality()Lio/livekit/android/room/participant/ConnectionQuality;", 0, c16527d), AbstractC0168G.m528q(AbstractC5821C.class, "lastSpokeAt", "getLastSpokeAt()Ljava/lang/Long;", 0, c16527d), AbstractC0168G.m528q(AbstractC5821C.class, "kind", "getKind()Lio/livekit/android/room/participant/Participant$Kind;", 0, c16527d), AbstractC0168G.m528q(AbstractC5821C.class, "trackPublications", "getTrackPublications()Ljava/util/Map;", 0, c16527d), AbstractC3794B0.m4493r(AbstractC5821C.class, "audioTrackPublications", "getAudioTrackPublications()Ljava/util/List;", 0, c16527d), AbstractC3794B0.m4493r(AbstractC5821C.class, "videoTrackPublications", "getVideoTrackPublications()Ljava/util/List;", 0, c16527d)};
    }

    public AbstractC5821C(String str, String str2, AbstractC0563B coroutineDispatcher) {
        AbstractC16544l.m18094g(coroutineDispatcher, "coroutineDispatcher");
        this.f18994a = str;
        this.f18995b = coroutineDispatcher;
        C2925c c2925cM1174c = AbstractC0575H.m1174c(coroutineDispatcher.plus(AbstractC0575H.m1176e()));
        this.f18996c = AbstractC0575H.m1174c(coroutineDispatcher.plus(AbstractC0575H.m1176e()));
        C11248s c11248s = new C11248s(6);
        this.f18997d = c11248s;
        this.f18998e = c11248s;
        InterfaceC18770c interfaceC18770c = null;
        this.f18999f = AbstractC9873d3.m10527a(null, null);
        this.f19000g = AbstractC9873d3.m10527a(str2 != null ? new C5846r(str2) : null, null);
        this.f19001h = AbstractC9873d3.m10527a(Float.valueOf(0.0f), null);
        this.f19002i = AbstractC9873d3.m10527a(Boolean.FALSE, new C5850v(this, 1));
        this.f19003j = AbstractC9873d3.m10527a(null, new C5850v(this, 3));
        this.f19004k = AbstractC9873d3.m10527a(null, new C5850v(this, 2));
        C17690x c17690x = C17690x.f56481Y;
        this.f19005l = AbstractC9873d3.m10527a(c17690x, new C5850v(this, 0));
        this.f19006m = AbstractC9873d3.m10527a(null, new C5850v(this, 4));
        this.f19007n = AbstractC9873d3.m10527a(EnumC5835g.f19062p0, null);
        this.f19008o = AbstractC9873d3.m10527a(null, null);
        this.f19009p = AbstractC9873d3.m10527a(EnumC5848t.f19136r0, null);
        this.f19011r = AbstractC9873d3.m10527a(c17690x, null);
        int i10 = 3;
        C2604o c2604oM3201E = AbstractC2124C.m3201E(new C2499c1(AbstractC9873d3.m10529c(new C2502d1(0, 7, AbstractC5821C.class, this, "trackPublications", "getTrackPublications()Ljava/util/Map;")), 5), new C5772b0(i10, interfaceC18770c, 3));
        C2137I0 c2137i0 = C2133G0.f6536a;
        C17689w c17689w = C17689w.f56480Y;
        this.f19012s = new C8399k(AbstractC2124C.m3198B(c2604oM3201E, c2925cM1174c, c2137i0, c17689w));
        this.f19013t = new C8399k(AbstractC2124C.m3198B(AbstractC2124C.m3201E(new C2499c1(AbstractC9873d3.m10529c(new C2502d1(0, 8, AbstractC5821C.class, this, "trackPublications", "getTrackPublications()Ljava/util/Map;")), 6), new C5772b0(i10, interfaceC18770c, 3)), c2925cM1174c, c2137i0, c17689w));
    }

    /* JADX INFO: renamed from: a */
    public final void m6217a(AbstractC6470Q abstractC6470Q) {
        AbstractC6468O abstractC6468OM7055c = abstractC6470Q.m7055c();
        if (abstractC6468OM7055c != null) {
            abstractC6468OM7055c.f20986e = abstractC6470Q.f20992c;
        }
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(m6220d());
        linkedHashMapM19256r.put(abstractC6470Q.f20992c, abstractC6470Q);
        m6225i(linkedHashMapM19256r);
    }

    /* JADX INFO: renamed from: b */
    public final String m6218b() {
        C5846r c5846r = (C5846r) this.f19000g.m8943c(f18993u[1]);
        if (c5846r != null) {
            return c5846r.f19130a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC6470Q mo6219c(EnumC6464K source) {
        AbstractC16544l.m18094g(source, "source");
        if (source == EnumC6464K.f20972p0) {
            return null;
        }
        Iterator it = m6220d().entrySet().iterator();
        while (it.hasNext()) {
            AbstractC6470Q abstractC6470Q = (AbstractC6470Q) ((Map.Entry) it.next()).getValue();
            EnumC6464K enumC6464K = abstractC6470Q.f20996g;
            if (enumC6464K == source) {
                return abstractC6470Q;
            }
            if (enumC6464K == EnumC6464K.f20972p0) {
                if (source == EnumC6464K.f20970Z && abstractC6470Q.f20993d == EnumC6462I.AUDIO) {
                    return abstractC6470Q;
                }
                if (source == EnumC6464K.f20969Y && abstractC6470Q.f20993d == EnumC6462I.VIDEO && !AbstractC16544l.m18089b(abstractC6470Q.f20991b, "screen")) {
                    return abstractC6470Q;
                }
                if (source == EnumC6464K.f20971o0 && abstractC6470Q.f20993d == EnumC6462I.VIDEO && AbstractC16544l.m18089b(abstractC6470Q.f20991b, "screen")) {
                    return abstractC6470Q;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Map m6220d() {
        return (Map) this.f19011r.m8943c(f18993u[11]);
    }

    /* JADX INFO: renamed from: e */
    public final void m6221e(AbstractC6470Q abstractC6470Q) {
        C4727J0 c4727j0 = this.f19010q;
        if (c4727j0 != null) {
            C3501z c3501z = new C3501z(c4727j0);
            C2925c c2925c = c4727j0.f15388m;
            if (c2925c == null) {
                AbstractC16544l.m18103p("coroutineScope");
                throw null;
            }
            c4727j0.f15389n.m12669r(c3501z, c2925c);
        }
        this.f18997d.m12669r(new C3480e(this), this.f18996c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type io.livekit.android.room.participant.Participant");
        return AbstractC16544l.m18089b(this.f18994a, ((AbstractC5821C) obj).f18994a);
    }

    /* JADX INFO: renamed from: f */
    public final void m6222f(AbstractC6470Q abstractC6470Q) {
        C4727J0 c4727j0 = this.f19010q;
        if (c4727j0 != null) {
            C3467C c3467c = new C3467C(c4727j0);
            C2925c c2925c = c4727j0.f15388m;
            if (c2925c == null) {
                AbstractC16544l.m18103p("coroutineScope");
                throw null;
            }
            c4727j0.f15389n.m12669r(c3467c, c2925c);
        }
        this.f18997d.m12669r(new C3480e(this), this.f18996c);
    }

    /* JADX INFO: renamed from: g */
    public final void m6223g(float f10) {
        InterfaceC3776x interfaceC3776x = f18993u[2];
        this.f19001h.m8944g(Float.valueOf(f10), interfaceC3776x);
    }

    /* JADX INFO: renamed from: h */
    public final void m6224h(boolean z6) {
        InterfaceC3776x interfaceC3776x = f18993u[3];
        this.f19002i.m8944g(Boolean.valueOf(z6), interfaceC3776x);
    }

    public final int hashCode() {
        return this.f18994a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m6225i(LinkedHashMap linkedHashMap) {
        this.f19011r.m8944g(linkedHashMap, f18993u[11]);
    }

    /* JADX INFO: renamed from: j */
    public void mo6226j(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        EnumC5848t enumC5848t;
        String sid = livekitModels$ParticipantInfo.getSid();
        AbstractC16544l.m18093f(sid, "getSid(...)");
        this.f18994a = sid;
        String identity = livekitModels$ParticipantInfo.getIdentity();
        AbstractC16544l.m18093f(identity, "getIdentity(...)");
        InterfaceC3776x[] interfaceC3776xArr = f18993u;
        InterfaceC3776x interfaceC3776x = interfaceC3776xArr[1];
        this.f19000g.m8944g(new C5846r(identity), interfaceC3776x);
        this.f18999f.m8944g(livekitModels$ParticipantInfo, interfaceC3776xArr[0]);
        this.f19004k.m8944g(livekitModels$ParticipantInfo.getMetadata(), interfaceC3776xArr[5]);
        this.f19003j.m8944g(livekitModels$ParticipantInfo.getName(), interfaceC3776xArr[4]);
        C5847s c5847s = EnumC5848t.Companion;
        EnumC14809p2 kind = livekitModels$ParticipantInfo.getKind();
        AbstractC16544l.m18093f(kind, "getKind(...)");
        c5847s.getClass();
        int iOrdinal = kind.ordinal();
        if (iOrdinal == 0) {
            enumC5848t = EnumC5848t.f19132Z;
        } else if (iOrdinal == 1) {
            enumC5848t = EnumC5848t.f19133o0;
        } else if (iOrdinal == 2) {
            enumC5848t = EnumC5848t.f19134p0;
        } else if (iOrdinal == 3) {
            enumC5848t = EnumC5848t.f19135q0;
        } else if (iOrdinal == 4) {
            enumC5848t = EnumC5848t.f19131Y;
        } else {
            if (iOrdinal != 5) {
                throw new C0644w();
            }
            enumC5848t = EnumC5848t.f19136r0;
        }
        this.f19009p.m8944g(enumC5848t, interfaceC3776xArr[10]);
        if (livekitModels$ParticipantInfo.hasPermission()) {
            C5822D c5822d = C5823E.Companion;
            LivekitModels$ParticipantPermission permission = livekitModels$ParticipantInfo.getPermission();
            AbstractC16544l.m18093f(permission, "getPermission(...)");
            c5822d.getClass();
            this.f19006m.m8944g(new C5823E(permission.getCanPublish(), permission.getCanSubscribe(), permission.getCanPublishData(), permission.getHidden(), permission.getRecorder()), interfaceC3776xArr[7]);
        }
        Map<String, String> attributesMap = livekitModels$ParticipantInfo.getAttributesMap();
        AbstractC16544l.m18093f(attributesMap, "getAttributesMap(...)");
        this.f19005l.m8944g(attributesMap, interfaceC3776xArr[6]);
    }
}
