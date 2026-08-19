package p817j$.util.function;

import java.util.function.Function;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Function$CC {
    public static Function $default$compose(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new C15717d(function, function2, 1);
    }

    public static Function $default$andThen(Function function, Function function2) {
        Objects.requireNonNull(function2);
        return new C15717d(function, function2, 0);
    }
}
