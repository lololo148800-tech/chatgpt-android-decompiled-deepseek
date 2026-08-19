package p817j$.lang;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.lang.Iterable$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Iterable$EL {
    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof InterfaceC15531a) {
            ((InterfaceC15531a) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof Collection)) {
            Iterable$CC.$default$forEach(iterable, consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        Iterator it = ((Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
