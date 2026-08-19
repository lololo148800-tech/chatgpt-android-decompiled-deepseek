package p298Lm;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Lm.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C5206v implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16918Y;

    /* JADX INFO: renamed from: Z */
    public final C5214z f16919Z;

    public /* synthetic */ C5206v(C5214z c5214z, int i10) {
        this.f16918Y = i10;
        this.f16919Z = c5214z;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f16918Y) {
            case 0:
                C5214z c5214z = this.f16919Z;
                c5214z.getClass();
                InterfaceC3776x[] interfaceC3776xArr = C5214z.f16939m;
                InterfaceC3776x interfaceC3776x = interfaceC3776xArr[9];
                Object objInvoke = c5214z.f16944g.invoke();
                AbstractC16544l.m18093f(objInvoke, "getValue(...)");
                InterfaceC3776x interfaceC3776x2 = interfaceC3776xArr[11];
                Object objInvoke2 = c5214z.f16946i.invoke();
                AbstractC16544l.m18093f(objInvoke2, "getValue(...)");
                return AbstractC17680n.m19361k0((Collection) objInvoke2, (Collection) objInvoke);
            case 1:
                C5214z c5214z2 = this.f16919Z;
                c5214z2.getClass();
                InterfaceC3776x[] interfaceC3776xArr2 = C5214z.f16939m;
                InterfaceC3776x interfaceC3776x3 = interfaceC3776xArr2[10];
                Object objInvoke3 = c5214z2.f16945h.invoke();
                AbstractC16544l.m18093f(objInvoke3, "getValue(...)");
                InterfaceC3776x interfaceC3776x4 = interfaceC3776xArr2[12];
                Object objInvoke4 = c5214z2.f16947j.invoke();
                AbstractC16544l.m18093f(objInvoke4, "getValue(...)");
                return AbstractC17680n.m19361k0((Collection) objInvoke4, (Collection) objInvoke3);
            case 2:
                C5214z c5214z3 = this.f16919Z;
                c5214z3.getClass();
                InterfaceC3776x[] interfaceC3776xArr3 = C5214z.f16939m;
                InterfaceC3776x interfaceC3776x5 = interfaceC3776xArr3[9];
                Object objInvoke5 = c5214z3.f16944g.invoke();
                AbstractC16544l.m18093f(objInvoke5, "getValue(...)");
                InterfaceC3776x interfaceC3776x6 = interfaceC3776xArr3[10];
                Object objInvoke6 = c5214z3.f16945h.invoke();
                AbstractC16544l.m18093f(objInvoke6, "getValue(...)");
                return AbstractC17680n.m19361k0((Collection) objInvoke6, (Collection) objInvoke5);
            case 3:
                C5214z c5214z4 = this.f16919Z;
                c5214z4.getClass();
                InterfaceC3776x[] interfaceC3776xArr4 = C5214z.f16939m;
                InterfaceC3776x interfaceC3776x7 = interfaceC3776xArr4[13];
                Object objInvoke7 = c5214z4.f16948k.invoke();
                AbstractC16544l.m18093f(objInvoke7, "getValue(...)");
                InterfaceC3776x interfaceC3776x8 = interfaceC3776xArr4[14];
                Object objInvoke8 = c5214z4.f16949l.invoke();
                AbstractC16544l.m18093f(objInvoke8, "getValue(...)");
                return AbstractC17680n.m19361k0((Collection) objInvoke8, (Collection) objInvoke7);
            case 4:
                return AbstractC5147J0.m5716d(this.f16919Z.m5763a());
            case 5:
                Collection contributedDescriptors$default = ResolutionScope.DefaultImpls.getContributedDescriptors$default(this.f16919Z.m5763a().getUnsubstitutedInnerClassesScope(), null, null, 3, null);
                ArrayList<DeclarationDescriptor> arrayList = new ArrayList();
                for (Object obj : contributedDescriptors$default) {
                    if (!DescriptorUtils.isEnumEntry((DeclarationDescriptor) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (DeclarationDescriptor declarationDescriptor : arrayList) {
                    ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor : null;
                    Class clsM5723k = classDescriptor != null ? AbstractC5147J0.m5723k(classDescriptor) : null;
                    C5134D c5134d = clsM5723k != null ? new C5134D(clsM5723k) : null;
                    if (c5134d != null) {
                        arrayList2.add(c5134d);
                    }
                }
                return arrayList2;
            default:
                Collection<ClassDescriptor> sealedSubclasses = this.f16919Z.m5763a().getSealedSubclasses();
                AbstractC16544l.m18093f(sealedSubclasses, "getSealedSubclasses(...)");
                ArrayList arrayList3 = new ArrayList();
                for (ClassDescriptor classDescriptor2 : sealedSubclasses) {
                    AbstractC16544l.m18092e(classDescriptor2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsM5723k2 = AbstractC5147J0.m5723k(classDescriptor2);
                    C5134D c5134d2 = clsM5723k2 != null ? new C5134D(clsM5723k2) : null;
                    if (c5134d2 != null) {
                        arrayList3.add(c5134d2);
                    }
                }
                return arrayList3;
        }
    }
}
