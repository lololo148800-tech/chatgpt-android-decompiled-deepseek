package p298Lm;

import java.lang.ref.SoftReference;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Lm.D0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5135D0 implements InterfaceC1426a {

    /* JADX INFO: renamed from: o0 */
    public static final C5137E0 f16772o0 = new C5137E0();

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1426a f16773Y;

    /* JADX INFO: renamed from: Z */
    public volatile SoftReference f16774Z;

    public C5135D0(CallableMemberDescriptor callableMemberDescriptor, InterfaceC1426a interfaceC1426a) {
        if (interfaceC1426a == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f16774Z = null;
        this.f16773Y = interfaceC1426a;
        if (callableMemberDescriptor != null) {
            this.f16774Z = new SoftReference(callableMemberDescriptor);
        }
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object obj;
        SoftReference softReference = this.f16774Z;
        Object obj2 = f16772o0;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f16773Y.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f16774Z = new SoftReference(obj2);
        return objInvoke;
    }
}
