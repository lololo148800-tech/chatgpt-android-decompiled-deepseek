package p440S0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9339o3;

/* JADX INFO: renamed from: S0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6984j extends AbstractC6975a {

    /* JADX INFO: renamed from: o0 */
    public int f22329o0;

    /* JADX INFO: renamed from: p0 */
    public Object[] f22330p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f22331q0;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C6984j(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f22329o0 = i12;
        Object[] objArr2 = new Object[i12];
        this.f22330p0 = objArr2;
        ?? r6 = i10 == i11 ? 1 : 0;
        this.f22331q0 = r6;
        objArr2[0] = objArr;
        m7387b(i10 - r6, 1);
    }

    /* JADX INFO: renamed from: a */
    public final Object m7386a() {
        int i10 = this.f22303Y & 31;
        Object obj = this.f22330p0[this.f22329o0 - 1];
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    /* JADX INFO: renamed from: b */
    public final void m7387b(int i10, int i11) {
        int i12 = (this.f22329o0 - i11) * 5;
        while (i11 < this.f22329o0) {
            Object[] objArr = this.f22330p0;
            Object obj = objArr[i11 - 1];
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[AbstractC9339o3.m9935a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7388c(int i10) {
        int i11 = 0;
        while (AbstractC9339o3.m9935a(this.f22303Y, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            m7387b(this.f22303Y, ((this.f22329o0 - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM7386a = m7386a();
        int i10 = this.f22303Y + 1;
        this.f22303Y = i10;
        if (i10 == this.f22304Z) {
            this.f22331q0 = true;
            return objM7386a;
        }
        m7388c(0);
        return objM7386a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f22303Y--;
        if (this.f22331q0) {
            this.f22331q0 = false;
            return m7386a();
        }
        m7388c(31);
        return m7386a();
    }
}
