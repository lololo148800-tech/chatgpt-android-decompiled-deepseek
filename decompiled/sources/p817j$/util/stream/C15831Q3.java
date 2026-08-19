package p817j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.Q3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15831Q3 extends AbstractC15939k2 implements InterfaceC15917g4 {

    /* JADX INFO: renamed from: b */
    long f49160b;

    /* JADX INFO: renamed from: c */
    boolean f49161c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f49162d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C15835R3 f49163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15831Q3(C15835R3 c15835r3, InterfaceC15963o2 interfaceC15963o2, boolean z6) {
        super(interfaceC15963o2);
        this.f49163e = c15835r3;
        this.f49162d = z6;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z6;
        if (this.f49161c) {
            z6 = true;
        } else {
            boolean zTest = this.f49163e.f49171m.test(obj);
            this.f49161c = !zTest;
            if (zTest) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        boolean z10 = this.f49162d;
        if (z10 && !z6) {
            this.f49160b++;
        }
        if (z10 || z6) {
            this.f49330a.accept(obj);
        }
    }

    @Override // p817j$.util.stream.InterfaceC15917g4
    /* JADX INFO: renamed from: f */
    public final long mo17417f() {
        return this.f49160b;
    }
}
