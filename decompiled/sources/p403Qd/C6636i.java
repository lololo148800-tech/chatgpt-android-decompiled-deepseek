package p403Qd;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11158d;
import ao.C11181o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17309l;
import p067Cd.C1630d;
import p1071w0.AbstractC20734X;
import p1081wc.C20857C;
import p1091wn.AbstractC21031l;
import p1091wn.C21036q;
import p1113xn.AbstractC21322p;
import p1135yn.C21555b;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p1155zi.C22011h0;
import p1155zi.C22020j1;
import p138F8.vJO.anhfj;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p381Pe.C6394e;
import p381Pe.C6397h;
import p479Td.C7351f0;
import p523V9.AbstractC8223w5;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9286f4;
import p571X9.AbstractC9393x3;
import p575Xd.C9436E;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: renamed from: Qd.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6636i {
    public static final C6628e Companion = new C6628e();

    /* JADX INFO: renamed from: w */
    public static final KSerializer[] f21378w = {null, null, null, null, null, null, new C11131E(C21977Y0.f69577a, C1630d.f4620a, 1), null, null, null, null, null, new C11158d(C11181o0.f33827a, 0), null, EnumC6624c.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final String f21379a;

    /* JADX INFO: renamed from: b */
    public final String f21380b;

    /* JADX INFO: renamed from: c */
    public final C5551u f21381c;

    /* JADX INFO: renamed from: d */
    public final C5551u f21382d;

    /* JADX INFO: renamed from: e */
    public final String f21383e;

    /* JADX INFO: renamed from: f */
    public final String f21384f;

    /* JADX INFO: renamed from: g */
    public final Map f21385g;

    /* JADX INFO: renamed from: h */
    public final C9436E f21386h;

    /* JADX INFO: renamed from: i */
    public final String f21387i;

    /* JADX INFO: renamed from: j */
    public final String f21388j;

    /* JADX INFO: renamed from: k */
    public final String f21389k;

    /* JADX INFO: renamed from: l */
    public final String f21390l;

    /* JADX INFO: renamed from: m */
    public final List f21391m;

    /* JADX INFO: renamed from: n */
    public final String f21392n;

    /* JADX INFO: renamed from: o */
    public final EnumC6624c f21393o;

    /* JADX INFO: renamed from: p */
    public final String f21394p;

    /* JADX INFO: renamed from: q */
    public final List f21395q;

    /* JADX INFO: renamed from: r */
    public final EnumC6603I f21396r;

    /* JADX INFO: renamed from: s */
    public final boolean f21397s;

    /* JADX INFO: renamed from: t */
    public final C6657s0 f21398t;

    /* JADX INFO: renamed from: u */
    public final C6394e f21399u;

    /* JADX INFO: renamed from: v */
    public final boolean f21400v;

    public C6636i(String id2, String str, C5551u c5551u, C5551u modificationDate, String str2, String str3, Map moderationResults, C9436E safeUrlMap, String str4, String str5, String str6, String str7, List list, String str8, EnumC6624c enumC6624c, String str9, List uiElements, EnumC6603I messageLoadingStatus, boolean z6, C6657s0 c6657s0, C6394e messageTree) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(modificationDate, "modificationDate");
        AbstractC16544l.m18094g(moderationResults, "moderationResults");
        AbstractC16544l.m18094g(safeUrlMap, "safeUrlMap");
        AbstractC16544l.m18094g(uiElements, "uiElements");
        AbstractC16544l.m18094g(messageLoadingStatus, "messageLoadingStatus");
        AbstractC16544l.m18094g(messageTree, "messageTree");
        this.f21379a = id2;
        this.f21380b = str;
        this.f21381c = c5551u;
        this.f21382d = modificationDate;
        this.f21383e = str2;
        this.f21384f = str3;
        this.f21385g = moderationResults;
        this.f21386h = safeUrlMap;
        this.f21387i = str4;
        this.f21388j = str5;
        this.f21389k = str6;
        this.f21390l = str7;
        this.f21391m = list;
        this.f21392n = str8;
        this.f21393o = enumC6624c;
        this.f21394p = str9;
        this.f21395q = uiElements;
        this.f21396r = messageLoadingStatus;
        this.f21397s = z6;
        this.f21398t = c6657s0;
        this.f21399u = messageTree;
        int i10 = messageTree.f20815c;
        if (i10 > 1000) {
            AbstractC8223w5.m8851c().mo21447a(C20857C.f66335q, AbstractC17659D.m19244f(new C17309l(ParameterNames.f31999ID, new C22011h0(id2)), new C17309l("size", Integer.valueOf(i10))));
        }
        this.f21400v = (str3 == null || AbstractC21322p.m21681O(str3) || str3.equals("New chat")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final C6636i m7163b(C7351f0 c7351f0, String str) {
        C21984a1 c21984a1 = new C21984a1(c7351f0.f23286a);
        C6394e c6394e = this.f21399u;
        c6394e.getClass();
        Map map = c6394e.f20814b;
        C6397h c6397h = (C6397h) map.get(c21984a1);
        if (c6397h != null) {
            return m7162a(this, null, str, null, null, null, null, null, null, null, null, null, null, false, null, new C6394e(AbstractC17659D.m19249k(map, new C17309l(c21984a1, C6397h.m7033a(c6397h, null, null, null, c7351f0, 7))), c6394e.f20813a), 1048573);
        }
        throw new IllegalArgumentException("Node " + c21984a1 + " not found");
    }

    /* JADX INFO: renamed from: c */
    public final C6397h m7164c() {
        String str = this.f21383e;
        C21984a1 c21984a1 = str != null ? new C21984a1(str) : null;
        C6394e c6394e = this.f21399u;
        C6397h c6397hM7031g = c6394e.m7031g(c21984a1);
        return c6397hM7031g == null ? (C6397h) AbstractC17680n.m19351a0(c6394e.m7028c(c6394e.f20813a)) : c6397hM7031g;
    }

    /* JADX INFO: renamed from: d */
    public final C5551u m7165d() {
        C5551u c5551u = ((C7351f0) m7164c().f20822d).f23296k;
        return c5551u == null ? this.f21382d : c5551u;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7166e(long j10) {
        if (this.f21393o == EnumC6624c.Streaming) {
            C5551u.Companion.getClass();
            if (C21555b.m21833c(new C5551u(AbstractC3794B0.m4501z("instant(...)")).m5946b(this.f21382d), j10) <= 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b0  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        boolean zM18089b4;
        boolean zM18089b5;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6636i)) {
            return false;
        }
        C6636i c6636i = (C6636i) obj;
        if (!AbstractC16544l.m18089b(this.f21379a, c6636i.f21379a)) {
            return false;
        }
        String str = this.f21380b;
        String str2 = c6636i.f21380b;
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
        if (!zM18089b || !AbstractC16544l.m18089b(this.f21381c, c6636i.f21381c) || !AbstractC16544l.m18089b(this.f21382d, c6636i.f21382d)) {
            return false;
        }
        String str3 = this.f21383e;
        String str4 = c6636i.f21383e;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        if (!zM18089b2 || !AbstractC16544l.m18089b(this.f21384f, c6636i.f21384f) || !AbstractC16544l.m18089b(this.f21385g, c6636i.f21385g) || !AbstractC16544l.m18089b(this.f21386h, c6636i.f21386h)) {
            return false;
        }
        String str5 = this.f21387i;
        String str6 = c6636i.f21387i;
        if (str5 == null) {
            if (str6 == null) {
                zM18089b3 = true;
            } else {
                zM18089b3 = false;
            }
        } else if (str6 == null) {
            zM18089b3 = false;
        } else {
            zM18089b3 = AbstractC16544l.m18089b(str5, str6);
        }
        if (!zM18089b3) {
            return false;
        }
        String str7 = this.f21388j;
        String str8 = c6636i.f21388j;
        if (str7 == null) {
            if (str8 == null) {
                zM18089b4 = true;
            } else {
                zM18089b4 = false;
            }
        } else if (str8 == null) {
            zM18089b4 = false;
        } else {
            zM18089b4 = AbstractC16544l.m18089b(str7, str8);
        }
        if (!zM18089b4) {
            return false;
        }
        String str9 = this.f21389k;
        String str10 = c6636i.f21389k;
        if (str9 == null) {
            if (str10 == null) {
                zM18089b5 = true;
            } else {
                zM18089b5 = false;
            }
        } else if (str10 == null) {
            zM18089b5 = false;
        } else {
            zM18089b5 = AbstractC16544l.m18089b(str9, str10);
        }
        return zM18089b5 && AbstractC16544l.m18089b(this.f21390l, c6636i.f21390l) && AbstractC16544l.m18089b(this.f21391m, c6636i.f21391m) && AbstractC16544l.m18089b(this.f21392n, c6636i.f21392n) && this.f21393o == c6636i.f21393o && AbstractC16544l.m18089b(this.f21394p, c6636i.f21394p) && AbstractC16544l.m18089b(this.f21395q, c6636i.f21395q) && this.f21396r == c6636i.f21396r && this.f21397s == c6636i.f21397s && AbstractC16544l.m18089b(this.f21398t, c6636i.f21398t) && AbstractC16544l.m18089b(this.f21399u, c6636i.f21399u);
    }

    /* JADX INFO: renamed from: f */
    public final C21036q m7167f() {
        return AbstractC21031l.m21495s(AbstractC21031l.m21492p(new C6632g(this, 0), m7164c()), C6634h.f21374Z);
    }

    /* JADX INFO: renamed from: g */
    public final C6397h m7168g() {
        C6397h c6397hM7164c = m7164c();
        C6397h c6397hM7026h = C6394e.m7026h(this.f21399u, c6397hM7164c, C6634h.f21375o0);
        return c6397hM7026h == null ? c6397hM7164c : c6397hM7026h;
    }

    public final int hashCode() {
        int iHashCode = this.f21379a.hashCode() * 31;
        String str = this.f21380b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C5551u c5551u = this.f21381c;
        int iHashCode3 = (this.f21382d.f18004Y.hashCode() + ((iHashCode2 + (c5551u == null ? 0 : c5551u.f18004Y.hashCode())) * 31)) * 31;
        String str2 = this.f21383e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21384f;
        int iHashCode5 = (this.f21386h.hashCode() + AbstractC20734X.m21250u((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f21385g)) * 31;
        String str4 = this.f21387i;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21388j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21389k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f21390l;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.f21391m;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.f21392n;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        EnumC6624c enumC6624c = this.f21393o;
        int iHashCode12 = (iHashCode11 + (enumC6624c == null ? 0 : enumC6624c.hashCode())) * 31;
        String str9 = this.f21394p;
        int iHashCode13 = (((this.f21396r.hashCode() + AbstractC14376f.m15858x(this.f21395q, (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31, 31)) * 31) + (this.f21397s ? 1231 : 1237)) * 31;
        C6657s0 c6657s0 = this.f21398t;
        return this.f21399u.f20814b.hashCode() + ((iHashCode13 + (c6657s0 != null ? c6657s0.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    /* JADX INFO: renamed from: a */
    public static C6636i m7162a(C6636i c6636i, String str, String str2, C5551u c5551u, String str3, String str4, Map map, C9436E c9436e, String str5, String str6, String str7, ArrayList arrayList, EnumC6603I enumC6603I, boolean z6, C6657s0 c6657s0, C6394e c6394e, int i10) {
        String id2 = (i10 & 1) != 0 ? c6636i.f21379a : str;
        String str8 = (i10 & 2) != 0 ? c6636i.f21380b : str2;
        C5551u c5551u2 = c6636i.f21381c;
        C5551u modificationDate = (i10 & 8) != 0 ? c6636i.f21382d : c5551u;
        String str9 = (i10 & 16) != 0 ? c6636i.f21383e : str3;
        String str10 = (i10 & 32) != 0 ? c6636i.f21384f : str4;
        Map moderationResults = (i10 & 64) != 0 ? c6636i.f21385g : map;
        C9436E safeUrlMap = (i10 & 128) != 0 ? c6636i.f21386h : c9436e;
        String str11 = c6636i.f21387i;
        String str12 = (i10 & 512) != 0 ? c6636i.f21388j : str5;
        String str13 = (i10 & 1024) != 0 ? c6636i.f21389k : str6;
        String str14 = (i10 & 2048) != 0 ? c6636i.f21390l : str7;
        List list = c6636i.f21391m;
        String str15 = c6636i.f21392n;
        EnumC6624c enumC6624c = (i10 & 16384) != 0 ? c6636i.f21393o : null;
        String str16 = c6636i.f21394p;
        List uiElements = (i10 & 65536) != 0 ? c6636i.f21395q : arrayList;
        EnumC6603I enumC6603I2 = (i10 & 131072) != 0 ? c6636i.f21396r : enumC6603I;
        String str17 = str14;
        boolean z10 = (i10 & 262144) != 0 ? c6636i.f21397s : z6;
        C6657s0 c6657s1 = (524288 & i10) != 0 ? c6636i.f21398t : c6657s0;
        C6394e messageTree = (i10 & 1048576) != 0 ? c6636i.f21399u : c6394e;
        c6636i.getClass();
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(modificationDate, "modificationDate");
        AbstractC16544l.m18094g(moderationResults, "moderationResults");
        AbstractC16544l.m18094g(safeUrlMap, "safeUrlMap");
        AbstractC16544l.m18094g(uiElements, "uiElements");
        AbstractC16544l.m18094g(enumC6603I2, anhfj.UCXfyjdt);
        AbstractC16544l.m18094g(messageTree, "messageTree");
        return new C6636i(id2, str8, c5551u2, modificationDate, str9, str10, moderationResults, safeUrlMap, str11, str12, str13, str17, list, str15, enumC6624c, str16, uiElements, enumC6603I2, z10, c6657s1, messageTree);
    }

    public C6636i(int i10, String str, String str2, C5551u c5551u, C5551u c5551u2, String str3, String str4, Map map, C9436E c9436e, String str5, String str6, String str7, String str8, List list, String str9, EnumC6624c enumC6624c, boolean z6) {
        Set set = null;
        if (13 != (i10 & 13)) {
            AbstractC11153a0.m12389l(i10, 13, C6626d.f21361a.getDescriptor());
            throw null;
        }
        this.f21379a = str;
        if ((i10 & 2) == 0) {
            this.f21380b = null;
        } else {
            this.f21380b = str2;
        }
        this.f21381c = c5551u;
        this.f21382d = c5551u2;
        if ((i10 & 16) == 0) {
            this.f21383e = null;
        } else {
            this.f21383e = str3;
        }
        if ((i10 & 32) == 0) {
            this.f21384f = null;
        } else {
            this.f21384f = str4;
        }
        this.f21385g = (i10 & 64) == 0 ? C17690x.f56481Y : map;
        this.f21386h = (i10 & 128) == 0 ? new C9436E(3, set) : c9436e;
        if ((i10 & 256) == 0) {
            this.f21387i = null;
        } else {
            this.f21387i = str5;
        }
        if ((i10 & 512) == 0) {
            this.f21388j = null;
        } else {
            this.f21388j = str6;
        }
        if ((i10 & 1024) == 0) {
            this.f21389k = null;
        } else {
            this.f21389k = str7;
        }
        if ((i10 & 2048) == 0) {
            this.f21390l = null;
        } else {
            this.f21390l = str8;
        }
        if ((i10 & 4096) == 0) {
            this.f21391m = null;
        } else {
            this.f21391m = list;
        }
        if ((i10 & 8192) == 0) {
            this.f21392n = null;
        } else {
            this.f21392n = str9;
        }
        if ((i10 & 16384) == 0) {
            this.f21393o = null;
        } else {
            this.f21393o = enumC6624c;
        }
        this.f21394p = null;
        this.f21395q = C17689w.f56480Y;
        this.f21396r = EnumC6603I.f21320o0;
        this.f21397s = false;
        this.f21398t = null;
        C21984a1.Companion.getClass();
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        C22020j1.Companion.getClass();
        C6394e c6394e = new C6394e(AbstractC9393x3.m9974d(AbstractC9286f4.m9860a(AbstractC9286f4.m9862c(str, string, "gpt-4o-mini"))), str);
        this.f21399u = c6394e;
        int i11 = c6394e.f20815c;
        if (i11 > 1000) {
            AbstractC8223w5.m8851c().mo21447a(C20857C.f66335q, AbstractC17659D.m19244f(new C17309l(ParameterNames.f31999ID, new C22011h0(str)), new C17309l("size", Integer.valueOf(i11))));
        }
        if ((i10 & 32768) != 0) {
            this.f21400v = z6;
        } else {
            String str10 = this.f21384f;
            this.f21400v = (str10 == null || AbstractC21322p.m21681O(str10) || AbstractC16544l.m18089b(this.f21384f, "New chat")) ? false : true;
        }
    }

    public C6636i(String str, String str2, C5551u c5551u, C5551u c5551u2, String str3, String str4, Map map, C9436E c9436e, String str5, String str6, String str7, String str8, EnumC6624c enumC6624c, String str9, boolean z6, C6394e c6394e, int i10) {
        C6394e c6394e2;
        Set set = null;
        String str10 = (i10 & 2) != 0 ? null : str2;
        String str11 = (i10 & 16) != 0 ? null : str3;
        String str12 = (i10 & 32) != 0 ? null : str4;
        Map map2 = (i10 & 64) != 0 ? C17690x.f56481Y : map;
        C9436E c9436e2 = (i10 & 128) != 0 ? new C9436E(3, set) : c9436e;
        String str13 = (i10 & 512) != 0 ? null : str5;
        String str14 = (i10 & 1024) != 0 ? null : str6;
        String str15 = (i10 & 2048) != 0 ? null : str7;
        String str16 = (i10 & 8192) != 0 ? null : str8;
        EnumC6624c enumC6624c2 = (i10 & 16384) != 0 ? null : enumC6624c;
        String str17 = (32768 & i10) != 0 ? null : str9;
        C17689w c17689w = C17689w.f56480Y;
        EnumC6603I enumC6603I = EnumC6603I.f21320o0;
        boolean z10 = (262144 & i10) != 0 ? false : z6;
        if ((i10 & 1048576) != 0) {
            C21984a1.Companion.getClass();
            String string = UUID.randomUUID().toString();
            AbstractC16544l.m18093f(string, "toString(...)");
            C22020j1.Companion.getClass();
            c6394e2 = new C6394e(AbstractC9393x3.m9974d(AbstractC9286f4.m9860a(AbstractC9286f4.m9862c(str, string, "gpt-4o-mini"))), str);
        } else {
            c6394e2 = c6394e;
        }
        this(str, str10, c5551u, c5551u2, str11, str12, map2, c9436e2, null, str13, str14, str15, null, str16, enumC6624c2, str17, c17689w, enumC6603I, z10, null, c6394e2);
    }
}
