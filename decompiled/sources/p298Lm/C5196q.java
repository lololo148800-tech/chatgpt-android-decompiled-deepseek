package p298Lm;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p049Bm.InterfaceC1426a;
import p225Im.AbstractC3751J;
import p225Im.EnumC3766n;
import p225Im.InterfaceC3767o;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17685s;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Lm.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C5196q implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16889Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC5202t f16890Z;

    public /* synthetic */ C5196q(AbstractC5202t abstractC5202t, int i10) {
        this.f16889Y = i10;
        this.f16890Z = abstractC5202t;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int i10;
        int iM5754n;
        Type[] lowerBounds;
        Type type = null;
        int i11 = 0;
        z = false;
        boolean z6 = false;
        AbstractC5202t abstractC5202t = this.f16890Z;
        switch (this.f16889Y) {
            case 0:
                return AbstractC5147J0.m5716d(abstractC5202t.mo5738m());
            case 1:
                CallableMemberDescriptor callableMemberDescriptorMo5738m = abstractC5202t.mo5738m();
                ArrayList arrayList = new ArrayList();
                if (abstractC5202t.mo5739p()) {
                    i10 = 0;
                } else {
                    ReceiverParameterDescriptor receiverParameterDescriptorM5719g = AbstractC5147J0.m5719g(callableMemberDescriptorMo5738m);
                    if (receiverParameterDescriptorM5719g != null) {
                        arrayList.add(new C5171d0(abstractC5202t, 0, EnumC3766n.f11414Y, new C5198r(receiverParameterDescriptorM5719g, 0)));
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptorMo5738m.getExtensionReceiverParameter();
                    if (extensionReceiverParameter != null) {
                        arrayList.add(new C5171d0(abstractC5202t, i10, EnumC3766n.f11415Z, new C5198r(extensionReceiverParameter, 1)));
                        i10++;
                    }
                }
                int size = callableMemberDescriptorMo5738m.getValueParameters().size();
                while (i11 < size) {
                    arrayList.add(new C5171d0(abstractC5202t, i10, EnumC3766n.f11416o0, new C5200s(callableMemberDescriptorMo5738m, i11)));
                    i11++;
                    i10++;
                }
                if (abstractC5202t.m5755o() && (callableMemberDescriptorMo5738m instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
                    AbstractC17685s.m19392u(arrayList, new C5176g(1));
                }
                arrayList.trimToSize();
                return arrayList;
            case 2:
                KotlinType returnType = abstractC5202t.mo5738m().getReturnType();
                AbstractC16544l.m18091d(returnType);
                return new C5213y0(returnType, new C5196q(abstractC5202t, 6));
            case 3:
                List<TypeParameterDescriptor> typeParameters = abstractC5202t.mo5738m().getTypeParameters();
                AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
                List<TypeParameterDescriptor> list = typeParameters;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
                for (TypeParameterDescriptor typeParameterDescriptor : list) {
                    AbstractC16544l.m18091d(typeParameterDescriptor);
                    arrayList2.add(new C5129A0(abstractC5202t, typeParameterDescriptor));
                }
                return arrayList2;
            case 4:
                List<InterfaceC3767o> parameters = abstractC5202t.getParameters();
                int size2 = (abstractC5202t.isSuspend() ? 1 : 0) + parameters.size();
                if (((Boolean) abstractC5202t.f16908r0.getValue()).booleanValue()) {
                    iM5754n = 0;
                    for (InterfaceC3767o interfaceC3767o : parameters) {
                        iM5754n += ((C5171d0) interfaceC3767o).f16850o0 == EnumC3766n.f11416o0 ? abstractC5202t.m5754n(interfaceC3767o) : 0;
                    }
                } else {
                    List list2 = parameters;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        iM5754n = 0;
                    } else {
                        Iterator it = list2.iterator();
                        iM5754n = 0;
                        while (it.hasNext()) {
                            if (((C5171d0) ((InterfaceC3767o) it.next())).f16850o0 == EnumC3766n.f11416o0 && (iM5754n = iM5754n + 1) < 0) {
                                AbstractC17681o.m19387p();
                                throw null;
                            }
                        }
                    }
                }
                int i12 = (iM5754n + 31) / 32;
                Object[] objArr = new Object[size2 + i12 + 1];
                Iterator it2 = parameters.iterator();
                while (it2.hasNext()) {
                    C5171d0 c5171d0 = (C5171d0) ((InterfaceC3767o) it2.next());
                    boolean zM5747h = c5171d0.m5747h();
                    int i13 = c5171d0.f16849Z;
                    if (zM5747h) {
                        C5213y0 c5213y0M5746f = c5171d0.m5746f();
                        FqName fqName = AbstractC5147J0.f16786a;
                        KotlinType kotlinType = c5213y0M5746f.f16935Y;
                        if (kotlinType == null || !InlineClassesUtilsKt.isInlineClassType(kotlinType)) {
                            C5213y0 c5213y0M5746f2 = c5171d0.m5746f();
                            C5135D0 c5135d0 = c5213y0M5746f2.f16936Z;
                            Type typeM4443h = c5135d0 != null ? (Type) c5135d0.invoke() : null;
                            if (typeM4443h == null) {
                                typeM4443h = AbstractC3751J.m4443h(c5213y0M5746f2);
                            }
                            objArr[i13] = AbstractC5147J0.m5717e(typeM4443h);
                        }
                    }
                    if (c5171d0.m5748i()) {
                        objArr[i13] = AbstractC5202t.m5753h(c5171d0.m5746f());
                    }
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    objArr[size2 + i14] = 0;
                }
                return objArr;
            case 5:
                List parameters2 = abstractC5202t.getParameters();
                if (!(parameters2 instanceof Collection) || !parameters2.isEmpty()) {
                    Iterator it3 = parameters2.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC5147J0.m5720h(((C5171d0) ((InterfaceC3767o) it3.next())).m5746f())) {
                            z6 = true;
                        }
                    }
                }
                return Boolean.valueOf(z6);
            default:
                if (abstractC5202t.isSuspend()) {
                    Object objM19353c0 = AbstractC17680n.m19353c0(abstractC5202t.mo5735i().mo5916a());
                    ParameterizedType parameterizedType = objM19353c0 instanceof ParameterizedType ? (ParameterizedType) objM19353c0 : null;
                    if (AbstractC16544l.m18089b(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC18770c.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        AbstractC16544l.m18093f(actualTypeArguments, "getActualTypeArguments(...)");
                        Object objM19288K = AbstractC17678l.m19288K(actualTypeArguments);
                        WildcardType wildcardType = objM19288K instanceof WildcardType ? (WildcardType) objM19288K : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) AbstractC17678l.m19316w(lowerBounds);
                        }
                    }
                }
                return type == null ? abstractC5202t.mo5735i().getReturnType() : type;
        }
    }
}
