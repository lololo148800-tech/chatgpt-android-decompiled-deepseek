package p298Lm;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p024Am.C0560a;
import p049Bm.InterfaceC1426a;
import p200Hm.C3508g;
import p323Mm.C5492C;
import p323Mm.C5493D;
import p323Mm.InterfaceC5500g;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Lm.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5167b0 implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16837Y;

    /* JADX INFO: renamed from: Z */
    public final C5171d0 f16838Z;

    public /* synthetic */ C5167b0(C5171d0 c5171d0, int i10) {
        this.f16837Y = i10;
        this.f16838Z = c5171d0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C5169c0 c5169c0;
        List listM19368r0;
        switch (this.f16837Y) {
            case 0:
                return AbstractC5147J0.m5716d(this.f16838Z.m5745d());
            default:
                C5171d0 c5171d0 = this.f16838Z;
                ParameterDescriptor parameterDescriptorM5745d = c5171d0.m5745d();
                boolean z6 = parameterDescriptorM5745d instanceof ReceiverParameterDescriptor;
                AbstractC5202t abstractC5202t = c5171d0.f16848Y;
                if (z6 && AbstractC16544l.m18089b(AbstractC5147J0.m5719g(abstractC5202t.mo5738m()), parameterDescriptorM5745d) && abstractC5202t.mo5738m().getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                    DeclarationDescriptor containingDeclaration = abstractC5202t.mo5738m().getContainingDeclaration();
                    AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsM5723k = AbstractC5147J0.m5723k((ClassDescriptor) containingDeclaration);
                    if (clsM5723k != null) {
                        return clsM5723k;
                    }
                    throw new C0560a("Cannot determine receiver Java type of inherited declaration: " + parameterDescriptorM5745d);
                }
                InterfaceC5500g interfaceC5500gMo5735i = abstractC5202t.mo5735i();
                boolean z10 = interfaceC5500gMo5735i instanceof C5493D;
                int i10 = c5171d0.f16849Z;
                if (z10) {
                    if (abstractC5202t.mo5739p()) {
                        C5493D c5493d = (C5493D) interfaceC5500gMo5735i;
                        C3508g c3508gM5919d = c5493d.m5919d(i10 + 1);
                        int i11 = c5493d.m5919d(0).f10592Z + 1;
                        listM19368r0 = AbstractC17680n.m19368r0(c5493d.f17931b.mo5916a(), new C3508g(c3508gM5919d.f10591Y - i11, c3508gM5919d.f10592Z - i11, 1));
                    } else {
                        C5493D c5493d2 = (C5493D) interfaceC5500gMo5735i;
                        listM19368r0 = AbstractC17680n.m19368r0(c5493d2.f17931b.mo5916a(), c5493d2.m5919d(i10));
                    }
                    Type[] typeArr = (Type[]) listM19368r0.toArray(new Type[0]);
                    Type[] typeArr2 = (Type[]) Arrays.copyOf(typeArr, typeArr.length);
                    int length = typeArr2.length;
                    if (length == 0) {
                        throw new C0560a("Expected at least 1 type for compound type");
                    }
                    if (length == 1) {
                        return (Type) AbstractC17678l.m19288K(typeArr2);
                    }
                    c5169c0 = new C5169c0(typeArr2);
                } else {
                    if (!(interfaceC5500gMo5735i instanceof C5492C)) {
                        return (Type) interfaceC5500gMo5735i.mo5916a().get(i10);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((C5492C) interfaceC5500gMo5735i).f17928d.get(i10)).toArray(new Class[0]);
                    Type[] typeArr3 = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length2 = typeArr3.length;
                    if (length2 == 0) {
                        throw new C0560a("Expected at least 1 type for compound type");
                    }
                    if (length2 == 1) {
                        return (Type) AbstractC17678l.m19288K(typeArr3);
                    }
                    c5169c0 = new C5169c0(typeArr3);
                }
                return c5169c0;
        }
    }
}
