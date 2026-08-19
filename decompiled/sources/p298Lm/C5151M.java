package p298Lm;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p024Am.C0560a;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3767o;
import p323Mm.AbstractC5517x;
import p323Mm.C5492C;
import p323Mm.C5496c;
import p323Mm.C5511r;
import p323Mm.C5512s;
import p323Mm.C5515v;
import p323Mm.EnumC5494a;
import p323Mm.EnumC5495b;
import p544W9.AbstractC8513L3;
import p544W9.AbstractC8704r3;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Lm.M */
/* JADX INFO: loaded from: classes2.dex */
public final class C5151M implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16793Y;

    /* JADX INFO: renamed from: Z */
    public final C5152N f16794Z;

    public /* synthetic */ C5151M(C5152N c5152n, int i10) {
        this.f16793Y = i10;
        this.f16794Z = c5152n;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:? A[LOOP:1: B:39:0x00e6->B:155:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:84:0x0238  */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object objM5730i;
        AbstractC5517x abstractC5517xM5741r;
        AbstractC5517x c5512s;
        GenericDeclaration genericDeclarationM5727s;
        AbstractC5517x abstractC5517xM5741r2;
        FunctionDescriptor functionDescriptor;
        DeclarationDescriptor containingDeclaration;
        Member memberMo5917b;
        Iterator it;
        Object next;
        List<ValueParameterDescriptor> list;
        Iterator<T> it2;
        C5152N c5152n = this.f16794Z;
        switch (this.f16793Y) {
            case 0:
                ClassId classId = AbstractC5143H0.f16781a;
                AbstractC8704r3 abstractC8704r3M5712c = AbstractC5143H0.m5712c(c5152n.mo5738m());
                boolean z6 = abstractC8704r3M5712c instanceof C5184k;
                AbstractC5148K abstractC5148K = c5152n.f16796s0;
                if (z6) {
                    if (c5152n.m5755o()) {
                        Class clsMo5684d = abstractC5148K.mo5684d();
                        List parameters = c5152n.getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(parameters, 10));
                        Iterator it3 = parameters.iterator();
                        while (it3.hasNext()) {
                            String name = ((C5171d0) ((InterfaceC3767o) it3.next())).getName();
                            AbstractC16544l.m18091d(name);
                            arrayList.add(name);
                        }
                        EnumC5494a enumC5494a = EnumC5494a.f17937Z;
                        EnumC5495b enumC5495b = EnumC5495b.f17939Y;
                        return new C5496c(clsMo5684d, arrayList, enumC5494a);
                    }
                    String desc = ((C5184k) abstractC8704r3M5712c).f16866a.getDesc();
                    abstractC5148K.getClass();
                    AbstractC16544l.m18094g(desc, "desc");
                    objM5730i = AbstractC5148K.m5727s(abstractC5148K.mo5684d(), (ArrayList) abstractC5148K.m5733q(desc, false).f46724Y);
                } else if (abstractC8704r3M5712c instanceof C5186l) {
                    FunctionDescriptor functionDescriptorMo5738m = c5152n.mo5738m();
                    DeclarationDescriptor containingDeclaration2 = functionDescriptorMo5738m.getContainingDeclaration();
                    AbstractC16544l.m18093f(containingDeclaration2, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration2) && (functionDescriptorMo5738m instanceof ConstructorDescriptor) && ((ConstructorDescriptor) functionDescriptorMo5738m).isPrimary()) {
                        FunctionDescriptor functionDescriptorMo5738m2 = c5152n.mo5738m();
                        String desc2 = ((C5186l) abstractC8704r3M5712c).f16870a.getDesc();
                        List<ValueParameterDescriptor> valueParameters = c5152n.mo5738m().getValueParameters();
                        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                        return new C5492C(functionDescriptorMo5738m2, abstractC5148K, desc2, valueParameters);
                    }
                    JvmMemberSignature.Method method = ((C5186l) abstractC8704r3M5712c).f16870a;
                    objM5730i = abstractC5148K.m5730i(method.getName(), method.getDesc());
                } else if (abstractC8704r3M5712c instanceof C5182j) {
                    objM5730i = ((C5182j) abstractC8704r3M5712c).f16864a;
                } else {
                    if (!(abstractC8704r3M5712c instanceof C5180i)) {
                        if (!(abstractC8704r3M5712c instanceof C5178h)) {
                            throw new C0644w();
                        }
                        Class clsMo5684d2 = abstractC5148K.mo5684d();
                        List list2 = ((C5178h) abstractC8704r3M5712c).f16859a;
                        List list3 = list2;
                        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                        Iterator it4 = list3.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(((Method) it4.next()).getName());
                        }
                        return new C5496c(clsMo5684d2, arrayList2, EnumC5494a.f17937Z, EnumC5495b.f17939Y, list2);
                    }
                    objM5730i = ((C5180i) abstractC8704r3M5712c).f16862a;
                    AbstractC16544l.m18092e(objM5730i, "null cannot be cast to non-null type java.lang.reflect.Member");
                }
                if (objM5730i instanceof Constructor) {
                    abstractC5517xM5741r = c5152n.m5740q((Constructor) objM5730i, c5152n.mo5738m(), false);
                } else {
                    if (!(objM5730i instanceof Method)) {
                        throw new C0560a("Could not compute caller for function: " + c5152n.mo5738m() + " (member = " + objM5730i + ')');
                    }
                    Method method2 = (Method) objM5730i;
                    if (Modifier.isStatic(method2.getModifiers())) {
                        if (c5152n.mo5738m().getAnnotations().mo22585findAnnotation(AbstractC5147J0.f16786a) != null) {
                            c5512s = c5152n.mo5739p() ? new C5512s(method2) : new C5515v(1, method2);
                        } else {
                            abstractC5517xM5741r = c5152n.m5741r(method2, false);
                        }
                    } else if (c5152n.mo5739p()) {
                        c5512s = new C5511r(method2, AbstractC8513L3.m9174b(c5152n.f16798u0, c5152n.mo5738m()));
                    } else {
                        c5512s = new C5515v(0, method2);
                    }
                    abstractC5517xM5741r = c5512s;
                }
                return AbstractC8513L3.m9175c(abstractC5517xM5741r, c5152n.mo5738m(), false);
            default:
                ClassId classId2 = AbstractC5143H0.f16781a;
                AbstractC8704r3 abstractC8704r3M5712c2 = AbstractC5143H0.m5712c(c5152n.mo5738m());
                boolean z10 = abstractC8704r3M5712c2 instanceof C5186l;
                AbstractC5148K abstractC5148K2 = c5152n.f16796s0;
                if (z10) {
                    FunctionDescriptor functionDescriptorMo5738m3 = c5152n.mo5738m();
                    DeclarationDescriptor containingDeclaration3 = functionDescriptorMo5738m3.getContainingDeclaration();
                    AbstractC16544l.m18093f(containingDeclaration3, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration3) && (functionDescriptorMo5738m3 instanceof ConstructorDescriptor) && ((ConstructorDescriptor) functionDescriptorMo5738m3).isPrimary()) {
                        throw new C0560a(c5152n.mo5738m().getContainingDeclaration() + " cannot have default arguments");
                    }
                    FunctionDescriptor functionDescriptorMo5738m4 = c5152n.mo5738m();
                    List<ValueParameterDescriptor> valueParameters2 = functionDescriptorMo5738m4.getValueParameters();
                    AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
                    List<ValueParameterDescriptor> list4 = valueParameters2;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        containingDeclaration = functionDescriptorMo5738m4.getContainingDeclaration();
                        AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
                        if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                            memberMo5917b = c5152n.mo5735i().mo5917b();
                            AbstractC16544l.m18091d(memberMo5917b);
                            if (Modifier.isStatic(memberMo5917b.getModifiers())) {
                                it = DescriptorUtilsKt.overriddenTreeAsSequence(functionDescriptorMo5738m4, false).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        List<ValueParameterDescriptor> valueParameters3 = ((CallableMemberDescriptor) next).getValueParameters();
                                        AbstractC16544l.m18093f(valueParameters3, "getValueParameters(...)");
                                        list = valueParameters3;
                                        if (list instanceof Collection) {
                                        }
                                        it2 = list.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                continue;
                                            } else if (((ValueParameterDescriptor) it2.next()).declaresDefaultValue()) {
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                if (next instanceof FunctionDescriptor) {
                                    functionDescriptor = (FunctionDescriptor) next;
                                } else {
                                    functionDescriptor = null;
                                }
                            } else {
                                functionDescriptor = null;
                            }
                        } else {
                            functionDescriptor = null;
                        }
                    } else {
                        Iterator<T> it5 = list4.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                containingDeclaration = functionDescriptorMo5738m4.getContainingDeclaration();
                                AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
                                if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                                    memberMo5917b = c5152n.mo5735i().mo5917b();
                                    AbstractC16544l.m18091d(memberMo5917b);
                                    if (Modifier.isStatic(memberMo5917b.getModifiers())) {
                                        it = DescriptorUtilsKt.overriddenTreeAsSequence(functionDescriptorMo5738m4, false).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                List<ValueParameterDescriptor> valueParameters4 = ((CallableMemberDescriptor) next).getValueParameters();
                                                AbstractC16544l.m18093f(valueParameters4, "getValueParameters(...)");
                                                list = valueParameters4;
                                                if ((list instanceof Collection) || !list.isEmpty()) {
                                                    it2 = list.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            continue;
                                                        } else if (((ValueParameterDescriptor) it2.next()).declaresDefaultValue()) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        if (next instanceof FunctionDescriptor) {
                                            functionDescriptor = (FunctionDescriptor) next;
                                        }
                                    }
                                }
                            } else if (((ValueParameterDescriptor) it5.next()).declaresDefaultValue()) {
                            }
                            functionDescriptor = null;
                        }
                    }
                    if (functionDescriptor != null) {
                        JvmMemberSignature.Method method3 = ((C5186l) AbstractC5143H0.m5712c(functionDescriptor)).f16870a;
                        genericDeclarationM5727s = abstractC5148K2.m5729h(method3.getName(), method3.getDesc(), true);
                    } else {
                        JvmMemberSignature.Method method4 = ((C5186l) abstractC8704r3M5712c2).f16870a;
                        String name2 = method4.getName();
                        String desc3 = method4.getDesc();
                        Member memberMo5917b2 = c5152n.mo5735i().mo5917b();
                        AbstractC16544l.m18091d(memberMo5917b2);
                        genericDeclarationM5727s = abstractC5148K2.m5729h(name2, desc3, !Modifier.isStatic(memberMo5917b2.getModifiers()));
                    }
                } else if (abstractC8704r3M5712c2 instanceof C5184k) {
                    if (c5152n.m5755o()) {
                        Class clsMo5684d3 = abstractC5148K2.mo5684d();
                        List parameters2 = c5152n.getParameters();
                        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(parameters2, 10));
                        Iterator it6 = parameters2.iterator();
                        while (it6.hasNext()) {
                            String name3 = ((C5171d0) ((InterfaceC3767o) it6.next())).getName();
                            AbstractC16544l.m18091d(name3);
                            arrayList3.add(name3);
                        }
                        EnumC5494a enumC5494a2 = EnumC5494a.f17936Y;
                        EnumC5495b enumC5495b2 = EnumC5495b.f17939Y;
                        return new C5496c(clsMo5684d3, arrayList3, enumC5494a2);
                    }
                    String desc4 = ((C5184k) abstractC8704r3M5712c2).f16866a.getDesc();
                    abstractC5148K2.getClass();
                    AbstractC16544l.m18094g(desc4, "desc");
                    Class clsMo5684d4 = abstractC5148K2.mo5684d();
                    ArrayList arrayList4 = new ArrayList();
                    AbstractC5148K.m5725f(arrayList4, (ArrayList) abstractC5148K2.m5733q(desc4, false).f46724Y, true);
                    genericDeclarationM5727s = AbstractC5148K.m5727s(clsMo5684d4, arrayList4);
                } else {
                    if (abstractC8704r3M5712c2 instanceof C5178h) {
                        Class clsMo5684d5 = abstractC5148K2.mo5684d();
                        List list5 = ((C5178h) abstractC8704r3M5712c2).f16859a;
                        List list6 = list5;
                        ArrayList arrayList5 = new ArrayList(AbstractC17682p.m19389r(list6, 10));
                        Iterator it7 = list6.iterator();
                        while (it7.hasNext()) {
                            arrayList5.add(((Method) it7.next()).getName());
                        }
                        return new C5496c(clsMo5684d5, arrayList5, EnumC5494a.f17936Y, EnumC5495b.f17939Y, list5);
                    }
                    genericDeclarationM5727s = null;
                }
                if (genericDeclarationM5727s instanceof Constructor) {
                    abstractC5517xM5741r2 = c5152n.m5740q((Constructor) genericDeclarationM5727s, c5152n.mo5738m(), true);
                } else if (!(genericDeclarationM5727s instanceof Method)) {
                    abstractC5517xM5741r2 = null;
                } else if (c5152n.mo5738m().getAnnotations().mo22585findAnnotation(AbstractC5147J0.f16786a) != null) {
                    DeclarationDescriptor containingDeclaration4 = c5152n.mo5738m().getContainingDeclaration();
                    AbstractC16544l.m18092e(containingDeclaration4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (((ClassDescriptor) containingDeclaration4).isCompanionObject()) {
                        abstractC5517xM5741r2 = c5152n.m5741r((Method) genericDeclarationM5727s, c5152n.mo5735i().mo5918c());
                    } else {
                        Method method5 = (Method) genericDeclarationM5727s;
                        abstractC5517xM5741r2 = c5152n.mo5739p() ? new C5512s(method5) : new C5515v(1, method5);
                    }
                } else {
                    abstractC5517xM5741r2 = c5152n.m5741r((Method) genericDeclarationM5727s, c5152n.mo5735i().mo5918c());
                }
                return abstractC5517xM5741r2 != null ? AbstractC8513L3.m9175c(abstractC5517xM5741r2, c5152n.mo5738m(), true) : null;
        }
    }
}
