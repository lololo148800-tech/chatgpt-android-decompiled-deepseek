package p298Lm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16535c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.jvm.internal.InterfaceC16539g;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import mm.EnumC17307j;
import p225Im.InterfaceC3759g;
import p225Im.InterfaceC3776x;
import p323Mm.AbstractC5516w;
import p323Mm.AbstractC5517x;
import p323Mm.C5501h;
import p323Mm.C5502i;
import p323Mm.C5513t;
import p323Mm.C5515v;
import p323Mm.InterfaceC5500g;
import p544W9.AbstractC8507K3;
import p544W9.AbstractC8513L3;
import p544W9.AbstractC8716t3;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Lm.N */
/* JADX INFO: loaded from: classes2.dex */
public final class C5152N extends AbstractC5202t implements InterfaceC16539g, InterfaceC3759g, InterfaceC5174f {

    /* JADX INFO: renamed from: y0 */
    public static final /* synthetic */ InterfaceC3776x[] f16795y0 = {AbstractC16526C.f51263a.mo5699h(new C16553u(C5152N.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: s0 */
    public final AbstractC5148K f16796s0;

    /* JADX INFO: renamed from: t0 */
    public final String f16797t0;

    /* JADX INFO: renamed from: u0 */
    public final Object f16798u0;

    /* JADX INFO: renamed from: v0 */
    public final C5135D0 f16799v0;

    /* JADX INFO: renamed from: w0 */
    public final Object f16800w0;

    /* JADX INFO: renamed from: x0 */
    public final Object f16801x0;

    public C5152N(AbstractC5148K abstractC5148K, String str, String str2, FunctionDescriptor functionDescriptor, Object obj) {
        this.f16796s0 = abstractC5148K;
        this.f16797t0 = str2;
        this.f16798u0 = obj;
        int i10 = 0;
        this.f16799v0 = AbstractC8716t3.m9425b(functionDescriptor, new C5150L(this, i10, str));
        EnumC17307j enumC17307j = EnumC17307j.f55133Y;
        this.f16800w0 = AbstractC9227W.m9799b(enumC17307j, new C5151M(this, i10));
        this.f16801x0 = AbstractC9227W.m9799b(enumC17307j, new C5151M(this, 1));
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    public final boolean equals(Object obj) {
        C5152N c5152nM5714b = AbstractC5147J0.m5714b(obj);
        return c5152nM5714b != null && AbstractC16544l.m18089b(this.f16796s0, c5152nM5714b.f16796s0) && getName().equals(c5152nM5714b.getName()) && AbstractC16544l.m18089b(this.f16797t0, c5152nM5714b.f16797t0) && AbstractC16544l.m18089b(this.f16798u0, c5152nM5714b.f16798u0);
    }

    @Override // kotlin.jvm.internal.InterfaceC16539g
    public final int getArity() {
        return AbstractC8507K3.m9168a(mo5735i());
    }

    @Override // p225Im.InterfaceC3755c
    public final String getName() {
        String strAsString = mo5738m().getName().asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return strAsString;
    }

    public final int hashCode() {
        return this.f16797t0.hashCode() + ((getName().hashCode() + (this.f16796s0.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: i */
    public final InterfaceC5500g mo5735i() {
        return (InterfaceC5500g) this.f16800w0.getValue();
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // p225Im.InterfaceC3759g
    public final boolean isExternal() {
        return mo5738m().isExternal();
    }

    @Override // p225Im.InterfaceC3759g
    public final boolean isInfix() {
        return mo5738m().isInfix();
    }

    @Override // p225Im.InterfaceC3759g
    public final boolean isInline() {
        return mo5738m().isInline();
    }

    @Override // p225Im.InterfaceC3759g
    public final boolean isOperator() {
        return mo5738m().isOperator();
    }

    @Override // p225Im.InterfaceC3755c
    public final boolean isSuspend() {
        return mo5738m().isSuspend();
    }

    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: k */
    public final AbstractC5148K mo5736k() {
        return this.f16796s0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: l */
    public final InterfaceC5500g mo5737l() {
        return (InterfaceC5500g) this.f16801x0.getValue();
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: p */
    public final boolean mo5739p() {
        return this.f16798u0 != AbstractC16535c.NO_RECEIVER;
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC5517x m5740q(Constructor constructor, FunctionDescriptor functionDescriptor, boolean z6) {
        Class cls = null;
        Object obj = this.f16798u0;
        if (!z6 && InlineClassManglingRulesKt.shouldHideConstructorDueToValueClassTypeValueParameters(functionDescriptor)) {
            if (mo5739p()) {
                return new C5501h(constructor, AbstractC8513L3.m9174b(obj, mo5738m()), 0);
            }
            AbstractC16544l.m18094g(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC16544l.m18093f(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC16544l.m18093f(genericParameterTypes, "getGenericParameterTypes(...)");
            return new C5502i(constructor, declaringClass, cls, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC17678l.m19310q(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
        }
        if (mo5739p()) {
            return new C5501h(constructor, AbstractC8513L3.m9174b(obj, mo5738m()), 1);
        }
        AbstractC16544l.m18094g(constructor, "constructor");
        Class declaringClass2 = constructor.getDeclaringClass();
        AbstractC16544l.m18093f(declaringClass2, "getDeclaringClass(...)");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        Class<?> cls2 = (declaringClass4 == null || Modifier.isStatic(declaringClass3.getModifiers())) ? null : declaringClass4;
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        AbstractC16544l.m18093f(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new C5502i(constructor, declaringClass2, cls2, genericParameterTypes2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX INFO: renamed from: r */
    public final AbstractC5516w m5741r(Method method, boolean z6) {
        KotlinType type;
        if (!mo5739p()) {
            return new C5515v(2, method);
        }
        ReceiverParameterDescriptor dispatchReceiverParameter = mo5738m().getDispatchReceiverParameter();
        Object objM9174b = this.f16798u0;
        if (dispatchReceiverParameter == null || (type = dispatchReceiverParameter.getType()) == null || !InlineClassesUtilsKt.isInlineClassType(type)) {
            objM9174b = AbstractC8513L3.m9174b(objM9174b, mo5738m());
        } else {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC16544l.m18093f(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) AbstractC17678l.m19317x(parameterTypes);
            if (cls == null || !cls.isInterface()) {
                objM9174b = AbstractC8513L3.m9174b(objM9174b, mo5738m());
            }
        }
        return new C5513t(method, z6, objM9174b);
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final FunctionDescriptor mo5738m() {
        InterfaceC3776x interfaceC3776x = f16795y0[0];
        Object objInvoke = this.f16799v0.invoke();
        AbstractC16544l.m18093f(objInvoke, "getValue(...)");
        return (FunctionDescriptor) objInvoke;
    }

    public final String toString() {
        DescriptorRenderer descriptorRenderer = AbstractC5141G0.f16778a;
        return AbstractC5141G0.m5707b(mo5738m());
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5152N(AbstractC5148K container, FunctionDescriptor descriptor) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(descriptor, "descriptor");
        String strAsString = descriptor.getName().asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        this(container, strAsString, AbstractC5143H0.m5712c(descriptor).mo5750a(), descriptor, AbstractC16535c.NO_RECEIVER);
    }
}
