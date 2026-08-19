package tl;

import java.util.function.Function;
import p042Bf.C1278t;
import p049Bm.InterfaceC1436k;
import p1105xc.C21173c;
import p1105xc.C21176f;
import p1105xc.C21186p;
import p817j$.util.function.Function$CC;

/* JADX INFO: renamed from: tl.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20002b implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1436k f63322b;

    public /* synthetic */ C20002b(int i10, InterfaceC1436k interfaceC1436k) {
        this.f63321a = i10;
        this.f63322b = interfaceC1436k;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int i10 = this.f63321a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f63321a) {
            case 0:
                return ((C20001a) this.f63322b).f63320Z.invoke();
            case 1:
                return (C21173c) ((C1278t) this.f63322b).invoke(obj);
            default:
                return (C21176f) ((C21186p) this.f63322b).invoke(obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        int i10 = this.f63321a;
        return Function$CC.$default$compose(this, function);
    }
}
