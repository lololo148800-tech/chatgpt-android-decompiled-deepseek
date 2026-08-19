package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class IndexedParametersSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: a */
    public final TypeParameterDescriptor[] f53167a;

    /* JADX INFO: renamed from: b */
    public final TypeProjection[] f53168b;

    /* JADX INFO: renamed from: c */
    public final boolean f53169c;

    public /* synthetic */ IndexedParametersSubstitution(TypeParameterDescriptor[] typeParameterDescriptorArr, TypeProjection[] typeProjectionArr, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeParameterDescriptorArr, typeProjectionArr, (i10 & 4) != 0 ? false : z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.f53169c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public TypeProjection mo22592get(KotlinType key) {
        AbstractC16544l.m18094g(key, "key");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = key.getConstructor().mo22589getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return null;
        }
        int index = typeParameterDescriptor.getIndex();
        TypeParameterDescriptor[] typeParameterDescriptorArr = this.f53167a;
        if (index >= typeParameterDescriptorArr.length || !AbstractC16544l.m18089b(typeParameterDescriptorArr[index].getTypeConstructor(), typeParameterDescriptor.getTypeConstructor())) {
            return null;
        }
        return this.f53168b[index];
    }

    public final TypeProjection[] getArguments() {
        return this.f53168b;
    }

    public final TypeParameterDescriptor[] getParameters() {
        return this.f53167a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.f53168b.length == 0;
    }

    public IndexedParametersSubstitution(TypeParameterDescriptor[] parameters, TypeProjection[] arguments, boolean z6) {
        AbstractC16544l.m18094g(parameters, "parameters");
        AbstractC16544l.m18094g(arguments, "arguments");
        this.f53167a = parameters;
        this.f53168b = arguments;
        this.f53169c = z6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexedParametersSubstitution(List<? extends TypeParameterDescriptor> parameters, List<? extends TypeProjection> argumentsList) {
        this((TypeParameterDescriptor[]) parameters.toArray(new TypeParameterDescriptor[0]), (TypeProjection[]) argumentsList.toArray(new TypeProjection[0]), false, 4, null);
        AbstractC16544l.m18094g(parameters, "parameters");
        AbstractC16544l.m18094g(argumentsList, "argumentsList");
    }
}
