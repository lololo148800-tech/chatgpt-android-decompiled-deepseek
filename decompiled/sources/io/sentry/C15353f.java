package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: renamed from: io.sentry.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15353f extends AbstractCollection implements Queue, Serializable {

    /* JADX INFO: renamed from: Y */
    public final transient Object[] f47934Y;

    /* JADX INFO: renamed from: Z */
    public transient int f47935Z = 0;

    /* JADX INFO: renamed from: o0 */
    public transient int f47936o0 = 0;

    /* JADX INFO: renamed from: p0 */
    public transient boolean f47937p0 = false;

    /* JADX INFO: renamed from: q0 */
    public final int f47938q0;

    public C15353f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i10];
        this.f47934Y = objArr;
        this.f47938q0 = objArr.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i10 = this.f47938q0;
        if (size == i10) {
            remove();
        }
        int i11 = this.f47936o0;
        int i12 = i11 + 1;
        this.f47936o0 = i12;
        this.f47934Y[i11] = obj;
        if (i12 >= i10) {
            this.f47936o0 = 0;
        }
        if (this.f47936o0 == this.f47935Z) {
            this.f47937p0 = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f47937p0 = false;
        this.f47935Z = 0;
        this.f47936o0 = 0;
        Arrays.fill(this.f47934Y, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C15348e(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f47934Y[this.f47935Z];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        int i10 = this.f47935Z;
        Object[] objArr = this.f47934Y;
        Object obj = objArr[i10];
        if (obj != null) {
            int i11 = i10 + 1;
            this.f47935Z = i11;
            objArr[i10] = null;
            if (i11 >= this.f47938q0) {
                this.f47935Z = 0;
            }
            this.f47937p0 = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i10 = this.f47936o0;
        int i11 = this.f47935Z;
        int i12 = this.f47938q0;
        if (i10 < i11) {
            return (i12 - i11) + i10;
        }
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.f47937p0) {
            return i12;
        }
        return 0;
    }
}
