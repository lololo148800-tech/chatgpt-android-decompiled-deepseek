package p520V5;

import io.sentry.internal.debugmeta.C15384c;
import p140Fa.C2700t;
import p802i6.InterfaceC14937c;

/* JADX INFO: renamed from: V5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7777f extends C15384c {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f24562p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f24563q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7777f(Object obj, int i10) {
        super(23);
        this.f24562p0 = i10;
        this.f24563q0 = obj;
    }

    @Override // io.sentry.internal.debugmeta.C15384c
    /* JADX INFO: renamed from: q */
    public final Object mo8038q(C2700t c2700t) {
        switch (this.f24562p0) {
            case 0:
                return ((InterfaceC14937c) this.f24563q0).getValue();
            default:
                Float f10 = (Float) ((C15384c) this.f24563q0).mo8038q(c2700t);
                if (f10 == null) {
                    return null;
                }
                return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }
}
