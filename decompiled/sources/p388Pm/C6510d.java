package p388Pm;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Pm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6510d implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C6510d f21112Z = new C6510d(0);

    /* JADX INFO: renamed from: o0 */
    public static final C6510d f21113o0 = new C6510d(1);

    /* JADX INFO: renamed from: p0 */
    public static final C6510d f21114p0 = new C6510d(2);

    /* JADX INFO: renamed from: q0 */
    public static final C6510d f21115q0 = new C6510d(3);

    /* JADX INFO: renamed from: r0 */
    public static final C6510d f21116r0 = new C6510d(4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21117Y;

    public /* synthetic */ C6510d(int i10) {
        this.f21117Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21117Y) {
            case 0:
                AbstractC16544l.m18094g((ClassId) obj, "it");
                return 0;
            case 1:
                PackageFragmentDescriptor it = (PackageFragmentDescriptor) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.getFqName();
            case 2:
                DeclarationDescriptor it2 = (DeclarationDescriptor) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(it2 instanceof CallableDescriptor);
            case 3:
                DeclarationDescriptor it3 = (DeclarationDescriptor) obj;
                AbstractC16544l.m18094g(it3, "it");
                return Boolean.valueOf(!(it3 instanceof ConstructorDescriptor));
            default:
                DeclarationDescriptor it4 = (DeclarationDescriptor) obj;
                AbstractC16544l.m18094g(it4, "it");
                List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) it4).getTypeParameters();
                AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
                return AbstractC17680n.m19329H(typeParameters);
        }
    }
}
