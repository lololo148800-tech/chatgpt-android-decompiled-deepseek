package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {

    /* JADX INFO: renamed from: Y */
    public final DeclarationDescriptor f51725Y;

    public DeprecationCausedByFunctionNInfo(DeclarationDescriptor target) {
        AbstractC16544l.m18094g(target, "target");
        this.f51725Y = target;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    public DeprecationLevelValue getDeprecationLevel() {
        return DeprecationLevelValue.ERROR;
    }
}
