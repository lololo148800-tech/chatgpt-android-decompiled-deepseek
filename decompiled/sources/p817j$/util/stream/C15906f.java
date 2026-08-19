package p817j$.util.stream;

import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p817j$.util.C15711e0;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.f */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15906f implements InterfaceC15918h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseStream f49287a;

    private /* synthetic */ C15906f(BaseStream baseStream) {
        this.f49287a = baseStream;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC15918h m17477j(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof C15912g) {
            return ((C15912g) baseStream).f49290a;
        }
        if (baseStream instanceof DoubleStream) {
            return C15752B.m17360j((DoubleStream) baseStream);
        }
        if (baseStream instanceof IntStream) {
            return IntStream.VivifiedWrapper.convert((IntStream) baseStream);
        }
        if (baseStream instanceof LongStream) {
            return C15943l0.m17499j((LongStream) baseStream);
        }
        return baseStream instanceof Stream ? C15880a3.m17441j((Stream) baseStream) : new C15906f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f49287a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f49287a;
        if (obj instanceof C15906f) {
            obj = ((C15906f) obj).f49287a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49287a.hashCode();
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ boolean isParallel() {
        return this.f49287a.isParallel();
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Iterator iterator() {
        return this.f49287a.iterator();
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h onClose(Runnable runnable) {
        return m17477j(this.f49287a.onClose(runnable));
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h parallel() {
        return m17477j(this.f49287a.parallel());
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h sequential() {
        return m17477j(this.f49287a.sequential());
    }

    @Override // p817j$.util.stream.InterfaceC15918h, p817j$.util.stream.InterfaceC15762D
    public final /* synthetic */ Spliterator spliterator() {
        return C15711e0.m17337a(this.f49287a.spliterator());
    }

    @Override // p817j$.util.stream.InterfaceC15918h
    public final /* synthetic */ InterfaceC15918h unordered() {
        return m17477j(this.f49287a.unordered());
    }
}
