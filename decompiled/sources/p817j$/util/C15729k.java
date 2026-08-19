package p817j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.k */
/* JADX INFO: loaded from: classes4.dex */
final class C15729k implements Iterator, InterfaceC16026x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48996a = 0;

    /* JADX INFO: renamed from: b */
    private final Iterator f48997b;

    public C15729k(C15731l c15731l) {
        this.f48997b = c15731l.f49002a.iterator();
    }

    @Override // java.util.Iterator, p817j$.util.InterfaceC16026x
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f48996a) {
            case 0:
                AbstractC15666Q.m17269q(this.f48997b, consumer);
                break;
            default:
                AbstractC15666Q.m17269q(this.f48997b, new C15737o(consumer));
                break;
        }
    }

    public C15729k(C15743r c15743r) {
        this.f48997b = c15743r.f49002a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f48996a) {
            case 0:
                break;
        }
        return this.f48997b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f48996a) {
            case 0:
                return this.f48997b.next();
            default:
                return new C15739p((Map.Entry) this.f48997b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f48996a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
