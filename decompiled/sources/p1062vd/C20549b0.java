package p1062vd;

import bf.AbstractC11372a0;
import bf.C11349D;
import bf.InterfaceC11374b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p072Ci.C1705j;
import p098Di.InterfaceC2062k;
import p1042uh.C20263a0;
import p1107xh.EnumC21219I;
import p1113xn.AbstractC21322p;
import p1155zi.C21913F1;
import p1155zi.C21917G1;
import p1155zi.C21921H1;
import p1155zi.InterfaceC21925I1;
import p403Qd.C6636i;
import p523V9.AbstractC8079e5;
import p571X9.AbstractC9393x3;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: vd.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20549b0 implements InterfaceC2062k {

    /* JADX INFO: renamed from: A */
    public final boolean f65204A;

    /* JADX INFO: renamed from: B */
    public final ArrayList f65205B;

    /* JADX INFO: renamed from: C */
    public final List f65206C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f65207D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f65208E;

    /* JADX INFO: renamed from: a */
    public final boolean f65209a;

    /* JADX INFO: renamed from: b */
    public final boolean f65210b;

    /* JADX INFO: renamed from: c */
    public final boolean f65211c;

    /* JADX INFO: renamed from: d */
    public final String f65212d;

    /* JADX INFO: renamed from: e */
    public final String f65213e;

    /* JADX INFO: renamed from: f */
    public final List f65214f;

    /* JADX INFO: renamed from: g */
    public final List f65215g;

    /* JADX INFO: renamed from: h */
    public final List f65216h;

    /* JADX INFO: renamed from: i */
    public final boolean f65217i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC21925I1 f65218j;

    /* JADX INFO: renamed from: k */
    public final String f65219k;

    /* JADX INFO: renamed from: l */
    public final boolean f65220l;

    /* JADX INFO: renamed from: m */
    public final boolean f65221m;

    /* JADX INFO: renamed from: n */
    public final C1705j f65222n;

    /* JADX INFO: renamed from: o */
    public final Set f65223o;

    /* JADX INFO: renamed from: p */
    public final Set f65224p;

    /* JADX INFO: renamed from: q */
    public final Set f65225q;

    /* JADX INFO: renamed from: r */
    public final Set f65226r;

    /* JADX INFO: renamed from: s */
    public final Set f65227s;

    /* JADX INFO: renamed from: t */
    public final boolean f65228t;

    /* JADX INFO: renamed from: u */
    public final boolean f65229u;

    /* JADX INFO: renamed from: v */
    public final boolean f65230v;

    /* JADX INFO: renamed from: w */
    public final boolean f65231w;

    /* JADX INFO: renamed from: x */
    public final boolean f65232x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f65233y;

    /* JADX INFO: renamed from: z */
    public final Object f65234z;

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    public C20549b0(boolean z6, boolean z10, boolean z11, String str, String str2, List conversations, List list, List list2, boolean z12, InterfaceC21925I1 interfaceC21925I1, String searchQuery, boolean z13, boolean z14, C1705j c1705j, Set activelyStreamingConversations, Set unreadConversations, Set inProgressRename, Set inProgressArchive, Set inProgressDelete, boolean z15, boolean z16) {
        ArrayList arrayList;
        Object objPrevious;
        List listM8504d;
        List listM19339O;
        ArrayList arrayListM19361k0;
        boolean zM21667A;
        int iIndexOf;
        boolean zContains;
        AbstractC16544l.m18094g(conversations, "conversations");
        AbstractC16544l.m18094g(searchQuery, "searchQuery");
        AbstractC16544l.m18094g(activelyStreamingConversations, "activelyStreamingConversations");
        AbstractC16544l.m18094g(unreadConversations, "unreadConversations");
        AbstractC16544l.m18094g(inProgressRename, "inProgressRename");
        AbstractC16544l.m18094g(inProgressArchive, "inProgressArchive");
        AbstractC16544l.m18094g(inProgressDelete, "inProgressDelete");
        this.f65209a = z6;
        this.f65210b = z10;
        this.f65211c = z11;
        this.f65212d = str;
        this.f65213e = str2;
        this.f65214f = conversations;
        this.f65215g = list;
        this.f65216h = list2;
        this.f65217i = z12;
        this.f65218j = interfaceC21925I1;
        this.f65219k = searchQuery;
        this.f65220l = z13;
        this.f65221m = z14;
        this.f65222n = c1705j;
        this.f65223o = activelyStreamingConversations;
        this.f65224p = unreadConversations;
        this.f65225q = inProgressRename;
        this.f65226r = inProgressArchive;
        this.f65227s = inProgressDelete;
        this.f65228t = z15;
        this.f65229u = z16;
        this.f65230v = (list == null && conversations.isEmpty()) ? false : true;
        this.f65231w = searchQuery.length() == 0;
        this.f65232x = conversations.isEmpty();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                C20263a0 c20263a0 = (C20263a0) obj;
                if (AbstractC21322p.m21681O(searchQuery)) {
                    zContains = c20263a0.f64087d.contains(EnumC21219I.PINNED);
                } else {
                    AbstractC16544l.m18094g(c20263a0, "<this>");
                    zContains = AbstractC21322p.m21667A(c20263a0.f64086c.f64081a, searchQuery, true);
                }
                if (zContains) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list3 = C17689w.f56480Y;
        List list4 = arrayList == null ? list3 : arrayList;
        List listM9974d = AbstractC21322p.m21681O(searchQuery) ? AbstractC9393x3.m9974d(new C20558h(z14 && str2 == null)) : list3;
        List list5 = list4;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list5, 10));
        int i10 = 0;
        for (Object obj2 : list5) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            C20263a0 c20263a1 = (C20263a0) obj2;
            arrayList2.add(new C20562l(c20263a1, str2 == null ? false : AbstractC11372a0.m12782a(c20263a1).equals(str2), (list4.size() <= 2 || i10 < 2) || z13, i10));
            i10 = i11;
        }
        ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(arrayList2);
        ListIterator listIterator = arrayListM19323D0.listIterator(arrayListM19323D0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            InterfaceC20563m interfaceC20563m = (InterfaceC20563m) objPrevious;
            if ((interfaceC20563m instanceof C20562l) && ((C20562l) interfaceC20563m).f65270a.f64087d.contains(EnumC21219I.PINNED)) {
                break;
            }
        }
        InterfaceC20563m interfaceC20563m2 = (InterfaceC20563m) objPrevious;
        if (interfaceC20563m2 != null && (iIndexOf = arrayListM19323D0.indexOf(interfaceC20563m2)) < arrayListM19323D0.size() - 1) {
            arrayListM19323D0.add(iIndexOf + 1, C20561k.f65269a);
        }
        this.f65233y = AbstractC17680n.m19339O(AbstractC17680n.m19362l0(AbstractC17680n.m19361k0(arrayListM19323D0, listM9974d), AbstractC21322p.m21681O(searchQuery) ? C20559i.f65264a : null));
        List list6 = this.f65216h;
        String query = this.f65219k;
        boolean z17 = this.f65220l;
        String str3 = this.f65213e;
        AbstractC16544l.m18094g(query, "query");
        List list7 = list6;
        if (list7 == null || list7.isEmpty()) {
            listM8504d = null;
            listM19339O = list3;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list6) {
                InterfaceC11374b0 interfaceC11374b0 = (InterfaceC11374b0) obj3;
                if (AbstractC21322p.m21681O(query)) {
                    zM21667A = true;
                } else {
                    AbstractC16544l.m18094g(interfaceC11374b0, "<this>");
                    zM21667A = AbstractC21322p.m21667A(((C11349D) interfaceC11374b0).f34319b, query, true);
                }
                if (zM21667A) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(arrayList3, 10));
            int i12 = 0;
            for (Object obj4 : arrayList3) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                InterfaceC11374b0 interfaceC11374b1 = (InterfaceC11374b0) obj4;
                arrayList4.add(new C20555e0(interfaceC11374b1, str3 == null ? false : AbstractC16544l.m18089b(((C11349D) interfaceC11374b1).f34318a, str3), (arrayList3.size() <= 2 || i12 < 2) || z17, i12));
                i12 = i13;
            }
            listM8504d = null;
            listM19339O = AbstractC17680n.m19339O(AbstractC17680n.m19362l0(arrayList4, AbstractC21322p.m21681O(query) && arrayList3.size() > 2 ? C20553d0.f65242a : null));
        }
        this.f65234z = listM19339O;
        this.f65204A = !listM19339O.isEmpty();
        List list8 = this.f65214f;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list8) {
            C6636i c6636i = (C6636i) obj5;
            if ((c6636i.f21380b == null || c6636i.f21397s) ? false : true) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayListM8504d = AbstractC8079e5.m8504d(arrayList5, this.f65219k, this.f65212d, this.f65224p, this.f65223o);
        this.f65205B = arrayListM8504d;
        List listM19373w0 = AbstractC17680n.m19373w0(arrayListM8504d, 2);
        this.f65206C = listM19373w0;
        List list9 = listM19373w0;
        ArrayList arrayList6 = new ArrayList(AbstractC17682p.m19389r(list9, 10));
        Iterator it = list9.iterator();
        while (it.hasNext()) {
            arrayList6.add(((InterfaceC20563m) it.next()).getId());
        }
        this.f65207D = arrayList6;
        ArrayList arrayListM19361k1 = AbstractC17680n.m19361k0(AbstractC8079e5.m8505e(this.f65234z, EnumC20570t.Snorlax), this.f65233y);
        if (!this.f65229u || AbstractC21322p.m21681O(this.f65219k)) {
            arrayListM19361k0 = this.f65205B;
        } else {
            List list10 = this.f65206C;
            InterfaceC21925I1 interfaceC21925I2 = this.f65218j;
            if (interfaceC21925I2 != null) {
                String str4 = this.f65212d;
                Set unreadConversationIds = this.f65224p;
                Set activelyStreamingConversationIds = this.f65223o;
                AbstractC16544l.m18094g(unreadConversationIds, "unreadConversationIds");
                AbstractC16544l.m18094g(activelyStreamingConversationIds, "activelyStreamingConversationIds");
                if (interfaceC21925I2 instanceof C21913F1) {
                    listM8504d = list3;
                } else if (interfaceC21925I2.equals(C21917G1.f69468a)) {
                    listM8504d = AbstractC9393x3.m9974d(C20551c0.f65240a);
                } else {
                    if (!(interfaceC21925I2 instanceof C21921H1)) {
                        throw new C0644w();
                    }
                    listM8504d = AbstractC8079e5.m8504d((List) ((C21921H1) interfaceC21925I2).f69472a, "", str4, unreadConversationIds, activelyStreamingConversationIds);
                }
            }
            list3 = listM8504d != null ? listM8504d : list3;
            ArrayList arrayList7 = new ArrayList();
            for (Object obj6 : list3) {
                if (!this.f65207D.contains(((InterfaceC20563m) obj6).getId())) {
                    arrayList7.add(obj6);
                }
            }
            arrayListM19361k0 = AbstractC17680n.m19361k0(arrayList7, list10);
        }
        this.f65208E = AbstractC17680n.m19361k0(AbstractC8079e5.m8505e(arrayListM19361k0, EnumC20570t.History), arrayListM19361k1);
    }

    /* JADX INFO: renamed from: e */
    public static C20549b0 m21187e(C20549b0 c20549b0, boolean z6, boolean z10, boolean z11, String str, List list, List list2, List list3, boolean z12, InterfaceC21925I1 interfaceC21925I1, String str2, boolean z13, C1705j c1705j, Set set, Set set2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, boolean z14, int i10) {
        boolean z15 = (i10 & 1) != 0 ? c20549b0.f65209a : z6;
        boolean z16 = (i10 & 2) != 0 ? c20549b0.f65210b : z10;
        boolean z17 = (i10 & 4) != 0 ? c20549b0.f65211c : z11;
        String str3 = (i10 & 8) != 0 ? c20549b0.f65212d : str;
        String str4 = c20549b0.f65213e;
        List conversations = (i10 & 32) != 0 ? c20549b0.f65214f : list;
        List list4 = (i10 & 64) != 0 ? c20549b0.f65215g : list2;
        List list5 = (i10 & 128) != 0 ? c20549b0.f65216h : list3;
        boolean z18 = (i10 & 256) != 0 ? c20549b0.f65217i : z12;
        InterfaceC21925I1 interfaceC21925I2 = (i10 & 512) != 0 ? c20549b0.f65218j : interfaceC21925I1;
        String searchQuery = (i10 & 1024) != 0 ? c20549b0.f65219k : str2;
        boolean z19 = (i10 & 2048) != 0 ? c20549b0.f65220l : z13;
        boolean z20 = c20549b0.f65221m;
        C1705j c1705j2 = (i10 & 8192) != 0 ? c20549b0.f65222n : c1705j;
        Set activelyStreamingConversations = (i10 & 16384) != 0 ? c20549b0.f65223o : set;
        Set unreadConversations = (i10 & 32768) != 0 ? c20549b0.f65224p : set2;
        boolean z21 = z19;
        Set inProgressRename = (i10 & 65536) != 0 ? c20549b0.f65225q : linkedHashSet;
        InterfaceC21925I1 interfaceC21925I3 = interfaceC21925I2;
        Set inProgressArchive = (i10 & 131072) != 0 ? c20549b0.f65226r : linkedHashSet2;
        boolean z22 = z18;
        Set inProgressDelete = (i10 & 262144) != 0 ? c20549b0.f65227s : linkedHashSet3;
        boolean z23 = (i10 & 524288) != 0 ? c20549b0.f65228t : z14;
        boolean z24 = c20549b0.f65229u;
        c20549b0.getClass();
        AbstractC16544l.m18094g(conversations, "conversations");
        AbstractC16544l.m18094g(searchQuery, "searchQuery");
        AbstractC16544l.m18094g(activelyStreamingConversations, "activelyStreamingConversations");
        AbstractC16544l.m18094g(unreadConversations, "unreadConversations");
        AbstractC16544l.m18094g(inProgressRename, "inProgressRename");
        AbstractC16544l.m18094g(inProgressArchive, "inProgressArchive");
        AbstractC16544l.m18094g(inProgressDelete, "inProgressDelete");
        return new C20549b0(z15, z16, z17, str3, str4, conversations, list4, list5, z22, interfaceC21925I3, searchQuery, z21, z20, c1705j2, activelyStreamingConversations, unreadConversations, inProgressRename, inProgressArchive, inProgressDelete, z23, z24);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0041  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20549b0)) {
            return false;
        }
        C20549b0 c20549b0 = (C20549b0) obj;
        if (this.f65209a != c20549b0.f65209a || this.f65210b != c20549b0.f65210b || this.f65211c != c20549b0.f65211c) {
            return false;
        }
        String str = this.f65212d;
        String str2 = c20549b0.f65212d;
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
        if (!zM18089b) {
            return false;
        }
        String str3 = this.f65213e;
        String str4 = c20549b0.f65213e;
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
        return zM18089b2 && AbstractC16544l.m18089b(this.f65214f, c20549b0.f65214f) && AbstractC16544l.m18089b(this.f65215g, c20549b0.f65215g) && AbstractC16544l.m18089b(this.f65216h, c20549b0.f65216h) && this.f65217i == c20549b0.f65217i && AbstractC16544l.m18089b(this.f65218j, c20549b0.f65218j) && AbstractC16544l.m18089b(this.f65219k, c20549b0.f65219k) && this.f65220l == c20549b0.f65220l && this.f65221m == c20549b0.f65221m && AbstractC16544l.m18089b(this.f65222n, c20549b0.f65222n) && AbstractC16544l.m18089b(this.f65223o, c20549b0.f65223o) && AbstractC16544l.m18089b(this.f65224p, c20549b0.f65224p) && AbstractC16544l.m18089b(this.f65225q, c20549b0.f65225q) && AbstractC16544l.m18089b(this.f65226r, c20549b0.f65226r) && AbstractC16544l.m18089b(this.f65227s, c20549b0.f65227s) && this.f65228t == c20549b0.f65228t && this.f65229u == c20549b0.f65229u;
    }

    public final int hashCode() {
        int i10 = (((((this.f65209a ? 1231 : 1237) * 31) + (this.f65210b ? 1231 : 1237)) * 31) + (this.f65211c ? 1231 : 1237)) * 31;
        String str = this.f65212d;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65213e;
        int iM15858x = AbstractC14376f.m15858x(this.f65214f, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        List list = this.f65215g;
        int iHashCode2 = (iM15858x + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f65216h;
        int iHashCode3 = (((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + (this.f65217i ? 1231 : 1237)) * 31;
        InterfaceC21925I1 interfaceC21925I1 = this.f65218j;
        int iM527p = (((AbstractC0168G.m527p((iHashCode3 + (interfaceC21925I1 == null ? 0 : interfaceC21925I1.hashCode())) * 31, 31, this.f65219k) + (this.f65220l ? 1231 : 1237)) * 31) + (this.f65221m ? 1231 : 1237)) * 31;
        C1705j c1705j = this.f65222n;
        return ((((this.f65227s.hashCode() + ((this.f65226r.hashCode() + ((this.f65225q.hashCode() + ((this.f65224p.hashCode() + ((this.f65223o.hashCode() + ((iM527p + (c1705j != null ? c1705j.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f65228t ? 1231 : 1237)) * 31) + (this.f65229u ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
