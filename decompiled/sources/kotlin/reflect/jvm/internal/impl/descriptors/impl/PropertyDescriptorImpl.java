package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import p009A7.FlM.nkFZpTrMPpn;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes2.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {

    /* JADX INFO: renamed from: A0 */
    public final boolean f51599A0;

    /* JADX INFO: renamed from: B0 */
    public final boolean f51600B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f51601C0;

    /* JADX INFO: renamed from: D0 */
    public final boolean f51602D0;

    /* JADX INFO: renamed from: E0 */
    public final boolean f51603E0;

    /* JADX INFO: renamed from: F0 */
    public List f51604F0;

    /* JADX INFO: renamed from: G0 */
    public ReceiverParameterDescriptor f51605G0;

    /* JADX INFO: renamed from: H0 */
    public ReceiverParameterDescriptor f51606H0;

    /* JADX INFO: renamed from: I0 */
    public ArrayList f51607I0;

    /* JADX INFO: renamed from: J0 */
    public PropertyGetterDescriptorImpl f51608J0;

    /* JADX INFO: renamed from: K0 */
    public PropertySetterDescriptor f51609K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f51610L0;

    /* JADX INFO: renamed from: M0 */
    public FieldDescriptor f51611M0;

    /* JADX INFO: renamed from: N0 */
    public FieldDescriptor f51612N0;

    /* JADX INFO: renamed from: u0 */
    public final Modality f51613u0;

    /* JADX INFO: renamed from: v0 */
    public DescriptorVisibility f51614v0;

    /* JADX INFO: renamed from: w0 */
    public Collection f51615w0;

    /* JADX INFO: renamed from: x0 */
    public final PropertyDescriptor f51616x0;

    /* JADX INFO: renamed from: y0 */
    public final CallableMemberDescriptor.Kind f51617y0;

    /* JADX INFO: renamed from: z0 */
    public final boolean f51618z0;

    public class CopyConfiguration {

        /* JADX INFO: renamed from: a */
        public DeclarationDescriptor f51619a;

        /* JADX INFO: renamed from: b */
        public Modality f51620b;

        /* JADX INFO: renamed from: c */
        public DescriptorVisibility f51621c;

        /* JADX INFO: renamed from: e */
        public CallableMemberDescriptor.Kind f51623e;

        /* JADX INFO: renamed from: h */
        public final ReceiverParameterDescriptor f51626h;

        /* JADX INFO: renamed from: i */
        public final Name f51627i;

        /* JADX INFO: renamed from: j */
        public final KotlinType f51628j;

        /* JADX INFO: renamed from: d */
        public PropertyDescriptor f51622d = null;

        /* JADX INFO: renamed from: f */
        public TypeSubstitution f51624f = TypeSubstitution.EMPTY;

        /* JADX INFO: renamed from: g */
        public boolean f51625g = true;

        public CopyConfiguration() {
            this.f51619a = PropertyDescriptorImpl.this.getContainingDeclaration();
            this.f51620b = PropertyDescriptorImpl.this.getModality();
            this.f51621c = PropertyDescriptorImpl.this.getVisibility();
            this.f51623e = PropertyDescriptorImpl.this.getKind();
            this.f51626h = PropertyDescriptorImpl.this.f51605G0;
            this.f51627i = PropertyDescriptorImpl.this.getName();
            this.f51628j = PropertyDescriptorImpl.this.getType();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m18153a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = DiagnosticsEntry.NAME_KEY;
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = nkFZpTrMPpn.ZDZIwYHglFlF;
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public PropertyDescriptor build() {
            ReceiverParameterDescriptor receiverParameterDescriptor;
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
            PropertySetterDescriptorImpl propertySetterDescriptorImpl;
            InterfaceC1426a interfaceC1426a;
            PropertyDescriptorImpl propertyDescriptorImpl = PropertyDescriptorImpl.this;
            propertyDescriptorImpl.getClass();
            DeclarationDescriptor declarationDescriptor = this.f51619a;
            Modality modality = this.f51620b;
            DescriptorVisibility descriptorVisibility = this.f51621c;
            PropertyDescriptor propertyDescriptor = this.f51622d;
            CallableMemberDescriptor.Kind kind = this.f51623e;
            SourceElement sourceElement = SourceElement.NO_SOURCE;
            if (sourceElement == null) {
                PropertyDescriptorImpl.m18151a(28);
                throw null;
            }
            PropertyDescriptorImpl propertyDescriptorImplMo18152b = propertyDescriptorImpl.mo18152b(declarationDescriptor, modality, descriptorVisibility, propertyDescriptor, kind, this.f51627i, sourceElement);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptorImpl.getTypeParameters();
            ArrayList arrayList = new ArrayList(typeParameters.size());
            TypeSubstitutor typeSubstitutorSubstituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(typeParameters, this.f51624f, propertyDescriptorImplMo18152b, arrayList);
            Variance variance = Variance.OUT_VARIANCE;
            KotlinType kotlinType = this.f51628j;
            KotlinType kotlinTypeSubstitute = typeSubstitutorSubstituteTypeParameters.substitute(kotlinType, variance);
            if (kotlinTypeSubstitute != null) {
                Variance variance2 = Variance.IN_VARIANCE;
                KotlinType kotlinTypeSubstitute2 = typeSubstitutorSubstituteTypeParameters.substitute(kotlinType, variance2);
                if (kotlinTypeSubstitute2 != null) {
                    propertyDescriptorImplMo18152b.setInType(kotlinTypeSubstitute2);
                }
                ReceiverParameterDescriptor receiverParameterDescriptor2 = this.f51626h;
                if (receiverParameterDescriptor2 != null) {
                    ReceiverParameterDescriptor receiverParameterDescriptorSubstitute = receiverParameterDescriptor2.substitute(typeSubstitutorSubstituteTypeParameters);
                    receiverParameterDescriptor = receiverParameterDescriptorSubstitute != null ? receiverParameterDescriptorSubstitute : null;
                }
                ReceiverParameterDescriptor receiverParameterDescriptor3 = propertyDescriptorImpl.f51606H0;
                if (receiverParameterDescriptor3 != null) {
                    KotlinType kotlinTypeSubstitute3 = typeSubstitutorSubstituteTypeParameters.substitute(receiverParameterDescriptor3.getType(), variance2);
                    receiverParameterDescriptorImpl = kotlinTypeSubstitute3 == null ? null : new ReceiverParameterDescriptorImpl(propertyDescriptorImplMo18152b, new ExtensionReceiver(propertyDescriptorImplMo18152b, kotlinTypeSubstitute3, receiverParameterDescriptor3.getValue()), receiverParameterDescriptor3.getAnnotations());
                } else {
                    receiverParameterDescriptorImpl = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (ReceiverParameterDescriptor receiverParameterDescriptor4 : propertyDescriptorImpl.f51604F0) {
                    KotlinType kotlinTypeSubstitute4 = typeSubstitutorSubstituteTypeParameters.substitute(receiverParameterDescriptor4.getType(), Variance.IN_VARIANCE);
                    ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2 = kotlinTypeSubstitute4 == null ? null : new ReceiverParameterDescriptorImpl(propertyDescriptorImplMo18152b, new ContextReceiver(propertyDescriptorImplMo18152b, kotlinTypeSubstitute4, ((ImplicitContextReceiver) receiverParameterDescriptor4.getValue()).getCustomLabelName(), receiverParameterDescriptor4.getValue()), receiverParameterDescriptor4.getAnnotations());
                    if (receiverParameterDescriptorImpl2 != null) {
                        arrayList2.add(receiverParameterDescriptorImpl2);
                    }
                }
                propertyDescriptorImplMo18152b.setType(kotlinTypeSubstitute, arrayList, receiverParameterDescriptor, receiverParameterDescriptorImpl, arrayList2);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = propertyDescriptorImpl.f51608J0;
                if (propertyGetterDescriptorImpl2 == null) {
                    propertyGetterDescriptorImpl = null;
                } else {
                    Annotations annotations = propertyGetterDescriptorImpl2.getAnnotations();
                    Modality modality2 = this.f51620b;
                    DescriptorVisibility visibility = propertyDescriptorImpl.f51608J0.getVisibility();
                    if (this.f51623e == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(visibility.normalize())) {
                        visibility = DescriptorVisibilities.INVISIBLE_FAKE;
                    }
                    DescriptorVisibility descriptorVisibility2 = visibility;
                    boolean zIsDefault = propertyDescriptorImpl.f51608J0.isDefault();
                    boolean zIsExternal = propertyDescriptorImpl.f51608J0.isExternal();
                    boolean zIsInline = propertyDescriptorImpl.f51608J0.isInline();
                    CallableMemberDescriptor.Kind kind2 = this.f51623e;
                    PropertyDescriptor propertyDescriptor2 = this.f51622d;
                    propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(propertyDescriptorImplMo18152b, annotations, modality2, descriptorVisibility2, zIsDefault, zIsExternal, zIsInline, kind2, propertyDescriptor2 == null ? null : propertyDescriptor2.getGetter(), SourceElement.NO_SOURCE);
                }
                if (propertyGetterDescriptorImpl != null) {
                    KotlinType returnType = propertyDescriptorImpl.f51608J0.getReturnType();
                    PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3 = propertyDescriptorImpl.f51608J0;
                    if (propertyGetterDescriptorImpl3 == null) {
                        PropertyDescriptorImpl.m18151a(31);
                        throw null;
                    }
                    propertyGetterDescriptorImpl.setInitialSignatureDescriptor(propertyGetterDescriptorImpl3.getInitialSignatureDescriptor() != null ? propertyGetterDescriptorImpl3.getInitialSignatureDescriptor().substitute(typeSubstitutorSubstituteTypeParameters) : null);
                    propertyGetterDescriptorImpl.initialize(returnType != null ? typeSubstitutorSubstituteTypeParameters.substitute(returnType, Variance.OUT_VARIANCE) : null);
                }
                PropertySetterDescriptor propertySetterDescriptor = propertyDescriptorImpl.f51609K0;
                if (propertySetterDescriptor == null) {
                    propertySetterDescriptorImpl = null;
                } else {
                    Annotations annotations2 = propertySetterDescriptor.getAnnotations();
                    Modality modality3 = this.f51620b;
                    DescriptorVisibility visibility2 = propertyDescriptorImpl.f51609K0.getVisibility();
                    if (this.f51623e == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(visibility2.normalize())) {
                        visibility2 = DescriptorVisibilities.INVISIBLE_FAKE;
                    }
                    DescriptorVisibility descriptorVisibility3 = visibility2;
                    boolean zIsDefault2 = propertyDescriptorImpl.f51609K0.isDefault();
                    boolean zIsExternal2 = propertyDescriptorImpl.f51609K0.isExternal();
                    boolean zIsInline2 = propertyDescriptorImpl.f51609K0.isInline();
                    CallableMemberDescriptor.Kind kind3 = this.f51623e;
                    PropertyDescriptor propertyDescriptor3 = this.f51622d;
                    propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptorImplMo18152b, annotations2, modality3, descriptorVisibility3, zIsDefault2, zIsExternal2, zIsInline2, kind3, propertyDescriptor3 == null ? null : propertyDescriptor3.getSetter(), SourceElement.NO_SOURCE);
                }
                if (propertySetterDescriptorImpl != null) {
                    List<ValueParameterDescriptor> substitutedValueParameters = FunctionDescriptorImpl.getSubstitutedValueParameters(propertySetterDescriptorImpl, propertyDescriptorImpl.f51609K0.getValueParameters(), typeSubstitutorSubstituteTypeParameters, false, false, null);
                    if (substitutedValueParameters == null) {
                        propertyDescriptorImplMo18152b.setSetterProjectedOut(true);
                        substitutedValueParameters = Collections.singletonList(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, DescriptorUtilsKt.getBuiltIns(this.f51619a).getNothingType(), propertyDescriptorImpl.f51609K0.getValueParameters().get(0).getAnnotations()));
                    }
                    if (substitutedValueParameters.size() != 1) {
                        throw new IllegalStateException();
                    }
                    PropertySetterDescriptor propertySetterDescriptor2 = propertyDescriptorImpl.f51609K0;
                    if (propertySetterDescriptor2 == null) {
                        PropertyDescriptorImpl.m18151a(31);
                        throw null;
                    }
                    propertySetterDescriptorImpl.setInitialSignatureDescriptor(propertySetterDescriptor2.getInitialSignatureDescriptor() != null ? propertySetterDescriptor2.getInitialSignatureDescriptor().substitute(typeSubstitutorSubstituteTypeParameters) : null);
                    propertySetterDescriptorImpl.initialize(substitutedValueParameters.get(0));
                }
                FieldDescriptor fieldDescriptor = propertyDescriptorImpl.f51611M0;
                FieldDescriptorImpl fieldDescriptorImpl = fieldDescriptor == null ? null : new FieldDescriptorImpl(fieldDescriptor.getAnnotations(), propertyDescriptorImplMo18152b);
                FieldDescriptor fieldDescriptor2 = propertyDescriptorImpl.f51612N0;
                propertyDescriptorImplMo18152b.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 == null ? null : new FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), propertyDescriptorImplMo18152b));
                if (this.f51625g) {
                    SmartSet smartSetCreate = SmartSet.create();
                    Iterator<? extends PropertyDescriptor> it = propertyDescriptorImpl.getOverriddenDescriptors().iterator();
                    while (it.hasNext()) {
                        smartSetCreate.add(it.next().substitute(typeSubstitutorSubstituteTypeParameters));
                    }
                    propertyDescriptorImplMo18152b.setOverriddenDescriptors(smartSetCreate);
                }
                if (propertyDescriptorImpl.isConst() && (interfaceC1426a = propertyDescriptorImpl.f51656t0) != null) {
                    propertyDescriptorImplMo18152b.setCompileTimeInitializer(propertyDescriptorImpl.f51655s0, interfaceC1426a);
                }
                return propertyDescriptorImplMo18152b;
            }
            return null;
        }

        public CopyConfiguration setCopyOverrides(boolean z6) {
            this.f51625g = z6;
            return this;
        }

        public CopyConfiguration setKind(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.f51623e = kind;
                return this;
            }
            m18153a(10);
            throw null;
        }

        public CopyConfiguration setModality(Modality modality) {
            if (modality != null) {
                this.f51620b = modality;
                return this;
            }
            m18153a(6);
            throw null;
        }

        public CopyConfiguration setOriginal(CallableMemberDescriptor callableMemberDescriptor) {
            this.f51622d = (PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        public CopyConfiguration setOwner(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                this.f51619a = declarationDescriptor;
                return this;
            }
            m18153a(0);
            throw null;
        }

        public CopyConfiguration setSubstitution(TypeSubstitution typeSubstitution) {
            if (typeSubstitution != null) {
                this.f51624f = typeSubstitution;
                return this;
            }
            m18153a(15);
            throw null;
        }

        public CopyConfiguration setVisibility(DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility != null) {
                this.f51621c = descriptorVisibility;
                return this;
            }
            m18153a(8);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyDescriptorImpl(DeclarationDescriptor declarationDescriptor, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z6, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        super(declarationDescriptor, annotations, name, null, z6, sourceElement);
        if (declarationDescriptor == null) {
            m18151a(0);
            throw null;
        }
        if (annotations == null) {
            m18151a(1);
            throw null;
        }
        if (modality == null) {
            m18151a(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18151a(3);
            throw null;
        }
        if (name == null) {
            m18151a(4);
            throw null;
        }
        if (kind == null) {
            m18151a(5);
            throw null;
        }
        if (sourceElement == null) {
            m18151a(6);
            throw null;
        }
        this.f51615w0 = null;
        this.f51604F0 = Collections.emptyList();
        this.f51613u0 = modality;
        this.f51614v0 = descriptorVisibility;
        this.f51616x0 = propertyDescriptor == null ? this : propertyDescriptor;
        this.f51617y0 = kind;
        this.f51618z0 = z10;
        this.f51599A0 = z11;
        this.f51600B0 = z12;
        this.f51601C0 = z13;
        this.f51602D0 = z14;
        this.f51603E0 = z15;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18151a(int i10) {
        String str;
        int i11;
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i10 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i10 == 38) {
            objArr[1] = "getOriginal";
        } else if (i10 == 39) {
            objArr[1] = "getKind";
        } else if (i10 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 42) {
            switch (i10) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static PropertyDescriptorImpl create(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z6, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        if (declarationDescriptor == null) {
            m18151a(7);
            throw null;
        }
        if (annotations == null) {
            m18151a(8);
            throw null;
        }
        if (modality == null) {
            m18151a(9);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18151a(10);
            throw null;
        }
        if (name == null) {
            m18151a(11);
            throw null;
        }
        if (kind == null) {
            m18151a(12);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyDescriptorImpl(declarationDescriptor, null, annotations, modality, descriptorVisibility, z6, name, kind, sourceElement, z10, z11, z12, z13, z14, z15);
        }
        m18151a(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.visitPropertyDescriptor(this, d10);
    }

    /* JADX INFO: renamed from: b */
    public PropertyDescriptorImpl mo18152b(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m18151a(32);
            throw null;
        }
        if (modality == null) {
            m18151a(33);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18151a(34);
            throw null;
        }
        if (kind == null) {
            m18151a(35);
            throw null;
        }
        if (name == null) {
            m18151a(36);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, isVar(), name, kind, sourceElement, isLateInit(), isConst(), isExpect(), isActual(), isExternal(), isDelegated());
        }
        m18151a(37);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public List<PropertyAccessorDescriptor> getAccessors() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f51608J0;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.f51609K0;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor getBackingField() {
        return this.f51611M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        List<ReceiverParameterDescriptor> list = this.f51604F0;
        if (list != null) {
            return list;
        }
        m18151a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor getDelegateField() {
        return this.f51612N0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.f51605G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.f51606H0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f51617y0;
        if (kind != null) {
            return kind;
        }
        m18151a(39);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = this.f51613u0;
        if (modality != null) {
            return modality;
        }
        m18151a(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<? extends PropertyDescriptor> getOverriddenDescriptors() {
        Collection<? extends PropertyDescriptor> collectionEmptyList = this.f51615w0;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        m18151a(41);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        KotlinType type = getType();
        if (type != null) {
            return type;
        }
        m18151a(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertySetterDescriptor getSetter() {
        return this.f51609K0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<TypeParameterDescriptor> getTypeParameters() {
        ArrayList arrayList = this.f51607I0;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f51614v0;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        m18151a(25);
        throw null;
    }

    public void initialize(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor) {
        initialize(propertyGetterDescriptorImpl, propertySetterDescriptor, null, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.f51601C0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f51599A0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean isDelegated() {
        return this.f51603E0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.f51600B0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f51602D0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return this.f51618z0;
    }

    public boolean isSetterProjectedOut() {
        return this.f51610L0;
    }

    public CopyConfiguration newCopyBuilder() {
        return new CopyConfiguration();
    }

    public void setInType(KotlinType kotlinType) {
        if (kotlinType != null) {
            return;
        }
        m18151a(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            this.f51615w0 = collection;
        } else {
            m18151a(40);
            throw null;
        }
    }

    public void setSetterProjectedOut(boolean z6) {
        this.f51610L0 = z6;
    }

    public void setType(KotlinType kotlinType, List<? extends TypeParameterDescriptor> list, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<ReceiverParameterDescriptor> list2) {
        if (kotlinType == null) {
            m18151a(17);
            throw null;
        }
        if (list == null) {
            m18151a(18);
            throw null;
        }
        if (list2 == null) {
            m18151a(19);
            throw null;
        }
        setOutType(kotlinType);
        this.f51607I0 = new ArrayList(list);
        this.f51606H0 = receiverParameterDescriptor2;
        this.f51605G0 = receiverParameterDescriptor;
        this.f51604F0 = list2;
    }

    public void setVisibility(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            this.f51614v0 = descriptorVisibility;
        } else {
            m18151a(20);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public PropertyDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z6) {
        PropertyDescriptor propertyDescriptorBuild = newCopyBuilder().setOwner(declarationDescriptor).setOriginal(null).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z6).build();
        if (propertyDescriptorBuild != null) {
            return propertyDescriptorBuild;
        }
        m18151a(42);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertyGetterDescriptorImpl getGetter() {
        return this.f51608J0;
    }

    public void initialize(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor, FieldDescriptor fieldDescriptor, FieldDescriptor fieldDescriptor2) {
        this.f51608J0 = propertyGetterDescriptorImpl;
        this.f51609K0 = propertySetterDescriptor;
        this.f51611M0 = fieldDescriptor;
        this.f51612N0 = fieldDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public PropertyDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : newCopyBuilder().setSubstitution(typeSubstitutor.getSubstitution()).setOriginal(getOriginal()).build();
        }
        m18151a(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PropertyDescriptor getOriginal() {
        PropertyDescriptor propertyDescriptor = this.f51616x0;
        PropertyDescriptor original = propertyDescriptor == this ? this : propertyDescriptor.getOriginal();
        if (original != null) {
            return original;
        }
        m18151a(38);
        throw null;
    }
}
