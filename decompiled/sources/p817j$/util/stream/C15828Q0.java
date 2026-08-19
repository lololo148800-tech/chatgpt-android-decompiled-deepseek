package p817j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.stream.IntStream;
import p817j$.util.C15710e;

/* JADX INFO: renamed from: j$.util.stream.Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15828Q0 implements LongFunction, IntFunction {

    /* JADX INFO: renamed from: a */
    public IntFunction f49150a;

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        Object objApply = this.f49150a.apply(i10);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.VivifiedWrapper.convert((IntStream) objApply);
        }
        C15710e.m17336a("java.util.stream.IntStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        return AbstractC16012y0.m17526D(j10, this.f49150a);
    }
}
