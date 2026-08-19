package p817j$.util.function;

import java.util.function.BiConsumer;
import p817j$.util.Objects;
import p817j$.util.concurrent.C15701t;

/* JADX INFO: renamed from: j$.util.function.BiConsumer$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BiConsumer$CC {
    public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new C15701t(1, biConsumer, biConsumer2);
    }
}
