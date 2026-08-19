package p680cj;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;

/* JADX INFO: renamed from: cj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11761b extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f35669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11763d f35670b;

    public C11761b(C11763d c11763d, Object obj) {
        this.f35670b = c11763d;
        this.f35669a = obj;
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        abstractC11477x.mo12800D();
        return this.f35669a;
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        throw new IllegalArgumentException("Expected one of " + this.f35670b.f35681d + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
    }
}
