package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p909nm.AbstractC17682p;
import p910nn.C17693a;
import p910nn.C17695c;
import p910nn.C17696d;
import p910nn.C17697e;
import p910nn.C17699g;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {

    /* JADX INFO: renamed from: K0 */
    public static final /* synthetic */ int f53069K0 = 0;

    /* JADX INFO: renamed from: A0 */
    public final ScopesHolderForClass f53070A0;

    /* JADX INFO: renamed from: B0 */
    public final C17697e f53071B0;

    /* JADX INFO: renamed from: C0 */
    public final DeclarationDescriptor f53072C0;

    /* JADX INFO: renamed from: D0 */
    public final NullableLazyValue f53073D0;

    /* JADX INFO: renamed from: E0 */
    public final NotNullLazyValue f53074E0;

    /* JADX INFO: renamed from: F0 */
    public final NullableLazyValue f53075F0;

    /* JADX INFO: renamed from: G0 */
    public final NotNullLazyValue f53076G0;

    /* JADX INFO: renamed from: H0 */
    public final NullableLazyValue f53077H0;

    /* JADX INFO: renamed from: I0 */
    public final ProtoContainer.Class f53078I0;

    /* JADX INFO: renamed from: J0 */
    public final Annotations f53079J0;

    /* JADX INFO: renamed from: q0 */
    public final ProtoBuf.Class f53080q0;

    /* JADX INFO: renamed from: r0 */
    public final BinaryVersion f53081r0;

    /* JADX INFO: renamed from: s0 */
    public final SourceElement f53082s0;

    /* JADX INFO: renamed from: t0 */
    public final ClassId f53083t0;

    /* JADX INFO: renamed from: u0 */
    public final Modality f53084u0;

    /* JADX INFO: renamed from: v0 */
    public final DescriptorVisibility f53085v0;

    /* JADX INFO: renamed from: w0 */
    public final ClassKind f53086w0;

    /* JADX INFO: renamed from: x0 */
    public final DeserializationContext f53087x0;

    /* JADX INFO: renamed from: y0 */
    public final MemberScopeImpl f53088y0;

    /* JADX INFO: renamed from: z0 */
    public final C17696d f53089z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(DeserializationContext outerContext, ProtoBuf.Class classProto, NameResolver nameResolver, BinaryVersion metadataVersion, SourceElement sourceElement) {
        MemberScopeImpl staticScopeForKotlinEnum;
        super(outerContext.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName()).getShortClassName());
        AbstractC16544l.m18094g(outerContext, "outerContext");
        AbstractC16544l.m18094g(classProto, "classProto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(metadataVersion, "metadataVersion");
        AbstractC16544l.m18094g(sourceElement, "sourceElement");
        this.f53080q0 = classProto;
        this.f53081r0 = metadataVersion;
        this.f53082s0 = sourceElement;
        this.f53083t0 = NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        this.f53084u0 = protoEnumFlags.modality(Flags.MODALITY.get(classProto.getFlags()));
        this.f53085v0 = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(classProto.getFlags()));
        ClassKind classKind = protoEnumFlags.classKind(Flags.CLASS_KIND.get(classProto.getFlags()));
        this.f53086w0 = classKind;
        List<ProtoBuf.TypeParameter> typeParameterList = classProto.getTypeParameterList();
        AbstractC16544l.m18093f(typeParameterList, "getTypeParameterList(...)");
        ProtoBuf.TypeTable typeTable = classProto.getTypeTable();
        AbstractC16544l.m18093f(typeTable, "getTypeTable(...)");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = classProto.getVersionRequirementTable();
        AbstractC16544l.m18093f(versionRequirementTable, "getVersionRequirementTable(...)");
        DeserializationContext deserializationContextChildContext = outerContext.childContext(this, typeParameterList, nameResolver, typeTable2, companion.create(versionRequirementTable), metadataVersion);
        this.f53087x0 = deserializationContextChildContext;
        Boolean bool = Flags.HAS_ENUM_ENTRIES.get(classProto.getFlags());
        AbstractC16544l.m18093f(bool, "get(...)");
        boolean zBooleanValue = bool.booleanValue();
        ClassKind classKind2 = ClassKind.ENUM_CLASS;
        if (classKind == classKind2) {
            staticScopeForKotlinEnum = new StaticScopeForKotlinEnum(deserializationContextChildContext.getStorageManager(), this, zBooleanValue || AbstractC16544l.m18089b(deserializationContextChildContext.getComponents().getEnumEntriesDeserializationSupport().canSynthesizeEnumEntries(), Boolean.TRUE));
        } else {
            staticScopeForKotlinEnum = MemberScope.Empty.INSTANCE;
        }
        this.f53088y0 = staticScopeForKotlinEnum;
        this.f53089z0 = new C17696d(this);
        this.f53070A0 = ScopesHolderForClass.Companion.create(this, deserializationContextChildContext.getStorageManager(), deserializationContextChildContext.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new C17699g(1, 0, C17695c.class, this, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V"));
        this.f53071B0 = classKind == classKind2 ? new C17697e(this) : null;
        DeclarationDescriptor containingDeclaration = outerContext.getContainingDeclaration();
        this.f53072C0 = containingDeclaration;
        this.f53073D0 = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new C17693a(this, 0));
        this.f53074E0 = deserializationContextChildContext.getStorageManager().createLazyValue(new C17693a(this, 1));
        this.f53075F0 = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new C17693a(this, 2));
        this.f53076G0 = deserializationContextChildContext.getStorageManager().createLazyValue(new C17693a(this, 3));
        this.f53077H0 = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new C17693a(this, 4));
        NameResolver nameResolver2 = deserializationContextChildContext.getNameResolver();
        TypeTable typeTable3 = deserializationContextChildContext.getTypeTable();
        DeserializedClassDescriptor deserializedClassDescriptor = containingDeclaration instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) containingDeclaration : null;
        this.f53078I0 = new ProtoContainer.Class(classProto, nameResolver2, typeTable3, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.f53078I0 : null);
        this.f53079J0 = !Flags.HAS_ANNOTATIONS.get(classProto.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContextChildContext.getStorageManager(), new C17693a(this, 5));
    }

    /* JADX INFO: renamed from: b */
    public final C17695c m18379b() {
        return (C17695c) this.f53070A0.getScope(this.f53087x0.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner());
    }

    /* JADX INFO: renamed from: c */
    public final SimpleType m18380c(Name name) {
        Iterator it = m18379b().getContributedVariables(name, NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z6 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z6) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((PropertyDescriptor) next).getExtensionReceiverParameter() == null) {
                if (!z6) {
                    z6 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
        return (SimpleType) (propertyDescriptor != null ? propertyDescriptor.getType() : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f53079J0;
    }

    public final DeserializationContext getC() {
        return this.f53087x0;
    }

    public final ProtoBuf.Class getClassProto() {
        return this.f53080q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo22583getCompanionObjectDescriptor() {
        return (ClassDescriptor) this.f53075F0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        return (Collection) this.f53074E0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return this.f53072C0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        DeserializationContext deserializationContext = this.f53087x0;
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(this.f53080q0, deserializationContext.getTypeTable());
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listContextReceiverTypes, 10));
        Iterator<T> it = listContextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReceiverParameterDescriptorImpl(getThisAsReceiverParameter(), new ContextClassReceiver(this, deserializationContext.getTypeDeserializer().type((ProtoBuf.Type) it.next()), null, null), Annotations.Companion.getEMPTY()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.f53087x0.getTypeDeserializer().getOwnTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return this.f53086w0;
    }

    public final BinaryVersion getMetadataVersion() {
        return this.f53081r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return this.f53084u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        return (Collection) this.f53076G0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        return this.f53082s0;
    }

    public final ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.f53078I0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.f53089z0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f53070A0.getScope(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo22584getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) this.f53073D0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return (ValueClassRepresentation) this.f53077H0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        return this.f53085v0;
    }

    public final boolean hasNestedClass$deserialization(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return m18379b().getClassNames$deserialization().contains(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return Flags.CLASS_KIND.get(this.f53080q0.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        Boolean bool = Flags.IS_DATA.get(this.f53080q0.getFlags());
        AbstractC16544l.m18093f(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        Boolean bool = Flags.IS_EXPECT_CLASS.get(this.f53080q0.getFlags());
        AbstractC16544l.m18093f(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean bool = Flags.IS_EXTERNAL_CLASS.get(this.f53080q0.getFlags());
        AbstractC16544l.m18093f(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        Boolean bool = Flags.IS_FUN_INTERFACE.get(this.f53080q0.getFlags());
        AbstractC16544l.m18093f(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return Flags.IS_VALUE_CLASS.get(this.f53080q0.getFlags()).booleanValue() && this.f53081r0.isAtMost(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        Boolean bool = Flags.IS_INNER.get(this.f53080q0.getFlags());
        AbstractC16544l.m18093f(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return Flags.IS_VALUE_CLASS.get(this.f53080q0.getFlags()).booleanValue() && this.f53081r0.isAtLeast(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("deserialized ");
        sb2.append(isExpect() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScopeImpl getStaticScope() {
        return this.f53088y0;
    }
}
