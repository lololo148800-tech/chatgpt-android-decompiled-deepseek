package p760g2;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p001A.AbstractC0010F;
import p655b2.C11221e;
import p775h2.AbstractC14379i;
import p775h2.C14385o;

/* JADX INFO: renamed from: g2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13806c {

    /* JADX INFO: renamed from: b */
    public int f43621b;

    /* JADX INFO: renamed from: c */
    public boolean f43622c;

    /* JADX INFO: renamed from: d */
    public final C13807d f43623d;

    /* JADX INFO: renamed from: e */
    public final int f43624e;

    /* JADX INFO: renamed from: f */
    public C13806c f43625f;

    /* JADX INFO: renamed from: i */
    public C11221e f43628i;

    /* JADX INFO: renamed from: a */
    public HashSet f43620a = null;

    /* JADX INFO: renamed from: g */
    public int f43626g = 0;

    /* JADX INFO: renamed from: h */
    public int f43627h = Integer.MIN_VALUE;

    public C13806c(C13807d c13807d, int i10) {
        this.f43623d = c13807d;
        this.f43624e = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m15342a(C13806c c13806c, int i10) {
        m15343b(c13806c, i10, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15343b(C13806c c13806c, int i10, int i11, boolean z6) {
        if (c13806c == null) {
            m15351j();
            return true;
        }
        if (!z6 && !m15350i(c13806c)) {
            return false;
        }
        this.f43625f = c13806c;
        if (c13806c.f43620a == null) {
            c13806c.f43620a = new HashSet();
        }
        HashSet hashSet = this.f43625f.f43620a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f43626g = i10;
        this.f43627h = i11;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m15344c(int i10, C14385o c14385o, ArrayList arrayList) {
        HashSet hashSet = this.f43620a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC14379i.m15865b(((C13806c) it.next()).f43623d, i10, arrayList, c14385o);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m15345d() {
        if (this.f43622c) {
            return this.f43621b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m15346e() {
        C13806c c13806c;
        if (this.f43623d.f43670h0 == 8) {
            return 0;
        }
        int i10 = this.f43627h;
        return (i10 == Integer.MIN_VALUE || (c13806c = this.f43625f) == null || c13806c.f43623d.f43670h0 != 8) ? this.f43626g : i10;
    }

    /* JADX INFO: renamed from: f */
    public final C13806c m15347f() {
        int i10 = this.f43624e;
        int iM24h = AbstractC0010F.m24h(i10);
        C13807d c13807d = this.f43623d;
        switch (iM24h) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c13807d.f43640L;
            case 2:
                return c13807d.f43641M;
            case 3:
                return c13807d.f43638J;
            case 4:
                return c13807d.f43639K;
            default:
                throw new AssertionError(AbstractC12107L1.m13833x(i10));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15348g() {
        HashSet hashSet = this.f43620a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C13806c) it.next()).m15347f().m15349h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15349h() {
        return this.f43625f != null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m15350i(C13806c c13806c) {
        if (c13806c == null) {
            return false;
        }
        C13807d c13807d = c13806c.f43623d;
        int i10 = this.f43624e;
        int i11 = c13806c.f43624e;
        if (i11 == i10) {
            return i10 != 6 || (c13807d.f43634F && this.f43623d.f43634F);
        }
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z6 = i11 == 2 || i11 == 4;
                if (c13807d instanceof C13811h) {
                    return z6 || i11 == 8;
                }
                return z6;
            case 2:
            case 4:
                boolean z10 = i11 == 3 || i11 == 5;
                if (c13807d instanceof C13811h) {
                    return z10 || i11 == 9;
                }
                return z10;
            case 5:
                return (i11 == 2 || i11 == 4) ? false : true;
            case 6:
                return (i11 == 6 || i11 == 8 || i11 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC12107L1.m13833x(i10));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15351j() {
        HashSet hashSet;
        C13806c c13806c = this.f43625f;
        if (c13806c != null && (hashSet = c13806c.f43620a) != null) {
            hashSet.remove(this);
            if (this.f43625f.f43620a.size() == 0) {
                this.f43625f.f43620a = null;
            }
        }
        this.f43620a = null;
        this.f43625f = null;
        this.f43626g = 0;
        this.f43627h = Integer.MIN_VALUE;
        this.f43622c = false;
        this.f43621b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m15352k() {
        C11221e c11221e = this.f43628i;
        if (c11221e == null) {
            this.f43628i = new C11221e(1);
        } else {
            c11221e.m12480c();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15353l(int i10) {
        this.f43621b = i10;
        this.f43622c = true;
    }

    public final String toString() {
        return this.f43623d.f43672i0 + ":" + AbstractC12107L1.m13833x(this.f43624e);
    }
}
