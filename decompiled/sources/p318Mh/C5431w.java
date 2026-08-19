package p318Mh;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p017Af.C0491v;
import p1143z4.AbstractC21767I;
import p1143z4.C21761C;
import p1155zi.C21936L0;
import p1155zi.C21966U1;
import p1155zi.C22007g0;
import p1155zi.C22011h0;
import p1155zi.C22020j1;
import p228J.AbstractC3812N;
import p229J0.C4165y3;
import p340Nh.C5743a;
import p544W9.AbstractC8477F3;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Mh.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C5431w extends AbstractC5395e {

    /* JADX INFO: renamed from: g */
    public static final C5431w f17746g = new C5431w("conversation");

    /* JADX INFO: renamed from: h */
    public static final C5370J0 f17747h;

    /* JADX INFO: renamed from: i */
    public static final C5370J0 f17748i;

    /* JADX INFO: renamed from: j */
    public static final C5370J0 f17749j;

    /* JADX INFO: renamed from: k */
    public static final C5370J0 f17750k;

    /* JADX INFO: renamed from: l */
    public static final C5370J0 f17751l;

    /* JADX INFO: renamed from: m */
    public static final C5370J0 f17752m;

    /* JADX INFO: renamed from: n */
    public static final C5370J0 f17753n;

    /* JADX INFO: renamed from: o */
    public static final C5370J0 f17754o;

    /* JADX INFO: renamed from: p */
    public static final C5370J0 f17755p;

    /* JADX INFO: renamed from: q */
    public static final C5370J0 f17756q;

    /* JADX INFO: renamed from: r */
    public static final C5370J0 f17757r;

    /* JADX INFO: renamed from: s */
    public static final C5370J0 f17758s;

    /* JADX INFO: renamed from: t */
    public static final C5370J0 f17759t;

    /* JADX INFO: renamed from: u */
    public static final List f17760u;

    /* JADX INFO: renamed from: v */
    public static final C5415o f17761v;

    static {
        C22007g0 c22007g0 = C22011h0.Companion;
        C5370J0 c5370j0M9116f = AbstractC8477F3.m9116f(ParameterNames.f31999ID, c22007g0.serializer());
        f17747h = c5370j0M9116f;
        C5370J0 c5370j0M9111a = AbstractC8477F3.m9111a(EnumC5368I0.f17609Z);
        f17748i = c5370j0M9111a;
        C5370J0 c5370j0M9116f2 = AbstractC8477F3.m9116f("remoteId", c22007g0.serializer());
        f17749j = c5370j0M9116f2;
        C5370J0 c5370j0M9116f3 = AbstractC8477F3.m9116f(FpwNpGDhomXHZ.KDCYOxGjBhinHV, C21966U1.Companion.serializer());
        f17750k = c5370j0M9116f3;
        C5370J0 c5370j0M9116f4 = AbstractC8477F3.m9116f("gizmoId", C21936L0.Companion.serializer());
        f17751l = c5370j0M9116f4;
        C21761C c21761c = AbstractC21767I.f69048j;
        C5370J0 c5370j0 = new C5370J0("gizmoType", c21761c, false, null);
        f17752m = c5370j0;
        C5370J0 c5370j0M9116f5 = AbstractC8477F3.m9116f("model", C22020j1.Companion.serializer());
        f17753n = c5370j0M9116f5;
        Boolean bool = Boolean.FALSE;
        C21761C c21761c2 = AbstractC21767I.f69046h;
        C5370J0 c5370j1 = new C5370J0("temporary", c21761c2, true, bool);
        f17754o = c5370j1;
        C5370J0 c5370j2 = new C5370J0("fromOauth", c21761c2, true, bool);
        f17755p = c5370j2;
        C5370J0 c5370j3 = new C5370J0("fromNewVoicePicker", c21761c2, true, bool);
        f17756q = c5370j3;
        C5370J0 c5370j4 = new C5370J0("q", c21761c, false, null);
        f17757r = c5370j4;
        C5370J0 c5370j0M9117g = AbstractC8477F3.m9117g("mode", EnumC5421r.Companion.serializer(), EnumC5421r.f17714r0);
        f17758s = c5370j0M9117g;
        f17759t = AbstractC8477F3.m9116f("hints", new C5743a(EnumC5425t.Companion.serializer()));
        f17760u = AbstractC17681o.m19382k(c5370j0M9116f, c5370j0M9111a, c5370j0M9116f2, c5370j0M9116f3, c5370j0M9116f4, c5370j0, c5370j0M9116f5, c5370j1, c5370j2, c5370j3, c5370j4, c5370j0M9117g);
        f17761v = C5415o.f17695o0;
    }

    /* JADX INFO: renamed from: e */
    public static String m5901e(C5431w c5431w, String gizmoId, String str, String str2, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        c5431w.getClass();
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        return c5431w.m5885a(new C5429v(gizmoId, str, str2, 0));
    }

    /* JADX INFO: renamed from: f */
    public static String m5902f(C5431w c5431w, EnumC5421r entryPoint, String id2, boolean z6, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            entryPoint = EnumC5421r.f17714r0;
        }
        if ((i10 & 2) != 0) {
            C22011h0.Companion.getClass();
            id2 = C22007g0.m22342a();
        }
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c5431w.getClass();
        AbstractC16544l.m18094g(entryPoint, "entryPoint");
        AbstractC16544l.m18094g(id2, "id");
        return c5431w.m5885a(new C4165y3(id2, entryPoint, z6, z10));
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: b */
    public final AbstractC3812N mo5884b() {
        return f17761v;
    }

    @Override // p318Mh.AbstractC5362F0
    /* JADX INFO: renamed from: c */
    public final List mo5883c() {
        return f17760u;
    }

    /* JADX INFO: renamed from: d */
    public final String m5903d(String remoteId) {
        AbstractC16544l.m18094g(remoteId, "remoteId");
        return m5885a(new C0491v(remoteId, 20));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C5431w);
    }

    public final int hashCode() {
        return 490330881;
    }

    public final String toString() {
        return "█";
    }
}
