package p817j$.util.stream;

import java.util.ArrayDeque;
import java.util.function.Consumer;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.n1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15956n1 extends AbstractC15962o1 {
    @Override // p817j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC15798K0 interfaceC15798K0M17503a;
        if (!m17505c()) {
            return false;
        }
        boolean zTryAdvance = this.f49365d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f49364c == null && (interfaceC15798K0M17503a = AbstractC15962o1.m17503a(this.f49366e)) != null) {
                Spliterator spliterator = interfaceC15798K0M17503a.spliterator();
                this.f49365d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f49362a = null;
        }
        return zTryAdvance;
    }

    @Override // p817j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f49362a == null) {
            return;
        }
        if (this.f49365d == null) {
            Spliterator spliterator = this.f49364c;
            if (spliterator == null) {
                ArrayDeque arrayDequeM17504b = m17504b();
                while (true) {
                    InterfaceC15798K0 interfaceC15798K0M17503a = AbstractC15962o1.m17503a(arrayDequeM17504b);
                    if (interfaceC15798K0M17503a != null) {
                        interfaceC15798K0M17503a.forEach(consumer);
                    } else {
                        this.f49362a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
