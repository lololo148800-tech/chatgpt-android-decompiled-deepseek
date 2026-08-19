package gn;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import mm.C17309l;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: gn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C14197b implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C14197b f44608Z = new C14197b(0);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44609Y;

    public /* synthetic */ C14197b(int i10) {
        this.f44609Y = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44609Y) {
            case 0:
                return Boolean.FALSE;
            default:
                return new C17309l((CallableDescriptor) obj, (CallableDescriptor) obj2);
        }
    }
}
