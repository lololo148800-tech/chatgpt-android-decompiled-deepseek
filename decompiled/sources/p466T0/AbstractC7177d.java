package p466T0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: T0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7177d implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final AbstractC7188o[] f22813Y;

    /* JADX INFO: renamed from: Z */
    public int f22814Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f22815o0 = true;

    public AbstractC7177d(C7187n c7187n, AbstractC7188o[] abstractC7188oArr) {
        this.f22813Y = abstractC7188oArr;
        abstractC7188oArr[0].m7586a(c7187n.f22840d, Integer.bitCount(c7187n.f22837a) * 2, 0);
        this.f22814Z = 0;
        m7556a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7556a() {
        int i10 = this.f22814Z;
        AbstractC7188o[] abstractC7188oArr = this.f22813Y;
        AbstractC7188o abstractC7188o = abstractC7188oArr[i10];
        if (abstractC7188o.f22843o0 < abstractC7188o.f22842Z) {
            return;
        }
        while (-1 < i10) {
            int iM7557b = m7557b(i10);
            if (iM7557b == -1) {
                AbstractC7188o abstractC7188o2 = abstractC7188oArr[i10];
                int i11 = abstractC7188o2.f22843o0;
                Object[] objArr = abstractC7188o2.f22841Y;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    abstractC7188o2.f22843o0 = i11 + 1;
                    iM7557b = m7557b(i10);
                }
            }
            if (iM7557b != -1) {
                this.f22814Z = iM7557b;
                return;
            }
            if (i10 > 0) {
                AbstractC7188o abstractC7188o3 = abstractC7188oArr[i10 - 1];
                int i12 = abstractC7188o3.f22843o0;
                int length2 = abstractC7188o3.f22841Y.length;
                abstractC7188o3.f22843o0 = i12 + 1;
            }
            abstractC7188oArr[i10].m7586a(C7187n.f22836e.f22840d, 0, 0);
            i10--;
        }
        this.f22815o0 = false;
    }

    /* JADX INFO: renamed from: b */
    public final int m7557b(int i10) {
        AbstractC7188o[] abstractC7188oArr = this.f22813Y;
        AbstractC7188o abstractC7188o = abstractC7188oArr[i10];
        int i11 = abstractC7188o.f22843o0;
        if (i11 < abstractC7188o.f22842Z) {
            return i10;
        }
        Object[] objArr = abstractC7188o.f22841Y;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        C7187n c7187n = (C7187n) obj;
        if (i10 == 6) {
            AbstractC7188o abstractC7188o2 = abstractC7188oArr[i10 + 1];
            Object[] objArr2 = c7187n.f22840d;
            abstractC7188o2.m7586a(objArr2, objArr2.length, 0);
        } else {
            abstractC7188oArr[i10 + 1].m7586a(c7187n.f22840d, Integer.bitCount(c7187n.f22837a) * 2, 0);
        }
        return m7557b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22815o0;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f22815o0) {
            throw new NoSuchElementException();
        }
        Object next = this.f22813Y[this.f22814Z].next();
        m7556a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
