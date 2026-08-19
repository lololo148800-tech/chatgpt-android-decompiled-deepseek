package p323Mm;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import mm.C17309l;
import p1113xn.AbstractC21322p;
import p298Lm.AbstractC5147J0;
import p298Lm.AbstractC5148K;
import p544W9.AbstractC8513L3;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: Mm.C */
/* JADX INFO: loaded from: classes2.dex */
public final class C5492C implements InterfaceC5500g {

    /* JADX INFO: renamed from: a */
    public final Method f17925a;

    /* JADX INFO: renamed from: b */
    public final Method f17926b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f17927c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f17928d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f17929e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    public C5492C(FunctionDescriptor functionDescriptor, AbstractC5148K container, String constructorDesc, List list) {
        ?? M9974d;
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(constructorDesc, "constructorDesc");
        Method methodM5730i = container.m5730i("constructor-impl", constructorDesc);
        AbstractC16544l.m18091d(methodM5730i);
        this.f17925a = methodM5730i;
        Method methodM5730i2 = container.m5730i("box-impl", AbstractC21322p.m21690X(constructorDesc, TokenNames.f32021V) + ReflectClassUtilKt.getDesc(container.mo5684d()));
        AbstractC16544l.m18091d(methodM5730i2);
        this.f17926b = methodM5730i2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            List listM9974d = null;
            if (!it.hasNext()) {
                break;
            }
            KotlinType type = ((ParameterDescriptor) it.next()).getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(type);
            ArrayList arrayListM9178f = AbstractC8513L3.m9178f(simpleTypeAsSimpleType);
            if (arrayListM9178f == null) {
                Class clsM9181i = AbstractC8513L3.m9181i(simpleTypeAsSimpleType);
                if (clsM9181i != null) {
                    listM9974d = AbstractC9393x3.m9974d(AbstractC8513L3.m9177e(clsM9181i, functionDescriptor));
                }
            } else {
                listM9974d = arrayListM9178f;
            }
            arrayList.add(listM9974d);
        }
        this.f17927c = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((ParameterDescriptor) obj).getType().getConstructor().mo22589getDeclarationDescriptor();
            AbstractC16544l.m18092e(classifierDescriptorMo22589getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor;
            List list3 = (List) this.f17927c.get(i10);
            if (list3 != null) {
                List list4 = list3;
                M9974d = new ArrayList(AbstractC17682p.m19389r(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    M9974d.add(((Method) it2.next()).getReturnType());
                }
            } else {
                Class clsM5723k = AbstractC5147J0.m5723k(classDescriptor);
                AbstractC16544l.m18091d(clsM5723k);
                M9974d = AbstractC9393x3.m9974d(clsM5723k);
            }
            arrayList2.add(M9974d);
            i10 = i11;
        }
        this.f17928d = arrayList2;
        this.f17929e = AbstractC17682p.m19390s(arrayList2);
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: a */
    public final List mo5916a() {
        return this.f17929e;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Member mo5917b() {
        return null;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: c */
    public final boolean mo5918c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        ?? M9974d;
        AbstractC16544l.m18094g(args, "args");
        ArrayList other = this.f17927c;
        AbstractC16544l.m18094g(other, "other");
        int length = args.length;
        ArrayList<C17309l> arrayList = new ArrayList(Math.min(AbstractC17682p.m19389r(other, 10), length));
        int i10 = 0;
        for (Object obj : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(new C17309l(args[i10], obj));
            i10++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C17309l c17309l : arrayList) {
            Object obj2 = c17309l.f55136Y;
            List list = (List) c17309l.f55137Z;
            if (list != null) {
                List list2 = list;
                M9974d = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    M9974d.add(((Method) it.next()).invoke(obj2, null));
                }
            } else {
                M9974d = AbstractC9393x3.m9974d(obj2);
            }
            AbstractC17686t.m19398v((Iterable) M9974d, arrayList2);
        }
        Object[] array = arrayList2.toArray(new Object[0]);
        this.f17925a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f17926b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // p323Mm.InterfaceC5500g
    public final Type getReturnType() {
        Class<?> returnType = this.f17926b.getReturnType();
        AbstractC16544l.m18093f(returnType, "getReturnType(...)");
        return returnType;
    }
}
