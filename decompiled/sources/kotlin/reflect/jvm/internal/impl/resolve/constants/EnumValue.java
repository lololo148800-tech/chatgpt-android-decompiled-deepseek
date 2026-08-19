package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import mm.C17309l;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumValue extends ConstantValue<C17309l> {

    /* JADX INFO: renamed from: b */
    public final ClassId f52879b;

    /* JADX INFO: renamed from: c */
    public final Name f52880c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumValue(ClassId enumClassId, Name enumEntryName) {
        super(new C17309l(enumClassId, enumEntryName));
        AbstractC16544l.m18094g(enumClassId, "enumClassId");
        AbstractC16544l.m18094g(enumEntryName, "enumEntryName");
        this.f52879b = enumClassId;
        this.f52880c = enumEntryName;
    }

    public final Name getEnumEntryName() {
        return this.f52880c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor module) {
        SimpleType defaultType;
        AbstractC16544l.m18094g(module, "module");
        ClassId classId = this.f52879b;
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, classId);
        if (classDescriptorFindClassAcrossModuleDependencies != null) {
            if (!DescriptorUtils.isEnumClass(classDescriptorFindClassAcrossModuleDependencies)) {
                classDescriptorFindClassAcrossModuleDependencies = null;
            }
            if (classDescriptorFindClassAcrossModuleDependencies != null && (defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType()) != null) {
                return defaultType;
            }
        }
        return ErrorUtils.createErrorType(ErrorTypeKind.ERROR_ENUM_TYPE, classId.toString(), this.f52880c.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f52879b.getShortClassName());
        sb2.append('.');
        sb2.append(this.f52880c);
        return sb2.toString();
    }
}
