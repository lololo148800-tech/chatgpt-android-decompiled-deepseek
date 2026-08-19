package p817j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15677b implements Comparator, Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48872b;

    public /* synthetic */ C15677b(int i10, Object obj) {
        this.f48871a = i10;
        this.f48872b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f48871a) {
            case 0:
                ToIntFunction toIntFunction = (ToIntFunction) this.f48872b;
                return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 1:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) this.f48872b;
                return Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 2:
                Function function = (Function) this.f48872b;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
            default:
                ToLongFunction toLongFunction = (ToLongFunction) this.f48872b;
                return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
        }
    }
}
