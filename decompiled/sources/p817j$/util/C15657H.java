package p817j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.H */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15657H implements InterfaceC15659J, InterfaceC16026x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfInt f48849a;

    private /* synthetic */ C15657H(PrimitiveIterator.OfInt ofInt) {
        this.f48849a = ofInt;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC15659J m17244a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C15658I ? ((C15658I) ofInt).f48850a : new C15657H(ofInt);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f48849a;
        if (obj instanceof C15657H) {
            obj = ((C15657H) obj).f48849a;
        }
        return ofInt.equals(obj);
    }

    @Override // p817j$.util.InterfaceC15664O
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f48849a.forEachRemaining(obj);
    }

    @Override // p817j$.util.InterfaceC15659J, java.util.Iterator, p817j$.util.InterfaceC16026x
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f48849a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // p817j$.util.InterfaceC15659J
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f48849a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f48849a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f48849a.hashCode();
    }

    @Override // p817j$.util.InterfaceC15659J, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f48849a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f48849a.next();
    }

    @Override // p817j$.util.InterfaceC15659J
    public final /* synthetic */ int nextInt() {
        return this.f48849a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f48849a.remove();
    }
}
