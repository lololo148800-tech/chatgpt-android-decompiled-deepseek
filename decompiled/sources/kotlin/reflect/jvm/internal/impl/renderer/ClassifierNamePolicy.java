package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p909nm.C17661F;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassifierNamePolicy {

    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {
        public static final FULLY_QUALIFIED INSTANCE = new FULLY_QUALIFIED();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public String renderClassifier(ClassifierDescriptor classifier, DescriptorRenderer renderer) {
            AbstractC16544l.m18094g(classifier, "classifier");
            AbstractC16544l.m18094g(renderer, "renderer");
            if (classifier instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifier).getName();
                AbstractC16544l.m18093f(name, "getName(...)");
                return renderer.renderName(name, false);
            }
            FqNameUnsafe fqName = DescriptorUtils.getFqName(classifier);
            AbstractC16544l.m18093f(fqName, "getFqName(...)");
            return renderer.renderFqName(fqName);
        }
    }

    public static final class SHORT implements ClassifierNamePolicy {
        public static final SHORT INSTANCE = new SHORT();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Named] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public String renderClassifier(ClassifierDescriptor classifier, DescriptorRenderer renderer) {
            AbstractC16544l.m18094g(classifier, "classifier");
            AbstractC16544l.m18094g(renderer, "renderer");
            if (classifier instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifier).getName();
                AbstractC16544l.m18093f(name, "getName(...)");
                return renderer.renderName(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.getContainingDeclaration();
            } while (classifier instanceof ClassDescriptor);
            return RenderingUtilsKt.renderFqName(new C17661F(arrayList));
        }
    }

    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {
        public static final SOURCE_CODE_QUALIFIED INSTANCE = new SOURCE_CODE_QUALIFIED();

        /* JADX INFO: renamed from: a */
        public static String m18306a(ClassifierDescriptor classifierDescriptor) {
            String strRender;
            Name name = classifierDescriptor.getName();
            AbstractC16544l.m18093f(name, "getName(...)");
            String strRender2 = RenderingUtilsKt.render(name);
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                return strRender2;
            }
            DeclarationDescriptor containingDeclaration = classifierDescriptor.getContainingDeclaration();
            AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
            if (containingDeclaration instanceof ClassDescriptor) {
                strRender = m18306a((ClassifierDescriptor) containingDeclaration);
            } else {
                strRender = containingDeclaration instanceof PackageFragmentDescriptor ? RenderingUtilsKt.render(((PackageFragmentDescriptor) containingDeclaration).getFqName().toUnsafe()) : null;
            }
            if (strRender == null || strRender.equals("")) {
                return strRender2;
            }
            return strRender + '.' + strRender2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public String renderClassifier(ClassifierDescriptor classifier, DescriptorRenderer renderer) {
            AbstractC16544l.m18094g(classifier, "classifier");
            AbstractC16544l.m18094g(renderer, "renderer");
            return m18306a(classifier);
        }
    }

    String renderClassifier(ClassifierDescriptor classifierDescriptor, DescriptorRenderer descriptorRenderer);
}
