package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class CompanionObjectMappingUtilsKt {
    public static final boolean isMappedIntrinsicCompanionObject(CompanionObjectMapping companionObjectMapping, ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(companionObjectMapping, "<this>");
        AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
        if (DescriptorUtils.isCompanionObject(classDescriptor)) {
            Set<ClassId> classIds = companionObjectMapping.getClassIds();
            ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
            if (AbstractC17680n.m19333J(classIds, classId != null ? classId.getOuterClassId() : null)) {
                return true;
            }
        }
        return false;
    }
}
