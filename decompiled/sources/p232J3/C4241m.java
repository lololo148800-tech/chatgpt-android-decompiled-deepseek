package p232J3;

import android.content.Context;
import android.net.Uri;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import io.sentry.C15358g1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A.C0042V0;
import p035B7.C0845b;
import p1016t3.AbstractC19754D;
import p1016t3.C19751A;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1016t3.C19791r;
import p1016t3.C19792s;
import p1016t3.C19793t;
import p1016t3.C19794u;
import p1016t3.C19795v;
import p1016t3.C19796w;
import p1016t3.C19797x;
import p1073w3.AbstractC20817s;
import p1142z3.InterfaceC21739g;
import p372P3.C6331m;
import p372P3.C6337s;
import p372P3.InterfaceC6336r;
import p817j$.util.Objects;
import p885m4.C17155e;

/* JADX INFO: renamed from: J3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C4241m implements InterfaceC4252x {

    /* JADX INFO: renamed from: a */
    public final C0042V0 f13856a;

    /* JADX INFO: renamed from: b */
    public InterfaceC21739g f13857b;

    /* JADX INFO: renamed from: c */
    public final long f13858c;

    /* JADX INFO: renamed from: d */
    public final long f13859d;

    /* JADX INFO: renamed from: e */
    public final long f13860e;

    /* JADX INFO: renamed from: f */
    public final float f13861f;

    /* JADX INFO: renamed from: g */
    public final float f13862g;

    /* JADX INFO: renamed from: h */
    public boolean f13863h;

    public C4241m(Context context, InterfaceC6336r interfaceC6336r) {
        C15358g1 c15358g1 = new C15358g1(context, 22);
        this.f13857b = c15358g1;
        C0042V0 c0042v0 = new C0042V0(interfaceC6336r, new C17155e());
        this.f13856a = c0042v0;
        if (c15358g1 != ((InterfaceC21739g) c0042v0.f208q0)) {
            c0042v0.f208q0 = c15358g1;
            ((HashMap) c0042v0.f206o0).clear();
            ((HashMap) c0042v0.f207p0).clear();
        }
        this.f13858c = -9223372036854775807L;
        this.f13859d = -9223372036854775807L;
        this.f13860e = -9223372036854775807L;
        this.f13861f = -3.4028235E38f;
        this.f13862g = -3.4028235E38f;
        this.f13863h = true;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC4252x m5010d(Class cls, InterfaceC21739g interfaceC21739g) {
        try {
            return (InterfaceC4252x) cls.getConstructor(InterfaceC21739g.class).newInstance(interfaceC21739g);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // p232J3.InterfaceC4252x
    /* JADX INFO: renamed from: a */
    public final InterfaceC4252x mo4958a(C17155e c17155e) {
        C0042V0 c0042v0 = this.f13856a;
        c0042v0.f209r0 = c17155e;
        ((InterfaceC6336r) c0042v0.f205Z).mo6946a(c17155e);
        Iterator it = ((HashMap) c0042v0.f207p0).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC4252x) it.next()).mo4958a(c17155e);
        }
        return this;
    }

    @Override // p232J3.InterfaceC4252x
    /* JADX INFO: renamed from: b */
    public final AbstractC4226a mo4959b(C19797x c19797x) {
        List list;
        Uri uri;
        String str;
        AbstractC11278C abstractC11278C;
        long j10;
        C19797x c19797x2 = c19797x;
        c19797x2.f62786b.getClass();
        String scheme = c19797x2.f62786b.f62779a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(c19797x2.f62786b.f62780b, "application/x-image-uri")) {
            long j11 = c19797x2.f62786b.f62783e;
            int i10 = AbstractC20817s.f66106a;
            throw null;
        }
        C19794u c19794u = c19797x2.f62786b;
        int iM21424y = AbstractC20817s.m21424y(c19794u.f62779a, c19794u.f62780b);
        if (c19797x2.f62786b.f62783e != -9223372036854775807L) {
            InterfaceC6336r interfaceC6336r = (InterfaceC6336r) this.f13856a.f205Z;
            if (interfaceC6336r instanceof C6331m) {
                C6331m c6331m = (C6331m) interfaceC6336r;
                synchronized (c6331m) {
                    c6331m.f20558p0 = 1;
                }
            }
        }
        try {
            C0042V0 c0042v0 = this.f13856a;
            HashMap map = (HashMap) c0042v0.f207p0;
            InterfaceC4252x interfaceC4252x = (InterfaceC4252x) map.get(Integer.valueOf(iM21424y));
            if (interfaceC4252x == null) {
                interfaceC4252x = (InterfaceC4252x) c0042v0.m216j(iM21424y).get();
                interfaceC4252x.mo4958a((C17155e) c0042v0.f209r0);
                interfaceC4252x.mo4960c(c0042v0.f204Y);
                map.put(Integer.valueOf(iM21424y), interfaceC4252x);
            }
            C19792s c19792sM20751a = c19797x2.f62787c.m20751a();
            C19793t c19793t = c19797x2.f62787c;
            if (c19793t.f62774a == -9223372036854775807L) {
                c19792sM20751a.f62769a = this.f13858c;
            }
            if (c19793t.f62777d == -3.4028235E38f) {
                c19792sM20751a.f62772d = this.f13861f;
            }
            if (c19793t.f62778e == -3.4028235E38f) {
                c19792sM20751a.f62773e = this.f13862g;
            }
            if (c19793t.f62775b == -9223372036854775807L) {
                c19792sM20751a.f62770b = this.f13859d;
            }
            if (c19793t.f62776c == -9223372036854775807L) {
                c19792sM20751a.f62771c = this.f13860e;
            }
            C19793t c19793t2 = new C19793t(c19792sM20751a);
            if (!c19793t2.equals(c19797x2.f62787c)) {
                C11276A c11276a = AbstractC11278C.f34162Z;
                C11294T c11294t = C11294T.f34185q0;
                List listEmptyList = Collections.emptyList();
                C11294T c11294t2 = C11294T.f34185q0;
                C19795v c19795v = C19795v.f62784a;
                C19791r c19791r = c19797x2.f62789e;
                C6337s c6337s = new C6337s();
                c6337s.f20561a = c19791r.f62768a;
                String str2 = c19797x2.f62785a;
                C19751A c19751a = c19797x2.f62788d;
                c19797x2.f62787c.m20751a();
                C19795v c19795v2 = c19797x2.f62790f;
                C19794u c19794u2 = c19797x2.f62786b;
                if (c19794u2 != null) {
                    String str3 = c19794u2.f62780b;
                    Uri uri2 = c19794u2.f62779a;
                    List list2 = c19794u2.f62781c;
                    AbstractC11278C abstractC11278C2 = c19794u2.f62782d;
                    C11276A c11276a2 = AbstractC11278C.f34162Z;
                    C11294T c11294t3 = C11294T.f34185q0;
                    str = str3;
                    uri = uri2;
                    list = list2;
                    abstractC11278C = abstractC11278C2;
                    j10 = c19794u2.f62783e;
                } else {
                    list = listEmptyList;
                    uri = null;
                    str = null;
                    abstractC11278C = c11294t2;
                    j10 = -9223372036854775807L;
                }
                C19792s c19792sM20751a2 = c19793t2.m20751a();
                C19794u c19794u3 = uri != null ? new C19794u(uri, str, null, list, abstractC11278C, j10) : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = str2;
                C19791r c19791r2 = new C19791r(c6337s);
                C19793t c19793t3 = new C19793t(c19792sM20751a2);
                if (c19751a == null) {
                    c19751a = C19751A.f62530y;
                }
                c19797x2 = new C19797x(str4, c19791r2, c19794u3, c19793t3, c19751a, c19795v2);
            }
            AbstractC4226a abstractC4226aMo4959b = interfaceC4252x.mo4959b(c19797x2);
            AbstractC11278C abstractC11278C3 = c19797x2.f62786b.f62782d;
            if (!abstractC11278C3.isEmpty()) {
                AbstractC4226a[] abstractC4226aArr = new AbstractC4226a[abstractC11278C3.size() + 1];
                abstractC4226aArr[0] = abstractC4226aMo4959b;
                if (abstractC11278C3.size() > 0) {
                    if (!this.f13863h) {
                        this.f13857b.getClass();
                        C19796w c19796w = (C19796w) abstractC11278C3.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        C11276A c11276a3 = AbstractC11278C.f34162Z;
                        C11294T c11294t4 = C11294T.f34185q0;
                        Collections.emptyList();
                        C11294T c11294t5 = C11294T.f34185q0;
                        C19795v c19795v3 = C19795v.f62784a;
                        Uri uri3 = Uri.EMPTY;
                        c19796w.getClass();
                        throw null;
                    }
                    C19787n c19787n = new C19787n();
                    ((C19796w) abstractC11278C3.get(0)).getClass();
                    ArrayList arrayList = AbstractC19754D.f62557a;
                    c19787n.f62714l = null;
                    ((C19796w) abstractC11278C3.get(0)).getClass();
                    c19787n.f62706d = null;
                    ((C19796w) abstractC11278C3.get(0)).getClass();
                    c19787n.f62707e = 0;
                    ((C19796w) abstractC11278C3.get(0)).getClass();
                    c19787n.f62708f = 0;
                    ((C19796w) abstractC11278C3.get(0)).getClass();
                    c19787n.f62704b = null;
                    ((C19796w) abstractC11278C3.get(0)).getClass();
                    c19787n.f62703a = null;
                    new C19788o(c19787n);
                    new C0845b(1);
                    ((C19796w) abstractC11278C3.get(0)).getClass();
                    throw null;
                }
                abstractC4226aMo4959b = new C4207G(abstractC4226aArr);
            }
            long j12 = c19797x2.f62789e.f62768a;
            if (j12 != Long.MIN_VALUE) {
                abstractC4226aMo4959b = new C4234f(abstractC4226aMo4959b, j12, true);
            }
            c19797x2.f62786b.getClass();
            c19797x2.f62786b.getClass();
            return abstractC4226aMo4959b;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // p232J3.InterfaceC4252x
    /* JADX INFO: renamed from: c */
    public final InterfaceC4252x mo4960c(boolean z6) {
        this.f13863h = z6;
        C0042V0 c0042v0 = this.f13856a;
        c0042v0.f204Y = z6;
        ((InterfaceC6336r) c0042v0.f205Z).mo6947b(z6);
        Iterator it = ((HashMap) c0042v0.f207p0).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC4252x) it.next()).mo4960c(z6);
        }
        return this;
    }
}
