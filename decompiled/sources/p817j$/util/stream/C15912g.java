package p817j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: renamed from: j$.util.stream.g */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15912g implements BaseStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15918h f49290a;

    private /* synthetic */ C15912g(InterfaceC15918h interfaceC15918h) {
        this.f49290a = interfaceC15918h;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ BaseStream m17478j(InterfaceC15918h interfaceC15918h) {
        if (interfaceC15918h == null) {
            return null;
        }
        if (interfaceC15918h instanceof C15906f) {
            return ((C15906f) interfaceC15918h).f49287a;
        }
        if (interfaceC15918h instanceof InterfaceC15762D) {
            return C15757C.m17368j((InterfaceC15762D) interfaceC15918h);
        }
        if (interfaceC15918h instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) interfaceC15918h);
        }
        if (interfaceC15918h instanceof InterfaceC15955n0) {
            return C15949m0.m17500j((InterfaceC15955n0) interfaceC15918h);
        }
        return interfaceC15918h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC15918h) : new C15912g(interfaceC15918h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.f49290a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC15918h interfaceC15918h = this.f49290a;
        if (obj instanceof C15912g) {
            obj = ((C15912g) obj).f49290a;
        }
        return interfaceC15918h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49290a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f49290a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f49290a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return m17478j(this.f49290a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return m17478j(this.f49290a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return m17478j(this.f49290a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(this.f49290a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return m17478j(this.f49290a.unordered());
    }
}
