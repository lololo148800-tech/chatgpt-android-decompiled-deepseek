package p817j$.lang;

import java.util.Iterator;
import java.util.function.Consumer;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.lang.Iterable$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Iterable$CC {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        Objects.requireNonNull(consumer);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
