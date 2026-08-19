package bj;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: bj.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C11446K {

    /* JADX INFO: renamed from: a */
    public final ArrayList f34605a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f34606b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public boolean f34607c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C11447L f34608d;

    public C11446K(C11447L c11447l) {
        this.f34608d = c11447l;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m12847a(IllegalArgumentException illegalArgumentException) {
        if (this.f34607c) {
            return illegalArgumentException;
        }
        this.f34607c = true;
        ArrayDeque arrayDeque = this.f34606b;
        if (arrayDeque.size() == 1 && ((C11445J) arrayDeque.getFirst()).f34602b == null) {
            return illegalArgumentException;
        }
        StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C11445J c11445j = (C11445J) itDescendingIterator.next();
            sb2.append("\nfor ");
            sb2.append(c11445j.f34601a);
            String str = c11445j.f34602b;
            if (str != null) {
                sb2.append(' ');
                sb2.append(str);
            }
        }
        return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
    }

    /* JADX INFO: renamed from: b */
    public final void m12848b(boolean z6) {
        this.f34606b.removeLast();
        if (this.f34606b.isEmpty()) {
            this.f34608d.f34611b.remove();
            if (z6) {
                synchronized (this.f34608d.f34612c) {
                    try {
                        int size = this.f34605a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            C11445J c11445j = (C11445J) this.f34605a.get(i10);
                            AbstractC11471r abstractC11471r = (AbstractC11471r) this.f34608d.f34612c.put(c11445j.f34603c, c11445j.f34604d);
                            if (abstractC11471r != null) {
                                c11445j.f34604d = abstractC11471r;
                                this.f34608d.f34612c.put(c11445j.f34603c, abstractC11471r);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
