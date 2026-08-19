package p003A1;

import kotlin.jvm.internal.AbstractC16544l;
import p138F8.vJO.anhfj;
import p156G1.C2968o;
import p204I1.C3578I;
import p204I1.C3599o;
import p467T1.EnumC7198h;

/* JADX INFO: renamed from: A1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0243e extends AbstractC0235c {

    /* JADX INFO: renamed from: f */
    public static C0243e f903f;

    /* JADX INFO: renamed from: d */
    public C3578I f904d;

    /* JADX INFO: renamed from: e */
    public C2968o f905e;

    @Override // p003A1.AbstractC0235c
    /* JADX INFO: renamed from: f */
    public final int[] mo772f(int i10) {
        int iM4311c;
        if (m776j().length() <= 0 || i10 >= m776j().length()) {
            return null;
        }
        try {
            C2968o c2968o = this.f905e;
            if (c2968o == null) {
                AbstractC16544l.m18103p("node");
                throw null;
            }
            int iRound = Math.round(c2968o.m3795e().m15318e());
            if (i10 <= 0) {
                i10 = 0;
            }
            C3578I c3578i = this.f904d;
            if (c3578i == null) {
                AbstractC16544l.m18103p("layoutResult");
                throw null;
            }
            int iM4257g = c3578i.m4257g(i10);
            C3578I c3578i2 = this.f904d;
            if (c3578i2 == null) {
                AbstractC16544l.m18103p("layoutResult");
                throw null;
            }
            float fM4312d = c3578i2.f10893b.m4312d(iM4257g) + iRound;
            C3578I c3578i3 = this.f904d;
            if (c3578i3 == null) {
                AbstractC16544l.m18103p("layoutResult");
                throw null;
            }
            if (c3578i3 == null) {
                AbstractC16544l.m18103p("layoutResult");
                throw null;
            }
            C3599o c3599o = c3578i3.f10893b;
            if (fM4312d < c3599o.m4312d(c3599o.f10963f - 1)) {
                C3578I c3578i4 = this.f904d;
                if (c3578i4 == null) {
                    AbstractC16544l.m18103p("layoutResult");
                    throw null;
                }
                iM4311c = c3578i4.f10893b.m4311c(fM4312d);
            } else {
                C3578I c3578i5 = this.f904d;
                if (c3578i5 == null) {
                    AbstractC16544l.m18103p("layoutResult");
                    throw null;
                }
                iM4311c = c3578i5.f10893b.f10963f;
            }
            return m775i(i10, m813p(iM4311c - 1, EnumC7198h.f22859Y) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m813p(int i10, EnumC7198h enumC7198h) {
        C3578I c3578i = this.f904d;
        if (c3578i == null) {
            AbstractC16544l.m18103p("layoutResult");
            throw null;
        }
        int iM4260j = c3578i.m4260j(i10);
        C3578I c3578i2 = this.f904d;
        if (c3578i2 == null) {
            AbstractC16544l.m18103p("layoutResult");
            throw null;
        }
        if (enumC7198h != c3578i2.m4261k(iM4260j)) {
            C3578I c3578i3 = this.f904d;
            if (c3578i3 != null) {
                return c3578i3.m4260j(i10);
            }
            AbstractC16544l.m18103p("layoutResult");
            throw null;
        }
        C3578I c3578i4 = this.f904d;
        if (c3578i4 != null) {
            return c3578i4.m4256f(i10, false) - 1;
        }
        AbstractC16544l.m18103p("layoutResult");
        throw null;
    }

    @Override // p003A1.AbstractC0235c
    /* JADX INFO: renamed from: n */
    public final int[] mo780n(int i10) {
        int iM4311c;
        if (m776j().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            C2968o c2968o = this.f905e;
            if (c2968o != null) {
                int iRound = Math.round(c2968o.m3795e().m15318e());
                int length = m776j().length();
                if (length <= i10) {
                    i10 = length;
                }
                C3578I c3578i = this.f904d;
                String str = anhfj.DFwkANsQXHbwDQu;
                if (c3578i != null) {
                    int iM4257g = c3578i.m4257g(i10);
                    C3578I c3578i2 = this.f904d;
                    if (c3578i2 != null) {
                        float fM4312d = c3578i2.f10893b.m4312d(iM4257g) - iRound;
                        if (fM4312d > 0.0f) {
                            C3578I c3578i3 = this.f904d;
                            if (c3578i3 != null) {
                                iM4311c = c3578i3.f10893b.m4311c(fM4312d);
                            } else {
                                AbstractC16544l.m18103p(str);
                                throw null;
                            }
                        } else {
                            iM4311c = 0;
                        }
                        if (i10 == m776j().length() && iM4311c < iM4257g) {
                            iM4311c++;
                        }
                        return m775i(m813p(iM4311c, EnumC7198h.f22860Z), i10);
                    }
                    AbstractC16544l.m18103p(str);
                    throw null;
                }
                AbstractC16544l.m18103p(str);
                throw null;
            }
            AbstractC16544l.m18103p("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
