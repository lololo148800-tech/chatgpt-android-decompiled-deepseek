package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p160G5.p161rK.TVCuK;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public interface AdditionalClassPartsProvider {

    public static final class None implements AdditionalClassPartsProvider {
        public static final None INSTANCE = new None();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<ClassConstructorDescriptor> getConstructors(ClassDescriptor classDescriptor) {
            AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
            return C17689w.f56480Y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<SimpleFunctionDescriptor> getFunctions(Name name, ClassDescriptor classDescriptor) {
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
            return C17689w.f56480Y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor) {
            AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
            return C17689w.f56480Y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<Name> getFunctionsNames(ClassDescriptor classDescriptor) {
            AbstractC16544l.m18094g(classDescriptor, TVCuK.nWLnD);
            return C17689w.f56480Y;
        }
    }

    Collection<ClassConstructorDescriptor> getConstructors(ClassDescriptor classDescriptor);

    Collection<SimpleFunctionDescriptor> getFunctions(Name name, ClassDescriptor classDescriptor);

    Collection<Name> getFunctionsNames(ClassDescriptor classDescriptor);

    Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor);
}
