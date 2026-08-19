package p575Xd;

import ao.C11131E;
import ao.C11158d;
import ao.C11181o0;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import p1071w0.AbstractC20734X;
import p225Im.InterfaceC3756d;
import p559Wn.C8974f;
import p559Wn.InterfaceC8975g;
import p594Y9.AbstractC9961r4;
import p775h2.AbstractC14376f;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: renamed from: Xd.v */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C9463v {
    public static final C9462u Companion = new C9462u();

    /* JADX INFO: renamed from: h */
    public static final KSerializer[] f28478h;

    /* JADX INFO: renamed from: a */
    public final String f28479a;

    /* JADX INFO: renamed from: b */
    public final String f28480b;

    /* JADX INFO: renamed from: c */
    public final String f28481c;

    /* JADX INFO: renamed from: d */
    public final String f28482d;

    /* JADX INFO: renamed from: e */
    public final List f28483e;

    /* JADX INFO: renamed from: f */
    public final Map f28484f;

    /* JADX INFO: renamed from: g */
    public final List f28485g;

    static {
        C11158d c11158d = new C11158d(C9464w.f28486a, 0);
        C11181o0 c11181o0 = C11181o0.f33827a;
        C11131E c11131e = new C11131E(c11181o0, AbstractC9961r4.m10615b(c11181o0), 1);
        C16527D c16527d = AbstractC16526C.f51263a;
        f28478h = new KSerializer[]{null, null, null, null, c11158d, c11131e, new C11158d(new C8974f("com.openai.feature.conversations.domain.metadata.CustomActionCall.Action", c16527d.mo5693b(InterfaceC9461t.class), new InterfaceC3756d[]{c16527d.mo5693b(C9449h.class), c16527d.mo5693b(C9452k.class), c16527d.mo5693b(C9457p.class), c16527d.mo5693b(C9460s.class)}, new KSerializer[]{C9446e.f28449a, C9450i.f28458a, C9454m.f28463a, C9458q.f28472a}, new Annotation[0]), 0)};
    }

    public /* synthetic */ C9463v(int i10, String str, String str2, String str3, String str4, List list, Map map, List list2) {
        if ((i10 & 1) == 0) {
            this.f28479a = null;
        } else {
            this.f28479a = str;
        }
        if ((i10 & 2) == 0) {
            this.f28480b = null;
        } else {
            this.f28480b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f28481c = null;
        } else {
            this.f28481c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f28482d = null;
        } else {
            this.f28482d = str4;
        }
        int i11 = i10 & 16;
        C17689w c17689w = C17689w.f56480Y;
        if (i11 == 0) {
            this.f28483e = c17689w;
        } else {
            this.f28483e = list;
        }
        if ((i10 & 32) == 0) {
            this.f28484f = C17690x.f56481Y;
        } else {
            this.f28484f = map;
        }
        if ((i10 & 64) == 0) {
            this.f28485g = c17689w;
        } else {
            this.f28485g = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9463v)) {
            return false;
        }
        C9463v c9463v = (C9463v) obj;
        return AbstractC16544l.m18089b(this.f28479a, c9463v.f28479a) && AbstractC16544l.m18089b(this.f28480b, c9463v.f28480b) && AbstractC16544l.m18089b(this.f28481c, c9463v.f28481c) && AbstractC16544l.m18089b(this.f28482d, c9463v.f28482d) && AbstractC16544l.m18089b(this.f28483e, c9463v.f28483e) && AbstractC16544l.m18089b(this.f28484f, c9463v.f28484f) && AbstractC16544l.m18089b(this.f28485g, c9463v.f28485g);
    }

    public final int hashCode() {
        String str = this.f28479a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f28480b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28481c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f28482d;
        return this.f28485g.hashCode() + AbstractC20734X.m21250u(AbstractC14376f.m15858x(this.f28483e, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31, this.f28484f);
    }

    public final String toString() {
        return "█";
    }

    public C9463v(String str, String str2, String str3, String str4, List files, Map params, List actions) {
        AbstractC16544l.m18094g(files, "files");
        AbstractC16544l.m18094g(params, "params");
        AbstractC16544l.m18094g(actions, "actions");
        this.f28479a = str;
        this.f28480b = str2;
        this.f28481c = str3;
        this.f28482d = str4;
        this.f28483e = files;
        this.f28484f = params;
        this.f28485g = actions;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C9463v(int i10, String str, String str2, List list, Map map) {
        String str3 = (i10 & 2) != 0 ? null : str;
        String str4 = (i10 & 8) != 0 ? null : str2;
        C17689w c17689w = C17689w.f56480Y;
        this(null, str3, null, str4, c17689w, (i10 & 32) != 0 ? C17690x.f56481Y : map, (i10 & 64) != 0 ? c17689w : list);
    }
}
