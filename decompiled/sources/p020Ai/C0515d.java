package p020Ai;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C21891A;
import p1155zi.C22050r;
import p1155zi.C22066v;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Ai.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0515d {
    public static final C0513b Companion = new C0513b();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f1653c = {null, new C11158d(C22066v.f69765a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f1654a;

    /* JADX INFO: renamed from: b */
    public final List f1655b;

    static {
        C21891A.Companion.getClass();
        C21891A c21891a = C21891A.f69410d;
        String strM22322a = c21891a.m22322a();
        AbstractC16544l.m18091d(strM22322a);
        C21891A c21891a2 = C21891A.f69411e;
        new C0515d(strM22322a, AbstractC17681o.m19382k(c21891a, c21891a2));
        String strM22322a2 = c21891a2.m22322a();
        AbstractC16544l.m18091d(strM22322a2);
        new C0515d(strM22322a2, AbstractC17681o.m19382k(c21891a, c21891a2));
        C21891A c21891a3 = C21891A.f69412f;
        String strM22322a3 = c21891a3.m22322a();
        AbstractC16544l.m18091d(strM22322a3);
        new C0515d(strM22322a3, AbstractC17681o.m19382k(c21891a, c21891a2, c21891a3, C21891A.f69413g, C21891A.f69414h));
    }

    public C0515d(String activeAccountId, List list) {
        AbstractC16544l.m18094g(activeAccountId, "activeAccountId");
        this.f1654a = activeAccountId;
        this.f1655b = list;
    }

    /* JADX INFO: renamed from: a */
    public static C0515d m1125a(C0515d c0515d, String activeAccountId, ArrayList arrayList, int i10) {
        if ((i10 & 1) != 0) {
            activeAccountId = c0515d.f1654a;
        }
        List availableAccountUsers = arrayList;
        if ((i10 & 2) != 0) {
            availableAccountUsers = c0515d.f1655b;
        }
        c0515d.getClass();
        AbstractC16544l.m18094g(activeAccountId, "activeAccountId");
        AbstractC16544l.m18094g(availableAccountUsers, "availableAccountUsers");
        return new C0515d(activeAccountId, availableAccountUsers);
    }

    /* JADX INFO: renamed from: b */
    public final C21891A m1126b() {
        String str;
        Object next;
        String strM22322a;
        List list = this.f1655b;
        Iterator it = list.iterator();
        do {
            boolean zHasNext = it.hasNext();
            str = this.f1654a;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            strM22322a = ((C21891A) next).m22322a();
        } while (!(strM22322a == null ? false : strM22322a.equals(str)));
        C21891A c21891a = (C21891A) next;
        if (c21891a == null) {
            C3430e c3430eM8749b = AbstractC8168p6.m8749b("AccountUserState", null);
            c21891a = (C21891A) AbstractC17680n.m19343S(list);
            if (c21891a != null) {
                String strM22347a = C22050r.m22347a(str);
                String strM22322a2 = c21891a.m22322a();
                AbstractC8160o6.m8727b(c3430eM8749b, AbstractC10763a.m11055m("Missing accountId for ", strM22347a, " for user! Falling back to first account ", strM22322a2 == null ? "null" : C22050r.m22347a(strM22322a2)), null, 6);
            } else {
                AbstractC8160o6.m8727b(c3430eM8749b, AbstractC10763a.m11054l("Missing accountId for ", C22050r.m22347a(str), " for user! No account to fall back to."), null, 6);
            }
        }
        return c21891a;
    }

    /* JADX INFO: renamed from: c */
    public final C0515d m1127c(String str, String str2) {
        C22050r c22050r;
        List list = this.f1655b;
        boolean z6 = list instanceof Collection;
        String str3 = this.f1654a;
        boolean z10 = false;
        if (!z6 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM22322a = ((C21891A) it.next()).m22322a();
                if (strM22322a == null ? false : strM22322a.equals(str3)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            return this;
        }
        C3430e c3430eM8749b = AbstractC8168p6.m8749b("AccountUserRepository", null);
        String strM22347a = C22050r.m22347a(str3);
        String strM19349Y = AbstractC17680n.m19349Y(list, null, null, null, 0, null, C0514c.f1652Y, 31);
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("Validation failed ", str2, ", active account ", strM22347a, " is not in the list of available accounts: ");
        sbM9896o.append(strM19349Y);
        AbstractC8160o6.m8727b(c3430eM8749b, sbM9896o.toString(), null, 6);
        if (str == null) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    c22050r = null;
                    break;
                }
                String strM22322a2 = ((C21891A) it2.next()).m22322a();
                c22050r = strM22322a2 != null ? new C22050r(strM22322a2) : null;
            } while (c22050r == null);
            if (c22050r == null) {
                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
            }
            str = c22050r.f69739a;
        }
        return m1125a(this, str, null, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0515d)) {
            return false;
        }
        C0515d c0515d = (C0515d) obj;
        return AbstractC16544l.m18089b(this.f1654a, c0515d.f1654a) && AbstractC16544l.m18089b(this.f1655b, c0515d.f1655b);
    }

    public final int hashCode() {
        return this.f1655b.hashCode() + (this.f1654a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C0515d(String str, int i10, List list) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C0512a.f1651a.getDescriptor());
            throw null;
        }
        this.f1654a = str;
        this.f1655b = list;
    }
}
