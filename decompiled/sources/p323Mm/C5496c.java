package p323Mm;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8138m0;
import p544W9.AbstractC8495I3;
import p544W9.AbstractC8501J3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Mm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C5496c implements InterfaceC5500g {

    /* JADX INFO: renamed from: a */
    public final Class f17942a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f17943b;

    /* JADX INFO: renamed from: c */
    public final EnumC5494a f17944c;

    /* JADX INFO: renamed from: d */
    public final List f17945d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f17946e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f17947f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f17948g;

    public C5496c(Class jClass, ArrayList arrayList, EnumC5494a enumC5494a, EnumC5495b enumC5495b, List methods) {
        AbstractC16544l.m18094g(jClass, "jClass");
        AbstractC16544l.m18094g(methods, "methods");
        this.f17942a = jClass;
        this.f17943b = arrayList;
        this.f17944c = enumC5494a;
        this.f17945d = methods;
        List list = methods;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f17946e = arrayList2;
        List list2 = this.f17945d;
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            AbstractC16544l.m18091d(returnType);
            Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(returnType);
            if (wrapperByPrimitive != null) {
                returnType = wrapperByPrimitive;
            }
            arrayList3.add(returnType);
        }
        this.f17947f = arrayList3;
        List list3 = this.f17945d;
        ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f17948g = arrayList4;
        if (this.f17944c == EnumC5494a.f17937Z && enumC5495b == EnumC5495b.f17939Y && !AbstractC17680n.m19357g0(this.f17943b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: a */
    public final List mo5916a() {
        return this.f17946e;
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

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[LOOP:1: B:24:0x0065->B:25:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0056, please report this as an issue */
    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        Class cls;
        Object[] objArr;
        ArrayList arrayList;
        int i10;
        Object obj;
        Object obj2;
        String strMo4447a;
        AbstractC16544l.m18094g(args, "args");
        AbstractC8501J3.m9165a(this, args);
        ArrayList arrayList2 = new ArrayList(args.length);
        int length = args.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList3 = this.f17943b;
            if (i11 >= length) {
                return AbstractC8495I3.m9153a(this.f17942a, AbstractC17659D.m19253o(AbstractC17680n.m19334J0(arrayList3, arrayList2)), this.f17945d);
            }
            Object array = args[i11];
            int i13 = i12 + 1;
            ArrayList arrayList4 = this.f17947f;
            if (array != null) {
                cls = (Class) arrayList4.get(i12);
                if (array instanceof Class) {
                    if (array instanceof InterfaceC3756d) {
                        array = AbstractC8138m0.m8667b((InterfaceC3756d) array);
                    } else if (array instanceof Object[]) {
                        objArr = (Object[]) array;
                        if (objArr instanceof Class[]) {
                            obj2 = null;
                        } else if (objArr instanceof InterfaceC3756d[]) {
                            AbstractC16544l.m18092e(array, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                            InterfaceC3756d[] interfaceC3756dArr = (InterfaceC3756d[]) array;
                            arrayList = new ArrayList(interfaceC3756dArr.length);
                            while (i10 < r14) {
                                arrayList.add(AbstractC8138m0.m8667b(interfaceC3756d));
                            }
                            array = arrayList.toArray(new Class[0]);
                        } else {
                            array = objArr;
                        }
                    }
                    if (cls.isInstance(array)) {
                        obj = array;
                    } else {
                        obj = null;
                    }
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
            } else if (this.f17944c == EnumC5494a.f17936Y) {
                obj2 = this.f17948g.get(i12);
            } else {
                cls = (Class) arrayList4.get(i12);
                if (array instanceof Class) {
                    obj2 = null;
                } else {
                    if (array instanceof InterfaceC3756d) {
                        array = AbstractC8138m0.m8667b((InterfaceC3756d) array);
                    } else if (array instanceof Object[]) {
                        objArr = (Object[]) array;
                        if (objArr instanceof Class[]) {
                            obj2 = null;
                        } else if (objArr instanceof InterfaceC3756d[]) {
                            AbstractC16544l.m18092e(array, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                            InterfaceC3756d[] interfaceC3756dArr2 = (InterfaceC3756d[]) array;
                            arrayList = new ArrayList(interfaceC3756dArr2.length);
                            for (InterfaceC3756d interfaceC3756d : interfaceC3756dArr2) {
                                arrayList.add(AbstractC8138m0.m8667b(interfaceC3756d));
                            }
                            array = arrayList.toArray(new Class[0]);
                        } else {
                            array = objArr;
                        }
                    }
                    if (cls.isInstance(array)) {
                        obj = array;
                    } else {
                        obj = null;
                    }
                    obj2 = obj;
                }
            }
            if (obj2 == null) {
                String str = (String) arrayList3.get(i12);
                Class cls2 = (Class) arrayList4.get(i12);
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16544l.m18089b(cls2, Class.class) ? AbstractC16526C.f51263a.mo5693b(InterfaceC3756d.class) : (cls2.isArray() && AbstractC16544l.m18089b(cls2.getComponentType(), Class.class)) ? AbstractC16526C.f51263a.mo5693b(InterfaceC3756d[].class) : AbstractC8138m0.m8670e(cls2);
                if (AbstractC16544l.m18089b(interfaceC3756dMo5693b.mo4447a(), AbstractC16526C.f51263a.mo5693b(Object[].class).mo4447a())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(interfaceC3756dMo5693b.mo4447a());
                    sb2.append('<');
                    Class<?> componentType = AbstractC8138m0.m8667b(interfaceC3756dMo5693b).getComponentType();
                    AbstractC16544l.m18093f(componentType, "getComponentType(...)");
                    sb2.append(AbstractC8138m0.m8670e(componentType).mo4447a());
                    sb2.append('>');
                    strMo4447a = sb2.toString();
                } else {
                    strMo4447a = interfaceC3756dMo5693b.mo4447a();
                }
                throw new IllegalArgumentException("Argument #" + i12 + ' ' + str + " is not of the required type " + strMo4447a);
            }
            arrayList2.add(obj2);
            i11++;
            i12 = i13;
        }
    }

    @Override // p323Mm.InterfaceC5500g
    public final Type getReturnType() {
        return this.f17942a;
    }

    public /* synthetic */ C5496c(Class cls, ArrayList arrayList, EnumC5494a enumC5494a) {
        EnumC5495b enumC5495b = EnumC5495b.f17940Z;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, enumC5494a, enumC5495b, arrayList2);
    }
}
