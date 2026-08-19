package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public interface DescriptorRendererOptions {

    public static final class DefaultImpls {
        public static boolean getIncludeAnnotationArguments(DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.getAnnotationArgumentsRenderingPolicy().getIncludeAnnotationArguments();
        }

        public static boolean getIncludeEmptyAnnotationArguments(DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.getAnnotationArgumentsRenderingPolicy().getIncludeEmptyAnnotationArguments();
        }
    }

    AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy();

    boolean getDebugMode();

    boolean getEnhancedTypes();

    Set<FqName> getExcludedTypeAnnotationClasses();

    void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy);

    void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy);

    void setDebugMode(boolean z6);

    void setExcludedTypeAnnotationClasses(Set<FqName> set);

    void setModifiers(Set<? extends DescriptorRendererModifier> set);

    void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    void setReceiverAfterName(boolean z6);

    void setRenderCompanionObjectName(boolean z6);

    void setStartFromName(boolean z6);

    void setTextFormat(RenderingFormat renderingFormat);

    void setVerbose(boolean z6);

    void setWithDefinedIn(boolean z6);

    void setWithoutSuperTypes(boolean z6);

    void setWithoutTypeParameters(boolean z6);
}
