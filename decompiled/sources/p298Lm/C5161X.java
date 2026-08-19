package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21329w;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Lm.X */
/* JADX INFO: loaded from: classes2.dex */
public final class C5161X implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16812Y = 0;

    /* JADX INFO: renamed from: Z */
    public final C5165a0 f16813Z;

    /* JADX INFO: renamed from: o0 */
    public final C5162Y f16814o0;

    public C5161X(C5162Y c5162y, C5165a0 c5165a0) {
        this.f16814o0 = c5162y;
        this.f16813Z = c5165a0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        KotlinClassHeader classHeader;
        switch (this.f16812Y) {
            case 0:
                C5162Y c5162y = this.f16814o0;
                c5162y.getClass();
                InterfaceC3776x interfaceC3776x = C5162Y.f16815g[0];
                ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) c5162y.f16816c.invoke();
                String multifileClassName = (reflectKotlinClass == null || (classHeader = reflectKotlinClass.getClassHeader()) == null) ? null : classHeader.getMultifileClassName();
                if (multifileClassName == null || multifileClassName.length() <= 0) {
                    return null;
                }
                return this.f16813Z.f16822Z.getClassLoader().loadClass(AbstractC21329w.m21730q(multifileClassName, '/', '.'));
            default:
                C5162Y c5162y2 = this.f16814o0;
                c5162y2.getClass();
                InterfaceC3776x interfaceC3776x2 = C5162Y.f16815g[1];
                Object objInvoke = c5162y2.f16817d.invoke();
                AbstractC16544l.m18093f(objInvoke, "getValue(...)");
                return this.f16813Z.m5731m((MemberScope) objInvoke, EnumC5144I.f16782Y);
        }
    }

    public C5161X(C5165a0 c5165a0, C5162Y c5162y) {
        this.f16813Z = c5165a0;
        this.f16814o0 = c5162y;
    }
}
