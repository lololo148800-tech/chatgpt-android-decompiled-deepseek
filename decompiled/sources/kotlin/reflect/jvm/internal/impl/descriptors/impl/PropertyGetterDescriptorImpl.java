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
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyGetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertyGetterDescriptor {

    /* JADX INFO: renamed from: y0 */
    public KotlinType f51630y0;

    /* JADX INFO: renamed from: z0 */
    public final PropertyGetterDescriptor f51631z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PropertyGetterDescriptorImpl(PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z6, boolean z10, boolean z11, CallableMemberDescriptor.Kind kind, PropertyGetterDescriptor propertyGetterDescriptor, SourceElement sourceElement) {
        PropertyGetterDescriptor propertyGetterDescriptor2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        super(modality, descriptorVisibility, propertyDescriptor, annotations, Name.special("<get-" + propertyDescriptor.getName() + Separators.GREATER_THAN), z6, z10, z11, kind, sourceElement);
        if (propertyDescriptor == null) {
            m18154a(0);
            throw null;
        }
        if (annotations == null) {
            m18154a(1);
            throw null;
        }
        if (modality == null) {
            m18154a(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18154a(3);
            throw null;
        }
        if (kind == null) {
            m18154a(4);
            throw null;
        }
        if (sourceElement == null) {
            m18154a(5);
            throw null;
        }
        if (propertyGetterDescriptor != null) {
            propertyGetterDescriptorImpl = this;
            propertyGetterDescriptor2 = propertyGetterDescriptor;
        } else {
            propertyGetterDescriptor2 = this;
            propertyGetterDescriptorImpl = propertyGetterDescriptor2;
        }
        propertyGetterDescriptorImpl.f51631z0 = propertyGetterDescriptor2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18154a(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.visitPropertyGetterDescriptor(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<? extends PropertyGetterDescriptor> getOverriddenDescriptors() {
        return m18150b(true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.f51630y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ValueParameterDescriptor> getValueParameters() {
        List<ValueParameterDescriptor> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18154a(7);
        throw null;
    }

    public void initialize(KotlinType kotlinType) {
        if (kotlinType == null) {
            kotlinType = getCorrespondingProperty().getType();
        }
        this.f51630y0 = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PropertyGetterDescriptor getOriginal() {
        PropertyGetterDescriptor propertyGetterDescriptor = this.f51631z0;
        if (propertyGetterDescriptor != null) {
            return propertyGetterDescriptor;
        }
        m18154a(8);
        throw null;
    }
}
