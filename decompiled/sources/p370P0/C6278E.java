package p370P0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p349O0.C5947D0;
import p349O0.C5997d;
import p571X9.AbstractC9221V;

/* JADX INFO: renamed from: P0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C6278E extends AbstractC9221V {

    /* JADX INFO: renamed from: b */
    public int f20387b;

    /* JADX INFO: renamed from: d */
    public int f20389d;

    /* JADX INFO: renamed from: f */
    public int f20391f;

    /* JADX INFO: renamed from: g */
    public int f20392g;

    /* JADX INFO: renamed from: h */
    public int f20393h;

    /* JADX INFO: renamed from: a */
    public AbstractC6276C[] f20386a = new AbstractC6276C[16];

    /* JADX INFO: renamed from: c */
    public int[] f20388c = new int[16];

    /* JADX INFO: renamed from: e */
    public Object[] f20390e = new Object[16];

    /* JADX INFO: renamed from: c */
    public static final int m6839c(C6278E c6278e, int i10) {
        c6278e.getClass();
        if (i10 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i10);
    }

    /* JADX INFO: renamed from: d */
    public final void m6840d() {
        this.f20387b = 0;
        this.f20389d = 0;
        Arrays.fill(this.f20390e, 0, this.f20391f, (Object) null);
        this.f20391f = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m6841e(AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        C6278E c6278e;
        int i10;
        if (m6843g()) {
            C6277D c6277d = new C6277D(this);
            do {
                c6278e = (C6278E) c6277d.f20385e;
                AbstractC6276C abstractC6276C = c6278e.f20386a[c6277d.f20382b];
                AbstractC16544l.m18091d(abstractC6276C);
                abstractC6276C.mo6757a(c6277d, abstractC0865o, c5947d0, c1313k);
                int i11 = c6277d.f20382b;
                if (i11 >= c6278e.f20387b) {
                    break;
                }
                AbstractC6276C abstractC6276C2 = c6278e.f20386a[i11];
                AbstractC16544l.m18091d(abstractC6276C2);
                c6277d.f20383c += abstractC6276C2.f20379a;
                c6277d.f20384d += abstractC6276C2.f20380b;
                i10 = c6277d.f20382b + 1;
                c6277d.f20382b = i10;
            } while (i10 < c6278e.f20387b);
        }
        m6840d();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6842f() {
        return this.f20387b == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6843g() {
        return this.f20387b != 0;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC6276C m6844h() {
        AbstractC6276C abstractC6276C = this.f20386a[this.f20387b - 1];
        AbstractC16544l.m18091d(abstractC6276C);
        return abstractC6276C;
    }

    /* JADX INFO: renamed from: i */
    public final void m6845i(AbstractC6276C abstractC6276C) {
        int i10 = abstractC6276C.f20379a;
        int i11 = abstractC6276C.f20380b;
        if (i10 == 0 && i11 == 0) {
            m6846j(abstractC6276C);
            return;
        }
        C5997d.m6443b0("Cannot push " + abstractC6276C + " without arguments because it expects " + i10 + " ints and " + i11 + " objects.");
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final void m6846j(AbstractC6276C abstractC6276C) {
        this.f20392g = 0;
        this.f20393h = 0;
        int i10 = this.f20387b;
        AbstractC6276C[] abstractC6276CArr = this.f20386a;
        if (i10 == abstractC6276CArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractC6276CArr, i10 + (i10 > 1024 ? 1024 : i10));
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f20386a = (AbstractC6276C[]) objArrCopyOf;
        }
        int i11 = this.f20389d + abstractC6276C.f20379a;
        int[] iArr = this.f20388c;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length + (length > 1024 ? 1024 : length);
            if (i12 >= i11) {
                i11 = i12;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
            this.f20388c = iArrCopyOf;
        }
        int i13 = this.f20391f;
        int i14 = abstractC6276C.f20380b;
        int i15 = i13 + i14;
        Object[] objArr = this.f20390e;
        int length2 = objArr.length;
        if (i15 > length2) {
            int i16 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i16 >= i15) {
                i15 = i16;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i15);
            AbstractC16544l.m18093f(objArrCopyOf2, "copyOf(this, newSize)");
            this.f20390e = objArrCopyOf2;
        }
        AbstractC6276C[] abstractC6276CArr2 = this.f20386a;
        int i17 = this.f20387b;
        this.f20387b = i17 + 1;
        abstractC6276CArr2[i17] = abstractC6276C;
        this.f20389d += abstractC6276C.f20379a;
        this.f20391f += i14;
    }
}
