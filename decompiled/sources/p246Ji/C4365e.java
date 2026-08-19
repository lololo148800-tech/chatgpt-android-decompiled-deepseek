package p246Ji;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p098Di.InterfaceC2062k;
import p1071w0.AbstractC20734X;
import p148Fi.EnumC2779N0;
import p172Gi.C3071d;
import p341Ni.InterfaceC5798r;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Ji.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4365e implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f14199a;

    /* JADX INFO: renamed from: b */
    public final String f14200b;

    /* JADX INFO: renamed from: c */
    public final String f14201c;

    /* JADX INFO: renamed from: d */
    public final String f14202d;

    /* JADX INFO: renamed from: e */
    public final String f14203e;

    /* JADX INFO: renamed from: f */
    public final String f14204f;

    /* JADX INFO: renamed from: g */
    public final String f14205g;

    /* JADX INFO: renamed from: h */
    public final EnumC2779N0 f14206h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5798r f14207i;

    /* JADX INFO: renamed from: j */
    public final Map f14208j;

    /* JADX INFO: renamed from: k */
    public final int f14209k;

    /* JADX INFO: renamed from: l */
    public final int f14210l;

    /* JADX INFO: renamed from: m */
    public final String f14211m;

    /* JADX INFO: renamed from: n */
    public final String f14212n;

    /* JADX INFO: renamed from: o */
    public final String f14213o;

    /* JADX INFO: renamed from: p */
    public final String f14214p;

    /* JADX INFO: renamed from: q */
    public final String f14215q;

    /* JADX INFO: renamed from: r */
    public final boolean f14216r;

    /* JADX INFO: renamed from: s */
    public final List f14217s;

    /* JADX INFO: renamed from: t */
    public final List f14218t;

    /* JADX INFO: renamed from: u */
    public final List f14219u;

    /* JADX INFO: renamed from: v */
    public final List f14220v;

    /* JADX INFO: renamed from: w */
    public final C3071d f14221w;

    public C4365e(String roomID, String conversationId, String sessionID, String parentMessageId, String modelSlug, String languageCode, String gizmoId, EnumC2779N0 remoteState, InterfaceC5798r connectionState, Map latency, int i10, int i11, String connectionQuality, String localParticipant, String remoteParticipant, String apiEnvironment, String canary, boolean z6, List stateUpdates, List sentMessages, List metrics, List usageUpdates, C3071d c3071d) {
        AbstractC16544l.m18094g(roomID, "roomID");
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(sessionID, "sessionID");
        AbstractC16544l.m18094g(parentMessageId, "parentMessageId");
        AbstractC16544l.m18094g(modelSlug, "modelSlug");
        AbstractC16544l.m18094g(languageCode, "languageCode");
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        AbstractC16544l.m18094g(remoteState, "remoteState");
        AbstractC16544l.m18094g(connectionState, "connectionState");
        AbstractC16544l.m18094g(latency, "latency");
        AbstractC16544l.m18094g(connectionQuality, "connectionQuality");
        AbstractC16544l.m18094g(localParticipant, "localParticipant");
        AbstractC16544l.m18094g(remoteParticipant, "remoteParticipant");
        AbstractC16544l.m18094g(apiEnvironment, "apiEnvironment");
        AbstractC16544l.m18094g(canary, "canary");
        AbstractC16544l.m18094g(stateUpdates, "stateUpdates");
        AbstractC16544l.m18094g(sentMessages, "sentMessages");
        AbstractC16544l.m18094g(metrics, "metrics");
        AbstractC16544l.m18094g(usageUpdates, "usageUpdates");
        this.f14199a = roomID;
        this.f14200b = conversationId;
        this.f14201c = sessionID;
        this.f14202d = parentMessageId;
        this.f14203e = modelSlug;
        this.f14204f = languageCode;
        this.f14205g = gizmoId;
        this.f14206h = remoteState;
        this.f14207i = connectionState;
        this.f14208j = latency;
        this.f14209k = i10;
        this.f14210l = i11;
        this.f14211m = connectionQuality;
        this.f14212n = localParticipant;
        this.f14213o = remoteParticipant;
        this.f14214p = apiEnvironment;
        this.f14215q = canary;
        this.f14216r = z6;
        this.f14217s = stateUpdates;
        this.f14218t = sentMessages;
        this.f14219u = metrics;
        this.f14220v = usageUpdates;
        this.f14221w = c3071d;
    }

    /* JADX INFO: renamed from: e */
    public static C4365e m5168e(C4365e c4365e, String str, String str2, String str3, String str4, String str5, String str6, String str7, EnumC2779N0 enumC2779N0, InterfaceC5798r interfaceC5798r, LinkedHashMap linkedHashMap, String str8, String str9, String str10, String str11, String str12, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C3071d c3071d, int i10) {
        String roomID = (i10 & 1) != 0 ? c4365e.f14199a : str;
        String conversationId = (i10 & 2) != 0 ? c4365e.f14200b : str2;
        String sessionID = (i10 & 4) != 0 ? c4365e.f14201c : str3;
        String parentMessageId = (i10 & 8) != 0 ? c4365e.f14202d : str4;
        String modelSlug = (i10 & 16) != 0 ? c4365e.f14203e : str5;
        String languageCode = (i10 & 32) != 0 ? c4365e.f14204f : str6;
        String gizmoId = (i10 & 64) != 0 ? c4365e.f14205g : str7;
        EnumC2779N0 remoteState = (i10 & 128) != 0 ? c4365e.f14206h : enumC2779N0;
        InterfaceC5798r connectionState = (i10 & 256) != 0 ? c4365e.f14207i : interfaceC5798r;
        Map latency = (i10 & 512) != 0 ? c4365e.f14208j : linkedHashMap;
        int i11 = c4365e.f14209k;
        int i12 = c4365e.f14210l;
        String connectionQuality = (i10 & 4096) != 0 ? c4365e.f14211m : str8;
        String localParticipant = (i10 & 8192) != 0 ? c4365e.f14212n : str9;
        String remoteParticipant = (i10 & 16384) != 0 ? c4365e.f14213o : str10;
        String str13 = (i10 & 32768) != 0 ? c4365e.f14214p : str11;
        String str14 = (i10 & 65536) != 0 ? c4365e.f14215q : str12;
        boolean z6 = c4365e.f14216r;
        List list = (i10 & 262144) != 0 ? c4365e.f14217s : arrayList;
        List list2 = (i10 & 524288) != 0 ? c4365e.f14218t : arrayList2;
        List list3 = (i10 & 1048576) != 0 ? c4365e.f14219u : arrayList3;
        List usageUpdates = (i10 & 2097152) != 0 ? c4365e.f14220v : arrayList4;
        C3071d c3071d2 = (i10 & 4194304) != 0 ? c4365e.f14221w : c3071d;
        c4365e.getClass();
        AbstractC16544l.m18094g(roomID, "roomID");
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(sessionID, "sessionID");
        AbstractC16544l.m18094g(parentMessageId, "parentMessageId");
        AbstractC16544l.m18094g(modelSlug, "modelSlug");
        AbstractC16544l.m18094g(languageCode, "languageCode");
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        AbstractC16544l.m18094g(remoteState, "remoteState");
        AbstractC16544l.m18094g(connectionState, "connectionState");
        AbstractC16544l.m18094g(latency, "latency");
        AbstractC16544l.m18094g(connectionQuality, "connectionQuality");
        AbstractC16544l.m18094g(localParticipant, "localParticipant");
        AbstractC16544l.m18094g(remoteParticipant, "remoteParticipant");
        Object apiEnvironment = str13;
        AbstractC16544l.m18094g(apiEnvironment, "apiEnvironment");
        String canary = str14;
        AbstractC16544l.m18094g(canary, "canary");
        Object stateUpdates = list;
        AbstractC16544l.m18094g(stateUpdates, "stateUpdates");
        Object sentMessages = list2;
        AbstractC16544l.m18094g(sentMessages, "sentMessages");
        List metrics = list3;
        AbstractC16544l.m18094g(metrics, "metrics");
        AbstractC16544l.m18094g(usageUpdates, "usageUpdates");
        return new C4365e(roomID, conversationId, sessionID, parentMessageId, modelSlug, languageCode, gizmoId, remoteState, connectionState, latency, i11, i12, connectionQuality, localParticipant, remoteParticipant, str13, str14, z6, list, list2, metrics, usageUpdates, c3071d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4365e)) {
            return false;
        }
        C4365e c4365e = (C4365e) obj;
        return AbstractC16544l.m18089b(this.f14199a, c4365e.f14199a) && AbstractC16544l.m18089b(this.f14200b, c4365e.f14200b) && AbstractC16544l.m18089b(this.f14201c, c4365e.f14201c) && AbstractC16544l.m18089b(this.f14202d, c4365e.f14202d) && AbstractC16544l.m18089b(this.f14203e, c4365e.f14203e) && AbstractC16544l.m18089b(this.f14204f, c4365e.f14204f) && AbstractC16544l.m18089b(this.f14205g, c4365e.f14205g) && this.f14206h == c4365e.f14206h && AbstractC16544l.m18089b(this.f14207i, c4365e.f14207i) && AbstractC16544l.m18089b(this.f14208j, c4365e.f14208j) && this.f14209k == c4365e.f14209k && this.f14210l == c4365e.f14210l && AbstractC16544l.m18089b(this.f14211m, c4365e.f14211m) && AbstractC16544l.m18089b(this.f14212n, c4365e.f14212n) && AbstractC16544l.m18089b(this.f14213o, c4365e.f14213o) && AbstractC16544l.m18089b(this.f14214p, c4365e.f14214p) && AbstractC16544l.m18089b(this.f14215q, c4365e.f14215q) && this.f14216r == c4365e.f14216r && AbstractC16544l.m18089b(this.f14217s, c4365e.f14217s) && AbstractC16544l.m18089b(this.f14218t, c4365e.f14218t) && AbstractC16544l.m18089b(this.f14219u, c4365e.f14219u) && AbstractC16544l.m18089b(this.f14220v, c4365e.f14220v) && AbstractC16544l.m18089b(this.f14221w, c4365e.f14221w);
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f14220v, AbstractC14376f.m15858x(this.f14219u, AbstractC14376f.m15858x(this.f14218t, AbstractC14376f.m15858x(this.f14217s, (AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p((((AbstractC20734X.m21250u((this.f14207i.hashCode() + ((this.f14206h.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f14199a.hashCode() * 31, 31, this.f14200b), 31, this.f14201c), 31, this.f14202d), 31, this.f14203e), 31, this.f14204f), 31, this.f14205g)) * 31)) * 31, 31, this.f14208j) + this.f14209k) * 31) + this.f14210l) * 31, 31, this.f14211m), 31, this.f14212n), 31, this.f14213o), 31, this.f14214p), 31, this.f14215q) + (this.f14216r ? 1231 : 1237)) * 31, 31), 31), 31), 31);
        C3071d c3071d = this.f14221w;
        return iM15858x + (c3071d == null ? 0 : c3071d.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
