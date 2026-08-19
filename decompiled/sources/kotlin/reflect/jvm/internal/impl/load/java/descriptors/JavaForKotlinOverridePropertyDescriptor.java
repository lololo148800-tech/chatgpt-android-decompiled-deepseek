package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {

    /* JADX INFO: renamed from: Q0 */
    public final SimpleFunctionDescriptor f51826Q0;

    /* JADX INFO: renamed from: R0 */
    public final SimpleFunctionDescriptor f51827R0;

    /* JADX INFO: renamed from: S0 */
    public final PropertyDescriptor f51828S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaForKotlinOverridePropertyDescriptor(ClassDescriptor ownerDescriptor, SimpleFunctionDescriptor getterMethod, SimpleFunctionDescriptor simpleFunctionDescriptor, PropertyDescriptor overriddenProperty) {
        super(ownerDescriptor, Annotations.Companion.getEMPTY(), getterMethod.getModality(), getterMethod.getVisibility(), simpleFunctionDescriptor != null, overriddenProperty.getName(), getterMethod.getSource(), null, CallableMemberDescriptor.Kind.DECLARATION, false, null);
        AbstractC16544l.m18094g(ownerDescriptor, "ownerDescriptor");
        AbstractC16544l.m18094g(getterMethod, "getterMethod");
        AbstractC16544l.m18094g(overriddenProperty, "overriddenProperty");
        this.f51826Q0 = getterMethod;
        this.f51827R0 = simpleFunctionDescriptor;
        this.f51828S0 = overriddenProperty;
    }
}
