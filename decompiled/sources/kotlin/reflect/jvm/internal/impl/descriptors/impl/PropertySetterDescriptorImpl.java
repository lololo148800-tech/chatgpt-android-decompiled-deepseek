package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes2.dex */
public class PropertySetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertySetterDescriptor {

    /* JADX INFO: renamed from: y0 */
    public ValueParameterDescriptor f51632y0;

    /* JADX INFO: renamed from: z0 */
    public final PropertySetterDescriptor f51633z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PropertySetterDescriptorImpl(PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z6, boolean z10, boolean z11, CallableMemberDescriptor.Kind kind, PropertySetterDescriptor propertySetterDescriptor, SourceElement sourceElement) {
        PropertySetterDescriptor propertySetterDescriptor2;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        super(modality, descriptorVisibility, propertyDescriptor, annotations, Name.special("<set-" + propertyDescriptor.getName() + Separators.GREATER_THAN), z6, z10, z11, kind, sourceElement);
        if (propertyDescriptor == null) {
            m18155a(0);
            throw null;
        }
        if (annotations == null) {
            m18155a(1);
            throw null;
        }
        if (modality == null) {
            m18155a(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18155a(3);
            throw null;
        }
        if (kind == null) {
            m18155a(4);
            throw null;
        }
        if (sourceElement == null) {
            m18155a(5);
            throw null;
        }
        if (propertySetterDescriptor != null) {
            propertySetterDescriptorImpl = this;
            propertySetterDescriptor2 = propertySetterDescriptor;
        } else {
            propertySetterDescriptor2 = this;
            propertySetterDescriptorImpl = propertySetterDescriptor2;
        }
        propertySetterDescriptorImpl.f51633z0 = propertySetterDescriptor2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18155a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static ValueParameterDescriptorImpl createSetterParameter(PropertySetterDescriptor propertySetterDescriptor, KotlinType kotlinType, Annotations annotations) {
        if (propertySetterDescriptor == null) {
            m18155a(7);
            throw null;
        }
        if (kotlinType == null) {
            m18155a(8);
            throw null;
        }
        if (annotations != null) {
            return new ValueParameterDescriptorImpl(propertySetterDescriptor, null, 0, annotations, SpecialNames.IMPLICIT_SET_PARAMETER, kotlinType, false, false, false, null, SourceElement.NO_SOURCE);
        }
        m18155a(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.visitPropertySetterDescriptor(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<? extends PropertySetterDescriptor> getOverriddenDescriptors() {
        return m18150b(false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        SimpleType unitType = DescriptorUtilsKt.getBuiltIns(this).getUnitType();
        if (unitType != null) {
            return unitType;
        }
        m18155a(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ValueParameterDescriptor> getValueParameters() {
        ValueParameterDescriptor valueParameterDescriptor = this.f51632y0;
        if (valueParameterDescriptor == null) {
            throw new IllegalStateException();
        }
        List<ValueParameterDescriptor> listSingletonList = Collections.singletonList(valueParameterDescriptor);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m18155a(11);
        throw null;
    }

    public void initialize(ValueParameterDescriptor valueParameterDescriptor) {
        if (valueParameterDescriptor != null) {
            this.f51632y0 = valueParameterDescriptor;
        } else {
            m18155a(6);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PropertySetterDescriptor getOriginal() {
        PropertySetterDescriptor propertySetterDescriptor = this.f51633z0;
        if (propertySetterDescriptor != null) {
            return propertySetterDescriptor;
        }
        m18155a(13);
        throw null;
    }
}
