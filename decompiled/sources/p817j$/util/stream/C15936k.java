package p817j$.util.stream;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import p817j$.util.C15650A;
import p817j$.util.C15651B;
import p817j$.util.C16024v;
import p817j$.util.C16028z;
import p817j$.util.Optional;
import p817j$.util.function.BiConsumer$CC;
import p817j$.util.function.BiFunction$CC;
import p817j$.util.function.Function$CC;
import p817j$.util.function.Predicate$CC;

/* JADX INFO: renamed from: j$.util.stream.k */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15936k implements BinaryOperator, Function, BiConsumer, ObjDoubleConsumer, LongFunction, IntFunction, DoubleBinaryOperator, DoubleFunction, ToDoubleFunction, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49329a;

    public /* synthetic */ C15936k(int i10) {
        this.f49329a = i10;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f49329a) {
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f49329a) {
            case 2:
                break;
            case 4:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f49329a) {
            case 0:
                break;
            case 7:
                break;
            case 9:
                break;
            case 11:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function m22582andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d10) {
        return Double.valueOf(d10);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        switch (this.f49329a) {
            case 6:
                return AbstractC16012y0.m17532J(j10);
            case 7:
            default:
                return AbstractC16012y0.m17543U(j10);
            case 8:
                return AbstractC16012y0.m17541S(j10);
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Set set = Collectors.f49046a;
        return obj;
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d10, double d11) {
        switch (this.f49329a) {
            case 17:
                return Math.min(d10, d11);
            default:
                return Math.max(d10, d11);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f49329a) {
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m17486or(Predicate predicate) {
        switch (this.f49329a) {
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f49329a) {
            case 24:
                return ((C16028z) obj).m17587c();
            case 25:
                return ((C15650A) obj).m17233c();
            case 26:
                return ((C15651B) obj).m17237c();
            default:
                return ((Optional) obj).m17252c();
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d10) {
        switch (this.f49329a) {
            case 3:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                Collectors.m17370a(dArr, d10);
                dArr[3] = dArr[3] + d10;
                break;
            case 4:
            default:
                ((C16024v) obj).accept(d10);
                break;
            case 5:
                double[] dArr2 = (double[]) obj;
                Collectors.m17370a(dArr2, d10);
                dArr2[2] = dArr2[2] + d10;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f49329a) {
            case 2:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.m17370a(dArr, dArr2[0]);
                Collectors.m17370a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 4:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.m17370a(dArr3, dArr4[0]);
                Collectors.m17370a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 14:
                ((List) obj).add(obj2);
                break;
            case 15:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 16:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                ((C16024v) obj).m17581b((C16024v) obj2);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        switch (this.f49329a) {
            case 13:
                return new Object[i10];
            case 22:
                return new Double[i10];
            case 28:
                return new Object[i10];
            default:
                return new Integer[i10];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f49329a) {
            case 0:
                List list = (List) obj;
                Set set = Collectors.f49046a;
                list.addAll((List) obj2);
                return list;
            case 7:
                return new C15837S0((InterfaceC15768E0) obj, (InterfaceC15768E0) obj2);
            case 9:
                return new C15842T0((InterfaceC15778G0) obj, (InterfaceC15778G0) obj2);
            case 11:
                return new C15847U0((InterfaceC15788I0) obj, (InterfaceC15788I0) obj2);
            default:
                return new C15857W0((InterfaceC15798K0) obj, (InterfaceC15798K0) obj2);
        }
    }
}
