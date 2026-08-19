package p817j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: j$.util.function.c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15716c implements DoubleUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48964a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DoubleUnaryOperator f48965b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DoubleUnaryOperator f48966c;

    public /* synthetic */ C15716c(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2, int i10) {
        this.f48964a = i10;
        this.f48965b = doubleUnaryOperator;
        this.f48966c = doubleUnaryOperator2;
    }

    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f48964a) {
            case 0:
                break;
        }
        return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
    }

    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f48964a) {
            case 0:
                break;
        }
        return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d10) {
        switch (this.f48964a) {
            case 0:
                return this.f48965b.applyAsDouble(this.f48966c.applyAsDouble(d10));
            default:
                return this.f48966c.applyAsDouble(this.f48965b.applyAsDouble(d10));
        }
    }
}
