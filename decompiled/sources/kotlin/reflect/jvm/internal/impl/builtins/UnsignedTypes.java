package kotlin.reflect.jvm.internal.impl.builtins;

import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import mm.C17309l;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedTypes {
    public static final UnsignedTypes INSTANCE = new UnsignedTypes();

    /* JADX INFO: renamed from: a */
    public static final Set f51316a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f51317b;

    /* JADX INFO: renamed from: c */
    public static final HashMap f51318c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashSet f51319d;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        f51316a = AbstractC17680n.m19328G0(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        AbstractC17680n.m19328G0(arrayList2);
        f51317b = new HashMap();
        f51318c = new HashMap();
        AbstractC17659D.m19250l(new HashMap(AbstractC17660E.m19257b(4)), new C17309l[]{new C17309l(UnsignedArrayType.UBYTEARRAY, Name.identifier("ubyteArrayOf")), new C17309l(UnsignedArrayType.USHORTARRAY, Name.identifier("ushortArrayOf")), new C17309l(UnsignedArrayType.UINTARRAY, Name.identifier("uintArrayOf")), new C17309l(UnsignedArrayType.ULONGARRAY, Name.identifier("ulongArrayOf"))});
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().getShortClassName());
        }
        f51319d = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f51317b.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f51318c.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    public static final boolean isUnsignedType(KotlinType type) {
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor;
        AbstractC16544l.m18094g(type, "type");
        if (TypeUtils.noExpectedType(type) || (classifierDescriptorMo22589getDeclarationDescriptor = type.getConstructor().mo22589getDeclarationDescriptor()) == null) {
            return false;
        }
        return INSTANCE.isUnsignedClass(classifierDescriptorMo22589getDeclarationDescriptor);
    }

    public final boolean isShortNameOfUnsignedArray(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return f51319d.contains(name);
    }

    public final boolean isUnsignedClass(DeclarationDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
        return (containingDeclaration instanceof PackageFragmentDescriptor) && AbstractC16544l.m18089b(((PackageFragmentDescriptor) containingDeclaration).getFqName(), StandardNames.BUILT_INS_PACKAGE_FQ_NAME) && f51316a.contains(descriptor.getName());
    }

    public final ClassId getUnsignedClassIdByArrayClassId(ClassId classId) {
        AbstractC16544l.m18094g(classId, qffLJgOYizGmMj.vSrVaiLG);
        return (ClassId) f51317b.get(classId);
    }
}
