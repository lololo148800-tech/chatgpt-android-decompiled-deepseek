package p817j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.n */
/* JADX INFO: loaded from: classes4.dex */
final class C15954n extends AbstractC15939k2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f49351b;

    /* JADX INFO: renamed from: c */
    Object f49352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15954n(AbstractC15882b abstractC15882b, InterfaceC15963o2 interfaceC15963o2, int i10) {
        super(interfaceC15963o2);
        this.f49351b = i10;
        this.f49352c = abstractC15882b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15954n(InterfaceC15963o2 interfaceC15963o2) {
        super(interfaceC15963o2);
        this.f49351b = 0;
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public void mo17363k() {
        switch (this.f49351b) {
            case 0:
                this.f49352c = null;
                this.f49330a.mo17363k();
                break;
            default:
                super.mo17363k();
                break;
        }
    }

    @Override // p817j$.util.stream.AbstractC15939k2, p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public void mo17364l(long j10) {
        switch (this.f49351b) {
            case 0:
                this.f49352c = new HashSet();
                this.f49330a.mo17364l(-1L);
                break;
            case 1:
            default:
                super.mo17364l(j10);
                break;
            case 2:
                this.f49330a.mo17364l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f49351b) {
            case 0:
                if (!((HashSet) this.f49352c).contains(obj)) {
                    ((HashSet) this.f49352c).add(obj);
                    this.f49330a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((C15981s) this.f49352c).f49397n).accept(obj);
                this.f49330a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((C15981s) this.f49352c).f49397n).test(obj)) {
                    this.f49330a.accept(obj);
                }
                break;
            case 3:
                this.f49330a.accept(((Function) ((C15981s) this.f49352c).f49397n).apply(obj));
                break;
            case 4:
                this.f49330a.accept(((ToIntFunction) ((C15861X) this.f49352c).f49203n).applyAsInt(obj));
                break;
            case 5:
                this.f49330a.accept(((ToLongFunction) ((C15919h0) this.f49352c).f49306n).applyAsLong(obj));
                break;
            default:
                this.f49330a.accept(((ToDoubleFunction) ((C15986t) this.f49352c).f49402n).applyAsDouble(obj));
                break;
        }
    }
}
