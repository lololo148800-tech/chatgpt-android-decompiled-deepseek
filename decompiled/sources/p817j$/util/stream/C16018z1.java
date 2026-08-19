package p817j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.z1 */
/* JADX INFO: loaded from: classes4.dex */
class C16018z1 extends CountedCompleter {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC15798K0 f49454a;

    /* JADX INFO: renamed from: b */
    protected final int f49455b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f49456c;

    /* JADX INFO: renamed from: d */
    private final Object f49457d;

    public C16018z1(InterfaceC15798K0 interfaceC15798K0, Object obj, int i10) {
        this.f49456c = i10;
        this.f49454a = interfaceC15798K0;
        this.f49455b = 0;
        this.f49457d = obj;
    }

    C16018z1(C16018z1 c16018z1, InterfaceC15798K0 interfaceC15798K0, int i10, byte b) {
        super(c16018z1);
        this.f49454a = interfaceC15798K0;
        this.f49455b = i10;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C16018z1 c16018z1M17578a = this;
        while (c16018z1M17578a.f49454a.mo17409q() != 0) {
            c16018z1M17578a.setPendingCount(c16018z1M17578a.f49454a.mo17409q() - 1);
            int i10 = 0;
            int iCount = 0;
            while (i10 < c16018z1M17578a.f49454a.mo17409q() - 1) {
                C16018z1 c16018z1M17578a2 = c16018z1M17578a.m17578a(i10, c16018z1M17578a.f49455b + iCount);
                iCount = (int) (((long) iCount) + c16018z1M17578a2.f49454a.count());
                c16018z1M17578a2.fork();
                i10++;
            }
            c16018z1M17578a = c16018z1M17578a.m17578a(i10, c16018z1M17578a.f49455b + iCount);
        }
        switch (c16018z1M17578a.f49456c) {
            case 0:
                ((InterfaceC15793J0) c16018z1M17578a.f49454a).mo17400r(c16018z1M17578a.f49455b, c16018z1M17578a.f49457d);
                break;
            default:
                c16018z1M17578a.f49454a.mo17407i((Object[]) c16018z1M17578a.f49457d, c16018z1M17578a.f49455b);
                break;
        }
        c16018z1M17578a.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16018z1(C16018z1 c16018z1, InterfaceC15798K0 interfaceC15798K0, int i10) {
        this(c16018z1, interfaceC15798K0, i10, (byte) 0);
        this.f49456c = 1;
        this.f49457d = (Object[]) c16018z1.f49457d;
    }

    /* JADX INFO: renamed from: a */
    final C16018z1 m17578a(int i10, int i11) {
        switch (this.f49456c) {
            case 0:
                return new C16018z1(this, ((InterfaceC15793J0) this.f49454a).mo17396b(i10), i11);
            default:
                return new C16018z1(this, this.f49454a.mo17396b(i10), i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16018z1(C16018z1 c16018z1, InterfaceC15793J0 interfaceC15793J0, int i10) {
        this(c16018z1, interfaceC15793J0, i10, (byte) 0);
        this.f49456c = 0;
        this.f49457d = c16018z1.f49457d;
    }
}
