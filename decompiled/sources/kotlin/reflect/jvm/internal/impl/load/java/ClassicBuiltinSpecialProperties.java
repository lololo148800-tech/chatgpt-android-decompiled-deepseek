package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p511Um.C7722a;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassicBuiltinSpecialProperties {
    public static final ClassicBuiltinSpecialProperties INSTANCE = new ClassicBuiltinSpecialProperties();

    public final String getBuiltinSpecialPropertyGetterName(CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        AbstractC16544l.m18094g(callableMemberDescriptor, "<this>");
        KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorFirstOverridden$default = DescriptorUtilsKt.firstOverridden$default(DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor), false, C7722a.f24341q0, 1, null);
        if (callableMemberDescriptorFirstOverridden$default == null || (name = BuiltinSpecialProperties.INSTANCE.getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP().get(DescriptorUtilsKt.getFqNameSafe(callableMemberDescriptorFirstOverridden$default))) == null) {
            return null;
        }
        return name.asString();
    }

    public final boolean hasBuiltinSpecialPropertyFqName(CallableMemberDescriptor callableMemberDescriptor) {
        AbstractC16544l.m18094g(callableMemberDescriptor, "callableMemberDescriptor");
        BuiltinSpecialProperties builtinSpecialProperties = BuiltinSpecialProperties.INSTANCE;
        if (!builtinSpecialProperties.getSPECIAL_SHORT_NAMES().contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (!AbstractC17680n.m19333J(builtinSpecialProperties.getSPECIAL_FQ_NAMES(), DescriptorUtilsKt.fqNameOrNull(callableMemberDescriptor)) || !callableMemberDescriptor.getValueParameters().isEmpty()) {
            if (!KotlinBuiltIns.isBuiltIn(callableMemberDescriptor)) {
                return false;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            AbstractC16544l.m18093f(overriddenDescriptors, "getOverriddenDescriptors(...)");
            Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
            if (collection.isEmpty()) {
                return false;
            }
            for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = INSTANCE;
                AbstractC16544l.m18091d(callableMemberDescriptor2);
                if (classicBuiltinSpecialProperties.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor2)) {
                }
            }
            return false;
        }
        return true;
    }
}
