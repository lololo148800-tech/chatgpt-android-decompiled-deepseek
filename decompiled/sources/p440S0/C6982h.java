package p440S0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: S0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6982h extends AbstractC6975a {

    /* JADX INFO: renamed from: o0 */
    public final C6980f f22323o0;

    /* JADX INFO: renamed from: p0 */
    public int f22324p0;

    /* JADX INFO: renamed from: q0 */
    public C6984j f22325q0;

    /* JADX INFO: renamed from: r0 */
    public int f22326r0;

    public C6982h(C6980f c6980f, int i10) {
        super(i10, c6980f.mo7371f());
        this.f22323o0 = c6980f;
        this.f22324p0 = c6980f.m7374q();
        this.f22326r0 = -1;
        m7385b();
    }

    /* JADX INFO: renamed from: a */
    public final void m7384a() {
        if (this.f22324p0 != this.f22323o0.m7374q()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p440S0.AbstractC6975a, java.util.ListIterator
    public final void add(Object obj) {
        m7384a();
        int i10 = this.f22303Y;
        C6980f c6980f = this.f22323o0;
        c6980f.add(i10, obj);
        this.f22303Y++;
        this.f22304Z = c6980f.mo7371f();
        this.f22324p0 = c6980f.m7374q();
        this.f22326r0 = -1;
        m7385b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: b */
    public final void m7385b() {
        C6980f c6980f = this.f22323o0;
        Object[] objArr = c6980f.f22318r0;
        if (objArr == null) {
            this.f22325q0 = null;
            return;
        }
        int i10 = (c6980f.f22320t0 - 1) & (-32);
        int i11 = this.f22303Y;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (c6980f.f22316p0 / 5) + 1;
        C6984j c6984j = this.f22325q0;
        if (c6984j == null) {
            this.f22325q0 = new C6984j(objArr, i11, i10, i12);
            return;
        }
        c6984j.f22303Y = i11;
        c6984j.f22304Z = i10;
        c6984j.f22329o0 = i12;
        if (c6984j.f22330p0.length < i12) {
            c6984j.f22330p0 = new Object[i12];
        }
        c6984j.f22330p0[0] = objArr;
        ?? r6 = i11 == i10 ? 1 : 0;
        c6984j.f22331q0 = r6;
        c6984j.m7387b(i11 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m7384a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f22303Y;
        this.f22326r0 = i10;
        C6984j c6984j = this.f22325q0;
        C6980f c6980f = this.f22323o0;
        if (c6984j == null) {
            Object[] objArr = c6980f.f22319s0;
            this.f22303Y = i10 + 1;
            return objArr[i10];
        }
        if (c6984j.hasNext()) {
            this.f22303Y++;
            return c6984j.next();
        }
        Object[] objArr2 = c6980f.f22319s0;
        int i11 = this.f22303Y;
        this.f22303Y = i11 + 1;
        return objArr2[i11 - c6984j.f22304Z];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m7384a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f22303Y;
        this.f22326r0 = i10 - 1;
        C6984j c6984j = this.f22325q0;
        C6980f c6980f = this.f22323o0;
        if (c6984j == null) {
            Object[] objArr = c6980f.f22319s0;
            int i11 = i10 - 1;
            this.f22303Y = i11;
            return objArr[i11];
        }
        int i12 = c6984j.f22304Z;
        if (i10 <= i12) {
            this.f22303Y = i10 - 1;
            return c6984j.previous();
        }
        Object[] objArr2 = c6980f.f22319s0;
        int i13 = i10 - 1;
        this.f22303Y = i13;
        return objArr2[i13 - i12];
    }

    @Override // p440S0.AbstractC6975a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m7384a();
        int i10 = this.f22326r0;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        C6980f c6980f = this.f22323o0;
        c6980f.mo7372j(i10);
        int i11 = this.f22326r0;
        if (i11 < this.f22303Y) {
            this.f22303Y = i11;
        }
        this.f22304Z = c6980f.mo7371f();
        this.f22324p0 = c6980f.m7374q();
        this.f22326r0 = -1;
        m7385b();
    }

    @Override // p440S0.AbstractC6975a, java.util.ListIterator
    public final void set(Object obj) {
        m7384a();
        int i10 = this.f22326r0;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        C6980f c6980f = this.f22323o0;
        c6980f.set(i10, obj);
        this.f22324p0 = c6980f.m7374q();
        m7385b();
    }
}
