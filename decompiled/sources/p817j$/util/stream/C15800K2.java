package p817j$.util.stream;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p817j$.util.C15710e;
import p817j$.util.function.Consumer$CC;
import p817j$.util.function.Function$CC;

/* JADX INFO: renamed from: j$.util.stream.K2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15800K2 implements Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49105a;

    /* JADX INFO: renamed from: b */
    public Object f49106b;

    public /* synthetic */ C15800K2(int i10) {
        this.f49105a = i10;
    }

    public /* synthetic */ C15800K2(int i10, Object obj) {
        this.f49105a = i10;
        this.f49106b = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void m17405p(Object obj) {
        switch (this.f49105a) {
            case 0:
                ((InterfaceC15963o2) this.f49106b).m17405p(obj);
                break;
            default:
                ((ArrayList) this.f49106b).add(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f49105a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.f49106b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof Stream) {
            return C15880a3.m17441j((Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.VivifiedWrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof InterfaceC15762D) {
            return C15757C.m17368j((InterfaceC15762D) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C15752B.m17360j((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC15955n0) {
            return C15949m0.m17500j((InterfaceC15955n0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C15943l0.m17499j((LongStream) objApply);
        }
        C15710e.m17336a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d10) {
        Object objApply = ((DoubleFunction) this.f49106b).apply(d10);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC15762D) {
            return C15757C.m17368j((InterfaceC15762D) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C15752B.m17360j((DoubleStream) objApply);
        }
        C15710e.m17336a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        Object objApply = ((LongFunction) this.f49106b).apply(j10);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC15955n0) {
            return C15949m0.m17500j((InterfaceC15955n0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C15943l0.m17499j((LongStream) objApply);
        }
        C15710e.m17336a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f49105a) {
            case 1:
                C15975q3 c15975q3 = (C15975q3) this.f49106b;
                return c15975q3.f49299d.tryAdvance(c15975q3.f49300e);
            case 2:
                C15985s3 c15985s3 = (C15985s3) this.f49106b;
                return c15985s3.f49299d.tryAdvance(c15985s3.f49300e);
            case 3:
                C15995u3 c15995u3 = (C15995u3) this.f49106b;
                return c15995u3.f49299d.tryAdvance(c15995u3.f49300e);
            default:
                C15796J3 c15796j3 = (C15796J3) this.f49106b;
                return c15796j3.f49299d.tryAdvance(c15796j3.f49300e);
        }
    }
}
