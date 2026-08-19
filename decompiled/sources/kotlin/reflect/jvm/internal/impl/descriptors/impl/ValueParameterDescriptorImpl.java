package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import mm.C17314q;
import p049Bm.InterfaceC1426a;
import p298Lm.C5140G;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: r0 */
    public final int f51645r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f51646s0;

    /* JADX INFO: renamed from: t0 */
    public final boolean f51647t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f51648u0;

    /* JADX INFO: renamed from: v0 */
    public final KotlinType f51649v0;

    /* JADX INFO: renamed from: w0 */
    public final ValueParameterDescriptor f51650w0;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ValueParameterDescriptorImpl createWithDestructuringDeclarations(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i10, Annotations annotations, Name name, KotlinType outType, boolean z6, boolean z10, boolean z11, KotlinType kotlinType, SourceElement source, InterfaceC1426a interfaceC1426a) {
            AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
            AbstractC16544l.m18094g(annotations, "annotations");
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(outType, "outType");
            AbstractC16544l.m18094g(source, "source");
            return interfaceC1426a == null ? new ValueParameterDescriptorImpl(containingDeclaration, valueParameterDescriptor, i10, annotations, name, outType, z6, z10, z11, kotlinType, source) : new WithDestructuringDeclaration(containingDeclaration, valueParameterDescriptor, i10, annotations, name, outType, z6, z10, z11, kotlinType, source, interfaceC1426a);
        }
    }

    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {

        /* JADX INFO: renamed from: y0 */
        public static final /* synthetic */ int f51651y0 = 0;

        /* JADX INFO: renamed from: x0 */
        public final C17314q f51652x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i10, Annotations annotations, Name name, KotlinType outType, boolean z6, boolean z10, boolean z11, KotlinType kotlinType, SourceElement source, InterfaceC1426a destructuringVariables) {
            super(containingDeclaration, valueParameterDescriptor, i10, annotations, name, outType, z6, z10, z11, kotlinType, source);
            AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
            AbstractC16544l.m18094g(annotations, "annotations");
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(outType, "outType");
            AbstractC16544l.m18094g(source, "source");
            AbstractC16544l.m18094g(destructuringVariables, "destructuringVariables");
            this.f51652x0 = AbstractC9227W.m9800c(destructuringVariables);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        public ValueParameterDescriptor copy(CallableDescriptor newOwner, Name newName, int i10) {
            AbstractC16544l.m18094g(newOwner, "newOwner");
            AbstractC16544l.m18094g(newName, "newName");
            Annotations annotations = getAnnotations();
            AbstractC16544l.m18093f(annotations, "<get-annotations>(...)");
            KotlinType type = getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            boolean zDeclaresDefaultValue = declaresDefaultValue();
            boolean zIsCrossinline = isCrossinline();
            boolean zIsNoinline = isNoinline();
            KotlinType varargElementType = getVarargElementType();
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
            return new WithDestructuringDeclaration(newOwner, null, i10, annotations, newName, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, NO_SOURCE, new C5140G(this, 14));
        }

        public final List<VariableDescriptor> getDestructuringVariables() {
            return (List) this.f51652x0.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i10, Annotations annotations, Name name, KotlinType outType, boolean z6, boolean z10, boolean z11, KotlinType kotlinType, SourceElement source) {
        super(containingDeclaration, annotations, name, outType, source);
        AbstractC16544l.m18094g(containingDeclaration, "containingDeclaration");
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(outType, "outType");
        AbstractC16544l.m18094g(source, "source");
        this.f51645r0 = i10;
        this.f51646s0 = z6;
        this.f51647t0 = z10;
        this.f51648u0 = z11;
        this.f51649v0 = kotlinType;
        this.f51650w0 = valueParameterDescriptor == null ? this : valueParameterDescriptor;
    }

    public static final ValueParameterDescriptorImpl createWithDestructuringDeclarations(CallableDescriptor callableDescriptor, ValueParameterDescriptor valueParameterDescriptor, int i10, Annotations annotations, Name name, KotlinType kotlinType, boolean z6, boolean z10, boolean z11, KotlinType kotlinType2, SourceElement sourceElement, InterfaceC1426a interfaceC1426a) {
        return Companion.createWithDestructuringDeclarations(callableDescriptor, valueParameterDescriptor, i10, annotations, name, kotlinType, z6, z10, z11, kotlinType2, sourceElement, interfaceC1426a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> visitor, D d10) {
        AbstractC16544l.m18094g(visitor, "visitor");
        return visitor.visitValueParameterDescriptor(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public ValueParameterDescriptor copy(CallableDescriptor newOwner, Name newName, int i10) {
        AbstractC16544l.m18094g(newOwner, "newOwner");
        AbstractC16544l.m18094g(newName, "newName");
        Annotations annotations = getAnnotations();
        AbstractC16544l.m18093f(annotations, "<get-annotations>(...)");
        KotlinType type = getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        boolean zDeclaresDefaultValue = declaresDefaultValue();
        boolean zIsCrossinline = isCrossinline();
        boolean zIsNoinline = isNoinline();
        KotlinType varargElementType = getVarargElementType();
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
        return new ValueParameterDescriptorImpl(newOwner, null, i10, annotations, newName, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, NO_SOURCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean declaresDefaultValue() {
        if (this.f51646s0) {
            CallableDescriptor containingDeclaration = getContainingDeclaration();
            AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((CallableMemberDescriptor) containingDeclaration).getKind().isReal()) {
                return true;
            }
        }
        return false;
    }

    public Void getCompileTimeInitializer() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public int getIndex() {
        return this.f51645r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<ValueParameterDescriptor> getOverriddenDescriptors() {
        Collection<? extends CallableDescriptor> overriddenDescriptors = getContainingDeclaration().getOverriddenDescriptors();
        AbstractC16544l.m18093f(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends CallableDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallableDescriptor) it.next()).getValueParameters().get(getIndex()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public KotlinType getVarargElementType() {
        return this.f51649v0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility LOCAL = DescriptorVisibilities.LOCAL;
        AbstractC16544l.m18093f(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isCrossinline() {
        return this.f51647t0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return ValueParameterDescriptor.DefaultImpls.isLateInit(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isNoinline() {
        return this.f51648u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: getCompileTimeInitializer, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ConstantValue mo22586getCompileTimeInitializer() {
        return (ConstantValue) getCompileTimeInitializer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public CallableDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = super.getContainingDeclaration();
        AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (CallableDescriptor) containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public ValueParameterDescriptor substitute(TypeSubstitutor substitutor) {
        AbstractC16544l.m18094g(substitutor, "substitutor");
        if (substitutor.isEmpty()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ValueParameterDescriptor getOriginal() {
        ValueParameterDescriptor valueParameterDescriptor = this.f51650w0;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.getOriginal();
    }
}
