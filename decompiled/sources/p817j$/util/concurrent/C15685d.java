package p817j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.concurrent.d */
/* JADX INFO: loaded from: classes4.dex */
final class C15685d extends AbstractC15682a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C15693l c15693l = this.f48925b;
        if (c15693l == null) {
            throw new NoSuchElementException();
        }
        Object obj = c15693l.f48917b;
        Object obj2 = c15693l.f48918c;
        this.f48905j = c15693l;
        m17322a();
        return new C15692k(obj, obj2, this.f48904i);
    }
}
