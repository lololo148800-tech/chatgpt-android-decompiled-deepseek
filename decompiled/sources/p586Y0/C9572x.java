package p586Y0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18234a;
import om.C18235b;
import p076Cm.InterfaceC1723a;
import p1140z1.C21713r;
import p379Pb.LVf.efyhmdM;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: Y0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C9572x implements ListIterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28804Y;

    /* JADX INFO: renamed from: Z */
    public int f28805Z;

    /* JADX INFO: renamed from: o0 */
    public int f28806o0;

    /* JADX INFO: renamed from: p0 */
    public int f28807p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f28808q0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9572x(C21713r c21713r, int i10, int i11) {
        this(c21713r, (i11 & 1) != 0 ? 0 : i10, 0, c21713r.f68889p0);
        this.f28804Y = 3;
    }

    /* JADX INFO: renamed from: a */
    public void m10125a() {
        if (((AbstractList) ((C18234a) this.f28808q0).f58101q0).modCount != this.f28807p0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f28804Y) {
            case 0:
                m10127c();
                int i10 = this.f28805Z + 1;
                C9566r c9566r = (C9566r) this.f28808q0;
                c9566r.add(i10, obj);
                this.f28806o0 = -1;
                this.f28805Z++;
                this.f28807p0 = c9566r.m10104q();
                return;
            case 1:
                m10125a();
                int i11 = this.f28805Z;
                this.f28805Z = i11 + 1;
                C18234a c18234a = (C18234a) this.f28808q0;
                c18234a.add(i11, obj);
                this.f28806o0 = -1;
                this.f28807p0 = ((AbstractList) c18234a).modCount;
                return;
            case 2:
                m10126b();
                int i12 = this.f28805Z;
                this.f28805Z = i12 + 1;
                C18235b c18235b = (C18235b) this.f28808q0;
                c18235b.add(i12, obj);
                this.f28806o0 = -1;
                this.f28807p0 = ((AbstractList) c18235b).modCount;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10126b() {
        if (((AbstractList) ((C18235b) this.f28808q0)).modCount != this.f28807p0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10127c() {
        if (((C9566r) this.f28808q0).m10104q() != this.f28807p0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f28804Y) {
            case 0:
                return this.f28805Z < ((C9566r) this.f28808q0).size() - 1;
            case 1:
                return this.f28805Z < ((C18234a) this.f28808q0).f58099o0;
            case 2:
                return this.f28805Z < ((C18235b) this.f28808q0).f58104Z;
            default:
                return this.f28805Z < this.f28807p0;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f28804Y) {
            case 0:
                return this.f28805Z >= 0;
            case 1:
                return this.f28805Z > 0;
            case 2:
                return this.f28805Z > 0;
            default:
                return this.f28805Z > this.f28806o0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f28804Y) {
            case 0:
                m10127c();
                int i10 = this.f28805Z + 1;
                this.f28806o0 = i10;
                C9566r c9566r = (C9566r) this.f28808q0;
                AbstractC9567s.m10106a(i10, c9566r.size());
                Object obj = c9566r.get(i10);
                this.f28805Z = i10;
                return obj;
            case 1:
                m10125a();
                int i11 = this.f28805Z;
                C18234a c18234a = (C18234a) this.f28808q0;
                if (i11 >= c18234a.f58099o0) {
                    throw new NoSuchElementException();
                }
                this.f28805Z = i11 + 1;
                this.f28806o0 = i11;
                return c18234a.f58097Y[c18234a.f58098Z + i11];
            case 2:
                m10126b();
                int i12 = this.f28805Z;
                C18235b c18235b = (C18235b) this.f28808q0;
                if (i12 >= c18235b.f58104Z) {
                    throw new NoSuchElementException();
                }
                this.f28805Z = i12 + 1;
                this.f28806o0 = i12;
                return c18235b.f58103Y[i12];
            default:
                Object[] objArr = ((C21713r) this.f28808q0).f68886Y;
                int i13 = this.f28805Z;
                this.f28805Z = i13 + 1;
                Object obj2 = objArr[i13];
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC10458p) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f28804Y) {
            case 0:
                return this.f28805Z + 1;
            case 1:
                return this.f28805Z;
            case 2:
                return this.f28805Z;
            default:
                return this.f28805Z - this.f28806o0;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f28804Y) {
            case 0:
                m10127c();
                int i10 = this.f28805Z;
                C9566r c9566r = (C9566r) this.f28808q0;
                AbstractC9567s.m10106a(i10, c9566r.size());
                int i11 = this.f28805Z;
                this.f28806o0 = i11;
                Object obj = c9566r.get(i11);
                this.f28805Z--;
                return obj;
            case 1:
                m10125a();
                int i12 = this.f28805Z;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f28805Z = i13;
                this.f28806o0 = i13;
                C18234a c18234a = (C18234a) this.f28808q0;
                return c18234a.f58097Y[c18234a.f58098Z + i13];
            case 2:
                m10126b();
                int i14 = this.f28805Z;
                if (i14 <= 0) {
                    throw new NoSuchElementException();
                }
                int i15 = i14 - 1;
                this.f28805Z = i15;
                this.f28806o0 = i15;
                return ((C18235b) this.f28808q0).f58103Y[i15];
            default:
                Object[] objArr = ((C21713r) this.f28808q0).f68886Y;
                int i16 = this.f28805Z - 1;
                this.f28805Z = i16;
                Object obj2 = objArr[i16];
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC10458p) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f28804Y) {
            case 0:
                return this.f28805Z;
            case 1:
                return this.f28805Z - 1;
            case 2:
                return this.f28805Z - 1;
            default:
                return (this.f28805Z - this.f28806o0) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f28804Y) {
            case 0:
                m10127c();
                int i10 = this.f28805Z;
                C9566r c9566r = (C9566r) this.f28808q0;
                c9566r.remove(i10);
                this.f28805Z--;
                this.f28806o0 = -1;
                this.f28807p0 = c9566r.m10104q();
                return;
            case 1:
                m10125a();
                int i11 = this.f28806o0;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C18234a c18234a = (C18234a) this.f28808q0;
                c18234a.mo7372j(i11);
                this.f28805Z = this.f28806o0;
                this.f28806o0 = -1;
                this.f28807p0 = ((AbstractList) c18234a).modCount;
                return;
            case 2:
                m10126b();
                int i12 = this.f28806o0;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C18235b c18235b = (C18235b) this.f28808q0;
                c18235b.mo7372j(i12);
                this.f28805Z = this.f28806o0;
                this.f28806o0 = -1;
                this.f28807p0 = ((AbstractList) c18235b).modCount;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f28804Y) {
            case 0:
                m10127c();
                int i10 = this.f28806o0;
                if (i10 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                C9566r c9566r = (C9566r) this.f28808q0;
                c9566r.set(i10, obj);
                this.f28807p0 = c9566r.m10104q();
                return;
            case 1:
                m10125a();
                int i11 = this.f28806o0;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C18234a) this.f28808q0).set(i11, obj);
                return;
            case 2:
                m10126b();
                int i12 = this.f28806o0;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C18235b) this.f28808q0).set(i12, obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C9572x(C21713r c21713r, int i10, int i11, int i12) {
        this.f28804Y = 3;
        this.f28808q0 = c21713r;
        this.f28805Z = i10;
        this.f28806o0 = i11;
        this.f28807p0 = i12;
    }

    public C9572x(C18235b c18235b, int i10) {
        this.f28804Y = 2;
        AbstractC16544l.m18094g(c18235b, efyhmdM.mpeP);
        this.f28808q0 = c18235b;
        this.f28805Z = i10;
        this.f28806o0 = -1;
        this.f28807p0 = ((AbstractList) c18235b).modCount;
    }

    public C9572x(C9566r c9566r, int i10) {
        this.f28804Y = 0;
        this.f28808q0 = c9566r;
        this.f28805Z = i10 - 1;
        this.f28806o0 = -1;
        this.f28807p0 = c9566r.m10104q();
    }

    public C9572x(C18234a list, int i10) {
        this.f28804Y = 1;
        AbstractC16544l.m18094g(list, "list");
        this.f28808q0 = list;
        this.f28805Z = i10;
        this.f28806o0 = -1;
        this.f28807p0 = ((AbstractList) list).modCount;
    }
}
