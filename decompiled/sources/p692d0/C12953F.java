package p692d0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;
import p076Cm.InterfaceC1728f;
import p491U0.C7535c;

/* JADX INFO: renamed from: d0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C12953F implements InterfaceC1728f, Set, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C12954G f41141Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C12954G f41142Z;

    public C12953F(C12954G c12954g) {
        this.f41142Z = c12954g;
        this.f41141Y = c12954g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f41142Z.m14624a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        C12954G c12954g = this.f41142Z;
        int i10 = c12954g.f41146d;
        for (Object obj : elements) {
            c12954g.f41144b[c12954g.m14627d(obj)] = obj;
        }
        return i10 != c12954g.f41146d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f41142Z.m14625b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41141Y.m14626c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f41141Y.m14626c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f41141Y.m14630g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C7535c(this.f41142Z);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f41142Z.m14633j(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        int iHashCode;
        int iNumberOfTrailingZeros;
        AbstractC16544l.m18094g(elements, "elements");
        C12954G c12954g = this.f41142Z;
        int i10 = c12954g.f41146d;
        Iterator it = elements.iterator();
        while (true) {
            int i11 = 1;
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                c12954g.getClass();
                iHashCode = next.hashCode();
            } else {
                iHashCode = 0;
            }
            int i13 = iHashCode * (-862048943);
            int i14 = i13 ^ (i13 << 16);
            int i15 = i14 & 127;
            int i16 = c12954g.f41145c;
            int i17 = (i14 >>> 7) & i16;
            while (true) {
                long[] jArr = c12954g.f41143a;
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                int i20 = i12;
                long j10 = (((-i19) >> 63) & (jArr[i18 + i11] << (64 - i19))) | (jArr[i18] >>> i19);
                long j11 = (((long) i15) * 72340172838076673L) ^ j10;
                for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i17) & i16;
                    if (AbstractC16544l.m18089b(c12954g.f41144b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                }
                if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i12 = i20 + 8;
                i17 = (i17 + i12) & i16;
                i11 = 1;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c12954g.m14634k(iNumberOfTrailingZeros);
            }
        }
        return i10 != c12954g.f41146d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC16544l.m18094g(elements, "elements");
        C12954G c12954g = this.f41142Z;
        long[] jArr = c12954g.f41143a;
        int length = jArr.length - 2;
        boolean z6 = false;
        if (length >= 0) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!elements.contains(c12954g.f41144b[i13])) {
                                c12954g.m14634k(i13);
                                z10 = true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return z10;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    z6 = z10;
                }
            }
        }
        return z6;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f41141Y.f41146d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC16543k.m18086a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        return AbstractC16543k.m18087b(this, array);
    }
}
