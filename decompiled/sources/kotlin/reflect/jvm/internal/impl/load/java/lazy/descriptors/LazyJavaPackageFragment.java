package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p605Ym.C10094h;
import p909nm.C17689w;
import p926of.yRae.sVDIzpC;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {

    /* JADX INFO: renamed from: A0 */
    public static final /* synthetic */ InterfaceC3776x[] f51918A0;

    /* JADX INFO: renamed from: s0 */
    public final JavaPackage f51919s0;

    /* JADX INFO: renamed from: t0 */
    public final LazyJavaResolverContext f51920t0;

    /* JADX INFO: renamed from: u0 */
    public final JvmMetadataVersion f51921u0;

    /* JADX INFO: renamed from: v0 */
    public final NotNullLazyValue f51922v0;

    /* JADX INFO: renamed from: w0 */
    public final JvmPackageScope f51923w0;

    /* JADX INFO: renamed from: x0 */
    public final NotNullLazyValue f51924x0;

    /* JADX INFO: renamed from: y0 */
    public final Annotations f51925y0;

    /* JADX INFO: renamed from: z0 */
    public final NotNullLazyValue f51926z0;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C16553u c16553u = new C16553u(LazyJavaPackageFragment.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f51918A0 = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(LazyJavaPackageFragment.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0, c16527d)};
    }

    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(JavaClass jClass) {
        AbstractC16544l.m18094g(jClass, "jClass");
        return this.f51923w0.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(jClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f51925y0;
    }

    public final Map<String, KotlinJvmBinaryClass> getBinaryClasses$descriptors_jvm() {
        return (Map) StorageKt.getValue(this.f51922v0, this, f51918A0[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    public final List<FqName> getSubPackageFqNames$descriptors_jvm() {
        return (List) this.f51924x0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "Lazy Java package fragment: " + getFqName() + " of module " + this.f51920t0.getComponents().getModule();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(LazyJavaResolverContext outerContext, JavaPackage javaPackage) {
        super(outerContext.getModule(), javaPackage.getFqName());
        AbstractC16544l.m18094g(outerContext, "outerContext");
        AbstractC16544l.m18094g(javaPackage, sVDIzpC.MDYywgYxGqB);
        this.f51919s0 = javaPackage;
        LazyJavaResolverContext lazyJavaResolverContextChildForClassOrPackage$default = ContextKt.childForClassOrPackage$default(outerContext, this, null, 0, 6, null);
        this.f51920t0 = lazyJavaResolverContextChildForClassOrPackage$default;
        this.f51921u0 = DeserializationHelpersKt.jvmMetadataVersionOrDefault(outerContext.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
        this.f51922v0 = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new C10094h(this, 0));
        this.f51923w0 = new JvmPackageScope(lazyJavaResolverContextChildForClassOrPackage$default, javaPackage, this);
        this.f51924x0 = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createRecursionTolerantLazyValue(new C10094h(this, 1), C17689w.f56480Y);
        this.f51925y0 = lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getJavaTypeEnhancementState().getDisabledDefaultAnnotations() ? Annotations.Companion.getEMPTY() : LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContextChildForClassOrPackage$default, javaPackage);
        this.f51926z0 = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new C10094h(this, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public JvmPackageScope getMemberScope() {
        return this.f51923w0;
    }
}
