package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p049Bm.InterfaceC1426a;
import p298Lm.C5150L;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyWrappedType extends WrappedType {

    /* JADX INFO: renamed from: Z */
    public final StorageManager f53175Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1426a f53176o0;

    /* JADX INFO: renamed from: p0 */
    public final NotNullLazyValue f53177p0;

    public LazyWrappedType(StorageManager storageManager, InterfaceC1426a computation) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(computation, "computation");
        this.f53175Z = storageManager;
        this.f53176o0 = computation;
        this.f53177p0 = storageManager.createLazyValue(computation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    /* JADX INFO: renamed from: a */
    public final KotlinType mo18417a() {
        return (KotlinType) this.f53177p0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.f53177p0.isComputed();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public LazyWrappedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.f53175Z, new C5150L(kotlinTypeRefiner, 18, this));
    }
}
