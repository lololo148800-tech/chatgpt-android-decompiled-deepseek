package p1016t3;

import android.net.Uri;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.util.Collections;
import java.util.List;
import p1073w3.AbstractC20817s;
import p372P3.C6337s;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.x */
/* JADX INFO: loaded from: classes.dex */
public final class C19797x {

    /* JADX INFO: renamed from: a */
    public final String f62785a;

    /* JADX INFO: renamed from: b */
    public final C19794u f62786b;

    /* JADX INFO: renamed from: c */
    public final C19793t f62787c;

    /* JADX INFO: renamed from: d */
    public final C19751A f62788d;

    /* JADX INFO: renamed from: e */
    public final C19791r f62789e;

    /* JADX INFO: renamed from: f */
    public final C19795v f62790f;

    static {
        C6337s c6337s = new C6337s(5);
        C11276A c11276a = AbstractC11278C.f34162Z;
        C11294T c11294t = C11294T.f34185q0;
        Collections.emptyList();
        C11294T c11294t2 = C11294T.f34185q0;
        C19792s c19792s = new C19792s();
        C19795v c19795v = C19795v.f62784a;
        c6337s.m6951d();
        c19792s.m20750a();
        C19751A c19751a = C19751A.f62530y;
        AbstractC17792x.m19540w(0, 1, 2, 3, 4);
        AbstractC20817s.m21425z(5);
    }

    public C19797x(String str, C19791r c19791r, C19794u c19794u, C19793t c19793t, C19751A c19751a, C19795v c19795v) {
        this.f62785a = str;
        this.f62786b = c19794u;
        this.f62787c = c19793t;
        this.f62788d = c19751a;
        this.f62789e = c19791r;
        this.f62790f = c19795v;
    }

    /* JADX INFO: renamed from: a */
    public static C19797x m20752a(Uri uri) {
        C6337s c6337s = new C6337s(5);
        C11276A c11276a = AbstractC11278C.f34162Z;
        C11294T c11294t = C11294T.f34185q0;
        List listEmptyList = Collections.emptyList();
        C11294T c11294t2 = C11294T.f34185q0;
        C19792s c19792s = new C19792s();
        return new C19797x("", new C19791r(c6337s), uri != null ? new C19794u(uri, null, null, listEmptyList, c11294t2, -9223372036854775807L) : null, new C19793t(c19792s), C19751A.f62530y, C19795v.f62784a);
    }

    /* JADX INFO: renamed from: b */
    public static C19797x m20753b(String str) {
        C6337s c6337s = new C6337s(5);
        C11276A c11276a = AbstractC11278C.f34162Z;
        C11294T c11294t = C11294T.f34185q0;
        List listEmptyList = Collections.emptyList();
        C11294T c11294t2 = C11294T.f34185q0;
        C19792s c19792s = new C19792s();
        C19795v c19795v = C19795v.f62784a;
        Uri uri = str == null ? null : Uri.parse(str);
        return new C19797x("", new C19791r(c6337s), uri != null ? new C19794u(uri, null, null, listEmptyList, c11294t2, -9223372036854775807L) : null, new C19793t(c19792s), C19751A.f62530y, c19795v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19797x)) {
            return false;
        }
        C19797x c19797x = (C19797x) obj;
        return AbstractC20817s.m21400a(this.f62785a, c19797x.f62785a) && this.f62789e.equals(c19797x.f62789e) && AbstractC20817s.m21400a(this.f62786b, c19797x.f62786b) && this.f62787c.equals(c19797x.f62787c) && AbstractC20817s.m21400a(this.f62788d, c19797x.f62788d) && AbstractC20817s.m21400a(this.f62790f, c19797x.f62790f);
    }

    public final int hashCode() {
        int iHashCode = this.f62785a.hashCode() * 31;
        C19794u c19794u = this.f62786b;
        int iHashCode2 = (this.f62788d.hashCode() + ((this.f62789e.hashCode() + ((this.f62787c.hashCode() + ((iHashCode + (c19794u != null ? c19794u.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f62790f.getClass();
        return iHashCode2;
    }
}
