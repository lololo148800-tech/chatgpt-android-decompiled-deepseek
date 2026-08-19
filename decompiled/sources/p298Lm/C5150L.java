package p298Lm;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import mm.C17296C;
import mm.EnumC17307j;
import mm.InterfaceC17306i;
import no.AbstractC17708b;
import p011A9.p012Ra.ahZQMZ;
import p024Am.C0560a;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p225Im.C3743B;
import p225Im.EnumC3744C;
import p225Im.InterfaceC3776x;
import p323Mm.C5498e;
import p544W9.AbstractC8443A;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17691y;
import pn.C18518e;
import to.C20022m;
import to.C20026q;

/* JADX INFO: renamed from: Lm.L */
/* JADX INFO: loaded from: classes2.dex */
public final class C5150L implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16790Y;

    /* JADX INFO: renamed from: Z */
    public final Object f16791Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f16792o0;

    public /* synthetic */ C5150L(Object obj, int i10, Object obj2) {
        this.f16790Y = i10;
        this.f16791Z = obj;
        this.f16792o0 = obj2;
    }

    public /* synthetic */ C5150L(Object obj, Object obj2, boolean z6, int i10) {
        this.f16790Y = i10;
        this.f16792o0 = obj;
        this.f16791Z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0409  */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        List listMo5686k;
        ArrayList arrayList;
        String strMo5750a;
        C3743B c3743bM9046b;
        int i10 = 0;
        int i11 = 1;
        Object obj = this.f16791Z;
        Object obj2 = this.f16792o0;
        switch (this.f16790Y) {
            case 0:
                C5152N c5152n = (C5152N) obj;
                AbstractC5148K abstractC5148K = c5152n.f16796s0;
                abstractC5148K.getClass();
                String str = (String) obj2;
                String signature = c5152n.f16797t0;
                AbstractC16544l.m18094g(signature, "signature");
                if (str.equals("<init>")) {
                    listMo5686k = AbstractC17680n.m19322C0(abstractC5148K.mo5685j());
                    arrayList = new ArrayList();
                    for (Object obj3 : listMo5686k) {
                        ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) obj3;
                        if (constructorDescriptor.isPrimary()) {
                            ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
                            AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
                            if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration)) {
                                String strMo5750a2 = AbstractC5143H0.m5712c(constructorDescriptor).mo5750a();
                                if (!AbstractC21329w.m21734u(strMo5750a2, "constructor-impl", false) || !AbstractC21329w.m21725l(strMo5750a2, ")V", false)) {
                                    throw new IllegalArgumentException(("Invalid signature of " + constructorDescriptor + ": " + strMo5750a2).toString());
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(AbstractC21322p.m21690X(strMo5750a2, TokenNames.f32021V));
                                ClassifierDescriptorWithTypeParameters containingDeclaration2 = constructorDescriptor.getContainingDeclaration();
                                AbstractC16544l.m18093f(containingDeclaration2, "getContainingDeclaration(...)");
                                ClassId classId = DescriptorUtilsKt.getClassId(containingDeclaration2);
                                AbstractC16544l.m18091d(classId);
                                sb2.append(ClassMapperLite.mapClass(classId.asString()));
                                strMo5750a = sb2.toString();
                            } else {
                                strMo5750a = AbstractC5143H0.m5712c(constructorDescriptor).mo5750a();
                            }
                        } else {
                            strMo5750a = AbstractC5143H0.m5712c(constructorDescriptor).mo5750a();
                        }
                        if (AbstractC16544l.m18089b(strMo5750a, signature)) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    Name nameIdentifier = Name.identifier(str);
                    AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
                    listMo5686k = abstractC5148K.mo5686k(nameIdentifier);
                    arrayList = new ArrayList();
                    for (Object obj4 : listMo5686k) {
                        if (AbstractC16544l.m18089b(AbstractC5143H0.m5712c((FunctionDescriptor) obj4).mo5750a(), signature)) {
                            arrayList.add(obj4);
                        }
                    }
                }
                if (arrayList.size() == 1) {
                    return (FunctionDescriptor) AbstractC17680n.m19365o0(arrayList);
                }
                String strM19349Y = AbstractC17680n.m19349Y(listMo5686k, Separators.RETURN, null, null, 0, null, C5166b.f16832v0, 30);
                StringBuilder sbM9896o = AbstractC9306j0.m9896o("Function '", str, "' (JVM signature: ", signature, ") not resolved in ");
                sbM9896o.append(abstractC5148K);
                sbM9896o.append(':');
                sbM9896o.append(strM19349Y.length() == 0 ? " no members found" : Separators.RETURN.concat(strM19349Y));
                throw new C0560a(sbM9896o.toString());
            case 1:
                C5213y0 c5213y0 = (C5213y0) obj;
                List<TypeProjection> arguments = c5213y0.f16935Y.getArguments();
                if (arguments.isEmpty()) {
                    return C17689w.f56480Y;
                }
                InterfaceC17306i interfaceC17306iM9799b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5207v0(c5213y0, i11));
                List<TypeProjection> list = arguments;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
                for (Object obj5 : list) {
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    TypeProjection typeProjection = (TypeProjection) obj5;
                    if (typeProjection.isStarProjection()) {
                        c3743bM9046b = C3743B.f11391c;
                    } else {
                        KotlinType type = typeProjection.getType();
                        AbstractC16544l.m18093f(type, "getType(...)");
                        C5213y0 c5213y1 = new C5213y0(type, ((InterfaceC1426a) obj2) == null ? null : new C5209w0(c5213y0, i10, interfaceC17306iM9799b));
                        int i13 = AbstractC5211x0.f16930a[typeProjection.getProjectionKind().ordinal()];
                        if (i13 == 1) {
                            C3743B c3743b = C3743B.f11391c;
                            c3743bM9046b = AbstractC8443A.m9046b(c5213y1);
                        } else if (i13 == 2) {
                            c3743bM9046b = new C3743B(EnumC3744C.f11395Z, c5213y1);
                        } else {
                            if (i13 != 3) {
                                throw new C0644w();
                            }
                            c3743bM9046b = new C3743B(EnumC3744C.f11396o0, c5213y1);
                        }
                    }
                    arrayList2.add(c3743bM9046b);
                    i10 = i12;
                }
                return arrayList2;
            case 2:
                StringBuilder sb3 = new StringBuilder();
                sb3.append('@');
                sb3.append(((Class) obj).getCanonicalName());
                AbstractC17680n.m19347W(((Map) obj2).entrySet(), sb3, ", ", (124 & 4) != 0 ? "" : ahZQMZ.hcolT, (124 & 8) != 0 ? "" : Separators.RPAREN, -1, "...", (124 & 64) != 0 ? null : C5498e.f17954Y);
                return sb3.toString();
            case 3:
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj2;
                ModuleDescriptorImpl moduleDescriptorImpl = (ModuleDescriptorImpl) obj;
                if (kotlinBuiltIns.f51295a == null) {
                    kotlinBuiltIns.f51295a = moduleDescriptorImpl;
                    return null;
                }
                throw new AssertionError("Built-ins module is already set: " + kotlinBuiltIns.f51295a + " (attempting to reset to " + moduleDescriptorImpl + Separators.RPAREN);
            case 4:
                JvmBuiltInClassDescriptorFactory.Companion companion = JvmBuiltInClassDescriptorFactory.Companion;
                JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory = (JvmBuiltInClassDescriptorFactory) obj;
                InterfaceC1436k interfaceC1436k = jvmBuiltInClassDescriptorFactory.f51363b;
                ModuleDescriptor moduleDescriptor = jvmBuiltInClassDescriptorFactory.f51362a;
                StorageManager storageManager = (StorageManager) obj2;
                ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl((DeclarationDescriptor) interfaceC1436k.invoke(moduleDescriptor), JvmBuiltInClassDescriptorFactory.f51360f, Modality.ABSTRACT, ClassKind.INTERFACE, AbstractC9393x3.m9974d(moduleDescriptor.getBuiltIns().getAnyType()), SourceElement.NO_SOURCE, false, storageManager);
                classDescriptorImpl.initialize(new CloneableClassScope(storageManager, classDescriptorImpl), C17691y.f56482Y, null);
                return classDescriptorImpl;
            case 5:
                InterfaceC3776x[] interfaceC3776xArr = JvmBuiltIns.f51365h;
                JvmBuiltIns jvmBuiltIns = (JvmBuiltIns) obj;
                ModuleDescriptorImpl builtInsModule = jvmBuiltIns.getBuiltInsModule();
                AbstractC16544l.m18093f(builtInsModule, "getBuiltInsModule(...)");
                return new JvmBuiltInsCustomizer(builtInsModule, (StorageManager) obj2, new C5140G(jvmBuiltIns, 7));
            case 6:
                InterfaceC3776x[] interfaceC3776xArr2 = JvmBuiltInsCustomizer.f51371i;
                JvmBuiltInsCustomizer jvmBuiltInsCustomizer = (JvmBuiltInsCustomizer) obj;
                return FindClassInModuleKt.findNonGenericClassAcrossDependencies(jvmBuiltInsCustomizer.m18122b().getOwnerModuleDescriptor(), JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID(), new NotFoundClasses((StorageManager) obj2, jvmBuiltInsCustomizer.m18122b().getOwnerModuleDescriptor())).getDefaultType();
            case 7:
                InterfaceC3776x[] interfaceC3776xArr3 = JvmBuiltInsCustomizer.f51371i;
                JavaResolverCache EMPTY = JavaResolverCache.EMPTY;
                AbstractC16544l.m18093f(EMPTY, "EMPTY");
                return ((LazyJavaClassDescriptor) obj).copy$descriptors_jvm(EMPTY, (ClassDescriptor) obj2);
            case 8:
                return (MemberScope) ((ScopesHolderForClass) obj).f51418b.invoke((KotlinTypeRefiner) obj2);
            case 9:
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) obj;
                StorageManager storageManager2 = typeAliasConstructorDescriptorImpl.f51638Q0;
                TypeAliasDescriptor typeAliasDescriptor = typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor();
                ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj2;
                Annotations annotations = classConstructorDescriptor.getAnnotations();
                CallableMemberDescriptor.Kind kind = classConstructorDescriptor.getKind();
                AbstractC16544l.m18093f(kind, "getKind(...)");
                SourceElement source = typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor().getSource();
                AbstractC16544l.m18093f(source, "getSource(...)");
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager2, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptorImpl, annotations, kind, source);
                TypeSubstitutor typeSubstitutorAccess$getTypeSubstitutorForUnderlyingClass = TypeAliasConstructorDescriptorImpl.Companion.access$getTypeSubstitutorForUnderlyingClass(TypeAliasConstructorDescriptorImpl.Companion, typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor());
                if (typeSubstitutorAccess$getTypeSubstitutorForUnderlyingClass == null) {
                    return null;
                }
                ReceiverParameterDescriptor dispatchReceiverParameter = classConstructorDescriptor.getDispatchReceiverParameter();
                ReceiverParameterDescriptor receiverParameterDescriptorSubstitute = dispatchReceiverParameter != null ? dispatchReceiverParameter.substitute(typeSubstitutorAccess$getTypeSubstitutorForUnderlyingClass) : null;
                List<ReceiverParameterDescriptor> contextReceiverParameters = classConstructorDescriptor.getContextReceiverParameters();
                AbstractC16544l.m18093f(contextReceiverParameters, "getContextReceiverParameters(...)");
                List<ReceiverParameterDescriptor> list2 = contextReceiverParameters;
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ReceiverParameterDescriptor) it.next()).substitute(typeSubstitutorAccess$getTypeSubstitutorForUnderlyingClass));
                }
                typeAliasConstructorDescriptorImpl2.initialize(null, receiverParameterDescriptorSubstitute, arrayList3, typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor().getDeclaredTypeParameters(), typeAliasConstructorDescriptorImpl.getValueParameters(), typeAliasConstructorDescriptorImpl.getReturnType(), Modality.FINAL, typeAliasConstructorDescriptorImpl.getTypeAliasDescriptor().getVisibility());
                return typeAliasConstructorDescriptorImpl2;
            case 10:
                InterfaceC3776x[] interfaceC3776xArr4 = JavaAnnotationDescriptor.f51800f;
                SimpleType defaultType = ((LazyJavaResolverContext) obj).getModule().getBuiltIns().getBuiltInClassByFqName(((JavaAnnotationDescriptor) obj2).getFqName()).getDefaultType();
                AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
                return defaultType;
            case 11:
                return ContextKt.computeNewDefaultTypeQualifiers((LazyJavaResolverContext) obj, ((ClassOrPackageFragmentDescriptor) obj2).getAnnotations());
            case 12:
                return ContextKt.computeNewDefaultTypeQualifiers((LazyJavaResolverContext) obj, (Annotations) obj2);
            case 13:
                return new LazyJavaPackageFragment(((LazyJavaPackageFragmentProvider) obj).f51862a, (JavaPackage) obj2);
            case 14:
                int i14 = LazyJavaPackageScope.f51927q;
                return ((LazyJavaResolverContext) obj).getComponents().getFinder().knownClassNamesInPackage(((LazyJavaPackageScope) obj2).f51929n.getFqName());
            case 15:
                TypeDeserializer typeDeserializer = (TypeDeserializer) obj;
                return typeDeserializer.f53053a.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations((ProtoBuf.Type) obj2, typeDeserializer.f53053a.getNameResolver());
            case 16:
                DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) obj;
                return AbstractC17680n.m19322C0(deserializedClassDescriptor.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(deserializedClassDescriptor.getThisAsProtoContainer$deserialization(), (ProtoBuf.EnumEntry) obj2));
            case 17:
                return KotlinTypeRefinerKt.refineTypes(((C18518e) obj).f59009a, ((AbstractTypeConstructor) obj2).getSupertypes());
            case 18:
                return ((KotlinTypeRefiner) obj).refineType((KotlinTypeMarker) ((LazyWrappedType) obj2).f53176o0.invoke());
            case 19:
                List<UnwrappedType> supertypes = ((NewCapturedTypeConstructor) obj).getSupertypes();
                ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(supertypes, 10));
                Iterator<T> it2 = supertypes.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((UnwrappedType) it2.next()).refine((KotlinTypeRefiner) obj2));
                }
                return arrayList4;
            default:
                C20022m c20022m = (C20022m) obj2;
                C20026q c20026q = (C20026q) obj;
                try {
                    if (!c20026q.m20828a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (c20026q.m20828a(false, this)) {
                    }
                    c20022m.m20820a(1, 9, null);
                    AbstractC17708b.m19412d(c20026q);
                    return C17296C.f55119a;
                } catch (IOException e10) {
                    c20022m.m20820a(2, 2, e10);
                } catch (Throwable th2) {
                    c20022m.m20820a(3, 3, null);
                    AbstractC17708b.m19412d(c20026q);
                    throw th2;
                }
                break;
        }
    }
}
