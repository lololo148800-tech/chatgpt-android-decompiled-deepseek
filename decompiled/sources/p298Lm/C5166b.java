package p298Lm;

import io.sentry.internal.debugmeta.C15384c;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p049Bm.InterfaceC1436k;
import p1113xn.C21319m;
import p250Jm.AbstractC4484b;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.C17689w;

/* JADX INFO: renamed from: Lm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5166b implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C5166b f16824Z = new C5166b(0);

    /* JADX INFO: renamed from: o0 */
    public static final C5166b f16825o0 = new C5166b(1);

    /* JADX INFO: renamed from: p0 */
    public static final C5166b f16826p0 = new C5166b(2);

    /* JADX INFO: renamed from: q0 */
    public static final C5166b f16827q0 = new C5166b(3);

    /* JADX INFO: renamed from: r0 */
    public static final C5166b f16828r0 = new C5166b(4);

    /* JADX INFO: renamed from: s0 */
    public static final C5166b f16829s0 = new C5166b(5);

    /* JADX INFO: renamed from: t0 */
    public static final C5166b f16830t0 = new C5166b(6);

    /* JADX INFO: renamed from: u0 */
    public static final C5166b f16831u0 = new C5166b(7);

    /* JADX INFO: renamed from: v0 */
    public static final C5166b f16832v0 = new C5166b(8);

    /* JADX INFO: renamed from: w0 */
    public static final C5166b f16833w0 = new C5166b(9);

    /* JADX INFO: renamed from: x0 */
    public static final C5166b f16834x0 = new C5166b(10);

    /* JADX INFO: renamed from: y0 */
    public static final C5166b f16835y0 = new C5166b(11);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16836Y;

    public /* synthetic */ C5166b(int i10) {
        this.f16836Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17689w c17689w = C17689w.f56480Y;
        switch (this.f16836Y) {
            case 0:
                Class it = (Class) obj;
                C15384c c15384c = AbstractC5168c.f16839a;
                AbstractC16544l.m18094g(it, "it");
                return new C5134D(it);
            case 1:
                Class it2 = (Class) obj;
                C15384c c15384c2 = AbstractC5168c.f16839a;
                AbstractC16544l.m18094g(it2, "it");
                return new C5165a0(it2);
            case 2:
                Class it3 = (Class) obj;
                C15384c c15384c3 = AbstractC5168c.f16839a;
                AbstractC16544l.m18094g(it3, "it");
                return AbstractC4484b.m5211a(AbstractC5168c.m5744a(it3), c17689w, false, c17689w);
            case 3:
                Class it4 = (Class) obj;
                C15384c c15384c4 = AbstractC5168c.f16839a;
                AbstractC16544l.m18094g(it4, "it");
                return AbstractC4484b.m5211a(AbstractC5168c.m5744a(it4), c17689w, true, c17689w);
            case 4:
                C15384c c15384c5 = AbstractC5168c.f16839a;
                AbstractC16544l.m18094g((Class) obj, "it");
                return new ConcurrentHashMap();
            case 5:
                Class<?> returnType = ((Method) obj).getReturnType();
                AbstractC16544l.m18093f(returnType, "getReturnType(...)");
                return ReflectClassUtilKt.getDesc(returnType);
            case 6:
                Class cls = (Class) obj;
                AbstractC16544l.m18091d(cls);
                return ReflectClassUtilKt.getDesc(cls);
            case 7:
                PropertyDescriptor descriptor = (PropertyDescriptor) obj;
                C21319m c21319m = AbstractC5148K.f16787Y;
                AbstractC16544l.m18094g(descriptor, "descriptor");
                return DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + AbstractC5143H0.m5711b(descriptor).mo5751a();
            case 8:
                FunctionDescriptor descriptor2 = (FunctionDescriptor) obj;
                C21319m c21319m2 = AbstractC5148K.f16787Y;
                AbstractC16544l.m18094g(descriptor2, "descriptor");
                return DescriptorRenderer.DEBUG_TEXT.render(descriptor2) + " | " + AbstractC5143H0.m5712c(descriptor2).mo5750a();
            case 9:
                DescriptorRenderer descriptorRenderer = AbstractC5141G0.f16778a;
                KotlinType type = ((ValueParameterDescriptor) obj).getType();
                AbstractC16544l.m18093f(type, "getType(...)");
                return AbstractC5141G0.m5709d(type);
            case 10:
                DescriptorRenderer descriptorRenderer2 = AbstractC5141G0.f16778a;
                KotlinType type2 = ((ValueParameterDescriptor) obj).getType();
                AbstractC16544l.m18093f(type2, "getType(...)");
                return AbstractC5141G0.m5709d(type2);
            default:
                Class cls2 = (Class) obj;
                AbstractC16544l.m18091d(cls2);
                return ReflectClassUtilKt.getDesc(cls2);
        }
    }
}
