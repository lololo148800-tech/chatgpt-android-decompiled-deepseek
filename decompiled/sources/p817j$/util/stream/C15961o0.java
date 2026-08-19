package p817j$.util.stream;

import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.o0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15961o0 implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49360a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EnumC15997v0 f49361b;

    public /* synthetic */ C15961o0(EnumC15997v0 enumC15997v0, int i10) {
        this.f49360a = i10;
        this.f49361b = enumC15997v0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f49360a) {
            case 0:
                return new C15982s0(this.f49361b);
            case 1:
                return new C15977r0(this.f49361b);
            default:
                return new C15987t0(this.f49361b);
        }
    }
}
