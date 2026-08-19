package p466T0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9124E3;

/* JADX INFO: renamed from: T0.f */
/* JADX INFO: loaded from: classes.dex */
public class C7179f extends AbstractC7177d {

    /* JADX INFO: renamed from: p0 */
    public final C7178e f22822p0;

    /* JADX INFO: renamed from: q0 */
    public Object f22823q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f22824r0;

    /* JADX INFO: renamed from: s0 */
    public int f22825s0;

    public C7179f(C7178e c7178e, AbstractC7188o[] abstractC7188oArr) {
        super(c7178e.f22818o0, abstractC7188oArr);
        this.f22822p0 = c7178e;
        this.f22825s0 = c7178e.f22820q0;
    }

    /* JADX INFO: renamed from: c */
    public final void m7560c(int i10, C7187n c7187n, Object obj, int i11) {
        int i12 = i11 * 5;
        AbstractC7188o[] abstractC7188oArr = this.f22813Y;
        if (i12 <= 30) {
            int iM9658d = 1 << AbstractC9124E3.m9658d(i10, i12);
            if (c7187n.m7570h(iM9658d)) {
                abstractC7188oArr[i11].m7586a(c7187n.f22840d, Integer.bitCount(c7187n.f22837a) * 2, c7187n.m7568f(iM9658d));
                this.f22814Z = i11;
                return;
            } else {
                int iM7581t = c7187n.m7581t(iM9658d);
                C7187n c7187nM7580s = c7187n.m7580s(iM7581t);
                abstractC7188oArr[i11].m7586a(c7187n.f22840d, Integer.bitCount(c7187n.f22837a) * 2, iM7581t);
                m7560c(i10, c7187nM7580s, obj, i11 + 1);
                return;
            }
        }
        AbstractC7188o abstractC7188o = abstractC7188oArr[i11];
        Object[] objArr = c7187n.f22840d;
        abstractC7188o.m7586a(objArr, objArr.length, 0);
        while (true) {
            AbstractC7188o abstractC7188o2 = abstractC7188oArr[i11];
            if (AbstractC16544l.m18089b(abstractC7188o2.f22841Y[abstractC7188o2.f22843o0], obj)) {
                this.f22814Z = i11;
                return;
            } else {
                abstractC7188oArr[i11].f22843o0 += 2;
            }
        }
    }

    @Override // p466T0.AbstractC7177d, java.util.Iterator
    public final Object next() {
        if (this.f22822p0.f22820q0 != this.f22825s0) {
            throw new ConcurrentModificationException();
        }
        if (!this.f22815o0) {
            throw new NoSuchElementException();
        }
        AbstractC7188o abstractC7188o = this.f22813Y[this.f22814Z];
        this.f22823q0 = abstractC7188o.f22841Y[abstractC7188o.f22843o0];
        this.f22824r0 = true;
        return super.next();
    }

    @Override // p466T0.AbstractC7177d, java.util.Iterator
    public final void remove() {
        if (!this.f22824r0) {
            throw new IllegalStateException();
        }
        boolean z6 = this.f22815o0;
        C7178e c7178e = this.f22822p0;
        if (!z6) {
            AbstractC16529F.m18079c(c7178e).remove(this.f22823q0);
        } else {
            if (!z6) {
                throw new NoSuchElementException();
            }
            AbstractC7188o abstractC7188o = this.f22813Y[this.f22814Z];
            Object obj = abstractC7188o.f22841Y[abstractC7188o.f22843o0];
            AbstractC16529F.m18079c(c7178e).remove(this.f22823q0);
            m7560c(obj != null ? obj.hashCode() : 0, c7178e.f22818o0, obj, 0);
        }
        this.f22823q0 = null;
        this.f22824r0 = false;
        this.f22825s0 = c7178e.f22820q0;
    }
}
