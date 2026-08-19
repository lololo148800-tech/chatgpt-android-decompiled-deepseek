package p303M1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p026Ao.AbstractC0668b;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p140Fa.C2685e;
import p666bl.C11500p;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import to.AbstractC20013d;
import to.AbstractC20032w;
import to.C20011b;
import to.C20025p;

/* JADX INFO: renamed from: M1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5276b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17344a;

    /* JADX INFO: renamed from: b */
    public int f17345b;

    /* JADX INFO: renamed from: c */
    public int f17346c;

    /* JADX INFO: renamed from: d */
    public int f17347d;

    /* JADX INFO: renamed from: e */
    public int f17348e;

    /* JADX INFO: renamed from: f */
    public final Object f17349f;

    /* JADX INFO: renamed from: g */
    public final Object f17350g;

    /* JADX INFO: renamed from: h */
    public Object f17351h;

    public C5276b(int i10) {
        this.f17344a = 0;
        this.f17349f = new C2685e();
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f17346c = i10;
        this.f17350g = new HashMap(0, 0.75f);
        this.f17351h = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public int m5784a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = ((C20011b[]) this.f17351h).length;
            while (true) {
                length--;
                i11 = this.f17346c;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                C20011b c20011b = ((C20011b[]) this.f17351h)[length];
                AbstractC16544l.m18091d(c20011b);
                int i13 = c20011b.f63338c;
                i10 -= i13;
                this.f17348e -= i13;
                this.f17347d--;
                i12++;
            }
            C20011b[] c20011bArr = (C20011b[]) this.f17351h;
            System.arraycopy(c20011bArr, i11 + 1, c20011bArr, i11 + 1 + i12, this.f17347d);
            this.f17346c += i12;
        }
        return i12;
    }

    /* JADX INFO: renamed from: b */
    public Object m5785b(Object obj) {
        synchronized (((C2685e) this.f17349f)) {
            Object obj2 = ((HashMap) this.f17350g).get(obj);
            if (obj2 == null) {
                this.f17348e++;
                return null;
            }
            ((LinkedHashSet) this.f17351h).remove(obj);
            ((LinkedHashSet) this.f17351h).add(obj);
            this.f17347d++;
            return obj2;
        }
    }

    /* JADX INFO: renamed from: c */
    public C0678l m5786c(int i10) throws IOException {
        if (i10 >= 0) {
            C20011b[] c20011bArr = AbstractC20013d.f63348a;
            if (i10 <= c20011bArr.length - 1) {
                return c20011bArr[i10].f63336a;
            }
        }
        int length = this.f17346c + 1 + (i10 - AbstractC20013d.f63348a.length);
        if (length >= 0) {
            C20011b[] c20011bArr2 = (C20011b[]) this.f17351h;
            if (length < c20011bArr2.length) {
                C20011b c20011b = c20011bArr2[length];
                AbstractC16544l.m18091d(c20011b);
                return c20011b.f63336a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    /* JADX INFO: renamed from: d */
    public void m5787d(C20011b c20011b) {
        ((ArrayList) this.f17349f).add(c20011b);
        int i10 = this.f17345b;
        int i11 = c20011b.f63338c;
        if (i11 > i10) {
            C20011b[] c20011bArr = (C20011b[]) this.f17351h;
            AbstractC17678l.m19311r(c20011bArr, null, 0, c20011bArr.length);
            this.f17346c = ((C20011b[]) this.f17351h).length - 1;
            this.f17347d = 0;
            this.f17348e = 0;
            return;
        }
        m5784a((this.f17348e + i11) - i10);
        int i12 = this.f17347d + 1;
        C20011b[] c20011bArr2 = (C20011b[]) this.f17351h;
        if (i12 > c20011bArr2.length) {
            C20011b[] c20011bArr3 = new C20011b[c20011bArr2.length * 2];
            System.arraycopy(c20011bArr2, 0, c20011bArr3, c20011bArr2.length, c20011bArr2.length);
            this.f17346c = ((C20011b[]) this.f17351h).length - 1;
            this.f17351h = c20011bArr3;
        }
        int i13 = this.f17346c;
        this.f17346c = i13 - 1;
        ((C20011b[]) this.f17351h)[i13] = c20011b;
        this.f17347d++;
        this.f17348e += i11;
    }

    /* JADX INFO: renamed from: e */
    public Object m5788e(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (((C2685e) this.f17349f)) {
            try {
                this.f17345b = m5792i() + 1;
                objPut = ((HashMap) this.f17350g).put(obj, obj2);
                if (objPut != null) {
                    this.f17345b = m5792i() - 1;
                }
                if (((LinkedHashSet) this.f17351h).contains(obj)) {
                    ((LinkedHashSet) this.f17351h).remove(obj);
                }
                ((LinkedHashSet) this.f17351h).add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m5793j(this.f17346c);
        return objPut;
    }

    /* JADX INFO: renamed from: f */
    public C0678l m5789f() {
        int i10;
        C0657F source = (C0657F) this.f17350g;
        byte b = source.readByte();
        byte[] bArr = AbstractC17708b.f56536a;
        int i11 = b & 255;
        int i12 = 0;
        boolean z6 = (b & 128) == 128;
        long jM5790g = m5790g(i11, 127);
        if (!z6) {
            return source.m1352a(jM5790g);
        }
        C0675i c0675i = new C0675i();
        int[] iArr = AbstractC20032w.f63448a;
        AbstractC16544l.m18094g(source, "source");
        C11500p c11500p = AbstractC20032w.f63450c;
        C11500p c11500p2 = c11500p;
        int i13 = 0;
        for (long j10 = 0; j10 < jM5790g; j10++) {
            byte b10 = source.readByte();
            byte[] bArr2 = AbstractC17708b.f56536a;
            i12 = (i12 << 8) | (b10 & 255);
            i13 += 8;
            while (i13 >= 8) {
                C11500p[] c11500pArr = (C11500p[]) c11500p2.f34810p0;
                AbstractC16544l.m18091d(c11500pArr);
                c11500p2 = c11500pArr[(i12 >>> (i13 - 8)) & 255];
                AbstractC16544l.m18091d(c11500p2);
                if (((C11500p[]) c11500p2.f34810p0) == null) {
                    c0675i.m1436f1(c11500p2.f34808Z);
                    i13 -= c11500p2.f34809o0;
                    c11500p2 = c11500p;
                } else {
                    i13 -= 8;
                }
            }
        }
        while (i13 > 0) {
            C11500p[] c11500pArr2 = (C11500p[]) c11500p2.f34810p0;
            AbstractC16544l.m18091d(c11500pArr2);
            C11500p c11500p3 = c11500pArr2[(i12 << (8 - i13)) & 255];
            AbstractC16544l.m18091d(c11500p3);
            if (((C11500p[]) c11500p3.f34810p0) != null || (i10 = c11500p3.f34809o0) > i13) {
                break;
            }
            c0675i.m1436f1(c11500p3.f34808Z);
            i13 -= i10;
            c11500p2 = c11500p;
        }
        return c0675i.m1417C0(c0675i.f1970Z);
    }

    /* JADX INFO: renamed from: g */
    public int m5790g(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte b = ((C0657F) this.f17350g).readByte();
            byte[] bArr = AbstractC17708b.f56536a;
            int i14 = b & 255;
            if ((b & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (b & 127) << i13;
            i13 += 7;
        }
    }

    /* JADX INFO: renamed from: h */
    public Object m5791h(Object obj) {
        Object objRemove;
        synchronized (((C2685e) this.f17349f)) {
            objRemove = ((HashMap) this.f17350g).remove(obj);
            ((LinkedHashSet) this.f17351h).remove(obj);
            if (objRemove != null) {
                this.f17345b = m5792i() - 1;
            }
        }
        return objRemove;
    }

    /* JADX INFO: renamed from: i */
    public int m5792i() {
        int i10;
        synchronized (((C2685e) this.f17349f)) {
            i10 = this.f17345b;
        }
        return i10;
    }

    /* JADX INFO: renamed from: j */
    public void m5793j(int i10) {
        Object objM19340P;
        Object obj;
        while (true) {
            synchronized (((C2685e) this.f17349f)) {
                try {
                    if (m5792i() >= 0 && (!((HashMap) this.f17350g).isEmpty() || m5792i() == 0)) {
                        if (((HashMap) this.f17350g).isEmpty() != ((LinkedHashSet) this.f17351h).isEmpty()) {
                            break;
                        }
                        if (m5792i() <= i10 || ((HashMap) this.f17350g).isEmpty()) {
                            objM19340P = null;
                            obj = null;
                        } else {
                            objM19340P = AbstractC17680n.m19340P((LinkedHashSet) this.f17351h);
                            obj = ((HashMap) this.f17350g).get(objM19340P);
                            if (obj == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            AbstractC16529F.m18079c((HashMap) this.f17350g).remove(objM19340P);
                            LinkedHashSet linkedHashSet = (LinkedHashSet) this.f17351h;
                            AbstractC16529F.m18077a(linkedHashSet);
                            linkedHashSet.remove(objM19340P);
                            int iM5792i = m5792i();
                            AbstractC16544l.m18091d(objM19340P);
                            this.f17345b = iM5792i - 1;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objM19340P == null && obj == null) {
                return;
            }
            AbstractC16544l.m18091d(objM19340P);
            AbstractC16544l.m18091d(obj);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public String toString() {
        String str;
        switch (this.f17344a) {
            case 0:
                synchronized (((C2685e) this.f17349f)) {
                    try {
                        int i10 = this.f17347d;
                        int i11 = this.f17348e + i10;
                        str = "LruCache[maxSize=" + this.f17346c + ",hits=" + this.f17347d + ",misses=" + this.f17348e + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C5276b(C20025p c20025p) {
        this.f17344a = 1;
        this.f17345b = 4096;
        this.f17349f = new ArrayList();
        this.f17350g = AbstractC0668b.m1403c(c20025p);
        this.f17351h = new C20011b[8];
        this.f17346c = 7;
    }
}
