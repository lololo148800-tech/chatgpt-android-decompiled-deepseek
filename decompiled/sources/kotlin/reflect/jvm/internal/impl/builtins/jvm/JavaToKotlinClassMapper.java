package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17681o;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaToKotlinClassMapper {
    public static final JavaToKotlinClassMapper INSTANCE = new JavaToKotlinClassMapper();

    public static /* synthetic */ ClassDescriptor mapJavaToKotlin$default(JavaToKotlinClassMapper javaToKotlinClassMapper, FqName fqName, KotlinBuiltIns kotlinBuiltIns, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return javaToKotlinClassMapper.mapJavaToKotlin(fqName, kotlinBuiltIns, num);
    }

    public final ClassDescriptor convertMutableToReadOnly(ClassDescriptor mutable) {
        AbstractC16544l.m18094g(mutable, "mutable");
        FqName fqNameMutableToReadOnly = JavaToKotlinClassMap.INSTANCE.mutableToReadOnly(DescriptorUtils.getFqName(mutable));
        if (fqNameMutableToReadOnly != null) {
            ClassDescriptor builtInClassByFqName = DescriptorUtilsKt.getBuiltIns(mutable).getBuiltInClassByFqName(fqNameMutableToReadOnly);
            AbstractC16544l.m18093f(builtInClassByFqName, "getBuiltInClassByFqName(...)");
            return builtInClassByFqName;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final ClassDescriptor convertReadOnlyToMutable(ClassDescriptor readOnly) {
        AbstractC16544l.m18094g(readOnly, "readOnly");
        FqName onlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(DescriptorUtils.getFqName(readOnly));
        if (onlyToMutable != null) {
            ClassDescriptor builtInClassByFqName = DescriptorUtilsKt.getBuiltIns(readOnly).getBuiltInClassByFqName(onlyToMutable);
            AbstractC16544l.m18093f(builtInClassByFqName, "getBuiltInClassByFqName(...)");
            return builtInClassByFqName;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean isMutable(ClassDescriptor mutable) {
        AbstractC16544l.m18094g(mutable, "mutable");
        return JavaToKotlinClassMap.INSTANCE.isMutable(DescriptorUtils.getFqName(mutable));
    }

    public final boolean isReadOnly(ClassDescriptor readOnly) {
        AbstractC16544l.m18094g(readOnly, "readOnly");
        return JavaToKotlinClassMap.INSTANCE.isReadOnly(DescriptorUtils.getFqName(readOnly));
    }

    public final ClassDescriptor mapJavaToKotlin(FqName fqName, KotlinBuiltIns builtIns, Integer num) {
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(builtIns, "builtIns");
        ClassId classIdMapJavaToKotlin = (num == null || !fqName.equals(JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME())) ? JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(fqName) : StandardNames.getFunctionClassId(num.intValue());
        if (classIdMapJavaToKotlin != null) {
            return builtIns.getBuiltInClassByFqName(classIdMapJavaToKotlin.asSingleFqName());
        }
        return null;
    }

    public final Collection<ClassDescriptor> mapPlatformClass(FqName fqName, KotlinBuiltIns builtIns) {
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(builtIns, "builtIns");
        ClassDescriptor classDescriptorMapJavaToKotlin$default = mapJavaToKotlin$default(this, fqName, builtIns, null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return C17691y.f56482Y;
        }
        FqName onlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(DescriptorUtilsKt.getFqNameUnsafe(classDescriptorMapJavaToKotlin$default));
        return onlyToMutable == null ? AbstractC17665J.m19268h(classDescriptorMapJavaToKotlin$default) : AbstractC17681o.m19382k(classDescriptorMapJavaToKotlin$default, builtIns.getBuiltInClassByFqName(onlyToMutable));
    }
}
