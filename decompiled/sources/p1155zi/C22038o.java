package p1155zi;

import ao.AbstractC11153a0;
import ao.C11158d;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p138F8.vJO.anhfj;
import p559Wn.InterfaceC8975g;
import p909nm.C17691y;

/* JADX INFO: renamed from: zi.o */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22038o {
    public static final C22022k Companion = new C22022k();

    /* JADX INFO: renamed from: l */
    public static final KSerializer[] f69704l = {null, null, null, null, null, EnumC22034n.Companion.serializer(), new C11158d(AbstractC11153a0.m12383f("com.openai.types.Account.Feature", EnumC22026l.values()), 2), EnumC21905D1.Companion.serializer(), null, null, AbstractC22014i.Companion.serializer()};

    /* JADX INFO: renamed from: m */
    public static final C22038o f69705m;

    /* JADX INFO: renamed from: n */
    public static final C22038o f69706n;

    /* JADX INFO: renamed from: o */
    public static final C22038o f69707o;

    /* JADX INFO: renamed from: p */
    public static final C22038o f69708p;

    /* JADX INFO: renamed from: q */
    public static final C22038o f69709q;

    /* JADX INFO: renamed from: r */
    public static final C22038o f69710r;

    /* JADX INFO: renamed from: a */
    public final String f69711a;

    /* JADX INFO: renamed from: b */
    public final String f69712b;

    /* JADX INFO: renamed from: c */
    public final String f69713c;

    /* JADX INFO: renamed from: d */
    public final C21975X1 f69714d;

    /* JADX INFO: renamed from: e */
    public final String f69715e;

    /* JADX INFO: renamed from: f */
    public final EnumC22034n f69716f;

    /* JADX INFO: renamed from: g */
    public final Set f69717g;

    /* JADX INFO: renamed from: h */
    public final EnumC21905D1 f69718h;

    /* JADX INFO: renamed from: i */
    public final boolean f69719i;

    /* JADX INFO: renamed from: j */
    public final String f69720j;

    /* JADX INFO: renamed from: k */
    public final AbstractC22014i f69721k;

    static {
        C21975X1.Companion.getClass();
        f69705m = new C22038o("fake_plus_account", C21975X1.f69568g, null, null, EnumC21905D1.PLUS, false, null, 1910);
        f69706n = new C22038o("fake_free_account", null, null, null, EnumC21905D1.FREE, false, null, 1910);
        C21975X1 c21975x1 = C21975X1.f69570i;
        EnumC22034n enumC22034n = EnumC22034n.f69699o0;
        f69707o = new C22038o(VjclRfeKsMflo.zuVl, c21975x1, "Acme Co", enumC22034n, EnumC21905D1.ENTERPRISE, false, null, 1862);
        C21975X1 c21975x2 = C21975X1.f69569h;
        EnumC21905D1 enumC21905D1 = EnumC21905D1.TEAM;
        f69708p = new C22038o("fake_team_account_1", c21975x2, "Terran", enumC22034n, enumC21905D1, false, null, 1862);
        f69709q = new C22038o("fake_team_account_2", c21975x2, "Zerg", enumC22034n, enumC21905D1, true, null, 1606);
        f69710r = new C22038o("fake_team_account_3", c21975x2, anhfj.vORXRjXfg, enumC22034n, enumC21905D1, false, new C22010h("fake_sso", false), 838);
    }

    public C22038o(String accountId, String str, String str2, C21975X1 c21975x1, String str3, EnumC22034n structure, Set features, EnumC21905D1 enumC21905D1, boolean z6, String str4, AbstractC22014i accessInfo) {
        AbstractC16544l.m18094g(accountId, "accountId");
        AbstractC16544l.m18094g(structure, "structure");
        AbstractC16544l.m18094g(features, "features");
        AbstractC16544l.m18094g(accessInfo, "accessInfo");
        this.f69711a = accountId;
        this.f69712b = str;
        this.f69713c = str2;
        this.f69714d = c21975x1;
        this.f69715e = str3;
        this.f69716f = structure;
        this.f69717g = features;
        this.f69718h = enumC21905D1;
        this.f69719i = z6;
        this.f69720j = str4;
        this.f69721k = accessInfo;
    }

    /* JADX INFO: renamed from: a */
    public final C21975X1 m22344a() {
        C21975X1 c21975x1 = this.f69714d;
        if (c21975x1 == null || !c21975x1.f69575e) {
            return null;
        }
        return c21975x1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22345b() {
        EnumC21905D1 enumC21905D1;
        if (!m22346c() && ((enumC21905D1 = this.f69718h) == null || enumC21905D1 == EnumC21905D1.FREE)) {
            if (m22344a() != null) {
                C21975X1 c21975x1M22344a = m22344a();
                if ((c21975x1M22344a != null ? c21975x1M22344a.f69571a : null) != EnumC21981Z1.f69581o0) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22346c() {
        return this.f69716f == EnumC22034n.f69699o0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22038o)) {
            return false;
        }
        C22038o c22038o = (C22038o) obj;
        if (!AbstractC16544l.m18089b(this.f69711a, c22038o.f69711a)) {
            return false;
        }
        String str = this.f69712b;
        String str2 = c22038o.f69712b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f69713c, c22038o.f69713c) && AbstractC16544l.m18089b(this.f69714d, c22038o.f69714d) && AbstractC16544l.m18089b(this.f69715e, c22038o.f69715e) && this.f69716f == c22038o.f69716f && AbstractC16544l.m18089b(this.f69717g, c22038o.f69717g) && this.f69718h == c22038o.f69718h && this.f69719i == c22038o.f69719i && AbstractC16544l.m18089b(this.f69720j, c22038o.f69720j) && AbstractC16544l.m18089b(this.f69721k, c22038o.f69721k);
    }

    public final int hashCode() {
        int iHashCode = this.f69711a.hashCode() * 31;
        String str = this.f69712b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69713c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C21975X1 c21975x1 = this.f69714d;
        int iHashCode4 = (iHashCode3 + (c21975x1 == null ? 0 : c21975x1.hashCode())) * 31;
        String str3 = this.f69715e;
        int iHashCode5 = (this.f69717g.hashCode() + ((this.f69716f.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        EnumC21905D1 enumC21905D1 = this.f69718h;
        int iHashCode6 = (((iHashCode5 + (enumC21905D1 == null ? 0 : enumC21905D1.hashCode())) * 31) + (this.f69719i ? 1231 : 1237)) * 31;
        String str4 = this.f69720j;
        return this.f69721k.hashCode() + ((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C22038o(int i10, String str, String str2, String str3, C21975X1 c21975x1, String str4, EnumC22034n enumC22034n, Set set, EnumC21905D1 enumC21905D1, boolean z6, String str5, AbstractC22014i abstractC22014i) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C22018j.f69664a.getDescriptor());
            throw null;
        }
        this.f69711a = str;
        if ((i10 & 2) == 0) {
            this.f69712b = null;
        } else {
            this.f69712b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f69713c = null;
        } else {
            this.f69713c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f69714d = null;
        } else {
            this.f69714d = c21975x1;
        }
        if ((i10 & 16) == 0) {
            this.f69715e = null;
        } else {
            this.f69715e = str4;
        }
        if ((i10 & 32) == 0) {
            this.f69716f = EnumC22034n.f69698Z;
        } else {
            this.f69716f = enumC22034n;
        }
        if ((i10 & 64) == 0) {
            this.f69717g = C17691y.f56482Y;
        } else {
            this.f69717g = set;
        }
        if ((i10 & 128) == 0) {
            this.f69718h = null;
        } else {
            this.f69718h = enumC21905D1;
        }
        if ((i10 & 256) == 0) {
            this.f69719i = false;
        } else {
            this.f69719i = z6;
        }
        if ((i10 & 512) == 0) {
            this.f69720j = null;
        } else {
            this.f69720j = str5;
        }
        if ((i10 & 1024) == 0) {
            this.f69721k = new C21998e(true);
        } else {
            this.f69721k = abstractC22014i;
        }
    }

    public /* synthetic */ C22038o(String str, C21975X1 c21975x1, String str2, EnumC22034n enumC22034n, EnumC21905D1 enumC21905D1, boolean z6, C22010h c22010h, int i10) {
        this(str, null, null, c21975x1, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? EnumC22034n.f69698Z : enumC22034n, C17691y.f56482Y, enumC21905D1, (i10 & 256) != 0 ? false : z6, null, (i10 & 1024) != 0 ? new C21998e(true) : c22010h);
    }
}
