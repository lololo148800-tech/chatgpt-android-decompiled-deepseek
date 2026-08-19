package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LazyJavaStaticScope extends LazyJavaScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyJavaStaticScope(LazyJavaResolverContext c9) {
        super(c9, null, 2, 0 == true ? 1 : 0);
        AbstractC16544l.m18094g(c9, "c");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: e */
    public void mo18200e(Name name, ArrayList arrayList) {
        AbstractC16544l.m18094g(name, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: g */
    public final ReceiverParameterDescriptor mo18202g() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: i */
    public final LazyJavaScope.MethodSignatureData mo18204i(JavaMethod method, ArrayList arrayList, KotlinType returnType, List valueParameters) {
        AbstractC16544l.m18094g(method, "method");
        AbstractC16544l.m18094g(returnType, "returnType");
        AbstractC16544l.m18094g(valueParameters, "valueParameters");
        return new LazyJavaScope.MethodSignatureData(returnType, null, valueParameters, arrayList, false, C17689w.f56480Y);
    }
}
