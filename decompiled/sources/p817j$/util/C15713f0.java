package p817j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.f0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15713f0 implements Iterator, Consumer {

    /* JADX INFO: renamed from: a */
    boolean f48957a = false;

    /* JADX INFO: renamed from: b */
    Object f48958b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Spliterator f48959c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    C15713f0(Spliterator spliterator) {
        this.f48959c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f48957a = true;
        this.f48958b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f48957a) {
            this.f48959c.tryAdvance(this);
        }
        return this.f48957a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f48957a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48957a = false;
        return this.f48958b;
    }
}
