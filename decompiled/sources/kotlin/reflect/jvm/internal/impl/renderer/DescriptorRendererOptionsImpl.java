package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16535c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16549q;
import kotlin.jvm.internal.C16553u;
import kotlin.jvm.internal.InterfaceC16536d;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p003A1.AbstractC0168G;
import p030B2.C0742X;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21329w;
import p128Em.AbstractC2578a;
import p138F8.vJO.vRJidSveZHcTw;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3776x;
import p755fn.C13700a;
import p861l1.xapn.suYVq;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ InterfaceC3776x[] f52788Y;

    /* JADX INFO: renamed from: A */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52789A;

    /* JADX INFO: renamed from: B */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52790B;

    /* JADX INFO: renamed from: C */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52791C;

    /* JADX INFO: renamed from: D */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52792D;

    /* JADX INFO: renamed from: E */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52793E;

    /* JADX INFO: renamed from: F */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52794F;

    /* JADX INFO: renamed from: G */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52795G;

    /* JADX INFO: renamed from: H */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52796H;

    /* JADX INFO: renamed from: I */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52797I;

    /* JADX INFO: renamed from: J */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52798J;

    /* JADX INFO: renamed from: K */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52799K;

    /* JADX INFO: renamed from: L */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52800L;

    /* JADX INFO: renamed from: M */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52801M;

    /* JADX INFO: renamed from: N */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52802N;

    /* JADX INFO: renamed from: O */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52803O;

    /* JADX INFO: renamed from: P */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52804P;

    /* JADX INFO: renamed from: Q */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52805Q;

    /* JADX INFO: renamed from: R */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52806R;

    /* JADX INFO: renamed from: S */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52807S;

    /* JADX INFO: renamed from: T */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52808T;

    /* JADX INFO: renamed from: U */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52809U;

    /* JADX INFO: renamed from: V */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52810V;

    /* JADX INFO: renamed from: W */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52811W;

    /* JADX INFO: renamed from: X */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52812X;

    /* JADX INFO: renamed from: a */
    public boolean f52813a;

    /* JADX INFO: renamed from: b */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52814b = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.INSTANCE, this);

    /* JADX INFO: renamed from: c */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52815c;

    /* JADX INFO: renamed from: d */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52816d;

    /* JADX INFO: renamed from: e */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52817e;

    /* JADX INFO: renamed from: f */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52818f;

    /* JADX INFO: renamed from: g */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52819g;

    /* JADX INFO: renamed from: h */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52820h;

    /* JADX INFO: renamed from: i */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52821i;

    /* JADX INFO: renamed from: j */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52822j;

    /* JADX INFO: renamed from: k */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52823k;

    /* JADX INFO: renamed from: l */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52824l;

    /* JADX INFO: renamed from: m */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52825m;

    /* JADX INFO: renamed from: n */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52826n;

    /* JADX INFO: renamed from: o */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52827o;

    /* JADX INFO: renamed from: p */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52828p;

    /* JADX INFO: renamed from: q */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52829q;

    /* JADX INFO: renamed from: r */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52830r;

    /* JADX INFO: renamed from: s */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52831s;

    /* JADX INFO: renamed from: t */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52832t;

    /* JADX INFO: renamed from: u */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52833u;

    /* JADX INFO: renamed from: v */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52834v;

    /* JADX INFO: renamed from: w */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52835w;

    /* JADX INFO: renamed from: x */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52836x;

    /* JADX INFO: renamed from: y */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52837y;

    /* JADX INFO: renamed from: z */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f52838z;

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f52815c = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f52816d = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f52817e = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS, this);
        Boolean bool2 = Boolean.FALSE;
        this.f52818f = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52819g = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52820h = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52821i = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52822j = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52823k = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f52824l = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52825m = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52826n = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52827o = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f52828p = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f52829q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52830r = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52831s = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52832t = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52833u = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52834v = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        this.f52835w = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52836x = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52837y = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(C13700a.f43230B0, this);
        this.f52838z = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(C13700a.f43231C0, this);
        this.f52789A = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f52790B = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(OverrideRenderingPolicy.RENDER_OPEN, this);
        this.f52791C = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRenderer.ValueParametersHandler.DEFAULT.INSTANCE, this);
        this.f52792D = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(RenderingFormat.PLAIN, this);
        this.f52793E = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ParameterNameRenderingPolicy.ALL, this);
        this.f52794F = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52795G = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52796H = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(PropertyAccessorRenderingPolicy.DEBUG, this);
        this.f52797I = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52798J = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52799K = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(C17691y.f56482Y, this);
        this.f52800L = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve(), this);
        this.f52801M = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        this.f52802N = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, this);
        this.f52803O = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52804P = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f52805Q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f52806R = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52807S = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52808T = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f52809U = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52810V = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52811W = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f52812X = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
    }

    public final DescriptorRendererOptionsImpl copy() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        C0742X c0742xM18098k = AbstractC16544l.m18098k(DescriptorRendererOptionsImpl.class.getDeclaredFields());
        while (c0742xM18098k.hasNext()) {
            Field field = (Field) c0742xM18098k.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                AbstractC2578a abstractC2578a = obj instanceof AbstractC2578a ? (AbstractC2578a) obj : null;
                if (abstractC2578a != null) {
                    String name = field.getName();
                    AbstractC16544l.m18093f(name, "getName(...)");
                    AbstractC21329w.m21734u(name, "is", false);
                    InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder("get");
                    String name3 = field.getName();
                    AbstractC16544l.m18093f(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        AbstractC16544l.m18093f(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(descriptorRendererOptionsImpl, new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(abstractC2578a.getValue(this, new C16553u(AbstractC16535c.NO_RECEIVER, ((InterfaceC16536d) interfaceC3756dMo5693b).mo5684d(), name2, sb2.toString(), 0)), descriptorRendererOptionsImpl));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return ((Boolean) this.f52831s.getValue(this, f52788Y[17])).booleanValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return ((Boolean) this.f52803O.getValue(this, f52788Y[39])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (AnnotationArgumentsRenderingPolicy) this.f52802N.getValue(this, f52788Y[38]);
    }

    public InterfaceC1436k getAnnotationFilter() {
        return (InterfaceC1436k) this.f52801M.getValue(this, f52788Y[37]);
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return ((Boolean) this.f52811W.getValue(this, f52788Y[48])).booleanValue();
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((Boolean) this.f52821i.getValue(this, f52788Y[7])).booleanValue();
    }

    public ClassifierNamePolicy getClassifierNamePolicy() {
        return (ClassifierNamePolicy) this.f52814b.getValue(this, f52788Y[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return ((Boolean) this.f52820h.getValue(this, f52788Y[6])).booleanValue();
    }

    public InterfaceC1436k getDefaultParameterValueRenderer() {
        return (InterfaceC1436k) this.f52838z.getValue(this, f52788Y[24]);
    }

    public boolean getEachAnnotationOnNewLine() {
        return ((Boolean) this.f52798J.getValue(this, f52788Y[34])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return ((Boolean) this.f52825m.getValue(this, f52788Y[11])).booleanValue();
    }

    public Set<FqName> getExcludedAnnotationClasses() {
        return (Set) this.f52799K.getValue(this, f52788Y[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return (Set) this.f52800L.getValue(this, f52788Y[36]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((Boolean) this.f52808T.getValue(this, f52788Y[44])).booleanValue();
    }

    public boolean getIncludeAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeAnnotationArguments(this);
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public boolean getIncludePropertyConstant() {
        return ((Boolean) this.f52833u.getValue(this, f52788Y[19])).booleanValue();
    }

    public boolean getInformativeErrorType() {
        return ((Boolean) this.f52812X.getValue(this, f52788Y[49])).booleanValue();
    }

    public Set<DescriptorRendererModifier> getModifiers() {
        return (Set) this.f52817e.getValue(this, f52788Y[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((Boolean) this.f52826n.getValue(this, f52788Y[12])).booleanValue();
    }

    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (OverrideRenderingPolicy) this.f52790B.getValue(this, f52788Y[26]);
    }

    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (ParameterNameRenderingPolicy) this.f52793E.getValue(this, f52788Y[29]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((Boolean) this.f52809U.getValue(this, f52788Y[45])).booleanValue();
    }

    public boolean getPresentableUnresolvedTypes() {
        return ((Boolean) this.f52810V.getValue(this, f52788Y[47])).booleanValue();
    }

    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return (PropertyAccessorRenderingPolicy) this.f52796H.getValue(this, f52788Y[32]);
    }

    public InterfaceC1436k getPropertyConstantRenderer() {
        return (InterfaceC1436k) this.f52834v.getValue(this, f52788Y[20]);
    }

    public boolean getReceiverAfterName() {
        return ((Boolean) this.f52794F.getValue(this, f52788Y[30])).booleanValue();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return ((Boolean) this.f52807S.getValue(this, f52788Y[43])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((Boolean) this.f52795G.getValue(this, f52788Y[31])).booleanValue();
    }

    public boolean getRenderConstructorDelegation() {
        return ((Boolean) this.f52829q.getValue(this, f52788Y[15])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((Boolean) this.f52804P.getValue(this, f52788Y[40])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((Boolean) this.f52797I.getValue(this, f52788Y[33])).booleanValue();
    }

    public boolean getRenderDefaultModality() {
        return ((Boolean) this.f52828p.getValue(this, f52788Y[14])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((Boolean) this.f52827o.getValue(this, f52788Y[13])).booleanValue();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((Boolean) this.f52830r.getValue(this, f52788Y[16])).booleanValue();
    }

    public boolean getRenderTypeExpansions() {
        return ((Boolean) this.f52806R.getValue(this, f52788Y[42])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((Boolean) this.f52805Q.getValue(this, f52788Y[41])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((Boolean) this.f52789A.getValue(this, f52788Y[25])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((Boolean) this.f52819g.getValue(this, f52788Y[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((Boolean) this.f52818f.getValue(this, f52788Y[4])).booleanValue();
    }

    public RenderingFormat getTextFormat() {
        return (RenderingFormat) this.f52792D.getValue(this, f52788Y[28]);
    }

    public InterfaceC1436k getTypeNormalizer() {
        return (InterfaceC1436k) this.f52837y.getValue(this, f52788Y[23]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((Boolean) this.f52832t.getValue(this, f52788Y[18])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((Boolean) this.f52823k.getValue(this, f52788Y[9])).booleanValue();
    }

    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return (DescriptorRenderer.ValueParametersHandler) this.f52791C.getValue(this, f52788Y[27]);
    }

    public boolean getVerbose() {
        return ((Boolean) this.f52822j.getValue(this, f52788Y[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((Boolean) this.f52815c.getValue(this, f52788Y[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((Boolean) this.f52816d.getValue(this, f52788Y[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((Boolean) this.f52824l.getValue(this, f52788Y[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((Boolean) this.f52836x.getValue(this, f52788Y[22])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((Boolean) this.f52835w.getValue(this, f52788Y[21])).booleanValue();
    }

    public final boolean isLocked() {
        return this.f52813a;
    }

    public final void lock() {
        this.f52813a = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        AbstractC16544l.m18094g(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f52802N.setValue(this, f52788Y[38], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy) {
        AbstractC16544l.m18094g(classifierNamePolicy, "<set-?>");
        this.f52814b.setValue(this, f52788Y[0], classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z6) {
        this.f52820h.setValue(this, f52788Y[6], Boolean.valueOf(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(Set<FqName> set) {
        AbstractC16544l.m18094g(set, "<set-?>");
        this.f52800L.setValue(this, f52788Y[36], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(Set<? extends DescriptorRendererModifier> set) {
        AbstractC16544l.m18094g(set, "<set-?>");
        this.f52817e.setValue(this, f52788Y[3], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        AbstractC16544l.m18094g(parameterNameRenderingPolicy, "<set-?>");
        this.f52793E.setValue(this, f52788Y[29], parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z6) {
        this.f52794F.setValue(this, f52788Y[30], Boolean.valueOf(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z6) {
        this.f52795G.setValue(this, f52788Y[31], Boolean.valueOf(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z6) {
        this.f52818f.setValue(this, f52788Y[4], Boolean.valueOf(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(RenderingFormat renderingFormat) {
        AbstractC16544l.m18094g(renderingFormat, "<set-?>");
        this.f52792D.setValue(this, f52788Y[28], renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z6) {
        this.f52822j.setValue(this, f52788Y[8], Boolean.valueOf(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z6) {
        this.f52815c.setValue(this, f52788Y[1], Boolean.valueOf(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z6) {
        this.f52836x.setValue(this, f52788Y[22], Boolean.valueOf(z6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z6) {
        this.f52835w.setValue(this, f52788Y[21], Boolean.valueOf(z6));
    }

    static {
        C16549q c16549q = new C16549q(DescriptorRendererOptionsImpl.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f52788Y = new InterfaceC3776x[]{c16527d.mo5697f(c16549q), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "withDefinedIn", "getWithDefinedIn()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "modifiers", "getModifiers()Ljava/util/Set;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "startFromName", "getStartFromName()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "debugMode", "getDebugMode()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "verbose", "getVerbose()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "unitReturnType", suYVq.SSZiPBnlKDjRaq, 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "withoutReturnType", "getWithoutReturnType()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "enhancedTypes", "getEnhancedTypes()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, vRJidSveZHcTw.FpYY, "getRenderPrimaryConstructorParametersAsProperties()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, vRJidSveZHcTw.skS, "getActualPropertiesInPrimaryConstructor()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "receiverAfterName", "getReceiverAfterName()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0, c16527d), c16527d.mo5697f(new C16549q(DescriptorRendererOptionsImpl.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0, c16527d), AbstractC0168G.m528q(DescriptorRendererOptionsImpl.class, "informativeErrorType", "getInformativeErrorType()Z", 0, c16527d)};
    }
}
