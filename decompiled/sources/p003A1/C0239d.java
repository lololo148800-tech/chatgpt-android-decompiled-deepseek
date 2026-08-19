package p003A1;

import java.text.BreakIterator;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3578I;
import p467T1.EnumC7198h;

/* JADX INFO: renamed from: A1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0239d extends AbstractC0235c {

    /* JADX INFO: renamed from: f */
    public static C0239d f887f;

    /* JADX INFO: renamed from: g */
    public static C0239d f888g;

    /* JADX INFO: renamed from: h */
    public static C0239d f889h;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f890d;

    /* JADX INFO: renamed from: e */
    public Object f891e;

    @Override // p003A1.AbstractC0235c
    /* JADX INFO: renamed from: f */
    public final int[] mo772f(int i10) {
        int iM4257g;
        switch (this.f890d) {
            case 0:
                int length = m776j().length();
                if (length <= 0 || i10 >= length) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f891e;
                    if (breakIterator == null) {
                        AbstractC16544l.m18103p("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f891e;
                        if (breakIterator2 == null) {
                            AbstractC16544l.m18103p("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i10);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m775i(i10, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f891e;
                    if (breakIterator3 == null) {
                        AbstractC16544l.m18103p("impl");
                        throw null;
                    }
                    i10 = breakIterator3.following(i10);
                } while (i10 != -1);
                return null;
            case 1:
                if (m776j().length() <= 0 || i10 >= m776j().length()) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!m789s(i10) && (!m789s(i10) || (i10 != 0 && m789s(i10 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f891e;
                    if (breakIterator4 == null) {
                        AbstractC16544l.m18103p("impl");
                        throw null;
                    }
                    i10 = breakIterator4.following(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f891e;
                if (breakIterator5 == null) {
                    AbstractC16544l.m18103p("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i10);
                if (iFollowing2 == -1 || !m788r(iFollowing2)) {
                    return null;
                }
                return m775i(i10, iFollowing2);
            default:
                if (m776j().length() <= 0 || i10 >= m776j().length()) {
                    return null;
                }
                EnumC7198h enumC7198h = EnumC7198h.f22860Z;
                if (i10 < 0) {
                    C3578I c3578i = (C3578I) this.f891e;
                    if (c3578i == null) {
                        AbstractC16544l.m18103p("layoutResult");
                        throw null;
                    }
                    iM4257g = c3578i.m4257g(0);
                } else {
                    C3578I c3578i2 = (C3578I) this.f891e;
                    if (c3578i2 == null) {
                        AbstractC16544l.m18103p("layoutResult");
                        throw null;
                    }
                    int iM4257g2 = c3578i2.m4257g(i10);
                    iM4257g = m786p(iM4257g2, enumC7198h) == i10 ? iM4257g2 : iM4257g2 + 1;
                }
                C3578I c3578i3 = (C3578I) this.f891e;
                if (c3578i3 == null) {
                    AbstractC16544l.m18103p("layoutResult");
                    throw null;
                }
                if (iM4257g >= c3578i3.f10893b.f10963f) {
                    return null;
                }
                return m775i(m786p(iM4257g, enumC7198h), m786p(iM4257g, EnumC7198h.f22859Y) + 1);
        }
    }

    @Override // p003A1.AbstractC0235c
    /* JADX INFO: renamed from: n */
    public final int[] mo780n(int i10) {
        int iM4257g;
        switch (this.f890d) {
            case 0:
                int length = m776j().length();
                if (length <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f891e;
                    if (breakIterator == null) {
                        AbstractC16544l.m18103p("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f891e;
                        if (breakIterator2 == null) {
                            AbstractC16544l.m18103p("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i10);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m775i(iPreceding, i10);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f891e;
                    if (breakIterator3 == null) {
                        AbstractC16544l.m18103p("impl");
                        throw null;
                    }
                    i10 = breakIterator3.preceding(i10);
                } while (i10 != -1);
                return null;
            case 1:
                int length2 = m776j().length();
                if (length2 <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length2) {
                    i10 = length2;
                }
                while (i10 > 0 && !m789s(i10 - 1) && !m788r(i10)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f891e;
                    if (breakIterator4 == null) {
                        AbstractC16544l.m18103p("impl");
                        throw null;
                    }
                    i10 = breakIterator4.preceding(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f891e;
                if (breakIterator5 == null) {
                    AbstractC16544l.m18103p("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i10);
                if (iPreceding2 == -1 || !m789s(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m789s(iPreceding2 - 1)) {
                    return m775i(iPreceding2, i10);
                }
                return null;
            default:
                if (m776j().length() <= 0 || i10 <= 0) {
                    return null;
                }
                int length3 = m776j().length();
                EnumC7198h enumC7198h = EnumC7198h.f22859Y;
                if (i10 > length3) {
                    C3578I c3578i = (C3578I) this.f891e;
                    if (c3578i == null) {
                        AbstractC16544l.m18103p("layoutResult");
                        throw null;
                    }
                    iM4257g = c3578i.m4257g(m776j().length());
                } else {
                    C3578I c3578i2 = (C3578I) this.f891e;
                    if (c3578i2 == null) {
                        AbstractC16544l.m18103p("layoutResult");
                        throw null;
                    }
                    int iM4257g2 = c3578i2.m4257g(i10);
                    iM4257g = m786p(iM4257g2, enumC7198h) + 1 == i10 ? iM4257g2 : iM4257g2 - 1;
                }
                if (iM4257g < 0) {
                    return null;
                }
                return m775i(m786p(iM4257g, EnumC7198h.f22860Z), m786p(iM4257g, enumC7198h) + 1);
        }
    }

    /* JADX INFO: renamed from: p */
    public int m786p(int i10, EnumC7198h enumC7198h) {
        C3578I c3578i = (C3578I) this.f891e;
        if (c3578i == null) {
            AbstractC16544l.m18103p("layoutResult");
            throw null;
        }
        int iM4260j = c3578i.m4260j(i10);
        C3578I c3578i2 = (C3578I) this.f891e;
        if (c3578i2 == null) {
            AbstractC16544l.m18103p("layoutResult");
            throw null;
        }
        if (enumC7198h != c3578i2.m4261k(iM4260j)) {
            C3578I c3578i3 = (C3578I) this.f891e;
            if (c3578i3 != null) {
                return c3578i3.m4260j(i10);
            }
            AbstractC16544l.m18103p("layoutResult");
            throw null;
        }
        C3578I c3578i4 = (C3578I) this.f891e;
        if (c3578i4 != null) {
            return c3578i4.m4256f(i10, false) - 1;
        }
        AbstractC16544l.m18103p("layoutResult");
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public void m787q(String str) {
        switch (this.f890d) {
            case 0:
                this.f878b = str;
                BreakIterator breakIterator = (BreakIterator) this.f891e;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC16544l.m18103p("impl");
                    throw null;
                }
            default:
                this.f878b = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f891e;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC16544l.m18103p("impl");
                    throw null;
                }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m788r(int i10) {
        return i10 > 0 && m789s(i10 + (-1)) && (i10 == m776j().length() || !m789s(i10));
    }

    /* JADX INFO: renamed from: s */
    public boolean m789s(int i10) {
        if (i10 < 0 || i10 >= m776j().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m776j().codePointAt(i10));
    }
}
