package p817j$.util.function;

import java.util.function.Consumer;
import p817j$.util.Objects;
import p817j$.util.concurrent.C15701t;

/* JADX INFO: renamed from: j$.util.function.Consumer$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Consumer$CC {
    public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new C15701t(3, consumer, consumer2);
    }
}
