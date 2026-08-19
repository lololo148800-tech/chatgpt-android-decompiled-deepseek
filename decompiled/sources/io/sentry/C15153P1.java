package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: renamed from: io.sentry.P1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15153P1 implements Queue, Collection, Serializable {

    /* JADX INFO: renamed from: Y */
    public final Queue f47169Y;

    /* JADX INFO: renamed from: Z */
    public final C15153P1 f47170Z = this;

    public C15153P1(Queue queue) {
        this.f47169Y = queue;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f47170Z) {
            zAdd = this.f47169Y.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f47170Z) {
            zAddAll = this.f47169Y.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f47170Z) {
            this.f47169Y.clear();
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f47170Z) {
            zContains = this.f47169Y.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f47170Z) {
            zContainsAll = this.f47169Y.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Queue
    public final Object element() {
        Object objElement;
        synchronized (this.f47170Z) {
            objElement = this.f47169Y.element();
        }
        return objElement;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f47170Z) {
            zEquals = this.f47169Y.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f47170Z) {
            iHashCode = this.f47169Y.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f47170Z) {
            zIsEmpty = this.f47169Y.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f47169Y.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        boolean zOffer;
        synchronized (this.f47170Z) {
            zOffer = this.f47169Y.offer(obj);
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public final Object peek() {
        Object objPeek;
        synchronized (this.f47170Z) {
            objPeek = this.f47169Y.peek();
        }
        return objPeek;
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object objPoll;
        synchronized (this.f47170Z) {
            objPoll = this.f47169Y.poll();
        }
        return objPoll;
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object objRemove;
        synchronized (this.f47170Z) {
            objRemove = this.f47169Y.remove();
        }
        return objRemove;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f47170Z) {
            zRemoveAll = this.f47169Y.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f47170Z) {
            zRetainAll = this.f47169Y.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f47170Z) {
            size = this.f47169Y.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f47170Z) {
            array = this.f47169Y.toArray();
        }
        return array;
    }

    public final String toString() {
        String string;
        synchronized (this.f47170Z) {
            string = this.f47169Y.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f47170Z) {
            zRemove = this.f47169Y.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f47170Z) {
            array = this.f47169Y.toArray(objArr);
        }
        return array;
    }
}
