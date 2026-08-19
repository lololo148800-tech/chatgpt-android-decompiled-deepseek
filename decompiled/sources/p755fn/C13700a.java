package p755fn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl;
import kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17681o;
import p909nm.C17691y;

/* JADX INFO: renamed from: fn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C13700a implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43245Y;

    /* JADX INFO: renamed from: Z */
    public static final C13700a f43232Z = new C13700a(0);

    /* JADX INFO: renamed from: o0 */
    public static final C13700a f43233o0 = new C13700a(1);

    /* JADX INFO: renamed from: p0 */
    public static final C13700a f43234p0 = new C13700a(2);

    /* JADX INFO: renamed from: q0 */
    public static final C13700a f43235q0 = new C13700a(3);

    /* JADX INFO: renamed from: r0 */
    public static final C13700a f43236r0 = new C13700a(4);

    /* JADX INFO: renamed from: s0 */
    public static final C13700a f43237s0 = new C13700a(5);

    /* JADX INFO: renamed from: t0 */
    public static final C13700a f43238t0 = new C13700a(6);

    /* JADX INFO: renamed from: u0 */
    public static final C13700a f43239u0 = new C13700a(7);

    /* JADX INFO: renamed from: v0 */
    public static final C13700a f43240v0 = new C13700a(8);

    /* JADX INFO: renamed from: w0 */
    public static final C13700a f43241w0 = new C13700a(9);

    /* JADX INFO: renamed from: x0 */
    public static final C13700a f43242x0 = new C13700a(10);

    /* JADX INFO: renamed from: y0 */
    public static final C13700a f43243y0 = new C13700a(11);

    /* JADX INFO: renamed from: z0 */
    public static final C13700a f43244z0 = new C13700a(12);

    /* JADX INFO: renamed from: A0 */
    public static final C13700a f43229A0 = new C13700a(13);

    /* JADX INFO: renamed from: B0 */
    public static final C13700a f43230B0 = new C13700a(14);

    /* JADX INFO: renamed from: C0 */
    public static final C13700a f43231C0 = new C13700a(15);

    public /* synthetic */ C13700a(int i10) {
        this.f43245Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17691y c17691y = C17691y.f56482Y;
        C17296C c17296c = C17296C.f55119a;
        switch (this.f43245Y) {
            case 0:
                DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions, "$this$withOptions");
                withOptions.setModifiers(c17691y);
                return c17296c;
            case 1:
                DescriptorRendererOptions withOptions2 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion2 = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions2, "$this$withOptions");
                withOptions2.setTextFormat(RenderingFormat.HTML);
                withOptions2.setModifiers(DescriptorRendererModifier.ALL);
                return c17296c;
            case 2:
                DescriptorRendererOptions withOptions3 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion3 = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions3, "$this$withOptions");
                withOptions3.setWithDefinedIn(false);
                return c17296c;
            case 3:
                DescriptorRendererOptions withOptions4 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion4 = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions4, "$this$withOptions");
                withOptions4.setWithDefinedIn(false);
                withOptions4.setModifiers(c17691y);
                return c17296c;
            case 4:
                DescriptorRendererOptions withOptions5 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion5 = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions5, "$this$withOptions");
                withOptions5.setWithDefinedIn(false);
                withOptions5.setModifiers(c17691y);
                withOptions5.setWithoutSuperTypes(true);
                return c17296c;
            case 5:
                DescriptorRendererOptions withOptions6 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion6 = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions6, "$this$withOptions");
                withOptions6.setModifiers(c17691y);
                withOptions6.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                withOptions6.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
                return c17296c;
            case 6:
                DescriptorRendererOptions withOptions7 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion7 = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions7, "$this$withOptions");
                withOptions7.setWithDefinedIn(false);
                withOptions7.setModifiers(c17691y);
                withOptions7.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                withOptions7.setWithoutTypeParameters(true);
                withOptions7.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.NONE);
                withOptions7.setReceiverAfterName(true);
                withOptions7.setRenderCompanionObjectName(true);
                withOptions7.setWithoutSuperTypes(true);
                withOptions7.setStartFromName(true);
                return c17296c;
            case 7:
                DescriptorRendererOptions withOptions8 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion8 = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions8, "$this$withOptions");
                withOptions8.setModifiers(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
                return c17296c;
            case 8:
                DescriptorRendererOptions withOptions9 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion9 = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions9, "$this$withOptions");
                withOptions9.setModifiers(DescriptorRendererModifier.ALL);
                return c17296c;
            case 9:
                DescriptorRendererOptions withOptions10 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion10 = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions10, "$this$withOptions");
                withOptions10.setClassifierNamePolicy(ClassifierNamePolicy.SHORT.INSTANCE);
                withOptions10.setParameterNameRenderingPolicy(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
                return c17296c;
            case 10:
                DescriptorRendererOptions withOptions11 = (DescriptorRendererOptions) obj;
                DescriptorRenderer.Companion companion11 = DescriptorRenderer.Companion;
                AbstractC16544l.m18094g(withOptions11, "$this$withOptions");
                withOptions11.setDebugMode(true);
                withOptions11.setClassifierNamePolicy(ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
                withOptions11.setModifiers(DescriptorRendererModifier.ALL);
                return c17296c;
            case 11:
                KotlinType it = (KotlinType) obj;
                int i10 = DescriptorRendererImpl.f52783c;
                AbstractC16544l.m18094g(it, "it");
                return it instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) it).getOriginalTypeVariable() : it;
            case 12:
                int i11 = DescriptorRendererImpl.f52783c;
                return "";
            case 13:
                DescriptorRendererOptions withOptions12 = (DescriptorRendererOptions) obj;
                int i12 = DescriptorRendererImpl.f52783c;
                AbstractC16544l.m18094g(withOptions12, "$this$withOptions");
                withOptions12.setExcludedTypeAnnotationClasses(AbstractC17665J.m19266f(withOptions12.getExcludedTypeAnnotationClasses(), AbstractC17681o.m19382k(StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams)));
                return c17296c;
            case 14:
                KotlinType it2 = (KotlinType) obj;
                InterfaceC3776x[] interfaceC3776xArr = DescriptorRendererOptionsImpl.f52788Y;
                AbstractC16544l.m18094g(it2, "it");
                return it2;
            default:
                InterfaceC3776x[] interfaceC3776xArr2 = DescriptorRendererOptionsImpl.f52788Y;
                AbstractC16544l.m18094g((ValueParameterDescriptor) obj, "it");
                return "...";
        }
    }
}
