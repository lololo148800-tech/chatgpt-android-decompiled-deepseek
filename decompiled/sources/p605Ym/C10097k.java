package p605Ym;

import kotlin.jvm.internal.C16525B;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Ym.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C10097k implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29891Y;

    /* JADX INFO: renamed from: Z */
    public final LazyJavaScope f29892Z;

    /* JADX INFO: renamed from: o0 */
    public final JavaField f29893o0;

    /* JADX INFO: renamed from: p0 */
    public final C16525B f29894p0;

    public /* synthetic */ C10097k(LazyJavaScope lazyJavaScope, JavaField javaField, C16525B c16525b, int i10) {
        this.f29891Y = i10;
        this.f29892Z = lazyJavaScope;
        this.f29893o0 = javaField;
        this.f29894p0 = c16525b;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f29891Y) {
            case 0:
                LazyJavaScope lazyJavaScope = this.f29892Z;
                return lazyJavaScope.f51934a.getStorageManager().createNullableLazyValue(new C10097k(lazyJavaScope, this.f29893o0, this.f29894p0, 1));
            default:
                return this.f29892Z.f51934a.getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(this.f29893o0, (PropertyDescriptor) this.f29894p0.f51262Y);
        }
    }
}
