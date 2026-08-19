package p817j$.util.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;
import p817j$.util.Objects;
import p817j$.util.Spliterator;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.util.stream.o */
/* JADX INFO: loaded from: classes4.dex */
final class C15960o extends AbstractC15909f2 {
    /* JADX INFO: renamed from: X */
    static C15818O0 m17502X(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        C15772F c15772f = new C15772F(8);
        C15936k c15936k = new C15936k(15);
        C15936k c15936k2 = new C15936k(16);
        Objects.requireNonNull(c15772f);
        Objects.requireNonNull(c15936k);
        Objects.requireNonNull(c15936k2);
        return new C15818O0((Collection) new C15769E1(EnumC15910f3.REFERENCE, c15936k2, c15936k, c15772f, 3).mo17374c(abstractC15882b, spliterator));
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: N */
    final InterfaceC15798K0 mo17377N(AbstractC15882b abstractC15882b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC15904e3.DISTINCT.m17475r(abstractC15882b.m17449J())) {
            return abstractC15882b.m17444B(spliterator, false, intFunction);
        }
        if (EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J())) {
            return m17502X(abstractC15882b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C15958n3 c15958n3 = new C15958n3(1, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c15958n3);
        new C15822P(c15958n3, false).m17416e(abstractC15882b, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new C15818O0(collectionKeySet);
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: O */
    final Spliterator mo17415O(AbstractC15882b abstractC15882b, Spliterator spliterator) {
        if (EnumC15904e3.DISTINCT.m17475r(abstractC15882b.m17449J())) {
            return abstractC15882b.m17455W(spliterator);
        }
        if (EnumC15904e3.ORDERED.m17475r(abstractC15882b.m17449J())) {
            return m17502X(abstractC15882b, spliterator).spliterator();
        }
        return new C15964o3(abstractC15882b.m17455W(spliterator));
    }

    @Override // p817j$.util.stream.AbstractC15882b
    /* JADX INFO: renamed from: Q */
    final InterfaceC15963o2 mo17378Q(int i10, InterfaceC15963o2 interfaceC15963o2) {
        Objects.requireNonNull(interfaceC15963o2);
        if (EnumC15904e3.DISTINCT.m17475r(i10)) {
            return interfaceC15963o2;
        }
        if (EnumC15904e3.SORTED.m17475r(i10)) {
            return new C15948m(interfaceC15963o2);
        }
        return new C15954n(interfaceC15963o2);
    }
}
