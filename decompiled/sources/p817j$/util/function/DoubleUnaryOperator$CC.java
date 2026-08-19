package p817j$.util.function;

import java.util.function.DoubleUnaryOperator;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.util.function.DoubleUnaryOperator$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DoubleUnaryOperator$CC {
    public static DoubleUnaryOperator $default$compose(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        Objects.requireNonNull(doubleUnaryOperator2);
        return new C15716c(doubleUnaryOperator, doubleUnaryOperator2, 0);
    }

    public static DoubleUnaryOperator $default$andThen(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        Objects.requireNonNull(doubleUnaryOperator2);
        return new C15716c(doubleUnaryOperator, doubleUnaryOperator2, 1);
    }
}
