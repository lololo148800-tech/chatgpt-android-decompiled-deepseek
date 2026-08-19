package p298Lm;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Lm.V */
/* JADX INFO: loaded from: classes2.dex */
public final class C5159V implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16808Y;

    /* JADX INFO: renamed from: Z */
    public final C5165a0 f16809Z;

    public /* synthetic */ C5159V(C5165a0 c5165a0, int i10) {
        this.f16808Y = i10;
        this.f16809Z = c5165a0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16808Y) {
            case 0:
                return new C5162Y(this.f16809Z);
            default:
                return ReflectKotlinClass.Factory.create(this.f16809Z.f16822Z);
        }
    }
}
