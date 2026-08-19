package kotlin.reflect.jvm.internal.impl.renderer;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p025An.C0644w;
import p037B9.MeDP.MpoABj;
import p049Bm.InterfaceC1436k;
import p755fn.C13700a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorRenderer {
    public static final DescriptorRenderer COMPACT;
    public static final DescriptorRenderer COMPACT_WITHOUT_SUPERTYPES;
    public static final DescriptorRenderer COMPACT_WITH_MODIFIERS;
    public static final DescriptorRenderer COMPACT_WITH_SHORT_TYPES;
    public static final Companion Companion;
    public static final DescriptorRenderer DEBUG_TEXT;
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES;
    public static final DescriptorRenderer FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS;
    public static final DescriptorRenderer HTML;
    public static final DescriptorRenderer ONLY_NAMES_WITH_SHORT_TYPES;
    public static final DescriptorRenderer SHORT_NAMES_IN_TYPES;
    public static final DescriptorRenderer WITHOUT_MODIFIERS;

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[ClassKind.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClassKind.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClassKind.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final String getClassifierKindPrefix(ClassifierDescriptorWithTypeParameters classifier) {
            AbstractC16544l.m18094g(classifier, "classifier");
            if (classifier instanceof TypeAliasDescriptor) {
                return "typealias";
            }
            if (!(classifier instanceof ClassDescriptor)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) classifier;
            if (classDescriptor.isCompanionObject()) {
                return "companion object";
            }
            switch (WhenMappings.$EnumSwitchMapping$0[classDescriptor.getKind().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new C0644w();
            }
        }

        public final DescriptorRenderer withOptions(InterfaceC1436k changeOptions) {
            AbstractC16544l.m18094g(changeOptions, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            changeOptions.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.lock();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    public interface ValueParametersHandler {

        public static final class DEFAULT implements ValueParametersHandler {
            public static final DEFAULT INSTANCE = new DEFAULT();

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendAfterValueParameter(ValueParameterDescriptor parameter, int i10, int i11, StringBuilder builder) {
                AbstractC16544l.m18094g(parameter, "parameter");
                AbstractC16544l.m18094g(builder, "builder");
                if (i10 != i11 - 1) {
                    builder.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendAfterValueParameters(int i10, StringBuilder builder) {
                AbstractC16544l.m18094g(builder, "builder");
                builder.append(Separators.RPAREN);
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendBeforeValueParameter(ValueParameterDescriptor parameter, int i10, int i11, StringBuilder sb2) {
                AbstractC16544l.m18094g(parameter, "parameter");
                AbstractC16544l.m18094g(sb2, MpoABj.AEk);
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendBeforeValueParameters(int i10, StringBuilder builder) {
                AbstractC16544l.m18094g(builder, "builder");
                builder.append(Separators.LPAREN);
            }
        }

        void appendAfterValueParameter(ValueParameterDescriptor valueParameterDescriptor, int i10, int i11, StringBuilder sb2);

        void appendAfterValueParameters(int i10, StringBuilder sb2);

        void appendBeforeValueParameter(ValueParameterDescriptor valueParameterDescriptor, int i10, int i11, StringBuilder sb2);

        void appendBeforeValueParameters(int i10, StringBuilder sb2);
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        WITHOUT_MODIFIERS = companion.withOptions(C13700a.f43232Z);
        COMPACT_WITH_MODIFIERS = companion.withOptions(C13700a.f43234p0);
        COMPACT = companion.withOptions(C13700a.f43235q0);
        COMPACT_WITHOUT_SUPERTYPES = companion.withOptions(C13700a.f43236r0);
        COMPACT_WITH_SHORT_TYPES = companion.withOptions(C13700a.f43237s0);
        ONLY_NAMES_WITH_SHORT_TYPES = companion.withOptions(C13700a.f43238t0);
        FQ_NAMES_IN_TYPES = companion.withOptions(C13700a.f43239u0);
        FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS = companion.withOptions(C13700a.f43240v0);
        SHORT_NAMES_IN_TYPES = companion.withOptions(C13700a.f43241w0);
        DEBUG_TEXT = companion.withOptions(C13700a.f43242x0);
        HTML = companion.withOptions(C13700a.f43233o0);
    }

    public static /* synthetic */ String renderAnnotation$default(DescriptorRenderer descriptorRenderer, AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i10 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.renderAnnotation(annotationDescriptor, annotationUseSiteTarget);
    }

    public abstract String render(DeclarationDescriptor declarationDescriptor);

    public abstract String renderAnnotation(AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract String renderFlexibleType(String str, String str2, KotlinBuiltIns kotlinBuiltIns);

    public abstract String renderFqName(FqNameUnsafe fqNameUnsafe);

    public abstract String renderName(Name name, boolean z6);

    public abstract String renderType(KotlinType kotlinType);

    public abstract String renderTypeProjection(TypeProjection typeProjection);

    public final DescriptorRenderer withOptions(InterfaceC1436k changeOptions) {
        AbstractC16544l.m18094g(changeOptions, "changeOptions");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImplCopy = ((DescriptorRendererImpl) this).getOptions().copy();
        changeOptions.invoke(descriptorRendererOptionsImplCopy);
        descriptorRendererOptionsImplCopy.lock();
        return new DescriptorRendererImpl(descriptorRendererOptionsImplCopy);
    }
}
