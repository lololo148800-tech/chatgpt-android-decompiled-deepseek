package p1016t3;

import android.net.Uri;
import bb.AbstractC11278C;
import bb.C11333z;
import java.util.List;
import p1073w3.AbstractC20817s;
import p523V9.AbstractC8198t4;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C19794u {

    /* JADX INFO: renamed from: a */
    public final Uri f62779a;

    /* JADX INFO: renamed from: b */
    public final String f62780b;

    /* JADX INFO: renamed from: c */
    public final List f62781c;

    /* JADX INFO: renamed from: d */
    public final AbstractC11278C f62782d;

    /* JADX INFO: renamed from: e */
    public final long f62783e;

    static {
        AbstractC17792x.m19540w(0, 1, 2, 3, 4);
        AbstractC20817s.m21425z(5);
        AbstractC20817s.m21425z(6);
        AbstractC20817s.m21425z(7);
    }

    public C19794u(Uri uri, String str, AbstractC8198t4 abstractC8198t4, List list, AbstractC11278C abstractC11278C, long j10) {
        this.f62779a = uri;
        this.f62780b = AbstractC19754D.m20711i(str);
        this.f62781c = list;
        this.f62782d = abstractC11278C;
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        for (int i10 = 0; i10 < abstractC11278C.size(); i10++) {
            ((C19796w) abstractC11278C.get(i10)).getClass();
            c11333zM12690s.m12763c(new C19796w());
        }
        c11333zM12690s.m12768j();
        this.f62783e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19794u)) {
            return false;
        }
        C19794u c19794u = (C19794u) obj;
        return this.f62779a.equals(c19794u.f62779a) && AbstractC20817s.m21400a(this.f62780b, c19794u.f62780b) && AbstractC20817s.m21400a(null, null) && AbstractC20817s.m21400a(null, null) && this.f62781c.equals(c19794u.f62781c) && AbstractC20817s.m21400a(null, null) && this.f62782d.equals(c19794u.f62782d) && AbstractC20817s.m21400a(null, null) && Long.valueOf(this.f62783e).equals(Long.valueOf(c19794u.f62783e));
    }

    public final int hashCode() {
        int iHashCode = this.f62779a.hashCode() * 31;
        String str = this.f62780b;
        return (int) ((((long) ((this.f62782d.hashCode() + ((this.f62781c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31)) * 31) + this.f62783e);
    }
}
