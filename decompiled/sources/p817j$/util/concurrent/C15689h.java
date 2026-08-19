package p817j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.util.concurrent.h */
/* JADX INFO: loaded from: classes4.dex */
final class C15689h extends AbstractC15682a implements Iterator, Enumeration {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f48910k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15689h(C15693l[] c15693lArr, int i10, int i11, ConcurrentHashMap concurrentHashMap, int i12) {
        super(c15693lArr, i10, i11, concurrentHashMap);
        this.f48910k = i12;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f48910k) {
            case 0:
                C15693l c15693l = this.f48925b;
                if (c15693l == null) {
                    throw new NoSuchElementException();
                }
                this.f48905j = c15693l;
                m17322a();
                return c15693l.f48917b;
            default:
                C15693l c15693l2 = this.f48925b;
                if (c15693l2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = c15693l2.f48918c;
                this.f48905j = c15693l2;
                m17322a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f48910k) {
            case 0:
                break;
        }
        return next();
    }
}
