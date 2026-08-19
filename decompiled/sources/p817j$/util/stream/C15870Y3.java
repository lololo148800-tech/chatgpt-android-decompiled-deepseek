package p817j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.Y3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15870Y3 implements IntFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49215a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i10) {
        switch (this.f49215a) {
            case 0:
                return new Long[i10];
            case 1:
                return new Double[i10];
            default:
                return new Double[i10];
        }
    }
}
