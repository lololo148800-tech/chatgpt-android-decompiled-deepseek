package p817j$.util.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import p817j$.util.Objects;
import p817j$.util.concurrent.C15701t;

/* JADX INFO: renamed from: j$.util.function.BiFunction$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BiFunction$CC {
    public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new C15701t(biFunction, function);
    }
}
