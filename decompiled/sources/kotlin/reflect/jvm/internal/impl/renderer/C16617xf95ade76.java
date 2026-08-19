package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$RenderDeclarationDescriptorVisitor$WhenMappings */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C16617xf95ade76 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
        try {
            iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
